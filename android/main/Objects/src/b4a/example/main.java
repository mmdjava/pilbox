package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static String _pill_naim1 = "";
public static int _pill_count_box1 = 0;
public static String _start_time_1 = "";
public static String _interval_1 = "";
public static String _box1_alarm = "";
public static String _pill_naim2 = "";
public static int _pill_count_box2 = 0;
public static String _start_time_2 = "";
public static String _interval_2 = "";
public static String _box2_alarm = "";
public static String _pill_naim3 = "";
public static int _pill_count_box3 = 0;
public static String _start_time_3 = "";
public static String _interval_3 = "";
public static String _box3_alarm = "";
public static String _pill_naim4 = "";
public static int _pill_count_box4 = 0;
public static String _start_time_4 = "";
public static String _interval_4 = "";
public static String _box4_alarm = "";
public static anywheresoftware.b4a.phone.Phone.PhoneVibrate _viber = null;
public static byte _count = (byte)0;
public static anywheresoftware.b4a.objects.SocketWrapper _socket1 = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams = null;
public static String _input = "";
public anywheresoftware.b4a.objects.LabelWrapper _label17 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label11 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel5 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label13 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label14 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label15 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label16 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label18 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label19 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label21 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label20 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill3 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _setconnect1 = null;
public static String _pattern1 = "";
public static String _pattern2 = "";
public static String _pattern3 = "";
public static String _pattern4 = "";
public static String _pattern5 = "";
public static String _pattern6 = "";
public static String _pattern7 = "";
public static String _pattern8 = "";
public static int _data1 = 0;
public static int _data2 = 0;
public static int _data3 = 0;
public static int _data4 = 0;
public static int _data5 = 0;
public static int _data6 = 0;
public static int _data7 = 0;
public static int _data8 = 0;
public anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
public static int _label_size1 = 0;
public static int _label_size2 = 0;
public static int _label_size3 = 0;
public static int _label_size4 = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.pill_1 _pill_1 = null;
public b4a.example.pill_2 _pill_2 = null;
public b4a.example.pill_3 _pill_3 = null;
public b4a.example.pill_4 _pill_4 = null;
public b4a.example.naseri_func _naseri_func = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (pill_1.mostCurrent != null);
vis = vis | (pill_2.mostCurrent != null);
vis = vis | (pill_3.mostCurrent != null);
vis = vis | (pill_4.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 135;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
 //BA.debugLineNum = 137;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
 //BA.debugLineNum = 139;BA.debugLine="If socket1.IsInitialized = False Then";
if (_socket1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 140;BA.debugLine="socket1.Initialize(\"socket1\")";
_socket1.Initialize("socket1");
 //BA.debugLineNum = 141;BA.debugLine="Log(\"سوکت مقداردهی شد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5131079","سوکت مقداردهی شد",0);
 };
 };
 //BA.debugLineNum = 145;BA.debugLine="disconnectWIFI(setconnect1)";
_disconnectwifi(mostCurrent._setconnect1);
 //BA.debugLineNum = 148;BA.debugLine="Try";
try { //BA.debugLineNum = 150;BA.debugLine="pill_naim1 = File.ReadString(File.DirInternal, \"";
_pill_naim1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim1.txt");
 //BA.debugLineNum = 151;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
_pill_count_box1 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box1.txt"))));
 //BA.debugLineNum = 152;BA.debugLine="start_time_1 = File.ReadString(File.DirInternal,";
_start_time_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_1.txt");
 //BA.debugLineNum = 153;BA.debugLine="interval_1 = File.ReadString(File.DirInternal, \"";
_interval_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_1.txt");
 //BA.debugLineNum = 154;BA.debugLine="box1_alarm = File.ReadString(File.DirInternal, \"";
_box1_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box1_alarm.txt");
 //BA.debugLineNum = 155;BA.debugLine="data1 = File.ReadString(File.DirInternal, \"pill_";
_data1 = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data1.txt")));
 } 
       catch (Exception e17) {
			processBA.setLastException(e17); };
 //BA.debugLineNum = 165;BA.debugLine="Label18.Text=(pill_naim1)";
mostCurrent._label18.setText(BA.ObjectToCharSequence((_pill_naim1)));
 //BA.debugLineNum = 171;BA.debugLine="Try";
try { //BA.debugLineNum = 173;BA.debugLine="pill_naim2 = File.ReadString(File.DirInternal, \"";
_pill_naim2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim2.txt");
 //BA.debugLineNum = 174;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
_pill_count_box2 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box2.txt"))));
 //BA.debugLineNum = 175;BA.debugLine="start_time_2 = File.ReadString(File.DirInternal,";
_start_time_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_2.txt");
 //BA.debugLineNum = 176;BA.debugLine="interval_2 = File.ReadString(File.DirInternal, \"";
_interval_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_2.txt");
 //BA.debugLineNum = 177;BA.debugLine="box2_alarm = File.ReadString(File.DirInternal, \"";
_box2_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box2_alarm.txt");
 //BA.debugLineNum = 178;BA.debugLine="data2 = File.ReadString(File.DirInternal, \"pill_";
_data2 = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data2.txt")));
 } 
       catch (Exception e27) {
			processBA.setLastException(e27); };
 //BA.debugLineNum = 186;BA.debugLine="Label19.Text=(pill_naim2)";
mostCurrent._label19.setText(BA.ObjectToCharSequence((_pill_naim2)));
 //BA.debugLineNum = 187;BA.debugLine="Label8.Text = (data2)";
mostCurrent._label8.setText(BA.ObjectToCharSequence((_data2)));
 //BA.debugLineNum = 192;BA.debugLine="Try";
try { //BA.debugLineNum = 194;BA.debugLine="pill_naim3 = File.ReadString(File.DirInternal, \"";
_pill_naim3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim3.txt");
 //BA.debugLineNum = 195;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
_pill_count_box3 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box3.txt"))));
 //BA.debugLineNum = 196;BA.debugLine="start_time_3 = File.ReadString(File.DirInternal,";
_start_time_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_3.txt");
 //BA.debugLineNum = 197;BA.debugLine="interval_3 = File.ReadString(File.DirInternal, \"";
_interval_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_3.txt");
 //BA.debugLineNum = 198;BA.debugLine="box3_alarm = File.ReadString(File.DirInternal, \"";
_box3_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box3_alarm.txt");
 //BA.debugLineNum = 199;BA.debugLine="data3 = File.ReadString(File.DirInternal, \"pill_";
_data3 = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data3.txt")));
 } 
       catch (Exception e38) {
			processBA.setLastException(e38); };
 //BA.debugLineNum = 208;BA.debugLine="Label20.Text=(pill_naim3)";
mostCurrent._label20.setText(BA.ObjectToCharSequence((_pill_naim3)));
 //BA.debugLineNum = 209;BA.debugLine="Label13.Text = (data3)";
mostCurrent._label13.setText(BA.ObjectToCharSequence((_data3)));
 //BA.debugLineNum = 214;BA.debugLine="Try";
try { //BA.debugLineNum = 216;BA.debugLine="pill_naim4 = File.ReadString(File.DirInternal, \"";
_pill_naim4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim4.txt");
 //BA.debugLineNum = 217;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
_pill_count_box4 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box4.txt"))));
 //BA.debugLineNum = 218;BA.debugLine="start_time_4 = File.ReadString(File.DirInternal,";
_start_time_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_4.txt");
 //BA.debugLineNum = 219;BA.debugLine="interval_4 = File.ReadString(File.DirInternal, \"";
_interval_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_4.txt");
 //BA.debugLineNum = 220;BA.debugLine="box4_alarm = File.ReadString(File.DirInternal, \"";
_box4_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box4_alarm.txt");
 //BA.debugLineNum = 221;BA.debugLine="data4 = File.ReadString(File.DirInternal, \"pill_";
_data4 = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data4.txt")));
 } 
       catch (Exception e49) {
			processBA.setLastException(e49); };
 //BA.debugLineNum = 230;BA.debugLine="Label21.Text=(pill_naim4)";
mostCurrent._label21.setText(BA.ObjectToCharSequence((_pill_naim4)));
 //BA.debugLineNum = 231;BA.debugLine="Label17.Text = (data4)";
mostCurrent._label17.setText(BA.ObjectToCharSequence((_data4)));
 //BA.debugLineNum = 236;BA.debugLine="Label4.TextColor = 0xFFFFFFFF";
mostCurrent._label4.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 237;BA.debugLine="Label4.TextSize = 25";
mostCurrent._label4.setTextSize((float) (25));
 //BA.debugLineNum = 238;BA.debugLine="Label4.Text = \"!\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("!"));
 //BA.debugLineNum = 240;BA.debugLine="Label8.TextColor = 0xFFFFFFFF";
mostCurrent._label8.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 241;BA.debugLine="Label8.TextSize = 25";
mostCurrent._label8.setTextSize((float) (25));
 //BA.debugLineNum = 242;BA.debugLine="Label8.Text = \"!\"";
mostCurrent._label8.setText(BA.ObjectToCharSequence("!"));
 //BA.debugLineNum = 244;BA.debugLine="Label13.TextColor = 0xFFFFFFFF";
mostCurrent._label13.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 245;BA.debugLine="Label13.TextSize = 25";
mostCurrent._label13.setTextSize((float) (25));
 //BA.debugLineNum = 246;BA.debugLine="Label13.Text = \"!\"";
mostCurrent._label13.setText(BA.ObjectToCharSequence("!"));
 //BA.debugLineNum = 248;BA.debugLine="Label17.TextColor = 0xFFFFFFFF";
mostCurrent._label17.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 249;BA.debugLine="Label17.TextSize = 25";
mostCurrent._label17.setTextSize((float) (25));
 //BA.debugLineNum = 250;BA.debugLine="Label17.Text = \"!\"";
mostCurrent._label17.setText(BA.ObjectToCharSequence("!"));
 //BA.debugLineNum = 252;BA.debugLine="histori(Label11)";
_histori(mostCurrent._label11);
 //BA.debugLineNum = 257;BA.debugLine="SetupEditLabel(Label2)";
_setupeditlabel(mostCurrent._label2);
 //BA.debugLineNum = 258;BA.debugLine="SetupEditLabel(Label5)";
_setupeditlabel(mostCurrent._label5);
 //BA.debugLineNum = 259;BA.debugLine="SetupEditLabel(Label9)";
_setupeditlabel(mostCurrent._label9);
 //BA.debugLineNum = 260;BA.debugLine="SetupEditLabel(Label14)";
_setupeditlabel(mostCurrent._label14);
 //BA.debugLineNum = 263;BA.debugLine="Imagepill1.Bitmap = LoadBitmap(File.DirAssets, \"p";
mostCurrent._imagepill1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pill.png").getObject()));
 //BA.debugLineNum = 264;BA.debugLine="Imagepill2.Bitmap = LoadBitmap(File.DirAssets, \"p";
mostCurrent._imagepill2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pill (1).png").getObject()));
 //BA.debugLineNum = 265;BA.debugLine="Imagepill3.Bitmap = LoadBitmap(File.DirAssets, \"p";
mostCurrent._imagepill3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pill (2).png").getObject()));
 //BA.debugLineNum = 266;BA.debugLine="Imagepill4.Bitmap = LoadBitmap(File.DirAssets, \"p";
mostCurrent._imagepill4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pill (4).png").getObject()));
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return "";
}
public static String  _astreams_error() throws Exception{
 //BA.debugLineNum = 419;BA.debugLine="Sub AStreams_Error";
 //BA.debugLineNum = 421;BA.debugLine="setconnect1.Enabled = True";
mostCurrent._setconnect1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 422;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مشکلی رخ داده است"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 423;BA.debugLine="disconnectWIFI(setconnect1)";
_disconnectwifi(mostCurrent._setconnect1);
 //BA.debugLineNum = 424;BA.debugLine="viber.Vibrate(1000)";
_viber.Vibrate(processBA,(long) (1000));
 //BA.debugLineNum = 425;BA.debugLine="socket1.Close";
_socket1.Close();
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return "";
}
public static String  _astreams_newdata(byte[] _buffer) throws Exception{
 //BA.debugLineNum = 431;BA.debugLine="Sub AStreams_NewData (Buffer() As Byte)";
 //BA.debugLineNum = 434;BA.debugLine="input = BytesToString(Buffer, 0, Buffer.Length, \"";
_input = anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_buffer.length,"UTF-8");
 //BA.debugLineNum = 439;BA.debugLine="Matcher = Regex.Matcher(pattern1, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern1,_input);
 //BA.debugLineNum = 440;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 441;BA.debugLine="data1 = Matcher.Group(1)";
_data1 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
 //BA.debugLineNum = 445;BA.debugLine="Matcher = Regex.Matcher(pattern2, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern2,_input);
 //BA.debugLineNum = 446;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 447;BA.debugLine="data2 = Matcher.Group(1)";
_data2 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
 //BA.debugLineNum = 451;BA.debugLine="Matcher = Regex.Matcher(pattern3, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern3,_input);
 //BA.debugLineNum = 452;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 453;BA.debugLine="data3 = Matcher.Group(1)";
_data3 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
 //BA.debugLineNum = 457;BA.debugLine="Matcher = Regex.Matcher(pattern4, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern4,_input);
 //BA.debugLineNum = 458;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 459;BA.debugLine="data4 = Matcher.Group(1)";
_data4 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
 //BA.debugLineNum = 462;BA.debugLine="Matcher = Regex.Matcher(pattern5, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern5,_input);
 //BA.debugLineNum = 463;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 464;BA.debugLine="data5 = Matcher.Group(1)";
_data5 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
 //BA.debugLineNum = 468;BA.debugLine="Matcher = Regex.Matcher(pattern6, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern6,_input);
 //BA.debugLineNum = 469;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 470;BA.debugLine="data6 = Matcher.Group(1)";
_data6 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
 //BA.debugLineNum = 474;BA.debugLine="Matcher = Regex.Matcher(pattern7, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern7,_input);
 //BA.debugLineNum = 475;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 476;BA.debugLine="data7 = Matcher.Group(1)";
_data7 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
 //BA.debugLineNum = 480;BA.debugLine="Matcher = Regex.Matcher(pattern8, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern8,_input);
 //BA.debugLineNum = 481;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 482;BA.debugLine="data8 = Matcher.Group(1)";
_data8 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
 //BA.debugLineNum = 486;BA.debugLine="Try";
try { //BA.debugLineNum = 488;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data1.txt",BA.NumberToString(_data1));
 //BA.debugLineNum = 490;BA.debugLine="Label4.Text = (data1)";
mostCurrent._label4.setText(BA.ObjectToCharSequence((_data1)));
 //BA.debugLineNum = 493;BA.debugLine="File.WriteString(File.DirInternal, \"box1_alarm.tx";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box1_alarm.txt",BA.NumberToString(_data5));
 //BA.debugLineNum = 494;BA.debugLine="box1_alarm = File.ReadString(File.DirInternal, \"b";
_box1_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box1_alarm.txt");
 //BA.debugLineNum = 499;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data2.txt",BA.NumberToString(_data2));
 //BA.debugLineNum = 501;BA.debugLine="Label8.Text = (data2)";
mostCurrent._label8.setText(BA.ObjectToCharSequence((_data2)));
 //BA.debugLineNum = 503;BA.debugLine="File.WriteString(File.DirInternal, \"box2_alarm.tx";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box2_alarm.txt",BA.NumberToString(_data6));
 //BA.debugLineNum = 504;BA.debugLine="box2_alarm = File.ReadString(File.DirInternal, \"b";
_box2_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box2_alarm.txt");
 //BA.debugLineNum = 509;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data3.txt",BA.NumberToString(_data3));
 //BA.debugLineNum = 511;BA.debugLine="Label13.Text = (data3)";
mostCurrent._label13.setText(BA.ObjectToCharSequence((_data3)));
 //BA.debugLineNum = 513;BA.debugLine="File.WriteString(File.DirInternal, \"box3_alarm.tx";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box3_alarm.txt",BA.NumberToString(_data7));
 //BA.debugLineNum = 514;BA.debugLine="box3_alarm = File.ReadString(File.DirInternal, \"b";
_box3_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box3_alarm.txt");
 //BA.debugLineNum = 519;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data4.txt",BA.NumberToString(_data4));
 //BA.debugLineNum = 521;BA.debugLine="Label17.Text = (data4)";
mostCurrent._label17.setText(BA.ObjectToCharSequence((_data4)));
 //BA.debugLineNum = 523;BA.debugLine="File.WriteString(File.DirInternal, \"box4_alarm.tx";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box4_alarm.txt",BA.NumberToString(_data8));
 //BA.debugLineNum = 524;BA.debugLine="box4_alarm = File.ReadString(File.DirInternal, \"b";
_box4_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box4_alarm.txt");
 } 
       catch (Exception e52) {
			processBA.setLastException(e52); };
 //BA.debugLineNum = 532;BA.debugLine="Label1.Width = 280dip ' تغییر عرض به مقدار دلخواه";
mostCurrent._label1.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (280)));
 //BA.debugLineNum = 533;BA.debugLine="Label1.Height = 40dip ' تغییر ارتفاع به مقدار دلخ";
mostCurrent._label1.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
 //BA.debugLineNum = 534;BA.debugLine="Label7.Width = 280dip";
mostCurrent._label7.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (280)));
 //BA.debugLineNum = 535;BA.debugLine="Label7.Height = 40dip";
mostCurrent._label7.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
 //BA.debugLineNum = 536;BA.debugLine="Label12.Width = 280dip";
mostCurrent._label12.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (280)));
 //BA.debugLineNum = 537;BA.debugLine="Label12.Height = 40dip";
mostCurrent._label12.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
 //BA.debugLineNum = 538;BA.debugLine="Label16.Width = 280dip";
mostCurrent._label16.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (280)));
 //BA.debugLineNum = 539;BA.debugLine="Label16.Height = 40dip";
mostCurrent._label16.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
 //BA.debugLineNum = 542;BA.debugLine="SetupProgressBar(Label1, 0xFF5DD700 , 50)";
_setupprogressbar(mostCurrent._label1,((int)0xff5dd700),(int) (50));
 //BA.debugLineNum = 543;BA.debugLine="SetupProgressBar(Label7, 0xFF5DD700 , 50)";
_setupprogressbar(mostCurrent._label7,((int)0xff5dd700),(int) (50));
 //BA.debugLineNum = 544;BA.debugLine="SetupProgressBar(Label12, 0xFF5DD700 , 50)";
_setupprogressbar(mostCurrent._label12,((int)0xff5dd700),(int) (50));
 //BA.debugLineNum = 545;BA.debugLine="SetupProgressBar(Label16, 0xFF5DD700 , 50)";
_setupprogressbar(mostCurrent._label16,((int)0xff5dd700),(int) (50));
 //BA.debugLineNum = 551;BA.debugLine="label_size1 = ( 100 / pill_count_box1 )* data1";
_label_size1 = (int) ((100/(double)_pill_count_box1)*_data1);
 //BA.debugLineNum = 552;BA.debugLine="label_size2 = ( 100 / pill_count_box2 )* data2";
_label_size2 = (int) ((100/(double)_pill_count_box2)*_data2);
 //BA.debugLineNum = 556;BA.debugLine="Log (\"-------------------------------------------";
anywheresoftware.b4a.keywords.Common.LogImpl("51179773","----------------------------------------------",0);
 //BA.debugLineNum = 557;BA.debugLine="Log (label_size1)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179774",BA.NumberToString(_label_size1),0);
 //BA.debugLineNum = 558;BA.debugLine="Log(pill_count_box1)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179775",BA.NumberToString(_pill_count_box1),0);
 //BA.debugLineNum = 559;BA.debugLine="Log(data1)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179776",BA.NumberToString(_data1),0);
 //BA.debugLineNum = 560;BA.debugLine="Log (\"-------------------------------------------";
anywheresoftware.b4a.keywords.Common.LogImpl("51179777","----------------------------------------------",0);
 //BA.debugLineNum = 561;BA.debugLine="Log (\"-------------------------------------------";
anywheresoftware.b4a.keywords.Common.LogImpl("51179778","----------------------------------------------",0);
 //BA.debugLineNum = 562;BA.debugLine="Log (label_size2)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179779",BA.NumberToString(_label_size2),0);
 //BA.debugLineNum = 563;BA.debugLine="Log(pill_count_box2)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179780",BA.NumberToString(_pill_count_box2),0);
 //BA.debugLineNum = 564;BA.debugLine="Log(data2)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179781",BA.NumberToString(_data2),0);
 //BA.debugLineNum = 565;BA.debugLine="Log (\"-------------------------------------------";
anywheresoftware.b4a.keywords.Common.LogImpl("51179782","----------------------------------------------",0);
 //BA.debugLineNum = 568;BA.debugLine="UpdateProgressBar(Label1,label_size1)";
_updateprogressbar(mostCurrent._label1,_label_size1);
 //BA.debugLineNum = 569;BA.debugLine="UpdateProgressBar(Label7,label_size2)";
_updateprogressbar(mostCurrent._label7,_label_size2);
 //BA.debugLineNum = 570;BA.debugLine="UpdateProgressBar(Label12,0)";
_updateprogressbar(mostCurrent._label12,(int) (0));
 //BA.debugLineNum = 571;BA.debugLine="UpdateProgressBar(Label16,0)";
_updateprogressbar(mostCurrent._label16,(int) (0));
 //BA.debugLineNum = 574;BA.debugLine="End Sub";
return "";
}
public static String  _connectwifi(anywheresoftware.b4a.objects.ButtonWrapper _btn) throws Exception{
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
 //BA.debugLineNum = 307;BA.debugLine="Sub connectWIFI(btn As Button)";
 //BA.debugLineNum = 308;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 309;BA.debugLine="gd.Initialize(\"LEFT_RIGHT\", Array As Int( 0x0022D";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"LEFT_RIGHT"),new int[]{((int)0x0022d700),((int)0xff22d700),((int)0x0022d700)});
 //BA.debugLineNum = 310;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
_gd.setCornerRadius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))));
 //BA.debugLineNum = 311;BA.debugLine="btn.Background = gd";
_btn.setBackground((android.graphics.drawable.Drawable)(_gd.getObject()));
 //BA.debugLineNum = 312;BA.debugLine="btn.Text = \"اتصال برقرار شد\"";
_btn.setText(BA.ObjectToCharSequence("اتصال برقرار شد"));
 //BA.debugLineNum = 313;BA.debugLine="btn.TextColor = Colors.White";
_btn.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 314;BA.debugLine="btn.TextSize = 18";
_btn.setTextSize((float) (18));
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public static String  _disconnectsocket(anywheresoftware.b4a.objects.SocketWrapper _socket11) throws Exception{
 //BA.debugLineNum = 577;BA.debugLine="Sub disconnectSocket(socket11 As Socket)";
 //BA.debugLineNum = 578;BA.debugLine="Try";
try { //BA.debugLineNum = 579;BA.debugLine="If socket11.Connected Then";
if (_socket11.getConnected()) { 
 //BA.debugLineNum = 580;BA.debugLine="socket11.Close ' بستن اتصال سوکت";
_socket11.Close();
 //BA.debugLineNum = 581;BA.debugLine="astreams.Close ' بستن استریم‌ها";
_astreams.Close();
 //BA.debugLineNum = 582;BA.debugLine="Log(\"ارتباط قطع شد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("54718597","ارتباط قطع شد",0);
 //BA.debugLineNum = 583;BA.debugLine="disconnectWIFI(setconnect1)";
_disconnectwifi(mostCurrent._setconnect1);
 //BA.debugLineNum = 585;BA.debugLine="ToastMessageShow(\"ارتباط قطع شد\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ارتباط قطع شد"),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 589;BA.debugLine="socket11.Initialize(\"socket1\")";
_socket11.Initialize("socket1");
 //BA.debugLineNum = 590;BA.debugLine="setconnect1.Enabled = True ' فعال کردن دکمه اتصا";
mostCurrent._setconnect1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e12) {
			processBA.setLastException(e12); //BA.debugLineNum = 592;BA.debugLine="Log(\"خطا در قطع اتصال\")";
anywheresoftware.b4a.keywords.Common.LogImpl("54718607","خطا در قطع اتصال",0);
 };
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
return "";
}
public static String  _disconnectwifi(anywheresoftware.b4a.objects.ButtonWrapper _btn) throws Exception{
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
 //BA.debugLineNum = 317;BA.debugLine="Sub disconnectWIFI(btn As Button)";
 //BA.debugLineNum = 318;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 319;BA.debugLine="gd.Initialize(\"LEFT_RIGHT\", Array As Int( 0x0022D";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"LEFT_RIGHT"),new int[]{((int)0x0022d700),((int)0xffd7000a),((int)0x0022d700)});
 //BA.debugLineNum = 320;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
_gd.setCornerRadius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))));
 //BA.debugLineNum = 321;BA.debugLine="btn.Background = gd";
_btn.setBackground((android.graphics.drawable.Drawable)(_gd.getObject()));
 //BA.debugLineNum = 322;BA.debugLine="btn.Text = \"برای اتصال کلیک کنید\"";
_btn.setText(BA.ObjectToCharSequence("برای اتصال کلیک کنید"));
 //BA.debugLineNum = 323;BA.debugLine="btn.TextColor = Colors.White";
_btn.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 324;BA.debugLine="btn.TextSize = 18";
_btn.setTextSize((float) (18));
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 60;BA.debugLine="Private Label17 As Label";
mostCurrent._label17 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private Panel1 As Panel";
mostCurrent._panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private Label2 As Label";
mostCurrent._label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private Label3 As Label";
mostCurrent._label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Private Label1 As Label";
mostCurrent._label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Private Label4 As Label";
mostCurrent._label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 66;BA.debugLine="Private Label11 As Label";
mostCurrent._label11 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 67;BA.debugLine="Private Panel5 As Panel";
mostCurrent._panel5 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 68;BA.debugLine="Private ListView1 As ListView";
mostCurrent._listview1 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 69;BA.debugLine="Private Panel2 As Panel";
mostCurrent._panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 70;BA.debugLine="Private Label5 As Label";
mostCurrent._label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 71;BA.debugLine="Private Label6 As Label";
mostCurrent._label6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 72;BA.debugLine="Private Label7 As Label";
mostCurrent._label7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 73;BA.debugLine="Private Label8 As Label";
mostCurrent._label8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 74;BA.debugLine="Private Panel3 As Panel";
mostCurrent._panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 75;BA.debugLine="Private Label9 As Label";
mostCurrent._label9 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 76;BA.debugLine="Private Label10 As Label";
mostCurrent._label10 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 77;BA.debugLine="Private Label12 As Label";
mostCurrent._label12 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 78;BA.debugLine="Private Label13 As Label";
mostCurrent._label13 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 79;BA.debugLine="Private Panel4 As Panel";
mostCurrent._panel4 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 80;BA.debugLine="Private Label14 As Label";
mostCurrent._label14 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 81;BA.debugLine="Private Label15 As Label";
mostCurrent._label15 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 82;BA.debugLine="Private Label16 As Label";
mostCurrent._label16 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 83;BA.debugLine="Private Label18 As Label";
mostCurrent._label18 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 84;BA.debugLine="Private Label19 As Label";
mostCurrent._label19 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 85;BA.debugLine="Private Label21 As Label";
mostCurrent._label21 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 86;BA.debugLine="Private Label20 As Label";
mostCurrent._label20 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 89;BA.debugLine="Private Imagepill1 As ImageView";
mostCurrent._imagepill1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 90;BA.debugLine="Private Imagepill2 As ImageView";
mostCurrent._imagepill2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 91;BA.debugLine="Private Imagepill3 As ImageView";
mostCurrent._imagepill3 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 92;BA.debugLine="Private Imagepill4 As ImageView";
mostCurrent._imagepill4 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 96;BA.debugLine="Private setconnect1 As Button";
mostCurrent._setconnect1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 100;BA.debugLine="Private pattern1 As String = \"p1cs(\\d+)p1ce\"  ' ب";
mostCurrent._pattern1 = "p1cs(\\d+)p1ce";
 //BA.debugLineNum = 101;BA.debugLine="Private pattern2 As String = \"p2cs(\\d+)p2ce\"  ' ب";
mostCurrent._pattern2 = "p2cs(\\d+)p2ce";
 //BA.debugLineNum = 102;BA.debugLine="Private pattern3 As String = \"p3cs(\\d+)p3ce\"  ' ب";
mostCurrent._pattern3 = "p3cs(\\d+)p3ce";
 //BA.debugLineNum = 103;BA.debugLine="Private pattern4 As String = \"p4cs(\\d+)p4ce\"  ' ب";
mostCurrent._pattern4 = "p4cs(\\d+)p4ce";
 //BA.debugLineNum = 105;BA.debugLine="Private pattern5 As String = \"p1ts(\\d+)p1te\"  ' ب";
mostCurrent._pattern5 = "p1ts(\\d+)p1te";
 //BA.debugLineNum = 106;BA.debugLine="Private pattern6 As String = \"p2ts(\\d+)p2te\"  ' ب";
mostCurrent._pattern6 = "p2ts(\\d+)p2te";
 //BA.debugLineNum = 107;BA.debugLine="Private pattern7 As String = \"p3ts(\\d+)p3te\"  ' ب";
mostCurrent._pattern7 = "p3ts(\\d+)p3te";
 //BA.debugLineNum = 108;BA.debugLine="Private pattern8 As String = \"p4ts(\\d+)p4te\"  ' ب";
mostCurrent._pattern8 = "p4ts(\\d+)p4te";
 //BA.debugLineNum = 112;BA.debugLine="Private data1 As Int = 0";
_data1 = (int) (0);
 //BA.debugLineNum = 113;BA.debugLine="Private data2 As Int = 0";
_data2 = (int) (0);
 //BA.debugLineNum = 114;BA.debugLine="Private data3 As Int = 0";
_data3 = (int) (0);
 //BA.debugLineNum = 115;BA.debugLine="Private data4 As Int = 0";
_data4 = (int) (0);
 //BA.debugLineNum = 117;BA.debugLine="Private data5 As Int";
_data5 = 0;
 //BA.debugLineNum = 118;BA.debugLine="Private data6 As Int";
_data6 = 0;
 //BA.debugLineNum = 119;BA.debugLine="Private data7 As Int";
_data7 = 0;
 //BA.debugLineNum = 120;BA.debugLine="Private data8 As Int";
_data8 = 0;
 //BA.debugLineNum = 124;BA.debugLine="Private Matcher As Matcher";
mostCurrent._matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
 //BA.debugLineNum = 127;BA.debugLine="Dim label_size1 As Int";
_label_size1 = 0;
 //BA.debugLineNum = 128;BA.debugLine="Dim label_size2 As Int";
_label_size2 = 0;
 //BA.debugLineNum = 129;BA.debugLine="Dim label_size3 As Int";
_label_size3 = 0;
 //BA.debugLineNum = 130;BA.debugLine="Dim label_size4 As Int";
_label_size4 = 0;
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public static String  _histori(anywheresoftware.b4a.objects.LabelWrapper _lb) throws Exception{
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
 //BA.debugLineNum = 327;BA.debugLine="Sub histori(lb As Label)";
 //BA.debugLineNum = 328;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 329;BA.debugLine="gd.Initialize(\"TOP_BOTTOM\", Array As Int( 0x8BECD";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),new int[]{((int)0x8becd1b2),((int)0x55ecd1b2),((int)0x1fecd1b2)});
 //BA.debugLineNum = 330;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
_gd.setCornerRadius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))));
 //BA.debugLineNum = 331;BA.debugLine="lb.Background = gd";
_lb.setBackground((android.graphics.drawable.Drawable)(_gd.getObject()));
 //BA.debugLineNum = 332;BA.debugLine="lb.Text = \"تاریخچه مصرف دارو\"";
_lb.setText(BA.ObjectToCharSequence("تاریخچه مصرف دارو"));
 //BA.debugLineNum = 333;BA.debugLine="lb.TextColor = Colors.Black";
_lb.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 334;BA.debugLine="lb.TextSize = 22";
_lb.setTextSize((float) (22));
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return "";
}
public static String  _label14_click() throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Private Sub Label14_Click";
 //BA.debugLineNum = 387;BA.debugLine="StartActivity(\"pill_4\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_4"));
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return "";
}
public static String  _label2_click() throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Private Sub Label2_Click";
 //BA.debugLineNum = 363;BA.debugLine="StartActivity(\"pill_1\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_1"));
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return "";
}
public static String  _label5_click() throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Private Sub Label5_Click";
 //BA.debugLineNum = 371;BA.debugLine="StartActivity(\"pill_2\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_2"));
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return "";
}
public static String  _label9_click() throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Private Sub Label9_Click";
 //BA.debugLineNum = 379;BA.debugLine="StartActivity(\"pill_3\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_3"));
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
main._process_globals();
pill_1._process_globals();
pill_2._process_globals();
pill_3._process_globals();
pill_4._process_globals();
naseri_func._process_globals();
starter._process_globals();
xuiviewsutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim pill_naim1 As String";
_pill_naim1 = "";
 //BA.debugLineNum = 17;BA.debugLine="Dim pill_count_box1 As Int = 0";
_pill_count_box1 = (int) (0);
 //BA.debugLineNum = 18;BA.debugLine="Dim start_time_1 As String";
_start_time_1 = "";
 //BA.debugLineNum = 19;BA.debugLine="Dim interval_1 As String";
_interval_1 = "";
 //BA.debugLineNum = 20;BA.debugLine="Dim box1_alarm As String";
_box1_alarm = "";
 //BA.debugLineNum = 24;BA.debugLine="Dim pill_naim2 As String";
_pill_naim2 = "";
 //BA.debugLineNum = 25;BA.debugLine="Dim pill_count_box2 As Int = 0";
_pill_count_box2 = (int) (0);
 //BA.debugLineNum = 26;BA.debugLine="Dim start_time_2 As String";
_start_time_2 = "";
 //BA.debugLineNum = 27;BA.debugLine="Dim interval_2 As String";
_interval_2 = "";
 //BA.debugLineNum = 28;BA.debugLine="Dim box2_alarm As String";
_box2_alarm = "";
 //BA.debugLineNum = 32;BA.debugLine="Dim pill_naim3 As String";
_pill_naim3 = "";
 //BA.debugLineNum = 33;BA.debugLine="Dim pill_count_box3 As Int = 0";
_pill_count_box3 = (int) (0);
 //BA.debugLineNum = 34;BA.debugLine="Dim start_time_3 As String";
_start_time_3 = "";
 //BA.debugLineNum = 35;BA.debugLine="Dim interval_3 As String";
_interval_3 = "";
 //BA.debugLineNum = 36;BA.debugLine="Dim box3_alarm As String";
_box3_alarm = "";
 //BA.debugLineNum = 40;BA.debugLine="Dim pill_naim4 As String";
_pill_naim4 = "";
 //BA.debugLineNum = 41;BA.debugLine="Dim pill_count_box4 As Int = 0";
_pill_count_box4 = (int) (0);
 //BA.debugLineNum = 42;BA.debugLine="Dim start_time_4 As String";
_start_time_4 = "";
 //BA.debugLineNum = 43;BA.debugLine="Dim interval_4 As String";
_interval_4 = "";
 //BA.debugLineNum = 44;BA.debugLine="Dim box4_alarm As String";
_box4_alarm = "";
 //BA.debugLineNum = 48;BA.debugLine="Dim viber As PhoneVibrate";
_viber = new anywheresoftware.b4a.phone.Phone.PhoneVibrate();
 //BA.debugLineNum = 49;BA.debugLine="Dim count As Byte = 1";
_count = (byte) (1);
 //BA.debugLineNum = 50;BA.debugLine="Dim socket1 As Socket";
_socket1 = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 52;BA.debugLine="Dim astreams As AsyncStreams";
_astreams = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 53;BA.debugLine="Dim input As String";
_input = "";
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgrounddrawable(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _color,int _cornerradius) throws Exception{
anywheresoftware.b4a.objects.drawable.GradientDrawable _bg = null;
 //BA.debugLineNum = 296;BA.debugLine="Sub SetBackgroundDrawable(view As View, color As I";
 //BA.debugLineNum = 297;BA.debugLine="Dim bg As GradientDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 298;BA.debugLine="bg.Initialize(\"TOP_BOTTOM\", Array As Int(color, c";
_bg.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),new int[]{_color,_color});
 //BA.debugLineNum = 299;BA.debugLine="bg.CornerRadius = cornerRadius";
_bg.setCornerRadius((float) (_cornerradius));
 //BA.debugLineNum = 300;BA.debugLine="view.Background = bg";
_view.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return "";
}
public static String  _setconnect1_click() throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Private Sub setconnect1_Click";
 //BA.debugLineNum = 339;BA.debugLine="Log(  \"key presed\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5720897","key presed",0);
 //BA.debugLineNum = 341;BA.debugLine="If socket1.IsInitialized = False Then";
if (_socket1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 342;BA.debugLine="Log(\"سوکت مقداردهی شد.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5720900","سوکت مقداردهی شد.",0);
 //BA.debugLineNum = 343;BA.debugLine="socket1.Initialize(\"socket1\")";
_socket1.Initialize("socket1");
 };
 //BA.debugLineNum = 346;BA.debugLine="If socket1.Connected Then";
if (_socket1.getConnected()) { 
 //BA.debugLineNum = 347;BA.debugLine="Log(\"درحال قطع اتصال...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5720905","درحال قطع اتصال...",0);
 //BA.debugLineNum = 348;BA.debugLine="disconnectSocket(socket1)";
_disconnectsocket(_socket1);
 }else {
 //BA.debugLineNum = 352;BA.debugLine="Log(\"درحال اتصال...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5720910","درحال اتصال...",0);
 //BA.debugLineNum = 353;BA.debugLine="ProgressDialogShow2(\"درحال اتصال...\", False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("درحال اتصال..."),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 355;BA.debugLine="socket1.Connect(\"192.168.4.1\", 8888, 5000)";
_socket1.Connect(processBA,"192.168.4.1",(int) (8888),(int) (5000));
 };
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return "";
}
public static String  _setupeditlabel(anywheresoftware.b4a.objects.LabelWrapper _lbl) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetupEditLabel(lbl As Label)";
 //BA.debugLineNum = 280;BA.debugLine="lbl.Text = \"ویرایش\"";
_lbl.setText(BA.ObjectToCharSequence("ویرایش"));
 //BA.debugLineNum = 281;BA.debugLine="lbl.Color = Colors.LightGray";
_lbl.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 282;BA.debugLine="lbl.Gravity = Gravity.CENTER";
_lbl.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 283;BA.debugLine="lbl.TextSize = 16";
_lbl.setTextSize((float) (16));
 //BA.debugLineNum = 284;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return "";
}
public static String  _setupprogressbar(anywheresoftware.b4a.objects.LabelWrapper _lbl,int _color,int _progress) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetupProgressBar(lbl As Label, color As Int, p";
 //BA.debugLineNum = 272;BA.debugLine="lbl.Color = Colors.Red";
_lbl.setColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
 //BA.debugLineNum = 273;BA.debugLine="SetBackgroundDrawable(lbl, color, 10dip)";
_setbackgrounddrawable((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),_color,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
 //BA.debugLineNum = 274;BA.debugLine="UpdateProgressBar(lbl, progress)";
_updateprogressbar(_lbl,_progress);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public static boolean  _socket1_connected(boolean _connected) throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Sub Socket1_Connected(Connected As Boolean)As Bool";
 //BA.debugLineNum = 395;BA.debugLine="If Connected = True Then";
if (_connected==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 396;BA.debugLine="ToastMessageShow(\"ارتباط برقرار شد\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ارتباط برقرار شد"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 397;BA.debugLine="astreams.Initialize(socket1.InputStream, socket1";
_astreams.Initialize(processBA,_socket1.getInputStream(),_socket1.getOutputStream(),"AStreams");
 //BA.debugLineNum = 398;BA.debugLine="viber.Vibrate(50)";
_viber.Vibrate(processBA,(long) (50));
 //BA.debugLineNum = 400;BA.debugLine="connectWIFI(setconnect1)";
_connectwifi(mostCurrent._setconnect1);
 }else {
 //BA.debugLineNum = 403;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مشکلی رخ داده است"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 406;BA.debugLine="disconnectWIFI(setconnect1)";
_disconnectwifi(mostCurrent._setconnect1);
 //BA.debugLineNum = 407;BA.debugLine="viber.Vibrate(500)";
_viber.Vibrate(processBA,(long) (500));
 };
 //BA.debugLineNum = 410;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return false;
}
public static String  _updateprogressbar(anywheresoftware.b4a.objects.LabelWrapper _lbl,int _progress) throws Exception{
int _totalwidth = 0;
int _newwidth = 0;
 //BA.debugLineNum = 289;BA.debugLine="Sub UpdateProgressBar(lbl As Label, progress As In";
 //BA.debugLineNum = 290;BA.debugLine="Dim totalWidth As Int = lbl.Width";
_totalwidth = _lbl.getWidth();
 //BA.debugLineNum = 291;BA.debugLine="Dim newWidth As Int = (totalWidth * progress) / 1";
_newwidth = (int) ((_totalwidth*_progress)/(double)100);
 //BA.debugLineNum = 292;BA.debugLine="lbl.Width = newWidth";
_lbl.setWidth(_newwidth);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return "";
}
}

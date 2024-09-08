package pill.boxV1;


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
			processBA = new BA(this.getApplicationContext(), null, null, "pill.boxV1", "pill.boxV1.main");
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
		activityBA = new BA(this, layout, processBA, "pill.boxV1", "pill.boxV1.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "pill.boxV1.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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
public static String _pill_count_box1 = "";
public static String _start_time_1 = "";
public static String _interval_1 = "";
public static String _box1_alarm = "";
public static String _pill_naim2 = "";
public static String _pill_count_box2 = "";
public static String _start_time_2 = "";
public static String _interval_2 = "";
public static String _box2_alarm = "";
public static String _pill_naim3 = "";
public static String _pill_count_box3 = "";
public static String _start_time_3 = "";
public static String _interval_3 = "";
public static String _box3_alarm = "";
public static String _pill_naim4 = "";
public static String _pill_count_box4 = "";
public static String _start_time_4 = "";
public static String _interval_4 = "";
public static String _box4_alarm = "";
public static anywheresoftware.b4a.phone.Phone.PhoneVibrate _viber = null;
public static byte _count = (byte)0;
public static anywheresoftware.b4a.objects.SocketWrapper _socket1 = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams = null;
public static String _input = "";
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill3 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label11 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label12 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _setconnect1 = null;
public static String _pattern1 = "";
public static String _pattern2 = "";
public static String _pattern3 = "";
public static String _pattern4 = "";
public static String _pattern5 = "";
public static String _pattern6 = "";
public static String _pattern7 = "";
public static String _pattern8 = "";
public static String _data1 = "";
public static String _data2 = "";
public static String _data3 = "";
public static String _data4 = "";
public static String _data5 = "";
public static String _data6 = "";
public static String _data7 = "";
public static String _data8 = "";
public anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
public pill.boxV1.pill_1 _pill_1 = null;
public pill.boxV1.pill_2 _pill_2 = null;
public pill.boxV1.pill_3 _pill_3 = null;
public pill.boxV1.pill_4 _pill_4 = null;
public pill.boxV1.naseri_func _naseri_func = null;
public pill.boxV1.starter _starter = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (pill_1.mostCurrent != null);
vis = vis | (pill_2.mostCurrent != null);
vis = vis | (pill_3.mostCurrent != null);
vis = vis | (pill_4.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 122;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
 //BA.debugLineNum = 126;BA.debugLine="Try";
try { //BA.debugLineNum = 128;BA.debugLine="pill_naim1 = File.ReadString(File.DirInternal, \"";
_pill_naim1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim1.txt");
 //BA.debugLineNum = 129;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
_pill_count_box1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data1.txt");
 //BA.debugLineNum = 130;BA.debugLine="start_time_1 = File.ReadString(File.DirInternal,";
_start_time_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_1.txt");
 //BA.debugLineNum = 131;BA.debugLine="interval_1 = File.ReadString(File.DirInternal, \"";
_interval_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_1.txt");
 //BA.debugLineNum = 132;BA.debugLine="box1_alarm = File.ReadString(File.DirInternal, \"";
_box1_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box1_alarm.txt");
 } 
       catch (Exception e9) {
			processBA.setLastException(e9); };
 //BA.debugLineNum = 140;BA.debugLine="Label1.Text=(\"(\"&pill_naim1&\")\")";
mostCurrent._label1.setText(BA.ObjectToCharSequence(("("+_pill_naim1+")")));
 //BA.debugLineNum = 141;BA.debugLine="Label5.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(";
mostCurrent._label5.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+_pill_count_box1+")")));
 //BA.debugLineNum = 142;BA.debugLine="Label6.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box1_alarm&";
mostCurrent._label6.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box1_alarm+")")));
 //BA.debugLineNum = 146;BA.debugLine="Try";
try { //BA.debugLineNum = 148;BA.debugLine="pill_naim2 = File.ReadString(File.DirInternal, \"";
_pill_naim2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim2.txt");
 //BA.debugLineNum = 149;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
_pill_count_box2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data2.txt");
 //BA.debugLineNum = 150;BA.debugLine="start_time_2 = File.ReadString(File.DirInternal,";
_start_time_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_2.txt");
 //BA.debugLineNum = 151;BA.debugLine="interval_2 = File.ReadString(File.DirInternal, \"";
_interval_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_2.txt");
 //BA.debugLineNum = 152;BA.debugLine="box2_alarm = File.ReadString(File.DirInternal, \"";
_box2_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box2_alarm.txt");
 } 
       catch (Exception e20) {
			processBA.setLastException(e20); };
 //BA.debugLineNum = 160;BA.debugLine="Label2.Text=(\"(\"&pill_naim2&\")\")";
mostCurrent._label2.setText(BA.ObjectToCharSequence(("("+_pill_naim2+")")));
 //BA.debugLineNum = 161;BA.debugLine="Label7.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&p";
mostCurrent._label7.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+_pill_count_box2+")")));
 //BA.debugLineNum = 162;BA.debugLine="Label8.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box2_alarm&";
mostCurrent._label8.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box2_alarm+")")));
 //BA.debugLineNum = 166;BA.debugLine="Try";
try { //BA.debugLineNum = 168;BA.debugLine="pill_naim3 = File.ReadString(File.DirInternal, \"";
_pill_naim3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim3.txt");
 //BA.debugLineNum = 169;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
_pill_count_box3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data3.txt");
 //BA.debugLineNum = 170;BA.debugLine="start_time_3 = File.ReadString(File.DirInternal,";
_start_time_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_3.txt");
 //BA.debugLineNum = 171;BA.debugLine="interval_3 = File.ReadString(File.DirInternal, \"";
_interval_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_3.txt");
 //BA.debugLineNum = 172;BA.debugLine="box3_alarm = File.ReadString(File.DirInternal, \"";
_box3_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box3_alarm.txt");
 } 
       catch (Exception e31) {
			processBA.setLastException(e31); };
 //BA.debugLineNum = 180;BA.debugLine="Label3.Text=(\"(\"&pill_naim3&\")\")";
mostCurrent._label3.setText(BA.ObjectToCharSequence(("("+_pill_naim3+")")));
 //BA.debugLineNum = 181;BA.debugLine="Label9.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&p";
mostCurrent._label9.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+_pill_count_box3+")")));
 //BA.debugLineNum = 182;BA.debugLine="Label10.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box3_alarm";
mostCurrent._label10.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box3_alarm+")")));
 //BA.debugLineNum = 186;BA.debugLine="Try";
try { //BA.debugLineNum = 188;BA.debugLine="pill_naim4 = File.ReadString(File.DirInternal, \"";
_pill_naim4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim4.txt");
 //BA.debugLineNum = 189;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
_pill_count_box4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data4.txt");
 //BA.debugLineNum = 190;BA.debugLine="start_time_4 = File.ReadString(File.DirInternal,";
_start_time_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_4.txt");
 //BA.debugLineNum = 191;BA.debugLine="interval_4 = File.ReadString(File.DirInternal, \"";
_interval_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_4.txt");
 //BA.debugLineNum = 192;BA.debugLine="box4_alarm = File.ReadString(File.DirInternal, \"";
_box4_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box4_alarm.txt");
 } 
       catch (Exception e42) {
			processBA.setLastException(e42); };
 //BA.debugLineNum = 200;BA.debugLine="Label4.Text=(\"(\"&pill_naim4&\")\")";
mostCurrent._label4.setText(BA.ObjectToCharSequence(("("+_pill_naim4+")")));
 //BA.debugLineNum = 201;BA.debugLine="Label11.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&";
mostCurrent._label11.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+_pill_count_box4+")")));
 //BA.debugLineNum = 202;BA.debugLine="Label12.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box4_alarm";
mostCurrent._label12.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box4_alarm+")")));
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return "";
}
public static String  _astreams_error() throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub AStreams_Error";
 //BA.debugLineNum = 294;BA.debugLine="setconnect1.Enabled = True";
mostCurrent._setconnect1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 295;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مشکلی رخ داده است"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 297;BA.debugLine="setconnect1.Text = \"اتصال\"";
mostCurrent._setconnect1.setText(BA.ObjectToCharSequence("اتصال"));
 //BA.debugLineNum = 298;BA.debugLine="viber.Vibrate(1000)";
_viber.Vibrate(processBA,(long) (1000));
 //BA.debugLineNum = 299;BA.debugLine="socket1.Close";
_socket1.Close();
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return "";
}
public static String  _astreams_newdata(byte[] _buffer) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub AStreams_NewData (Buffer() As Byte)";
 //BA.debugLineNum = 308;BA.debugLine="input = BytesToString(Buffer, 0, Buffer.Length, \"";
_input = anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_buffer.length,"UTF-8");
 //BA.debugLineNum = 309;BA.debugLine="Log(input)";
anywheresoftware.b4a.keywords.Common.LogImpl("7786436",_input,0);
 //BA.debugLineNum = 313;BA.debugLine="Matcher = Regex.Matcher(pattern1, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern1,_input);
 //BA.debugLineNum = 314;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 315;BA.debugLine="data1 = Matcher.Group(1)";
mostCurrent._data1 = mostCurrent._matcher.Group((int) (1));
 };
 //BA.debugLineNum = 319;BA.debugLine="Matcher = Regex.Matcher(pattern2, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern2,_input);
 //BA.debugLineNum = 320;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 321;BA.debugLine="data2 = Matcher.Group(1)";
mostCurrent._data2 = mostCurrent._matcher.Group((int) (1));
 };
 //BA.debugLineNum = 325;BA.debugLine="Matcher = Regex.Matcher(pattern3, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern3,_input);
 //BA.debugLineNum = 326;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 327;BA.debugLine="data3 = Matcher.Group(1)";
mostCurrent._data3 = mostCurrent._matcher.Group((int) (1));
 };
 //BA.debugLineNum = 331;BA.debugLine="Matcher = Regex.Matcher(pattern4, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern4,_input);
 //BA.debugLineNum = 332;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 333;BA.debugLine="data4 = Matcher.Group(1)";
mostCurrent._data4 = mostCurrent._matcher.Group((int) (1));
 };
 //BA.debugLineNum = 336;BA.debugLine="Matcher = Regex.Matcher(pattern5, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern5,_input);
 //BA.debugLineNum = 337;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 338;BA.debugLine="data5 = Matcher.Group(1)";
mostCurrent._data5 = mostCurrent._matcher.Group((int) (1));
 };
 //BA.debugLineNum = 342;BA.debugLine="Matcher = Regex.Matcher(pattern6, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern6,_input);
 //BA.debugLineNum = 343;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 344;BA.debugLine="data6 = Matcher.Group(1)";
mostCurrent._data6 = mostCurrent._matcher.Group((int) (1));
 };
 //BA.debugLineNum = 348;BA.debugLine="Matcher = Regex.Matcher(pattern7, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern7,_input);
 //BA.debugLineNum = 349;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 350;BA.debugLine="data7 = Matcher.Group(1)";
mostCurrent._data7 = mostCurrent._matcher.Group((int) (1));
 };
 //BA.debugLineNum = 354;BA.debugLine="Matcher = Regex.Matcher(pattern8, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern8,_input);
 //BA.debugLineNum = 355;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
 //BA.debugLineNum = 356;BA.debugLine="data8 = Matcher.Group(1)";
mostCurrent._data8 = mostCurrent._matcher.Group((int) (1));
 };
 //BA.debugLineNum = 360;BA.debugLine="Log(\"Data1: \" & data1)";
anywheresoftware.b4a.keywords.Common.LogImpl("7786487","Data1: "+mostCurrent._data1,0);
 //BA.debugLineNum = 361;BA.debugLine="Log(\"Data2: \" & data2)";
anywheresoftware.b4a.keywords.Common.LogImpl("7786488","Data2: "+mostCurrent._data2,0);
 //BA.debugLineNum = 362;BA.debugLine="Log(\"Data3: \" & data3)";
anywheresoftware.b4a.keywords.Common.LogImpl("7786489","Data3: "+mostCurrent._data3,0);
 //BA.debugLineNum = 363;BA.debugLine="Log(\"Data4: \" & data4)";
anywheresoftware.b4a.keywords.Common.LogImpl("7786490","Data4: "+mostCurrent._data4,0);
 //BA.debugLineNum = 364;BA.debugLine="Log(\"Data1: \" & data5)";
anywheresoftware.b4a.keywords.Common.LogImpl("7786491","Data1: "+mostCurrent._data5,0);
 //BA.debugLineNum = 365;BA.debugLine="Log(\"Data2: \" & data6)";
anywheresoftware.b4a.keywords.Common.LogImpl("7786492","Data2: "+mostCurrent._data6,0);
 //BA.debugLineNum = 366;BA.debugLine="Log(\"Data3: \" & data7)";
anywheresoftware.b4a.keywords.Common.LogImpl("7786493","Data3: "+mostCurrent._data7,0);
 //BA.debugLineNum = 367;BA.debugLine="Log(\"Data4: \" & data8)";
anywheresoftware.b4a.keywords.Common.LogImpl("7786494","Data4: "+mostCurrent._data8,0);
 //BA.debugLineNum = 371;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data1.txt",mostCurrent._data1);
 //BA.debugLineNum = 372;BA.debugLine="pill_count_box1 = File.ReadString(File.DirInterna";
_pill_count_box1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data1.txt");
 //BA.debugLineNum = 373;BA.debugLine="Label5.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&d";
mostCurrent._label5.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+mostCurrent._data1+")")));
 //BA.debugLineNum = 376;BA.debugLine="File.WriteString(File.DirInternal, \"box1_alarm.tx";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box1_alarm.txt",mostCurrent._data5);
 //BA.debugLineNum = 377;BA.debugLine="box1_alarm = File.ReadString(File.DirInternal, \"b";
_box1_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box1_alarm.txt");
 //BA.debugLineNum = 378;BA.debugLine="Label6.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box1_alarm&";
mostCurrent._label6.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box1_alarm+")")));
 //BA.debugLineNum = 382;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data2.txt",mostCurrent._data2);
 //BA.debugLineNum = 383;BA.debugLine="pill_count_box2 = File.ReadString(File.DirInterna";
_pill_count_box2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data2.txt");
 //BA.debugLineNum = 384;BA.debugLine="Label7.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&d";
mostCurrent._label7.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+mostCurrent._data2+")")));
 //BA.debugLineNum = 386;BA.debugLine="File.WriteString(File.DirInternal, \"box2_alarm.tx";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box2_alarm.txt",mostCurrent._data6);
 //BA.debugLineNum = 387;BA.debugLine="box2_alarm = File.ReadString(File.DirInternal, \"b";
_box2_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box2_alarm.txt");
 //BA.debugLineNum = 388;BA.debugLine="Label8.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box2_alarm&";
mostCurrent._label8.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box2_alarm+")")));
 //BA.debugLineNum = 392;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data3.txt",mostCurrent._data3);
 //BA.debugLineNum = 393;BA.debugLine="pill_count_box3 = File.ReadString(File.DirInterna";
_pill_count_box3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data3.txt");
 //BA.debugLineNum = 394;BA.debugLine="Label9.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&d";
mostCurrent._label9.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+mostCurrent._data3+")")));
 //BA.debugLineNum = 396;BA.debugLine="File.WriteString(File.DirInternal, \"box3_alarm.tx";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box3_alarm.txt",mostCurrent._data7);
 //BA.debugLineNum = 397;BA.debugLine="box3_alarm = File.ReadString(File.DirInternal, \"b";
_box3_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box3_alarm.txt");
 //BA.debugLineNum = 398;BA.debugLine="Label10.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box3_alarm";
mostCurrent._label10.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box3_alarm+")")));
 //BA.debugLineNum = 402;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data4.txt",mostCurrent._data4);
 //BA.debugLineNum = 403;BA.debugLine="pill_count_box4 = File.ReadString(File.DirInterna";
_pill_count_box4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data4.txt");
 //BA.debugLineNum = 404;BA.debugLine="Label11.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&";
mostCurrent._label11.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+mostCurrent._data4+")")));
 //BA.debugLineNum = 406;BA.debugLine="File.WriteString(File.DirInternal, \"box4_alarm.tx";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box4_alarm.txt",mostCurrent._data8);
 //BA.debugLineNum = 407;BA.debugLine="box4_alarm = File.ReadString(File.DirInternal, \"b";
_box4_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box4_alarm.txt");
 //BA.debugLineNum = 408;BA.debugLine="Label12.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box4_alarm";
mostCurrent._label12.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box4_alarm+")")));
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 65;BA.debugLine="Private Imagepill1 As ImageView";
mostCurrent._imagepill1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 66;BA.debugLine="Private Imagepill2 As ImageView";
mostCurrent._imagepill2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 67;BA.debugLine="Private Imagepill3 As ImageView";
mostCurrent._imagepill3 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 68;BA.debugLine="Private Imagepill4 As ImageView";
mostCurrent._imagepill4 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 72;BA.debugLine="Private Label1 As Label";
mostCurrent._label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 73;BA.debugLine="Private Label2 As Label";
mostCurrent._label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 74;BA.debugLine="Private Label3 As Label";
mostCurrent._label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 75;BA.debugLine="Private Label4 As Label";
mostCurrent._label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 76;BA.debugLine="Private Label5 As Label";
mostCurrent._label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 77;BA.debugLine="Private Label6 As Label";
mostCurrent._label6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 78;BA.debugLine="Private Label7 As Label";
mostCurrent._label7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 79;BA.debugLine="Private Label8 As Label";
mostCurrent._label8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 80;BA.debugLine="Private Label9 As Label";
mostCurrent._label9 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 81;BA.debugLine="Private Label10 As Label";
mostCurrent._label10 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 82;BA.debugLine="Private Label11 As Label";
mostCurrent._label11 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 83;BA.debugLine="Private Label12 As Label";
mostCurrent._label12 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 87;BA.debugLine="Private setconnect1 As Button";
mostCurrent._setconnect1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 91;BA.debugLine="Private pattern1 As String = \"p1cs(\\d+)p1ce\"  ' ب";
mostCurrent._pattern1 = "p1cs(\\d+)p1ce";
 //BA.debugLineNum = 92;BA.debugLine="Private pattern2 As String = \"p2cs(\\d+)p2ce\"  ' ب";
mostCurrent._pattern2 = "p2cs(\\d+)p2ce";
 //BA.debugLineNum = 93;BA.debugLine="Private pattern3 As String = \"p3cs(\\d+)p3ce\"  ' ب";
mostCurrent._pattern3 = "p3cs(\\d+)p3ce";
 //BA.debugLineNum = 94;BA.debugLine="Private pattern4 As String = \"p4cs(\\d+)p4ce\"  ' ب";
mostCurrent._pattern4 = "p4cs(\\d+)p4ce";
 //BA.debugLineNum = 96;BA.debugLine="Private pattern5 As String = \"p1ts(\\d+)p1te\"  ' ب";
mostCurrent._pattern5 = "p1ts(\\d+)p1te";
 //BA.debugLineNum = 97;BA.debugLine="Private pattern6 As String = \"p2ts(\\d+)p2te\"  ' ب";
mostCurrent._pattern6 = "p2ts(\\d+)p2te";
 //BA.debugLineNum = 98;BA.debugLine="Private pattern7 As String = \"p3ts(\\d+)p3te\"  ' ب";
mostCurrent._pattern7 = "p3ts(\\d+)p3te";
 //BA.debugLineNum = 99;BA.debugLine="Private pattern8 As String = \"p4ts(\\d+)p4te\"  ' ب";
mostCurrent._pattern8 = "p4ts(\\d+)p4te";
 //BA.debugLineNum = 103;BA.debugLine="Private data1 As String = \"\"";
mostCurrent._data1 = "";
 //BA.debugLineNum = 104;BA.debugLine="Private data2 As String = \"\"";
mostCurrent._data2 = "";
 //BA.debugLineNum = 105;BA.debugLine="Private data3 As String = \"\"";
mostCurrent._data3 = "";
 //BA.debugLineNum = 106;BA.debugLine="Private data4 As String = \"\"";
mostCurrent._data4 = "";
 //BA.debugLineNum = 108;BA.debugLine="Private data5 As String = \"\"";
mostCurrent._data5 = "";
 //BA.debugLineNum = 109;BA.debugLine="Private data6 As String = \"\"";
mostCurrent._data6 = "";
 //BA.debugLineNum = 110;BA.debugLine="Private data7 As String = \"\"";
mostCurrent._data7 = "";
 //BA.debugLineNum = 111;BA.debugLine="Private data8 As String = \"\"";
mostCurrent._data8 = "";
 //BA.debugLineNum = 115;BA.debugLine="Private Matcher As Matcher";
mostCurrent._matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill1_longclick() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Private Sub Imagepill1_LongClick";
 //BA.debugLineNum = 252;BA.debugLine="StartActivity(\"pill_1\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_1"));
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill2_longclick() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Private Sub Imagepill2_LongClick";
 //BA.debugLineNum = 243;BA.debugLine="StartActivity(\"pill_2\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_2"));
 //BA.debugLineNum = 244;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill3_longclick() throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Private Sub Imagepill3_LongClick";
 //BA.debugLineNum = 234;BA.debugLine="StartActivity(\"pill_3\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_3"));
 //BA.debugLineNum = 235;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill4_longclick() throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Private Sub Imagepill4_LongClick";
 //BA.debugLineNum = 225;BA.debugLine="StartActivity(\"pill_4\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_4"));
 //BA.debugLineNum = 226;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
pill_1._process_globals();
pill_2._process_globals();
pill_3._process_globals();
pill_4._process_globals();
naseri_func._process_globals();
starter._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Dim pill_naim1 As String";
_pill_naim1 = "";
 //BA.debugLineNum = 21;BA.debugLine="Dim pill_count_box1 As String";
_pill_count_box1 = "";
 //BA.debugLineNum = 22;BA.debugLine="Dim start_time_1 As String";
_start_time_1 = "";
 //BA.debugLineNum = 23;BA.debugLine="Dim interval_1 As String";
_interval_1 = "";
 //BA.debugLineNum = 24;BA.debugLine="Dim box1_alarm As String";
_box1_alarm = "";
 //BA.debugLineNum = 28;BA.debugLine="Dim pill_naim2 As String";
_pill_naim2 = "";
 //BA.debugLineNum = 29;BA.debugLine="Dim pill_count_box2 As String";
_pill_count_box2 = "";
 //BA.debugLineNum = 30;BA.debugLine="Dim start_time_2 As String";
_start_time_2 = "";
 //BA.debugLineNum = 31;BA.debugLine="Dim interval_2 As String";
_interval_2 = "";
 //BA.debugLineNum = 32;BA.debugLine="Dim box2_alarm As String";
_box2_alarm = "";
 //BA.debugLineNum = 36;BA.debugLine="Dim pill_naim3 As String";
_pill_naim3 = "";
 //BA.debugLineNum = 37;BA.debugLine="Dim pill_count_box3 As String";
_pill_count_box3 = "";
 //BA.debugLineNum = 38;BA.debugLine="Dim start_time_3 As String";
_start_time_3 = "";
 //BA.debugLineNum = 39;BA.debugLine="Dim interval_3 As String";
_interval_3 = "";
 //BA.debugLineNum = 40;BA.debugLine="Dim box3_alarm As String";
_box3_alarm = "";
 //BA.debugLineNum = 44;BA.debugLine="Dim pill_naim4 As String";
_pill_naim4 = "";
 //BA.debugLineNum = 45;BA.debugLine="Dim pill_count_box4 As String";
_pill_count_box4 = "";
 //BA.debugLineNum = 46;BA.debugLine="Dim start_time_4 As String";
_start_time_4 = "";
 //BA.debugLineNum = 47;BA.debugLine="Dim interval_4 As String";
_interval_4 = "";
 //BA.debugLineNum = 48;BA.debugLine="Dim box4_alarm As String";
_box4_alarm = "";
 //BA.debugLineNum = 52;BA.debugLine="Dim viber As PhoneVibrate";
_viber = new anywheresoftware.b4a.phone.Phone.PhoneVibrate();
 //BA.debugLineNum = 53;BA.debugLine="Dim count As Byte = 1";
_count = (byte) (1);
 //BA.debugLineNum = 54;BA.debugLine="Dim socket1 As Socket";
_socket1 = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 56;BA.debugLine="Dim astreams As AsyncStreams";
_astreams = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 57;BA.debugLine="Dim input As String";
_input = "";
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _setconnect1_click() throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Private Sub setconnect1_Click";
 //BA.debugLineNum = 261;BA.debugLine="ProgressDialogShow2(\"درحال اتصال...\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("درحال اتصال..."),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 262;BA.debugLine="socket1.Initialize(\"socket1\")";
_socket1.Initialize("socket1");
 //BA.debugLineNum = 263;BA.debugLine="socket1.Connect(\"192.168.4.1\",8888,5000)";
_socket1.Connect(processBA,"192.168.4.1",(int) (8888),(int) (5000));
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public static boolean  _socket1_connected(boolean _connected) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub Socket1_Connected(Connected As Boolean)As Bool";
 //BA.debugLineNum = 271;BA.debugLine="If Connected = True Then";
if (_connected==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 272;BA.debugLine="ToastMessageShow(\"ارتباط برقرار شد\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ارتباط برقرار شد"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 273;BA.debugLine="astreams.Initialize(socket1.InputStream, socket1";
_astreams.Initialize(processBA,_socket1.getInputStream(),_socket1.getOutputStream(),"AStreams");
 //BA.debugLineNum = 274;BA.debugLine="viber.Vibrate(50)";
_viber.Vibrate(processBA,(long) (50));
 //BA.debugLineNum = 275;BA.debugLine="setconnect1.Enabled =False";
mostCurrent._setconnect1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 276;BA.debugLine="setconnect1.Text = \"متصل شد\"";
mostCurrent._setconnect1.setText(BA.ObjectToCharSequence("متصل شد"));
 }else {
 //BA.debugLineNum = 280;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مشکلی رخ داده است"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 282;BA.debugLine="setconnect1.Text = \"اتصال\"";
mostCurrent._setconnect1.setText(BA.ObjectToCharSequence("اتصال"));
 //BA.debugLineNum = 283;BA.debugLine="viber.Vibrate(500)";
_viber.Vibrate(processBA,(long) (500));
 };
 //BA.debugLineNum = 286;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return false;
}
}

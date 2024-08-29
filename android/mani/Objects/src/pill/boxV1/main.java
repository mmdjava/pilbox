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
public anywheresoftware.b4a.objects.ListViewWrapper _listbox1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listbox2 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listbox3 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listbox4 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill3 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepill4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _setconnect1 = null;
public pill.boxV1.pill_1 _pill_1 = null;
public pill.boxV1.pill_2 _pill_2 = null;
public pill.boxV1.pill_3 _pill_3 = null;
public pill.boxV1.pill_4 _pill_4 = null;
public pill.boxV1.setconnect _setconnect = null;
public pill.boxV1.naseri_func _naseri_func = null;
public pill.boxV1.starter _starter = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (pill_1.mostCurrent != null);
vis = vis | (pill_2.mostCurrent != null);
vis = vis | (pill_3.mostCurrent != null);
vis = vis | (pill_4.mostCurrent != null);
vis = vis | (setconnect.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 73;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
 //BA.debugLineNum = 78;BA.debugLine="Try";
try { //BA.debugLineNum = 79;BA.debugLine="pill_naim1 = File.ReadString(File.DirInternal, \"";
_pill_naim1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim1.txt");
 //BA.debugLineNum = 80;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
_pill_count_box1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box1.txt");
 //BA.debugLineNum = 81;BA.debugLine="start_time_1 = File.ReadString(File.DirInternal,";
_start_time_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_1.txt");
 //BA.debugLineNum = 82;BA.debugLine="interval_1 = File.ReadString(File.DirInternal, \"";
_interval_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_1.txt");
 } 
       catch (Exception e8) {
			processBA.setLastException(e8); };
 //BA.debugLineNum = 90;BA.debugLine="Label1.Text=(\"(\"&pill_naim1&\")\")";
mostCurrent._label1.setText(BA.ObjectToCharSequence(("("+_pill_naim1+")")));
 //BA.debugLineNum = 91;BA.debugLine="Listbox1.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
mostCurrent._listbox1.AddSingleLine(BA.ObjectToCharSequence("   "+"تعداد قرص های موجود:"+"("+_pill_count_box1+")"));
 //BA.debugLineNum = 92;BA.debugLine="Listbox1.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
mostCurrent._listbox1.AddSingleLine(BA.ObjectToCharSequence("   "+"ساعت مصرف:"+"("+_box1_alarm+")"));
 //BA.debugLineNum = 97;BA.debugLine="Try";
try { //BA.debugLineNum = 98;BA.debugLine="pill_naim2 = File.ReadString(File.DirInternal, \"";
_pill_naim2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim2.txt");
 //BA.debugLineNum = 99;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
_pill_count_box2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box2.txt");
 //BA.debugLineNum = 100;BA.debugLine="start_time_2 = File.ReadString(File.DirInternal,";
_start_time_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_2.txt");
 //BA.debugLineNum = 101;BA.debugLine="interval_2 = File.ReadString(File.DirInternal, \"";
_interval_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_2.txt");
 } 
       catch (Exception e18) {
			processBA.setLastException(e18); };
 //BA.debugLineNum = 109;BA.debugLine="Label2.Text=(\"(\"&pill_naim2&\")\")";
mostCurrent._label2.setText(BA.ObjectToCharSequence(("("+_pill_naim2+")")));
 //BA.debugLineNum = 110;BA.debugLine="Listbox2.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
mostCurrent._listbox2.AddSingleLine(BA.ObjectToCharSequence("   "+"تعداد قرص های موجود:"+"("+_pill_count_box2+")"));
 //BA.debugLineNum = 111;BA.debugLine="Listbox2.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
mostCurrent._listbox2.AddSingleLine(BA.ObjectToCharSequence("   "+"ساعت مصرف:"+"("+_box2_alarm+")"));
 //BA.debugLineNum = 115;BA.debugLine="Try";
try { //BA.debugLineNum = 116;BA.debugLine="pill_naim3 = File.ReadString(File.DirInternal, \"";
_pill_naim3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim3.txt");
 //BA.debugLineNum = 117;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
_pill_count_box3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box3.txt");
 //BA.debugLineNum = 118;BA.debugLine="start_time_3 = File.ReadString(File.DirInternal,";
_start_time_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_3.txt");
 //BA.debugLineNum = 119;BA.debugLine="interval_3 = File.ReadString(File.DirInternal, \"";
_interval_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_3.txt");
 } 
       catch (Exception e28) {
			processBA.setLastException(e28); };
 //BA.debugLineNum = 127;BA.debugLine="Label3.Text=(\"(\"&pill_naim3&\")\")";
mostCurrent._label3.setText(BA.ObjectToCharSequence(("("+_pill_naim3+")")));
 //BA.debugLineNum = 128;BA.debugLine="Listbox3.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
mostCurrent._listbox3.AddSingleLine(BA.ObjectToCharSequence("   "+"تعداد قرص های موجود:"+"("+_pill_count_box3+")"));
 //BA.debugLineNum = 129;BA.debugLine="Listbox3.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
mostCurrent._listbox3.AddSingleLine(BA.ObjectToCharSequence("   "+"ساعت مصرف:"+"("+_box3_alarm+")"));
 //BA.debugLineNum = 133;BA.debugLine="Try";
try { //BA.debugLineNum = 134;BA.debugLine="pill_naim4 = File.ReadString(File.DirInternal, \"";
_pill_naim4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim4.txt");
 //BA.debugLineNum = 135;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
_pill_count_box4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box4.txt");
 //BA.debugLineNum = 136;BA.debugLine="start_time_4 = File.ReadString(File.DirInternal,";
_start_time_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_4.txt");
 //BA.debugLineNum = 137;BA.debugLine="interval_4 = File.ReadString(File.DirInternal, \"";
_interval_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_4.txt");
 } 
       catch (Exception e38) {
			processBA.setLastException(e38); };
 //BA.debugLineNum = 145;BA.debugLine="Label4.Text=(\"(\"&pill_naim4&\")\")";
mostCurrent._label4.setText(BA.ObjectToCharSequence(("("+_pill_naim4+")")));
 //BA.debugLineNum = 146;BA.debugLine="Listbox4.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
mostCurrent._listbox4.AddSingleLine(BA.ObjectToCharSequence("   "+"تعداد قرص های موجود:"+"("+_pill_count_box4+")"));
 //BA.debugLineNum = 147;BA.debugLine="Listbox4.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
mostCurrent._listbox4.AddSingleLine(BA.ObjectToCharSequence("   "+"ساعت مصرف:"+"("+_box4_alarm+")"));
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 52;BA.debugLine="Private Listbox1 As ListView";
mostCurrent._listbox1 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private Listbox2 As ListView";
mostCurrent._listbox2 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private Listbox3 As ListView";
mostCurrent._listbox3 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Private Listbox4 As ListView";
mostCurrent._listbox4 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private Imagepill1 As ImageView";
mostCurrent._imagepill1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private Imagepill2 As ImageView";
mostCurrent._imagepill2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private Imagepill3 As ImageView";
mostCurrent._imagepill3 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private Imagepill4 As ImageView";
mostCurrent._imagepill4 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private Label1 As Label";
mostCurrent._label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private Label2 As Label";
mostCurrent._label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private Label3 As Label";
mostCurrent._label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Private Label4 As Label";
mostCurrent._label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 68;BA.debugLine="Private setconnect1 As Button";
mostCurrent._setconnect1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill1_longclick() throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Private Sub Imagepill1_LongClick";
 //BA.debugLineNum = 193;BA.debugLine="StartActivity(\"pill_1\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_1"));
 //BA.debugLineNum = 194;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill2_longclick() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Private Sub Imagepill2_LongClick";
 //BA.debugLineNum = 185;BA.debugLine="StartActivity(\"pill_2\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_2"));
 //BA.debugLineNum = 186;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill3_longclick() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Private Sub Imagepill3_LongClick";
 //BA.debugLineNum = 177;BA.debugLine="StartActivity(\"pill_3\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_3"));
 //BA.debugLineNum = 178;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill4_longclick() throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Private Sub Imagepill4_LongClick";
 //BA.debugLineNum = 168;BA.debugLine="StartActivity(\"pill_4\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_4"));
 //BA.debugLineNum = 169;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public static String  _listbox1_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Private Sub Listbox1_ItemClick (Position As Int, V";
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public static String  _listbox2_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Private Sub Listbox2_ItemClick (Position As Int, V";
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public static String  _listbox3_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Private Sub Listbox3_ItemClick (Position As Int, V";
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public static String  _listbox4_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Private Sub Listbox4_ItemClick (Position As Int, V";
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
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
setconnect._process_globals();
naseri_func._process_globals();
starter._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Dim pill_naim1 As String";
_pill_naim1 = "";
 //BA.debugLineNum = 20;BA.debugLine="Dim pill_count_box1 As String";
_pill_count_box1 = "";
 //BA.debugLineNum = 21;BA.debugLine="Dim start_time_1 As String";
_start_time_1 = "";
 //BA.debugLineNum = 22;BA.debugLine="Dim interval_1 As String";
_interval_1 = "";
 //BA.debugLineNum = 23;BA.debugLine="Dim box1_alarm As String";
_box1_alarm = "";
 //BA.debugLineNum = 25;BA.debugLine="Dim pill_naim2 As String";
_pill_naim2 = "";
 //BA.debugLineNum = 26;BA.debugLine="Dim pill_count_box2 As String";
_pill_count_box2 = "";
 //BA.debugLineNum = 27;BA.debugLine="Dim start_time_2 As String";
_start_time_2 = "";
 //BA.debugLineNum = 28;BA.debugLine="Dim interval_2 As String";
_interval_2 = "";
 //BA.debugLineNum = 29;BA.debugLine="Dim box2_alarm As String";
_box2_alarm = "";
 //BA.debugLineNum = 31;BA.debugLine="Dim pill_naim3 As String";
_pill_naim3 = "";
 //BA.debugLineNum = 32;BA.debugLine="Dim pill_count_box3 As String";
_pill_count_box3 = "";
 //BA.debugLineNum = 33;BA.debugLine="Dim start_time_3 As String";
_start_time_3 = "";
 //BA.debugLineNum = 34;BA.debugLine="Dim interval_3 As String";
_interval_3 = "";
 //BA.debugLineNum = 35;BA.debugLine="Dim box3_alarm As String";
_box3_alarm = "";
 //BA.debugLineNum = 37;BA.debugLine="Dim pill_naim4 As String";
_pill_naim4 = "";
 //BA.debugLineNum = 38;BA.debugLine="Dim pill_count_box4 As String";
_pill_count_box4 = "";
 //BA.debugLineNum = 39;BA.debugLine="Dim start_time_4 As String";
_start_time_4 = "";
 //BA.debugLineNum = 40;BA.debugLine="Dim interval_4 As String";
_interval_4 = "";
 //BA.debugLineNum = 41;BA.debugLine="Dim box4_alarm As String";
_box4_alarm = "";
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public static String  _setconnect1_click() throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Private Sub setconnect1_Click";
 //BA.debugLineNum = 220;BA.debugLine="StartActivity(\"setconnect\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("setconnect"));
 //BA.debugLineNum = 221;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
}

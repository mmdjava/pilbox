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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "pill.boxV1", "pill.boxV1.main");
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



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (pill_1.mostCurrent != null);
vis = vis | (pill_2.mostCurrent != null);
vis = vis | (pill_3.mostCurrent != null);
vis = vis | (pill_4.mostCurrent != null);
vis = vis | (setconnect.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (pill_1.previousOne != null) {
				__a = pill_1.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(pill_1.mostCurrent == null ? null : pill_1.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (pill_2.previousOne != null) {
				__a = pill_2.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(pill_2.mostCurrent == null ? null : pill_2.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (pill_3.previousOne != null) {
				__a = pill_3.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(pill_3.mostCurrent == null ? null : pill_3.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (pill_4.previousOne != null) {
				__a = pill_4.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(pill_4.mostCurrent == null ? null : pill_4.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (setconnect.previousOne != null) {
				__a = setconnect.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(setconnect.mostCurrent == null ? null : setconnect.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
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
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="Timer1.Initialize(\"Timer1\", 500)";
_timer1.Initialize(processBA,"Timer1",(long) (500));
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill1_longclick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imagepill1_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imagepill1_longclick", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub Imagepill1_LongClick";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="StartActivity(\"pill_1\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_1"));
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill2_longclick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imagepill2_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imagepill2_longclick", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub Imagepill2_LongClick";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="StartActivity(\"pill_2\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_2"));
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill3_longclick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imagepill3_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imagepill3_longclick", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub Imagepill3_LongClick";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="StartActivity(\"pill_3\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_3"));
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="End Sub";
return "";
}
public static String  _imagepill4_longclick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imagepill4_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imagepill4_longclick", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub Imagepill4_LongClick";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="StartActivity(\"pill_4\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_4"));
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="End Sub";
return "";
}
public static String  _listbox1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbox1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbox1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub Listbox1_ItemClick (Position As Int, V";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public static String  _listbox2_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbox2_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbox2_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub Listbox2_ItemClick (Position As Int, V";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _listbox3_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbox3_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbox3_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub Listbox3_ItemClick (Position As Int, V";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public static String  _listbox4_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbox4_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbox4_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub Listbox4_ItemClick (Position As Int, V";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public static String  _setconnect1_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setconnect1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setconnect1_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub setconnect1_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="StartActivity(\"setconnect\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("setconnect"));
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timer1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timer1_tick", null));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="Try";
try {RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="pill_naim1 = File.ReadString(File.DirInternal, \"";
_pill_naim1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim1.txt");
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
_pill_count_box1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_arduino.txt");
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="start_time_1 = File.ReadString(File.DirInternal,";
_start_time_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_1.txt");
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="interval_1 = File.ReadString(File.DirInternal, \"";
_interval_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_1.txt");
 } 
       catch (Exception e7) {
			processBA.setLastException(e7); };
RDebugUtils.currentLine=4915222;
 //BA.debugLineNum = 4915222;BA.debugLine="Label1.Text=(\"(\"&pill_naim1&\")\")";
mostCurrent._label1.setText(BA.ObjectToCharSequence(("("+_pill_naim1+")")));
RDebugUtils.currentLine=4915223;
 //BA.debugLineNum = 4915223;BA.debugLine="Listbox1.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
mostCurrent._listbox1.AddSingleLine(BA.ObjectToCharSequence("   "+"تعداد قرص های موجود:"+"("+_pill_count_box1+")"));
RDebugUtils.currentLine=4915224;
 //BA.debugLineNum = 4915224;BA.debugLine="Listbox1.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
mostCurrent._listbox1.AddSingleLine(BA.ObjectToCharSequence("   "+"ساعت مصرف:"+"("+_box1_alarm+")"));
RDebugUtils.currentLine=4915229;
 //BA.debugLineNum = 4915229;BA.debugLine="Try";
try {RDebugUtils.currentLine=4915230;
 //BA.debugLineNum = 4915230;BA.debugLine="pill_naim2 = File.ReadString(File.DirInternal, \"";
_pill_naim2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim2.txt");
RDebugUtils.currentLine=4915231;
 //BA.debugLineNum = 4915231;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
_pill_count_box2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box2.txt");
RDebugUtils.currentLine=4915232;
 //BA.debugLineNum = 4915232;BA.debugLine="start_time_2 = File.ReadString(File.DirInternal,";
_start_time_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_2.txt");
RDebugUtils.currentLine=4915233;
 //BA.debugLineNum = 4915233;BA.debugLine="interval_2 = File.ReadString(File.DirInternal, \"";
_interval_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_2.txt");
 } 
       catch (Exception e17) {
			processBA.setLastException(e17); };
RDebugUtils.currentLine=4915241;
 //BA.debugLineNum = 4915241;BA.debugLine="Label2.Text=(\"(\"&pill_naim2&\")\")";
mostCurrent._label2.setText(BA.ObjectToCharSequence(("("+_pill_naim2+")")));
RDebugUtils.currentLine=4915242;
 //BA.debugLineNum = 4915242;BA.debugLine="Listbox2.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
mostCurrent._listbox2.AddSingleLine(BA.ObjectToCharSequence("   "+"تعداد قرص های موجود:"+"("+_pill_count_box2+")"));
RDebugUtils.currentLine=4915243;
 //BA.debugLineNum = 4915243;BA.debugLine="Listbox2.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
mostCurrent._listbox2.AddSingleLine(BA.ObjectToCharSequence("   "+"ساعت مصرف:"+"("+_box2_alarm+")"));
RDebugUtils.currentLine=4915247;
 //BA.debugLineNum = 4915247;BA.debugLine="Try";
try {RDebugUtils.currentLine=4915248;
 //BA.debugLineNum = 4915248;BA.debugLine="pill_naim3 = File.ReadString(File.DirInternal, \"";
_pill_naim3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim3.txt");
RDebugUtils.currentLine=4915249;
 //BA.debugLineNum = 4915249;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
_pill_count_box3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box3.txt");
RDebugUtils.currentLine=4915250;
 //BA.debugLineNum = 4915250;BA.debugLine="start_time_3 = File.ReadString(File.DirInternal,";
_start_time_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_3.txt");
RDebugUtils.currentLine=4915251;
 //BA.debugLineNum = 4915251;BA.debugLine="interval_3 = File.ReadString(File.DirInternal, \"";
_interval_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_3.txt");
 } 
       catch (Exception e27) {
			processBA.setLastException(e27); };
RDebugUtils.currentLine=4915259;
 //BA.debugLineNum = 4915259;BA.debugLine="Label3.Text=(\"(\"&pill_naim3&\")\")";
mostCurrent._label3.setText(BA.ObjectToCharSequence(("("+_pill_naim3+")")));
RDebugUtils.currentLine=4915260;
 //BA.debugLineNum = 4915260;BA.debugLine="Listbox3.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
mostCurrent._listbox3.AddSingleLine(BA.ObjectToCharSequence("   "+"تعداد قرص های موجود:"+"("+_pill_count_box3+")"));
RDebugUtils.currentLine=4915261;
 //BA.debugLineNum = 4915261;BA.debugLine="Listbox3.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
mostCurrent._listbox3.AddSingleLine(BA.ObjectToCharSequence("   "+"ساعت مصرف:"+"("+_box3_alarm+")"));
RDebugUtils.currentLine=4915265;
 //BA.debugLineNum = 4915265;BA.debugLine="Try";
try {RDebugUtils.currentLine=4915266;
 //BA.debugLineNum = 4915266;BA.debugLine="pill_naim4 = File.ReadString(File.DirInternal, \"";
_pill_naim4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim4.txt");
RDebugUtils.currentLine=4915267;
 //BA.debugLineNum = 4915267;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
_pill_count_box4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box4.txt");
RDebugUtils.currentLine=4915268;
 //BA.debugLineNum = 4915268;BA.debugLine="start_time_4 = File.ReadString(File.DirInternal,";
_start_time_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_4.txt");
RDebugUtils.currentLine=4915269;
 //BA.debugLineNum = 4915269;BA.debugLine="interval_4 = File.ReadString(File.DirInternal, \"";
_interval_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_4.txt");
 } 
       catch (Exception e37) {
			processBA.setLastException(e37); };
RDebugUtils.currentLine=4915277;
 //BA.debugLineNum = 4915277;BA.debugLine="Label4.Text=(\"(\"&pill_naim4&\")\")";
mostCurrent._label4.setText(BA.ObjectToCharSequence(("("+_pill_naim4+")")));
RDebugUtils.currentLine=4915278;
 //BA.debugLineNum = 4915278;BA.debugLine="Listbox4.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
mostCurrent._listbox4.AddSingleLine(BA.ObjectToCharSequence("   "+"تعداد قرص های موجود:"+"("+_pill_count_box4+")"));
RDebugUtils.currentLine=4915279;
 //BA.debugLineNum = 4915279;BA.debugLine="Listbox4.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
mostCurrent._listbox4.AddSingleLine(BA.ObjectToCharSequence("   "+"ساعت مصرف:"+"("+_box4_alarm+")"));
RDebugUtils.currentLine=4915284;
 //BA.debugLineNum = 4915284;BA.debugLine="End Sub";
return "";
}
}
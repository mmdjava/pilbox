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
public static String _data1 = "";
public anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
public pill.boxV1.pill_1 _pill_1 = null;
public pill.boxV1.pill_2 _pill_2 = null;
public pill.boxV1.pill_3 _pill_3 = null;
public pill.boxV1.pill_4 _pill_4 = null;
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
 //BA.debugLineNum = 131078;BA.debugLine="Try";
try {RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="pill_naim1 = File.ReadString(File.DirInternal, \"";
_pill_naim1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim1.txt");
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
_pill_count_box1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data1.txt");
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="start_time_1 = File.ReadString(File.DirInternal,";
_start_time_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_1.txt");
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="interval_1 = File.ReadString(File.DirInternal, \"";
_interval_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_1.txt");
 } 
       catch (Exception e8) {
			processBA.setLastException(e8); };
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="Label1.Text=(\"(\"&pill_naim1&\")\")";
mostCurrent._label1.setText(BA.ObjectToCharSequence(("("+_pill_naim1+")")));
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="Label5.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(";
mostCurrent._label5.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+_pill_count_box1+")")));
RDebugUtils.currentLine=131093;
 //BA.debugLineNum = 131093;BA.debugLine="Label6.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box1_alarm&";
mostCurrent._label6.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box1_alarm+")")));
RDebugUtils.currentLine=131097;
 //BA.debugLineNum = 131097;BA.debugLine="Try";
try {RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="pill_naim2 = File.ReadString(File.DirInternal, \"";
_pill_naim2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim2.txt");
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
_pill_count_box2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box2.txt");
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="start_time_2 = File.ReadString(File.DirInternal,";
_start_time_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_2.txt");
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="interval_2 = File.ReadString(File.DirInternal, \"";
_interval_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_2.txt");
 } 
       catch (Exception e18) {
			processBA.setLastException(e18); };
RDebugUtils.currentLine=131110;
 //BA.debugLineNum = 131110;BA.debugLine="Label2.Text=(\"(\"&pill_naim2&\")\")";
mostCurrent._label2.setText(BA.ObjectToCharSequence(("("+_pill_naim2+")")));
RDebugUtils.currentLine=131111;
 //BA.debugLineNum = 131111;BA.debugLine="Label7.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&p";
mostCurrent._label7.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+_pill_count_box2+")")));
RDebugUtils.currentLine=131112;
 //BA.debugLineNum = 131112;BA.debugLine="Label8.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box2_alarm&";
mostCurrent._label8.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box2_alarm+")")));
RDebugUtils.currentLine=131116;
 //BA.debugLineNum = 131116;BA.debugLine="Try";
try {RDebugUtils.currentLine=131118;
 //BA.debugLineNum = 131118;BA.debugLine="pill_naim3 = File.ReadString(File.DirInternal, \"";
_pill_naim3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim3.txt");
RDebugUtils.currentLine=131119;
 //BA.debugLineNum = 131119;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
_pill_count_box3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box3.txt");
RDebugUtils.currentLine=131120;
 //BA.debugLineNum = 131120;BA.debugLine="start_time_3 = File.ReadString(File.DirInternal,";
_start_time_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_3.txt");
RDebugUtils.currentLine=131121;
 //BA.debugLineNum = 131121;BA.debugLine="interval_3 = File.ReadString(File.DirInternal, \"";
_interval_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_3.txt");
 } 
       catch (Exception e28) {
			processBA.setLastException(e28); };
RDebugUtils.currentLine=131129;
 //BA.debugLineNum = 131129;BA.debugLine="Label3.Text=(\"(\"&pill_naim3&\")\")";
mostCurrent._label3.setText(BA.ObjectToCharSequence(("("+_pill_naim3+")")));
RDebugUtils.currentLine=131130;
 //BA.debugLineNum = 131130;BA.debugLine="Label9.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&p";
mostCurrent._label9.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+_pill_count_box3+")")));
RDebugUtils.currentLine=131131;
 //BA.debugLineNum = 131131;BA.debugLine="Label10.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box3_alarm";
mostCurrent._label10.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box3_alarm+")")));
RDebugUtils.currentLine=131135;
 //BA.debugLineNum = 131135;BA.debugLine="Try";
try {RDebugUtils.currentLine=131137;
 //BA.debugLineNum = 131137;BA.debugLine="pill_naim4 = File.ReadString(File.DirInternal, \"";
_pill_naim4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim4.txt");
RDebugUtils.currentLine=131138;
 //BA.debugLineNum = 131138;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
_pill_count_box4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box4.txt");
RDebugUtils.currentLine=131139;
 //BA.debugLineNum = 131139;BA.debugLine="start_time_4 = File.ReadString(File.DirInternal,";
_start_time_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_4.txt");
RDebugUtils.currentLine=131140;
 //BA.debugLineNum = 131140;BA.debugLine="interval_4 = File.ReadString(File.DirInternal, \"";
_interval_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_4.txt");
 } 
       catch (Exception e38) {
			processBA.setLastException(e38); };
RDebugUtils.currentLine=131148;
 //BA.debugLineNum = 131148;BA.debugLine="Label4.Text=(\"(\"&pill_naim4&\")\")";
mostCurrent._label4.setText(BA.ObjectToCharSequence(("("+_pill_naim4+")")));
RDebugUtils.currentLine=131149;
 //BA.debugLineNum = 131149;BA.debugLine="Label11.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&";
mostCurrent._label11.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+")")));
RDebugUtils.currentLine=131150;
 //BA.debugLineNum = 131150;BA.debugLine="Label12.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box4_alarm";
mostCurrent._label12.setText(BA.ObjectToCharSequence(("   "+"ساعت مصرف:"+"("+_box4_alarm+")")));
RDebugUtils.currentLine=131152;
 //BA.debugLineNum = 131152;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="End Sub";
return "";
}
public static String  _astreams_error() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "astreams_error", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "astreams_error", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub AStreams_Error";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="setconnect1.Enabled = True";
mostCurrent._setconnect1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مشکلی رخ داده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="setconnect1.Text = \"اتصال\"";
mostCurrent._setconnect1.setText(BA.ObjectToCharSequence("اتصال"));
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="viber.Vibrate(1000)";
_viber.Vibrate(processBA,(long) (1000));
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="socket1.Close";
_socket1.Close();
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="End Sub";
return "";
}
public static String  _astreams_newdata(byte[] _buffer) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "astreams_newdata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "astreams_newdata", new Object[] {_buffer}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub AStreams_NewData (Buffer() As Byte)";
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="input = BytesToString(Buffer, 0, Buffer.Length, \"";
_input = anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_buffer.length,"UTF-8");
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Log(input)";
anywheresoftware.b4a.keywords.Common.LogImpl("61048580",_input,0);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Matcher = Regex.Matcher(pattern1, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern1,_input);
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="data1 = Matcher.Group(1)";
mostCurrent._data1 = mostCurrent._matcher.Group((int) (1));
 };
RDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data1.txt",mostCurrent._data1);
RDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="pill_count_box1 = File.ReadString(File.DirInterna";
_pill_count_box1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data1.txt");
RDebugUtils.currentLine=1048609;
 //BA.debugLineNum = 1048609;BA.debugLine="Label5.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&d";
mostCurrent._label5.setText(BA.ObjectToCharSequence(("   "+"تعداد قرص های موجود:"+"("+mostCurrent._data1+")")));
RDebugUtils.currentLine=1048612;
 //BA.debugLineNum = 1048612;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="End Sub";
return "";
}
public static String  _setconnect1_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setconnect1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setconnect1_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub setconnect1_Click";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="ProgressDialogShow2(\"درحال اتصال...\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("درحال اتصال..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="socket1.Initialize(\"socket1\")";
_socket1.Initialize("socket1");
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="socket1.Connect(\"192.168.4.1\",8888,5000)";
_socket1.Connect(processBA,"192.168.4.1",(int) (8888),(int) (5000));
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="End Sub";
return "";
}
public static boolean  _socket1_connected(boolean _connected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "socket1_connected", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "socket1_connected", new Object[] {_connected}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Socket1_Connected(Connected As Boolean)As Bool";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="If Connected = True Then";
if (_connected==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="ToastMessageShow(\"ارتباط برقرار شد\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ارتباط برقرار شد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="astreams.Initialize(socket1.InputStream, socket1";
_astreams.Initialize(processBA,_socket1.getInputStream(),_socket1.getOutputStream(),"AStreams");
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="viber.Vibrate(50)";
_viber.Vibrate(processBA,(long) (50));
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="setconnect1.Enabled =False";
mostCurrent._setconnect1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="setconnect1.Text = \"متصل شد\"";
mostCurrent._setconnect1.setText(BA.ObjectToCharSequence("متصل شد"));
 }else {
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مشکلی رخ داده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="setconnect1.Text = \"اتصال\"";
mostCurrent._setconnect1.setText(BA.ObjectToCharSequence("اتصال"));
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="viber.Vibrate(500)";
_viber.Vibrate(processBA,(long) (500));
 };
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="End Sub";
return false;
}
}
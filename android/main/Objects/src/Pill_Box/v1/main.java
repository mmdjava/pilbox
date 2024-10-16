package Pill_Box.v1;


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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "Pill_Box.v1", "Pill_Box.v1.main");
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
		activityBA = new BA(this, layout, processBA, "Pill_Box.v1", "Pill_Box.v1.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "Pill_Box.v1.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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
		        b4a.example.dateutils._process_globals();
		
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
vis = vis | (imgview.mostCurrent != null);
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
 {
            Activity __a = null;
            if (imgview.previousOne != null) {
				__a = imgview.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(imgview.mostCurrent == null ? null : imgview.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

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
public static String _historyfile = "";
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
public static String _pattern9 = "";
public static int _data1 = 0;
public static int _data2 = 0;
public static int _data3 = 0;
public static int _data4 = 0;
public static int _data5 = 0;
public static int _data6 = 0;
public static int _data7 = 0;
public static int _data8 = 0;
public static int _data9 = 0;
public anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
public static int _label_size1 = 0;
public static int _label_size2 = 0;
public static int _label_size3 = 0;
public static int _label_size4 = 0;
public static int _initialdata1 = 0;
public static int _initialdata2 = 0;
public static int _initialdata3 = 0;
public static int _initialdata4 = 0;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public Pill_Box.v1.scrollinglabel _scrollinglabel1 = null;
public Pill_Box.v1.b4xfloattextfield _b4xfloattextfield1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltime = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public static long _currenttime = 0L;
public static int _hour = 0;
public static int _minute = 0;
public static long _currentdate = 0L;
public static int _day = 0;
public static int _month = 0;
public static String _time = "";
public static String _date = "";
public b4a.example.dateutils _dateutils = null;
public Pill_Box.v1.pill_1 _pill_1 = null;
public Pill_Box.v1.pill_2 _pill_2 = null;
public Pill_Box.v1.pill_3 _pill_3 = null;
public Pill_Box.v1.pill_4 _pill_4 = null;
public Pill_Box.v1.starter _starter = null;
public Pill_Box.v1.naseri_func _naseri_func = null;
public Pill_Box.v1.imgview _imgview = null;
public Pill_Box.v1.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="Imagepill1.Bitmap = LoadBitmap(File.DirAssets, \"p";
mostCurrent._imagepill1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pill (2).png").getObject()));
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Imagepill2.Bitmap = LoadBitmap(File.DirAssets, \"p";
mostCurrent._imagepill2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pill (4).png").getObject()));
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="Imagepill3.Bitmap = LoadBitmap(File.DirAssets, \"p";
mostCurrent._imagepill3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pill (1).png").getObject()));
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="Imagepill4.Bitmap = LoadBitmap(File.DirAssets, \"P";
mostCurrent._imagepill4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Pill.png").getObject()));
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="If socket1.IsInitialized = False Then";
if (_socket1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="socket1.Initialize(\"socket1\")";
_socket1.Initialize("socket1");
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="Log(\"سوکت مقداردهی شد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5131088","سوکت مقداردهی شد",0);
 };
 };
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="disconnectWIFI(setconnect1)";
_disconnectwifi(mostCurrent._setconnect1);
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="LoadHistory";
_loadhistory();
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="Try";
try {RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
_pill_count_box1 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box1.txt"))));
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="start_time_1 = File.ReadString(File.DirInternal,";
_start_time_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_1.txt");
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="interval_1 = File.ReadString(File.DirInternal, \"";
_interval_1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_1.txt");
RDebugUtils.currentLine=131104;
 //BA.debugLineNum = 131104;BA.debugLine="box1_alarm = File.ReadString(File.DirInternal, \"";
_box1_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box1_alarm.txt");
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="data1 = File.ReadString(File.DirInternal, \"pill_";
_data1 = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data1.txt")));
 } 
       catch (Exception e21) {
			processBA.setLastException(e21); };
RDebugUtils.currentLine=131113;
 //BA.debugLineNum = 131113;BA.debugLine="Label4.Text = (pill_count_box1&\"/\"&data1)";
mostCurrent._label4.setText(BA.ObjectToCharSequence((BA.NumberToString(_pill_count_box1)+"/"+BA.NumberToString(_data1))));
RDebugUtils.currentLine=131118;
 //BA.debugLineNum = 131118;BA.debugLine="Try";
try {RDebugUtils.currentLine=131120;
 //BA.debugLineNum = 131120;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
_pill_count_box2 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box2.txt"))));
RDebugUtils.currentLine=131121;
 //BA.debugLineNum = 131121;BA.debugLine="start_time_2 = File.ReadString(File.DirInternal,";
_start_time_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_2.txt");
RDebugUtils.currentLine=131122;
 //BA.debugLineNum = 131122;BA.debugLine="interval_2 = File.ReadString(File.DirInternal, \"";
_interval_2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_2.txt");
RDebugUtils.currentLine=131123;
 //BA.debugLineNum = 131123;BA.debugLine="box2_alarm = File.ReadString(File.DirInternal, \"";
_box2_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box2_alarm.txt");
RDebugUtils.currentLine=131124;
 //BA.debugLineNum = 131124;BA.debugLine="data2 = File.ReadString(File.DirInternal, \"pill_";
_data2 = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data2.txt")));
 } 
       catch (Exception e30) {
			processBA.setLastException(e30); };
RDebugUtils.currentLine=131132;
 //BA.debugLineNum = 131132;BA.debugLine="Label8.Text = (pill_count_box2&\"/\"&data2)";
mostCurrent._label8.setText(BA.ObjectToCharSequence((BA.NumberToString(_pill_count_box2)+"/"+BA.NumberToString(_data2))));
RDebugUtils.currentLine=131137;
 //BA.debugLineNum = 131137;BA.debugLine="Try";
try {RDebugUtils.currentLine=131139;
 //BA.debugLineNum = 131139;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
_pill_count_box3 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box3.txt"))));
RDebugUtils.currentLine=131140;
 //BA.debugLineNum = 131140;BA.debugLine="start_time_3 = File.ReadString(File.DirInternal,";
_start_time_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_3.txt");
RDebugUtils.currentLine=131141;
 //BA.debugLineNum = 131141;BA.debugLine="interval_3 = File.ReadString(File.DirInternal, \"";
_interval_3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_3.txt");
RDebugUtils.currentLine=131142;
 //BA.debugLineNum = 131142;BA.debugLine="box3_alarm = File.ReadString(File.DirInternal, \"";
_box3_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box3_alarm.txt");
RDebugUtils.currentLine=131143;
 //BA.debugLineNum = 131143;BA.debugLine="data3 = File.ReadString(File.DirInternal, \"pill_";
_data3 = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data3.txt")));
 } 
       catch (Exception e39) {
			processBA.setLastException(e39); };
RDebugUtils.currentLine=131152;
 //BA.debugLineNum = 131152;BA.debugLine="Label13.Text = (pill_count_box3&\"/\"&data3)";
mostCurrent._label13.setText(BA.ObjectToCharSequence((BA.NumberToString(_pill_count_box3)+"/"+BA.NumberToString(_data3))));
RDebugUtils.currentLine=131157;
 //BA.debugLineNum = 131157;BA.debugLine="Try";
try {RDebugUtils.currentLine=131159;
 //BA.debugLineNum = 131159;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
_pill_count_box4 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box4.txt"))));
RDebugUtils.currentLine=131160;
 //BA.debugLineNum = 131160;BA.debugLine="start_time_4 = File.ReadString(File.DirInternal,";
_start_time_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_4.txt");
RDebugUtils.currentLine=131161;
 //BA.debugLineNum = 131161;BA.debugLine="interval_4 = File.ReadString(File.DirInternal, \"";
_interval_4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_4.txt");
RDebugUtils.currentLine=131162;
 //BA.debugLineNum = 131162;BA.debugLine="box4_alarm = File.ReadString(File.DirInternal, \"";
_box4_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box4_alarm.txt");
RDebugUtils.currentLine=131163;
 //BA.debugLineNum = 131163;BA.debugLine="data4 = File.ReadString(File.DirInternal, \"pill_";
_data4 = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data4.txt")));
 } 
       catch (Exception e48) {
			processBA.setLastException(e48); };
RDebugUtils.currentLine=131171;
 //BA.debugLineNum = 131171;BA.debugLine="Label17.Text = (pill_count_box4&\"/\"&data4)";
mostCurrent._label17.setText(BA.ObjectToCharSequence((BA.NumberToString(_pill_count_box4)+"/"+BA.NumberToString(_data4))));
RDebugUtils.currentLine=131175;
 //BA.debugLineNum = 131175;BA.debugLine="Label4.TextColor = 0xFFFFFFFF";
mostCurrent._label4.setTextColor(((int)0xffffffff));
RDebugUtils.currentLine=131176;
 //BA.debugLineNum = 131176;BA.debugLine="Label4.TextSize = 25";
mostCurrent._label4.setTextSize((float) (25));
RDebugUtils.currentLine=131177;
 //BA.debugLineNum = 131177;BA.debugLine="Label4.Text = \"!\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("!"));
RDebugUtils.currentLine=131179;
 //BA.debugLineNum = 131179;BA.debugLine="Label8.TextColor = 0xFFFFFFFF";
mostCurrent._label8.setTextColor(((int)0xffffffff));
RDebugUtils.currentLine=131180;
 //BA.debugLineNum = 131180;BA.debugLine="Label8.TextSize = 25";
mostCurrent._label8.setTextSize((float) (25));
RDebugUtils.currentLine=131181;
 //BA.debugLineNum = 131181;BA.debugLine="Label8.Text = \"!\"";
mostCurrent._label8.setText(BA.ObjectToCharSequence("!"));
RDebugUtils.currentLine=131183;
 //BA.debugLineNum = 131183;BA.debugLine="Label13.TextColor = 0xFFFFFFFF";
mostCurrent._label13.setTextColor(((int)0xffffffff));
RDebugUtils.currentLine=131184;
 //BA.debugLineNum = 131184;BA.debugLine="Label13.TextSize = 25";
mostCurrent._label13.setTextSize((float) (25));
RDebugUtils.currentLine=131185;
 //BA.debugLineNum = 131185;BA.debugLine="Label13.Text = \"!\"";
mostCurrent._label13.setText(BA.ObjectToCharSequence("!"));
RDebugUtils.currentLine=131187;
 //BA.debugLineNum = 131187;BA.debugLine="Label17.TextColor = 0xFFFFFFFF";
mostCurrent._label17.setTextColor(((int)0xffffffff));
RDebugUtils.currentLine=131188;
 //BA.debugLineNum = 131188;BA.debugLine="Label17.TextSize = 25";
mostCurrent._label17.setTextSize((float) (25));
RDebugUtils.currentLine=131189;
 //BA.debugLineNum = 131189;BA.debugLine="Label17.Text = \"!\"";
mostCurrent._label17.setText(BA.ObjectToCharSequence("!"));
RDebugUtils.currentLine=131191;
 //BA.debugLineNum = 131191;BA.debugLine="histori(Label11)";
_histori(mostCurrent._label11);
RDebugUtils.currentLine=131194;
 //BA.debugLineNum = 131194;BA.debugLine="SetupEditLabel(Label2)";
_setupeditlabel(mostCurrent._label2);
RDebugUtils.currentLine=131195;
 //BA.debugLineNum = 131195;BA.debugLine="SetupEditLabel(Label5)";
_setupeditlabel(mostCurrent._label5);
RDebugUtils.currentLine=131196;
 //BA.debugLineNum = 131196;BA.debugLine="SetupEditLabel(Label9)";
_setupeditlabel(mostCurrent._label9);
RDebugUtils.currentLine=131197;
 //BA.debugLineNum = 131197;BA.debugLine="SetupEditLabel(Label14)";
_setupeditlabel(mostCurrent._label14);
RDebugUtils.currentLine=131199;
 //BA.debugLineNum = 131199;BA.debugLine="Timer1.Initialize(\"timer1\",1000)";
_timer1.Initialize(processBA,"timer1",(long) (1000));
RDebugUtils.currentLine=131200;
 //BA.debugLineNum = 131200;BA.debugLine="Timer1.Enabled=True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131202;
 //BA.debugLineNum = 131202;BA.debugLine="End Sub";
return "";
}
public static String  _disconnectwifi(anywheresoftware.b4a.objects.ButtonWrapper _btn) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "disconnectwifi", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "disconnectwifi", new Object[] {_btn}));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub disconnectWIFI(btn As Button)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="gd.Initialize(\"LEFT_RIGHT\", Array As Int( 0x0022D";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"LEFT_RIGHT"),new int[]{((int)0x0022d700),((int)0xffd7000a),((int)0x0022d700)});
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
_gd.setCornerRadius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))));
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="btn.Background = gd";
_btn.setBackground((android.graphics.drawable.Drawable)(_gd.getObject()));
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="btn.Text = \"برای اتصال کلیک کنید\"";
_btn.setText(BA.ObjectToCharSequence("برای اتصال کلیک کنید"));
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="btn.TextColor = Colors.White";
_btn.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="btn.TextSize = 18";
_btn.setTextSize((float) (18));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="End Sub";
return "";
}
public static String  _loadhistory() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadhistory", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadhistory", null));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _reader = null;
String _line = "";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub LoadHistory";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="If File.Exists(File.DirInternal, historyFile) The";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),mostCurrent._historyfile)) { 
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Dim reader As TextReader";
_reader = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="reader.Initialize(File.OpenInput(File.DirInterna";
_reader.Initialize((java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),mostCurrent._historyfile).getObject()));
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="Dim line As String";
_line = "";
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="line = reader.ReadLine";
_line = _reader.ReadLine();
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="Do While line <> Null";
while (_line!= null) {
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="ListView1.AddSingleLine(line) 'افزودن هر خط به";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(_line));
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="ListView1.FastScrollEnabled=True";
mostCurrent._listview1.setFastScrollEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="line = reader.ReadLine";
_line = _reader.ReadLine();
 }
;
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="reader.Close";
_reader.Close();
 };
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="End Sub";
return "";
}
public static String  _histori(anywheresoftware.b4a.objects.LabelWrapper _lb) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "histori", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "histori", new Object[] {_lb}));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub histori(lb As Label)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="gd.Initialize(\"TOP_BOTTOM\", Array As Int( 0x00000";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),new int[]{((int)0x00000000),((int)0x9b000000),((int)0xca000000),((int)0xca000000),((int)0xff000000)});
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
_gd.setCornerRadius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="lb.Background = gd";
_lb.setBackground((android.graphics.drawable.Drawable)(_gd.getObject()));
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="lb.Text = \"تاریخچه مصرف دارو\"";
_lb.setText(BA.ObjectToCharSequence("تاریخچه مصرف دارو"));
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="lb.TextColor = Colors.Black";
_lb.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="lb.TextSize = 22";
_lb.setTextSize((float) (22));
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="End Sub";
return "";
}
public static String  _setupeditlabel(anywheresoftware.b4a.objects.LabelWrapper _lbl) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setupeditlabel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setupeditlabel", new Object[] {_lbl}));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub SetupEditLabel(lbl As Label)";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="lbl.Text = \"ویرایش\"";
_lbl.setText(BA.ObjectToCharSequence("ویرایش"));
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="lbl.Color = Colors.LightGray";
_lbl.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="lbl.Gravity = Gravity.CENTER";
_lbl.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="lbl.TextSize = 16";
_lbl.setTextSize((float) (16));
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
public static String  _addcustomitem(anywheresoftware.b4a.objects.ListViewWrapper _lv,String _text,int _textcolor) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addcustomitem", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "addcustomitem", new Object[] {_lv,_text,_textcolor}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub AddCustomItem(lv As ListView, Text As String,";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="pnl.Initialize(\"\")";
_pnl.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="lbl.TextColor = TextColor ' تنظیم رنگ متن";
_lbl.setTextColor(_textcolor);
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="lbl.TextSize = 18 ' تنظیم اندازه فونت";
_lbl.setTextSize((float) (18));
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL ' تنظیم متن";
_lbl.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="pnl.AddView(lbl, 0, 0, 100%x, 50dip) ' تنظیم اندا";
_pnl.AddView((android.view.View)(_lbl.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="End Sub";
return "";
}
public static String  _addtohistory(String _pillname,String _timetaken) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addtohistory", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "addtohistory", new Object[] {_pillname,_timetaken}));}
String _historyitem = "";
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub AddToHistory(pillName As String, timeTaken As";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim historyItem As String = \" \" & pillName & \" زم";
_historyitem = " "+_pillname+" زمان مصرف: "+_timetaken;
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="ListView1.AddSingleLine(historyItem)";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(_historyitem));
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="SaveToFile(historyItem)";
_savetofile(_historyitem);
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="End Sub";
return "";
}
public static String  _savetofile(String _historyitem) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savetofile", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savetofile", new Object[] {_historyitem}));}
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub SaveToFile(historyItem As String)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="writer.Initialize(File.OpenOutput(File.DirInterna";
_writer.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),mostCurrent._historyfile,anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="writer.WriteLine(historyItem) 'نوشتن هر آیتم در ف";
_writer.WriteLine(_historyitem);
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="writer.Close";
_writer.Close();
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="End Sub";
return "";
}
public static String  _astreams_error() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "astreams_error", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "astreams_error", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub AStreams_Error";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="setconnect1.Enabled = True";
mostCurrent._setconnect1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مشکلی رخ داده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="disconnectWIFI(setconnect1)";
_disconnectwifi(mostCurrent._setconnect1);
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="viber.Vibrate(1000)";
_viber.Vibrate(processBA,(long) (1000));
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="socket1.Close";
_socket1.Close();
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="End Sub";
return "";
}
public static String  _astreams_newdata(byte[] _buffer) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "astreams_newdata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "astreams_newdata", new Object[] {_buffer}));}
anywheresoftware.b4a.objects.MediaPlayerWrapper _mp = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub AStreams_NewData (Buffer() As Byte)";
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="input = BytesToString(Buffer, 0, Buffer.Length, \"";
_input = anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_buffer.length,"UTF-8");
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="Matcher = Regex.Matcher(pattern1, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern1,_input);
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="data1 = Matcher.Group(1)";
_data1 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="Matcher = Regex.Matcher(pattern2, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern2,_input);
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="data2 = Matcher.Group(1)";
_data2 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
RDebugUtils.currentLine=1179668;
 //BA.debugLineNum = 1179668;BA.debugLine="Matcher = Regex.Matcher(pattern3, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern3,_input);
RDebugUtils.currentLine=1179669;
 //BA.debugLineNum = 1179669;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
RDebugUtils.currentLine=1179670;
 //BA.debugLineNum = 1179670;BA.debugLine="data3 = Matcher.Group(1)";
_data3 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
RDebugUtils.currentLine=1179674;
 //BA.debugLineNum = 1179674;BA.debugLine="Matcher = Regex.Matcher(pattern4, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern4,_input);
RDebugUtils.currentLine=1179675;
 //BA.debugLineNum = 1179675;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
RDebugUtils.currentLine=1179676;
 //BA.debugLineNum = 1179676;BA.debugLine="data4 = Matcher.Group(1)";
_data4 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
RDebugUtils.currentLine=1179679;
 //BA.debugLineNum = 1179679;BA.debugLine="Matcher = Regex.Matcher(pattern5, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern5,_input);
RDebugUtils.currentLine=1179680;
 //BA.debugLineNum = 1179680;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
RDebugUtils.currentLine=1179681;
 //BA.debugLineNum = 1179681;BA.debugLine="data5 = Matcher.Group(1)";
_data5 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
RDebugUtils.currentLine=1179685;
 //BA.debugLineNum = 1179685;BA.debugLine="Matcher = Regex.Matcher(pattern6, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern6,_input);
RDebugUtils.currentLine=1179686;
 //BA.debugLineNum = 1179686;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
RDebugUtils.currentLine=1179687;
 //BA.debugLineNum = 1179687;BA.debugLine="data6 = Matcher.Group(1)";
_data6 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
RDebugUtils.currentLine=1179691;
 //BA.debugLineNum = 1179691;BA.debugLine="Matcher = Regex.Matcher(pattern7, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern7,_input);
RDebugUtils.currentLine=1179692;
 //BA.debugLineNum = 1179692;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
RDebugUtils.currentLine=1179693;
 //BA.debugLineNum = 1179693;BA.debugLine="data7 = Matcher.Group(1)";
_data7 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
RDebugUtils.currentLine=1179697;
 //BA.debugLineNum = 1179697;BA.debugLine="Matcher = Regex.Matcher(pattern8, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern8,_input);
RDebugUtils.currentLine=1179698;
 //BA.debugLineNum = 1179698;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
RDebugUtils.currentLine=1179699;
 //BA.debugLineNum = 1179699;BA.debugLine="data8 = Matcher.Group(1)";
_data8 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
RDebugUtils.currentLine=1179703;
 //BA.debugLineNum = 1179703;BA.debugLine="Matcher = Regex.Matcher(pattern9, input)";
mostCurrent._matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher(mostCurrent._pattern9,_input);
RDebugUtils.currentLine=1179704;
 //BA.debugLineNum = 1179704;BA.debugLine="If Matcher.Find Then";
if (mostCurrent._matcher.Find()) { 
RDebugUtils.currentLine=1179705;
 //BA.debugLineNum = 1179705;BA.debugLine="data9 = Matcher.Group(1)";
_data9 = (int)(Double.parseDouble(mostCurrent._matcher.Group((int) (1))));
 };
RDebugUtils.currentLine=1179708;
 //BA.debugLineNum = 1179708;BA.debugLine="Log(data9)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179708",BA.NumberToString(_data9),0);
RDebugUtils.currentLine=1179712;
 //BA.debugLineNum = 1179712;BA.debugLine="Try";
try {RDebugUtils.currentLine=1179714;
 //BA.debugLineNum = 1179714;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_D";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data1.txt",BA.NumberToString(_data1));
RDebugUtils.currentLine=1179715;
 //BA.debugLineNum = 1179715;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
_pill_count_box1 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box1.txt"))));
RDebugUtils.currentLine=1179716;
 //BA.debugLineNum = 1179716;BA.debugLine="Label4.Text = (pill_count_box1&\"/\"&data1)";
mostCurrent._label4.setText(BA.ObjectToCharSequence((BA.NumberToString(_pill_count_box1)+"/"+BA.NumberToString(_data1))));
RDebugUtils.currentLine=1179718;
 //BA.debugLineNum = 1179718;BA.debugLine="CheckPillCount1";
_checkpillcount1();
RDebugUtils.currentLine=1179720;
 //BA.debugLineNum = 1179720;BA.debugLine="File.WriteString(File.DirInternal, \"box1_alarm.t";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box1_alarm.txt",BA.NumberToString(_data5));
RDebugUtils.currentLine=1179721;
 //BA.debugLineNum = 1179721;BA.debugLine="box1_alarm = File.ReadString(File.DirInternal, \"";
_box1_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box1_alarm.txt");
RDebugUtils.currentLine=1179726;
 //BA.debugLineNum = 1179726;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_D";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data2.txt",BA.NumberToString(_data2));
RDebugUtils.currentLine=1179727;
 //BA.debugLineNum = 1179727;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
_pill_count_box2 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box2.txt"))));
RDebugUtils.currentLine=1179728;
 //BA.debugLineNum = 1179728;BA.debugLine="Label8.Text = (pill_count_box2&\"/\"&data2)";
mostCurrent._label8.setText(BA.ObjectToCharSequence((BA.NumberToString(_pill_count_box2)+"/"+BA.NumberToString(_data2))));
RDebugUtils.currentLine=1179730;
 //BA.debugLineNum = 1179730;BA.debugLine="CheckPillCount2";
_checkpillcount2();
RDebugUtils.currentLine=1179732;
 //BA.debugLineNum = 1179732;BA.debugLine="File.WriteString(File.DirInternal, \"box2_alarm.t";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box2_alarm.txt",BA.NumberToString(_data6));
RDebugUtils.currentLine=1179733;
 //BA.debugLineNum = 1179733;BA.debugLine="box2_alarm = File.ReadString(File.DirInternal, \"";
_box2_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box2_alarm.txt");
RDebugUtils.currentLine=1179738;
 //BA.debugLineNum = 1179738;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_D";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data3.txt",BA.NumberToString(_data3));
RDebugUtils.currentLine=1179739;
 //BA.debugLineNum = 1179739;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
_pill_count_box3 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box3.txt"))));
RDebugUtils.currentLine=1179740;
 //BA.debugLineNum = 1179740;BA.debugLine="Label13.Text = (pill_count_box3&\"/\"&data3)";
mostCurrent._label13.setText(BA.ObjectToCharSequence((BA.NumberToString(_pill_count_box3)+"/"+BA.NumberToString(_data3))));
RDebugUtils.currentLine=1179742;
 //BA.debugLineNum = 1179742;BA.debugLine="CheckPillCount3";
_checkpillcount3();
RDebugUtils.currentLine=1179744;
 //BA.debugLineNum = 1179744;BA.debugLine="File.WriteString(File.DirInternal, \"box3_alarm.t";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box3_alarm.txt",BA.NumberToString(_data7));
RDebugUtils.currentLine=1179745;
 //BA.debugLineNum = 1179745;BA.debugLine="box3_alarm = File.ReadString(File.DirInternal, \"";
_box3_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box3_alarm.txt");
RDebugUtils.currentLine=1179750;
 //BA.debugLineNum = 1179750;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_D";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_Data4.txt",BA.NumberToString(_data4));
RDebugUtils.currentLine=1179751;
 //BA.debugLineNum = 1179751;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
_pill_count_box4 = ((int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box4.txt"))));
RDebugUtils.currentLine=1179752;
 //BA.debugLineNum = 1179752;BA.debugLine="Label17.Text = (pill_count_box4&\"/\"&data4)";
mostCurrent._label17.setText(BA.ObjectToCharSequence((BA.NumberToString(_pill_count_box4)+"/"+BA.NumberToString(_data4))));
RDebugUtils.currentLine=1179754;
 //BA.debugLineNum = 1179754;BA.debugLine="CheckPillCount4";
_checkpillcount4();
RDebugUtils.currentLine=1179756;
 //BA.debugLineNum = 1179756;BA.debugLine="File.WriteString(File.DirInternal, \"box4_alarm.t";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box4_alarm.txt",BA.NumberToString(_data8));
RDebugUtils.currentLine=1179757;
 //BA.debugLineNum = 1179757;BA.debugLine="box4_alarm = File.ReadString(File.DirInternal, \"";
_box4_alarm = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"box4_alarm.txt");
RDebugUtils.currentLine=1179761;
 //BA.debugLineNum = 1179761;BA.debugLine="initialData1 = data1 'مقدار اولیه را ذخیره کنید";
_initialdata1 = _data1;
RDebugUtils.currentLine=1179762;
 //BA.debugLineNum = 1179762;BA.debugLine="initialData2 = data2 'مقدار اولیه را ذخیره کنید";
_initialdata2 = _data2;
RDebugUtils.currentLine=1179763;
 //BA.debugLineNum = 1179763;BA.debugLine="initialData3 = data3 'مقدار اولیه را ذخیره کنید";
_initialdata3 = _data3;
RDebugUtils.currentLine=1179764;
 //BA.debugLineNum = 1179764;BA.debugLine="initialData4 = data4 'مقدار اولیه را ذخیره کنید";
_initialdata4 = _data4;
RDebugUtils.currentLine=1179767;
 //BA.debugLineNum = 1179767;BA.debugLine="If (data9==0) Then";
if ((_data9==0)) { 
RDebugUtils.currentLine=1179769;
 //BA.debugLineNum = 1179769;BA.debugLine="Dim mp As MediaPlayer";
_mp = new anywheresoftware.b4a.objects.MediaPlayerWrapper();
RDebugUtils.currentLine=1179770;
 //BA.debugLineNum = 1179770;BA.debugLine="mp.Initialize()";
_mp.Initialize();
RDebugUtils.currentLine=1179771;
 //BA.debugLineNum = 1179771;BA.debugLine="mp.Load(File.DirAssets, \"alarm.mp3\") 'فایلی که";
_mp.Load(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"alarm.mp3");
RDebugUtils.currentLine=1179772;
 //BA.debugLineNum = 1179772;BA.debugLine="mp.Play";
_mp.Play();
RDebugUtils.currentLine=1179773;
 //BA.debugLineNum = 1179773;BA.debugLine="data9 = -1";
_data9 = (int) (-1);
RDebugUtils.currentLine=1179775;
 //BA.debugLineNum = 1179775;BA.debugLine="Msgbox(\"بیمار قرص\" &\" \"&pill_naim1&\" \"& \"مصرف ن";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("بیمار قرص"+" "+_pill_naim1+" "+"مصرف نکرده است!!!"),BA.ObjectToCharSequence("توجه"),mostCurrent.activityBA);
RDebugUtils.currentLine=1179777;
 //BA.debugLineNum = 1179777;BA.debugLine="AddToHistory(pill_naim1,\"مصرف نشد\"&date&\"  \"&ti";
_addtohistory(_pill_naim1,"مصرف نشد"+mostCurrent._date+"  "+mostCurrent._time);
 };
RDebugUtils.currentLine=1179781;
 //BA.debugLineNum = 1179781;BA.debugLine="If (data9==1) Then";
if ((_data9==1)) { 
RDebugUtils.currentLine=1179783;
 //BA.debugLineNum = 1179783;BA.debugLine="Dim mp As MediaPlayer";
_mp = new anywheresoftware.b4a.objects.MediaPlayerWrapper();
RDebugUtils.currentLine=1179784;
 //BA.debugLineNum = 1179784;BA.debugLine="mp.Initialize()";
_mp.Initialize();
RDebugUtils.currentLine=1179785;
 //BA.debugLineNum = 1179785;BA.debugLine="mp.Load(File.DirAssets, \"alarm.mp3\") 'فایلی که";
_mp.Load(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"alarm.mp3");
RDebugUtils.currentLine=1179786;
 //BA.debugLineNum = 1179786;BA.debugLine="mp.Play";
_mp.Play();
RDebugUtils.currentLine=1179787;
 //BA.debugLineNum = 1179787;BA.debugLine="data9 = -1";
_data9 = (int) (-1);
RDebugUtils.currentLine=1179789;
 //BA.debugLineNum = 1179789;BA.debugLine="Msgbox(\"بیمار قرص\" &\" \"&pill_naim2&\" \"& \"را مصر";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("بیمار قرص"+" "+_pill_naim2+" "+"را مصرف نکرده است!!!"),BA.ObjectToCharSequence("توجه"),mostCurrent.activityBA);
RDebugUtils.currentLine=1179791;
 //BA.debugLineNum = 1179791;BA.debugLine="AddToHistory(pill_naim2,\"مصرف نشد\"&date&\"  \"&ti";
_addtohistory(_pill_naim2,"مصرف نشد"+mostCurrent._date+"  "+mostCurrent._time);
 };
RDebugUtils.currentLine=1179795;
 //BA.debugLineNum = 1179795;BA.debugLine="If (data9==2) Then";
if ((_data9==2)) { 
RDebugUtils.currentLine=1179797;
 //BA.debugLineNum = 1179797;BA.debugLine="Dim mp As MediaPlayer";
_mp = new anywheresoftware.b4a.objects.MediaPlayerWrapper();
RDebugUtils.currentLine=1179798;
 //BA.debugLineNum = 1179798;BA.debugLine="mp.Initialize()";
_mp.Initialize();
RDebugUtils.currentLine=1179799;
 //BA.debugLineNum = 1179799;BA.debugLine="mp.Load(File.DirAssets, \"alarm.mp3\") 'فایلی که";
_mp.Load(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"alarm.mp3");
RDebugUtils.currentLine=1179800;
 //BA.debugLineNum = 1179800;BA.debugLine="mp.Play";
_mp.Play();
RDebugUtils.currentLine=1179801;
 //BA.debugLineNum = 1179801;BA.debugLine="data9 = -1";
_data9 = (int) (-1);
RDebugUtils.currentLine=1179803;
 //BA.debugLineNum = 1179803;BA.debugLine="Msgbox(\"بیمار قرص\" &\" \"&pill_naim3&\" \"& \"را مصر";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("بیمار قرص"+" "+_pill_naim3+" "+"را مصرف نکرده است!!!"),BA.ObjectToCharSequence("توجه"),mostCurrent.activityBA);
RDebugUtils.currentLine=1179805;
 //BA.debugLineNum = 1179805;BA.debugLine="AddToHistory(pill_naim3,\"مصرف نشد\"&date&\"  \"&ti";
_addtohistory(_pill_naim3,"مصرف نشد"+mostCurrent._date+"  "+mostCurrent._time);
 };
RDebugUtils.currentLine=1179809;
 //BA.debugLineNum = 1179809;BA.debugLine="If (data9==3) Then";
if ((_data9==3)) { 
RDebugUtils.currentLine=1179811;
 //BA.debugLineNum = 1179811;BA.debugLine="Dim mp As MediaPlayer";
_mp = new anywheresoftware.b4a.objects.MediaPlayerWrapper();
RDebugUtils.currentLine=1179812;
 //BA.debugLineNum = 1179812;BA.debugLine="mp.Initialize()";
_mp.Initialize();
RDebugUtils.currentLine=1179813;
 //BA.debugLineNum = 1179813;BA.debugLine="mp.Load(File.DirAssets, \"alarm.mp3\") 'فایلی که";
_mp.Load(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"alarm.mp3");
RDebugUtils.currentLine=1179814;
 //BA.debugLineNum = 1179814;BA.debugLine="mp.Play";
_mp.Play();
RDebugUtils.currentLine=1179815;
 //BA.debugLineNum = 1179815;BA.debugLine="data9 = -1";
_data9 = (int) (-1);
RDebugUtils.currentLine=1179817;
 //BA.debugLineNum = 1179817;BA.debugLine="Msgbox(\"بیمار قرص\" &\" \"&pill_naim4&\" \"& \"را مصر";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("بیمار قرص"+" "+_pill_naim4+" "+"را مصرف نکرده است!!!"),BA.ObjectToCharSequence("توجه"),mostCurrent.activityBA);
RDebugUtils.currentLine=1179819;
 //BA.debugLineNum = 1179819;BA.debugLine="AddToHistory(pill_naim4,\"مصرف نشد\"&date&\"  \"&ti";
_addtohistory(_pill_naim4,"مصرف نشد"+mostCurrent._date+"  "+mostCurrent._time);
 };
 } 
       catch (Exception e105) {
			processBA.setLastException(e105); };
RDebugUtils.currentLine=1179828;
 //BA.debugLineNum = 1179828;BA.debugLine="Label1.Width = 280dip ' تغییر عرض به مقدار دلخواه";
mostCurrent._label1.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (280)));
RDebugUtils.currentLine=1179829;
 //BA.debugLineNum = 1179829;BA.debugLine="Label1.Height = 40dip ' تغییر ارتفاع به مقدار دلخ";
mostCurrent._label1.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=1179830;
 //BA.debugLineNum = 1179830;BA.debugLine="Label7.Width = 280dip";
mostCurrent._label7.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (280)));
RDebugUtils.currentLine=1179831;
 //BA.debugLineNum = 1179831;BA.debugLine="Label7.Height = 40dip";
mostCurrent._label7.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=1179832;
 //BA.debugLineNum = 1179832;BA.debugLine="Label12.Width = 280dip";
mostCurrent._label12.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (280)));
RDebugUtils.currentLine=1179833;
 //BA.debugLineNum = 1179833;BA.debugLine="Label12.Height = 40dip";
mostCurrent._label12.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=1179834;
 //BA.debugLineNum = 1179834;BA.debugLine="Label16.Width = 280dip";
mostCurrent._label16.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (280)));
RDebugUtils.currentLine=1179835;
 //BA.debugLineNum = 1179835;BA.debugLine="Label16.Height = 40dip";
mostCurrent._label16.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=1179838;
 //BA.debugLineNum = 1179838;BA.debugLine="SetupProgressBar(Label1, 0xFF5DD700 , 50)";
_setupprogressbar(mostCurrent._label1,((int)0xff5dd700),(int) (50));
RDebugUtils.currentLine=1179839;
 //BA.debugLineNum = 1179839;BA.debugLine="SetupProgressBar(Label7, 0xFF5DD700 , 50)";
_setupprogressbar(mostCurrent._label7,((int)0xff5dd700),(int) (50));
RDebugUtils.currentLine=1179840;
 //BA.debugLineNum = 1179840;BA.debugLine="SetupProgressBar(Label12, 0xFF5DD700 , 50)";
_setupprogressbar(mostCurrent._label12,((int)0xff5dd700),(int) (50));
RDebugUtils.currentLine=1179841;
 //BA.debugLineNum = 1179841;BA.debugLine="SetupProgressBar(Label16, 0xFF5DD700 , 50)";
_setupprogressbar(mostCurrent._label16,((int)0xff5dd700),(int) (50));
RDebugUtils.currentLine=1179843;
 //BA.debugLineNum = 1179843;BA.debugLine="Try";
try {RDebugUtils.currentLine=1179845;
 //BA.debugLineNum = 1179845;BA.debugLine="label_size1 = ( 100 / pill_count_box1 )* data1";
_label_size1 = (int) ((100/(double)_pill_count_box1)*_data1);
RDebugUtils.currentLine=1179846;
 //BA.debugLineNum = 1179846;BA.debugLine="label_size2 = ( 100 / pill_count_box2 )* data2";
_label_size2 = (int) ((100/(double)_pill_count_box2)*_data2);
RDebugUtils.currentLine=1179847;
 //BA.debugLineNum = 1179847;BA.debugLine="label_size3 = ( 100 / pill_count_box3 )* data3";
_label_size3 = (int) ((100/(double)_pill_count_box3)*_data3);
RDebugUtils.currentLine=1179848;
 //BA.debugLineNum = 1179848;BA.debugLine="label_size4 = ( 100 / pill_count_box4 )* data4";
_label_size4 = (int) ((100/(double)_pill_count_box4)*_data4);
RDebugUtils.currentLine=1179851;
 //BA.debugLineNum = 1179851;BA.debugLine="UpdateProgressBar(Label1,label_size1)";
_updateprogressbar(mostCurrent._label1,_label_size1);
RDebugUtils.currentLine=1179852;
 //BA.debugLineNum = 1179852;BA.debugLine="UpdateProgressBar(Label7,label_size2)";
_updateprogressbar(mostCurrent._label7,_label_size2);
RDebugUtils.currentLine=1179853;
 //BA.debugLineNum = 1179853;BA.debugLine="UpdateProgressBar(Label12,label_size3)";
_updateprogressbar(mostCurrent._label12,_label_size3);
RDebugUtils.currentLine=1179854;
 //BA.debugLineNum = 1179854;BA.debugLine="UpdateProgressBar(Label16,label_size4)";
_updateprogressbar(mostCurrent._label16,_label_size4);
 } 
       catch (Exception e128) {
			processBA.setLastException(e128); };
RDebugUtils.currentLine=1179861;
 //BA.debugLineNum = 1179861;BA.debugLine="End Sub";
return "";
}
public static String  _checkpillcount1() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkpillcount1", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkpillcount1", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub CheckPillCount1";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If data1 < initialData1 Then";
if (_data1<_initialdata1) { 
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="AddToHistory(pill_naim1,date&\"  \"&time)";
_addtohistory(_pill_naim1,mostCurrent._date+"  "+mostCurrent._time);
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="initialData1 = data1";
_initialdata1 = _data1;
 };
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="End Sub";
return "";
}
public static String  _checkpillcount2() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkpillcount2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkpillcount2", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub CheckPillCount2";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If data2 < initialData2 Then";
if (_data2<_initialdata2) { 
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="AddToHistory(pill_naim2,date&\"  \"&time)";
_addtohistory(_pill_naim2,mostCurrent._date+"  "+mostCurrent._time);
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="initialData2 = data2";
_initialdata2 = _data2;
 };
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="End Sub";
return "";
}
public static String  _checkpillcount3() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkpillcount3", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkpillcount3", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub CheckPillCount3";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If data3 < initialData3 Then";
if (_data3<_initialdata3) { 
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="AddToHistory(pill_naim3,date&\"  \"&time)";
_addtohistory(_pill_naim3,mostCurrent._date+"  "+mostCurrent._time);
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="initialData3 = data3";
_initialdata3 = _data3;
 };
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="End Sub";
return "";
}
public static String  _checkpillcount4() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkpillcount4", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkpillcount4", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub CheckPillCount4";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If data4 < initialData4 Then";
if (_data4<_initialdata4) { 
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="AddToHistory(pill_naim4,date&\"  \"&time)";
_addtohistory(_pill_naim4,mostCurrent._date+"  "+mostCurrent._time);
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="initialData4 = data4";
_initialdata4 = _data4;
 };
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="End Sub";
return "";
}
public static String  _setupprogressbar(anywheresoftware.b4a.objects.LabelWrapper _lbl,int _color,int _progress) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setupprogressbar", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setupprogressbar", new Object[] {_lbl,_color,_progress}));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub SetupProgressBar(lbl As Label, color As Int, p";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="lbl.Color = Colors.Red";
_lbl.setColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="SetBackgroundDrawable(lbl, color, 10dip)";
_setbackgrounddrawable((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),_color,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="UpdateProgressBar(lbl, progress)";
_updateprogressbar(_lbl,_progress);
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="End Sub";
return "";
}
public static String  _updateprogressbar(anywheresoftware.b4a.objects.LabelWrapper _lbl,int _progress) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateprogressbar", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateprogressbar", new Object[] {_lbl,_progress}));}
int _totalwidth = 0;
int _newwidth = 0;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub UpdateProgressBar(lbl As Label, progress As In";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Dim totalWidth As Int = lbl.Width";
_totalwidth = _lbl.getWidth();
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Dim newWidth As Int = (totalWidth * progress) / 1";
_newwidth = (int) ((_totalwidth*_progress)/(double)100);
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="lbl.Width = newWidth";
_lbl.setWidth(_newwidth);
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="End Sub";
return "";
}
public static String  _connectwifi(anywheresoftware.b4a.objects.ButtonWrapper _btn) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "connectwifi", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "connectwifi", new Object[] {_btn}));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub connectWIFI(btn As Button)";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="gd.Initialize(\"LEFT_RIGHT\", Array As Int( 0x0022D";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"LEFT_RIGHT"),new int[]{((int)0x0022d700),((int)0xff22d700),((int)0x0022d700)});
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
_gd.setCornerRadius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))));
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="btn.Background = gd";
_btn.setBackground((android.graphics.drawable.Drawable)(_gd.getObject()));
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="btn.Text = \"اتصال برقرار شد\"";
_btn.setText(BA.ObjectToCharSequence("اتصال برقرار شد"));
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="btn.TextColor = Colors.White";
_btn.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="btn.TextSize = 18";
_btn.setTextSize((float) (18));
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="End Sub";
return "";
}
public static String  _disconnectsocket(anywheresoftware.b4a.objects.SocketWrapper _socket11) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "disconnectsocket", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "disconnectsocket", new Object[] {_socket11}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub disconnectSocket(socket11 As Socket)";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Try";
try {RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="If socket11.Connected Then";
if (_socket11.getConnected()) { 
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="socket11.Close ' بستن اتصال سوکت";
_socket11.Close();
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="astreams.Close ' بستن استریم‌ها";
_astreams.Close();
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Log(\"ارتباط قطع شد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("51245190","ارتباط قطع شد",0);
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="disconnectWIFI(setconnect1)";
_disconnectwifi(mostCurrent._setconnect1);
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="ToastMessageShow(\"ارتباط قطع شد\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ارتباط قطع شد"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="socket11.Initialize(\"socket1\")";
_socket11.Initialize("socket1");
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="setconnect1.Enabled = True ' فعال کردن دکمه اتصا";
mostCurrent._setconnect1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="Log(\"خطا در قطع اتصال\")";
anywheresoftware.b4a.keywords.Common.LogImpl("51245197","خطا در قطع اتصال",0);
 };
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="End Sub";
return "";
}
public static String  _label14_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label14_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label14_click", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub Label14_Click";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="StartActivity(\"pill_4\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_4"));
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="End Sub";
return "";
}
public static String  _label2_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label2_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="StartActivity(\"pill_1\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_1"));
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="End Sub";
return "";
}
public static String  _label5_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label5_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label5_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub Label5_Click";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="StartActivity(\"pill_2\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_2"));
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
return "";
}
public static String  _label9_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label9_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label9_click", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub Label9_Click";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="StartActivity(\"pill_3\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("pill_3"));
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemlongclick", new Object[] {_position,_value}));}
int _res = 0;
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Sub ListView1_ItemLongClick(Position As Int, Value";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="res = Msgbox2(\"آیا می‌خواهید این آیتم حذف شود؟\",";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("آیا می‌خواهید این آیتم حذف شود؟"),BA.ObjectToCharSequence("حذف آیتم"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=27656196;
 //BA.debugLineNum = 27656196;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=27656197;
 //BA.debugLineNum = 27656197;BA.debugLine="ListView1.RemoveAt(Position) ' حذف آیتم از ListV";
mostCurrent._listview1.RemoveAt(_position);
RDebugUtils.currentLine=27656198;
 //BA.debugLineNum = 27656198;BA.debugLine="Log(\"آیتم حذف شد: \" & Value)";
anywheresoftware.b4a.keywords.Common.LogImpl("527656198","آیتم حذف شد: "+BA.ObjectToString(_value),0);
 };
RDebugUtils.currentLine=27656200;
 //BA.debugLineNum = 27656200;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgrounddrawable(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _color,int _cornerradius) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setbackgrounddrawable", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setbackgrounddrawable", new Object[] {_view,_color,_cornerradius}));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _bg = null;
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub SetBackgroundDrawable(view As View, color As I";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Dim bg As GradientDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="bg.Initialize(\"TOP_BOTTOM\", Array As Int(color, c";
_bg.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),new int[]{_color,_color});
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="bg.CornerRadius = cornerRadius";
_bg.setCornerRadius((float) (_cornerradius));
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="view.Background = bg";
_view.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="End Sub";
return "";
}
public static String  _setconnect1_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setconnect1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setconnect1_click", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub setconnect1_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Log(  \"key presed\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5720897","key presed",0);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="If socket1.IsInitialized = False Then";
if (_socket1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Log(\"سوکت مقداردهی شد.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5720900","سوکت مقداردهی شد.",0);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="socket1.Initialize(\"socket1\")";
_socket1.Initialize("socket1");
 };
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="If socket1.Connected Then";
if (_socket1.getConnected()) { 
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Log(\"درحال قطع اتصال...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5720905","درحال قطع اتصال...",0);
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="disconnectSocket(socket1)";
_disconnectsocket(_socket1);
 }else {
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="Log(\"درحال اتصال...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5720910","درحال اتصال...",0);
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="ProgressDialogShow2(\"درحال اتصال...\", False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("درحال اتصال..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="socket1.Connect(\"192.168.4.1\", 8888, 5000)";
_socket1.Connect(processBA,"192.168.4.1",(int) (8888),(int) (5000));
 };
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="End Sub";
return "";
}
public static boolean  _socket1_connected(boolean _connected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "socket1_connected", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "socket1_connected", new Object[] {_connected}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Socket1_Connected(Connected As Boolean)As Bool";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If Connected = True Then";
if (_connected==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="ToastMessageShow(\"ارتباط برقرار شد\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ارتباط برقرار شد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="astreams.Initialize(socket1.InputStream, socket1";
_astreams.Initialize(processBA,_socket1.getInputStream(),_socket1.getOutputStream(),"AStreams");
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="viber.Vibrate(50)";
_viber.Vibrate(processBA,(long) (50));
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="connectWIFI(setconnect1)";
_connectwifi(mostCurrent._setconnect1);
 }else {
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مشکلی رخ داده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="disconnectWIFI(setconnect1)";
_disconnectwifi(mostCurrent._setconnect1);
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="viber.Vibrate(500)";
_viber.Vibrate(processBA,(long) (500));
 };
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="End Sub";
return false;
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timer1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timer1_tick", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub timer1_tick";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Try";
try {RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="pill_naim1 = File.ReadString(File.DirInternal, \"p";
_pill_naim1 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim1.txt");
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Label18.Text=(pill_naim1)";
mostCurrent._label18.setText(BA.ObjectToCharSequence((_pill_naim1)));
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="pill_naim2 = File.ReadString(File.DirInternal, \"p";
_pill_naim2 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim2.txt");
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="Label19.Text=(pill_naim2)";
mostCurrent._label19.setText(BA.ObjectToCharSequence((_pill_naim2)));
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="pill_naim3 = File.ReadString(File.DirInternal, \"p";
_pill_naim3 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim3.txt");
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Label20.Text=(pill_naim3)";
mostCurrent._label20.setText(BA.ObjectToCharSequence((_pill_naim3)));
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="pill_naim4 = File.ReadString(File.DirInternal, \"p";
_pill_naim4 = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim4.txt");
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="Label21.Text=(pill_naim4)";
mostCurrent._label21.setText(BA.ObjectToCharSequence((_pill_naim4)));
 } 
       catch (Exception e11) {
			processBA.setLastException(e11); };
RDebugUtils.currentLine=1769492;
 //BA.debugLineNum = 1769492;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill1.png\"";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Imagepill1.png")) { 
RDebugUtils.currentLine=1769494;
 //BA.debugLineNum = 1769494;BA.debugLine="Imagepill1.Bitmap = LoadBitmap(File.DirInternal,";
mostCurrent._imagepill1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Imagepill1.png").getObject()));
 }else {
 };
RDebugUtils.currentLine=1769500;
 //BA.debugLineNum = 1769500;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill2.png\"";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Imagepill2.png")) { 
RDebugUtils.currentLine=1769502;
 //BA.debugLineNum = 1769502;BA.debugLine="Imagepill2.Bitmap = LoadBitmap(File.DirInternal,";
mostCurrent._imagepill2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Imagepill2.png").getObject()));
 }else {
 };
RDebugUtils.currentLine=1769508;
 //BA.debugLineNum = 1769508;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill3.png\"";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Imagepill3.png")) { 
RDebugUtils.currentLine=1769510;
 //BA.debugLineNum = 1769510;BA.debugLine="Imagepill3.Bitmap = LoadBitmap(File.DirInternal,";
mostCurrent._imagepill3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Imagepill3.png").getObject()));
 }else {
 };
RDebugUtils.currentLine=1769516;
 //BA.debugLineNum = 1769516;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill4.png\"";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Imagepill4.png")) { 
RDebugUtils.currentLine=1769518;
 //BA.debugLineNum = 1769518;BA.debugLine="Imagepill4.Bitmap = LoadBitmap(File.DirInternal,";
mostCurrent._imagepill4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Imagepill4.png").getObject()));
 }else {
 };
RDebugUtils.currentLine=1769523;
 //BA.debugLineNum = 1769523;BA.debugLine="End Sub";
return "";
}
}
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

public class pill_3 extends Activity implements B4AActivity{
	public static pill_3 mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "Pill_Box.v1", "Pill_Box.v1.pill_3");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (pill_3).");
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
		activityBA = new BA(this, layout, processBA, "Pill_Box.v1", "Pill_Box.v1.pill_3");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "Pill_Box.v1.pill_3", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (pill_3) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (pill_3) Resume **");
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
		return pill_3.class;
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
            BA.LogInfo("** Activity (pill_3) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (pill_3) Pause event (activity is not paused). **");
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
            pill_3 mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (pill_3) Resume **");
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
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext3 = null;
public anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper _autocompleteedittext1 = null;
public static String _etext1 = "";
public static String _etext2 = "";
public static String _etext3 = "";
public static String _etext4 = "";
public static boolean _etext1_flag1 = false;
public static boolean _etext2_flag2 = false;
public static boolean _etext3_flag3 = false;
public static boolean _etext4_flag4 = false;
public static boolean _togelebutton_flge = false;
public static String _data_count = "";
public static String _data_starttime = "";
public static String _data_interval = "";
public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _togglebutton = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public b4a.example.dateutils _dateutils = null;
public Pill_Box.v1.main _main = null;
public Pill_Box.v1.pill_1 _pill_1 = null;
public Pill_Box.v1.pill_2 _pill_2 = null;
public Pill_Box.v1.pill_4 _pill_4 = null;
public Pill_Box.v1.starter _starter = null;
public Pill_Box.v1.naseri_func _naseri_func = null;
public Pill_Box.v1.imgview _imgview = null;
public Pill_Box.v1.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="pill_3";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _newimage = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Activity.LoadLayout(\"pill_3\")";
mostCurrent._activity.LoadLayout("pill_3",mostCurrent.activityBA);
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill3.png\"";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Imagepill3.png")) { 
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirInternal,";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Imagepill3.png").getObject()));
 }else {
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="ToastMessageShow(\"No image found.\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No image found."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="Try";
try {RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="Log(\"try\")";
anywheresoftware.b4a.keywords.Common.LogImpl("53866637","try",0);
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="ToggleButton.Checked= File.ReadString(File.DirIn";
mostCurrent._togglebutton.setChecked(BA.ObjectToBoolean(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"toogle_en.txt")));
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="Dim newImage As Bitmap";
_newimage = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=3866641;
 //BA.debugLineNum = 3866641;BA.debugLine="If ToggleButton.Checked=True Then";
if (mostCurrent._togglebutton.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3866642;
 //BA.debugLineNum = 3866642;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.";
_newimage.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"switch-on.png");
 }else {
RDebugUtils.currentLine=3866645;
 //BA.debugLineNum = 3866645;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off";
_newimage.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"switch-off.png");
 };
RDebugUtils.currentLine=3866647;
 //BA.debugLineNum = 3866647;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
mostCurrent._togglebutton.SetBackgroundImageNew((android.graphics.Bitmap)(_newimage.getObject()));
RDebugUtils.currentLine=3866648;
 //BA.debugLineNum = 3866648;BA.debugLine="EditText1.Text = File.ReadString(File.DirInterna";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim3.txt")));
RDebugUtils.currentLine=3866649;
 //BA.debugLineNum = 3866649;BA.debugLine="EditText2.Text = File.ReadString(File.DirInterna";
mostCurrent._edittext2.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box3.txt")));
RDebugUtils.currentLine=3866650;
 //BA.debugLineNum = 3866650;BA.debugLine="EditText3.Text = File.ReadString(File.DirInterna";
mostCurrent._edittext3.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_3.txt")));
RDebugUtils.currentLine=3866651;
 //BA.debugLineNum = 3866651;BA.debugLine="AutoCompleteEditText1.Text = File.ReadString(Fil";
mostCurrent._autocompleteedittext1.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_3.txt")));
 } 
       catch (Exception e22) {
			processBA.setLastException(e22); };
RDebugUtils.currentLine=3866661;
 //BA.debugLineNum = 3866661;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="pill_3";
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="pill_3";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return "";
}
public static String  _autocompleteedittext1_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="pill_3";
if (Debug.shouldDelegate(mostCurrent.activityBA, "autocompleteedittext1_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "autocompleteedittext1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub AutoCompleteEditText1_TextChanged (Old";
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="etext4 = New";
mostCurrent._etext4 = _new;
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="etext4_flag4=True";
_etext4_flag4 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="pill_3";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button1_click", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="File.WriteString(File.DirInternal, \"toogle_en.txt";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"toogle_en.txt",BA.ObjectToString(mostCurrent._togglebutton.getChecked()));
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="If(etext1_flag1=True ) Then'اگر متن etext1 تغییر";
if ((_etext1_flag1==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="File.WriteString(File.DirInternal, \"pill_naim3.t";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_naim3.txt",mostCurrent._etext1);
 };
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="If(etext2_flag2=True ) Then'اگر متن etext2 تغییر";
if ((_etext2_flag2==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_b";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box3.txt",mostCurrent._etext2);
 };
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="If(etext3_flag3=True ) Then'اگر متن etext3 تغییر";
if ((_etext3_flag3==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="File.WriteString(File.DirInternal, \"start_time_3";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_3.txt",mostCurrent._etext3);
 };
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="If(etext4_flag4=True ) Then'اگر متن etext4 تغییر";
if ((_etext4_flag4==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=4063249;
 //BA.debugLineNum = 4063249;BA.debugLine="File.WriteString(File.DirInternal, \"interval_3.t";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_3.txt",mostCurrent._etext4);
 };
RDebugUtils.currentLine=4063252;
 //BA.debugLineNum = 4063252;BA.debugLine="If (ToggleButton.Checked) Then";
if ((mostCurrent._togglebutton.getChecked())) { 
RDebugUtils.currentLine=4063254;
 //BA.debugLineNum = 4063254;BA.debugLine="Main.astreams.Write(\"p3s\".GetBytes(\"UTF8\"))";
mostCurrent._main._astreams /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Write("p3s".getBytes("UTF8"));
RDebugUtils.currentLine=4063255;
 //BA.debugLineNum = 4063255;BA.debugLine="If ToggleButton.Checked=True Then";
if (mostCurrent._togglebutton.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=4063256;
 //BA.debugLineNum = 4063256;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"1\"";
mostCurrent._main._astreams /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Write(mostCurrent._naseri_func._string2byte /*byte[]*/ (mostCurrent.activityBA,"1"));
 }else {
RDebugUtils.currentLine=4063258;
 //BA.debugLineNum = 4063258;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"0\"";
mostCurrent._main._astreams /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Write(mostCurrent._naseri_func._string2byte /*byte[]*/ (mostCurrent.activityBA,"0"));
 };
RDebugUtils.currentLine=4063261;
 //BA.debugLineNum = 4063261;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
mostCurrent._main._astreams /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Write(mostCurrent._naseri_func._string2byte /*byte[]*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"pill_count_box3.txt")));
RDebugUtils.currentLine=4063262;
 //BA.debugLineNum = 4063262;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
mostCurrent._main._astreams /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Write(mostCurrent._naseri_func._string2byte /*byte[]*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"start_time_3.txt")));
RDebugUtils.currentLine=4063263;
 //BA.debugLineNum = 4063263;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
mostCurrent._main._astreams /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Write(mostCurrent._naseri_func._string2byte /*byte[]*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"interval_3.txt")));
RDebugUtils.currentLine=4063264;
 //BA.debugLineNum = 4063264;BA.debugLine="Main.astreams.Write(\"p3e\".GetBytes(\"UTF8\"))";
mostCurrent._main._astreams /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Write("p3e".getBytes("UTF8"));
RDebugUtils.currentLine=4063267;
 //BA.debugLineNum = 4063267;BA.debugLine="Log(ToggleButton.Checked & data_count & data_sta";
anywheresoftware.b4a.keywords.Common.LogImpl("54063267",BA.ObjectToString(mostCurrent._togglebutton.getChecked())+mostCurrent._data_count+mostCurrent._data_starttime+mostCurrent._data_interval,0);
 };
RDebugUtils.currentLine=4063270;
 //BA.debugLineNum = 4063270;BA.debugLine="StartActivity(\"Main\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("Main"));
RDebugUtils.currentLine=4063271;
 //BA.debugLineNum = 4063271;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4063273;
 //BA.debugLineNum = 4063273;BA.debugLine="End Sub";
return "";
}
public static String  _edittext1_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="pill_3";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittext1_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittext1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="etext1 = New";
mostCurrent._etext1 = _new;
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="etext1_flag1=True";
_etext1_flag1 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="End Sub";
return "";
}
public static String  _edittext2_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="pill_3";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittext2_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittext2_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub EditText2_TextChanged (Old As String,";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="etext2 = New";
mostCurrent._etext2 = _new;
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="etext2_flag2=True";
_etext2_flag2 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="End Sub";
return "";
}
public static String  _edittext3_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="pill_3";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittext3_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittext3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="etext3 = New";
mostCurrent._etext3 = _new;
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="etext3_flag3=True";
_etext3_flag3 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="End Sub";
return "";
}
public static String  _fc_result(boolean _success,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="pill_3";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fc_result", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "fc_result", new Object[] {_success,_dir,_filename}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub fc_Result(Success As Boolean, Dir As String, F";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="bmp = LoadBitmap(Dir, FileName)";
_bmp = anywheresoftware.b4a.keywords.Common.LoadBitmap(_dir,_filename);
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="ImageView1.Bitmap = bmp";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="File.Copy(Dir, FileName, File.DirInternal, \"Imag";
anywheresoftware.b4a.keywords.Common.File.Copy(_dir,_filename,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Imagepill3.png");
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="ToastMessageShow(\"Image saved successfully!\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Image saved successfully!"),anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="ToastMessageShow(\"Failed to choose an image.\", F";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Failed to choose an image."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="End Sub";
return "";
}
public static String  _imageview1_longclick() throws Exception{
RDebugUtils.currentModule="pill_3";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imageview1_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imageview1_longclick", null));}
anywheresoftware.b4a.phone.Phone.ContentChooser _fc = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub ImageView1_LongClick";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Dim fc As ContentChooser";
_fc = new anywheresoftware.b4a.phone.Phone.ContentChooser();
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="fc.Initialize(\"fc\")";
_fc.Initialize("fc");
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="fc.Show(\"image/*\", \"Select Image\")";
_fc.Show(processBA,"image/*","Select Image");
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="End Sub";
return "";
}
public static String  _togglebutton_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="pill_3";
if (Debug.shouldDelegate(mostCurrent.activityBA, "togglebutton_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "togglebutton_checkedchange", new Object[] {_checked}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _newimage = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Private Sub ToggleButton_CheckedChange(Checked As";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim newImage As Bitmap";
_newimage = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="If Checked=True Then";
if (_checked==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.p";
_newimage.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"switch-on.png");
 }else {
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off.";
_newimage.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"switch-off.png");
 };
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
mostCurrent._togglebutton.SetBackgroundImageNew((android.graphics.Bitmap)(_newimage.getObject()));
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="End Sub";
return "";
}
}
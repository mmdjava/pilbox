package game.control;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _about_clik() throws Exception{
try {
		Debug.PushSubsStack("about_clik (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,93);
if (RapidSub.canDelegate("about_clik")) { return game.control.main.remoteMe.runUserSub(false, "main","about_clik");}
 BA.debugLineNum = 93;BA.debugLine="Sub about_clik";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="StartActivity(\"about\")";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("about"))));
 BA.debugLineNum = 96;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return game.control.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="Activity.AddMenuItem(\"صفحه اصلی\", \"Layout\")";
Debug.ShouldStop(2);
main.mostCurrent._activity.runVoidMethod ("AddMenuItem",(Object)(BA.ObjectToCharSequence("صفحه اصلی")),(Object)(RemoteObject.createImmutable("Layout")));
 BA.debugLineNum = 35;BA.debugLine="Activity.AddMenuItem(\"تنظیمات\", \"settings\")";
Debug.ShouldStop(4);
main.mostCurrent._activity.runVoidMethod ("AddMenuItem",(Object)(BA.ObjectToCharSequence("تنظیمات")),(Object)(RemoteObject.createImmutable("settings")));
 BA.debugLineNum = 36;BA.debugLine="Activity.AddMenuItem(\"درباره ما\", \"about\")";
Debug.ShouldStop(8);
main.mostCurrent._activity.runVoidMethod ("AddMenuItem",(Object)(BA.ObjectToCharSequence("درباره ما")),(Object)(RemoteObject.createImmutable("about")));
 BA.debugLineNum = 37;BA.debugLine="Activity.AddMenuItem(\"تماس با ما\", \"call\")";
Debug.ShouldStop(16);
main.mostCurrent._activity.runVoidMethod ("AddMenuItem",(Object)(BA.ObjectToCharSequence("تماس با ما")),(Object)(RemoteObject.createImmutable("call")));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,46);
if (RapidSub.canDelegate("activity_pause")) { return game.control.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,42);
if (RapidSub.canDelegate("activity_resume")) { return game.control.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_b_click() throws Exception{
try {
		Debug.PushSubsStack("btn_B_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
if (RapidSub.canDelegate("btn_b_click")) { return game.control.main.remoteMe.runUserSub(false, "main","btn_b_click");}
 BA.debugLineNum = 64;BA.debugLine="Private Sub btn_B_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="Vibrate.Vibrate(500)";
Debug.ShouldStop(2);
main.mostCurrent._vibrate.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 500)));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_f_click() throws Exception{
try {
		Debug.PushSubsStack("btn_F_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("btn_f_click")) { return game.control.main.remoteMe.runUserSub(false, "main","btn_f_click");}
 BA.debugLineNum = 52;BA.debugLine="Private Sub btn_F_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="Vibrate.Vibrate(500)";
Debug.ShouldStop(2097152);
main.mostCurrent._vibrate.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 500)));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_l_click() throws Exception{
try {
		Debug.PushSubsStack("btn_L_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,58);
if (RapidSub.canDelegate("btn_l_click")) { return game.control.main.remoteMe.runUserSub(false, "main","btn_l_click");}
 BA.debugLineNum = 58;BA.debugLine="Private Sub btn_L_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="Vibrate.Vibrate(500)";
Debug.ShouldStop(134217728);
main.mostCurrent._vibrate.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 500)));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_r_click() throws Exception{
try {
		Debug.PushSubsStack("btn_R_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("btn_r_click")) { return game.control.main.remoteMe.runUserSub(false, "main","btn_r_click");}
 BA.debugLineNum = 70;BA.debugLine="Private Sub btn_R_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="Vibrate.Vibrate(500)";
Debug.ShouldStop(128);
main.mostCurrent._vibrate.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 500)));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,76);
if (RapidSub.canDelegate("button1_click")) { return game.control.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 76;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="Vibrate.Vibrate(500)";
Debug.ShouldStop(8192);
main.mostCurrent._vibrate.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 500)));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _call_clik() throws Exception{
try {
		Debug.PushSubsStack("call_clik (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,100);
if (RapidSub.canDelegate("call_clik")) { return game.control.main.remoteMe.runUserSub(false, "main","call_clik");}
 BA.debugLineNum = 100;BA.debugLine="Sub call_clik";
Debug.ShouldStop(8);
 BA.debugLineNum = 102;BA.debugLine="StartActivity(\"call\")";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("call"))));
 BA.debugLineNum = 103;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private btn_R As Button";
main.mostCurrent._btn_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private btn_B As Button";
main.mostCurrent._btn_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btn_L As Button";
main.mostCurrent._btn_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btn_F As Button";
main.mostCurrent._btn_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim Vibrate As PhoneVibrate";
main.mostCurrent._vibrate = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneVibrate");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _layout_clik() throws Exception{
try {
		Debug.PushSubsStack("Layout_clik (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,82);
if (RapidSub.canDelegate("layout_clik")) { return game.control.main.remoteMe.runUserSub(false, "main","layout_clik");}
 BA.debugLineNum = 82;BA.debugLine="Sub Layout_clik";
Debug.ShouldStop(131072);
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
settings_subs_0._process_globals();
about_subs_0._process_globals();
call_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("game.control.main");
settings.myClass = BA.getDeviceClass ("game.control.settings");
about.myClass = BA.getDeviceClass ("game.control.about");
call.myClass = BA.getDeviceClass ("game.control.call");
starter.myClass = BA.getDeviceClass ("game.control.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _settings_clik() throws Exception{
try {
		Debug.PushSubsStack("settings_clik (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,86);
if (RapidSub.canDelegate("settings_clik")) { return game.control.main.remoteMe.runUserSub(false, "main","settings_clik");}
 BA.debugLineNum = 86;BA.debugLine="Sub settings_clik";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="StartActivity(\"settings\")";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("settings"))));
 BA.debugLineNum = 89;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
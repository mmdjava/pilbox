package game.control;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class call_subs_0 {


public static RemoteObject  _about_clik() throws Exception{
try {
		Debug.PushSubsStack("about_clik (call) ","call",3,call.mostCurrent.activityBA,call.mostCurrent,51);
if (RapidSub.canDelegate("about_clik")) { return game.control.call.remoteMe.runUserSub(false, "call","about_clik");}
 BA.debugLineNum = 51;BA.debugLine="Sub about_clik";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="StartActivity(\"about\")";
Debug.ShouldStop(1048576);
call.mostCurrent.__c.runVoidMethod ("StartActivity",call.processBA,(Object)((RemoteObject.createImmutable("about"))));
 BA.debugLineNum = 54;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
call.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (call) ","call",3,call.mostCurrent.activityBA,call.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return game.control.call.remoteMe.runUserSub(false, "call","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"call\")";
Debug.ShouldStop(524288);
call.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("call")),call.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="Activity.AddMenuItem(\"صفحه اصلی\", \"Layout\")";
Debug.ShouldStop(2097152);
call.mostCurrent._activity.runVoidMethod ("AddMenuItem",(Object)(BA.ObjectToCharSequence("صفحه اصلی")),(Object)(RemoteObject.createImmutable("Layout")));
 BA.debugLineNum = 23;BA.debugLine="Activity.AddMenuItem(\"تنظیمات\", \"settings\")";
Debug.ShouldStop(4194304);
call.mostCurrent._activity.runVoidMethod ("AddMenuItem",(Object)(BA.ObjectToCharSequence("تنظیمات")),(Object)(RemoteObject.createImmutable("settings")));
 BA.debugLineNum = 24;BA.debugLine="Activity.AddMenuItem(\"درباره ما\", \"about\")";
Debug.ShouldStop(8388608);
call.mostCurrent._activity.runVoidMethod ("AddMenuItem",(Object)(BA.ObjectToCharSequence("درباره ما")),(Object)(RemoteObject.createImmutable("about")));
 BA.debugLineNum = 25;BA.debugLine="Activity.AddMenuItem(\"تماس با ما\", \"call\")";
Debug.ShouldStop(16777216);
call.mostCurrent._activity.runVoidMethod ("AddMenuItem",(Object)(BA.ObjectToCharSequence("تماس با ما")),(Object)(RemoteObject.createImmutable("call")));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (call) ","call",3,call.mostCurrent.activityBA,call.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return game.control.call.remoteMe.runUserSub(false, "call","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Activity_Resume (call) ","call",3,call.mostCurrent.activityBA,call.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { return game.control.call.remoteMe.runUserSub(false, "call","activity_resume");}
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("call_clik (call) ","call",3,call.mostCurrent.activityBA,call.mostCurrent,58);
if (RapidSub.canDelegate("call_clik")) { return game.control.call.remoteMe.runUserSub(false, "call","call_clik");}
 BA.debugLineNum = 58;BA.debugLine="Sub call_clik";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="StartActivity(\"call\")";
Debug.ShouldStop(134217728);
call.mostCurrent.__c.runVoidMethod ("StartActivity",call.processBA,(Object)((RemoteObject.createImmutable("call"))));
 BA.debugLineNum = 61;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
call.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _layout_clik() throws Exception{
try {
		Debug.PushSubsStack("Layout_clik (call) ","call",3,call.mostCurrent.activityBA,call.mostCurrent,40);
if (RapidSub.canDelegate("layout_clik")) { return game.control.call.remoteMe.runUserSub(false, "call","layout_clik");}
 BA.debugLineNum = 40;BA.debugLine="Sub Layout_clik";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _settings_clik() throws Exception{
try {
		Debug.PushSubsStack("settings_clik (call) ","call",3,call.mostCurrent.activityBA,call.mostCurrent,44);
if (RapidSub.canDelegate("settings_clik")) { return game.control.call.remoteMe.runUserSub(false, "call","settings_clik");}
 BA.debugLineNum = 44;BA.debugLine="Sub settings_clik";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="StartActivity(\"settings\")";
Debug.ShouldStop(8192);
call.mostCurrent.__c.runVoidMethod ("StartActivity",call.processBA,(Object)((RemoteObject.createImmutable("settings"))));
 BA.debugLineNum = 47;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
call.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pill_4_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"pill_4\")";
Debug.ShouldStop(1048576);
pill_4.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pill_4")),pill_4.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Pause (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,29);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,25);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","activity_resume");}
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,34);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","button1_click");}
 BA.debugLineNum = 34;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="StartActivity(\"main\")";
Debug.ShouldStop(8);
pill_4.mostCurrent.__c.runVoidMethod ("StartActivity",pill_4.processBA,(Object)((RemoteObject.createImmutable("main"))));
 BA.debugLineNum = 37;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
pill_4.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 16;BA.debugLine="Private Button1 As Button";
pill_4.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}
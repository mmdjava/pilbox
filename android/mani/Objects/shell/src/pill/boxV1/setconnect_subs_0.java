package pill.boxV1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class setconnect_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (setconnect) ","setconnect",5,setconnect.mostCurrent.activityBA,setconnect.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return pill.boxV1.setconnect.remoteMe.runUserSub(false, "setconnect","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"setconnect\")";
Debug.ShouldStop(1073741824);
setconnect.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("setconnect")),setconnect.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="Timer1.Initialize(\"Timer1\", 1000)";
Debug.ShouldStop(1);
setconnect.mostCurrent._timer1.runVoidMethod ("Initialize",setconnect.processBA,(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 34;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(2);
setconnect.mostCurrent._timer1.runMethod(true,"setEnabled",setconnect.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Pause (setconnect) ","setconnect",5,setconnect.mostCurrent.activityBA,setconnect.mostCurrent,42);
if (RapidSub.canDelegate("activity_pause")) { return pill.boxV1.setconnect.remoteMe.runUserSub(false, "setconnect","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (setconnect) ","setconnect",5,setconnect.mostCurrent.activityBA,setconnect.mostCurrent,38);
if (RapidSub.canDelegate("activity_resume")) { return pill.boxV1.setconnect.remoteMe.runUserSub(false, "setconnect","activity_resume");}
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
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
public static RemoteObject  _astreams_error() throws Exception{
try {
		Debug.PushSubsStack("AStreams_Error (setconnect) ","setconnect",5,setconnect.mostCurrent.activityBA,setconnect.mostCurrent,88);
if (RapidSub.canDelegate("astreams_error")) { return pill.boxV1.setconnect.remoteMe.runUserSub(false, "setconnect","astreams_error");}
 BA.debugLineNum = 88;BA.debugLine="Sub AStreams_Error";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Button_connect.Enabled = True";
Debug.ShouldStop(16777216);
setconnect.mostCurrent._button_connect.runMethod(true,"setEnabled",setconnect.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
Debug.ShouldStop(33554432);
setconnect.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مشکلی رخ داده است")),(Object)(setconnect.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 92;BA.debugLine="Button_connect.Text = \"اتصال\"";
Debug.ShouldStop(134217728);
setconnect.mostCurrent._button_connect.runMethod(true,"setText",BA.ObjectToCharSequence("اتصال"));
 BA.debugLineNum = 93;BA.debugLine="viber.Vibrate(1000)";
Debug.ShouldStop(268435456);
setconnect.mostCurrent._viber.runVoidMethod ("Vibrate",setconnect.processBA,(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 94;BA.debugLine="socket1.Close";
Debug.ShouldStop(536870912);
setconnect.mostCurrent._socket1.runVoidMethod ("Close");
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _astreams_newdata(RemoteObject _buffer) throws Exception{
try {
		Debug.PushSubsStack("AStreams_NewData (setconnect) ","setconnect",5,setconnect.mostCurrent.activityBA,setconnect.mostCurrent,100);
if (RapidSub.canDelegate("astreams_newdata")) { return pill.boxV1.setconnect.remoteMe.runUserSub(false, "setconnect","astreams_newdata", _buffer);}
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 100;BA.debugLine="Sub AStreams_NewData (Buffer() As Byte)";
Debug.ShouldStop(8);
 BA.debugLineNum = 103;BA.debugLine="input = BytesToString(Buffer, 0, Buffer.Length,";
Debug.ShouldStop(64);
setconnect._input = setconnect.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")),(Object)(RemoteObject.createImmutable("UTF-8")));
 BA.debugLineNum = 104;BA.debugLine="dataQueue.Add(input)";
Debug.ShouldStop(128);
setconnect._dataqueue.runVoidMethod ("Add",(Object)((setconnect._input)));
 BA.debugLineNum = 105;BA.debugLine="Log(\"Data added to custom queue: \" & input)";
Debug.ShouldStop(256);
setconnect.mostCurrent.__c.runVoidMethod ("LogImpl","34259845",RemoteObject.concat(RemoteObject.createImmutable("Data added to custom queue: "),setconnect._input),0);
 BA.debugLineNum = 109;BA.debugLine="Label1.Text =Label1.Text &   (input)";
Debug.ShouldStop(4096);
setconnect.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(setconnect.mostCurrent._label1.runMethod(true,"getText"),(setconnect._input))));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _back_click() throws Exception{
try {
		Debug.PushSubsStack("back_Click (setconnect) ","setconnect",5,setconnect.mostCurrent.activityBA,setconnect.mostCurrent,119);
if (RapidSub.canDelegate("back_click")) { return pill.boxV1.setconnect.remoteMe.runUserSub(false, "setconnect","back_click");}
 BA.debugLineNum = 119;BA.debugLine="Private Sub back_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 121;BA.debugLine="StartActivity(\"main\")";
Debug.ShouldStop(16777216);
setconnect.mostCurrent.__c.runVoidMethod ("StartActivity",setconnect.processBA,(Object)((RemoteObject.createImmutable("main"))));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button_connect_click() throws Exception{
try {
		Debug.PushSubsStack("Button_connect_Click (setconnect) ","setconnect",5,setconnect.mostCurrent.activityBA,setconnect.mostCurrent,46);
if (RapidSub.canDelegate("button_connect_click")) { return pill.boxV1.setconnect.remoteMe.runUserSub(false, "setconnect","button_connect_click");}
 BA.debugLineNum = 46;BA.debugLine="Private Sub Button_connect_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="ProgressDialogShow2(\"درحال اتصال...\",False)";
Debug.ShouldStop(16384);
setconnect.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",setconnect.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("درحال اتصال...")),(Object)(setconnect.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 48;BA.debugLine="socket1.Initialize(\"socket1\")";
Debug.ShouldStop(32768);
setconnect.mostCurrent._socket1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("socket1")));
 BA.debugLineNum = 49;BA.debugLine="socket1.Connect(\"192.168.4.1\",8888,5000)";
Debug.ShouldStop(65536);
setconnect.mostCurrent._socket1.runVoidMethod ("Connect",setconnect.processBA,(Object)(BA.ObjectToString("192.168.4.1")),(Object)(BA.numberCast(int.class, 8888)),(Object)(BA.numberCast(int.class, 5000)));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Button1_Click (setconnect) ","setconnect",5,setconnect.mostCurrent.activityBA,setconnect.mostCurrent,53);
if (RapidSub.canDelegate("button1_click")) { return pill.boxV1.setconnect.remoteMe.runUserSub(false, "setconnect","button1_click");}
 BA.debugLineNum = 53;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="astreams.Write(EditText1.Text.GetBytes(\"UTF8\"))";
Debug.ShouldStop(4194304);
setconnect._astreams.runVoidMethod ("Write",(Object)(setconnect.mostCurrent._edittext1.runMethod(true,"getText").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
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
public static RemoteObject  _edittext1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText1_TextChanged (setconnect) ","setconnect",5,setconnect.mostCurrent.activityBA,setconnect.mostCurrent,58);
if (RapidSub.canDelegate("edittext1_textchanged")) { return pill.boxV1.setconnect.remoteMe.runUserSub(false, "setconnect","edittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 58;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Dim viber As PhoneVibrate";
setconnect.mostCurrent._viber = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneVibrate");
 //BA.debugLineNum = 18;BA.debugLine="Dim count As Byte = 1";
setconnect._count = BA.numberCast(byte.class, 1);
 //BA.debugLineNum = 20;BA.debugLine="Dim socket1 As Socket";
setconnect.mostCurrent._socket1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Label1 As Label";
setconnect.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Button1 As Button";
setconnect.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EditText1 As EditText";
setconnect.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Button_connect As Button";
setconnect.mostCurrent._button_connect = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private back As Button";
setconnect.mostCurrent._back = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim Timer1 As Timer";
setconnect.mostCurrent._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim astreams As AsyncStreams";
setconnect._astreams = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
 //BA.debugLineNum = 10;BA.debugLine="Dim input As String";
setconnect._input = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim dataQueue As List";
setconnect._dataqueue = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 12;BA.debugLine="dataQueue.Initialize";
setconnect._dataqueue.runVoidMethod ("Initialize");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _socket1_connected(RemoteObject _connected) throws Exception{
try {
		Debug.PushSubsStack("Socket1_Connected (setconnect) ","setconnect",5,setconnect.mostCurrent.activityBA,setconnect.mostCurrent,64);
if (RapidSub.canDelegate("socket1_connected")) { return pill.boxV1.setconnect.remoteMe.runUserSub(false, "setconnect","socket1_connected", _connected);}
Debug.locals.put("Connected", _connected);
 BA.debugLineNum = 64;BA.debugLine="Sub Socket1_Connected(Connected As Boolean)As Bool";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="If Connected = True Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_connected,setconnect.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 67;BA.debugLine="ToastMessageShow(\"ارتباط برقرار شد\",True)";
Debug.ShouldStop(4);
setconnect.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ارتباط برقرار شد")),(Object)(setconnect.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 68;BA.debugLine="astreams.Initialize(socket1.InputStream, socket1";
Debug.ShouldStop(8);
setconnect._astreams.runVoidMethod ("Initialize",setconnect.processBA,(Object)(setconnect.mostCurrent._socket1.runMethod(false,"getInputStream")),(Object)(setconnect.mostCurrent._socket1.runMethod(false,"getOutputStream")),(Object)(RemoteObject.createImmutable("AStreams")));
 BA.debugLineNum = 69;BA.debugLine="viber.Vibrate(50)";
Debug.ShouldStop(16);
setconnect.mostCurrent._viber.runVoidMethod ("Vibrate",setconnect.processBA,(Object)(BA.numberCast(long.class, 50)));
 BA.debugLineNum = 70;BA.debugLine="Button_connect.Enabled =False";
Debug.ShouldStop(32);
setconnect.mostCurrent._button_connect.runMethod(true,"setEnabled",setconnect.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="Button_connect.Text = \"متصل شد\"";
Debug.ShouldStop(64);
setconnect.mostCurrent._button_connect.runMethod(true,"setText",BA.ObjectToCharSequence("متصل شد"));
 }else {
 BA.debugLineNum = 75;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
Debug.ShouldStop(1024);
setconnect.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مشکلی رخ داده است")),(Object)(setconnect.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 77;BA.debugLine="Button_connect.Text = \"اتصال\"";
Debug.ShouldStop(4096);
setconnect.mostCurrent._button_connect.runMethod(true,"setText",BA.ObjectToCharSequence("اتصال"));
 BA.debugLineNum = 78;BA.debugLine="viber.Vibrate(500)";
Debug.ShouldStop(8192);
setconnect.mostCurrent._viber.runVoidMethod ("Vibrate",setconnect.processBA,(Object)(BA.numberCast(long.class, 500)));
 };
 BA.debugLineNum = 81;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
setconnect.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (setconnect) ","setconnect",5,setconnect.mostCurrent.activityBA,setconnect.mostCurrent,127);
if (RapidSub.canDelegate("timer1_tick")) { return pill.boxV1.setconnect.remoteMe.runUserSub(false, "setconnect","timer1_tick");}
RemoteObject _data = RemoteObject.createImmutable("");
 BA.debugLineNum = 127;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 130;BA.debugLine="For Each data As String In dataQueue";
Debug.ShouldStop(2);
{
final RemoteObject group1 = setconnect._dataqueue;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_data = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("data", _data);
Debug.locals.put("data", _data);
 BA.debugLineNum = 132;BA.debugLine="Log(\"Processing: \" & data)";
Debug.ShouldStop(8);
setconnect.mostCurrent.__c.runVoidMethod ("LogImpl","35177349",RemoteObject.concat(RemoteObject.createImmutable("Processing: "),_data),0);
 BA.debugLineNum = 133;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_a";
Debug.ShouldStop(16);
setconnect.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(setconnect.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_arduino.txt")),(Object)(setconnect._input));
 }
}Debug.locals.put("data", _data);
;
 BA.debugLineNum = 135;BA.debugLine="dataQueue.Clear";
Debug.ShouldStop(64);
setconnect._dataqueue.runVoidMethod ("Clear");
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
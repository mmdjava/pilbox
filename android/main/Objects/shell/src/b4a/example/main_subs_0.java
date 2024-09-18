package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,138);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 138;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(1024);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 141;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(4096);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 143;BA.debugLine="If socket1.IsInitialized = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main._socket1.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 144;BA.debugLine="socket1.Initialize(\"socket1\")";
Debug.ShouldStop(32768);
main._socket1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("socket1")));
 BA.debugLineNum = 145;BA.debugLine="Log(\"سوکت مقداردهی شد\")";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8131079",RemoteObject.createImmutable("سوکت مقداردهی شد"),0);
 };
 };
 BA.debugLineNum = 149;BA.debugLine="disconnectWIFI(setconnect1)";
Debug.ShouldStop(1048576);
_disconnectwifi(main.mostCurrent._setconnect1);
 BA.debugLineNum = 152;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 154;BA.debugLine="pill_naim1 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(33554432);
main._pill_naim1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim1.txt")));
 BA.debugLineNum = 155;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
Debug.ShouldStop(67108864);
main._pill_count_box1 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box1.txt")))));
 BA.debugLineNum = 156;BA.debugLine="start_time_1 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(134217728);
main._start_time_1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_1.txt")));
 BA.debugLineNum = 157;BA.debugLine="interval_1 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(268435456);
main._interval_1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_1.txt")));
 BA.debugLineNum = 158;BA.debugLine="box1_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(536870912);
main._box1_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box1_alarm.txt")));
 BA.debugLineNum = 159;BA.debugLine="data1 = File.ReadString(File.DirInternal, \"pill_";
Debug.ShouldStop(1073741824);
main._data1 = BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_Data1.txt"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e17.toString()); };
 BA.debugLineNum = 167;BA.debugLine="Label18.Text=(pill_naim1)";
Debug.ShouldStop(64);
main.mostCurrent._label18.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim1)));
 BA.debugLineNum = 168;BA.debugLine="Label4.Text = (pill_count_box1&\"/\"&data1)";
Debug.ShouldStop(128);
main.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box1,RemoteObject.createImmutable("/"),main._data1))));
 BA.debugLineNum = 173;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 175;BA.debugLine="pill_naim2 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(16384);
main._pill_naim2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim2.txt")));
 BA.debugLineNum = 176;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
Debug.ShouldStop(32768);
main._pill_count_box2 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box2.txt")))));
 BA.debugLineNum = 177;BA.debugLine="start_time_2 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(65536);
main._start_time_2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_2.txt")));
 BA.debugLineNum = 178;BA.debugLine="interval_2 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(131072);
main._interval_2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_2.txt")));
 BA.debugLineNum = 179;BA.debugLine="box2_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(262144);
main._box2_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box2_alarm.txt")));
 BA.debugLineNum = 180;BA.debugLine="data2 = File.ReadString(File.DirInternal, \"pill_";
Debug.ShouldStop(524288);
main._data2 = BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_Data2.txt"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e28) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e28.toString()); };
 BA.debugLineNum = 188;BA.debugLine="Label19.Text=(pill_naim2)";
Debug.ShouldStop(134217728);
main.mostCurrent._label19.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim2)));
 BA.debugLineNum = 189;BA.debugLine="Label8.Text = (pill_count_box2&\"/\"&data2)";
Debug.ShouldStop(268435456);
main.mostCurrent._label8.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box2,RemoteObject.createImmutable("/"),main._data2))));
 BA.debugLineNum = 194;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 196;BA.debugLine="pill_naim3 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(8);
main._pill_naim3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim3.txt")));
 BA.debugLineNum = 197;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
Debug.ShouldStop(16);
main._pill_count_box3 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box3.txt")))));
 BA.debugLineNum = 198;BA.debugLine="start_time_3 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(32);
main._start_time_3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_3.txt")));
 BA.debugLineNum = 199;BA.debugLine="interval_3 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(64);
main._interval_3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_3.txt")));
 BA.debugLineNum = 200;BA.debugLine="box3_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(128);
main._box3_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box3_alarm.txt")));
 BA.debugLineNum = 201;BA.debugLine="data3 = File.ReadString(File.DirInternal, \"pill_";
Debug.ShouldStop(256);
main._data3 = BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_Data3.txt"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e39) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e39.toString()); };
 BA.debugLineNum = 210;BA.debugLine="Label20.Text=(pill_naim3)";
Debug.ShouldStop(131072);
main.mostCurrent._label20.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim3)));
 BA.debugLineNum = 211;BA.debugLine="Label13.Text = (pill_count_box3&\"/\"&data3)";
Debug.ShouldStop(262144);
main.mostCurrent._label13.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box3,RemoteObject.createImmutable("/"),main._data3))));
 BA.debugLineNum = 216;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 218;BA.debugLine="pill_naim4 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(33554432);
main._pill_naim4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim4.txt")));
 BA.debugLineNum = 219;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
Debug.ShouldStop(67108864);
main._pill_count_box4 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box4.txt")))));
 BA.debugLineNum = 220;BA.debugLine="start_time_4 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(134217728);
main._start_time_4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_4.txt")));
 BA.debugLineNum = 221;BA.debugLine="interval_4 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(268435456);
main._interval_4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_4.txt")));
 BA.debugLineNum = 222;BA.debugLine="box4_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(536870912);
main._box4_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box4_alarm.txt")));
 BA.debugLineNum = 223;BA.debugLine="data4 = File.ReadString(File.DirInternal, \"pill_";
Debug.ShouldStop(1073741824);
main._data4 = BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_Data4.txt"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e50) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e50.toString()); };
 BA.debugLineNum = 231;BA.debugLine="Label21.Text=(pill_naim4)";
Debug.ShouldStop(64);
main.mostCurrent._label21.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim4)));
 BA.debugLineNum = 232;BA.debugLine="Label17.Text = (pill_count_box4&\"/\"&data4)";
Debug.ShouldStop(128);
main.mostCurrent._label17.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box4,RemoteObject.createImmutable("/"),main._data4))));
 BA.debugLineNum = 236;BA.debugLine="Label4.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(2048);
main.mostCurrent._label4.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffffffff)));
 BA.debugLineNum = 237;BA.debugLine="Label4.TextSize = 25";
Debug.ShouldStop(4096);
main.mostCurrent._label4.runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 238;BA.debugLine="Label4.Text = \"!\"";
Debug.ShouldStop(8192);
main.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence("!"));
 BA.debugLineNum = 240;BA.debugLine="Label8.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(32768);
main.mostCurrent._label8.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffffffff)));
 BA.debugLineNum = 241;BA.debugLine="Label8.TextSize = 25";
Debug.ShouldStop(65536);
main.mostCurrent._label8.runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 242;BA.debugLine="Label8.Text = \"!\"";
Debug.ShouldStop(131072);
main.mostCurrent._label8.runMethod(true,"setText",BA.ObjectToCharSequence("!"));
 BA.debugLineNum = 244;BA.debugLine="Label13.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(524288);
main.mostCurrent._label13.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffffffff)));
 BA.debugLineNum = 245;BA.debugLine="Label13.TextSize = 25";
Debug.ShouldStop(1048576);
main.mostCurrent._label13.runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 246;BA.debugLine="Label13.Text = \"!\"";
Debug.ShouldStop(2097152);
main.mostCurrent._label13.runMethod(true,"setText",BA.ObjectToCharSequence("!"));
 BA.debugLineNum = 248;BA.debugLine="Label17.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(8388608);
main.mostCurrent._label17.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffffffff)));
 BA.debugLineNum = 249;BA.debugLine="Label17.TextSize = 25";
Debug.ShouldStop(16777216);
main.mostCurrent._label17.runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 250;BA.debugLine="Label17.Text = \"!\"";
Debug.ShouldStop(33554432);
main.mostCurrent._label17.runMethod(true,"setText",BA.ObjectToCharSequence("!"));
 BA.debugLineNum = 252;BA.debugLine="histori(Label11)";
Debug.ShouldStop(134217728);
_histori(main.mostCurrent._label11);
 BA.debugLineNum = 255;BA.debugLine="SetupEditLabel(Label2)";
Debug.ShouldStop(1073741824);
_setupeditlabel(main.mostCurrent._label2);
 BA.debugLineNum = 256;BA.debugLine="SetupEditLabel(Label5)";
Debug.ShouldStop(-2147483648);
_setupeditlabel(main.mostCurrent._label5);
 BA.debugLineNum = 257;BA.debugLine="SetupEditLabel(Label9)";
Debug.ShouldStop(1);
_setupeditlabel(main.mostCurrent._label9);
 BA.debugLineNum = 258;BA.debugLine="SetupEditLabel(Label14)";
Debug.ShouldStop(2);
_setupeditlabel(main.mostCurrent._label14);
 BA.debugLineNum = 261;BA.debugLine="Imagepill1.Bitmap = LoadBitmap(File.DirAssets, \"p";
Debug.ShouldStop(16);
main.mostCurrent._imagepill1.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pill.png"))).getObject()));
 BA.debugLineNum = 262;BA.debugLine="Imagepill2.Bitmap = LoadBitmap(File.DirAssets, \"p";
Debug.ShouldStop(32);
main.mostCurrent._imagepill2.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pill (1).png"))).getObject()));
 BA.debugLineNum = 263;BA.debugLine="Imagepill3.Bitmap = LoadBitmap(File.DirAssets, \"p";
Debug.ShouldStop(64);
main.mostCurrent._imagepill3.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pill (2).png"))).getObject()));
 BA.debugLineNum = 264;BA.debugLine="Imagepill4.Bitmap = LoadBitmap(File.DirAssets, \"p";
Debug.ShouldStop(128);
main.mostCurrent._imagepill4.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pill (4).png"))).getObject()));
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,301);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 301;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4096);
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("AStreams_Error (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,412);
if (RapidSub.canDelegate("astreams_error")) { return b4a.example.main.remoteMe.runUserSub(false, "main","astreams_error");}
 BA.debugLineNum = 412;BA.debugLine="Sub AStreams_Error";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 414;BA.debugLine="setconnect1.Enabled = True";
Debug.ShouldStop(536870912);
main.mostCurrent._setconnect1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 415;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مشکلی رخ داده است")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 416;BA.debugLine="disconnectWIFI(setconnect1)";
Debug.ShouldStop(-2147483648);
_disconnectwifi(main.mostCurrent._setconnect1);
 BA.debugLineNum = 417;BA.debugLine="viber.Vibrate(1000)";
Debug.ShouldStop(1);
main._viber.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 418;BA.debugLine="socket1.Close";
Debug.ShouldStop(2);
main._socket1.runVoidMethod ("Close");
 BA.debugLineNum = 420;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("AStreams_NewData (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,424);
if (RapidSub.canDelegate("astreams_newdata")) { return b4a.example.main.remoteMe.runUserSub(false, "main","astreams_newdata", _buffer);}
RemoteObject _mp = RemoteObject.declareNull("anywheresoftware.b4a.objects.MediaPlayerWrapper");
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 424;BA.debugLine="Sub AStreams_NewData (Buffer() As Byte)";
Debug.ShouldStop(128);
 BA.debugLineNum = 426;BA.debugLine="input = BytesToString(Buffer, 0, Buffer.Length, \"";
Debug.ShouldStop(512);
main._input = main.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")),(Object)(RemoteObject.createImmutable("UTF-8")));
 BA.debugLineNum = 431;BA.debugLine="Matcher = Regex.Matcher(pattern1, input)";
Debug.ShouldStop(16384);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern1),(Object)(main._input));
 BA.debugLineNum = 432;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(32768);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 433;BA.debugLine="data1 = Matcher.Group(1)";
Debug.ShouldStop(65536);
main._data1 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 437;BA.debugLine="Matcher = Regex.Matcher(pattern2, input)";
Debug.ShouldStop(1048576);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern2),(Object)(main._input));
 BA.debugLineNum = 438;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(2097152);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 439;BA.debugLine="data2 = Matcher.Group(1)";
Debug.ShouldStop(4194304);
main._data2 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 443;BA.debugLine="Matcher = Regex.Matcher(pattern3, input)";
Debug.ShouldStop(67108864);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern3),(Object)(main._input));
 BA.debugLineNum = 444;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(134217728);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 445;BA.debugLine="data3 = Matcher.Group(1)";
Debug.ShouldStop(268435456);
main._data3 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 449;BA.debugLine="Matcher = Regex.Matcher(pattern4, input)";
Debug.ShouldStop(1);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern4),(Object)(main._input));
 BA.debugLineNum = 450;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(2);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 451;BA.debugLine="data4 = Matcher.Group(1)";
Debug.ShouldStop(4);
main._data4 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 454;BA.debugLine="Matcher = Regex.Matcher(pattern5, input)";
Debug.ShouldStop(32);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern5),(Object)(main._input));
 BA.debugLineNum = 455;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(64);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 456;BA.debugLine="data5 = Matcher.Group(1)";
Debug.ShouldStop(128);
main._data5 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 460;BA.debugLine="Matcher = Regex.Matcher(pattern6, input)";
Debug.ShouldStop(2048);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern6),(Object)(main._input));
 BA.debugLineNum = 461;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(4096);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 462;BA.debugLine="data6 = Matcher.Group(1)";
Debug.ShouldStop(8192);
main._data6 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 466;BA.debugLine="Matcher = Regex.Matcher(pattern7, input)";
Debug.ShouldStop(131072);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern7),(Object)(main._input));
 BA.debugLineNum = 467;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(262144);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 468;BA.debugLine="data7 = Matcher.Group(1)";
Debug.ShouldStop(524288);
main._data7 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 472;BA.debugLine="Matcher = Regex.Matcher(pattern8, input)";
Debug.ShouldStop(8388608);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern8),(Object)(main._input));
 BA.debugLineNum = 473;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(16777216);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 474;BA.debugLine="data8 = Matcher.Group(1)";
Debug.ShouldStop(33554432);
main._data8 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 478;BA.debugLine="Matcher = Regex.Matcher(pattern9, input)";
Debug.ShouldStop(536870912);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern9),(Object)(main._input));
 BA.debugLineNum = 479;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(1073741824);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 480;BA.debugLine="data9 = Matcher.Group(1)";
Debug.ShouldStop(-2147483648);
main._data9 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 483;BA.debugLine="Log(data9)";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("LogImpl","81179707",BA.NumberToString(main._data9),0);
 BA.debugLineNum = 486;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 488;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
Debug.ShouldStop(128);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_Data1.txt")),(Object)(BA.NumberToString(main._data1)));
 BA.debugLineNum = 489;BA.debugLine="pill_count_box1 = File.ReadString(File.DirInterna";
Debug.ShouldStop(256);
main._pill_count_box1 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box1.txt")))));
 BA.debugLineNum = 491;BA.debugLine="Label4.Text = (pill_count_box1&\"/\"&data1)";
Debug.ShouldStop(1024);
main.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box1,RemoteObject.createImmutable("/"),main._data1))));
 BA.debugLineNum = 492;BA.debugLine="Label18.Text=(pill_naim1)";
Debug.ShouldStop(2048);
main.mostCurrent._label18.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim1)));
 BA.debugLineNum = 495;BA.debugLine="File.WriteString(File.DirInternal, \"box1_alarm.tx";
Debug.ShouldStop(16384);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("box1_alarm.txt")),(Object)(BA.NumberToString(main._data5)));
 BA.debugLineNum = 496;BA.debugLine="box1_alarm = File.ReadString(File.DirInternal, \"b";
Debug.ShouldStop(32768);
main._box1_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box1_alarm.txt")));
 BA.debugLineNum = 501;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_Data2.txt")),(Object)(BA.NumberToString(main._data2)));
 BA.debugLineNum = 502;BA.debugLine="pill_count_box2 = File.ReadString(File.DirInterna";
Debug.ShouldStop(2097152);
main._pill_count_box2 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box2.txt")))));
 BA.debugLineNum = 504;BA.debugLine="Label8.Text = (pill_count_box2&\"/\"&data2)";
Debug.ShouldStop(8388608);
main.mostCurrent._label8.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box2,RemoteObject.createImmutable("/"),main._data2))));
 BA.debugLineNum = 505;BA.debugLine="Label19.Text=(pill_naim2)";
Debug.ShouldStop(16777216);
main.mostCurrent._label19.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim2)));
 BA.debugLineNum = 507;BA.debugLine="File.WriteString(File.DirInternal, \"box2_alarm.tx";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("box2_alarm.txt")),(Object)(BA.NumberToString(main._data6)));
 BA.debugLineNum = 508;BA.debugLine="box2_alarm = File.ReadString(File.DirInternal, \"b";
Debug.ShouldStop(134217728);
main._box2_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box2_alarm.txt")));
 BA.debugLineNum = 513;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
Debug.ShouldStop(1);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_Data3.txt")),(Object)(BA.NumberToString(main._data3)));
 BA.debugLineNum = 514;BA.debugLine="pill_count_box3 = File.ReadString(File.DirInterna";
Debug.ShouldStop(2);
main._pill_count_box3 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box3.txt")))));
 BA.debugLineNum = 516;BA.debugLine="Label13.Text = (pill_count_box3&\"/\"&data3)";
Debug.ShouldStop(8);
main.mostCurrent._label13.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box3,RemoteObject.createImmutable("/"),main._data3))));
 BA.debugLineNum = 517;BA.debugLine="Label20.Text=(pill_naim3)";
Debug.ShouldStop(16);
main.mostCurrent._label20.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim3)));
 BA.debugLineNum = 519;BA.debugLine="File.WriteString(File.DirInternal, \"box3_alarm.tx";
Debug.ShouldStop(64);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("box3_alarm.txt")),(Object)(BA.NumberToString(main._data7)));
 BA.debugLineNum = 520;BA.debugLine="box3_alarm = File.ReadString(File.DirInternal, \"b";
Debug.ShouldStop(128);
main._box3_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box3_alarm.txt")));
 BA.debugLineNum = 525;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
Debug.ShouldStop(4096);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_Data4.txt")),(Object)(BA.NumberToString(main._data4)));
 BA.debugLineNum = 526;BA.debugLine="pill_count_box4 = File.ReadString(File.DirInterna";
Debug.ShouldStop(8192);
main._pill_count_box4 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box4.txt")))));
 BA.debugLineNum = 528;BA.debugLine="Label17.Text = (pill_count_box4&\"/\"&data4)";
Debug.ShouldStop(32768);
main.mostCurrent._label17.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box4,RemoteObject.createImmutable("/"),main._data4))));
 BA.debugLineNum = 529;BA.debugLine="Label21.Text=(pill_naim4)";
Debug.ShouldStop(65536);
main.mostCurrent._label21.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim4)));
 BA.debugLineNum = 531;BA.debugLine="File.WriteString(File.DirInternal, \"box4_alarm.tx";
Debug.ShouldStop(262144);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("box4_alarm.txt")),(Object)(BA.NumberToString(main._data8)));
 BA.debugLineNum = 532;BA.debugLine="box4_alarm = File.ReadString(File.DirInternal, \"b";
Debug.ShouldStop(524288);
main._box4_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box4_alarm.txt")));
 BA.debugLineNum = 537;BA.debugLine="If (data9==0) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",main._data9,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 539;BA.debugLine="Dim mp As MediaPlayer";
Debug.ShouldStop(67108864);
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MediaPlayerWrapper");Debug.locals.put("mp", _mp);
 BA.debugLineNum = 540;BA.debugLine="mp.Initialize()";
Debug.ShouldStop(134217728);
_mp.runVoidMethod ("Initialize");
 BA.debugLineNum = 541;BA.debugLine="mp.Load(File.DirAssets, \"alarm.mp3\") 'فایلی که";
Debug.ShouldStop(268435456);
_mp.runVoidMethod ("Load",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("alarm.mp3")));
 BA.debugLineNum = 542;BA.debugLine="mp.Play";
Debug.ShouldStop(536870912);
_mp.runVoidMethod ("Play");
 BA.debugLineNum = 543;BA.debugLine="data9 = 1";
Debug.ShouldStop(1073741824);
main._data9 = BA.numberCast(int.class, 1);
 BA.debugLineNum = 545;BA.debugLine="Msgbox(\"بیمار قرص را مصرف نکرد\", \"توجه\")";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("بیمار قرص را مصرف نکرد")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("توجه"))),main.mostCurrent.activityBA);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e73) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e73.toString()); };
 BA.debugLineNum = 553;BA.debugLine="Label1.Width = 280dip ' تغییر عرض به مقدار دلخواه";
Debug.ShouldStop(256);
main.mostCurrent._label1.runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280))));
 BA.debugLineNum = 554;BA.debugLine="Label1.Height = 40dip ' تغییر ارتفاع به مقدار دلخ";
Debug.ShouldStop(512);
main.mostCurrent._label1.runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 555;BA.debugLine="Label7.Width = 280dip";
Debug.ShouldStop(1024);
main.mostCurrent._label7.runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280))));
 BA.debugLineNum = 556;BA.debugLine="Label7.Height = 40dip";
Debug.ShouldStop(2048);
main.mostCurrent._label7.runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 557;BA.debugLine="Label12.Width = 280dip";
Debug.ShouldStop(4096);
main.mostCurrent._label12.runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280))));
 BA.debugLineNum = 558;BA.debugLine="Label12.Height = 40dip";
Debug.ShouldStop(8192);
main.mostCurrent._label12.runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 559;BA.debugLine="Label16.Width = 280dip";
Debug.ShouldStop(16384);
main.mostCurrent._label16.runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280))));
 BA.debugLineNum = 560;BA.debugLine="Label16.Height = 40dip";
Debug.ShouldStop(32768);
main.mostCurrent._label16.runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 563;BA.debugLine="SetupProgressBar(Label1, 0xFF5DD700 , 50)";
Debug.ShouldStop(262144);
_setupprogressbar(main.mostCurrent._label1,BA.numberCast(int.class, ((int)0xff5dd700)),BA.numberCast(int.class, 50));
 BA.debugLineNum = 564;BA.debugLine="SetupProgressBar(Label7, 0xFF5DD700 , 50)";
Debug.ShouldStop(524288);
_setupprogressbar(main.mostCurrent._label7,BA.numberCast(int.class, ((int)0xff5dd700)),BA.numberCast(int.class, 50));
 BA.debugLineNum = 565;BA.debugLine="SetupProgressBar(Label12, 0xFF5DD700 , 50)";
Debug.ShouldStop(1048576);
_setupprogressbar(main.mostCurrent._label12,BA.numberCast(int.class, ((int)0xff5dd700)),BA.numberCast(int.class, 50));
 BA.debugLineNum = 566;BA.debugLine="SetupProgressBar(Label16, 0xFF5DD700 , 50)";
Debug.ShouldStop(2097152);
_setupprogressbar(main.mostCurrent._label16,BA.numberCast(int.class, ((int)0xff5dd700)),BA.numberCast(int.class, 50));
 BA.debugLineNum = 568;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 570;BA.debugLine="label_size1 = ( 100 / pill_count_box1 )* data1";
Debug.ShouldStop(33554432);
main._label_size1 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),main._pill_count_box1}, "/",0, 0)),main._data1}, "*",0, 0));
 BA.debugLineNum = 571;BA.debugLine="label_size2 = ( 100 / pill_count_box2 )* data2";
Debug.ShouldStop(67108864);
main._label_size2 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),main._pill_count_box2}, "/",0, 0)),main._data2}, "*",0, 0));
 BA.debugLineNum = 572;BA.debugLine="label_size3 = ( 100 / pill_count_box3 )* data3";
Debug.ShouldStop(134217728);
main._label_size3 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),main._pill_count_box3}, "/",0, 0)),main._data3}, "*",0, 0));
 BA.debugLineNum = 573;BA.debugLine="label_size4 = ( 100 / pill_count_box4 )* data4";
Debug.ShouldStop(268435456);
main._label_size4 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),main._pill_count_box4}, "/",0, 0)),main._data4}, "*",0, 0));
 BA.debugLineNum = 576;BA.debugLine="UpdateProgressBar(Label1,label_size1)";
Debug.ShouldStop(-2147483648);
_updateprogressbar(main.mostCurrent._label1,main._label_size1);
 BA.debugLineNum = 577;BA.debugLine="UpdateProgressBar(Label7,label_size2)";
Debug.ShouldStop(1);
_updateprogressbar(main.mostCurrent._label7,main._label_size2);
 BA.debugLineNum = 578;BA.debugLine="UpdateProgressBar(Label12,label_size3)";
Debug.ShouldStop(2);
_updateprogressbar(main.mostCurrent._label12,main._label_size3);
 BA.debugLineNum = 579;BA.debugLine="UpdateProgressBar(Label16,label_size4)";
Debug.ShouldStop(4);
_updateprogressbar(main.mostCurrent._label16,main._label_size4);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e96) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e96.toString()); };
 BA.debugLineNum = 584;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _connectwifi(RemoteObject _btn) throws Exception{
try {
		Debug.PushSubsStack("connectWIFI (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,305);
if (RapidSub.canDelegate("connectwifi")) { return b4a.example.main.remoteMe.runUserSub(false, "main","connectwifi", _btn);}
RemoteObject _gd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
Debug.locals.put("btn", _btn);
 BA.debugLineNum = 305;BA.debugLine="Sub connectWIFI(btn As Button)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 306;BA.debugLine="Dim gd As GradientDrawable";
Debug.ShouldStop(131072);
_gd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 307;BA.debugLine="gd.Initialize(\"LEFT_RIGHT\", Array As Int( 0x0022D";
Debug.ShouldStop(262144);
_gd.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"LEFT_RIGHT")),(Object)(RemoteObject.createNewArray("int",new int[] {3},new Object[] {BA.numberCast(int.class, ((int)0x0022d700)),BA.numberCast(int.class, ((int)0xff22d700)),BA.numberCast(int.class, ((int)0x0022d700))})));
 BA.debugLineNum = 308;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
Debug.ShouldStop(524288);
_gd.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 309;BA.debugLine="btn.Background = gd";
Debug.ShouldStop(1048576);
_btn.runMethod(false,"setBackground",(_gd.getObject()));
 BA.debugLineNum = 310;BA.debugLine="btn.Text = \"اتصال برقرار شد\"";
Debug.ShouldStop(2097152);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence("اتصال برقرار شد"));
 BA.debugLineNum = 311;BA.debugLine="btn.TextColor = Colors.White";
Debug.ShouldStop(4194304);
_btn.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 312;BA.debugLine="btn.TextSize = 18";
Debug.ShouldStop(8388608);
_btn.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disconnectsocket(RemoteObject _socket11) throws Exception{
try {
		Debug.PushSubsStack("disconnectSocket (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,587);
if (RapidSub.canDelegate("disconnectsocket")) { return b4a.example.main.remoteMe.runUserSub(false, "main","disconnectsocket", _socket11);}
Debug.locals.put("socket11", _socket11);
 BA.debugLineNum = 587;BA.debugLine="Sub disconnectSocket(socket11 As Socket)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 589;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 590;BA.debugLine="If socket11.Connected Then";
Debug.ShouldStop(8192);
if (_socket11.runMethod(true,"getConnected").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 591;BA.debugLine="socket11.Close ' بستن اتصال سوکت";
Debug.ShouldStop(16384);
_socket11.runVoidMethod ("Close");
 BA.debugLineNum = 592;BA.debugLine="astreams.Close ' بستن استریم‌ها";
Debug.ShouldStop(32768);
main._astreams.runVoidMethod ("Close");
 BA.debugLineNum = 593;BA.debugLine="Log(\"ارتباط قطع شد\")";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("LogImpl","81245190",RemoteObject.createImmutable("ارتباط قطع شد"),0);
 BA.debugLineNum = 594;BA.debugLine="disconnectWIFI(setconnect1)";
Debug.ShouldStop(131072);
_disconnectwifi(main.mostCurrent._setconnect1);
 BA.debugLineNum = 595;BA.debugLine="ToastMessageShow(\"ارتباط قطع شد\", True)";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ارتباط قطع شد")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 597;BA.debugLine="socket11.Initialize(\"socket1\")";
Debug.ShouldStop(1048576);
_socket11.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("socket1")));
 BA.debugLineNum = 598;BA.debugLine="setconnect1.Enabled = True ' فعال کردن دکمه اتصا";
Debug.ShouldStop(2097152);
main.mostCurrent._setconnect1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e12.toString()); BA.debugLineNum = 600;BA.debugLine="Log(\"خطا در قطع اتصال\")";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("LogImpl","81245197",RemoteObject.createImmutable("خطا در قطع اتصال"),0);
 };
 BA.debugLineNum = 603;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disconnectwifi(RemoteObject _btn) throws Exception{
try {
		Debug.PushSubsStack("disconnectWIFI (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,315);
if (RapidSub.canDelegate("disconnectwifi")) { return b4a.example.main.remoteMe.runUserSub(false, "main","disconnectwifi", _btn);}
RemoteObject _gd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
Debug.locals.put("btn", _btn);
 BA.debugLineNum = 315;BA.debugLine="Sub disconnectWIFI(btn As Button)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 316;BA.debugLine="Dim gd As GradientDrawable";
Debug.ShouldStop(134217728);
_gd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 317;BA.debugLine="gd.Initialize(\"LEFT_RIGHT\", Array As Int( 0x0022D";
Debug.ShouldStop(268435456);
_gd.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"LEFT_RIGHT")),(Object)(RemoteObject.createNewArray("int",new int[] {3},new Object[] {BA.numberCast(int.class, ((int)0x0022d700)),BA.numberCast(int.class, ((int)0xffd7000a)),BA.numberCast(int.class, ((int)0x0022d700))})));
 BA.debugLineNum = 318;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
Debug.ShouldStop(536870912);
_gd.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 319;BA.debugLine="btn.Background = gd";
Debug.ShouldStop(1073741824);
_btn.runMethod(false,"setBackground",(_gd.getObject()));
 BA.debugLineNum = 320;BA.debugLine="btn.Text = \"برای اتصال کلیک کنید\"";
Debug.ShouldStop(-2147483648);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence("برای اتصال کلیک کنید"));
 BA.debugLineNum = 321;BA.debugLine="btn.TextColor = Colors.White";
Debug.ShouldStop(1);
_btn.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 322;BA.debugLine="btn.TextSize = 18";
Debug.ShouldStop(2);
_btn.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 60;BA.debugLine="Private Label17 As Label";
main.mostCurrent._label17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private Panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private Label2 As Label";
main.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private Label3 As Label";
main.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private Label4 As Label";
main.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private Label11 As Label";
main.mostCurrent._label11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private Panel5 As Panel";
main.mostCurrent._panel5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private ListView1 As ListView";
main.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private Panel2 As Panel";
main.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private Label5 As Label";
main.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private Label6 As Label";
main.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private Label7 As Label";
main.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private Label8 As Label";
main.mostCurrent._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private Panel3 As Panel";
main.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private Label9 As Label";
main.mostCurrent._label9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Private Label10 As Label";
main.mostCurrent._label10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private Label12 As Label";
main.mostCurrent._label12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private Label13 As Label";
main.mostCurrent._label13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private Panel4 As Panel";
main.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private Label14 As Label";
main.mostCurrent._label14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private Label15 As Label";
main.mostCurrent._label15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private Label16 As Label";
main.mostCurrent._label16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private Label18 As Label";
main.mostCurrent._label18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private Label19 As Label";
main.mostCurrent._label19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private Label21 As Label";
main.mostCurrent._label21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private Label20 As Label";
main.mostCurrent._label20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private Imagepill1 As ImageView";
main.mostCurrent._imagepill1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private Imagepill2 As ImageView";
main.mostCurrent._imagepill2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private Imagepill3 As ImageView";
main.mostCurrent._imagepill3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Private Imagepill4 As ImageView";
main.mostCurrent._imagepill4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private setconnect1 As Button";
main.mostCurrent._setconnect1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private pattern1 As String = \"p1cs(\\d+)p1ce\"  ' ب";
main.mostCurrent._pattern1 = BA.ObjectToString("p1cs(\\d+)p1ce");
 //BA.debugLineNum = 101;BA.debugLine="Private pattern2 As String = \"p2cs(\\d+)p2ce\"  ' ب";
main.mostCurrent._pattern2 = BA.ObjectToString("p2cs(\\d+)p2ce");
 //BA.debugLineNum = 102;BA.debugLine="Private pattern3 As String = \"p3cs(\\d+)p3ce\"  ' ب";
main.mostCurrent._pattern3 = BA.ObjectToString("p3cs(\\d+)p3ce");
 //BA.debugLineNum = 103;BA.debugLine="Private pattern4 As String = \"p4cs(\\d+)p4ce\"  ' ب";
main.mostCurrent._pattern4 = BA.ObjectToString("p4cs(\\d+)p4ce");
 //BA.debugLineNum = 105;BA.debugLine="Private pattern5 As String = \"p1ts(\\d+)p1te\"  ' ب";
main.mostCurrent._pattern5 = BA.ObjectToString("p1ts(\\d+)p1te");
 //BA.debugLineNum = 106;BA.debugLine="Private pattern6 As String = \"p2ts(\\d+)p2te\"  ' ب";
main.mostCurrent._pattern6 = BA.ObjectToString("p2ts(\\d+)p2te");
 //BA.debugLineNum = 107;BA.debugLine="Private pattern7 As String = \"p3ts(\\d+)p3te\"  ' ب";
main.mostCurrent._pattern7 = BA.ObjectToString("p3ts(\\d+)p3te");
 //BA.debugLineNum = 108;BA.debugLine="Private pattern8 As String = \"p4ts(\\d+)p4te\"  ' ب";
main.mostCurrent._pattern8 = BA.ObjectToString("p4ts(\\d+)p4te");
 //BA.debugLineNum = 110;BA.debugLine="Private pattern9 As String = \"als(\\d+)ale\"  ' برا";
main.mostCurrent._pattern9 = BA.ObjectToString("als(\\d+)ale");
 //BA.debugLineNum = 114;BA.debugLine="Private data1 As Int = 0";
main._data1 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 115;BA.debugLine="Private data2 As Int = 0";
main._data2 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 116;BA.debugLine="Private data3 As Int = 0";
main._data3 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 117;BA.debugLine="Private data4 As Int = 0";
main._data4 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 119;BA.debugLine="Private data5 As Int";
main._data5 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 120;BA.debugLine="Private data6 As Int";
main._data6 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 121;BA.debugLine="Private data7 As Int";
main._data7 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 122;BA.debugLine="Private data8 As Int";
main._data8 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 124;BA.debugLine="Private data9 As Int = 1";
main._data9 = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 128;BA.debugLine="Private Matcher As Matcher";
main.mostCurrent._matcher = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
 //BA.debugLineNum = 131;BA.debugLine="Dim label_size1 As Int";
main._label_size1 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 132;BA.debugLine="Dim label_size2 As Int";
main._label_size2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 133;BA.debugLine="Dim label_size3 As Int";
main._label_size3 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 134;BA.debugLine="Dim label_size4 As Int";
main._label_size4 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _histori(RemoteObject _lb) throws Exception{
try {
		Debug.PushSubsStack("histori (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,325);
if (RapidSub.canDelegate("histori")) { return b4a.example.main.remoteMe.runUserSub(false, "main","histori", _lb);}
RemoteObject _gd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
Debug.locals.put("lb", _lb);
 BA.debugLineNum = 325;BA.debugLine="Sub histori(lb As Label)";
Debug.ShouldStop(16);
 BA.debugLineNum = 326;BA.debugLine="Dim gd As GradientDrawable";
Debug.ShouldStop(32);
_gd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 327;BA.debugLine="gd.Initialize(\"TOP_BOTTOM\", Array As Int( 0x8BECD";
Debug.ShouldStop(64);
_gd.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(RemoteObject.createNewArray("int",new int[] {3},new Object[] {BA.numberCast(int.class, ((int)0x8becd1b2)),BA.numberCast(int.class, ((int)0x55ecd1b2)),BA.numberCast(int.class, ((int)0x1fecd1b2))})));
 BA.debugLineNum = 328;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
Debug.ShouldStop(128);
_gd.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 329;BA.debugLine="lb.Background = gd";
Debug.ShouldStop(256);
_lb.runMethod(false,"setBackground",(_gd.getObject()));
 BA.debugLineNum = 330;BA.debugLine="lb.Text = \"تاریخچه مصرف دارو\"";
Debug.ShouldStop(512);
_lb.runMethod(true,"setText",BA.ObjectToCharSequence("تاریخچه مصرف دارو"));
 BA.debugLineNum = 331;BA.debugLine="lb.TextColor = Colors.Black";
Debug.ShouldStop(1024);
_lb.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 332;BA.debugLine="lb.TextSize = 22";
Debug.ShouldStop(2048);
_lb.runMethod(true,"setTextSize",BA.numberCast(float.class, 22));
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label14_click() throws Exception{
try {
		Debug.PushSubsStack("Label14_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,382);
if (RapidSub.canDelegate("label14_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","label14_click");}
 BA.debugLineNum = 382;BA.debugLine="Private Sub Label14_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 384;BA.debugLine="StartActivity(\"pill_4\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_4"))));
 BA.debugLineNum = 387;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_click() throws Exception{
try {
		Debug.PushSubsStack("Label2_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,358);
if (RapidSub.canDelegate("label2_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","label2_click");}
 BA.debugLineNum = 358;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 360;BA.debugLine="StartActivity(\"pill_1\")";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_1"))));
 BA.debugLineNum = 363;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label5_click() throws Exception{
try {
		Debug.PushSubsStack("Label5_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,366);
if (RapidSub.canDelegate("label5_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","label5_click");}
 BA.debugLineNum = 366;BA.debugLine="Private Sub Label5_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 368;BA.debugLine="StartActivity(\"pill_2\")";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_2"))));
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label9_click() throws Exception{
try {
		Debug.PushSubsStack("Label9_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,374);
if (RapidSub.canDelegate("label9_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","label9_click");}
 BA.debugLineNum = 374;BA.debugLine="Private Sub Label9_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 376;BA.debugLine="StartActivity(\"pill_3\")";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_3"))));
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
naseri_func_subs_0._process_globals();
pill_1_subs_0._process_globals();
pill_2_subs_0._process_globals();
pill_3_subs_0._process_globals();
pill_4_subs_0._process_globals();
starter_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
naseri_func.myClass = BA.getDeviceClass ("b4a.example.naseri_func");
pill_1.myClass = BA.getDeviceClass ("b4a.example.pill_1");
pill_2.myClass = BA.getDeviceClass ("b4a.example.pill_2");
pill_3.myClass = BA.getDeviceClass ("b4a.example.pill_3");
pill_4.myClass = BA.getDeviceClass ("b4a.example.pill_4");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
animatedcounter.myClass = BA.getDeviceClass ("b4a.example.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4a.example.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4a.example.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4a.example.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4a.example.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4a.example.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4a.example.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4a.example.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4a.example.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4a.example.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4a.example.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4a.example.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4a.example.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4a.example.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("b4a.example.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4a.example.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4a.example.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4a.example.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4a.example.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim pill_naim1 As String";
main._pill_naim1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim pill_count_box1 As Int = 0";
main._pill_count_box1 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 18;BA.debugLine="Dim start_time_1 As String";
main._start_time_1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim interval_1 As String";
main._interval_1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Dim box1_alarm As String";
main._box1_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="Dim pill_naim2 As String";
main._pill_naim2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Dim pill_count_box2 As Int = 0";
main._pill_count_box2 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 26;BA.debugLine="Dim start_time_2 As String";
main._start_time_2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Dim interval_2 As String";
main._interval_2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Dim box2_alarm As String";
main._box2_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim pill_naim3 As String";
main._pill_naim3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Dim pill_count_box3 As Int = 0";
main._pill_count_box3 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 34;BA.debugLine="Dim start_time_3 As String";
main._start_time_3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Dim interval_3 As String";
main._interval_3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Dim box3_alarm As String";
main._box3_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Dim pill_naim4 As String";
main._pill_naim4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 41;BA.debugLine="Dim pill_count_box4 As Int = 0";
main._pill_count_box4 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 42;BA.debugLine="Dim start_time_4 As String";
main._start_time_4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 43;BA.debugLine="Dim interval_4 As String";
main._interval_4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 44;BA.debugLine="Dim box4_alarm As String";
main._box4_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 48;BA.debugLine="Dim viber As PhoneVibrate";
main._viber = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneVibrate");
 //BA.debugLineNum = 49;BA.debugLine="Dim count As Byte = 1";
main._count = BA.numberCast(byte.class, 1);
 //BA.debugLineNum = 50;BA.debugLine="Dim socket1 As Socket";
main._socket1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Dim Timer1 As Timer";
main._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 52;BA.debugLine="Dim astreams As AsyncStreams";
main._astreams = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
 //BA.debugLineNum = 53;BA.debugLine="Dim input As String";
main._input = RemoteObject.createImmutable("");
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setbackgrounddrawable(RemoteObject _view,RemoteObject _color,RemoteObject _cornerradius) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundDrawable (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,294);
if (RapidSub.canDelegate("setbackgrounddrawable")) { return b4a.example.main.remoteMe.runUserSub(false, "main","setbackgrounddrawable", _view, _color, _cornerradius);}
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
Debug.locals.put("view", _view);
Debug.locals.put("color", _color);
Debug.locals.put("cornerRadius", _cornerradius);
 BA.debugLineNum = 294;BA.debugLine="Sub SetBackgroundDrawable(view As View, color As I";
Debug.ShouldStop(32);
 BA.debugLineNum = 295;BA.debugLine="Dim bg As GradientDrawable";
Debug.ShouldStop(64);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 296;BA.debugLine="bg.Initialize(\"TOP_BOTTOM\", Array As Int(color, c";
Debug.ShouldStop(128);
_bg.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {_color,_color})));
 BA.debugLineNum = 297;BA.debugLine="bg.CornerRadius = cornerRadius";
Debug.ShouldStop(256);
_bg.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, _cornerradius));
 BA.debugLineNum = 298;BA.debugLine="view.Background = bg";
Debug.ShouldStop(512);
_view.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setconnect1_click() throws Exception{
try {
		Debug.PushSubsStack("setconnect1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,336);
if (RapidSub.canDelegate("setconnect1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","setconnect1_click");}
 BA.debugLineNum = 336;BA.debugLine="Private Sub setconnect1_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 337;BA.debugLine="Log(  \"key presed\")";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8720897",RemoteObject.createImmutable("key presed"),0);
 BA.debugLineNum = 339;BA.debugLine="If socket1.IsInitialized = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main._socket1.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 340;BA.debugLine="Log(\"سوکت مقداردهی شد.\")";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8720900",RemoteObject.createImmutable("سوکت مقداردهی شد."),0);
 BA.debugLineNum = 341;BA.debugLine="socket1.Initialize(\"socket1\")";
Debug.ShouldStop(1048576);
main._socket1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("socket1")));
 };
 BA.debugLineNum = 344;BA.debugLine="If socket1.Connected Then";
Debug.ShouldStop(8388608);
if (main._socket1.runMethod(true,"getConnected").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 345;BA.debugLine="Log(\"درحال قطع اتصال...\")";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8720905",RemoteObject.createImmutable("درحال قطع اتصال..."),0);
 BA.debugLineNum = 346;BA.debugLine="disconnectSocket(socket1)";
Debug.ShouldStop(33554432);
_disconnectsocket(main._socket1);
 }else {
 BA.debugLineNum = 350;BA.debugLine="Log(\"درحال اتصال...\")";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8720910",RemoteObject.createImmutable("درحال اتصال..."),0);
 BA.debugLineNum = 351;BA.debugLine="ProgressDialogShow2(\"درحال اتصال...\", False)";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("درحال اتصال...")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 353;BA.debugLine="socket1.Connect(\"192.168.4.1\", 8888, 5000)";
Debug.ShouldStop(1);
main._socket1.runVoidMethod ("Connect",main.processBA,(Object)(BA.ObjectToString("192.168.4.1")),(Object)(BA.numberCast(int.class, 8888)),(Object)(BA.numberCast(int.class, 5000)));
 };
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setupeditlabel(RemoteObject _lbl) throws Exception{
try {
		Debug.PushSubsStack("SetupEditLabel (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,277);
if (RapidSub.canDelegate("setupeditlabel")) { return b4a.example.main.remoteMe.runUserSub(false, "main","setupeditlabel", _lbl);}
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 277;BA.debugLine="Sub SetupEditLabel(lbl As Label)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 278;BA.debugLine="lbl.Text = \"ویرایش\"";
Debug.ShouldStop(2097152);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence("ویرایش"));
 BA.debugLineNum = 279;BA.debugLine="lbl.Color = Colors.LightGray";
Debug.ShouldStop(4194304);
_lbl.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 280;BA.debugLine="lbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(8388608);
_lbl.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 281;BA.debugLine="lbl.TextSize = 16";
Debug.ShouldStop(16777216);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 282;BA.debugLine="lbl.TextColor = Colors.Black";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setupprogressbar(RemoteObject _lbl,RemoteObject _color,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("SetupProgressBar (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,269);
if (RapidSub.canDelegate("setupprogressbar")) { return b4a.example.main.remoteMe.runUserSub(false, "main","setupprogressbar", _lbl, _color, _progress);}
Debug.locals.put("lbl", _lbl);
Debug.locals.put("color", _color);
Debug.locals.put("progress", _progress);
 BA.debugLineNum = 269;BA.debugLine="Sub SetupProgressBar(lbl As Label, color As Int, p";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="lbl.Color = Colors.Red";
Debug.ShouldStop(8192);
_lbl.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 271;BA.debugLine="SetBackgroundDrawable(lbl, color, 10dip)";
Debug.ShouldStop(16384);
_setbackgrounddrawable(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _lbl.getObject()),_color,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));
 BA.debugLineNum = 272;BA.debugLine="UpdateProgressBar(lbl, progress)";
Debug.ShouldStop(32768);
_updateprogressbar(_lbl,_progress);
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _socket1_connected(RemoteObject _connected) throws Exception{
try {
		Debug.PushSubsStack("Socket1_Connected (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,390);
if (RapidSub.canDelegate("socket1_connected")) { return b4a.example.main.remoteMe.runUserSub(false, "main","socket1_connected", _connected);}
Debug.locals.put("Connected", _connected);
 BA.debugLineNum = 390;BA.debugLine="Sub Socket1_Connected(Connected As Boolean)As Bool";
Debug.ShouldStop(32);
 BA.debugLineNum = 392;BA.debugLine="If Connected = True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_connected,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 393;BA.debugLine="ToastMessageShow(\"ارتباط برقرار شد\",True)";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ارتباط برقرار شد")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 394;BA.debugLine="astreams.Initialize(socket1.InputStream, socket1";
Debug.ShouldStop(512);
main._astreams.runVoidMethod ("Initialize",main.processBA,(Object)(main._socket1.runMethod(false,"getInputStream")),(Object)(main._socket1.runMethod(false,"getOutputStream")),(Object)(RemoteObject.createImmutable("AStreams")));
 BA.debugLineNum = 395;BA.debugLine="viber.Vibrate(50)";
Debug.ShouldStop(1024);
main._viber.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 50)));
 BA.debugLineNum = 397;BA.debugLine="connectWIFI(setconnect1)";
Debug.ShouldStop(4096);
_connectwifi(main.mostCurrent._setconnect1);
 }else {
 BA.debugLineNum = 400;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مشکلی رخ داده است")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 402;BA.debugLine="disconnectWIFI(setconnect1)";
Debug.ShouldStop(131072);
_disconnectwifi(main.mostCurrent._setconnect1);
 BA.debugLineNum = 403;BA.debugLine="viber.Vibrate(500)";
Debug.ShouldStop(262144);
main._viber.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 500)));
 };
 BA.debugLineNum = 406;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 408;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateprogressbar(RemoteObject _lbl,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("UpdateProgressBar (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,287);
if (RapidSub.canDelegate("updateprogressbar")) { return b4a.example.main.remoteMe.runUserSub(false, "main","updateprogressbar", _lbl, _progress);}
RemoteObject _totalwidth = RemoteObject.createImmutable(0);
RemoteObject _newwidth = RemoteObject.createImmutable(0);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("progress", _progress);
 BA.debugLineNum = 287;BA.debugLine="Sub UpdateProgressBar(lbl As Label, progress As In";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 288;BA.debugLine="Dim totalWidth As Int = lbl.Width";
Debug.ShouldStop(-2147483648);
_totalwidth = _lbl.runMethod(true,"getWidth");Debug.locals.put("totalWidth", _totalwidth);Debug.locals.put("totalWidth", _totalwidth);
 BA.debugLineNum = 289;BA.debugLine="Dim newWidth As Int = (totalWidth * progress) / 1";
Debug.ShouldStop(1);
_newwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_totalwidth,_progress}, "*",0, 1)),RemoteObject.createImmutable(100)}, "/",0, 0));Debug.locals.put("newWidth", _newwidth);Debug.locals.put("newWidth", _newwidth);
 BA.debugLineNum = 290;BA.debugLine="lbl.Width = newWidth";
Debug.ShouldStop(2);
_lbl.runMethod(true,"setWidth",_newwidth);
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
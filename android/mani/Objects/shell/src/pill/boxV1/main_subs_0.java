package pill.boxV1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,108);
if (RapidSub.canDelegate("activity_create")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 108;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 110;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 114;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 116;BA.debugLine="pill_naim1 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(524288);
main._pill_naim1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim1.txt")));
 BA.debugLineNum = 117;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
Debug.ShouldStop(1048576);
main._pill_count_box1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_Data1.txt")));
 BA.debugLineNum = 118;BA.debugLine="start_time_1 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(2097152);
main._start_time_1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_1.txt")));
 BA.debugLineNum = 119;BA.debugLine="interval_1 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(4194304);
main._interval_1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_1.txt")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e8.toString()); };
 BA.debugLineNum = 127;BA.debugLine="Label1.Text=(\"(\"&pill_naim1&\")\")";
Debug.ShouldStop(1073741824);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("("),main._pill_naim1,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 128;BA.debugLine="Label5.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(";
Debug.ShouldStop(-2147483648);
main.mostCurrent._label5.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main._pill_count_box1,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 129;BA.debugLine="Label6.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box1_alarm&";
Debug.ShouldStop(1);
main.mostCurrent._label6.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box1_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 133;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 135;BA.debugLine="pill_naim2 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(64);
main._pill_naim2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim2.txt")));
 BA.debugLineNum = 136;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
Debug.ShouldStop(128);
main._pill_count_box2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box2.txt")));
 BA.debugLineNum = 137;BA.debugLine="start_time_2 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(256);
main._start_time_2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_2.txt")));
 BA.debugLineNum = 138;BA.debugLine="interval_2 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(512);
main._interval_2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_2.txt")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e18.toString()); };
 BA.debugLineNum = 146;BA.debugLine="Label2.Text=(\"(\"&pill_naim2&\")\")";
Debug.ShouldStop(131072);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("("),main._pill_naim2,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 147;BA.debugLine="Label7.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&p";
Debug.ShouldStop(262144);
main.mostCurrent._label7.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main._pill_count_box2,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 148;BA.debugLine="Label8.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box2_alarm&";
Debug.ShouldStop(524288);
main.mostCurrent._label8.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box2_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 152;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 154;BA.debugLine="pill_naim3 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(33554432);
main._pill_naim3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim3.txt")));
 BA.debugLineNum = 155;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
Debug.ShouldStop(67108864);
main._pill_count_box3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box3.txt")));
 BA.debugLineNum = 156;BA.debugLine="start_time_3 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(134217728);
main._start_time_3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_3.txt")));
 BA.debugLineNum = 157;BA.debugLine="interval_3 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(268435456);
main._interval_3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_3.txt")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e28) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e28.toString()); };
 BA.debugLineNum = 165;BA.debugLine="Label3.Text=(\"(\"&pill_naim3&\")\")";
Debug.ShouldStop(16);
main.mostCurrent._label3.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("("),main._pill_naim3,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 166;BA.debugLine="Label9.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&p";
Debug.ShouldStop(32);
main.mostCurrent._label9.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main._pill_count_box3,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 167;BA.debugLine="Label10.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box3_alarm";
Debug.ShouldStop(64);
main.mostCurrent._label10.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box3_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 171;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 173;BA.debugLine="pill_naim4 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(4096);
main._pill_naim4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim4.txt")));
 BA.debugLineNum = 174;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
Debug.ShouldStop(8192);
main._pill_count_box4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box4.txt")));
 BA.debugLineNum = 175;BA.debugLine="start_time_4 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(16384);
main._start_time_4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_4.txt")));
 BA.debugLineNum = 176;BA.debugLine="interval_4 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(32768);
main._interval_4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_4.txt")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e38.toString()); };
 BA.debugLineNum = 184;BA.debugLine="Label4.Text=(\"(\"&pill_naim4&\")\")";
Debug.ShouldStop(8388608);
main.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("("),main._pill_naim4,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 185;BA.debugLine="Label11.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&";
Debug.ShouldStop(16777216);
main.mostCurrent._label11.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 186;BA.debugLine="Label12.Text = (\"   \"&\"ساعت مصرف:\"&\"(\"&box4_alarm";
Debug.ShouldStop(33554432);
main.mostCurrent._label12.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box4_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,199);
if (RapidSub.canDelegate("activity_pause")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 199;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,191);
if (RapidSub.canDelegate("activity_resume")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 191;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("AStreams_Error (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,276);
if (RapidSub.canDelegate("astreams_error")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","astreams_error");}
 BA.debugLineNum = 276;BA.debugLine="Sub AStreams_Error";
Debug.ShouldStop(524288);
 BA.debugLineNum = 278;BA.debugLine="setconnect1.Enabled = True";
Debug.ShouldStop(2097152);
main.mostCurrent._setconnect1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 279;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مشکلی رخ داده است")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 281;BA.debugLine="setconnect1.Text = \"اتصال\"";
Debug.ShouldStop(16777216);
main.mostCurrent._setconnect1.runMethod(true,"setText",BA.ObjectToCharSequence("اتصال"));
 BA.debugLineNum = 282;BA.debugLine="viber.Vibrate(1000)";
Debug.ShouldStop(33554432);
main._viber.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 283;BA.debugLine="socket1.Close";
Debug.ShouldStop(67108864);
main._socket1.runVoidMethod ("Close");
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("AStreams_NewData (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,289);
if (RapidSub.canDelegate("astreams_newdata")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","astreams_newdata", _buffer);}
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 289;BA.debugLine="Sub AStreams_NewData (Buffer() As Byte)";
Debug.ShouldStop(1);
 BA.debugLineNum = 292;BA.debugLine="input = BytesToString(Buffer, 0, Buffer.Length, \"";
Debug.ShouldStop(8);
main._input = main.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")),(Object)(RemoteObject.createImmutable("UTF-8")));
 BA.debugLineNum = 293;BA.debugLine="Log(input)";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("LogImpl","61048580",main._input,0);
 BA.debugLineNum = 296;BA.debugLine="Matcher = Regex.Matcher(pattern1, input)";
Debug.ShouldStop(128);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern1),(Object)(main._input));
 BA.debugLineNum = 297;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(256);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 298;BA.debugLine="data1 = Matcher.Group(1)";
Debug.ShouldStop(512);
main.mostCurrent._data1 = main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1)));
 };
 BA.debugLineNum = 320;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_Da";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_Data1.txt")),(Object)(main.mostCurrent._data1));
 BA.debugLineNum = 321;BA.debugLine="pill_count_box1 = File.ReadString(File.DirInterna";
Debug.ShouldStop(1);
main._pill_count_box1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_Data1.txt")));
 BA.debugLineNum = 322;BA.debugLine="Label5.Text = (\"   \"&\"تعداد قرص های موجود:\"&\"(\"&d";
Debug.ShouldStop(2);
main.mostCurrent._label5.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main.mostCurrent._data1,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 65;BA.debugLine="Private Imagepill1 As ImageView";
main.mostCurrent._imagepill1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private Imagepill2 As ImageView";
main.mostCurrent._imagepill2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private Imagepill3 As ImageView";
main.mostCurrent._imagepill3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private Imagepill4 As ImageView";
main.mostCurrent._imagepill4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private Label2 As Label";
main.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private Label3 As Label";
main.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private Label4 As Label";
main.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Private Label5 As Label";
main.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private Label6 As Label";
main.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private Label7 As Label";
main.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private Label8 As Label";
main.mostCurrent._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private Label9 As Label";
main.mostCurrent._label9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private Label10 As Label";
main.mostCurrent._label10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private Label11 As Label";
main.mostCurrent._label11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private Label12 As Label";
main.mostCurrent._label12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private setconnect1 As Button";
main.mostCurrent._setconnect1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private pattern1 As String = \"p1cs(\\d+)p1ce\"  ' ب";
main.mostCurrent._pattern1 = BA.ObjectToString("p1cs(\\d+)p1ce");
 //BA.debugLineNum = 97;BA.debugLine="Private data1 As String = \"\"";
main.mostCurrent._data1 = BA.ObjectToString("");
 //BA.debugLineNum = 103;BA.debugLine="Private Matcher As Matcher";
main.mostCurrent._matcher = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imagepill1_longclick() throws Exception{
try {
		Debug.PushSubsStack("Imagepill1_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,234);
if (RapidSub.canDelegate("imagepill1_longclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","imagepill1_longclick");}
 BA.debugLineNum = 234;BA.debugLine="Private Sub Imagepill1_LongClick";
Debug.ShouldStop(512);
 BA.debugLineNum = 236;BA.debugLine="StartActivity(\"pill_1\")";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_1"))));
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imagepill2_longclick() throws Exception{
try {
		Debug.PushSubsStack("Imagepill2_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,225);
if (RapidSub.canDelegate("imagepill2_longclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","imagepill2_longclick");}
 BA.debugLineNum = 225;BA.debugLine="Private Sub Imagepill2_LongClick";
Debug.ShouldStop(1);
 BA.debugLineNum = 227;BA.debugLine="StartActivity(\"pill_2\")";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_2"))));
 BA.debugLineNum = 228;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imagepill3_longclick() throws Exception{
try {
		Debug.PushSubsStack("Imagepill3_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,216);
if (RapidSub.canDelegate("imagepill3_longclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","imagepill3_longclick");}
 BA.debugLineNum = 216;BA.debugLine="Private Sub Imagepill3_LongClick";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 218;BA.debugLine="StartActivity(\"pill_3\")";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_3"))));
 BA.debugLineNum = 219;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imagepill4_longclick() throws Exception{
try {
		Debug.PushSubsStack("Imagepill4_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,207);
if (RapidSub.canDelegate("imagepill4_longclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","imagepill4_longclick");}
 BA.debugLineNum = 207;BA.debugLine="Private Sub Imagepill4_LongClick";
Debug.ShouldStop(16384);
 BA.debugLineNum = 209;BA.debugLine="StartActivity(\"pill_4\")";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_4"))));
 BA.debugLineNum = 210;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 212;BA.debugLine="End Sub";
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
pill_1_subs_0._process_globals();
pill_2_subs_0._process_globals();
pill_3_subs_0._process_globals();
pill_4_subs_0._process_globals();
naseri_func_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("pill.boxV1.main");
pill_1.myClass = BA.getDeviceClass ("pill.boxV1.pill_1");
pill_2.myClass = BA.getDeviceClass ("pill.boxV1.pill_2");
pill_3.myClass = BA.getDeviceClass ("pill.boxV1.pill_3");
pill_4.myClass = BA.getDeviceClass ("pill.boxV1.pill_4");
naseri_func.myClass = BA.getDeviceClass ("pill.boxV1.naseri_func");
starter.myClass = BA.getDeviceClass ("pill.boxV1.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Dim pill_naim1 As String";
main._pill_naim1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Dim pill_count_box1 As String";
main._pill_count_box1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim start_time_1 As String";
main._start_time_1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim interval_1 As String";
main._interval_1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="Dim box1_alarm As String";
main._box1_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Dim pill_naim2 As String";
main._pill_naim2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim pill_count_box2 As String";
main._pill_count_box2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Dim start_time_2 As String";
main._start_time_2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Dim interval_2 As String";
main._interval_2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim box2_alarm As String";
main._box2_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Dim pill_naim3 As String";
main._pill_naim3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 37;BA.debugLine="Dim pill_count_box3 As String";
main._pill_count_box3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 38;BA.debugLine="Dim start_time_3 As String";
main._start_time_3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Dim interval_3 As String";
main._interval_3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Dim box3_alarm As String";
main._box3_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 44;BA.debugLine="Dim pill_naim4 As String";
main._pill_naim4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 45;BA.debugLine="Dim pill_count_box4 As String";
main._pill_count_box4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 46;BA.debugLine="Dim start_time_4 As String";
main._start_time_4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 47;BA.debugLine="Dim interval_4 As String";
main._interval_4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 48;BA.debugLine="Dim box4_alarm As String";
main._box4_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 52;BA.debugLine="Dim viber As PhoneVibrate";
main._viber = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneVibrate");
 //BA.debugLineNum = 53;BA.debugLine="Dim count As Byte = 1";
main._count = BA.numberCast(byte.class, 1);
 //BA.debugLineNum = 54;BA.debugLine="Dim socket1 As Socket";
main._socket1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Dim Timer1 As Timer";
main._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 56;BA.debugLine="Dim astreams As AsyncStreams";
main._astreams = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
 //BA.debugLineNum = 57;BA.debugLine="Dim input As String";
main._input = RemoteObject.createImmutable("");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setconnect1_click() throws Exception{
try {
		Debug.PushSubsStack("setconnect1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,243);
if (RapidSub.canDelegate("setconnect1_click")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","setconnect1_click");}
 BA.debugLineNum = 243;BA.debugLine="Private Sub setconnect1_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 245;BA.debugLine="ProgressDialogShow2(\"درحال اتصال...\",False)";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("درحال اتصال...")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 246;BA.debugLine="socket1.Initialize(\"socket1\")";
Debug.ShouldStop(2097152);
main._socket1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("socket1")));
 BA.debugLineNum = 247;BA.debugLine="socket1.Connect(\"192.168.4.1\",8888,5000)";
Debug.ShouldStop(4194304);
main._socket1.runVoidMethod ("Connect",main.processBA,(Object)(BA.ObjectToString("192.168.4.1")),(Object)(BA.numberCast(int.class, 8888)),(Object)(BA.numberCast(int.class, 5000)));
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Socket1_Connected (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,253);
if (RapidSub.canDelegate("socket1_connected")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","socket1_connected", _connected);}
Debug.locals.put("Connected", _connected);
 BA.debugLineNum = 253;BA.debugLine="Sub Socket1_Connected(Connected As Boolean)As Bool";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 255;BA.debugLine="If Connected = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_connected,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 256;BA.debugLine="ToastMessageShow(\"ارتباط برقرار شد\",True)";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ارتباط برقرار شد")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 257;BA.debugLine="astreams.Initialize(socket1.InputStream, socket1";
Debug.ShouldStop(1);
main._astreams.runVoidMethod ("Initialize",main.processBA,(Object)(main._socket1.runMethod(false,"getInputStream")),(Object)(main._socket1.runMethod(false,"getOutputStream")),(Object)(RemoteObject.createImmutable("AStreams")));
 BA.debugLineNum = 258;BA.debugLine="viber.Vibrate(50)";
Debug.ShouldStop(2);
main._viber.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 50)));
 BA.debugLineNum = 259;BA.debugLine="setconnect1.Enabled =False";
Debug.ShouldStop(4);
main.mostCurrent._setconnect1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 260;BA.debugLine="setconnect1.Text = \"متصل شد\"";
Debug.ShouldStop(8);
main.mostCurrent._setconnect1.runMethod(true,"setText",BA.ObjectToCharSequence("متصل شد"));
 }else {
 BA.debugLineNum = 264;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مشکلی رخ داده است")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 266;BA.debugLine="setconnect1.Text = \"اتصال\"";
Debug.ShouldStop(512);
main.mostCurrent._setconnect1.runMethod(true,"setText",BA.ObjectToCharSequence("اتصال"));
 BA.debugLineNum = 267;BA.debugLine="viber.Vibrate(500)";
Debug.ShouldStop(1024);
main._viber.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 500)));
 };
 BA.debugLineNum = 270;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
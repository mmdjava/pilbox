package Pill_Box.v1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,175);
if (RapidSub.canDelegate("activity_create")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 175;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(32768);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 179;BA.debugLine="Imagepill1.Bitmap = LoadBitmap(File.DirAssets, \"p";
Debug.ShouldStop(262144);
main.mostCurrent._imagepill1.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pill (2).png"))).getObject()));
 BA.debugLineNum = 180;BA.debugLine="Imagepill2.Bitmap = LoadBitmap(File.DirAssets, \"p";
Debug.ShouldStop(524288);
main.mostCurrent._imagepill2.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pill (4).png"))).getObject()));
 BA.debugLineNum = 181;BA.debugLine="Imagepill3.Bitmap = LoadBitmap(File.DirAssets, \"p";
Debug.ShouldStop(1048576);
main.mostCurrent._imagepill3.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pill (1).png"))).getObject()));
 BA.debugLineNum = 182;BA.debugLine="Imagepill4.Bitmap = LoadBitmap(File.DirAssets, \"P";
Debug.ShouldStop(2097152);
main.mostCurrent._imagepill4.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Pill.png"))).getObject()));
 BA.debugLineNum = 187;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(67108864);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 189;BA.debugLine="If socket1.IsInitialized = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main._socket1.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 190;BA.debugLine="socket1.Initialize(\"socket1\")";
Debug.ShouldStop(536870912);
main._socket1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("socket1")));
 BA.debugLineNum = 191;BA.debugLine="Log(\"سوکت مقداردهی شد\")";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5131088",RemoteObject.createImmutable("سوکت مقداردهی شد"),0);
 };
 };
 BA.debugLineNum = 197;BA.debugLine="disconnectWIFI(setconnect1)";
Debug.ShouldStop(16);
_disconnectwifi(main.mostCurrent._setconnect1);
 BA.debugLineNum = 199;BA.debugLine="LoadHistory";
Debug.ShouldStop(64);
_loadhistory();
 BA.debugLineNum = 202;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 204;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
Debug.ShouldStop(2048);
main._pill_count_box1 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box1.txt")))));
 BA.debugLineNum = 205;BA.debugLine="start_time_1 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(4096);
main._start_time_1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_1.txt")));
 BA.debugLineNum = 206;BA.debugLine="interval_1 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(8192);
main._interval_1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_1.txt")));
 BA.debugLineNum = 207;BA.debugLine="box1_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(16384);
main._box1_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box1_alarm.txt")));
 BA.debugLineNum = 208;BA.debugLine="data1 = File.ReadString(File.DirInternal, \"pill_";
Debug.ShouldStop(32768);
main._data1 = BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_Data1.txt"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e21.toString()); };
 BA.debugLineNum = 216;BA.debugLine="Label4.Text = (pill_count_box1&\"/\"&data1)";
Debug.ShouldStop(8388608);
main.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box1,RemoteObject.createImmutable("/"),main._data1))));
 BA.debugLineNum = 221;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 223;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
Debug.ShouldStop(1073741824);
main._pill_count_box2 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box2.txt")))));
 BA.debugLineNum = 224;BA.debugLine="start_time_2 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(-2147483648);
main._start_time_2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_2.txt")));
 BA.debugLineNum = 225;BA.debugLine="interval_2 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(1);
main._interval_2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_2.txt")));
 BA.debugLineNum = 226;BA.debugLine="box2_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(2);
main._box2_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box2_alarm.txt")));
 BA.debugLineNum = 227;BA.debugLine="data2 = File.ReadString(File.DirInternal, \"pill_";
Debug.ShouldStop(4);
main._data2 = BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_Data2.txt"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e30) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e30.toString()); };
 BA.debugLineNum = 235;BA.debugLine="Label8.Text = (pill_count_box2&\"/\"&data2)";
Debug.ShouldStop(1024);
main.mostCurrent._label8.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box2,RemoteObject.createImmutable("/"),main._data2))));
 BA.debugLineNum = 240;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 242;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
Debug.ShouldStop(131072);
main._pill_count_box3 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box3.txt")))));
 BA.debugLineNum = 243;BA.debugLine="start_time_3 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(262144);
main._start_time_3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_3.txt")));
 BA.debugLineNum = 244;BA.debugLine="interval_3 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(524288);
main._interval_3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_3.txt")));
 BA.debugLineNum = 245;BA.debugLine="box3_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(1048576);
main._box3_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box3_alarm.txt")));
 BA.debugLineNum = 246;BA.debugLine="data3 = File.ReadString(File.DirInternal, \"pill_";
Debug.ShouldStop(2097152);
main._data3 = BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_Data3.txt"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e39) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e39.toString()); };
 BA.debugLineNum = 255;BA.debugLine="Label13.Text = (pill_count_box3&\"/\"&data3)";
Debug.ShouldStop(1073741824);
main.mostCurrent._label13.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box3,RemoteObject.createImmutable("/"),main._data3))));
 BA.debugLineNum = 260;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 262;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
Debug.ShouldStop(32);
main._pill_count_box4 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box4.txt")))));
 BA.debugLineNum = 263;BA.debugLine="start_time_4 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(64);
main._start_time_4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_4.txt")));
 BA.debugLineNum = 264;BA.debugLine="interval_4 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(128);
main._interval_4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_4.txt")));
 BA.debugLineNum = 265;BA.debugLine="box4_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(256);
main._box4_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box4_alarm.txt")));
 BA.debugLineNum = 266;BA.debugLine="data4 = File.ReadString(File.DirInternal, \"pill_";
Debug.ShouldStop(512);
main._data4 = BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_Data4.txt"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e48) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e48.toString()); };
 BA.debugLineNum = 274;BA.debugLine="Label17.Text = (pill_count_box4&\"/\"&data4)";
Debug.ShouldStop(131072);
main.mostCurrent._label17.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box4,RemoteObject.createImmutable("/"),main._data4))));
 BA.debugLineNum = 278;BA.debugLine="Label4.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(2097152);
main.mostCurrent._label4.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffffffff)));
 BA.debugLineNum = 279;BA.debugLine="Label4.TextSize = 25";
Debug.ShouldStop(4194304);
main.mostCurrent._label4.runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 280;BA.debugLine="Label4.Text = \"!\"";
Debug.ShouldStop(8388608);
main.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence("!"));
 BA.debugLineNum = 282;BA.debugLine="Label8.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(33554432);
main.mostCurrent._label8.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffffffff)));
 BA.debugLineNum = 283;BA.debugLine="Label8.TextSize = 25";
Debug.ShouldStop(67108864);
main.mostCurrent._label8.runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 284;BA.debugLine="Label8.Text = \"!\"";
Debug.ShouldStop(134217728);
main.mostCurrent._label8.runMethod(true,"setText",BA.ObjectToCharSequence("!"));
 BA.debugLineNum = 286;BA.debugLine="Label13.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(536870912);
main.mostCurrent._label13.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffffffff)));
 BA.debugLineNum = 287;BA.debugLine="Label13.TextSize = 25";
Debug.ShouldStop(1073741824);
main.mostCurrent._label13.runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 288;BA.debugLine="Label13.Text = \"!\"";
Debug.ShouldStop(-2147483648);
main.mostCurrent._label13.runMethod(true,"setText",BA.ObjectToCharSequence("!"));
 BA.debugLineNum = 290;BA.debugLine="Label17.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(2);
main.mostCurrent._label17.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffffffff)));
 BA.debugLineNum = 291;BA.debugLine="Label17.TextSize = 25";
Debug.ShouldStop(4);
main.mostCurrent._label17.runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 292;BA.debugLine="Label17.Text = \"!\"";
Debug.ShouldStop(8);
main.mostCurrent._label17.runMethod(true,"setText",BA.ObjectToCharSequence("!"));
 BA.debugLineNum = 294;BA.debugLine="histori(Label11)";
Debug.ShouldStop(32);
_histori(main.mostCurrent._label11);
 BA.debugLineNum = 297;BA.debugLine="SetupEditLabel(Label2)";
Debug.ShouldStop(256);
_setupeditlabel(main.mostCurrent._label2);
 BA.debugLineNum = 298;BA.debugLine="SetupEditLabel(Label5)";
Debug.ShouldStop(512);
_setupeditlabel(main.mostCurrent._label5);
 BA.debugLineNum = 299;BA.debugLine="SetupEditLabel(Label9)";
Debug.ShouldStop(1024);
_setupeditlabel(main.mostCurrent._label9);
 BA.debugLineNum = 300;BA.debugLine="SetupEditLabel(Label14)";
Debug.ShouldStop(2048);
_setupeditlabel(main.mostCurrent._label14);
 BA.debugLineNum = 302;BA.debugLine="Timer1.Initialize(\"timer1\",1000)";
Debug.ShouldStop(8192);
main._timer1.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("timer1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 303;BA.debugLine="Timer1.Enabled=True";
Debug.ShouldStop(16384);
main._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,339);
if (RapidSub.canDelegate("activity_resume")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 339;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcustomitem(RemoteObject _lv,RemoteObject _text,RemoteObject _textcolor) throws Exception{
try {
		Debug.PushSubsStack("AddCustomItem (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,829);
if (RapidSub.canDelegate("addcustomitem")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","addcustomitem", _lv, _text, _textcolor);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("lv", _lv);
Debug.locals.put("Text", _text);
Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 829;BA.debugLine="Sub AddCustomItem(lv As ListView, Text As String,";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 831;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(1073741824);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 832;BA.debugLine="pnl.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_pnl.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 835;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(4);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 836;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(8);
_lbl.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 837;BA.debugLine="lbl.Text = Text";
Debug.ShouldStop(16);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 838;BA.debugLine="lbl.TextColor = TextColor ' تنظیم رنگ متن";
Debug.ShouldStop(32);
_lbl.runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 839;BA.debugLine="lbl.TextSize = 18 ' تنظیم اندازه فونت";
Debug.ShouldStop(64);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 840;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL ' تنظیم متن";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 843;BA.debugLine="pnl.AddView(lbl, 0, 0, 100%x, 50dip) ' تنظیم اندا";
Debug.ShouldStop(1024);
_pnl.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 847;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtohistory(RemoteObject _pillname,RemoteObject _timetaken) throws Exception{
try {
		Debug.PushSubsStack("AddToHistory (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,741);
if (RapidSub.canDelegate("addtohistory")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","addtohistory", _pillname, _timetaken);}
RemoteObject _historyitem = RemoteObject.createImmutable("");
Debug.locals.put("pillName", _pillname);
Debug.locals.put("timeTaken", _timetaken);
 BA.debugLineNum = 741;BA.debugLine="Sub AddToHistory(pillName As String, timeTaken As";
Debug.ShouldStop(16);
 BA.debugLineNum = 742;BA.debugLine="Dim historyItem As String = \" \" & pillName & \" زم";
Debug.ShouldStop(32);
_historyitem = RemoteObject.concat(RemoteObject.createImmutable(" "),_pillname,RemoteObject.createImmutable(" زمان مصرف: "),_timetaken);Debug.locals.put("historyItem", _historyitem);Debug.locals.put("historyItem", _historyitem);
 BA.debugLineNum = 745;BA.debugLine="ListView1.AddSingleLine(historyItem)";
Debug.ShouldStop(256);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(_historyitem)));
 BA.debugLineNum = 748;BA.debugLine="SaveToFile(historyItem)";
Debug.ShouldStop(2048);
_savetofile(_historyitem);
 BA.debugLineNum = 749;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("AStreams_Error (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,450);
if (RapidSub.canDelegate("astreams_error")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","astreams_error");}
 BA.debugLineNum = 450;BA.debugLine="Sub AStreams_Error";
Debug.ShouldStop(2);
 BA.debugLineNum = 452;BA.debugLine="setconnect1.Enabled = True";
Debug.ShouldStop(8);
main.mostCurrent._setconnect1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 453;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مشکلی رخ داده است")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 454;BA.debugLine="disconnectWIFI(setconnect1)";
Debug.ShouldStop(32);
_disconnectwifi(main.mostCurrent._setconnect1);
 BA.debugLineNum = 455;BA.debugLine="viber.Vibrate(1000)";
Debug.ShouldStop(64);
main._viber.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 456;BA.debugLine="socket1.Close";
Debug.ShouldStop(128);
main._socket1.runVoidMethod ("Close");
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("AStreams_NewData (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,462);
if (RapidSub.canDelegate("astreams_newdata")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","astreams_newdata", _buffer);}
RemoteObject _mp = RemoteObject.declareNull("anywheresoftware.b4a.objects.MediaPlayerWrapper");
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 462;BA.debugLine="Sub AStreams_NewData (Buffer() As Byte)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 465;BA.debugLine="input = BytesToString(Buffer, 0, Buffer.Length, \"";
Debug.ShouldStop(65536);
main._input = main.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")),(Object)(RemoteObject.createImmutable("UTF-8")));
 BA.debugLineNum = 470;BA.debugLine="Matcher = Regex.Matcher(pattern1, input)";
Debug.ShouldStop(2097152);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern1),(Object)(main._input));
 BA.debugLineNum = 471;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(4194304);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 472;BA.debugLine="data1 = Matcher.Group(1)";
Debug.ShouldStop(8388608);
main._data1 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 476;BA.debugLine="Matcher = Regex.Matcher(pattern2, input)";
Debug.ShouldStop(134217728);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern2),(Object)(main._input));
 BA.debugLineNum = 477;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(268435456);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 478;BA.debugLine="data2 = Matcher.Group(1)";
Debug.ShouldStop(536870912);
main._data2 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 482;BA.debugLine="Matcher = Regex.Matcher(pattern3, input)";
Debug.ShouldStop(2);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern3),(Object)(main._input));
 BA.debugLineNum = 483;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(4);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 484;BA.debugLine="data3 = Matcher.Group(1)";
Debug.ShouldStop(8);
main._data3 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 488;BA.debugLine="Matcher = Regex.Matcher(pattern4, input)";
Debug.ShouldStop(128);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern4),(Object)(main._input));
 BA.debugLineNum = 489;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(256);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 490;BA.debugLine="data4 = Matcher.Group(1)";
Debug.ShouldStop(512);
main._data4 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 493;BA.debugLine="Matcher = Regex.Matcher(pattern5, input)";
Debug.ShouldStop(4096);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern5),(Object)(main._input));
 BA.debugLineNum = 494;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(8192);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 495;BA.debugLine="data5 = Matcher.Group(1)";
Debug.ShouldStop(16384);
main._data5 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 499;BA.debugLine="Matcher = Regex.Matcher(pattern6, input)";
Debug.ShouldStop(262144);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern6),(Object)(main._input));
 BA.debugLineNum = 500;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(524288);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 501;BA.debugLine="data6 = Matcher.Group(1)";
Debug.ShouldStop(1048576);
main._data6 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 505;BA.debugLine="Matcher = Regex.Matcher(pattern7, input)";
Debug.ShouldStop(16777216);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern7),(Object)(main._input));
 BA.debugLineNum = 506;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(33554432);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 507;BA.debugLine="data7 = Matcher.Group(1)";
Debug.ShouldStop(67108864);
main._data7 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 511;BA.debugLine="Matcher = Regex.Matcher(pattern8, input)";
Debug.ShouldStop(1073741824);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern8),(Object)(main._input));
 BA.debugLineNum = 512;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(-2147483648);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 513;BA.debugLine="data8 = Matcher.Group(1)";
Debug.ShouldStop(1);
main._data8 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 517;BA.debugLine="Matcher = Regex.Matcher(pattern9, input)";
Debug.ShouldStop(16);
main.mostCurrent._matcher = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(main.mostCurrent._pattern9),(Object)(main._input));
 BA.debugLineNum = 518;BA.debugLine="If Matcher.Find Then";
Debug.ShouldStop(32);
if (main.mostCurrent._matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 519;BA.debugLine="data9 = Matcher.Group(1)";
Debug.ShouldStop(64);
main._data9 = BA.numberCast(int.class, main.mostCurrent._matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 522;BA.debugLine="Log(data9)";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("LogImpl","51179708",BA.NumberToString(main._data9),0);
 BA.debugLineNum = 526;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 528;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_D";
Debug.ShouldStop(32768);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_Data1.txt")),(Object)(BA.NumberToString(main._data1)));
 BA.debugLineNum = 529;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
Debug.ShouldStop(65536);
main._pill_count_box1 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box1.txt")))));
 BA.debugLineNum = 530;BA.debugLine="Label4.Text = (pill_count_box1&\"/\"&data1)";
Debug.ShouldStop(131072);
main.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box1,RemoteObject.createImmutable("/"),main._data1))));
 BA.debugLineNum = 532;BA.debugLine="CheckPillCount1";
Debug.ShouldStop(524288);
_checkpillcount1();
 BA.debugLineNum = 534;BA.debugLine="File.WriteString(File.DirInternal, \"box1_alarm.t";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("box1_alarm.txt")),(Object)(BA.NumberToString(main._data5)));
 BA.debugLineNum = 535;BA.debugLine="box1_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(4194304);
main._box1_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box1_alarm.txt")));
 BA.debugLineNum = 540;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_D";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_Data2.txt")),(Object)(BA.NumberToString(main._data2)));
 BA.debugLineNum = 541;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
Debug.ShouldStop(268435456);
main._pill_count_box2 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box2.txt")))));
 BA.debugLineNum = 542;BA.debugLine="Label8.Text = (pill_count_box2&\"/\"&data2)";
Debug.ShouldStop(536870912);
main.mostCurrent._label8.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box2,RemoteObject.createImmutable("/"),main._data2))));
 BA.debugLineNum = 544;BA.debugLine="CheckPillCount2";
Debug.ShouldStop(-2147483648);
_checkpillcount2();
 BA.debugLineNum = 546;BA.debugLine="File.WriteString(File.DirInternal, \"box2_alarm.t";
Debug.ShouldStop(2);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("box2_alarm.txt")),(Object)(BA.NumberToString(main._data6)));
 BA.debugLineNum = 547;BA.debugLine="box2_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(4);
main._box2_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box2_alarm.txt")));
 BA.debugLineNum = 552;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_D";
Debug.ShouldStop(128);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_Data3.txt")),(Object)(BA.NumberToString(main._data3)));
 BA.debugLineNum = 553;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
Debug.ShouldStop(256);
main._pill_count_box3 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box3.txt")))));
 BA.debugLineNum = 554;BA.debugLine="Label13.Text = (pill_count_box3&\"/\"&data3)";
Debug.ShouldStop(512);
main.mostCurrent._label13.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box3,RemoteObject.createImmutable("/"),main._data3))));
 BA.debugLineNum = 556;BA.debugLine="CheckPillCount3";
Debug.ShouldStop(2048);
_checkpillcount3();
 BA.debugLineNum = 558;BA.debugLine="File.WriteString(File.DirInternal, \"box3_alarm.t";
Debug.ShouldStop(8192);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("box3_alarm.txt")),(Object)(BA.NumberToString(main._data7)));
 BA.debugLineNum = 559;BA.debugLine="box3_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(16384);
main._box3_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box3_alarm.txt")));
 BA.debugLineNum = 564;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_D";
Debug.ShouldStop(524288);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_Data4.txt")),(Object)(BA.NumberToString(main._data4)));
 BA.debugLineNum = 565;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
Debug.ShouldStop(1048576);
main._pill_count_box4 = (BA.numberCast(int.class, main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box4.txt")))));
 BA.debugLineNum = 566;BA.debugLine="Label17.Text = (pill_count_box4&\"/\"&data4)";
Debug.ShouldStop(2097152);
main.mostCurrent._label17.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(main._pill_count_box4,RemoteObject.createImmutable("/"),main._data4))));
 BA.debugLineNum = 568;BA.debugLine="CheckPillCount4";
Debug.ShouldStop(8388608);
_checkpillcount4();
 BA.debugLineNum = 570;BA.debugLine="File.WriteString(File.DirInternal, \"box4_alarm.t";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("box4_alarm.txt")),(Object)(BA.NumberToString(main._data8)));
 BA.debugLineNum = 571;BA.debugLine="box4_alarm = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(67108864);
main._box4_alarm = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("box4_alarm.txt")));
 BA.debugLineNum = 575;BA.debugLine="initialData1 = data1 'مقدار اولیه را ذخیره کنید";
Debug.ShouldStop(1073741824);
main._initialdata1 = main._data1;
 BA.debugLineNum = 576;BA.debugLine="initialData2 = data2 'مقدار اولیه را ذخیره کنید";
Debug.ShouldStop(-2147483648);
main._initialdata2 = main._data2;
 BA.debugLineNum = 577;BA.debugLine="initialData3 = data3 'مقدار اولیه را ذخیره کنید";
Debug.ShouldStop(1);
main._initialdata3 = main._data3;
 BA.debugLineNum = 578;BA.debugLine="initialData4 = data4 'مقدار اولیه را ذخیره کنید";
Debug.ShouldStop(2);
main._initialdata4 = main._data4;
 BA.debugLineNum = 581;BA.debugLine="If (data9==0) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",main._data9,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 583;BA.debugLine="Dim mp As MediaPlayer";
Debug.ShouldStop(64);
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MediaPlayerWrapper");Debug.locals.put("mp", _mp);
 BA.debugLineNum = 584;BA.debugLine="mp.Initialize()";
Debug.ShouldStop(128);
_mp.runVoidMethod ("Initialize");
 BA.debugLineNum = 585;BA.debugLine="mp.Load(File.DirAssets, \"alarm.mp3\") 'فایلی که";
Debug.ShouldStop(256);
_mp.runVoidMethod ("Load",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("alarm.mp3")));
 BA.debugLineNum = 586;BA.debugLine="mp.Play";
Debug.ShouldStop(512);
_mp.runVoidMethod ("Play");
 BA.debugLineNum = 587;BA.debugLine="data9 = -1";
Debug.ShouldStop(1024);
main._data9 = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 589;BA.debugLine="Msgbox(\"بیمار قرص\" &\" \"&pill_naim1&\" \"& \"مصرف ن";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("بیمار قرص"),RemoteObject.createImmutable(" "),main._pill_naim1,RemoteObject.createImmutable(" "),RemoteObject.createImmutable("مصرف نکرده است!!!")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("توجه"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 591;BA.debugLine="AddToHistory(pill_naim1,\"مصرف نشد\"&date&\"  \"&ti";
Debug.ShouldStop(16384);
_addtohistory(main._pill_naim1,RemoteObject.concat(RemoteObject.createImmutable("مصرف نشد"),main.mostCurrent._date,RemoteObject.createImmutable("  "),main.mostCurrent._time));
 };
 BA.debugLineNum = 595;BA.debugLine="If (data9==1) Then";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("=",main._data9,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 597;BA.debugLine="Dim mp As MediaPlayer";
Debug.ShouldStop(1048576);
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MediaPlayerWrapper");Debug.locals.put("mp", _mp);
 BA.debugLineNum = 598;BA.debugLine="mp.Initialize()";
Debug.ShouldStop(2097152);
_mp.runVoidMethod ("Initialize");
 BA.debugLineNum = 599;BA.debugLine="mp.Load(File.DirAssets, \"alarm.mp3\") 'فایلی که";
Debug.ShouldStop(4194304);
_mp.runVoidMethod ("Load",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("alarm.mp3")));
 BA.debugLineNum = 600;BA.debugLine="mp.Play";
Debug.ShouldStop(8388608);
_mp.runVoidMethod ("Play");
 BA.debugLineNum = 601;BA.debugLine="data9 = -1";
Debug.ShouldStop(16777216);
main._data9 = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 603;BA.debugLine="Msgbox(\"بیمار قرص\" &\" \"&pill_naim2&\" \"& \"را مصر";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("بیمار قرص"),RemoteObject.createImmutable(" "),main._pill_naim2,RemoteObject.createImmutable(" "),RemoteObject.createImmutable("را مصرف نکرده است!!!")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("توجه"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 605;BA.debugLine="AddToHistory(pill_naim2,\"مصرف نشد\"&date&\"  \"&ti";
Debug.ShouldStop(268435456);
_addtohistory(main._pill_naim2,RemoteObject.concat(RemoteObject.createImmutable("مصرف نشد"),main.mostCurrent._date,RemoteObject.createImmutable("  "),main.mostCurrent._time));
 };
 BA.debugLineNum = 609;BA.debugLine="If (data9==2) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",main._data9,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 611;BA.debugLine="Dim mp As MediaPlayer";
Debug.ShouldStop(4);
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MediaPlayerWrapper");Debug.locals.put("mp", _mp);
 BA.debugLineNum = 612;BA.debugLine="mp.Initialize()";
Debug.ShouldStop(8);
_mp.runVoidMethod ("Initialize");
 BA.debugLineNum = 613;BA.debugLine="mp.Load(File.DirAssets, \"alarm.mp3\") 'فایلی که";
Debug.ShouldStop(16);
_mp.runVoidMethod ("Load",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("alarm.mp3")));
 BA.debugLineNum = 614;BA.debugLine="mp.Play";
Debug.ShouldStop(32);
_mp.runVoidMethod ("Play");
 BA.debugLineNum = 615;BA.debugLine="data9 = -1";
Debug.ShouldStop(64);
main._data9 = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 617;BA.debugLine="Msgbox(\"بیمار قرص\" &\" \"&pill_naim3&\" \"& \"را مصر";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("بیمار قرص"),RemoteObject.createImmutable(" "),main._pill_naim3,RemoteObject.createImmutable(" "),RemoteObject.createImmutable("را مصرف نکرده است!!!")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("توجه"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 619;BA.debugLine="AddToHistory(pill_naim3,\"مصرف نشد\"&date&\"  \"&ti";
Debug.ShouldStop(1024);
_addtohistory(main._pill_naim3,RemoteObject.concat(RemoteObject.createImmutable("مصرف نشد"),main.mostCurrent._date,RemoteObject.createImmutable("  "),main.mostCurrent._time));
 };
 BA.debugLineNum = 623;BA.debugLine="If (data9==3) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",main._data9,BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 625;BA.debugLine="Dim mp As MediaPlayer";
Debug.ShouldStop(65536);
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MediaPlayerWrapper");Debug.locals.put("mp", _mp);
 BA.debugLineNum = 626;BA.debugLine="mp.Initialize()";
Debug.ShouldStop(131072);
_mp.runVoidMethod ("Initialize");
 BA.debugLineNum = 627;BA.debugLine="mp.Load(File.DirAssets, \"alarm.mp3\") 'فایلی که";
Debug.ShouldStop(262144);
_mp.runVoidMethod ("Load",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("alarm.mp3")));
 BA.debugLineNum = 628;BA.debugLine="mp.Play";
Debug.ShouldStop(524288);
_mp.runVoidMethod ("Play");
 BA.debugLineNum = 629;BA.debugLine="data9 = -1";
Debug.ShouldStop(1048576);
main._data9 = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 631;BA.debugLine="Msgbox(\"بیمار قرص\" &\" \"&pill_naim4&\" \"& \"را مصر";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("بیمار قرص"),RemoteObject.createImmutable(" "),main._pill_naim4,RemoteObject.createImmutable(" "),RemoteObject.createImmutable("را مصرف نکرده است!!!")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("توجه"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 633;BA.debugLine="AddToHistory(pill_naim4,\"مصرف نشد\"&date&\"  \"&ti";
Debug.ShouldStop(16777216);
_addtohistory(main._pill_naim4,RemoteObject.concat(RemoteObject.createImmutable("مصرف نشد"),main.mostCurrent._date,RemoteObject.createImmutable("  "),main.mostCurrent._time));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e105) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e105.toString()); };
 BA.debugLineNum = 642;BA.debugLine="Label1.Width = 280dip ' تغییر عرض به مقدار دلخواه";
Debug.ShouldStop(2);
main.mostCurrent._label1.runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280))));
 BA.debugLineNum = 643;BA.debugLine="Label1.Height = 40dip ' تغییر ارتفاع به مقدار دلخ";
Debug.ShouldStop(4);
main.mostCurrent._label1.runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 644;BA.debugLine="Label7.Width = 280dip";
Debug.ShouldStop(8);
main.mostCurrent._label7.runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280))));
 BA.debugLineNum = 645;BA.debugLine="Label7.Height = 40dip";
Debug.ShouldStop(16);
main.mostCurrent._label7.runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 646;BA.debugLine="Label12.Width = 280dip";
Debug.ShouldStop(32);
main.mostCurrent._label12.runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280))));
 BA.debugLineNum = 647;BA.debugLine="Label12.Height = 40dip";
Debug.ShouldStop(64);
main.mostCurrent._label12.runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 648;BA.debugLine="Label16.Width = 280dip";
Debug.ShouldStop(128);
main.mostCurrent._label16.runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280))));
 BA.debugLineNum = 649;BA.debugLine="Label16.Height = 40dip";
Debug.ShouldStop(256);
main.mostCurrent._label16.runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 652;BA.debugLine="SetupProgressBar(Label1, 0xFF5DD700 , 50)";
Debug.ShouldStop(2048);
_setupprogressbar(main.mostCurrent._label1,BA.numberCast(int.class, ((int)0xff5dd700)),BA.numberCast(int.class, 50));
 BA.debugLineNum = 653;BA.debugLine="SetupProgressBar(Label7, 0xFF5DD700 , 50)";
Debug.ShouldStop(4096);
_setupprogressbar(main.mostCurrent._label7,BA.numberCast(int.class, ((int)0xff5dd700)),BA.numberCast(int.class, 50));
 BA.debugLineNum = 654;BA.debugLine="SetupProgressBar(Label12, 0xFF5DD700 , 50)";
Debug.ShouldStop(8192);
_setupprogressbar(main.mostCurrent._label12,BA.numberCast(int.class, ((int)0xff5dd700)),BA.numberCast(int.class, 50));
 BA.debugLineNum = 655;BA.debugLine="SetupProgressBar(Label16, 0xFF5DD700 , 50)";
Debug.ShouldStop(16384);
_setupprogressbar(main.mostCurrent._label16,BA.numberCast(int.class, ((int)0xff5dd700)),BA.numberCast(int.class, 50));
 BA.debugLineNum = 657;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 659;BA.debugLine="label_size1 = ( 100 / pill_count_box1 )* data1";
Debug.ShouldStop(262144);
main._label_size1 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),main._pill_count_box1}, "/",0, 0)),main._data1}, "*",0, 0));
 BA.debugLineNum = 660;BA.debugLine="label_size2 = ( 100 / pill_count_box2 )* data2";
Debug.ShouldStop(524288);
main._label_size2 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),main._pill_count_box2}, "/",0, 0)),main._data2}, "*",0, 0));
 BA.debugLineNum = 661;BA.debugLine="label_size3 = ( 100 / pill_count_box3 )* data3";
Debug.ShouldStop(1048576);
main._label_size3 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),main._pill_count_box3}, "/",0, 0)),main._data3}, "*",0, 0));
 BA.debugLineNum = 662;BA.debugLine="label_size4 = ( 100 / pill_count_box4 )* data4";
Debug.ShouldStop(2097152);
main._label_size4 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),main._pill_count_box4}, "/",0, 0)),main._data4}, "*",0, 0));
 BA.debugLineNum = 665;BA.debugLine="UpdateProgressBar(Label1,label_size1)";
Debug.ShouldStop(16777216);
_updateprogressbar(main.mostCurrent._label1,main._label_size1);
 BA.debugLineNum = 666;BA.debugLine="UpdateProgressBar(Label7,label_size2)";
Debug.ShouldStop(33554432);
_updateprogressbar(main.mostCurrent._label7,main._label_size2);
 BA.debugLineNum = 667;BA.debugLine="UpdateProgressBar(Label12,label_size3)";
Debug.ShouldStop(67108864);
_updateprogressbar(main.mostCurrent._label12,main._label_size3);
 BA.debugLineNum = 668;BA.debugLine="UpdateProgressBar(Label16,label_size4)";
Debug.ShouldStop(134217728);
_updateprogressbar(main.mostCurrent._label16,main._label_size4);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e128) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e128.toString()); };
 BA.debugLineNum = 675;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkpillcount1() throws Exception{
try {
		Debug.PushSubsStack("CheckPillCount1 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,697);
if (RapidSub.canDelegate("checkpillcount1")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","checkpillcount1");}
 BA.debugLineNum = 697;BA.debugLine="Sub CheckPillCount1";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 698;BA.debugLine="If data1 < initialData1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("<",main._data1,BA.numberCast(double.class, main._initialdata1))) { 
 BA.debugLineNum = 701;BA.debugLine="AddToHistory(pill_naim1,date&\"  \"&time)";
Debug.ShouldStop(268435456);
_addtohistory(main._pill_naim1,RemoteObject.concat(main.mostCurrent._date,RemoteObject.createImmutable("  "),main.mostCurrent._time));
 BA.debugLineNum = 704;BA.debugLine="initialData1 = data1";
Debug.ShouldStop(-2147483648);
main._initialdata1 = main._data1;
 };
 BA.debugLineNum = 706;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkpillcount2() throws Exception{
try {
		Debug.PushSubsStack("CheckPillCount2 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,708);
if (RapidSub.canDelegate("checkpillcount2")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","checkpillcount2");}
 BA.debugLineNum = 708;BA.debugLine="Sub CheckPillCount2";
Debug.ShouldStop(8);
 BA.debugLineNum = 709;BA.debugLine="If data2 < initialData2 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",main._data2,BA.numberCast(double.class, main._initialdata2))) { 
 BA.debugLineNum = 712;BA.debugLine="AddToHistory(pill_naim2,date&\"  \"&time)";
Debug.ShouldStop(128);
_addtohistory(main._pill_naim2,RemoteObject.concat(main.mostCurrent._date,RemoteObject.createImmutable("  "),main.mostCurrent._time));
 BA.debugLineNum = 715;BA.debugLine="initialData2 = data2";
Debug.ShouldStop(1024);
main._initialdata2 = main._data2;
 };
 BA.debugLineNum = 717;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkpillcount3() throws Exception{
try {
		Debug.PushSubsStack("CheckPillCount3 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,719);
if (RapidSub.canDelegate("checkpillcount3")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","checkpillcount3");}
 BA.debugLineNum = 719;BA.debugLine="Sub CheckPillCount3";
Debug.ShouldStop(16384);
 BA.debugLineNum = 720;BA.debugLine="If data3 < initialData3 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("<",main._data3,BA.numberCast(double.class, main._initialdata3))) { 
 BA.debugLineNum = 723;BA.debugLine="AddToHistory(pill_naim3,date&\"  \"&time)";
Debug.ShouldStop(262144);
_addtohistory(main._pill_naim3,RemoteObject.concat(main.mostCurrent._date,RemoteObject.createImmutable("  "),main.mostCurrent._time));
 BA.debugLineNum = 726;BA.debugLine="initialData3 = data3";
Debug.ShouldStop(2097152);
main._initialdata3 = main._data3;
 };
 BA.debugLineNum = 728;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkpillcount4() throws Exception{
try {
		Debug.PushSubsStack("CheckPillCount4 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,730);
if (RapidSub.canDelegate("checkpillcount4")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","checkpillcount4");}
 BA.debugLineNum = 730;BA.debugLine="Sub CheckPillCount4";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 731;BA.debugLine="If data4 < initialData4 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("<",main._data4,BA.numberCast(double.class, main._initialdata4))) { 
 BA.debugLineNum = 734;BA.debugLine="AddToHistory(pill_naim4,date&\"  \"&time)";
Debug.ShouldStop(536870912);
_addtohistory(main._pill_naim4,RemoteObject.concat(main.mostCurrent._date,RemoteObject.createImmutable("  "),main.mostCurrent._time));
 BA.debugLineNum = 737;BA.debugLine="initialData4 = data4";
Debug.ShouldStop(1);
main._initialdata4 = main._data4;
 };
 BA.debugLineNum = 739;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("connectWIFI (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,343);
if (RapidSub.canDelegate("connectwifi")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","connectwifi", _btn);}
RemoteObject _gd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
Debug.locals.put("btn", _btn);
 BA.debugLineNum = 343;BA.debugLine="Sub connectWIFI(btn As Button)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="Dim gd As GradientDrawable";
Debug.ShouldStop(8388608);
_gd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 345;BA.debugLine="gd.Initialize(\"LEFT_RIGHT\", Array As Int( 0x0022D";
Debug.ShouldStop(16777216);
_gd.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"LEFT_RIGHT")),(Object)(RemoteObject.createNewArray("int",new int[] {3},new Object[] {BA.numberCast(int.class, ((int)0x0022d700)),BA.numberCast(int.class, ((int)0xff22d700)),BA.numberCast(int.class, ((int)0x0022d700))})));
 BA.debugLineNum = 346;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
Debug.ShouldStop(33554432);
_gd.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 347;BA.debugLine="btn.Background = gd";
Debug.ShouldStop(67108864);
_btn.runMethod(false,"setBackground",(_gd.getObject()));
 BA.debugLineNum = 348;BA.debugLine="btn.Text = \"اتصال برقرار شد\"";
Debug.ShouldStop(134217728);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence("اتصال برقرار شد"));
 BA.debugLineNum = 349;BA.debugLine="btn.TextColor = Colors.White";
Debug.ShouldStop(268435456);
_btn.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 350;BA.debugLine="btn.TextSize = 18";
Debug.ShouldStop(536870912);
_btn.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("disconnectSocket (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,678);
if (RapidSub.canDelegate("disconnectsocket")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","disconnectsocket", _socket11);}
Debug.locals.put("socket11", _socket11);
 BA.debugLineNum = 678;BA.debugLine="Sub disconnectSocket(socket11 As Socket)";
Debug.ShouldStop(32);
 BA.debugLineNum = 680;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 681;BA.debugLine="If socket11.Connected Then";
Debug.ShouldStop(256);
if (_socket11.runMethod(true,"getConnected").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 682;BA.debugLine="socket11.Close ' بستن اتصال سوکت";
Debug.ShouldStop(512);
_socket11.runVoidMethod ("Close");
 BA.debugLineNum = 683;BA.debugLine="astreams.Close ' بستن استریم‌ها";
Debug.ShouldStop(1024);
main._astreams.runVoidMethod ("Close");
 BA.debugLineNum = 684;BA.debugLine="Log(\"ارتباط قطع شد\")";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("LogImpl","51245190",RemoteObject.createImmutable("ارتباط قطع شد"),0);
 BA.debugLineNum = 685;BA.debugLine="disconnectWIFI(setconnect1)";
Debug.ShouldStop(4096);
_disconnectwifi(main.mostCurrent._setconnect1);
 BA.debugLineNum = 686;BA.debugLine="ToastMessageShow(\"ارتباط قطع شد\", True)";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ارتباط قطع شد")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 688;BA.debugLine="socket11.Initialize(\"socket1\")";
Debug.ShouldStop(32768);
_socket11.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("socket1")));
 BA.debugLineNum = 689;BA.debugLine="setconnect1.Enabled = True ' فعال کردن دکمه اتصا";
Debug.ShouldStop(65536);
main.mostCurrent._setconnect1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e12.toString()); BA.debugLineNum = 691;BA.debugLine="Log(\"خطا در قطع اتصال\")";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("LogImpl","51245197",RemoteObject.createImmutable("خطا در قطع اتصال"),0);
 };
 BA.debugLineNum = 694;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("disconnectWIFI (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,353);
if (RapidSub.canDelegate("disconnectwifi")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","disconnectwifi", _btn);}
RemoteObject _gd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
Debug.locals.put("btn", _btn);
 BA.debugLineNum = 353;BA.debugLine="Sub disconnectWIFI(btn As Button)";
Debug.ShouldStop(1);
 BA.debugLineNum = 354;BA.debugLine="Dim gd As GradientDrawable";
Debug.ShouldStop(2);
_gd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 355;BA.debugLine="gd.Initialize(\"LEFT_RIGHT\", Array As Int( 0x0022D";
Debug.ShouldStop(4);
_gd.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"LEFT_RIGHT")),(Object)(RemoteObject.createNewArray("int",new int[] {3},new Object[] {BA.numberCast(int.class, ((int)0x0022d700)),BA.numberCast(int.class, ((int)0xffd7000a)),BA.numberCast(int.class, ((int)0x0022d700))})));
 BA.debugLineNum = 356;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
Debug.ShouldStop(8);
_gd.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 357;BA.debugLine="btn.Background = gd";
Debug.ShouldStop(16);
_btn.runMethod(false,"setBackground",(_gd.getObject()));
 BA.debugLineNum = 358;BA.debugLine="btn.Text = \"برای اتصال کلیک کنید\"";
Debug.ShouldStop(32);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence("برای اتصال کلیک کنید"));
 BA.debugLineNum = 359;BA.debugLine="btn.TextColor = Colors.White";
Debug.ShouldStop(64);
_btn.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 360;BA.debugLine="btn.TextSize = 18";
Debug.ShouldStop(128);
_btn.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 361;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 60;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 63;BA.debugLine="Private Label17 As Label";
main.mostCurrent._label17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private Panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private Label2 As Label";
main.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private Label3 As Label";
main.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private Label4 As Label";
main.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private Label11 As Label";
main.mostCurrent._label11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private Panel5 As Panel";
main.mostCurrent._panel5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private ListView1 As ListView";
main.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Dim historyFile As String = \"history.txt\" 'نام فا";
main.mostCurrent._historyfile = BA.ObjectToString("history.txt");
 //BA.debugLineNum = 75;BA.debugLine="Private Panel2 As Panel";
main.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Private Label5 As Label";
main.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private Label6 As Label";
main.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private Label7 As Label";
main.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private Label8 As Label";
main.mostCurrent._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private Panel3 As Panel";
main.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private Label9 As Label";
main.mostCurrent._label9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private Label10 As Label";
main.mostCurrent._label10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private Label12 As Label";
main.mostCurrent._label12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private Label13 As Label";
main.mostCurrent._label13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private Panel4 As Panel";
main.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private Label14 As Label";
main.mostCurrent._label14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private Label15 As Label";
main.mostCurrent._label15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private Label16 As Label";
main.mostCurrent._label16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private Label18 As Label";
main.mostCurrent._label18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private Label19 As Label";
main.mostCurrent._label19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private Label21 As Label";
main.mostCurrent._label21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Private Label20 As Label";
main.mostCurrent._label20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Private Imagepill1 As ImageView";
main.mostCurrent._imagepill1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private Imagepill2 As ImageView";
main.mostCurrent._imagepill2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private Imagepill3 As ImageView";
main.mostCurrent._imagepill3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 98;BA.debugLine="Private Imagepill4 As ImageView";
main.mostCurrent._imagepill4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Private setconnect1 As Button";
main.mostCurrent._setconnect1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private pattern1 As String = \"p1cs(\\d+)p1ce\"  ' ب";
main.mostCurrent._pattern1 = BA.ObjectToString("p1cs(\\d+)p1ce");
 //BA.debugLineNum = 107;BA.debugLine="Private pattern2 As String = \"p2cs(\\d+)p2ce\"  ' ب";
main.mostCurrent._pattern2 = BA.ObjectToString("p2cs(\\d+)p2ce");
 //BA.debugLineNum = 108;BA.debugLine="Private pattern3 As String = \"p3cs(\\d+)p3ce\"  ' ب";
main.mostCurrent._pattern3 = BA.ObjectToString("p3cs(\\d+)p3ce");
 //BA.debugLineNum = 109;BA.debugLine="Private pattern4 As String = \"p4cs(\\d+)p4ce\"  ' ب";
main.mostCurrent._pattern4 = BA.ObjectToString("p4cs(\\d+)p4ce");
 //BA.debugLineNum = 111;BA.debugLine="Private pattern5 As String = \"p1ts(\\d+)p1te\"  ' ب";
main.mostCurrent._pattern5 = BA.ObjectToString("p1ts(\\d+)p1te");
 //BA.debugLineNum = 112;BA.debugLine="Private pattern6 As String = \"p2ts(\\d+)p2te\"  ' ب";
main.mostCurrent._pattern6 = BA.ObjectToString("p2ts(\\d+)p2te");
 //BA.debugLineNum = 113;BA.debugLine="Private pattern7 As String = \"p3ts(\\d+)p3te\"  ' ب";
main.mostCurrent._pattern7 = BA.ObjectToString("p3ts(\\d+)p3te");
 //BA.debugLineNum = 114;BA.debugLine="Private pattern8 As String = \"p4ts(\\d+)p4te\"  ' ب";
main.mostCurrent._pattern8 = BA.ObjectToString("p4ts(\\d+)p4te");
 //BA.debugLineNum = 116;BA.debugLine="Private pattern9 As String = \"als(\\d+)ale\"  ' برا";
main.mostCurrent._pattern9 = BA.ObjectToString("als(\\d+)ale");
 //BA.debugLineNum = 120;BA.debugLine="Private data1 As Int = 0";
main._data1 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 121;BA.debugLine="Private data2 As Int = 0";
main._data2 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 122;BA.debugLine="Private data3 As Int = 0";
main._data3 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 123;BA.debugLine="Private data4 As Int = 0";
main._data4 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 125;BA.debugLine="Private data5 As Int";
main._data5 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 126;BA.debugLine="Private data6 As Int";
main._data6 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 127;BA.debugLine="Private data7 As Int";
main._data7 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 128;BA.debugLine="Private data8 As Int";
main._data8 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 130;BA.debugLine="Private data9 As Int =-1";
main._data9 = BA.numberCast(int.class, -(double) (0 + 1));
 //BA.debugLineNum = 134;BA.debugLine="Private Matcher As Matcher";
main.mostCurrent._matcher = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
 //BA.debugLineNum = 137;BA.debugLine="Dim label_size1 As Int";
main._label_size1 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 138;BA.debugLine="Dim label_size2 As Int";
main._label_size2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 139;BA.debugLine="Dim label_size3 As Int";
main._label_size3 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 140;BA.debugLine="Dim label_size4 As Int";
main._label_size4 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 143;BA.debugLine="Dim initialData1 As Int 'ذخیره مقدار اولیه data1";
main._initialdata1 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 144;BA.debugLine="Dim initialData2 As Int 'ذخیره مقدار اولیه data2";
main._initialdata2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 145;BA.debugLine="Dim initialData3 As Int 'ذخیره مقدار اولیه data3";
main._initialdata3 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 146;BA.debugLine="Dim initialData4 As Int 'ذخیره مقدار اولیه data4";
main._initialdata4 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 150;BA.debugLine="Dim rp As RuntimePermissions";
main.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 152;BA.debugLine="Private ScrollingLabel1 As ScrollingLabel";
main.mostCurrent._scrollinglabel1 = RemoteObject.createNew ("Pill_Box.v1.scrollinglabel");
 //BA.debugLineNum = 153;BA.debugLine="Private B4XFloatTextField1 As B4XFloatTextField";
main.mostCurrent._b4xfloattextfield1 = RemoteObject.createNew ("Pill_Box.v1.b4xfloattextfield");
 //BA.debugLineNum = 156;BA.debugLine="Dim lblTime As Label";
main.mostCurrent._lbltime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 157;BA.debugLine="Dim lblDate As Label";
main.mostCurrent._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 160;BA.debugLine="Dim currentTime As Long = DateTime.Now";
main._currenttime = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");
 //BA.debugLineNum = 161;BA.debugLine="Dim hour As Int = DateTime.GetHour(currentTime) '";
main._hour = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(main._currenttime));
 //BA.debugLineNum = 162;BA.debugLine="Dim minute As Int = DateTime.GetMinute(currentTim";
main._minute = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(main._currenttime));
 //BA.debugLineNum = 165;BA.debugLine="Dim currentDate As Long = DateTime.Now";
main._currentdate = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");
 //BA.debugLineNum = 166;BA.debugLine="Dim day As Int = DateTime.GetDayOfMonth(currentDa";
main._day = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(main._currentdate));
 //BA.debugLineNum = 167;BA.debugLine="Dim month As Int = DateTime.GetMonth(currentDate)";
main._month = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(main._currentdate));
 //BA.debugLineNum = 170;BA.debugLine="Dim time As String = hour & \":\" & NumberFormat(mi";
main.mostCurrent._time = RemoteObject.concat(main._hour,RemoteObject.createImmutable(":"),main.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, main._minute)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 //BA.debugLineNum = 171;BA.debugLine="Dim date As String = day & \"/\" & month";
main.mostCurrent._date = RemoteObject.concat(main._day,RemoteObject.createImmutable("/"),main._month);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _histori(RemoteObject _lb) throws Exception{
try {
		Debug.PushSubsStack("histori (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,363);
if (RapidSub.canDelegate("histori")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","histori", _lb);}
RemoteObject _gd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
Debug.locals.put("lb", _lb);
 BA.debugLineNum = 363;BA.debugLine="Sub histori(lb As Label)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 364;BA.debugLine="Dim gd As GradientDrawable";
Debug.ShouldStop(2048);
_gd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 365;BA.debugLine="gd.Initialize(\"TOP_BOTTOM\", Array As Int( 0x00000";
Debug.ShouldStop(4096);
_gd.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(RemoteObject.createNewArray("int",new int[] {5},new Object[] {BA.numberCast(int.class, ((int)0x00000000)),BA.numberCast(int.class, ((int)0x9b000000)),BA.numberCast(int.class, ((int)0xca000000)),BA.numberCast(int.class, ((int)0xca000000)),BA.numberCast(int.class, ((int)0xff000000))})));
 BA.debugLineNum = 366;BA.debugLine="gd.CornerRadius = 0dip ' تنظیم گوشه‌های گرد";
Debug.ShouldStop(8192);
_gd.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 367;BA.debugLine="lb.Background = gd";
Debug.ShouldStop(16384);
_lb.runMethod(false,"setBackground",(_gd.getObject()));
 BA.debugLineNum = 368;BA.debugLine="lb.Text = \"تاریخچه مصرف دارو\"";
Debug.ShouldStop(32768);
_lb.runMethod(true,"setText",BA.ObjectToCharSequence("تاریخچه مصرف دارو"));
 BA.debugLineNum = 369;BA.debugLine="lb.TextColor = Colors.Black";
Debug.ShouldStop(65536);
_lb.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 370;BA.debugLine="lb.TextSize = 22";
Debug.ShouldStop(131072);
_lb.runMethod(true,"setTextSize",BA.numberCast(float.class, 22));
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
public static RemoteObject  _label14_click() throws Exception{
try {
		Debug.PushSubsStack("Label14_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,420);
if (RapidSub.canDelegate("label14_click")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","label14_click");}
 BA.debugLineNum = 420;BA.debugLine="Private Sub Label14_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 422;BA.debugLine="StartActivity(\"pill_4\")";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_4"))));
 BA.debugLineNum = 425;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Label2_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,396);
if (RapidSub.canDelegate("label2_click")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","label2_click");}
 BA.debugLineNum = 396;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 398;BA.debugLine="StartActivity(\"pill_1\")";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_1"))));
 BA.debugLineNum = 401;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Label5_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,404);
if (RapidSub.canDelegate("label5_click")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","label5_click");}
 BA.debugLineNum = 404;BA.debugLine="Private Sub Label5_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 406;BA.debugLine="StartActivity(\"pill_2\")";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_2"))));
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Label9_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,412);
if (RapidSub.canDelegate("label9_click")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","label9_click");}
 BA.debugLineNum = 412;BA.debugLine="Private Sub Label9_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 414;BA.debugLine="StartActivity(\"pill_3\")";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_3"))));
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listview1_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemLongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,850);
if (RapidSub.canDelegate("listview1_itemlongclick")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","listview1_itemlongclick", _position, _value);}
RemoteObject _res = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 850;BA.debugLine="Sub ListView1_ItemLongClick(Position As Int, Value";
Debug.ShouldStop(131072);
 BA.debugLineNum = 851;BA.debugLine="Dim res As Int";
Debug.ShouldStop(262144);
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 852;BA.debugLine="res = Msgbox2(\"آیا می‌خواهید این آیتم حذف شود؟\",";
Debug.ShouldStop(524288);
_res = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("آیا می‌خواهید این آیتم حذف شود؟")),(Object)(BA.ObjectToCharSequence("حذف آیتم")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("res", _res);
 BA.debugLineNum = 854;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 855;BA.debugLine="ListView1.RemoveAt(Position) ' حذف آیتم از ListV";
Debug.ShouldStop(4194304);
main.mostCurrent._listview1.runVoidMethod ("RemoveAt",(Object)(_position));
 BA.debugLineNum = 856;BA.debugLine="Log(\"آیتم حذف شد: \" & Value)";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("LogImpl","527656198",RemoteObject.concat(RemoteObject.createImmutable("آیتم حذف شد: "),_value),0);
 };
 BA.debugLineNum = 858;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadhistory() throws Exception{
try {
		Debug.PushSubsStack("LoadHistory (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,758);
if (RapidSub.canDelegate("loadhistory")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","loadhistory");}
RemoteObject _reader = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
RemoteObject _line = RemoteObject.createImmutable("");
 BA.debugLineNum = 758;BA.debugLine="Sub LoadHistory";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 759;BA.debugLine="If File.Exists(File.DirInternal, historyFile) The";
Debug.ShouldStop(4194304);
if (main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(main.mostCurrent._historyfile)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 760;BA.debugLine="Dim reader As TextReader";
Debug.ShouldStop(8388608);
_reader = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");Debug.locals.put("reader", _reader);
 BA.debugLineNum = 761;BA.debugLine="reader.Initialize(File.OpenInput(File.DirInterna";
Debug.ShouldStop(16777216);
_reader.runVoidMethod ("Initialize",(Object)((main.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(main.mostCurrent._historyfile)).getObject())));
 BA.debugLineNum = 763;BA.debugLine="Dim line As String";
Debug.ShouldStop(67108864);
_line = RemoteObject.createImmutable("");Debug.locals.put("line", _line);
 BA.debugLineNum = 764;BA.debugLine="line = reader.ReadLine";
Debug.ShouldStop(134217728);
_line = _reader.runMethod(true,"ReadLine");Debug.locals.put("line", _line);
 BA.debugLineNum = 765;BA.debugLine="Do While line <> Null";
Debug.ShouldStop(268435456);
while (RemoteObject.solveBoolean("N",_line)) {
 BA.debugLineNum = 766;BA.debugLine="ListView1.AddSingleLine(line) 'افزودن هر خط به";
Debug.ShouldStop(536870912);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(_line)));
 BA.debugLineNum = 767;BA.debugLine="ListView1.FastScrollEnabled=True";
Debug.ShouldStop(1073741824);
main.mostCurrent._listview1.runMethod(true,"setFastScrollEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 769;BA.debugLine="line = reader.ReadLine";
Debug.ShouldStop(1);
_line = _reader.runMethod(true,"ReadLine");Debug.locals.put("line", _line);
 }
;
 BA.debugLineNum = 771;BA.debugLine="reader.Close";
Debug.ShouldStop(4);
_reader.runVoidMethod ("Close");
 };
 BA.debugLineNum = 773;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
starter_subs_0._process_globals();
naseri_func_subs_0._process_globals();
imgview_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("Pill_Box.v1.main");
pill_1.myClass = BA.getDeviceClass ("Pill_Box.v1.pill_1");
pill_2.myClass = BA.getDeviceClass ("Pill_Box.v1.pill_2");
pill_3.myClass = BA.getDeviceClass ("Pill_Box.v1.pill_3");
pill_4.myClass = BA.getDeviceClass ("Pill_Box.v1.pill_4");
starter.myClass = BA.getDeviceClass ("Pill_Box.v1.starter");
naseri_func.myClass = BA.getDeviceClass ("Pill_Box.v1.naseri_func");
imgview.myClass = BA.getDeviceClass ("Pill_Box.v1.imgview");
animatedcounter.myClass = BA.getDeviceClass ("Pill_Box.v1.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("Pill_Box.v1.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("Pill_Box.v1.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("Pill_Box.v1.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("Pill_Box.v1.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("Pill_Box.v1.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("Pill_Box.v1.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("Pill_Box.v1.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("Pill_Box.v1.xuiviewsutils");
		
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
 //BA.debugLineNum = 56;BA.debugLine="Dim Timer1 As Timer";
main._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savetofile(RemoteObject _historyitem) throws Exception{
try {
		Debug.PushSubsStack("SaveToFile (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,751);
if (RapidSub.canDelegate("savetofile")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","savetofile", _historyitem);}
RemoteObject _writer = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");
Debug.locals.put("historyItem", _historyitem);
 BA.debugLineNum = 751;BA.debugLine="Sub SaveToFile(historyItem As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 752;BA.debugLine="Dim writer As TextWriter";
Debug.ShouldStop(32768);
_writer = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");Debug.locals.put("writer", _writer);
 BA.debugLineNum = 753;BA.debugLine="writer.Initialize(File.OpenOutput(File.DirInterna";
Debug.ShouldStop(65536);
_writer.runVoidMethod ("Initialize",(Object)((main.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(main.mostCurrent._historyfile),(Object)(main.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 754;BA.debugLine="writer.WriteLine(historyItem) 'نوشتن هر آیتم در ف";
Debug.ShouldStop(131072);
_writer.runVoidMethod ("WriteLine",(Object)(_historyitem));
 BA.debugLineNum = 755;BA.debugLine="writer.Close";
Debug.ShouldStop(262144);
_writer.runVoidMethod ("Close");
 BA.debugLineNum = 756;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgrounddrawable(RemoteObject _view,RemoteObject _color,RemoteObject _cornerradius) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundDrawable (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,332);
if (RapidSub.canDelegate("setbackgrounddrawable")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","setbackgrounddrawable", _view, _color, _cornerradius);}
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
Debug.locals.put("view", _view);
Debug.locals.put("color", _color);
Debug.locals.put("cornerRadius", _cornerradius);
 BA.debugLineNum = 332;BA.debugLine="Sub SetBackgroundDrawable(view As View, color As I";
Debug.ShouldStop(2048);
 BA.debugLineNum = 333;BA.debugLine="Dim bg As GradientDrawable";
Debug.ShouldStop(4096);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 334;BA.debugLine="bg.Initialize(\"TOP_BOTTOM\", Array As Int(color, c";
Debug.ShouldStop(8192);
_bg.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {_color,_color})));
 BA.debugLineNum = 335;BA.debugLine="bg.CornerRadius = cornerRadius";
Debug.ShouldStop(16384);
_bg.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, _cornerradius));
 BA.debugLineNum = 336;BA.debugLine="view.Background = bg";
Debug.ShouldStop(32768);
_view.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("setconnect1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,374);
if (RapidSub.canDelegate("setconnect1_click")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","setconnect1_click");}
 BA.debugLineNum = 374;BA.debugLine="Private Sub setconnect1_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 375;BA.debugLine="Log(  \"key presed\")";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5720897",RemoteObject.createImmutable("key presed"),0);
 BA.debugLineNum = 377;BA.debugLine="If socket1.IsInitialized = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main._socket1.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 378;BA.debugLine="Log(\"سوکت مقداردهی شد.\")";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5720900",RemoteObject.createImmutable("سوکت مقداردهی شد."),0);
 BA.debugLineNum = 379;BA.debugLine="socket1.Initialize(\"socket1\")";
Debug.ShouldStop(67108864);
main._socket1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("socket1")));
 };
 BA.debugLineNum = 382;BA.debugLine="If socket1.Connected Then";
Debug.ShouldStop(536870912);
if (main._socket1.runMethod(true,"getConnected").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 383;BA.debugLine="Log(\"درحال قطع اتصال...\")";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5720905",RemoteObject.createImmutable("درحال قطع اتصال..."),0);
 BA.debugLineNum = 384;BA.debugLine="disconnectSocket(socket1)";
Debug.ShouldStop(-2147483648);
_disconnectsocket(main._socket1);
 }else {
 BA.debugLineNum = 388;BA.debugLine="Log(\"درحال اتصال...\")";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5720910",RemoteObject.createImmutable("درحال اتصال..."),0);
 BA.debugLineNum = 389;BA.debugLine="ProgressDialogShow2(\"درحال اتصال...\", False)";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("درحال اتصال...")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 391;BA.debugLine="socket1.Connect(\"192.168.4.1\", 8888, 5000)";
Debug.ShouldStop(64);
main._socket1.runVoidMethod ("Connect",main.processBA,(Object)(BA.ObjectToString("192.168.4.1")),(Object)(BA.numberCast(int.class, 8888)),(Object)(BA.numberCast(int.class, 5000)));
 };
 BA.debugLineNum = 393;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("SetupEditLabel (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,315);
if (RapidSub.canDelegate("setupeditlabel")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","setupeditlabel", _lbl);}
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 315;BA.debugLine="Sub SetupEditLabel(lbl As Label)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 316;BA.debugLine="lbl.Text = \"ویرایش\"";
Debug.ShouldStop(134217728);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence("ویرایش"));
 BA.debugLineNum = 317;BA.debugLine="lbl.Color = Colors.LightGray";
Debug.ShouldStop(268435456);
_lbl.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 318;BA.debugLine="lbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(536870912);
_lbl.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 319;BA.debugLine="lbl.TextSize = 16";
Debug.ShouldStop(1073741824);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 320;BA.debugLine="lbl.TextColor = Colors.Black";
Debug.ShouldStop(-2147483648);
_lbl.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("SetupProgressBar (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,308);
if (RapidSub.canDelegate("setupprogressbar")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","setupprogressbar", _lbl, _color, _progress);}
Debug.locals.put("lbl", _lbl);
Debug.locals.put("color", _color);
Debug.locals.put("progress", _progress);
 BA.debugLineNum = 308;BA.debugLine="Sub SetupProgressBar(lbl As Label, color As Int, p";
Debug.ShouldStop(524288);
 BA.debugLineNum = 309;BA.debugLine="lbl.Color = Colors.Red";
Debug.ShouldStop(1048576);
_lbl.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 310;BA.debugLine="SetBackgroundDrawable(lbl, color, 10dip)";
Debug.ShouldStop(2097152);
_setbackgrounddrawable(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _lbl.getObject()),_color,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));
 BA.debugLineNum = 311;BA.debugLine="UpdateProgressBar(lbl, progress)";
Debug.ShouldStop(4194304);
_updateprogressbar(_lbl,_progress);
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Socket1_Connected (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,428);
if (RapidSub.canDelegate("socket1_connected")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","socket1_connected", _connected);}
Debug.locals.put("Connected", _connected);
 BA.debugLineNum = 428;BA.debugLine="Sub Socket1_Connected(Connected As Boolean)As Bool";
Debug.ShouldStop(2048);
 BA.debugLineNum = 430;BA.debugLine="If Connected = True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_connected,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 431;BA.debugLine="ToastMessageShow(\"ارتباط برقرار شد\",True)";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ارتباط برقرار شد")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 432;BA.debugLine="astreams.Initialize(socket1.InputStream, socket1";
Debug.ShouldStop(32768);
main._astreams.runVoidMethod ("Initialize",main.processBA,(Object)(main._socket1.runMethod(false,"getInputStream")),(Object)(main._socket1.runMethod(false,"getOutputStream")),(Object)(RemoteObject.createImmutable("AStreams")));
 BA.debugLineNum = 433;BA.debugLine="viber.Vibrate(50)";
Debug.ShouldStop(65536);
main._viber.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 50)));
 BA.debugLineNum = 435;BA.debugLine="connectWIFI(setconnect1)";
Debug.ShouldStop(262144);
_connectwifi(main.mostCurrent._setconnect1);
 }else {
 BA.debugLineNum = 438;BA.debugLine="ToastMessageShow(\"مشکلی رخ داده است\",True)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مشکلی رخ داده است")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 440;BA.debugLine="disconnectWIFI(setconnect1)";
Debug.ShouldStop(8388608);
_disconnectwifi(main.mostCurrent._setconnect1);
 BA.debugLineNum = 441;BA.debugLine="viber.Vibrate(500)";
Debug.ShouldStop(16777216);
main._viber.runVoidMethod ("Vibrate",main.processBA,(Object)(BA.numberCast(long.class, 500)));
 };
 BA.debugLineNum = 444;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 446;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("timer1_tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,775);
if (RapidSub.canDelegate("timer1_tick")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","timer1_tick");}
 BA.debugLineNum = 775;BA.debugLine="Sub timer1_tick";
Debug.ShouldStop(64);
 BA.debugLineNum = 777;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 779;BA.debugLine="pill_naim1 = File.ReadString(File.DirInternal, \"p";
Debug.ShouldStop(1024);
main._pill_naim1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim1.txt")));
 BA.debugLineNum = 780;BA.debugLine="Label18.Text=(pill_naim1)";
Debug.ShouldStop(2048);
main.mostCurrent._label18.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim1)));
 BA.debugLineNum = 782;BA.debugLine="pill_naim2 = File.ReadString(File.DirInternal, \"p";
Debug.ShouldStop(8192);
main._pill_naim2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim2.txt")));
 BA.debugLineNum = 783;BA.debugLine="Label19.Text=(pill_naim2)";
Debug.ShouldStop(16384);
main.mostCurrent._label19.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim2)));
 BA.debugLineNum = 785;BA.debugLine="pill_naim3 = File.ReadString(File.DirInternal, \"p";
Debug.ShouldStop(65536);
main._pill_naim3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim3.txt")));
 BA.debugLineNum = 786;BA.debugLine="Label20.Text=(pill_naim3)";
Debug.ShouldStop(131072);
main.mostCurrent._label20.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim3)));
 BA.debugLineNum = 788;BA.debugLine="pill_naim4 = File.ReadString(File.DirInternal, \"p";
Debug.ShouldStop(524288);
main._pill_naim4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim4.txt")));
 BA.debugLineNum = 789;BA.debugLine="Label21.Text=(pill_naim4)";
Debug.ShouldStop(1048576);
main.mostCurrent._label21.runMethod(true,"setText",BA.ObjectToCharSequence((main._pill_naim4)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e11.toString()); };
 BA.debugLineNum = 795;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill1.png\"";
Debug.ShouldStop(67108864);
if (main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill1.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 797;BA.debugLine="Imagepill1.Bitmap = LoadBitmap(File.DirInternal,";
Debug.ShouldStop(268435456);
main.mostCurrent._imagepill1.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill1.png"))).getObject()));
 }else {
 };
 BA.debugLineNum = 803;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill2.png\"";
Debug.ShouldStop(4);
if (main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill2.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 805;BA.debugLine="Imagepill2.Bitmap = LoadBitmap(File.DirInternal,";
Debug.ShouldStop(16);
main.mostCurrent._imagepill2.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill2.png"))).getObject()));
 }else {
 };
 BA.debugLineNum = 811;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill3.png\"";
Debug.ShouldStop(1024);
if (main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill3.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 813;BA.debugLine="Imagepill3.Bitmap = LoadBitmap(File.DirInternal,";
Debug.ShouldStop(4096);
main.mostCurrent._imagepill3.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill3.png"))).getObject()));
 }else {
 };
 BA.debugLineNum = 819;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill4.png\"";
Debug.ShouldStop(262144);
if (main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill4.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 821;BA.debugLine="Imagepill4.Bitmap = LoadBitmap(File.DirInternal,";
Debug.ShouldStop(1048576);
main.mostCurrent._imagepill4.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill4.png"))).getObject()));
 }else {
 };
 BA.debugLineNum = 826;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateprogressbar(RemoteObject _lbl,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("UpdateProgressBar (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,325);
if (RapidSub.canDelegate("updateprogressbar")) { return Pill_Box.v1.main.remoteMe.runUserSub(false, "main","updateprogressbar", _lbl, _progress);}
RemoteObject _totalwidth = RemoteObject.createImmutable(0);
RemoteObject _newwidth = RemoteObject.createImmutable(0);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("progress", _progress);
 BA.debugLineNum = 325;BA.debugLine="Sub UpdateProgressBar(lbl As Label, progress As In";
Debug.ShouldStop(16);
 BA.debugLineNum = 326;BA.debugLine="Dim totalWidth As Int = lbl.Width";
Debug.ShouldStop(32);
_totalwidth = _lbl.runMethod(true,"getWidth");Debug.locals.put("totalWidth", _totalwidth);Debug.locals.put("totalWidth", _totalwidth);
 BA.debugLineNum = 327;BA.debugLine="Dim newWidth As Int = (totalWidth * progress) / 1";
Debug.ShouldStop(64);
_newwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_totalwidth,_progress}, "*",0, 1)),RemoteObject.createImmutable(100)}, "/",0, 0));Debug.locals.put("newWidth", _newwidth);Debug.locals.put("newWidth", _newwidth);
 BA.debugLineNum = 328;BA.debugLine="lbl.Width = newWidth";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setWidth",_newwidth);
 BA.debugLineNum = 329;BA.debugLine="End Sub";
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
package pill.boxV1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,71);
if (RapidSub.canDelegate("activity_create")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 71;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(256);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 77;BA.debugLine="Timer1.Initialize(\"Timer1\", 500)";
Debug.ShouldStop(4096);
main._timer1.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 500)));
 BA.debugLineNum = 78;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(8192);
main._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,180);
if (RapidSub.canDelegate("activity_pause")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 180;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 182;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(2097152);
main._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,174);
if (RapidSub.canDelegate("activity_resume")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 174;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 176;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(32768);
main._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 52;BA.debugLine="Private Listbox1 As ListView";
main.mostCurrent._listbox1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private Listbox2 As ListView";
main.mostCurrent._listbox2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private Listbox3 As ListView";
main.mostCurrent._listbox3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private Listbox4 As ListView";
main.mostCurrent._listbox4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private Imagepill1 As ImageView";
main.mostCurrent._imagepill1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private Imagepill2 As ImageView";
main.mostCurrent._imagepill2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private Imagepill3 As ImageView";
main.mostCurrent._imagepill3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private Imagepill4 As ImageView";
main.mostCurrent._imagepill4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private Label2 As Label";
main.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private Label3 As Label";
main.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private Label4 As Label";
main.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private setconnect1 As Button";
main.mostCurrent._setconnect1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imagepill1_longclick() throws Exception{
try {
		Debug.PushSubsStack("Imagepill1_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,214);
if (RapidSub.canDelegate("imagepill1_longclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","imagepill1_longclick");}
 BA.debugLineNum = 214;BA.debugLine="Private Sub Imagepill1_LongClick";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 216;BA.debugLine="StartActivity(\"pill_1\")";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_1"))));
 BA.debugLineNum = 217;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Imagepill2_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,206);
if (RapidSub.canDelegate("imagepill2_longclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","imagepill2_longclick");}
 BA.debugLineNum = 206;BA.debugLine="Private Sub Imagepill2_LongClick";
Debug.ShouldStop(8192);
 BA.debugLineNum = 208;BA.debugLine="StartActivity(\"pill_2\")";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_2"))));
 BA.debugLineNum = 209;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
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
public static RemoteObject  _imagepill3_longclick() throws Exception{
try {
		Debug.PushSubsStack("Imagepill3_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,198);
if (RapidSub.canDelegate("imagepill3_longclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","imagepill3_longclick");}
 BA.debugLineNum = 198;BA.debugLine="Private Sub Imagepill3_LongClick";
Debug.ShouldStop(32);
 BA.debugLineNum = 200;BA.debugLine="StartActivity(\"pill_3\")";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_3"))));
 BA.debugLineNum = 201;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Imagepill4_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,189);
if (RapidSub.canDelegate("imagepill4_longclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","imagepill4_longclick");}
 BA.debugLineNum = 189;BA.debugLine="Private Sub Imagepill4_LongClick";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 191;BA.debugLine="StartActivity(\"pill_4\")";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_4"))));
 BA.debugLineNum = 192;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbox1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Listbox1_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,234);
if (RapidSub.canDelegate("listbox1_itemclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","listbox1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 234;BA.debugLine="Private Sub Listbox1_ItemClick (Position As Int, V";
Debug.ShouldStop(512);
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbox2_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Listbox2_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,230);
if (RapidSub.canDelegate("listbox2_itemclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","listbox2_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 230;BA.debugLine="Private Sub Listbox2_ItemClick (Position As Int, V";
Debug.ShouldStop(32);
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbox3_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Listbox3_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,226);
if (RapidSub.canDelegate("listbox3_itemclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","listbox3_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 226;BA.debugLine="Private Sub Listbox3_ItemClick (Position As Int, V";
Debug.ShouldStop(2);
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbox4_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Listbox4_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,222);
if (RapidSub.canDelegate("listbox4_itemclick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","listbox4_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 222;BA.debugLine="Private Sub Listbox4_ItemClick (Position As Int, V";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
setconnect_subs_0._process_globals();
naseri_func_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("pill.boxV1.main");
pill_1.myClass = BA.getDeviceClass ("pill.boxV1.pill_1");
pill_2.myClass = BA.getDeviceClass ("pill.boxV1.pill_2");
pill_3.myClass = BA.getDeviceClass ("pill.boxV1.pill_3");
pill_4.myClass = BA.getDeviceClass ("pill.boxV1.pill_4");
setconnect.myClass = BA.getDeviceClass ("pill.boxV1.setconnect");
naseri_func.myClass = BA.getDeviceClass ("pill.boxV1.naseri_func");
starter.myClass = BA.getDeviceClass ("pill.boxV1.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Dim pill_naim1 As String";
main._pill_naim1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Dim pill_count_box1 As String";
main._pill_count_box1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Dim start_time_1 As String";
main._start_time_1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim interval_1 As String";
main._interval_1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim box1_alarm As String";
main._box1_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Dim pill_naim2 As String";
main._pill_naim2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="Dim pill_count_box2 As String";
main._pill_count_box2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Dim start_time_2 As String";
main._start_time_2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Dim interval_2 As String";
main._interval_2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim box2_alarm As String";
main._box2_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Dim pill_naim3 As String";
main._pill_naim3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim pill_count_box3 As String";
main._pill_count_box3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Dim start_time_3 As String";
main._start_time_3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 34;BA.debugLine="Dim interval_3 As String";
main._interval_3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Dim box3_alarm As String";
main._box3_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 37;BA.debugLine="Dim pill_naim4 As String";
main._pill_naim4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 38;BA.debugLine="Dim pill_count_box4 As String";
main._pill_count_box4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Dim start_time_4 As String";
main._start_time_4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Dim interval_4 As String";
main._interval_4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 41;BA.debugLine="Dim box4_alarm As String";
main._box4_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 43;BA.debugLine="Dim Timer1 As Timer";
main._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setconnect1_click() throws Exception{
try {
		Debug.PushSubsStack("setconnect1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,242);
if (RapidSub.canDelegate("setconnect1_click")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","setconnect1_click");}
 BA.debugLineNum = 242;BA.debugLine="Private Sub setconnect1_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="StartActivity(\"setconnect\")";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("setconnect"))));
 BA.debugLineNum = 244;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,85);
if (RapidSub.canDelegate("timer1_tick")) { return pill.boxV1.main.remoteMe.runUserSub(false, "main","timer1_tick");}
 BA.debugLineNum = 85;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 91;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 93;BA.debugLine="pill_naim1 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(268435456);
main._pill_naim1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim1.txt")));
 BA.debugLineNum = 94;BA.debugLine="pill_count_box1 = File.ReadString(File.DirIntern";
Debug.ShouldStop(536870912);
main._pill_count_box1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_arduino.txt")));
 BA.debugLineNum = 95;BA.debugLine="start_time_1 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(1073741824);
main._start_time_1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_1.txt")));
 BA.debugLineNum = 96;BA.debugLine="interval_1 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(-2147483648);
main._interval_1 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_1.txt")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e7.toString()); };
 BA.debugLineNum = 107;BA.debugLine="Label1.Text=(\"(\"&pill_naim1&\")\")";
Debug.ShouldStop(1024);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("("),main._pill_naim1,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 108;BA.debugLine="Listbox1.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
Debug.ShouldStop(2048);
main.mostCurrent._listbox1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main._pill_count_box1,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 109;BA.debugLine="Listbox1.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
Debug.ShouldStop(4096);
main.mostCurrent._listbox1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box1_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 114;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 115;BA.debugLine="pill_naim2 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(262144);
main._pill_naim2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim2.txt")));
 BA.debugLineNum = 116;BA.debugLine="pill_count_box2 = File.ReadString(File.DirIntern";
Debug.ShouldStop(524288);
main._pill_count_box2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box2.txt")));
 BA.debugLineNum = 117;BA.debugLine="start_time_2 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(1048576);
main._start_time_2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_2.txt")));
 BA.debugLineNum = 118;BA.debugLine="interval_2 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(2097152);
main._interval_2 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_2.txt")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e17.toString()); };
 BA.debugLineNum = 126;BA.debugLine="Label2.Text=(\"(\"&pill_naim2&\")\")";
Debug.ShouldStop(536870912);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("("),main._pill_naim2,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 127;BA.debugLine="Listbox2.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
Debug.ShouldStop(1073741824);
main.mostCurrent._listbox2.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main._pill_count_box2,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 128;BA.debugLine="Listbox2.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
Debug.ShouldStop(-2147483648);
main.mostCurrent._listbox2.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box2_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 132;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 133;BA.debugLine="pill_naim3 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(16);
main._pill_naim3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim3.txt")));
 BA.debugLineNum = 134;BA.debugLine="pill_count_box3 = File.ReadString(File.DirIntern";
Debug.ShouldStop(32);
main._pill_count_box3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box3.txt")));
 BA.debugLineNum = 135;BA.debugLine="start_time_3 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(64);
main._start_time_3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_3.txt")));
 BA.debugLineNum = 136;BA.debugLine="interval_3 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(128);
main._interval_3 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_3.txt")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e27.toString()); };
 BA.debugLineNum = 144;BA.debugLine="Label3.Text=(\"(\"&pill_naim3&\")\")";
Debug.ShouldStop(32768);
main.mostCurrent._label3.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("("),main._pill_naim3,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 145;BA.debugLine="Listbox3.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
Debug.ShouldStop(65536);
main.mostCurrent._listbox3.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main._pill_count_box3,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 146;BA.debugLine="Listbox3.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
Debug.ShouldStop(131072);
main.mostCurrent._listbox3.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box3_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 150;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 151;BA.debugLine="pill_naim4 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(4194304);
main._pill_naim4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim4.txt")));
 BA.debugLineNum = 152;BA.debugLine="pill_count_box4 = File.ReadString(File.DirIntern";
Debug.ShouldStop(8388608);
main._pill_count_box4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box4.txt")));
 BA.debugLineNum = 153;BA.debugLine="start_time_4 = File.ReadString(File.DirInternal,";
Debug.ShouldStop(16777216);
main._start_time_4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_4.txt")));
 BA.debugLineNum = 154;BA.debugLine="interval_4 = File.ReadString(File.DirInternal, \"";
Debug.ShouldStop(33554432);
main._interval_4 = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_4.txt")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e37) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e37.toString()); };
 BA.debugLineNum = 162;BA.debugLine="Label4.Text=(\"(\"&pill_naim4&\")\")";
Debug.ShouldStop(2);
main.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("("),main._pill_naim4,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 163;BA.debugLine="Listbox4.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
Debug.ShouldStop(4);
main.mostCurrent._listbox4.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main._pill_count_box4,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 164;BA.debugLine="Listbox4.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
Debug.ShouldStop(8);
main.mostCurrent._listbox4.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box4_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
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
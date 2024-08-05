package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,49);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 55;BA.debugLine="pill_count_box1 = 3";
Debug.ShouldStop(4194304);
main._pill_count_box1 = BA.NumberToString(3);
 BA.debugLineNum = 56;BA.debugLine="box1_alarm =\"18:50\"";
Debug.ShouldStop(8388608);
main._box1_alarm = BA.ObjectToString("18:50");
 BA.debugLineNum = 61;BA.debugLine="Listbox1.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
Debug.ShouldStop(268435456);
main.mostCurrent._listbox1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main._pill_count_box1,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 62;BA.debugLine="Listbox1.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
Debug.ShouldStop(536870912);
main.mostCurrent._listbox1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box1_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 66;BA.debugLine="pill_count_box2 = 12";
Debug.ShouldStop(2);
main._pill_count_box2 = BA.NumberToString(12);
 BA.debugLineNum = 67;BA.debugLine="box2_alarm =\"9:30\"";
Debug.ShouldStop(4);
main._box2_alarm = BA.ObjectToString("9:30");
 BA.debugLineNum = 70;BA.debugLine="Listbox2.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
Debug.ShouldStop(32);
main.mostCurrent._listbox2.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main._pill_count_box2,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 71;BA.debugLine="Listbox2.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
Debug.ShouldStop(64);
main.mostCurrent._listbox2.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box2_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 74;BA.debugLine="pill_count_box3 = 5";
Debug.ShouldStop(512);
main._pill_count_box3 = BA.NumberToString(5);
 BA.debugLineNum = 75;BA.debugLine="box3_alarm =\"23:00\"";
Debug.ShouldStop(1024);
main._box3_alarm = BA.ObjectToString("23:00");
 BA.debugLineNum = 78;BA.debugLine="Listbox3.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
Debug.ShouldStop(8192);
main.mostCurrent._listbox3.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main._pill_count_box3,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 79;BA.debugLine="Listbox3.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
Debug.ShouldStop(16384);
main.mostCurrent._listbox3.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box3_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 82;BA.debugLine="pill_count_box4 = 16";
Debug.ShouldStop(131072);
main._pill_count_box4 = BA.NumberToString(16);
 BA.debugLineNum = 83;BA.debugLine="box4_alarm =\"13:00\"";
Debug.ShouldStop(262144);
main._box4_alarm = BA.ObjectToString("13:00");
 BA.debugLineNum = 86;BA.debugLine="Listbox4.AddSingleLine(\"   \"&\"تعداد قرص های موجود";
Debug.ShouldStop(2097152);
main.mostCurrent._listbox4.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("تعداد قرص های موجود:"),RemoteObject.createImmutable("("),main._pill_count_box4,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 87;BA.debugLine="Listbox4.AddSingleLine(\"   \"&\"ساعت مصرف:\"&\"(\"&box";
Debug.ShouldStop(4194304);
main.mostCurrent._listbox4.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),RemoteObject.createImmutable("ساعت مصرف:"),RemoteObject.createImmutable("("),main._box4_alarm,RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,98);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 98;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 92;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 38;BA.debugLine="Private Listbox1 As ListView";
main.mostCurrent._listbox1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Listbox2 As ListView";
main.mostCurrent._listbox2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Listbox3 As ListView";
main.mostCurrent._listbox3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Listbox4 As ListView";
main.mostCurrent._listbox4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private Imagepill1 As ImageView";
main.mostCurrent._imagepill1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private Imagepill2 As ImageView";
main.mostCurrent._imagepill2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private Imagepill3 As ImageView";
main.mostCurrent._imagepill3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private Imagepill4 As ImageView";
main.mostCurrent._imagepill4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imagepill1_longclick() throws Exception{
try {
		Debug.PushSubsStack("Imagepill1_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,130);
if (RapidSub.canDelegate("imagepill1_longclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","imagepill1_longclick");}
 BA.debugLineNum = 130;BA.debugLine="Private Sub Imagepill1_LongClick";
Debug.ShouldStop(2);
 BA.debugLineNum = 132;BA.debugLine="StartActivity(\"pill_1\")";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_1"))));
 BA.debugLineNum = 133;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Imagepill2_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,122);
if (RapidSub.canDelegate("imagepill2_longclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","imagepill2_longclick");}
 BA.debugLineNum = 122;BA.debugLine="Private Sub Imagepill2_LongClick";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="StartActivity(\"pill_2\")";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_2"))));
 BA.debugLineNum = 125;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Imagepill3_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,114);
if (RapidSub.canDelegate("imagepill3_longclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","imagepill3_longclick");}
 BA.debugLineNum = 114;BA.debugLine="Private Sub Imagepill3_LongClick";
Debug.ShouldStop(131072);
 BA.debugLineNum = 116;BA.debugLine="StartActivity(\"pill_3\")";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_3"))));
 BA.debugLineNum = 117;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Imagepill4_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,106);
if (RapidSub.canDelegate("imagepill4_longclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","imagepill4_longclick");}
 BA.debugLineNum = 106;BA.debugLine="Private Sub Imagepill4_LongClick";
Debug.ShouldStop(512);
 BA.debugLineNum = 108;BA.debugLine="StartActivity(\"pill_4\")";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("pill_4"))));
 BA.debugLineNum = 109;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Listbox1_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,150);
if (RapidSub.canDelegate("listbox1_itemclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","listbox1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 150;BA.debugLine="Private Sub Listbox1_ItemClick (Position As Int, V";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Listbox2_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,146);
if (RapidSub.canDelegate("listbox2_itemclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","listbox2_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 146;BA.debugLine="Private Sub Listbox2_ItemClick (Position As Int, V";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Listbox3_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,142);
if (RapidSub.canDelegate("listbox3_itemclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","listbox3_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 142;BA.debugLine="Private Sub Listbox3_ItemClick (Position As Int, V";
Debug.ShouldStop(8192);
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Listbox4_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,138);
if (RapidSub.canDelegate("listbox4_itemclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","listbox4_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 138;BA.debugLine="Private Sub Listbox4_ItemClick (Position As Int, V";
Debug.ShouldStop(512);
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
starter_subs_0._process_globals();
pill_1_subs_0._process_globals();
pill_2_subs_0._process_globals();
pill_3_subs_0._process_globals();
pill_4_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
pill_1.myClass = BA.getDeviceClass ("b4a.example.pill_1");
pill_2.myClass = BA.getDeviceClass ("b4a.example.pill_2");
pill_3.myClass = BA.getDeviceClass ("b4a.example.pill_3");
pill_4.myClass = BA.getDeviceClass ("b4a.example.pill_4");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Dim pill_count_box1 As String";
main._pill_count_box1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Dim box1_alarm As String";
main._box1_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim pill_count_box2 As String";
main._pill_count_box2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim box2_alarm As String";
main._box2_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Dim pill_count_box3 As String";
main._pill_count_box3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="Dim box3_alarm As String";
main._box3_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Dim pill_count_box4 As String";
main._pill_count_box4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim box4_alarm As String";
main._box4_alarm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}
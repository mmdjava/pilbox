package pill.boxV1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pill_3_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,50);
if (RapidSub.canDelegate("activity_create")) { return pill.boxV1.pill_3.remoteMe.runUserSub(false, "pill_3","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="Activity.LoadLayout(\"pill_3\")";
Debug.ShouldStop(524288);
pill_3.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pill_3")),pill_3.mostCurrent.activityBA);
 BA.debugLineNum = 54;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 56;BA.debugLine="EditText1.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(8388608);
pill_3.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim3.txt")))));
 BA.debugLineNum = 57;BA.debugLine="EditText2.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(16777216);
pill_3.mostCurrent._edittext2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box3.txt")))));
 BA.debugLineNum = 58;BA.debugLine="EditText3.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(33554432);
pill_3.mostCurrent._edittext3.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_3.txt")))));
 BA.debugLineNum = 59;BA.debugLine="AutoCompleteEditText1.Text = File.ReadString(Fil";
Debug.ShouldStop(67108864);
pill_3.mostCurrent._autocompleteedittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_3.txt")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",pill_3.processBA, e8.toString()); };
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Pause (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,70);
if (RapidSub.canDelegate("activity_pause")) { return pill.boxV1.pill_3.remoteMe.runUserSub(false, "pill_3","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,66);
if (RapidSub.canDelegate("activity_resume")) { return pill.boxV1.pill_3.remoteMe.runUserSub(false, "pill_3","activity_resume");}
 BA.debugLineNum = 66;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
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
public static RemoteObject  _autocompleteedittext1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("AutoCompleteEditText1_TextChanged (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,117);
if (RapidSub.canDelegate("autocompleteedittext1_textchanged")) { return pill.boxV1.pill_3.remoteMe.runUserSub(false, "pill_3","autocompleteedittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 117;BA.debugLine="Private Sub AutoCompleteEditText1_TextChanged (Old";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 119;BA.debugLine="etext4 = New";
Debug.ShouldStop(4194304);
pill_3.mostCurrent._etext4 = _new;
 BA.debugLineNum = 120;BA.debugLine="etext4_flag4=True";
Debug.ShouldStop(8388608);
pill_3._etext4_flag4 = pill_3.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Button1_Click (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,75);
if (RapidSub.canDelegate("button1_click")) { return pill.boxV1.pill_3.remoteMe.runUserSub(false, "pill_3","button1_click");}
 BA.debugLineNum = 75;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="If(etext1_flag1=True ) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",pill_3._etext1_flag1,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 78;BA.debugLine="File.WriteString(File.DirInternal, \"pill_naim3.t";
Debug.ShouldStop(8192);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_naim3.txt")),(Object)(pill_3.mostCurrent._etext1));
 };
 BA.debugLineNum = 80;BA.debugLine="If(etext2_flag2=True ) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("=",pill_3._etext2_flag2,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 83;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_b";
Debug.ShouldStop(262144);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_box3.txt")),(Object)(pill_3.mostCurrent._etext2));
 };
 BA.debugLineNum = 85;BA.debugLine="If(etext3_flag3=True ) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",pill_3._etext3_flag3,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 89;BA.debugLine="File.WriteString(File.DirInternal, \"start_time_3";
Debug.ShouldStop(16777216);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("start_time_3.txt")),(Object)(pill_3.mostCurrent._etext3));
 };
 BA.debugLineNum = 91;BA.debugLine="If(etext4_flag4=True ) Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",pill_3._etext4_flag4,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 93;BA.debugLine="File.WriteString(File.DirInternal, \"interval_3.t";
Debug.ShouldStop(268435456);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("interval_3.txt")),(Object)(pill_3.mostCurrent._etext4));
 };
 BA.debugLineNum = 95;BA.debugLine="If (etext2_flag2 Or etext3_flag3 Or etext3_flag3)";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean(".",pill_3._etext2_flag2) || RemoteObject.solveBoolean(".",pill_3._etext3_flag3) || RemoteObject.solveBoolean(".",pill_3._etext3_flag3))) { 
 BA.debugLineNum = 96;BA.debugLine="setconnect.astreams.Write(\"p3s\".GetBytes(\"UTF8\")";
Debug.ShouldStop(-2147483648);
pill_3.mostCurrent._setconnect._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p3s").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 102;BA.debugLine="setconnect.astreams.Write(naseri_func.string2byt";
Debug.ShouldStop(32);
pill_3.mostCurrent._setconnect._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(pill_3.mostCurrent._etext2))));
 BA.debugLineNum = 103;BA.debugLine="setconnect.astreams.Write(naseri_func.string2byt";
Debug.ShouldStop(64);
pill_3.mostCurrent._setconnect._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(pill_3.mostCurrent._etext3))));
 BA.debugLineNum = 104;BA.debugLine="setconnect.astreams.Write(naseri_func.string2byt";
Debug.ShouldStop(128);
pill_3.mostCurrent._setconnect._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(pill_3.mostCurrent._etext4))));
 BA.debugLineNum = 105;BA.debugLine="setconnect.astreams.Write(\"p3e\".GetBytes(\"UTF8\")";
Debug.ShouldStop(256);
pill_3.mostCurrent._setconnect._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p3e").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 108;BA.debugLine="Log(data_count & data_starttime & data_interval)";
Debug.ShouldStop(2048);
pill_3.mostCurrent.__c.runVoidMethod ("LogImpl","32621473",RemoteObject.concat(pill_3.mostCurrent._data_count,pill_3.mostCurrent._data_starttime,pill_3.mostCurrent._data_interval),0);
 };
 BA.debugLineNum = 111;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(16384);
pill_3.mostCurrent.__c.runVoidMethod ("StartActivity",pill_3.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 112;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
pill_3.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("EditText1_TextChanged (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,135);
if (RapidSub.canDelegate("edittext1_textchanged")) { return pill.boxV1.pill_3.remoteMe.runUserSub(false, "pill_3","edittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 135;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(64);
 BA.debugLineNum = 137;BA.debugLine="etext1 = New";
Debug.ShouldStop(256);
pill_3.mostCurrent._etext1 = _new;
 BA.debugLineNum = 138;BA.debugLine="etext1_flag1=True";
Debug.ShouldStop(512);
pill_3._etext1_flag1 = pill_3.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext2_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText2_TextChanged (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,129);
if (RapidSub.canDelegate("edittext2_textchanged")) { return pill.boxV1.pill_3.remoteMe.runUserSub(false, "pill_3","edittext2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 129;BA.debugLine="Private Sub EditText2_TextChanged (Old As String,";
Debug.ShouldStop(1);
 BA.debugLineNum = 131;BA.debugLine="etext2 = New";
Debug.ShouldStop(4);
pill_3.mostCurrent._etext2 = _new;
 BA.debugLineNum = 132;BA.debugLine="etext2_flag2=True";
Debug.ShouldStop(8);
pill_3._etext2_flag2 = pill_3.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext3_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText3_TextChanged (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,123);
if (RapidSub.canDelegate("edittext3_textchanged")) { return pill.boxV1.pill_3.remoteMe.runUserSub(false, "pill_3","edittext3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 123;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="etext3 = New";
Debug.ShouldStop(268435456);
pill_3.mostCurrent._etext3 = _new;
 BA.debugLineNum = 126;BA.debugLine="etext3_flag3=True";
Debug.ShouldStop(536870912);
pill_3._etext3_flag3 = pill_3.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 127;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private Button1 As Button";
pill_3.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Label1 As Label";
pill_3.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label2 As Label";
pill_3.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label3 As Label";
pill_3.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Label4 As Label";
pill_3.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private EditText1 As EditText";
pill_3.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EditText2 As EditText";
pill_3.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private EditText3 As EditText";
pill_3.mostCurrent._edittext3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private AutoCompleteEditText1 As AutoCompleteEdit";
pill_3.mostCurrent._autocompleteedittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim etext1 As String";
pill_3.mostCurrent._etext1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Dim etext2 As String";
pill_3.mostCurrent._etext2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim etext3 As String";
pill_3.mostCurrent._etext3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Dim etext4 As String";
pill_3.mostCurrent._etext4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Dim etext1_flag1 As Boolean";
pill_3._etext1_flag1 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 34;BA.debugLine="Dim etext2_flag2 As Boolean";
pill_3._etext2_flag2 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 35;BA.debugLine="Dim etext3_flag3 As Boolean";
pill_3._etext3_flag3 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 36;BA.debugLine="Dim etext4_flag4  As Boolean";
pill_3._etext4_flag4 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 38;BA.debugLine="Dim data_count As String";
pill_3.mostCurrent._data_count = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Dim data_starttime As String";
pill_3.mostCurrent._data_starttime = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Dim data_interval As String";
pill_3.mostCurrent._data_interval = RemoteObject.createImmutable("");
 //BA.debugLineNum = 42;BA.debugLine="etext1_flag1 =False";
pill_3._etext1_flag1 = pill_3.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 43;BA.debugLine="etext2_flag2 =False";
pill_3._etext2_flag2 = pill_3.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 44;BA.debugLine="etext3_flag3=False";
pill_3._etext3_flag3 = pill_3.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 45;BA.debugLine="etext4_flag4 =False";
pill_3._etext4_flag4 = pill_3.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}
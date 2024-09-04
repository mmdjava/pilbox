package pill.boxV1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pill_2_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pill_2) ","pill_2",2,pill_2.mostCurrent.activityBA,pill_2.mostCurrent,49);
if (RapidSub.canDelegate("activity_create")) { return pill.boxV1.pill_2.remoteMe.runUserSub(false, "pill_2","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="Activity.LoadLayout(\"pill_2\")";
Debug.ShouldStop(262144);
pill_2.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pill_2")),pill_2.mostCurrent.activityBA);
 BA.debugLineNum = 53;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 55;BA.debugLine="EditText1.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(4194304);
pill_2.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim2.txt")))));
 BA.debugLineNum = 56;BA.debugLine="EditText2.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(8388608);
pill_2.mostCurrent._edittext2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box2.txt")))));
 BA.debugLineNum = 57;BA.debugLine="EditText3.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(16777216);
pill_2.mostCurrent._edittext3.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_2.txt")))));
 BA.debugLineNum = 58;BA.debugLine="AutoCompleteEditText1.Text = File.ReadString(Fil";
Debug.ShouldStop(33554432);
pill_2.mostCurrent._autocompleteedittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_2.txt")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",pill_2.processBA, e8.toString()); };
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (pill_2) ","pill_2",2,pill_2.mostCurrent.activityBA,pill_2.mostCurrent,69);
if (RapidSub.canDelegate("activity_pause")) { return pill.boxV1.pill_2.remoteMe.runUserSub(false, "pill_2","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 69;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Resume (pill_2) ","pill_2",2,pill_2.mostCurrent.activityBA,pill_2.mostCurrent,65);
if (RapidSub.canDelegate("activity_resume")) { return pill.boxV1.pill_2.remoteMe.runUserSub(false, "pill_2","activity_resume");}
 BA.debugLineNum = 65;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("AutoCompleteEditText1_TextChanged (pill_2) ","pill_2",2,pill_2.mostCurrent.activityBA,pill_2.mostCurrent,116);
if (RapidSub.canDelegate("autocompleteedittext1_textchanged")) { return pill.boxV1.pill_2.remoteMe.runUserSub(false, "pill_2","autocompleteedittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 116;BA.debugLine="Private Sub AutoCompleteEditText1_TextChanged (Old";
Debug.ShouldStop(524288);
 BA.debugLineNum = 118;BA.debugLine="etext4 = New";
Debug.ShouldStop(2097152);
pill_2.mostCurrent._etext4 = _new;
 BA.debugLineNum = 119;BA.debugLine="etext4_flag4=True";
Debug.ShouldStop(4194304);
pill_2._etext4_flag4 = pill_2.mostCurrent.__c.getField(true,"True");
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (pill_2) ","pill_2",2,pill_2.mostCurrent.activityBA,pill_2.mostCurrent,74);
if (RapidSub.canDelegate("button1_click")) { return pill.boxV1.pill_2.remoteMe.runUserSub(false, "pill_2","button1_click");}
 BA.debugLineNum = 74;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="If(etext1_flag1=True ) Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",pill_2._etext1_flag1,pill_2.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 77;BA.debugLine="File.WriteString(File.DirInternal, \"pill_naim2.t";
Debug.ShouldStop(4096);
pill_2.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_naim2.txt")),(Object)(pill_2.mostCurrent._etext1));
 };
 BA.debugLineNum = 79;BA.debugLine="If(etext2_flag2=True ) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",pill_2._etext2_flag2,pill_2.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 82;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_b";
Debug.ShouldStop(131072);
pill_2.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_box2.txt")),(Object)(pill_2.mostCurrent._etext2));
 };
 BA.debugLineNum = 84;BA.debugLine="If(etext3_flag3=True ) Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",pill_2._etext3_flag3,pill_2.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 88;BA.debugLine="File.WriteString(File.DirInternal, \"start_time_2";
Debug.ShouldStop(8388608);
pill_2.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("start_time_2.txt")),(Object)(pill_2.mostCurrent._etext3));
 };
 BA.debugLineNum = 90;BA.debugLine="If(etext4_flag4=True ) Then";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("=",pill_2._etext4_flag4,pill_2.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 92;BA.debugLine="File.WriteString(File.DirInternal, \"interval_2.t";
Debug.ShouldStop(134217728);
pill_2.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_2.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("interval_2.txt")),(Object)(pill_2.mostCurrent._etext4));
 };
 BA.debugLineNum = 94;BA.debugLine="If (etext2_flag2 Or etext3_flag3 Or etext3_flag3)";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean(".",pill_2._etext2_flag2) || RemoteObject.solveBoolean(".",pill_2._etext3_flag3) || RemoteObject.solveBoolean(".",pill_2._etext3_flag3))) { 
 BA.debugLineNum = 95;BA.debugLine="Main.astreams.Write(\"p2s\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(1073741824);
pill_2.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p2s").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 101;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(etex";
Debug.ShouldStop(16);
pill_2.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_2.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_2.mostCurrent.activityBA,(Object)(pill_2.mostCurrent._etext2))));
 BA.debugLineNum = 102;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(etex";
Debug.ShouldStop(32);
pill_2.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_2.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_2.mostCurrent.activityBA,(Object)(pill_2.mostCurrent._etext3))));
 BA.debugLineNum = 103;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(etex";
Debug.ShouldStop(64);
pill_2.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_2.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_2.mostCurrent.activityBA,(Object)(pill_2.mostCurrent._etext4))));
 BA.debugLineNum = 104;BA.debugLine="Main.astreams.Write(\"p2e\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(128);
pill_2.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p2e").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 107;BA.debugLine="Log(data_count & data_starttime & data_interval)";
Debug.ShouldStop(1024);
pill_2.mostCurrent.__c.runVoidMethod ("LogImpl","62162721",RemoteObject.concat(pill_2.mostCurrent._data_count,pill_2.mostCurrent._data_starttime,pill_2.mostCurrent._data_interval),0);
 };
 BA.debugLineNum = 110;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(8192);
pill_2.mostCurrent.__c.runVoidMethod ("StartActivity",pill_2.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 111;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
pill_2.mostCurrent._activity.runVoidMethod ("Finish");
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
		Debug.PushSubsStack("EditText1_TextChanged (pill_2) ","pill_2",2,pill_2.mostCurrent.activityBA,pill_2.mostCurrent,134);
if (RapidSub.canDelegate("edittext1_textchanged")) { return pill.boxV1.pill_2.remoteMe.runUserSub(false, "pill_2","edittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 134;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(32);
 BA.debugLineNum = 136;BA.debugLine="etext1 = New";
Debug.ShouldStop(128);
pill_2.mostCurrent._etext1 = _new;
 BA.debugLineNum = 137;BA.debugLine="etext1_flag1=True";
Debug.ShouldStop(256);
pill_2._etext1_flag1 = pill_2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("EditText2_TextChanged (pill_2) ","pill_2",2,pill_2.mostCurrent.activityBA,pill_2.mostCurrent,128);
if (RapidSub.canDelegate("edittext2_textchanged")) { return pill.boxV1.pill_2.remoteMe.runUserSub(false, "pill_2","edittext2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 128;BA.debugLine="Private Sub EditText2_TextChanged (Old As String,";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 130;BA.debugLine="etext2 = New";
Debug.ShouldStop(2);
pill_2.mostCurrent._etext2 = _new;
 BA.debugLineNum = 131;BA.debugLine="etext2_flag2=True";
Debug.ShouldStop(4);
pill_2._etext2_flag2 = pill_2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("EditText3_TextChanged (pill_2) ","pill_2",2,pill_2.mostCurrent.activityBA,pill_2.mostCurrent,122);
if (RapidSub.canDelegate("edittext3_textchanged")) { return pill.boxV1.pill_2.remoteMe.runUserSub(false, "pill_2","edittext3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 122;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="etext3 = New";
Debug.ShouldStop(134217728);
pill_2.mostCurrent._etext3 = _new;
 BA.debugLineNum = 125;BA.debugLine="etext3_flag3=True";
Debug.ShouldStop(268435456);
pill_2._etext3_flag3 = pill_2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 126;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private Button1 As Button";
pill_2.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Label1 As Label";
pill_2.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Label2 As Label";
pill_2.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label3 As Label";
pill_2.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label4 As Label";
pill_2.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private EditText1 As EditText";
pill_2.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private EditText2 As EditText";
pill_2.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EditText3 As EditText";
pill_2.mostCurrent._edittext3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private AutoCompleteEditText1 As AutoCompleteEdit";
pill_2.mostCurrent._autocompleteedittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim etext1 As String";
pill_2.mostCurrent._etext1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Dim etext2 As String";
pill_2.mostCurrent._etext2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Dim etext3 As String";
pill_2.mostCurrent._etext3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim etext4 As String";
pill_2.mostCurrent._etext4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim etext1_flag1 As Boolean";
pill_2._etext1_flag1 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 33;BA.debugLine="Dim etext2_flag2 As Boolean";
pill_2._etext2_flag2 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 34;BA.debugLine="Dim etext3_flag3 As Boolean";
pill_2._etext3_flag3 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 35;BA.debugLine="Dim etext4_flag4  As Boolean";
pill_2._etext4_flag4 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 37;BA.debugLine="Dim data_count As String";
pill_2.mostCurrent._data_count = RemoteObject.createImmutable("");
 //BA.debugLineNum = 38;BA.debugLine="Dim data_starttime As String";
pill_2.mostCurrent._data_starttime = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Dim data_interval As String";
pill_2.mostCurrent._data_interval = RemoteObject.createImmutable("");
 //BA.debugLineNum = 41;BA.debugLine="etext1_flag1 =False";
pill_2._etext1_flag1 = pill_2.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 42;BA.debugLine="etext2_flag2 =False";
pill_2._etext2_flag2 = pill_2.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 43;BA.debugLine="etext3_flag3=False";
pill_2._etext3_flag3 = pill_2.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 44;BA.debugLine="etext4_flag4 =False";
pill_2._etext4_flag4 = pill_2.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}
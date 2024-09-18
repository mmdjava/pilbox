package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pill_4_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,52);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","activity_create", _firsttime);}
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="Activity.LoadLayout(\"pill_4\")";
Debug.ShouldStop(2097152);
pill_4.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pill_4")),pill_4.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 57;BA.debugLine="Log(\"try\")";
Debug.ShouldStop(16777216);
pill_4.mostCurrent.__c.runVoidMethod ("LogImpl","83735557",RemoteObject.createImmutable("try"),0);
 BA.debugLineNum = 58;BA.debugLine="ToggleButton.Checked= File.ReadString(File.DirIn";
Debug.ShouldStop(33554432);
pill_4.mostCurrent._togglebutton.runMethodAndSync(true,"setChecked",BA.ObjectToBoolean(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("toogle_en.txt")))));
 BA.debugLineNum = 59;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(67108864);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 61;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",pill_4.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_4.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 62;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.";
Debug.ShouldStop(536870912);
_newimage.runVoidMethod ("Initialize",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 65;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off";
Debug.ShouldStop(1);
_newimage.runVoidMethod ("Initialize",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 67;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(4);
pill_4.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
 BA.debugLineNum = 68;BA.debugLine="EditText1.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(8);
pill_4.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim4.txt")))));
 BA.debugLineNum = 69;BA.debugLine="EditText2.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(16);
pill_4.mostCurrent._edittext2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box4.txt")))));
 BA.debugLineNum = 70;BA.debugLine="EditText3.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(32);
pill_4.mostCurrent._edittext3.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_4.txt")))));
 BA.debugLineNum = 71;BA.debugLine="AutoCompleteEditText1.Text = File.ReadString(Fil";
Debug.ShouldStop(64);
pill_4.mostCurrent._autocompleteedittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_4.txt")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",pill_4.processBA, e17.toString()); };
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
		Debug.PushSubsStack("Activity_Pause (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,87);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 87;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Resume (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,83);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","activity_resume");}
 BA.debugLineNum = 83;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("AutoCompleteEditText1_TextChanged (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,136);
if (RapidSub.canDelegate("autocompleteedittext1_textchanged")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","autocompleteedittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 136;BA.debugLine="Private Sub AutoCompleteEditText1_TextChanged (Old";
Debug.ShouldStop(128);
 BA.debugLineNum = 138;BA.debugLine="etext4 = New";
Debug.ShouldStop(512);
pill_4.mostCurrent._etext4 = _new;
 BA.debugLineNum = 139;BA.debugLine="etext4_flag4=True";
Debug.ShouldStop(1024);
pill_4._etext4_flag4 = pill_4.mostCurrent.__c.getField(true,"True");
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,92);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","button1_click");}
 BA.debugLineNum = 92;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 94;BA.debugLine="File.WriteString(File.DirInternal, \"toogle_en.txt";
Debug.ShouldStop(536870912);
pill_4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("toogle_en.txt")),(Object)(BA.ObjectToString(pill_4.mostCurrent._togglebutton.runMethod(true,"getChecked"))));
 BA.debugLineNum = 96;BA.debugLine="If(etext1_flag1=True ) Then'اگر متن etext1 تغییر";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",pill_4._etext1_flag1,pill_4.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 97;BA.debugLine="File.WriteString(File.DirInternal, \"pill_naim4.t";
Debug.ShouldStop(1);
pill_4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_naim4.txt")),(Object)(pill_4.mostCurrent._etext1));
 };
 BA.debugLineNum = 100;BA.debugLine="If(etext2_flag2=True ) Then'اگر متن etext2 تغییر";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",pill_4._etext2_flag2,pill_4.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 101;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_b";
Debug.ShouldStop(16);
pill_4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_box4.txt")),(Object)(pill_4.mostCurrent._etext2));
 };
 BA.debugLineNum = 104;BA.debugLine="If(etext3_flag3=True ) Then'اگر متن etext3 تغییر";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",pill_4._etext3_flag3,pill_4.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 105;BA.debugLine="File.WriteString(File.DirInternal, \"start_time_4";
Debug.ShouldStop(256);
pill_4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("start_time_4.txt")),(Object)(pill_4.mostCurrent._etext3));
 };
 BA.debugLineNum = 108;BA.debugLine="If(etext4_flag4=True ) Then'اگر متن etext4 تغییر";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",pill_4._etext4_flag4,pill_4.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 109;BA.debugLine="File.WriteString(File.DirInternal, \"interval_4.t";
Debug.ShouldStop(4096);
pill_4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("interval_4.txt")),(Object)(pill_4.mostCurrent._etext4));
 };
 BA.debugLineNum = 112;BA.debugLine="If (ToggleButton.Checked) Then";
Debug.ShouldStop(32768);
if ((pill_4.mostCurrent._togglebutton.runMethod(true,"getChecked")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 114;BA.debugLine="Main.astreams.Write(\"p4s\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(131072);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p4s").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 115;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",pill_4.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_4.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 116;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"1\"";
Debug.ShouldStop(524288);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_4.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_4.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("1")))));
 }else {
 BA.debugLineNum = 118;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"0\"";
Debug.ShouldStop(2097152);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_4.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_4.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("0")))));
 };
 BA.debugLineNum = 121;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(16777216);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_4.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_4.mostCurrent.activityBA,(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box4.txt")))))));
 BA.debugLineNum = 122;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(33554432);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_4.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_4.mostCurrent.activityBA,(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_4.txt")))))));
 BA.debugLineNum = 123;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(67108864);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_4.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_4.mostCurrent.activityBA,(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_4.txt")))))));
 BA.debugLineNum = 124;BA.debugLine="Main.astreams.Write(\"p4e\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(134217728);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p4e").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 127;BA.debugLine="Log(ToggleButton.Checked & data_count & data_sta";
Debug.ShouldStop(1073741824);
pill_4.mostCurrent.__c.runVoidMethod ("LogImpl","83932195",RemoteObject.concat(pill_4.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_4.mostCurrent._data_count,pill_4.mostCurrent._data_starttime,pill_4.mostCurrent._data_interval),0);
 };
 BA.debugLineNum = 130;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(2);
pill_4.mostCurrent.__c.runVoidMethod ("StartActivity",pill_4.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 131;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
pill_4.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _edittext1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText1_TextChanged (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,154);
if (RapidSub.canDelegate("edittext1_textchanged")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","edittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 154;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 156;BA.debugLine="etext1 = New";
Debug.ShouldStop(134217728);
pill_4.mostCurrent._etext1 = _new;
 BA.debugLineNum = 157;BA.debugLine="etext1_flag1=True";
Debug.ShouldStop(268435456);
pill_4._etext1_flag1 = pill_4.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("EditText2_TextChanged (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,148);
if (RapidSub.canDelegate("edittext2_textchanged")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","edittext2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 148;BA.debugLine="Private Sub EditText2_TextChanged (Old As String,";
Debug.ShouldStop(524288);
 BA.debugLineNum = 150;BA.debugLine="etext2 = New";
Debug.ShouldStop(2097152);
pill_4.mostCurrent._etext2 = _new;
 BA.debugLineNum = 151;BA.debugLine="etext2_flag2=True";
Debug.ShouldStop(4194304);
pill_4._etext2_flag2 = pill_4.mostCurrent.__c.getField(true,"True");
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
public static RemoteObject  _edittext3_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText3_TextChanged (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,142);
if (RapidSub.canDelegate("edittext3_textchanged")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","edittext3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 142;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
Debug.ShouldStop(8192);
 BA.debugLineNum = 144;BA.debugLine="etext3 = New";
Debug.ShouldStop(32768);
pill_4.mostCurrent._etext3 = _new;
 BA.debugLineNum = 145;BA.debugLine="etext3_flag3=True";
Debug.ShouldStop(65536);
pill_4._etext3_flag3 = pill_4.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 146;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private Button1 As Button";
pill_4.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Label1 As Label";
pill_4.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Label2 As Label";
pill_4.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label3 As Label";
pill_4.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label4 As Label";
pill_4.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private EditText1 As EditText";
pill_4.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private EditText2 As EditText";
pill_4.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EditText3 As EditText";
pill_4.mostCurrent._edittext3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private AutoCompleteEditText1 As AutoCompleteEdit";
pill_4.mostCurrent._autocompleteedittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim etext1 As String";
pill_4.mostCurrent._etext1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Dim etext2 As String";
pill_4.mostCurrent._etext2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Dim etext3 As String";
pill_4.mostCurrent._etext3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim etext4 As String";
pill_4.mostCurrent._etext4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim etext1_flag1 As Boolean";
pill_4._etext1_flag1 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 33;BA.debugLine="Dim etext2_flag2 As Boolean";
pill_4._etext2_flag2 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 34;BA.debugLine="Dim etext3_flag3 As Boolean";
pill_4._etext3_flag3 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 35;BA.debugLine="Dim etext4_flag4  As Boolean";
pill_4._etext4_flag4 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 36;BA.debugLine="Dim togeleButton_flge  As Boolean";
pill_4._togelebutton_flge = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 38;BA.debugLine="Dim data_count As String";
pill_4.mostCurrent._data_count = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Dim data_starttime As String";
pill_4.mostCurrent._data_starttime = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Dim data_interval As String";
pill_4.mostCurrent._data_interval = RemoteObject.createImmutable("");
 //BA.debugLineNum = 42;BA.debugLine="etext1_flag1 =False";
pill_4._etext1_flag1 = pill_4.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 43;BA.debugLine="etext2_flag2 =False";
pill_4._etext2_flag2 = pill_4.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 44;BA.debugLine="etext3_flag3=False";
pill_4._etext3_flag3 = pill_4.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 45;BA.debugLine="etext4_flag4 =False";
pill_4._etext4_flag4 = pill_4.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 47;BA.debugLine="togeleButton_flge=False";
pill_4._togelebutton_flge = pill_4.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 48;BA.debugLine="Private ToggleButton As ToggleButton";
pill_4.mostCurrent._togglebutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _togglebutton_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ToggleButton_CheckedChange (pill_4) ","pill_4",5,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,161);
if (RapidSub.canDelegate("togglebutton_checkedchange")) { return b4a.example.pill_4.remoteMe.runUserSub(false, "pill_4","togglebutton_checkedchange", _checked);}
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 161;BA.debugLine="Private Sub ToggleButton_CheckedChange(Checked As";
Debug.ShouldStop(1);
 BA.debugLineNum = 163;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(4);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 165;BA.debugLine="If Checked=True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_checked,pill_4.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 166;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.p";
Debug.ShouldStop(32);
_newimage.runVoidMethod ("Initialize",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 169;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off.";
Debug.ShouldStop(256);
_newimage.runVoidMethod ("Initialize",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 171;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(1024);
pill_4.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
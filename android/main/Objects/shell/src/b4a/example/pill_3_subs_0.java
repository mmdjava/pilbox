package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pill_3_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pill_3) ","pill_3",4,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,53);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.pill_3.remoteMe.runUserSub(false, "pill_3","activity_create", _firsttime);}
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="Activity.LoadLayout(\"pill_3\")";
Debug.ShouldStop(4194304);
pill_3.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pill_3")),pill_3.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 58;BA.debugLine="Log(\"try\")";
Debug.ShouldStop(33554432);
pill_3.mostCurrent.__c.runVoidMethod ("LogImpl","83014661",RemoteObject.createImmutable("try"),0);
 BA.debugLineNum = 59;BA.debugLine="ToggleButton.Checked= File.ReadString(File.DirIn";
Debug.ShouldStop(67108864);
pill_3.mostCurrent._togglebutton.runMethodAndSync(true,"setChecked",BA.ObjectToBoolean(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("toogle_en.txt")))));
 BA.debugLineNum = 60;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(134217728);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 62;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",pill_3.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_3.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 63;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.";
Debug.ShouldStop(1073741824);
_newimage.runVoidMethod ("Initialize",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 66;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off";
Debug.ShouldStop(2);
_newimage.runVoidMethod ("Initialize",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 68;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(8);
pill_3.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
 BA.debugLineNum = 69;BA.debugLine="EditText1.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(16);
pill_3.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim3.txt")))));
 BA.debugLineNum = 70;BA.debugLine="EditText2.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(32);
pill_3.mostCurrent._edittext2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box3.txt")))));
 BA.debugLineNum = 71;BA.debugLine="EditText3.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(64);
pill_3.mostCurrent._edittext3.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_3.txt")))));
 BA.debugLineNum = 72;BA.debugLine="AutoCompleteEditText1.Text = File.ReadString(Fil";
Debug.ShouldStop(128);
pill_3.mostCurrent._autocompleteedittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_3.txt")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",pill_3.processBA, e17.toString()); };
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Pause (pill_3) ","pill_3",4,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,88);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.pill_3.remoteMe.runUserSub(false, "pill_3","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 88;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (pill_3) ","pill_3",4,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,84);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.pill_3.remoteMe.runUserSub(false, "pill_3","activity_resume");}
 BA.debugLineNum = 84;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("AutoCompleteEditText1_TextChanged (pill_3) ","pill_3",4,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,137);
if (RapidSub.canDelegate("autocompleteedittext1_textchanged")) { return b4a.example.pill_3.remoteMe.runUserSub(false, "pill_3","autocompleteedittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 137;BA.debugLine="Private Sub AutoCompleteEditText1_TextChanged (Old";
Debug.ShouldStop(256);
 BA.debugLineNum = 139;BA.debugLine="etext4 = New";
Debug.ShouldStop(1024);
pill_3.mostCurrent._etext4 = _new;
 BA.debugLineNum = 140;BA.debugLine="etext4_flag4=True";
Debug.ShouldStop(2048);
pill_3._etext4_flag4 = pill_3.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Button1_Click (pill_3) ","pill_3",4,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,93);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.pill_3.remoteMe.runUserSub(false, "pill_3","button1_click");}
 BA.debugLineNum = 93;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="File.WriteString(File.DirInternal, \"toogle_en.txt";
Debug.ShouldStop(1073741824);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("toogle_en.txt")),(Object)(BA.ObjectToString(pill_3.mostCurrent._togglebutton.runMethod(true,"getChecked"))));
 BA.debugLineNum = 97;BA.debugLine="If(etext1_flag1=True ) Then'اگر متن etext1 تغییر";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",pill_3._etext1_flag1,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 98;BA.debugLine="File.WriteString(File.DirInternal, \"pill_naim3.t";
Debug.ShouldStop(2);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_naim3.txt")),(Object)(pill_3.mostCurrent._etext1));
 };
 BA.debugLineNum = 101;BA.debugLine="If(etext2_flag2=True ) Then'اگر متن etext2 تغییر";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",pill_3._etext2_flag2,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 102;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_b";
Debug.ShouldStop(32);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_box3.txt")),(Object)(pill_3.mostCurrent._etext2));
 };
 BA.debugLineNum = 105;BA.debugLine="If(etext3_flag3=True ) Then'اگر متن etext3 تغییر";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",pill_3._etext3_flag3,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 106;BA.debugLine="File.WriteString(File.DirInternal, \"start_time_3";
Debug.ShouldStop(512);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("start_time_3.txt")),(Object)(pill_3.mostCurrent._etext3));
 };
 BA.debugLineNum = 109;BA.debugLine="If(etext4_flag4=True ) Then'اگر متن etext4 تغییر";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",pill_3._etext4_flag4,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 110;BA.debugLine="File.WriteString(File.DirInternal, \"interval_3.t";
Debug.ShouldStop(8192);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("interval_3.txt")),(Object)(pill_3.mostCurrent._etext4));
 };
 BA.debugLineNum = 113;BA.debugLine="If (ToggleButton.Checked) Then";
Debug.ShouldStop(65536);
if ((pill_3.mostCurrent._togglebutton.runMethod(true,"getChecked")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 115;BA.debugLine="Main.astreams.Write(\"p3s\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(262144);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p3s").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 116;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",pill_3.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_3.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 117;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"1\"";
Debug.ShouldStop(1048576);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("1")))));
 }else {
 BA.debugLineNum = 119;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"0\"";
Debug.ShouldStop(4194304);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("0")))));
 };
 BA.debugLineNum = 122;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(33554432);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box3.txt")))))));
 BA.debugLineNum = 123;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(67108864);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_3.txt")))))));
 BA.debugLineNum = 124;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(134217728);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_3.txt")))))));
 BA.debugLineNum = 125;BA.debugLine="Main.astreams.Write(\"p3e\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(268435456);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p3e").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 128;BA.debugLine="Log(ToggleButton.Checked & data_count & data_sta";
Debug.ShouldStop(-2147483648);
pill_3.mostCurrent.__c.runVoidMethod ("LogImpl","83211299",RemoteObject.concat(pill_3.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_3.mostCurrent._data_count,pill_3.mostCurrent._data_starttime,pill_3.mostCurrent._data_interval),0);
 };
 BA.debugLineNum = 131;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(4);
pill_3.mostCurrent.__c.runVoidMethod ("StartActivity",pill_3.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 132;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
pill_3.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("EditText1_TextChanged (pill_3) ","pill_3",4,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,155);
if (RapidSub.canDelegate("edittext1_textchanged")) { return b4a.example.pill_3.remoteMe.runUserSub(false, "pill_3","edittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 155;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 157;BA.debugLine="etext1 = New";
Debug.ShouldStop(268435456);
pill_3.mostCurrent._etext1 = _new;
 BA.debugLineNum = 158;BA.debugLine="etext1_flag1=True";
Debug.ShouldStop(536870912);
pill_3._etext1_flag1 = pill_3.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("EditText2_TextChanged (pill_3) ","pill_3",4,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,149);
if (RapidSub.canDelegate("edittext2_textchanged")) { return b4a.example.pill_3.remoteMe.runUserSub(false, "pill_3","edittext2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 149;BA.debugLine="Private Sub EditText2_TextChanged (Old As String,";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 151;BA.debugLine="etext2 = New";
Debug.ShouldStop(4194304);
pill_3.mostCurrent._etext2 = _new;
 BA.debugLineNum = 152;BA.debugLine="etext2_flag2=True";
Debug.ShouldStop(8388608);
pill_3._etext2_flag2 = pill_3.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("EditText3_TextChanged (pill_3) ","pill_3",4,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,143);
if (RapidSub.canDelegate("edittext3_textchanged")) { return b4a.example.pill_3.remoteMe.runUserSub(false, "pill_3","edittext3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 143;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
Debug.ShouldStop(16384);
 BA.debugLineNum = 145;BA.debugLine="etext3 = New";
Debug.ShouldStop(65536);
pill_3.mostCurrent._etext3 = _new;
 BA.debugLineNum = 146;BA.debugLine="etext3_flag3=True";
Debug.ShouldStop(131072);
pill_3._etext3_flag3 = pill_3.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
 //BA.debugLineNum = 37;BA.debugLine="Dim togeleButton_flge  As Boolean";
pill_3._togelebutton_flge = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 39;BA.debugLine="Dim data_count As String";
pill_3.mostCurrent._data_count = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Dim data_starttime As String";
pill_3.mostCurrent._data_starttime = RemoteObject.createImmutable("");
 //BA.debugLineNum = 41;BA.debugLine="Dim data_interval As String";
pill_3.mostCurrent._data_interval = RemoteObject.createImmutable("");
 //BA.debugLineNum = 43;BA.debugLine="etext1_flag1 =False";
pill_3._etext1_flag1 = pill_3.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 44;BA.debugLine="etext2_flag2 =False";
pill_3._etext2_flag2 = pill_3.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 45;BA.debugLine="etext3_flag3=False";
pill_3._etext3_flag3 = pill_3.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 46;BA.debugLine="etext4_flag4 =False";
pill_3._etext4_flag4 = pill_3.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 48;BA.debugLine="togeleButton_flge=False";
pill_3._togelebutton_flge = pill_3.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 49;BA.debugLine="Private ToggleButton As ToggleButton";
pill_3.mostCurrent._togglebutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _togglebutton_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ToggleButton_CheckedChange (pill_3) ","pill_3",4,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,162);
if (RapidSub.canDelegate("togglebutton_checkedchange")) { return b4a.example.pill_3.remoteMe.runUserSub(false, "pill_3","togglebutton_checkedchange", _checked);}
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 162;BA.debugLine="Private Sub ToggleButton_CheckedChange(Checked As";
Debug.ShouldStop(2);
 BA.debugLineNum = 164;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(8);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 166;BA.debugLine="If Checked=True Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_checked,pill_3.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 167;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.p";
Debug.ShouldStop(64);
_newimage.runVoidMethod ("Initialize",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 170;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off.";
Debug.ShouldStop(512);
_newimage.runVoidMethod ("Initialize",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 172;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(2048);
pill_3.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
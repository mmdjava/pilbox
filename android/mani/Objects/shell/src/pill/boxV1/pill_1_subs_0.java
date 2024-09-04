package pill.boxV1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pill_1_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,50);
if (RapidSub.canDelegate("activity_create")) { return pill.boxV1.pill_1.remoteMe.runUserSub(false, "pill_1","activity_create", _firsttime);}
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="Activity.LoadLayout(\"pill_1\")";
Debug.ShouldStop(524288);
pill_1.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pill_1")),pill_1.mostCurrent.activityBA);
 BA.debugLineNum = 54;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 55;BA.debugLine="Log(\"try\")";
Debug.ShouldStop(4194304);
pill_1.mostCurrent.__c.runVoidMethod ("LogImpl","61245189",RemoteObject.createImmutable("try"),0);
 BA.debugLineNum = 56;BA.debugLine="ToggleButton.Checked= File.ReadString(File.DirIn";
Debug.ShouldStop(8388608);
pill_1.mostCurrent._togglebutton.runMethodAndSync(true,"setChecked",BA.ObjectToBoolean(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("toogle_en.txt")))));
 BA.debugLineNum = 57;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(16777216);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 59;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",pill_1.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_1.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 60;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.";
Debug.ShouldStop(134217728);
_newimage.runVoidMethod ("Initialize",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 63;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off";
Debug.ShouldStop(1073741824);
_newimage.runVoidMethod ("Initialize",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 65;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(1);
pill_1.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
 BA.debugLineNum = 66;BA.debugLine="EditText1.Text = File.ReadString(File.DirInternal";
Debug.ShouldStop(2);
pill_1.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim1.txt")))));
 BA.debugLineNum = 67;BA.debugLine="EditText2.Text = File.ReadString(File.DirInternal";
Debug.ShouldStop(4);
pill_1.mostCurrent._edittext2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box1.txt")))));
 BA.debugLineNum = 68;BA.debugLine="EditText3.Text = File.ReadString(File.DirInternal";
Debug.ShouldStop(8);
pill_1.mostCurrent._edittext3.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_1.txt")))));
 BA.debugLineNum = 69;BA.debugLine="AutoCompleteEditText1.Text = File.ReadString(File";
Debug.ShouldStop(16);
pill_1.mostCurrent._autocompleteedittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_1.txt")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",pill_1.processBA, e17.toString()); BA.debugLineNum = 72;BA.debugLine="Log(\"catch\")";
Debug.ShouldStop(128);
pill_1.mostCurrent.__c.runVoidMethod ("LogImpl","61245206",RemoteObject.createImmutable("catch"),0);
 BA.debugLineNum = 73;BA.debugLine="ToggleButton.Checked=False";
Debug.ShouldStop(256);
pill_1.mostCurrent._togglebutton.runMethodAndSync(true,"setChecked",pill_1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(512);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 75;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off.";
Debug.ShouldStop(1024);
_newimage.runVoidMethod ("Initialize",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 BA.debugLineNum = 76;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(2048);
pill_1.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
 };
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,87);
if (RapidSub.canDelegate("activity_pause")) { return pill.boxV1.pill_1.remoteMe.runUserSub(false, "pill_1","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,83);
if (RapidSub.canDelegate("activity_resume")) { return pill.boxV1.pill_1.remoteMe.runUserSub(false, "pill_1","activity_resume");}
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
		Debug.PushSubsStack("AutoCompleteEditText1_TextChanged (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,141);
if (RapidSub.canDelegate("autocompleteedittext1_textchanged")) { return pill.boxV1.pill_1.remoteMe.runUserSub(false, "pill_1","autocompleteedittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 141;BA.debugLine="Private Sub AutoCompleteEditText1_TextChanged (Old";
Debug.ShouldStop(4096);
 BA.debugLineNum = 143;BA.debugLine="etext4 = New";
Debug.ShouldStop(16384);
pill_1.mostCurrent._etext4 = _new;
 BA.debugLineNum = 144;BA.debugLine="etext4_flag4=True";
Debug.ShouldStop(32768);
pill_1._etext4_flag4 = pill_1.mostCurrent.__c.getField(true,"True");
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,92);
if (RapidSub.canDelegate("button1_click")) { return pill.boxV1.pill_1.remoteMe.runUserSub(false, "pill_1","button1_click");}
 BA.debugLineNum = 92;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 99;BA.debugLine="File.WriteString(File.DirInternal, \"toogle_en.txt";
Debug.ShouldStop(4);
pill_1.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("toogle_en.txt")),(Object)(BA.ObjectToString(pill_1.mostCurrent._togglebutton.runMethod(true,"getChecked"))));
 BA.debugLineNum = 101;BA.debugLine="If(etext1_flag1=True ) Then'اگر متن etext1 تغییر";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",pill_1._etext1_flag1,pill_1.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 102;BA.debugLine="File.WriteString(File.DirInternal, \"pill_naim1.tx";
Debug.ShouldStop(32);
pill_1.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_naim1.txt")),(Object)(pill_1.mostCurrent._etext1));
 };
 BA.debugLineNum = 105;BA.debugLine="If(etext2_flag2=True ) Then'اگر متن etext2 تغییر";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",pill_1._etext2_flag2,pill_1.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 106;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_b";
Debug.ShouldStop(512);
pill_1.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_box1.txt")),(Object)(pill_1.mostCurrent._etext2));
 };
 BA.debugLineNum = 109;BA.debugLine="If(etext3_flag3=True ) Then'اگر متن etext3 تغییر";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",pill_1._etext3_flag3,pill_1.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 110;BA.debugLine="File.WriteString(File.DirInternal, \"start_time_1";
Debug.ShouldStop(8192);
pill_1.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("start_time_1.txt")),(Object)(pill_1.mostCurrent._etext3));
 };
 BA.debugLineNum = 113;BA.debugLine="If(etext4_flag4=True ) Then'اگر متن etext4 تغییر";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",pill_1._etext4_flag4,pill_1.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 114;BA.debugLine="File.WriteString(File.DirInternal, \"interval_1.t";
Debug.ShouldStop(131072);
pill_1.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("interval_1.txt")),(Object)(pill_1.mostCurrent._etext4));
 };
 BA.debugLineNum = 117;BA.debugLine="If (ToggleButton.Checked And (etext2_flag2 Or ete";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean(".",pill_1.mostCurrent._togglebutton.runMethod(true,"getChecked")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",pill_1._etext2_flag2) || RemoteObject.solveBoolean(".",pill_1._etext3_flag3) || RemoteObject.solveBoolean(".",pill_1._etext3_flag3)))))) { 
 BA.debugLineNum = 119;BA.debugLine="Main.astreams.Write(\"p1s\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(4194304);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p1s").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 120;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",pill_1.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_1.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 121;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"1\"";
Debug.ShouldStop(16777216);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_1.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("1")))));
 }else {
 BA.debugLineNum = 123;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"0\"";
Debug.ShouldStop(67108864);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_1.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("0")))));
 };
 BA.debugLineNum = 126;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(etex";
Debug.ShouldStop(536870912);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_1.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_1.mostCurrent.activityBA,(Object)(pill_1.mostCurrent._etext2))));
 BA.debugLineNum = 127;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(etex";
Debug.ShouldStop(1073741824);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_1.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_1.mostCurrent.activityBA,(Object)(pill_1.mostCurrent._etext3))));
 BA.debugLineNum = 128;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(etex";
Debug.ShouldStop(-2147483648);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_1.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_1.mostCurrent.activityBA,(Object)(pill_1.mostCurrent._etext4))));
 BA.debugLineNum = 129;BA.debugLine="Main.astreams.Write(\"p1e\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(1);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p1e").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 132;BA.debugLine="Log(ToggleButton.Checked & data_count & data_sta";
Debug.ShouldStop(8);
pill_1.mostCurrent.__c.runVoidMethod ("LogImpl","61441832",RemoteObject.concat(pill_1.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_1.mostCurrent._data_count,pill_1.mostCurrent._data_starttime,pill_1.mostCurrent._data_interval),0);
 };
 BA.debugLineNum = 135;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(64);
pill_1.mostCurrent.__c.runVoidMethod ("StartActivity",pill_1.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 136;BA.debugLine="Activity.Finish";
Debug.ShouldStop(128);
pill_1.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _edittext1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText1_TextChanged (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,163);
if (RapidSub.canDelegate("edittext1_textchanged")) { return pill.boxV1.pill_1.remoteMe.runUserSub(false, "pill_1","edittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 163;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(4);
 BA.debugLineNum = 166;BA.debugLine="etext1 = New";
Debug.ShouldStop(32);
pill_1.mostCurrent._etext1 = _new;
 BA.debugLineNum = 167;BA.debugLine="etext1_flag1=True";
Debug.ShouldStop(64);
pill_1._etext1_flag1 = pill_1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("EditText2_TextChanged (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,156);
if (RapidSub.canDelegate("edittext2_textchanged")) { return pill.boxV1.pill_1.remoteMe.runUserSub(false, "pill_1","edittext2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 156;BA.debugLine="Private Sub EditText2_TextChanged (Old As String,";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 159;BA.debugLine="etext2 = New";
Debug.ShouldStop(1073741824);
pill_1.mostCurrent._etext2 = _new;
 BA.debugLineNum = 160;BA.debugLine="etext2_flag2=True";
Debug.ShouldStop(-2147483648);
pill_1._etext2_flag2 = pill_1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("EditText3_TextChanged (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,148);
if (RapidSub.canDelegate("edittext3_textchanged")) { return pill.boxV1.pill_1.remoteMe.runUserSub(false, "pill_1","edittext3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 148;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
Debug.ShouldStop(524288);
 BA.debugLineNum = 152;BA.debugLine="etext3 = New";
Debug.ShouldStop(8388608);
pill_1.mostCurrent._etext3 = _new;
 BA.debugLineNum = 153;BA.debugLine="etext3_flag3=True";
Debug.ShouldStop(16777216);
pill_1._etext3_flag3 = pill_1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
pill_1.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Label1 As Label";
pill_1.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Label2 As Label";
pill_1.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label3 As Label";
pill_1.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label4 As Label";
pill_1.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private EditText1 As EditText";
pill_1.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private EditText2 As EditText";
pill_1.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EditText3 As EditText";
pill_1.mostCurrent._edittext3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private AutoCompleteEditText1 As AutoCompleteEdit";
pill_1.mostCurrent._autocompleteedittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim etext1 As String";
pill_1.mostCurrent._etext1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Dim etext2 As String";
pill_1.mostCurrent._etext2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Dim etext3 As String";
pill_1.mostCurrent._etext3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim etext4 As String";
pill_1.mostCurrent._etext4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim etext1_flag1 As Boolean";
pill_1._etext1_flag1 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 33;BA.debugLine="Dim etext2_flag2 As Boolean";
pill_1._etext2_flag2 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 34;BA.debugLine="Dim etext3_flag3 As Boolean";
pill_1._etext3_flag3 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 35;BA.debugLine="Dim etext4_flag4  As Boolean";
pill_1._etext4_flag4 = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 36;BA.debugLine="Dim togeleButton_flge  As Boolean";
pill_1._togelebutton_flge = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 38;BA.debugLine="Dim data_count As String";
pill_1.mostCurrent._data_count = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Dim data_starttime As String";
pill_1.mostCurrent._data_starttime = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Dim data_interval As String";
pill_1.mostCurrent._data_interval = RemoteObject.createImmutable("");
 //BA.debugLineNum = 42;BA.debugLine="etext1_flag1 =False";
pill_1._etext1_flag1 = pill_1.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 43;BA.debugLine="etext2_flag2 =False";
pill_1._etext2_flag2 = pill_1.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 44;BA.debugLine="etext3_flag3=False";
pill_1._etext3_flag3 = pill_1.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 45;BA.debugLine="etext4_flag4 =False";
pill_1._etext4_flag4 = pill_1.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 46;BA.debugLine="togeleButton_flge=False";
pill_1._togelebutton_flge = pill_1.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 47;BA.debugLine="Private ToggleButton As ToggleButton";
pill_1.mostCurrent._togglebutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _togglebutton_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ToggleButton_CheckedChange (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,172);
if (RapidSub.canDelegate("togglebutton_checkedchange")) { return pill.boxV1.pill_1.remoteMe.runUserSub(false, "pill_1","togglebutton_checkedchange", _checked);}
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 172;BA.debugLine="Private Sub ToggleButton_CheckedChange(Checked As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 174;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(8192);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 176;BA.debugLine="If Checked=True Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_checked,pill_1.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 177;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.pn";
Debug.ShouldStop(65536);
_newimage.runVoidMethod ("Initialize",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 180;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off.";
Debug.ShouldStop(524288);
_newimage.runVoidMethod ("Initialize",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 182;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(2097152);
pill_1.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
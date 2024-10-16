package Pill_Box.v1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pill_3_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,56);
if (RapidSub.canDelegate("activity_create")) { return Pill_Box.v1.pill_3.remoteMe.runUserSub(false, "pill_3","activity_create", _firsttime);}
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="Activity.LoadLayout(\"pill_3\")";
Debug.ShouldStop(33554432);
pill_3.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pill_3")),pill_3.mostCurrent.activityBA);
 BA.debugLineNum = 61;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill3.png\"";
Debug.ShouldStop(268435456);
if (pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill3.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 63;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirInternal,";
Debug.ShouldStop(1073741824);
pill_3.mostCurrent._imageview1.runMethod(false,"setBitmap",(pill_3.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill3.png"))).getObject()));
 }else {
 BA.debugLineNum = 65;BA.debugLine="ToastMessageShow(\"No image found.\", False)";
Debug.ShouldStop(1);
pill_3.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No image found.")),(Object)(pill_3.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 68;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 69;BA.debugLine="Log(\"try\")";
Debug.ShouldStop(16);
pill_3.mostCurrent.__c.runVoidMethod ("LogImpl","53866637",RemoteObject.createImmutable("try"),0);
 BA.debugLineNum = 70;BA.debugLine="ToggleButton.Checked= File.ReadString(File.DirIn";
Debug.ShouldStop(32);
pill_3.mostCurrent._togglebutton.runMethodAndSync(true,"setChecked",BA.ObjectToBoolean(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("toogle_en.txt")))));
 BA.debugLineNum = 71;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(64);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 73;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",pill_3.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_3.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 74;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.";
Debug.ShouldStop(512);
_newimage.runVoidMethod ("Initialize",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 77;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off";
Debug.ShouldStop(4096);
_newimage.runVoidMethod ("Initialize",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 79;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(16384);
pill_3.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
 BA.debugLineNum = 80;BA.debugLine="EditText1.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(32768);
pill_3.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim3.txt")))));
 BA.debugLineNum = 81;BA.debugLine="EditText2.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(65536);
pill_3.mostCurrent._edittext2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box3.txt")))));
 BA.debugLineNum = 82;BA.debugLine="EditText3.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(131072);
pill_3.mostCurrent._edittext3.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_3.txt")))));
 BA.debugLineNum = 83;BA.debugLine="AutoCompleteEditText1.Text = File.ReadString(Fil";
Debug.ShouldStop(262144);
pill_3.mostCurrent._autocompleteedittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_3.txt")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",pill_3.processBA, e22.toString()); };
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,99);
if (RapidSub.canDelegate("activity_pause")) { return Pill_Box.v1.pill_3.remoteMe.runUserSub(false, "pill_3","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 99;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,95);
if (RapidSub.canDelegate("activity_resume")) { return Pill_Box.v1.pill_3.remoteMe.runUserSub(false, "pill_3","activity_resume");}
 BA.debugLineNum = 95;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("AutoCompleteEditText1_TextChanged (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,148);
if (RapidSub.canDelegate("autocompleteedittext1_textchanged")) { return Pill_Box.v1.pill_3.remoteMe.runUserSub(false, "pill_3","autocompleteedittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 148;BA.debugLine="Private Sub AutoCompleteEditText1_TextChanged (Old";
Debug.ShouldStop(524288);
 BA.debugLineNum = 150;BA.debugLine="etext4 = New";
Debug.ShouldStop(2097152);
pill_3.mostCurrent._etext4 = _new;
 BA.debugLineNum = 151;BA.debugLine="etext4_flag4=True";
Debug.ShouldStop(4194304);
pill_3._etext4_flag4 = pill_3.mostCurrent.__c.getField(true,"True");
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,104);
if (RapidSub.canDelegate("button1_click")) { return Pill_Box.v1.pill_3.remoteMe.runUserSub(false, "pill_3","button1_click");}
 BA.debugLineNum = 104;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="File.WriteString(File.DirInternal, \"toogle_en.txt";
Debug.ShouldStop(512);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("toogle_en.txt")),(Object)(BA.ObjectToString(pill_3.mostCurrent._togglebutton.runMethod(true,"getChecked"))));
 BA.debugLineNum = 108;BA.debugLine="If(etext1_flag1=True ) Then'اگر متن etext1 تغییر";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",pill_3._etext1_flag1,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 109;BA.debugLine="File.WriteString(File.DirInternal, \"pill_naim3.t";
Debug.ShouldStop(4096);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_naim3.txt")),(Object)(pill_3.mostCurrent._etext1));
 };
 BA.debugLineNum = 112;BA.debugLine="If(etext2_flag2=True ) Then'اگر متن etext2 تغییر";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("=",pill_3._etext2_flag2,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 113;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_b";
Debug.ShouldStop(65536);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_box3.txt")),(Object)(pill_3.mostCurrent._etext2));
 };
 BA.debugLineNum = 116;BA.debugLine="If(etext3_flag3=True ) Then'اگر متن etext3 تغییر";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",pill_3._etext3_flag3,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 117;BA.debugLine="File.WriteString(File.DirInternal, \"start_time_3";
Debug.ShouldStop(1048576);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("start_time_3.txt")),(Object)(pill_3.mostCurrent._etext3));
 };
 BA.debugLineNum = 120;BA.debugLine="If(etext4_flag4=True ) Then'اگر متن etext4 تغییر";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("=",pill_3._etext4_flag4,pill_3.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 121;BA.debugLine="File.WriteString(File.DirInternal, \"interval_3.t";
Debug.ShouldStop(16777216);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("interval_3.txt")),(Object)(pill_3.mostCurrent._etext4));
 };
 BA.debugLineNum = 124;BA.debugLine="If (ToggleButton.Checked) Then";
Debug.ShouldStop(134217728);
if ((pill_3.mostCurrent._togglebutton.runMethod(true,"getChecked")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 126;BA.debugLine="Main.astreams.Write(\"p3s\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(536870912);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p3s").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 127;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",pill_3.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_3.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 128;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"1\"";
Debug.ShouldStop(-2147483648);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("1")))));
 }else {
 BA.debugLineNum = 130;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"0\"";
Debug.ShouldStop(2);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("0")))));
 };
 BA.debugLineNum = 133;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(16);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box3.txt")))))));
 BA.debugLineNum = 134;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(32);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_3.txt")))))));
 BA.debugLineNum = 135;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(64);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_3.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_3.mostCurrent.activityBA,(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_3.txt")))))));
 BA.debugLineNum = 136;BA.debugLine="Main.astreams.Write(\"p3e\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(128);
pill_3.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p3e").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 139;BA.debugLine="Log(ToggleButton.Checked & data_count & data_sta";
Debug.ShouldStop(1024);
pill_3.mostCurrent.__c.runVoidMethod ("LogImpl","54063267",RemoteObject.concat(pill_3.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_3.mostCurrent._data_count,pill_3.mostCurrent._data_starttime,pill_3.mostCurrent._data_interval),0);
 };
 BA.debugLineNum = 142;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(8192);
pill_3.mostCurrent.__c.runVoidMethod ("StartActivity",pill_3.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 143;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
pill_3.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("EditText1_TextChanged (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,166);
if (RapidSub.canDelegate("edittext1_textchanged")) { return Pill_Box.v1.pill_3.remoteMe.runUserSub(false, "pill_3","edittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 166;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(32);
 BA.debugLineNum = 168;BA.debugLine="etext1 = New";
Debug.ShouldStop(128);
pill_3.mostCurrent._etext1 = _new;
 BA.debugLineNum = 169;BA.debugLine="etext1_flag1=True";
Debug.ShouldStop(256);
pill_3._etext1_flag1 = pill_3.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 170;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("EditText2_TextChanged (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,160);
if (RapidSub.canDelegate("edittext2_textchanged")) { return Pill_Box.v1.pill_3.remoteMe.runUserSub(false, "pill_3","edittext2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 160;BA.debugLine="Private Sub EditText2_TextChanged (Old As String,";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 162;BA.debugLine="etext2 = New";
Debug.ShouldStop(2);
pill_3.mostCurrent._etext2 = _new;
 BA.debugLineNum = 163;BA.debugLine="etext2_flag2=True";
Debug.ShouldStop(4);
pill_3._etext2_flag2 = pill_3.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 164;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("EditText3_TextChanged (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,154);
if (RapidSub.canDelegate("edittext3_textchanged")) { return Pill_Box.v1.pill_3.remoteMe.runUserSub(false, "pill_3","edittext3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 154;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 156;BA.debugLine="etext3 = New";
Debug.ShouldStop(134217728);
pill_3.mostCurrent._etext3 = _new;
 BA.debugLineNum = 157;BA.debugLine="etext3_flag3=True";
Debug.ShouldStop(268435456);
pill_3._etext3_flag3 = pill_3.mostCurrent.__c.getField(true,"True");
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
public static RemoteObject  _fc_result(RemoteObject _success,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("fc_Result (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,195);
if (RapidSub.canDelegate("fc_result")) { return Pill_Box.v1.pill_3.remoteMe.runUserSub(false, "pill_3","fc_result", _success, _dir, _filename);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Success", _success);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 195;BA.debugLine="Sub fc_Result(Success As Boolean, Dir As String, F";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="If Success Then";
Debug.ShouldStop(8);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 198;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(32);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 199;BA.debugLine="bmp = LoadBitmap(Dir, FileName)";
Debug.ShouldStop(64);
_bmp = pill_3.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(_dir),(Object)(_filename));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 200;BA.debugLine="ImageView1.Bitmap = bmp";
Debug.ShouldStop(128);
pill_3.mostCurrent._imageview1.runMethod(false,"setBitmap",(_bmp.getObject()));
 BA.debugLineNum = 203;BA.debugLine="File.Copy(Dir, FileName, File.DirInternal, \"Imag";
Debug.ShouldStop(1024);
pill_3.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(_dir),(Object)(_filename),(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill3.png")));
 BA.debugLineNum = 205;BA.debugLine="ToastMessageShow(\"Image saved successfully!\", Fa";
Debug.ShouldStop(4096);
pill_3.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Image saved successfully!")),(Object)(pill_3.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 207;BA.debugLine="ToastMessageShow(\"Failed to choose an image.\", F";
Debug.ShouldStop(16384);
pill_3.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Failed to choose an image.")),(Object)(pill_3.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
 //BA.debugLineNum = 51;BA.debugLine="Private ImageView1 As ImageView";
pill_3.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Dim rp As RuntimePermissions";
pill_3.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview1_longclick() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_LongClick (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,186);
if (RapidSub.canDelegate("imageview1_longclick")) { return Pill_Box.v1.pill_3.remoteMe.runUserSub(false, "pill_3","imageview1_longclick");}
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.ContentChooser");
 BA.debugLineNum = 186;BA.debugLine="Private Sub ImageView1_LongClick";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 188;BA.debugLine="Dim fc As ContentChooser";
Debug.ShouldStop(134217728);
_fc = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 189;BA.debugLine="fc.Initialize(\"fc\")";
Debug.ShouldStop(268435456);
_fc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("fc")));
 BA.debugLineNum = 190;BA.debugLine="fc.Show(\"image/*\", \"Select Image\")";
Debug.ShouldStop(536870912);
_fc.runVoidMethod ("Show",pill_3.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Select Image")));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _togglebutton_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ToggleButton_CheckedChange (pill_3) ","pill_3",3,pill_3.mostCurrent.activityBA,pill_3.mostCurrent,173);
if (RapidSub.canDelegate("togglebutton_checkedchange")) { return Pill_Box.v1.pill_3.remoteMe.runUserSub(false, "pill_3","togglebutton_checkedchange", _checked);}
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 173;BA.debugLine="Private Sub ToggleButton_CheckedChange(Checked As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 175;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(16384);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 177;BA.debugLine="If Checked=True Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_checked,pill_3.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 178;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.p";
Debug.ShouldStop(131072);
_newimage.runVoidMethod ("Initialize",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 181;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off.";
Debug.ShouldStop(1048576);
_newimage.runVoidMethod ("Initialize",(Object)(pill_3.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 183;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(4194304);
pill_3.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
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
}
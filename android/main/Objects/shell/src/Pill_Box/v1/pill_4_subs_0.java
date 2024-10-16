package Pill_Box.v1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pill_4_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pill_4) ","pill_4",4,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,55);
if (RapidSub.canDelegate("activity_create")) { return Pill_Box.v1.pill_4.remoteMe.runUserSub(false, "pill_4","activity_create", _firsttime);}
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="Activity.LoadLayout(\"pill_4\")";
Debug.ShouldStop(16777216);
pill_4.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pill_4")),pill_4.mostCurrent.activityBA);
 BA.debugLineNum = 60;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill4.png\"";
Debug.ShouldStop(134217728);
if (pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill4.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 62;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirInternal,";
Debug.ShouldStop(536870912);
pill_4.mostCurrent._imageview1.runMethod(false,"setBitmap",(pill_4.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill4.png"))).getObject()));
 }else {
 BA.debugLineNum = 64;BA.debugLine="ToastMessageShow(\"No image found.\", False)";
Debug.ShouldStop(-2147483648);
pill_4.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No image found.")),(Object)(pill_4.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 67;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 68;BA.debugLine="Log(\"try\")";
Debug.ShouldStop(8);
pill_4.mostCurrent.__c.runVoidMethod ("LogImpl","54718605",RemoteObject.createImmutable("try"),0);
 BA.debugLineNum = 69;BA.debugLine="ToggleButton.Checked= File.ReadString(File.DirIn";
Debug.ShouldStop(16);
pill_4.mostCurrent._togglebutton.runMethodAndSync(true,"setChecked",BA.ObjectToBoolean(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("toogle_en.txt")))));
 BA.debugLineNum = 70;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(32);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 72;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",pill_4.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_4.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 73;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.";
Debug.ShouldStop(256);
_newimage.runVoidMethod ("Initialize",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 76;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off";
Debug.ShouldStop(2048);
_newimage.runVoidMethod ("Initialize",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 78;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(8192);
pill_4.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
 BA.debugLineNum = 79;BA.debugLine="EditText1.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(16384);
pill_4.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim4.txt")))));
 BA.debugLineNum = 80;BA.debugLine="EditText2.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(32768);
pill_4.mostCurrent._edittext2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box4.txt")))));
 BA.debugLineNum = 81;BA.debugLine="EditText3.Text = File.ReadString(File.DirInterna";
Debug.ShouldStop(65536);
pill_4.mostCurrent._edittext3.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_4.txt")))));
 BA.debugLineNum = 82;BA.debugLine="AutoCompleteEditText1.Text = File.ReadString(Fil";
Debug.ShouldStop(131072);
pill_4.mostCurrent._autocompleteedittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_4.txt")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",pill_4.processBA, e22.toString()); };
 BA.debugLineNum = 92;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (pill_4) ","pill_4",4,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,98);
if (RapidSub.canDelegate("activity_pause")) { return Pill_Box.v1.pill_4.remoteMe.runUserSub(false, "pill_4","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (pill_4) ","pill_4",4,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,94);
if (RapidSub.canDelegate("activity_resume")) { return Pill_Box.v1.pill_4.remoteMe.runUserSub(false, "pill_4","activity_resume");}
 BA.debugLineNum = 94;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _autocompleteedittext1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("AutoCompleteEditText1_TextChanged (pill_4) ","pill_4",4,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,147);
if (RapidSub.canDelegate("autocompleteedittext1_textchanged")) { return Pill_Box.v1.pill_4.remoteMe.runUserSub(false, "pill_4","autocompleteedittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 147;BA.debugLine="Private Sub AutoCompleteEditText1_TextChanged (Old";
Debug.ShouldStop(262144);
 BA.debugLineNum = 149;BA.debugLine="etext4 = New";
Debug.ShouldStop(1048576);
pill_4.mostCurrent._etext4 = _new;
 BA.debugLineNum = 150;BA.debugLine="etext4_flag4=True";
Debug.ShouldStop(2097152);
pill_4._etext4_flag4 = pill_4.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Button1_Click (pill_4) ","pill_4",4,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,103);
if (RapidSub.canDelegate("button1_click")) { return Pill_Box.v1.pill_4.remoteMe.runUserSub(false, "pill_4","button1_click");}
 BA.debugLineNum = 103;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 105;BA.debugLine="File.WriteString(File.DirInternal, \"toogle_en.txt";
Debug.ShouldStop(256);
pill_4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("toogle_en.txt")),(Object)(BA.ObjectToString(pill_4.mostCurrent._togglebutton.runMethod(true,"getChecked"))));
 BA.debugLineNum = 107;BA.debugLine="If(etext1_flag1=True ) Then'اگر متن etext1 تغییر";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",pill_4._etext1_flag1,pill_4.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 108;BA.debugLine="File.WriteString(File.DirInternal, \"pill_naim4.t";
Debug.ShouldStop(2048);
pill_4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_naim4.txt")),(Object)(pill_4.mostCurrent._etext1));
 };
 BA.debugLineNum = 111;BA.debugLine="If(etext2_flag2=True ) Then'اگر متن etext2 تغییر";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",pill_4._etext2_flag2,pill_4.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 112;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_b";
Debug.ShouldStop(32768);
pill_4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_box4.txt")),(Object)(pill_4.mostCurrent._etext2));
 };
 BA.debugLineNum = 115;BA.debugLine="If(etext3_flag3=True ) Then'اگر متن etext3 تغییر";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("=",pill_4._etext3_flag3,pill_4.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 116;BA.debugLine="File.WriteString(File.DirInternal, \"start_time_4";
Debug.ShouldStop(524288);
pill_4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("start_time_4.txt")),(Object)(pill_4.mostCurrent._etext3));
 };
 BA.debugLineNum = 119;BA.debugLine="If(etext4_flag4=True ) Then'اگر متن etext4 تغییر";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",pill_4._etext4_flag4,pill_4.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 120;BA.debugLine="File.WriteString(File.DirInternal, \"interval_4.t";
Debug.ShouldStop(8388608);
pill_4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("interval_4.txt")),(Object)(pill_4.mostCurrent._etext4));
 };
 BA.debugLineNum = 123;BA.debugLine="If (ToggleButton.Checked) Then";
Debug.ShouldStop(67108864);
if ((pill_4.mostCurrent._togglebutton.runMethod(true,"getChecked")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 125;BA.debugLine="Main.astreams.Write(\"p4s\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(268435456);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p4s").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 126;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",pill_4.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_4.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 127;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"1\"";
Debug.ShouldStop(1073741824);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_4.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_4.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("1")))));
 }else {
 BA.debugLineNum = 129;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"0\"";
Debug.ShouldStop(1);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_4.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_4.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("0")))));
 };
 BA.debugLineNum = 132;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(8);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_4.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_4.mostCurrent.activityBA,(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box4.txt")))))));
 BA.debugLineNum = 133;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(16);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_4.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_4.mostCurrent.activityBA,(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_4.txt")))))));
 BA.debugLineNum = 134;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(32);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_4.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_4.mostCurrent.activityBA,(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_4.txt")))))));
 BA.debugLineNum = 135;BA.debugLine="Main.astreams.Write(\"p4e\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(64);
pill_4.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p4e").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 138;BA.debugLine="Log(ToggleButton.Checked & data_count & data_sta";
Debug.ShouldStop(512);
pill_4.mostCurrent.__c.runVoidMethod ("LogImpl","54915235",RemoteObject.concat(pill_4.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_4.mostCurrent._data_count,pill_4.mostCurrent._data_starttime,pill_4.mostCurrent._data_interval),0);
 };
 BA.debugLineNum = 141;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(4096);
pill_4.mostCurrent.__c.runVoidMethod ("StartActivity",pill_4.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 142;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
pill_4.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _edittext1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText1_TextChanged (pill_4) ","pill_4",4,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,165);
if (RapidSub.canDelegate("edittext1_textchanged")) { return Pill_Box.v1.pill_4.remoteMe.runUserSub(false, "pill_4","edittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 165;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(16);
 BA.debugLineNum = 167;BA.debugLine="etext1 = New";
Debug.ShouldStop(64);
pill_4.mostCurrent._etext1 = _new;
 BA.debugLineNum = 168;BA.debugLine="etext1_flag1=True";
Debug.ShouldStop(128);
pill_4._etext1_flag1 = pill_4.mostCurrent.__c.getField(true,"True");
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
public static RemoteObject  _edittext2_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText2_TextChanged (pill_4) ","pill_4",4,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,159);
if (RapidSub.canDelegate("edittext2_textchanged")) { return Pill_Box.v1.pill_4.remoteMe.runUserSub(false, "pill_4","edittext2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 159;BA.debugLine="Private Sub EditText2_TextChanged (Old As String,";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 161;BA.debugLine="etext2 = New";
Debug.ShouldStop(1);
pill_4.mostCurrent._etext2 = _new;
 BA.debugLineNum = 162;BA.debugLine="etext2_flag2=True";
Debug.ShouldStop(2);
pill_4._etext2_flag2 = pill_4.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("EditText3_TextChanged (pill_4) ","pill_4",4,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,153);
if (RapidSub.canDelegate("edittext3_textchanged")) { return Pill_Box.v1.pill_4.remoteMe.runUserSub(false, "pill_4","edittext3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 153;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 155;BA.debugLine="etext3 = New";
Debug.ShouldStop(67108864);
pill_4.mostCurrent._etext3 = _new;
 BA.debugLineNum = 156;BA.debugLine="etext3_flag3=True";
Debug.ShouldStop(134217728);
pill_4._etext3_flag3 = pill_4.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("fc_Result (pill_4) ","pill_4",4,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,194);
if (RapidSub.canDelegate("fc_result")) { return Pill_Box.v1.pill_4.remoteMe.runUserSub(false, "pill_4","fc_result", _success, _dir, _filename);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Success", _success);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 194;BA.debugLine="Sub fc_Result(Success As Boolean, Dir As String, F";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="If Success Then";
Debug.ShouldStop(4);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 197;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(16);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 198;BA.debugLine="bmp = LoadBitmap(Dir, FileName)";
Debug.ShouldStop(32);
_bmp = pill_4.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(_dir),(Object)(_filename));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 199;BA.debugLine="ImageView1.Bitmap = bmp";
Debug.ShouldStop(64);
pill_4.mostCurrent._imageview1.runMethod(false,"setBitmap",(_bmp.getObject()));
 BA.debugLineNum = 202;BA.debugLine="File.Copy(Dir, FileName, File.DirInternal, \"Imag";
Debug.ShouldStop(512);
pill_4.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(_dir),(Object)(_filename),(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill4.png")));
 BA.debugLineNum = 204;BA.debugLine="ToastMessageShow(\"Image saved successfully!\", Fa";
Debug.ShouldStop(2048);
pill_4.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Image saved successfully!")),(Object)(pill_4.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 206;BA.debugLine="ToastMessageShow(\"Failed to choose an image.\", F";
Debug.ShouldStop(8192);
pill_4.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Failed to choose an image.")),(Object)(pill_4.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
 //BA.debugLineNum = 50;BA.debugLine="Private ImageView1 As ImageView";
pill_4.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Dim rp As RuntimePermissions";
pill_4.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview1_longclick() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_LongClick (pill_4) ","pill_4",4,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,185);
if (RapidSub.canDelegate("imageview1_longclick")) { return Pill_Box.v1.pill_4.remoteMe.runUserSub(false, "pill_4","imageview1_longclick");}
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.ContentChooser");
 BA.debugLineNum = 185;BA.debugLine="Private Sub ImageView1_LongClick";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 187;BA.debugLine="Dim fc As ContentChooser";
Debug.ShouldStop(67108864);
_fc = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 188;BA.debugLine="fc.Initialize(\"fc\")";
Debug.ShouldStop(134217728);
_fc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("fc")));
 BA.debugLineNum = 189;BA.debugLine="fc.Show(\"image/*\", \"Select Image\")";
Debug.ShouldStop(268435456);
_fc.runVoidMethod ("Show",pill_4.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Select Image")));
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _togglebutton_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ToggleButton_CheckedChange (pill_4) ","pill_4",4,pill_4.mostCurrent.activityBA,pill_4.mostCurrent,172);
if (RapidSub.canDelegate("togglebutton_checkedchange")) { return Pill_Box.v1.pill_4.remoteMe.runUserSub(false, "pill_4","togglebutton_checkedchange", _checked);}
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 172;BA.debugLine="Private Sub ToggleButton_CheckedChange(Checked As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 174;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(8192);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 176;BA.debugLine="If Checked=True Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_checked,pill_4.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 177;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.p";
Debug.ShouldStop(65536);
_newimage.runVoidMethod ("Initialize",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 180;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off.";
Debug.ShouldStop(524288);
_newimage.runVoidMethod ("Initialize",(Object)(pill_4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 182;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(2097152);
pill_4.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
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
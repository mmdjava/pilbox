package Pill_Box.v1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pill_1_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,58);
if (RapidSub.canDelegate("activity_create")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","activity_create", _firsttime);}
int _i = 0;
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 58;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 61;BA.debugLine="hourSpinner.Initialize(\"hourSpinner\")";
Debug.ShouldStop(268435456);
pill_1.mostCurrent._hourspinner.runVoidMethod ("Initialize",pill_1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("hourSpinner")));
 BA.debugLineNum = 62;BA.debugLine="minuteSpinner.Initialize(\"minuteSpinner\")";
Debug.ShouldStop(536870912);
pill_1.mostCurrent._minutespinner.runVoidMethod ("Initialize",pill_1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("minuteSpinner")));
 BA.debugLineNum = 65;BA.debugLine="For i = 0 To 23";
Debug.ShouldStop(1);
{
final int step3 = 1;
final int limit3 = 23;
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 66;BA.debugLine="hourSpinner.Add(i)";
Debug.ShouldStop(2);
pill_1.mostCurrent._hourspinner.runVoidMethod ("Add",(Object)(BA.NumberToString(_i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 70;BA.debugLine="For i = 0 To 59";
Debug.ShouldStop(32);
{
final int step6 = 1;
final int limit6 = 59;
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 71;BA.debugLine="minuteSpinner.Add(i)";
Debug.ShouldStop(64);
pill_1.mostCurrent._minutespinner.runVoidMethod ("Add",(Object)(BA.NumberToString(_i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 75;BA.debugLine="Activity.AddView(hourSpinner, 50%x - 75dip, 50%y";
Debug.ShouldStop(1024);
pill_1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((pill_1.mostCurrent._hourspinner.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {pill_1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),pill_1.mostCurrent.activityBA),pill_1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 75)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {pill_1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),pill_1.mostCurrent.activityBA),pill_1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1)),(Object)(pill_1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(pill_1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 76;BA.debugLine="Activity.AddView(minuteSpinner, 50%x + 25dip, 50%";
Debug.ShouldStop(2048);
pill_1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((pill_1.mostCurrent._minutespinner.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {pill_1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),pill_1.mostCurrent.activityBA),pill_1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {pill_1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),pill_1.mostCurrent.activityBA),pill_1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1)),(Object)(pill_1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(pill_1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 80;BA.debugLine="Activity.LoadLayout(\"pill_1\")";
Debug.ShouldStop(32768);
pill_1.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pill_1")),pill_1.mostCurrent.activityBA);
 BA.debugLineNum = 83;BA.debugLine="If File.Exists(File.DirInternal, \"Imagepill1.png\"";
Debug.ShouldStop(262144);
if (pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill1.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 85;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirInternal,";
Debug.ShouldStop(1048576);
pill_1.mostCurrent._imageview1.runMethod(false,"setBitmap",(pill_1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill1.png"))).getObject()));
 }else {
 BA.debugLineNum = 87;BA.debugLine="ToastMessageShow(\"No image found.\", False)";
Debug.ShouldStop(4194304);
pill_1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No image found.")),(Object)(pill_1.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 90;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 92;BA.debugLine="ToggleButton.Checked= File.ReadString(File.DirIn";
Debug.ShouldStop(134217728);
pill_1.mostCurrent._togglebutton.runMethodAndSync(true,"setChecked",BA.ObjectToBoolean(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("toogle_en.txt")))));
 BA.debugLineNum = 93;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(268435456);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 95;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",pill_1.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_1.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 96;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.";
Debug.ShouldStop(-2147483648);
_newimage.runVoidMethod ("Initialize",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 99;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off";
Debug.ShouldStop(4);
_newimage.runVoidMethod ("Initialize",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 101;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(16);
pill_1.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
 BA.debugLineNum = 102;BA.debugLine="EditText1.Text = File.ReadString(File.DirInternal";
Debug.ShouldStop(32);
pill_1.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_naim1.txt")))));
 BA.debugLineNum = 103;BA.debugLine="EditText2.Text = File.ReadString(File.DirInternal";
Debug.ShouldStop(64);
pill_1.mostCurrent._edittext2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box1.txt")))));
 BA.debugLineNum = 104;BA.debugLine="EditText3.Text = File.ReadString(File.DirInternal";
Debug.ShouldStop(128);
pill_1.mostCurrent._edittext3.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_1.txt")))));
 BA.debugLineNum = 105;BA.debugLine="AutoCompleteEditText1.Text = File.ReadString(File";
Debug.ShouldStop(256);
pill_1.mostCurrent._autocompleteedittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_1.txt")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e31) {
			BA.rdebugUtils.runVoidMethod("setLastException",pill_1.processBA, e31.toString()); };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_Pause (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,122);
if (RapidSub.canDelegate("activity_pause")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 122;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Resume (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,118);
if (RapidSub.canDelegate("activity_resume")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","activity_resume");}
 BA.debugLineNum = 118;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _autocompleteedittext1_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("AutoCompleteEditText1_TextChanged (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,173);
if (RapidSub.canDelegate("autocompleteedittext1_textchanged")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","autocompleteedittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 173;BA.debugLine="Private Sub AutoCompleteEditText1_TextChanged (Old";
Debug.ShouldStop(4096);
 BA.debugLineNum = 175;BA.debugLine="etext4 = New";
Debug.ShouldStop(16384);
pill_1.mostCurrent._etext4 = _new;
 BA.debugLineNum = 176;BA.debugLine="etext4_flag4=True";
Debug.ShouldStop(32768);
pill_1._etext4_flag4 = pill_1.mostCurrent.__c.getField(true,"True");
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,127);
if (RapidSub.canDelegate("button1_click")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","button1_click");}
 BA.debugLineNum = 127;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 129;BA.debugLine="File.WriteString(File.DirInternal, \"toogle_en.txt";
Debug.ShouldStop(1);
pill_1.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("toogle_en.txt")),(Object)(BA.ObjectToString(pill_1.mostCurrent._togglebutton.runMethod(true,"getChecked"))));
 BA.debugLineNum = 131;BA.debugLine="If(etext1_flag1=True ) Then'اگر متن etext1 تغییر";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("=",pill_1._etext1_flag1,pill_1.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 132;BA.debugLine="File.WriteString(File.DirInternal, \"pill_naim1.tx";
Debug.ShouldStop(8);
pill_1.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_naim1.txt")),(Object)(pill_1.mostCurrent._etext1));
 };
 BA.debugLineNum = 135;BA.debugLine="If(etext2_flag2=True ) Then'اگر متن etext2 تغییر";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",pill_1._etext2_flag2,pill_1.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 136;BA.debugLine="File.WriteString(File.DirInternal, \"pill_count_b";
Debug.ShouldStop(128);
pill_1.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("pill_count_box1.txt")),(Object)(pill_1.mostCurrent._etext2));
 };
 BA.debugLineNum = 139;BA.debugLine="If(etext3_flag3=True ) Then'اگر متن etext3 تغییر";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",pill_1._etext3_flag3,pill_1.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 140;BA.debugLine="File.WriteString(File.DirInternal, \"start_time_1";
Debug.ShouldStop(2048);
pill_1.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("start_time_1.txt")),(Object)(pill_1.mostCurrent._etext3));
 };
 BA.debugLineNum = 143;BA.debugLine="If(etext4_flag4=True ) Then'اگر متن etext4 تغییر";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",pill_1._etext4_flag4,pill_1.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 144;BA.debugLine="File.WriteString(File.DirInternal, \"interval_1.t";
Debug.ShouldStop(32768);
pill_1.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("interval_1.txt")),(Object)(pill_1.mostCurrent._etext4));
 };
 BA.debugLineNum = 147;BA.debugLine="If (ToggleButton.Checked) Then";
Debug.ShouldStop(262144);
if ((pill_1.mostCurrent._togglebutton.runMethod(true,"getChecked")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 149;BA.debugLine="Main.astreams.Write(\"p1s\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(1048576);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p1s").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 150;BA.debugLine="If ToggleButton.Checked=True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",pill_1.mostCurrent._togglebutton.runMethod(true,"getChecked"),pill_1.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 151;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"1\"";
Debug.ShouldStop(4194304);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_1.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("1")))));
 }else {
 BA.debugLineNum = 153;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(\"0\"";
Debug.ShouldStop(16777216);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_1.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("0")))));
 };
 BA.debugLineNum = 156;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(134217728);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_1.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_1.mostCurrent.activityBA,(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("pill_count_box1.txt")))))));
 BA.debugLineNum = 157;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(268435456);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_1.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_1.mostCurrent.activityBA,(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("start_time_1.txt")))))));
 BA.debugLineNum = 158;BA.debugLine="Main.astreams.Write(naseri_func.string2byte(File";
Debug.ShouldStop(536870912);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(pill_1.mostCurrent._naseri_func.runMethod(false,"_string2byte" /*RemoteObject*/ ,pill_1.mostCurrent.activityBA,(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("interval_1.txt")))))));
 BA.debugLineNum = 159;BA.debugLine="Main.astreams.Write(\"p1e\".GetBytes(\"UTF8\"))";
Debug.ShouldStop(1073741824);
pill_1.mostCurrent._main._astreams /*RemoteObject*/ .runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("p1e").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 };
 BA.debugLineNum = 165;BA.debugLine="etext2_flag2=False";
Debug.ShouldStop(16);
pill_1._etext2_flag2 = pill_1.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 167;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(64);
pill_1.mostCurrent.__c.runVoidMethod ("StartActivity",pill_1.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 168;BA.debugLine="Activity.Finish";
Debug.ShouldStop(128);
pill_1.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 171;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("EditText1_TextChanged (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,195);
if (RapidSub.canDelegate("edittext1_textchanged")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","edittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 195;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(4);
 BA.debugLineNum = 198;BA.debugLine="etext1 = New";
Debug.ShouldStop(32);
pill_1.mostCurrent._etext1 = _new;
 BA.debugLineNum = 199;BA.debugLine="etext1_flag1=True";
Debug.ShouldStop(64);
pill_1._etext1_flag1 = pill_1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 200;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("EditText2_TextChanged (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,188);
if (RapidSub.canDelegate("edittext2_textchanged")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","edittext2_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 188;BA.debugLine="Private Sub EditText2_TextChanged (Old As String,";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 191;BA.debugLine="etext2 = New";
Debug.ShouldStop(1073741824);
pill_1.mostCurrent._etext2 = _new;
 BA.debugLineNum = 192;BA.debugLine="etext2_flag2=True";
Debug.ShouldStop(-2147483648);
pill_1._etext2_flag2 = pill_1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 193;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("EditText3_TextChanged (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,180);
if (RapidSub.canDelegate("edittext3_textchanged")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","edittext3_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 180;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
Debug.ShouldStop(524288);
 BA.debugLineNum = 184;BA.debugLine="etext3 = New";
Debug.ShouldStop(8388608);
pill_1.mostCurrent._etext3 = _new;
 BA.debugLineNum = 185;BA.debugLine="etext3_flag3=True";
Debug.ShouldStop(16777216);
pill_1._etext3_flag3 = pill_1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("fc_Result (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,226);
if (RapidSub.canDelegate("fc_result")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","fc_result", _success, _dir, _filename);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Success", _success);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 226;BA.debugLine="Sub fc_Result(Success As Boolean, Dir As String, F";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="If Success Then";
Debug.ShouldStop(4);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 229;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(16);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 230;BA.debugLine="bmp = LoadBitmap(Dir, FileName)";
Debug.ShouldStop(32);
_bmp = pill_1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(_dir),(Object)(_filename));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 231;BA.debugLine="ImageView1.Bitmap = bmp";
Debug.ShouldStop(64);
pill_1.mostCurrent._imageview1.runMethod(false,"setBitmap",(_bmp.getObject()));
 BA.debugLineNum = 234;BA.debugLine="File.Copy(Dir, FileName, File.DirInternal, \"Imag";
Debug.ShouldStop(512);
pill_1.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(_dir),(Object)(_filename),(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Imagepill1.png")));
 BA.debugLineNum = 236;BA.debugLine="ToastMessageShow(\"Image saved successfully!\", Fa";
Debug.ShouldStop(2048);
pill_1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Image saved successfully!")),(Object)(pill_1.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 238;BA.debugLine="ToastMessageShow(\"Failed to choose an image.\", F";
Debug.ShouldStop(8192);
pill_1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Failed to choose an image.")),(Object)(pill_1.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 240;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 47;BA.debugLine="togeleButton_flge=False";
pill_1._togelebutton_flge = pill_1.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 48;BA.debugLine="Private ToggleButton As ToggleButton";
pill_1.mostCurrent._togglebutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private ImageView1 As ImageView";
pill_1.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Dim rp As RuntimePermissions";
pill_1.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 53;BA.debugLine="Dim hourSpinner As Spinner";
pill_1.mostCurrent._hourspinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Dim minuteSpinner As Spinner";
pill_1.mostCurrent._minutespinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hourspinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("hourSpinner_ItemClick (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,242);
if (RapidSub.canDelegate("hourspinner_itemclick")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","hourspinner_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 242;BA.debugLine="Sub hourSpinner_ItemClick (Position As Int, Value";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="Log(\"Selected hour: \" & Value)";
Debug.ShouldStop(262144);
pill_1.mostCurrent.__c.runVoidMethod ("LogImpl","52752513",RemoteObject.concat(RemoteObject.createImmutable("Selected hour: "),_value),0);
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imageview1_longclick() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_LongClick (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,217);
if (RapidSub.canDelegate("imageview1_longclick")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","imageview1_longclick");}
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.ContentChooser");
 BA.debugLineNum = 217;BA.debugLine="Private Sub ImageView1_LongClick";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 219;BA.debugLine="Dim fc As ContentChooser";
Debug.ShouldStop(67108864);
_fc = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 220;BA.debugLine="fc.Initialize(\"fc\")";
Debug.ShouldStop(134217728);
_fc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("fc")));
 BA.debugLineNum = 221;BA.debugLine="fc.Show(\"image/*\", \"Select Image\")";
Debug.ShouldStop(268435456);
_fc.runVoidMethod ("Show",pill_1.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Select Image")));
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _minutespinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("minuteSpinner_ItemClick (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,246);
if (RapidSub.canDelegate("minutespinner_itemclick")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","minutespinner_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 246;BA.debugLine="Sub minuteSpinner_ItemClick (Position As Int, Valu";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 247;BA.debugLine="Log(\"Selected minute: \" & Value)";
Debug.ShouldStop(4194304);
pill_1.mostCurrent.__c.runVoidMethod ("LogImpl","52818049",RemoteObject.concat(RemoteObject.createImmutable("Selected minute: "),_value),0);
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("ToggleButton_CheckedChange (pill_1) ","pill_1",1,pill_1.mostCurrent.activityBA,pill_1.mostCurrent,204);
if (RapidSub.canDelegate("togglebutton_checkedchange")) { return Pill_Box.v1.pill_1.remoteMe.runUserSub(false, "pill_1","togglebutton_checkedchange", _checked);}
RemoteObject _newimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 204;BA.debugLine="Private Sub ToggleButton_CheckedChange(Checked As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 206;BA.debugLine="Dim newImage As Bitmap";
Debug.ShouldStop(8192);
_newimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("newImage", _newimage);
 BA.debugLineNum = 208;BA.debugLine="If Checked=True Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_checked,pill_1.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 209;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-on.pn";
Debug.ShouldStop(65536);
_newimage.runVoidMethod ("Initialize",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-on.png")));
 }else {
 BA.debugLineNum = 212;BA.debugLine="newImage.Initialize(File.DirAssets, \"switch-off.";
Debug.ShouldStop(524288);
_newimage.runVoidMethod ("Initialize",(Object)(pill_1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("switch-off.png")));
 };
 BA.debugLineNum = 214;BA.debugLine="ToggleButton.SetBackgroundImage(newImage)";
Debug.ShouldStop(2097152);
pill_1.mostCurrent._togglebutton.runVoidMethod ("SetBackgroundImageNew",(Object)((_newimage.getObject())));
 BA.debugLineNum = 215;BA.debugLine="End Sub";
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
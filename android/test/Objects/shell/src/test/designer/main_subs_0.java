package test.designer;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
if (RapidSub.canDelegate("activity_create")) { return test.designer.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _days = null;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(64);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="RadioButton1.Checked = True";
Debug.ShouldStop(2048);
main.mostCurrent._radiobutton1.runMethodAndSync(true,"setChecked",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 46;BA.debugLine="Spinner1.DropdownBackgroundColor = 0x55FFE801";
Debug.ShouldStop(8192);
main.mostCurrent._spinner1.runMethod(true,"setDropdownBackgroundColor",BA.numberCast(int.class, ((int)0x55ffe801)));
 BA.debugLineNum = 47;BA.debugLine="Spinner1.DropdownTextColor = 0xFF000000";
Debug.ShouldStop(16384);
main.mostCurrent._spinner1.runMethod(true,"setDropdownTextColor",BA.numberCast(int.class, ((int)0xff000000)));
 BA.debugLineNum = 48;BA.debugLine="Spinner1.Add(\"نارنجی\")";
Debug.ShouldStop(32768);
main.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("نارنجی")));
 BA.debugLineNum = 49;BA.debugLine="Spinner1.Add(\"قرمز\")";
Debug.ShouldStop(65536);
main.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("قرمز")));
 BA.debugLineNum = 50;BA.debugLine="Spinner1.Add(\"آبی\")";
Debug.ShouldStop(131072);
main.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("آبی")));
 BA.debugLineNum = 51;BA.debugLine="Spinner1.Add(\"سبز\")";
Debug.ShouldStop(262144);
main.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("سبز")));
 BA.debugLineNum = 53;BA.debugLine="Spinner1.Color = 0x8DFF6E00";
Debug.ShouldStop(1048576);
main.mostCurrent._spinner1.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0x8dff6e00)));
 BA.debugLineNum = 55;BA.debugLine="Dim days() As String";
Debug.ShouldStop(4194304);
_days = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("days", _days);
 BA.debugLineNum = 57;BA.debugLine="days = Array As String(\"قرمز\",\"آبی\",\"سبز\",\"نارنجی";
Debug.ShouldStop(16777216);
_days = RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("قرمز"),BA.ObjectToString("آبی"),BA.ObjectToString("سبز"),RemoteObject.createImmutable("نارنجی")});Debug.locals.put("days", _days);
 BA.debugLineNum = 59;BA.debugLine="ToastMessageShow(days(1),False)";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_days.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 61;BA.debugLine="Spinner1.AddAll(days)";
Debug.ShouldStop(268435456);
main.mostCurrent._spinner1.runVoidMethod ("AddAll",(Object)(main.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_days))));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("activity_pause")) { return test.designer.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,66);
if (RapidSub.canDelegate("activity_resume")) { return test.designer.main.remoteMe.runUserSub(false, "main","activity_resume");}
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,74);
if (RapidSub.canDelegate("button1_click")) { return test.designer.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 74;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbox1_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBox1_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,102);
if (RapidSub.canDelegate("checkbox1_checkedchange")) { return test.designer.main.remoteMe.runUserSub(false, "main","checkbox1_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 102;BA.debugLine="Private Sub CheckBox1_CheckedChange(Checked As Boo";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="If Checked Then";
Debug.ShouldStop(128);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 105;BA.debugLine="CheckBox1.Text = \"بلوتوث فعال شد\"";
Debug.ShouldStop(256);
main.mostCurrent._checkbox1.runMethod(true,"setText",BA.ObjectToCharSequence("بلوتوث فعال شد"));
 }else {
 BA.debugLineNum = 109;BA.debugLine="CheckBox1.Text = \"بلوتوث غیر فعال شد\"";
Debug.ShouldStop(4096);
main.mostCurrent._checkbox1.runMethod(true,"setText",BA.ObjectToCharSequence("بلوتوث غیر فعال شد"));
 };
 BA.debugLineNum = 113;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("EditText1_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,81);
if (RapidSub.canDelegate("edittext1_textchanged")) { return test.designer.main.remoteMe.runUserSub(false, "main","edittext1_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 81;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="ToastMessageShow(Old,False)";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_old)),(Object)(main.mostCurrent.__c.getField(true,"False")));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private EditText1 As EditText";
main.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ProgressBar1 As ProgressBar";
main.mostCurrent._progressbar1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 26;BA.debugLine="b = 0";
main.mostCurrent._b = BA.NumberToString(0);
 //BA.debugLineNum = 27;BA.debugLine="Private SeekBar1 As SeekBar";
main.mostCurrent._seekbar1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SeekBarWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private CheckBox1 As CheckBox";
main.mostCurrent._checkbox1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private RadioButton1 As RadioButton";
main.mostCurrent._radiobutton1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private RadioButton2 As RadioButton";
main.mostCurrent._radiobutton2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private RadioButton3 As RadioButton";
main.mostCurrent._radiobutton3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private RadioButton4 As RadioButton";
main.mostCurrent._radiobutton4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private ToggleButton1 As ToggleButton";
main.mostCurrent._togglebutton1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private Spinner1 As Spinner";
main.mostCurrent._spinner1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _label1_click() throws Exception{
try {
		Debug.PushSubsStack("Label1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,87);
if (RapidSub.canDelegate("label1_click")) { return test.designer.main.remoteMe.runUserSub(false, "main","label1_click");}
 BA.debugLineNum = 87;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
main.myClass = BA.getDeviceClass ("test.designer.main");
starter.myClass = BA.getDeviceClass ("test.designer.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _radiobutton1_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("RadioButton1_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,133);
if (RapidSub.canDelegate("radiobutton1_checkedchange")) { return test.designer.main.remoteMe.runUserSub(false, "main","radiobutton1_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 133;BA.debugLine="Private Sub RadioButton1_CheckedChange(Checked As";
Debug.ShouldStop(16);
 BA.debugLineNum = 135;BA.debugLine="ToastMessageShow(\"گزینه اول فعال شده است\",False)";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزینه اول فعال شده است")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _radiobutton2_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("RadioButton2_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,127);
if (RapidSub.canDelegate("radiobutton2_checkedchange")) { return test.designer.main.remoteMe.runUserSub(false, "main","radiobutton2_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 127;BA.debugLine="Private Sub RadioButton2_CheckedChange(Checked As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 129;BA.debugLine="ToastMessageShow(\"گزینه دوم فعال شده است\",False)";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزینه دوم فعال شده است")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _radiobutton3_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("RadioButton3_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,121);
if (RapidSub.canDelegate("radiobutton3_checkedchange")) { return test.designer.main.remoteMe.runUserSub(false, "main","radiobutton3_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 121;BA.debugLine="Private Sub RadioButton3_CheckedChange(Checked As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 123;BA.debugLine="ToastMessageShow(\"گزینه سوم فعال شده است\",False)";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزینه سوم فعال شده است")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _radiobutton4_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("RadioButton4_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,115);
if (RapidSub.canDelegate("radiobutton4_checkedchange")) { return test.designer.main.remoteMe.runUserSub(false, "main","radiobutton4_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 115;BA.debugLine="Private Sub RadioButton4_CheckedChange(Checked As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 117;BA.debugLine="ToastMessageShow(\"گزینه چهارم فعال شده است\",False";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزینه چهارم فعال شده است")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seekbar1_valuechanged(RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("SeekBar1_ValueChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,93);
if (RapidSub.canDelegate("seekbar1_valuechanged")) { return test.designer.main.remoteMe.runUserSub(false, "main","seekbar1_valuechanged", _value, _userchanged);}
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 93;BA.debugLine="Private Sub SeekBar1_ValueChanged (Value As Int, U";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="Label1.Text = Value";
Debug.ShouldStop(1073741824);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 97;BA.debugLine="ToastMessageShow(UserChanged,False)";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_userchanged)),(Object)(main.mostCurrent.__c.getField(true,"False")));
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
public static RemoteObject  _spinner1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner1_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,151);
if (RapidSub.canDelegate("spinner1_itemclick")) { return test.designer.main.remoteMe.runUserSub(false, "main","spinner1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 151;BA.debugLine="Private Sub Spinner1_ItemClick (Position As Int, V";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 154;BA.debugLine="If Position = 0 Then Spinner1.Color = 0x8DFF6E00";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
main.mostCurrent._spinner1.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0x8dff6e00)));};
 BA.debugLineNum = 155;BA.debugLine="If Position = 1 Then Spinner1.Color = 0x78FF0000";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 1))) { 
main.mostCurrent._spinner1.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0x78ff0000)));};
 BA.debugLineNum = 156;BA.debugLine="If Position = 2 Then Spinner1.Color = 0x780024FF";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 2))) { 
main.mostCurrent._spinner1.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0x780024ff)));};
 BA.debugLineNum = 157;BA.debugLine="If Position = 3 Then Spinner1.Color = 0x7800FF0E";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 3))) { 
main.mostCurrent._spinner1.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0x7800ff0e)));};
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _togglebutton1_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ToggleButton1_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,139);
if (RapidSub.canDelegate("togglebutton1_checkedchange")) { return test.designer.main.remoteMe.runUserSub(false, "main","togglebutton1_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 139;BA.debugLine="Private Sub ToggleButton1_CheckedChange(Checked As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 142;BA.debugLine="If Checked Then";
Debug.ShouldStop(8192);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 143;BA.debugLine="Panel1.Color = 0x85FFBB00";
Debug.ShouldStop(16384);
main.mostCurrent._panel1.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0x85ffbb00)));
 }else {
 BA.debugLineNum = 146;BA.debugLine="Panel1.Color = 0x00FFBB00";
Debug.ShouldStop(131072);
main.mostCurrent._panel1.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0x00ffbb00)));
 };
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
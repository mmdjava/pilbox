package b4a.example2;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _wle = null;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="ListView1.AddSingleLine(\"  شنبه\")";
Debug.ShouldStop(1);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("  شنبه"))));
 BA.debugLineNum = 34;BA.debugLine="ListView1.AddSingleLine(\"  یکشنبه\")";
Debug.ShouldStop(2);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("  یکشنبه"))));
 BA.debugLineNum = 35;BA.debugLine="ListView1.AddSingleLine(\"  دوشنبه\")";
Debug.ShouldStop(4);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("  دوشنبه"))));
 BA.debugLineNum = 36;BA.debugLine="ListView1.AddSingleLine(\"  سه شنبه\")";
Debug.ShouldStop(8);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("  سه شنبه"))));
 BA.debugLineNum = 37;BA.debugLine="ListView1.AddSingleLine(\"  چهارشنبه\")";
Debug.ShouldStop(16);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("  چهارشنبه"))));
 BA.debugLineNum = 38;BA.debugLine="ListView1.AddSingleLine(\"  پنج شنبه\")";
Debug.ShouldStop(32);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("  پنج شنبه"))));
 BA.debugLineNum = 39;BA.debugLine="ListView1.AddSingleLine(\"  جمعه\")";
Debug.ShouldStop(64);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("  جمعه"))));
 BA.debugLineNum = 40;BA.debugLine="ListView1.AddTwoLines(\"This is the first line.\",";
Debug.ShouldStop(128);
main.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence("This is the first line.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("And this is the second"))));
 BA.debugLineNum = 41;BA.debugLine="Dim wle() As String";
Debug.ShouldStop(256);
_wle = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("wle", _wle);
 BA.debugLineNum = 42;BA.debugLine="wle = Array As String(\"ایران\",\"ایمان\",\"خر\",\"خراسا";
Debug.ShouldStop(512);
_wle = RemoteObject.createNewArray("String",new int[] {8},new Object[] {BA.ObjectToString("ایران"),BA.ObjectToString("ایمان"),BA.ObjectToString("خر"),BA.ObjectToString("خراسان"),BA.ObjectToString("خراسان بزرگ"),BA.ObjectToString("عقل"),BA.ObjectToString("عراق"),RemoteObject.createImmutable("احمد")});Debug.locals.put("wle", _wle);
 BA.debugLineNum = 43;BA.debugLine="AutoCompleteEditText1.SetItems(wle)";
Debug.ShouldStop(1024);
main.mostCurrent._autocompleteedittext1.runVoidMethod ("SetItems",main.processBA,(Object)(main.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_wle))));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,56);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,77);
if (RapidSub.canDelegate("button1_click")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 77;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 80;BA.debugLine="StartActivity(\"seting\")";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("seting"))));
 BA.debugLineNum = 81;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
 //BA.debugLineNum = 22;BA.debugLine="Private ListView1 As ListView";
main.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ImageView1 As ImageView";
main.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private AutoCompleteEditText1 As AutoCompleteEdit";
main.mostCurrent._autocompleteedittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview1_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,67);
if (RapidSub.canDelegate("imageview1_click")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","imageview1_click");}
 BA.debugLineNum = 67;BA.debugLine="Private Sub ImageView1_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listview1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","listview1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 61;BA.debugLine="Private Sub ListView1_ItemClick (Position As Int,";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="ToastMessageShow(Value&\"(\"&Position&\")\",False)";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_value,RemoteObject.createImmutable("("),_position,RemoteObject.createImmutable(")")))),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _openfile_click() throws Exception{
try {
		Debug.PushSubsStack("OpenFile_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
if (RapidSub.canDelegate("openfile_click")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","openfile_click");}
 BA.debugLineNum = 73;BA.debugLine="Sub OpenFile_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
seting_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example2.main");
starter.myClass = BA.getDeviceClass ("b4a.example2.starter");
seting.myClass = BA.getDeviceClass ("b4a.example2.seting");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}
package Pill_Box.v1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class imgview_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (imgview) ","imgview",7,imgview.mostCurrent.activityBA,imgview.mostCurrent,16);
if (RapidSub.canDelegate("activity_create")) { return Pill_Box.v1.imgview.remoteMe.runUserSub(false, "imgview","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 16;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="Activity.LoadLayout(\"Main\")";
Debug.ShouldStop(131072);
imgview.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Main")),imgview.mostCurrent.activityBA);
 BA.debugLineNum = 21;BA.debugLine="imgView.Bitmap = LoadBitmap(File.DirAssets, \"defa";
Debug.ShouldStop(1048576);
imgview.mostCurrent._imgview.runMethod(false,"setBitmap",(imgview.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(imgview.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("default_image.jpg"))).getObject()));
 BA.debugLineNum = 24;BA.debugLine="btnChangeImage.Initialize(\"btnChangeImage\")";
Debug.ShouldStop(8388608);
imgview.mostCurrent._btnchangeimage.runVoidMethod ("Initialize",imgview.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btnChangeImage")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnchangeimage_click() throws Exception{
try {
		Debug.PushSubsStack("btnChangeImage_Click (imgview) ","imgview",7,imgview.mostCurrent.activityBA,imgview.mostCurrent,27);
if (RapidSub.canDelegate("btnchangeimage_click")) { return Pill_Box.v1.imgview.remoteMe.runUserSub(false, "imgview","btnchangeimage_click");}
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.ContentChooser");
 BA.debugLineNum = 27;BA.debugLine="Sub btnChangeImage_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="Dim fc As ContentChooser";
Debug.ShouldStop(268435456);
_fc = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 30;BA.debugLine="fc.Initialize(\"fc\")";
Debug.ShouldStop(536870912);
_fc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("fc")));
 BA.debugLineNum = 31;BA.debugLine="fc.Show(\"image/*\", \"Select Image\")";
Debug.ShouldStop(1073741824);
_fc.runVoidMethod ("Show",imgview.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Select Image")));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("fc_Result (imgview) ","imgview",7,imgview.mostCurrent.activityBA,imgview.mostCurrent,34);
if (RapidSub.canDelegate("fc_result")) { return Pill_Box.v1.imgview.remoteMe.runUserSub(false, "imgview","fc_result", _success, _dir, _filename);}
Debug.locals.put("Success", _success);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 34;BA.debugLine="Sub fc_Result(Success As Boolean, Dir As String, F";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="If Success Then";
Debug.ShouldStop(4);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 37;BA.debugLine="imgView.Bitmap = LoadBitmap(Dir, FileName)";
Debug.ShouldStop(16);
imgview.mostCurrent._imgview.runMethod(false,"setBitmap",(imgview.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(_dir),(Object)(_filename)).getObject()));
 }else {
 BA.debugLineNum = 39;BA.debugLine="ToastMessageShow(\"Failed to choose an image.\", F";
Debug.ShouldStop(64);
imgview.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Failed to choose an image.")),(Object)(imgview.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private imgView As ImageView";
imgview.mostCurrent._imgview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private btnChangeImage As Button";
imgview.mostCurrent._btnchangeimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}
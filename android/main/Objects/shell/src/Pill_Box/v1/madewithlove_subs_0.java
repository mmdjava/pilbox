package Pill_Box.v1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class madewithlove_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (madewithlove) ","madewithlove",28,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "madewithlove","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 47;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Wid";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mEventName As String 'ignore";
madewithlove._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",madewithlove._meventname);
 //BA.debugLineNum = 3;BA.debugLine="Private mCallBack As Object 'ignore";
madewithlove._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",madewithlove._mcallback);
 //BA.debugLineNum = 4;BA.debugLine="Public mBase As B4XView";
madewithlove._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",madewithlove._mbase);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI 'ignore";
madewithlove._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",madewithlove._xui);
 //BA.debugLineNum = 6;BA.debugLine="Public Tag As Object";
madewithlove._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",madewithlove._tag);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (madewithlove) ","madewithlove",28,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "madewithlove","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 15;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 16;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 17;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 17;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 18;BA.debugLine="Dim xlbl As B4XView = Lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 33;BA.debugLine="Dim cs As CSBuilder";
Debug.JustUpdateDeviceLine();
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 34;BA.debugLine="cs.Initialize.Append(\"Made with \").Typeface(Typef";
Debug.JustUpdateDeviceLine();
_cs.runMethod(false,"Initialize").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Made with ")))).runMethod(false,"Typeface",(Object)(madewithlove.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"))).runMethod(false,"Color",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(madewithlove.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf004))))))).runMethod(false,"Pop").runMethod(false,"Pop").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(" in B4X")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 35;BA.debugLine="xlbl.Text = cs";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",BA.ObjectToCharSequence(_cs.getObject()));
 BA.debugLineNum = 36;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 37;BA.debugLine="mBase.AddView(xlbl, 0, 0, mBase.Width, mBase.Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_xlbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (madewithlove) ","madewithlove",28,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "madewithlove","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 10;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 11;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
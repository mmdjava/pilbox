package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xuiviewsutils_subs_0 {


public static RemoteObject  _addstubtoclvifneeded(RemoteObject _ba,RemoteObject _customlistview1,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("AddStubToCLVIfNeeded (xuiviewsutils) ","xuiviewsutils",32,_ba,xuiviewsutils.mostCurrent,34);
if (RapidSub.canDelegate("addstubtoclvifneeded")) { return b4a.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","addstubtoclvifneeded", _ba, _customlistview1, _color);}
RemoteObject _lastitem = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _height = RemoteObject.createImmutable(0);
;
Debug.locals.put("CustomListView1", _customlistview1);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 34;BA.debugLine="Public Sub AddStubToCLVIfNeeded(CustomListView1 As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="If CustomListView1.Size = 0 Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_customlistview1.runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 36;BA.debugLine="Dim LastItem As CLVItem = CustomListView1.GetRawL";
Debug.JustUpdateDeviceLine();
_lastitem = _customlistview1.runMethod(false,"_getrawlistitem",(Object)(RemoteObject.solve(new RemoteObject[] {_customlistview1.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("LastItem", _lastitem);Debug.locals.put("LastItem", _lastitem);
 BA.debugLineNum = 37;BA.debugLine="If LastItem.Offset + LastItem.Panel.Height < Cust";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_lastitem.getField(true,"Offset"),_lastitem.getField(false,"Panel").runMethod(true,"getHeight")}, "+",1, 1),BA.numberCast(double.class, _customlistview1.runMethod(false,"_asview").runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 39;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"stub\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = xuiviewsutils._xui.runMethod(false,"CreatePanel",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(RemoteObject.createImmutable("stub")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 40;BA.debugLine="p.Color = Color";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",_color);
 BA.debugLineNum = 41;BA.debugLine="Dim Height As Int = CustomListView1.AsView.Heigh";
Debug.JustUpdateDeviceLine();
_height = RemoteObject.solve(new RemoteObject[] {_customlistview1.runMethod(false,"_asview").runMethod(true,"getHeight"),_lastitem.getField(true,"Offset"),_lastitem.getField(false,"Panel").runMethod(true,"getHeight"),xuiviewsutils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "---",3, 1);Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 42;BA.debugLine="If xui.IsB4J Then Height = Height + 5";
Debug.JustUpdateDeviceLine();
if (xuiviewsutils._xui.runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
_height = RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(5)}, "+",1, 1);Debug.locals.put("Height", _height);};
 BA.debugLineNum = 43;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_customlistview1.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(_height));
 BA.debugLineNum = 44;BA.debugLine="CustomListView1.Add(p, \"\")";
Debug.JustUpdateDeviceLine();
_customlistview1.runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 45;BA.debugLine="CustomListView1.sv.ScrollViewContentHeight = Cus";
Debug.JustUpdateDeviceLine();
_customlistview1.getField(false,"_sv").runMethod(true,"setScrollViewContentHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_customlistview1.getField(false,"_sv").runMethod(true,"getScrollViewContentHeight"),_customlistview1.runMethod(true,"_getdividersize")}, "-",1, 0)));
 };
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createb4ximageview(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CreateB4XImageView (xuiviewsutils) ","xuiviewsutils",32,_ba,xuiviewsutils.mostCurrent,85);
if (RapidSub.canDelegate("createb4ximageview")) { return b4a.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","createb4ximageview", _ba);}
RemoteObject _iv = RemoteObject.declareNull("b4a.example.b4ximageview");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
;
 BA.debugLineNum = 85;BA.debugLine="Public Sub CreateB4XImageView As B4XImageView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Dim iv As B4XImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("b4a.example.b4ximageview");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 87;BA.debugLine="iv.Initialize(Null, \"\")";
Debug.JustUpdateDeviceLine();
_iv.runClassMethod (b4a.example.b4ximageview.class, "_initialize" /*RemoteObject*/ ,_ba,(Object)(xuiviewsutils.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 88;BA.debugLine="Dim base As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_base = xuiviewsutils._xui.runMethod(false,"CreatePanel",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("base", _base);Debug.locals.put("base", _base);
 BA.debugLineNum = 89;BA.debugLine="base.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
Debug.JustUpdateDeviceLine();
_base.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(xuiviewsutils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(xuiviewsutils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 90;BA.debugLine="iv.DesignerCreateView(base, Null, CreateMap(\"Roun";
Debug.JustUpdateDeviceLine();
_iv.runClassMethod (b4a.example.b4ximageview.class, "_designercreateview" /*RemoteObject*/ ,(Object)((_base.getObject())),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), xuiviewsutils.mostCurrent.__c.getField(false,"Null")),(Object)(xuiviewsutils.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Round")),(xuiviewsutils.mostCurrent.__c.getField(true,"False")),RemoteObject.createImmutable(("ResizeMode")),RemoteObject.createImmutable(("FIT")),RemoteObject.createImmutable(("BackgroundColor")),RemoteObject.createImmutable((((int)0xffaaaaaa))),RemoteObject.createImmutable(("CornersRadius")),RemoteObject.createImmutable((0))}))));
 BA.debugLineNum = 91;BA.debugLine="Return iv";
Debug.JustUpdateDeviceLine();
if (true) return _iv;
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (xuiviewsutils) ","xuiviewsutils",32,_ba,xuiviewsutils.mostCurrent,78);
if (RapidSub.canDelegate("createlabel")) { return b4a.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","createlabel", _ba);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
;
 BA.debugLineNum = 78;BA.debugLine="Public Sub CreateLabel As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 80;BA.debugLine="lbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 81;BA.debugLine="Return lbl";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xuiviewsutils) ","xuiviewsutils",32,_ba,xuiviewsutils.mostCurrent,10);
if (RapidSub.canDelegate("initialize")) { return b4a.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","initialize", _ba);}
;
 BA.debugLineNum = 10;BA.debugLine="Private Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="If UtilsInitialized Then Return";
Debug.JustUpdateDeviceLine();
if (xuiviewsutils._utilsinitialized.<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 12;BA.debugLine="UtilsInitialized = True";
Debug.JustUpdateDeviceLine();
xuiviewsutils._utilsinitialized = xuiviewsutils.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _performhapticfeedback(RemoteObject _ba,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("PerformHapticFeedback (xuiviewsutils) ","xuiviewsutils",32,_ba,xuiviewsutils.mostCurrent,21);
if (RapidSub.canDelegate("performhapticfeedback")) { return b4a.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","performhapticfeedback", _ba, _view);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("View", _view);
 BA.debugLineNum = 21;BA.debugLine="Public Sub PerformHapticFeedback (View As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="Initialize";
Debug.JustUpdateDeviceLine();
_initialize(_ba);
 BA.debugLineNum = 24;BA.debugLine="Dim jo As JavaObject = View";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 25;BA.debugLine="jo.RunMethod(\"performHapticFeedback\", Array(1))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("performHapticFeedback")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((1))})));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private UtilsInitialized As Boolean";
xuiviewsutils._utilsinitialized = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI";
xuiviewsutils._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setalpha(RemoteObject _ba,RemoteObject _view,RemoteObject _level) throws Exception{
try {
		Debug.PushSubsStack("SetAlpha (xuiviewsutils) ","xuiviewsutils",32,_ba,xuiviewsutils.mostCurrent,95);
if (RapidSub.canDelegate("setalpha")) { return b4a.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","setalpha", _ba, _view, _level);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _alpha = RemoteObject.createImmutable(0f);
;
Debug.locals.put("View", _view);
Debug.locals.put("Level", _level);
 BA.debugLineNum = 95;BA.debugLine="Public Sub SetAlpha (View As B4XView, Level As Flo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="Dim jo As JavaObject = View";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 98;BA.debugLine="Dim alpha As Float = Level";
Debug.JustUpdateDeviceLine();
_alpha = _level;Debug.locals.put("alpha", _alpha);Debug.locals.put("alpha", _alpha);
 BA.debugLineNum = 99;BA.debugLine="jo.RunMethod(\"setAlpha\", Array(alpha))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAlpha")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_alpha)})));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbitmapandfill(RemoteObject _ba,RemoteObject _imageview,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("SetBitmapAndFill (xuiviewsutils) ","xuiviewsutils",32,_ba,xuiviewsutils.mostCurrent,65);
if (RapidSub.canDelegate("setbitmapandfill")) { return b4a.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","setbitmapandfill", _ba, _imageview, _bmp);}
RemoteObject _iiv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
;
Debug.locals.put("ImageView", _imageview);
Debug.locals.put("Bmp", _bmp);
 BA.debugLineNum = 65;BA.debugLine="Public Sub SetBitmapAndFill (ImageView As B4XView,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="ImageView.SetBitmap(Bmp)";
Debug.JustUpdateDeviceLine();
_imageview.runVoidMethod ("SetBitmap",(Object)((_bmp.getObject())));
 BA.debugLineNum = 67;BA.debugLine="Dim iiv As ImageView = ImageView";
Debug.JustUpdateDeviceLine();
_iiv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iiv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imageview.getObject());Debug.locals.put("iiv", _iiv);Debug.locals.put("iiv", _iiv);
 BA.debugLineNum = 69;BA.debugLine="iiv.Gravity = Gravity.FILL";
Debug.JustUpdateDeviceLine();
_iiv.runMethod(true,"setGravity",xuiviewsutils.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextorcsbuildertolabel(RemoteObject _ba,RemoteObject _xlbl,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetTextOrCSBuilderToLabel (xuiviewsutils) ","xuiviewsutils",32,_ba,xuiviewsutils.mostCurrent,50);
if (RapidSub.canDelegate("settextorcsbuildertolabel")) { return b4a.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","settextorcsbuildertolabel", _ba, _xlbl, _text);}
;
Debug.locals.put("xlbl", _xlbl);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 50;BA.debugLine="Public Sub SetTextOrCSBuilderToLabel(xlbl As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="xlbl.Text = Text";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
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
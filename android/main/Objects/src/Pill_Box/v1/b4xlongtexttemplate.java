package Pill_Box.v1;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xlongtexttemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "Pill_Box.v1.b4xlongtexttemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", Pill_Box.v1.b4xlongtexttemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4a.example3.customlistview _customlistview1 = null;
public Object _text = null;
public b4a.example.dateutils _dateutils = null;
public Pill_Box.v1.main _main = null;
public Pill_Box.v1.pill_1 _pill_1 = null;
public Pill_Box.v1.pill_2 _pill_2 = null;
public Pill_Box.v1.pill_3 _pill_3 = null;
public Pill_Box.v1.pill_4 _pill_4 = null;
public Pill_Box.v1.starter _starter = null;
public Pill_Box.v1.naseri_func _naseri_func = null;
public Pill_Box.v1.imgview _imgview = null;
public Pill_Box.v1.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(Pill_Box.v1.b4xlongtexttemplate __ref,Pill_Box.v1.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="End Sub";
return null;
}
public String  _show(Pill_Box.v1.b4xlongtexttemplate __ref,Pill_Box.v1.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="CustomListView1.AddTextItem(Text, \"\")";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._addtextitem(__ref._text /*Object*/ ,(Object)(""));
RDebugUtils.currentLine=18677763;
 //BA.debugLineNum = 18677763;BA.debugLine="CustomListView1.GetPanel(0).GetView(0).SetTextAli";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel((int) (0)).GetView((int) (0)).SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
_xuiviewsutils._addstubtoclvifneeded /*String*/ (ba,__ref._customlistview1 /*b4a.example3.customlistview*/ ,__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor);
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(Pill_Box.v1.b4xlongtexttemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Pill_Box.v1.b4xlongtexttemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=18415619;
 //BA.debugLineNum = 18415619;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="Public Text As Object";
_text = new Object();
RDebugUtils.currentLine=18415621;
 //BA.debugLineNum = 18415621;BA.debugLine="End Sub";
return "";
}
public String  _initialize(Pill_Box.v1.b4xlongtexttemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="mBase.LoadLayout(\"LongTextTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("LongTextTemplate",ba);
RDebugUtils.currentLine=18481156;
 //BA.debugLineNum = 18481156;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=18481158;
 //BA.debugLineNum = 18481158;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=18481159;
 //BA.debugLineNum = 18481159;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=18481160;
 //BA.debugLineNum = 18481160;BA.debugLine="CustomListView1.sv.Color = 0xFF464646";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.setColor(((int)0xff464646));
RDebugUtils.currentLine=18481165;
 //BA.debugLineNum = 18481165;BA.debugLine="End Sub";
return "";
}
public String  _resize(Pill_Box.v1.b4xlongtexttemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="CustomListView1.AsView.SetLayoutAnimated(0, 0, 0,";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=18546692;
 //BA.debugLineNum = 18546692;BA.debugLine="End Sub";
return "";
}
}
package Pill_Box.v1;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xloadingindicator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "Pill_Box.v1.b4xloadingindicator");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", Pill_Box.v1.b4xloadingindicator.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _clr = 0;
public int _index = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public int _duration = 0;
public String _drawingsubname = "";
public Object _tag = null;
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
public String  _base_resize(Pill_Box.v1.b4xloadingindicator __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="MainLoop";
__ref._mainloop /*void*/ (null);
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="End Sub";
return "";
}
public void  _mainloop(Pill_Box.v1.b4xloadingindicator __ref) throws Exception{
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "mainloop", true))
	 {Debug.delegate(ba, "mainloop", null); return;}
ResumableSub_MainLoop rsub = new ResumableSub_MainLoop(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_MainLoop extends BA.ResumableSub {
public ResumableSub_MainLoop(Pill_Box.v1.b4xloadingindicator parent,Pill_Box.v1.b4xloadingindicator __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
Pill_Box.v1.b4xloadingindicator __ref;
Pill_Box.v1.b4xloadingindicator parent;
int _myindex = 0;
long _n = 0L;
float _progress = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xloadingindicator";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="index = index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="Dim MyIndex As Int = index";
_myindex = __ref._index /*int*/ ;
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="Do While MyIndex = index";
if (true) break;

case 1:
//do while
this.state = 4;
while (_myindex==__ref._index /*int*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="Dim progress As Float = (DateTime.Now - n) / dur";
_progress = (float) ((parent.__c.DateTime.getNow()-_n)/(double)__ref._duration /*int*/ );
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="progress = progress - Floor(progress)";
_progress = (float) (_progress-parent.__c.Floor(_progress));
RDebugUtils.currentLine=17694727;
 //BA.debugLineNum = 17694727;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=17694728;
 //BA.debugLineNum = 17694728;BA.debugLine="CallSub2(Me, DrawingSubName, progress)";
parent.__c.CallSubDebug2(ba,parent,__ref._drawingsubname /*String*/ ,(Object)(_progress));
RDebugUtils.currentLine=17694729;
 //BA.debugLineNum = 17694729;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=17694730;
 //BA.debugLineNum = 17694730;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xloadingindicator", "mainloop"),(int) (10));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17694732;
 //BA.debugLineNum = 17694732;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(Pill_Box.v1.b4xloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=17432581;
 //BA.debugLineNum = 17432581;BA.debugLine="Private clr As Int";
_clr = 0;
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="Private index As Int";
_index = 0;
RDebugUtils.currentLine=17432583;
 //BA.debugLineNum = 17432583;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=17432584;
 //BA.debugLineNum = 17432584;BA.debugLine="Private duration As Int";
_duration = 0;
RDebugUtils.currentLine=17432585;
 //BA.debugLineNum = 17432585;BA.debugLine="Private DrawingSubName As String";
_drawingsubname = "";
RDebugUtils.currentLine=17432586;
 //BA.debugLineNum = 17432586;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=17432587;
 //BA.debugLineNum = 17432587;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Pill_Box.v1.b4xloadingindicator __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _style = "";
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="clr = xui.PaintOrColorToColor(Props.Get(\"Color\"";
__ref._clr /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color")));
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="Dim style As String= Props.Get(\"IndicatorStyle\")";
_style = BA.ObjectToString(_props.Get((Object)("IndicatorStyle")));
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="Dim duration As Int = Props.Get(\"Duration\")";
_duration = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="DrawingSubName = \"Draw_\" & style.Replace(\" \", \"\")";
__ref._drawingsubname /*String*/  = "Draw_"+_style.replace(" ","");
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="MainLoop";
__ref._mainloop /*void*/ (null);
RDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="End Sub";
return "";
}
public String  _draw_arc1(Pill_Box.v1.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_arc1", true))
	 {return ((String) Debug.delegate(ba, "draw_arc1", new Object[] {_progress}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
float _r = 0f;
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Private Sub Draw_Arc1 (Progress As Float)";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
_r = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="If Progress < 0.5 Then";
if (_progress<0.5) { 
RDebugUtils.currentLine=18219012;
 //BA.debugLineNum = 18219012;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (_progress*2*360));
 }else {
RDebugUtils.currentLine=18219014;
 //BA.debugLineNum = 18219014;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (-(1-_progress)*2*360));
 };
RDebugUtils.currentLine=18219016;
 //BA.debugLineNum = 18219016;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=18219017;
 //BA.debugLineNum = 18219017;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._clr /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=18219018;
 //BA.debugLineNum = 18219018;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
RDebugUtils.currentLine=18219019;
 //BA.debugLineNum = 18219019;BA.debugLine="End Sub";
return "";
}
public String  _draw_arc2(Pill_Box.v1.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_arc2", true))
	 {return ((String) Debug.delegate(ba, "draw_arc2", new Object[] {_progress}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
float _r = 0f;
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Private Sub Draw_Arc2 (Progress As Float)";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
_r = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="If Progress < 0.5 Then";
if (_progress<0.5) { 
RDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (_progress*2*360));
 }else {
RDebugUtils.currentLine=18284550;
 //BA.debugLineNum = 18284550;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (360-(_progress-0.5)*2*360));
 };
RDebugUtils.currentLine=18284552;
 //BA.debugLineNum = 18284552;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=18284553;
 //BA.debugLineNum = 18284553;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._clr /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=18284554;
 //BA.debugLineNum = 18284554;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
RDebugUtils.currentLine=18284555;
 //BA.debugLineNum = 18284555;BA.debugLine="End Sub";
return "";
}
public String  _draw_fivelines1(Pill_Box.v1.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_fivelines1", true))
	 {return ((String) Debug.delegate(ba, "draw_fivelines1", new Object[] {_progress}));}
int _minr = 0;
int _maxr = 0;
int _dx = 0;
int _i = 0;
float _r = 0f;
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Private Sub Draw_FiveLines1(Progress As Float)";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="Dim MinR As Int = 10dip";
_minr = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Height / 2";
_maxr = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()/(double)2);
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="Dim dx As Int = (cvs.TargetRect.Width - 2dip) / 5";
_dx = (int) ((__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()-__c.DipToCurrent((int) (2)))/(double)5);
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="For i = 0 To 4";
{
final int step4 = 1;
final int limit4 = (int) (4);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
_r = (float) (_minr+_maxr/(double)2+_maxr/(double)2*__c.SinD(_progress*360-30*_i));
RDebugUtils.currentLine=18153478;
 //BA.debugLineNum = 18153478;BA.debugLine="cvs.DrawLine(2dip + i * dx, cvs.TargetRect.Cente";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__c.DipToCurrent((int) (2))+_i*_dx),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-_r),(float) (__c.DipToCurrent((int) (2))+_i*_dx),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r),__ref._clr /*int*/ ,(float) (__c.DipToCurrent((int) (4))));
 }
};
RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="End Sub";
return "";
}
public String  _draw_pacman(Pill_Box.v1.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_pacman", true))
	 {return ((String) Debug.delegate(ba, "draw_pacman", new Object[] {_progress}));}
int _dotr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _cx = 0;
int _cy = 0;
int _r = 0;
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub Draw_PacMan(Progress As Float)";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="Dim DotR As Int = 5dip";
_dotr = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.Width - DotR - Prog";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()-_dotr-_progress*(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (10)))),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (_dotr),__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (255-200*_progress)),__c.True,(float) (0));
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="Dim angle As Int = 70 * SinD(Progress * 180)";
_angle = (int) (70*__c.SinD(_progress*180));
RDebugUtils.currentLine=18350085;
 //BA.debugLineNum = 18350085;BA.debugLine="Dim cx As Int = cvs.TargetRect.CenterX - 5dip";
_cx = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="Dim cy As Int = cvs.TargetRect.CenterY";
_cy = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY());
RDebugUtils.currentLine=18350087;
 //BA.debugLineNum = 18350087;BA.debugLine="Dim r As Int = cvs.TargetRect.CenterY - 5dip";
_r = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=18350088;
 //BA.debugLineNum = 18350088;BA.debugLine="If angle = 0 Then";
if (_angle==0) { 
RDebugUtils.currentLine=18350089;
 //BA.debugLineNum = 18350089;BA.debugLine="cvs.DrawCircle(cx, cy, r, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_cx),(float) (_cy),(float) (_r),__ref._clr /*int*/ ,__c.True,(float) (0));
 }else {
RDebugUtils.currentLine=18350091;
 //BA.debugLineNum = 18350091;BA.debugLine="p.InitializeArc(cx, cy , r, -angle / 2, -(360-an";
_p.InitializeArc((float) (_cx),(float) (_cy),(float) (_r),(float) (-_angle/(double)2),(float) (-(360-_angle)));
RDebugUtils.currentLine=18350092;
 //BA.debugLineNum = 18350092;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=18350093;
 //BA.debugLineNum = 18350093;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._clr /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=18350094;
 //BA.debugLineNum = 18350094;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
 };
RDebugUtils.currentLine=18350097;
 //BA.debugLineNum = 18350097;BA.debugLine="End Sub";
return "";
}
public int  _setalpha(Pill_Box.v1.b4xloadingindicator __ref,int _c,int _alpha) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "setalpha", true))
	 {return ((Integer) Debug.delegate(ba, "setalpha", new Object[] {_c,_alpha}));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Private Sub SetAlpha (c As Int, alpha As Int) As I";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Return Bit.And(0xffffff, c) + Bit.ShiftLeft(alpha";
if (true) return (int) (__c.Bit.And(((int)0xffffff),_c)+__c.Bit.ShiftLeft(_alpha,(int) (24)));
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="End Sub";
return 0;
}
public String  _draw_singlecircle(Pill_Box.v1.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_singlecircle", true))
	 {return ((String) Debug.delegate(ba, "draw_singlecircle", new Object[] {_progress}));}
int _i = 0;
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub Draw_SingleCircle(Progress As Float)";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="For i = 0 To 2";
{
final int step1 = 1;
final int limit1 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Targe";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()*_progress),__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (255-255*_progress)),__c.True,(float) (0));
 }
};
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="End Sub";
return "";
}
public String  _draw_threecircles1(Pill_Box.v1.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_threecircles1", true))
	 {return ((String) Debug.delegate(ba, "draw_threecircles1", new Object[] {_progress}));}
float _maxr = 0f;
float _r = 0f;
int _i = 0;
int _alpha = 0;
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Private Sub Draw_ThreeCircles1 (Progress As Float)";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="Dim MaxR As Float = (cvs.TargetRect.Width / 2 - 2";
_maxr = (float) ((__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)2-__c.DipToCurrent((int) (20)))/(double)2);
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="Dim r As Float = 10dip + MaxR + MaxR * Sin(Progre";
_r = (float) (__c.DipToCurrent((int) (10))+_maxr+_maxr*__c.Sin(_progress*2*__c.cPI));
RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="For i = 0 To 2";
{
final int step3 = 1;
final int limit3 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="Dim alpha As Int = i * 120 + Progress * 360";
_alpha = (int) (_i*120+_progress*360);
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * SinD";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__c.DipToCurrent((int) (7))),__ref._clr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }
};
RDebugUtils.currentLine=17891336;
 //BA.debugLineNum = 17891336;BA.debugLine="End Sub";
return "";
}
public String  _draw_threecircles2(Pill_Box.v1.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_threecircles2", true))
	 {return ((String) Debug.delegate(ba, "draw_threecircles2", new Object[] {_progress}));}
int _minr = 0;
int _maxr = 0;
int _i = 0;
float _r = 0f;
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Private Sub Draw_ThreeCircles2 (Progress As Float)";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Dim MinR As Int = 5dip";
_minr = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Width / 2 / 3 -";
_maxr = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)2/(double)3-_minr-__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="For i = 0 To 2";
{
final int step3 = 1;
final int limit3 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
_r = (float) (_minr+_maxr/(double)2+_maxr/(double)2*__c.SinD(_progress*360-60*_i));
RDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="cvs.DrawCircle(MaxR + MinR + (MinR + MaxR + 2dip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_maxr+_minr+(_minr+_maxr+__c.DipToCurrent((int) (2)))*2*_i),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,__ref._clr /*int*/ ,__c.True,(float) (0));
 }
};
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="End Sub";
return "";
}
public String  _hide(Pill_Box.v1.b4xloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="mBase.Visible = False";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="index = index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="End Sub";
return "";
}
public String  _initialize(Pill_Box.v1.b4xloadingindicator __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=17498115;
 //BA.debugLineNum = 17498115;BA.debugLine="End Sub";
return "";
}
public String  _show(Pill_Box.v1.b4xloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="mBase.Visible = True";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="MainLoop";
__ref._mainloop /*void*/ (null);
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="End Sub";
return "";
}
}

package Pill_Box.v1;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class anotherprogressbar {
    public static RemoteObject myClass;
	public anotherprogressbar() {
	}
    public static PCBA staticBA = new PCBA(null, anotherprogressbar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _busybrush = RemoteObject.declareNull("b4a.example.bcpath._bcbrush");
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _busyindex = RemoteObject.createImmutable(0);
public static RemoteObject _bc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _miv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _transparentbrush = RemoteObject.declareNull("b4a.example.bcpath._bcbrush");
public static RemoteObject _vertical = RemoteObject.createImmutable(false);
public static RemoteObject _currentvalue = RemoteObject.createImmutable(0f);
public static RemoteObject _emptycolor = RemoteObject.createImmutable(0);
public static RemoteObject _emptybrush = RemoteObject.declareNull("b4a.example.bcpath._bcbrush");
public static RemoteObject _mvalue = RemoteObject.createImmutable(0);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _valuechangepersecond = RemoteObject.createImmutable(0f);
public static RemoteObject _cornerradius = RemoteObject.createImmutable(0);
public static RemoteObject _brushoffsetdelta = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static Pill_Box.v1.main _main = null;
public static Pill_Box.v1.pill_1 _pill_1 = null;
public static Pill_Box.v1.pill_2 _pill_2 = null;
public static Pill_Box.v1.pill_3 _pill_3 = null;
public static Pill_Box.v1.pill_4 _pill_4 = null;
public static Pill_Box.v1.starter _starter = null;
public static Pill_Box.v1.naseri_func _naseri_func = null;
public static Pill_Box.v1.imgview _imgview = null;
public static Pill_Box.v1.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BackgroundColor",_ref.getField(false, "_backgroundcolor"),"bc",_ref.getField(false, "_bc"),"BrushOffsetDelta",_ref.getField(false, "_brushoffsetdelta"),"BusyBrush",_ref.getField(false, "_busybrush"),"BusyIndex",_ref.getField(false, "_busyindex"),"CornerRadius",_ref.getField(false, "_cornerradius"),"CurrentValue",_ref.getField(false, "_currentvalue"),"DateUtils",_ref.getField(false, "_dateutils"),"EmptyBrush",_ref.getField(false, "_emptybrush"),"EmptyColor",_ref.getField(false, "_emptycolor"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mIV",_ref.getField(false, "_miv"),"mValue",_ref.getField(false, "_mvalue"),"Tag",_ref.getField(false, "_tag"),"TransparentBrush",_ref.getField(false, "_transparentbrush"),"ValueChangePerSecond",_ref.getField(false, "_valuechangepersecond"),"Vertical",_ref.getField(false, "_vertical"),"xui",_ref.getField(false, "_xui")};
}
}
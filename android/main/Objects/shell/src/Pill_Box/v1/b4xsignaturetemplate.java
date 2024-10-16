
package Pill_Box.v1;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xsignaturetemplate {
    public static RemoteObject myClass;
	public b4xsignaturetemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xsignaturetemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _lastx = RemoteObject.createImmutable(0f);
public static RemoteObject _lasty = RemoteObject.createImmutable(0f);
public static RemoteObject _strokewidth = RemoteObject.createImmutable(0f);
public static RemoteObject _strokecolor = RemoteObject.createImmutable(0);
public static RemoteObject _textcolor = RemoteObject.createImmutable(0);
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _adddateandtime = RemoteObject.createImmutable(false);
public static RemoteObject _textfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _numberofpoints = RemoteObject.createImmutable(0);
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
		return new Object[] {"AddDateAndTime",_ref.getField(false, "_adddateandtime"),"BackgroundColor",_ref.getField(false, "_backgroundcolor"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"LastX",_ref.getField(false, "_lastx"),"LastY",_ref.getField(false, "_lasty"),"mBase",_ref.getField(false, "_mbase"),"NumberOfPoints",_ref.getField(false, "_numberofpoints"),"StrokeColor",_ref.getField(false, "_strokecolor"),"StrokeWidth",_ref.getField(false, "_strokewidth"),"TextColor",_ref.getField(false, "_textcolor"),"TextFont",_ref.getField(false, "_textfont"),"xui",_ref.getField(false, "_xui")};
}
}
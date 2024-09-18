
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xinputtemplate {
    public static RemoteObject myClass;
	public b4xinputtemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xinputtemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _text = RemoteObject.createImmutable("");
public static RemoteObject _xdialog = RemoteObject.declareNull("b4a.example.b4xdialog");
public static RemoteObject _regexpattern = RemoteObject.createImmutable("");
public static RemoteObject _textfield1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbltitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _mallowdecimals = RemoteObject.createImmutable(false);
public static RemoteObject _bordercolor = RemoteObject.createImmutable(0);
public static RemoteObject _bordercolorinvalid = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.naseri_func _naseri_func = null;
public static b4a.example.pill_1 _pill_1 = null;
public static b4a.example.pill_2 _pill_2 = null;
public static b4a.example.pill_3 _pill_3 = null;
public static b4a.example.pill_4 _pill_4 = null;
public static b4a.example.starter _starter = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BorderColor",_ref.getField(false, "_bordercolor"),"BorderColorInvalid",_ref.getField(false, "_bordercolorinvalid"),"DateUtils",_ref.getField(false, "_dateutils"),"IME",_ref.getField(false, "_ime"),"lblTitle",_ref.getField(false, "_lbltitle"),"mAllowDecimals",_ref.getField(false, "_mallowdecimals"),"mBase",_ref.getField(false, "_mbase"),"RegexPattern",_ref.getField(false, "_regexpattern"),"Text",_ref.getField(false, "_text"),"TextField1",_ref.getField(false, "_textfield1"),"xDialog",_ref.getField(false, "_xdialog"),"xui",_ref.getField(false, "_xui")};
}
}
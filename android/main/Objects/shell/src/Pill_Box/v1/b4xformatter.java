
package Pill_Box.v1;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xformatter {
    public static RemoteObject myClass;
	public b4xformatter() {
	}
    public static PCBA staticBA = new PCBA(null, b4xformatter.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _formats = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _max_value = RemoteObject.createImmutable(0);
public static RemoteObject _min_value = RemoteObject.createImmutable(0);
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
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
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"formats",_ref.getField(false, "_formats"),"MAX_VALUE",_ref.getField(false, "_max_value"),"MIN_VALUE",_ref.getField(false, "_min_value"),"xui",_ref.getField(false, "_xui")};
}
}
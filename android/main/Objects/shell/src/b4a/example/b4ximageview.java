
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4ximageview {
    public static RemoteObject myClass;
	public b4ximageview() {
	}
    public static PCBA staticBA = new PCBA(null, b4ximageview.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mresizemode = RemoteObject.createImmutable("");
public static RemoteObject _mround = RemoteObject.createImmutable(false);
public static RemoteObject _mbitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _mbackgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _mcornersradius = RemoteObject.createImmutable(0);
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
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"iv",_ref.getField(false, "_iv"),"mBackgroundColor",_ref.getField(false, "_mbackgroundcolor"),"mBase",_ref.getField(false, "_mbase"),"mBitmap",_ref.getField(false, "_mbitmap"),"mCallBack",_ref.getField(false, "_mcallback"),"mCornersRadius",_ref.getField(false, "_mcornersradius"),"mEventName",_ref.getField(false, "_meventname"),"mResizeMode",_ref.getField(false, "_mresizemode"),"mRound",_ref.getField(false, "_mround"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}

package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class swiftbutton {
    public static RemoteObject myClass;
	public swiftbutton() {
	}
    public static PCBA staticBA = new PCBA(null, swiftbutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _clr1 = RemoteObject.createImmutable(0);
public static RemoteObject _clr2 = RemoteObject.createImmutable(0);
public static RemoteObject _disabledcolor = RemoteObject.createImmutable(0);
public static RemoteObject _pressed = RemoteObject.createImmutable(false);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _mdisabled = RemoteObject.createImmutable(false);
public static RemoteObject _cornersradius = RemoteObject.createImmutable(0);
public static RemoteObject _sideheight = RemoteObject.createImmutable(0);
public static RemoteObject _mhaptic = RemoteObject.createImmutable(false);
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
		return new Object[] {"clr1",_ref.getField(false, "_clr1"),"clr2",_ref.getField(false, "_clr2"),"CornersRadius",_ref.getField(false, "_cornersradius"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"disabledColor",_ref.getField(false, "_disabledcolor"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mDisabled",_ref.getField(false, "_mdisabled"),"mEventName",_ref.getField(false, "_meventname"),"mHaptic",_ref.getField(false, "_mhaptic"),"pressed",_ref.getField(false, "_pressed"),"SideHeight",_ref.getField(false, "_sideheight"),"Tag",_ref.getField(false, "_tag"),"xLBL",_ref.getField(false, "_xlbl"),"xui",_ref.getField(false, "_xui")};
}
}
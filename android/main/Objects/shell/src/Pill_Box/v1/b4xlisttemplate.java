
package Pill_Box.v1;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xlisttemplate {
    public static RemoteObject myClass;
	public b4xlisttemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xlisttemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _selecteditem = RemoteObject.createImmutable("");
public static RemoteObject _xdialog = RemoteObject.declareNull("Pill_Box.v1.b4xdialog");
public static RemoteObject _allowmultiselection = RemoteObject.createImmutable(false);
public static RemoteObject _selectioncolor = RemoteObject.createImmutable(0);
public static RemoteObject _selecteditems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _multiselectionminimum = RemoteObject.createImmutable(0);
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
		return new Object[] {"AllowMultiSelection",_ref.getField(false, "_allowmultiselection"),"CustomListView1",_ref.getField(false, "_customlistview1"),"DateUtils",_ref.getField(false, "_dateutils"),"mBase",_ref.getField(false, "_mbase"),"MultiSelectionMinimum",_ref.getField(false, "_multiselectionminimum"),"Options",_ref.getField(false, "_options"),"SelectedItem",_ref.getField(false, "_selecteditem"),"SelectedItems",_ref.getField(false, "_selecteditems"),"SelectionColor",_ref.getField(false, "_selectioncolor"),"xDialog",_ref.getField(false, "_xdialog"),"xui",_ref.getField(false, "_xui")};
}
}
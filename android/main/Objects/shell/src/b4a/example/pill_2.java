
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class pill_2 implements IRemote{
	public static pill_2 mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public pill_2() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("pill_2"), "b4a.example.pill_2");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, pill_2.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edittext1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittext2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittext3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _autocompleteedittext1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
public static RemoteObject _etext1 = RemoteObject.createImmutable("");
public static RemoteObject _etext2 = RemoteObject.createImmutable("");
public static RemoteObject _etext3 = RemoteObject.createImmutable("");
public static RemoteObject _etext4 = RemoteObject.createImmutable("");
public static RemoteObject _etext1_flag1 = RemoteObject.createImmutable(false);
public static RemoteObject _etext2_flag2 = RemoteObject.createImmutable(false);
public static RemoteObject _etext3_flag3 = RemoteObject.createImmutable(false);
public static RemoteObject _etext4_flag4 = RemoteObject.createImmutable(false);
public static RemoteObject _togelebutton_flge = RemoteObject.createImmutable(false);
public static RemoteObject _data_count = RemoteObject.createImmutable("");
public static RemoteObject _data_starttime = RemoteObject.createImmutable("");
public static RemoteObject _data_interval = RemoteObject.createImmutable("");
public static RemoteObject _togglebutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.naseri_func _naseri_func = null;
public static b4a.example.pill_1 _pill_1 = null;
public static b4a.example.pill_3 _pill_3 = null;
public static b4a.example.pill_4 _pill_4 = null;
public static b4a.example.starter _starter = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",pill_2.mostCurrent._activity,"AutoCompleteEditText1",pill_2.mostCurrent._autocompleteedittext1,"Button1",pill_2.mostCurrent._button1,"data_count",pill_2.mostCurrent._data_count,"data_interval",pill_2.mostCurrent._data_interval,"data_starttime",pill_2.mostCurrent._data_starttime,"DateUtils",pill_2.mostCurrent._dateutils,"EditText1",pill_2.mostCurrent._edittext1,"EditText2",pill_2.mostCurrent._edittext2,"EditText3",pill_2.mostCurrent._edittext3,"etext1",pill_2.mostCurrent._etext1,"etext1_flag1",pill_2._etext1_flag1,"etext2",pill_2.mostCurrent._etext2,"etext2_flag2",pill_2._etext2_flag2,"etext3",pill_2.mostCurrent._etext3,"etext3_flag3",pill_2._etext3_flag3,"etext4",pill_2.mostCurrent._etext4,"etext4_flag4",pill_2._etext4_flag4,"Label1",pill_2.mostCurrent._label1,"Label2",pill_2.mostCurrent._label2,"Label3",pill_2.mostCurrent._label3,"Label4",pill_2.mostCurrent._label4,"Main",Debug.moduleToString(b4a.example.main.class),"naseri_func",Debug.moduleToString(b4a.example.naseri_func.class),"pill_1",Debug.moduleToString(b4a.example.pill_1.class),"pill_3",Debug.moduleToString(b4a.example.pill_3.class),"pill_4",Debug.moduleToString(b4a.example.pill_4.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"togeleButton_flge",pill_2._togelebutton_flge,"ToggleButton",pill_2.mostCurrent._togglebutton,"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}
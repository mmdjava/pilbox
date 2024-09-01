
package pill.boxV1;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class setconnect implements IRemote{
	public static setconnect mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public setconnect() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("setconnect"), "pill.boxV1.setconnect");
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
		pcBA = new PCBA(this, setconnect.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _astreams = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
public static RemoteObject _input = RemoteObject.createImmutable("");
public static RemoteObject _dataqueue = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _viber = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneVibrate");
public static RemoteObject _count = RemoteObject.createImmutable((byte)0);
public static RemoteObject _socket1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _edittext1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _button_connect = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _back = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static pill.boxV1.main _main = null;
public static pill.boxV1.pill_1 _pill_1 = null;
public static pill.boxV1.pill_2 _pill_2 = null;
public static pill.boxV1.pill_3 _pill_3 = null;
public static pill.boxV1.pill_4 _pill_4 = null;
public static pill.boxV1.naseri_func _naseri_func = null;
public static pill.boxV1.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",setconnect.mostCurrent._activity,"astreams",setconnect._astreams,"back",setconnect.mostCurrent._back,"Button_connect",setconnect.mostCurrent._button_connect,"Button1",setconnect.mostCurrent._button1,"count",setconnect._count,"dataQueue",setconnect._dataqueue,"EditText1",setconnect.mostCurrent._edittext1,"input",setconnect._input,"Label1",setconnect.mostCurrent._label1,"Main",Debug.moduleToString(pill.boxV1.main.class),"naseri_func",Debug.moduleToString(pill.boxV1.naseri_func.class),"pill_1",Debug.moduleToString(pill.boxV1.pill_1.class),"pill_2",Debug.moduleToString(pill.boxV1.pill_2.class),"pill_3",Debug.moduleToString(pill.boxV1.pill_3.class),"pill_4",Debug.moduleToString(pill.boxV1.pill_4.class),"socket1",setconnect.mostCurrent._socket1,"Starter",Debug.moduleToString(pill.boxV1.starter.class),"Timer1",setconnect.mostCurrent._timer1,"viber",setconnect.mostCurrent._viber};
}
}
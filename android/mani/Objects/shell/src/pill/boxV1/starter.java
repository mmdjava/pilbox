
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

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "pill.boxV1.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("pill.boxV1.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) mostCurrent.pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static pill.boxV1.main _main = null;
public static pill.boxV1.pill_1 _pill_1 = null;
public static pill.boxV1.pill_2 _pill_2 = null;
public static pill.boxV1.pill_3 _pill_3 = null;
public static pill.boxV1.pill_4 _pill_4 = null;
public static pill.boxV1.setconnect _setconnect = null;
public static pill.boxV1.naseri_func _naseri_func = null;
  public Object[] GetGlobals() {
		return new Object[] {"Main",Debug.moduleToString(pill.boxV1.main.class),"naseri_func",Debug.moduleToString(pill.boxV1.naseri_func.class),"pill_1",Debug.moduleToString(pill.boxV1.pill_1.class),"pill_2",Debug.moduleToString(pill.boxV1.pill_2.class),"pill_3",Debug.moduleToString(pill.boxV1.pill_3.class),"pill_4",Debug.moduleToString(pill.boxV1.pill_4.class),"Service",starter.mostCurrent._service,"setconnect",Debug.moduleToString(pill.boxV1.setconnect.class)};
}
}
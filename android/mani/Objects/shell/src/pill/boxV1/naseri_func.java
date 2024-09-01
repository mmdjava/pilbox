
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

public class naseri_func implements IRemote{
	public static naseri_func mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public naseri_func() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, naseri_func.class);
    static {
		mostCurrent = new naseri_func();
        remoteMe = RemoteObject.declareNull("pill.boxV1.naseri_func");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("naseri_func"), "pill.boxV1.naseri_func");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("pill.boxV1.naseri_func"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static pill.boxV1.main _main = null;
public static pill.boxV1.pill_1 _pill_1 = null;
public static pill.boxV1.pill_2 _pill_2 = null;
public static pill.boxV1.pill_3 _pill_3 = null;
public static pill.boxV1.pill_4 _pill_4 = null;
public static pill.boxV1.setconnect _setconnect = null;
public static pill.boxV1.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Main",Debug.moduleToString(pill.boxV1.main.class),"pill_1",Debug.moduleToString(pill.boxV1.pill_1.class),"pill_2",Debug.moduleToString(pill.boxV1.pill_2.class),"pill_3",Debug.moduleToString(pill.boxV1.pill_3.class),"pill_4",Debug.moduleToString(pill.boxV1.pill_4.class),"setconnect",Debug.moduleToString(pill.boxV1.setconnect.class),"Starter",Debug.moduleToString(pill.boxV1.starter.class)};
}
}

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

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
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
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pill_count_box1 = RemoteObject.createImmutable("");
public static RemoteObject _box1_alarm = RemoteObject.createImmutable("");
public static RemoteObject _pill_count_box2 = RemoteObject.createImmutable("");
public static RemoteObject _box2_alarm = RemoteObject.createImmutable("");
public static RemoteObject _pill_count_box3 = RemoteObject.createImmutable("");
public static RemoteObject _box3_alarm = RemoteObject.createImmutable("");
public static RemoteObject _pill_count_box4 = RemoteObject.createImmutable("");
public static RemoteObject _box4_alarm = RemoteObject.createImmutable("");
public static RemoteObject _listbox1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _listbox2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _listbox3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _listbox4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _imagepill1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imagepill2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imagepill3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imagepill4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static b4a.example.starter _starter = null;
public static b4a.example.pill_1 _pill_1 = null;
public static b4a.example.pill_2 _pill_2 = null;
public static b4a.example.pill_3 _pill_3 = null;
public static b4a.example.pill_4 _pill_4 = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"box1_alarm",main._box1_alarm,"box2_alarm",main._box2_alarm,"box3_alarm",main._box3_alarm,"box4_alarm",main._box4_alarm,"Imagepill1",main.mostCurrent._imagepill1,"Imagepill2",main.mostCurrent._imagepill2,"Imagepill3",main.mostCurrent._imagepill3,"Imagepill4",main.mostCurrent._imagepill4,"Listbox1",main.mostCurrent._listbox1,"Listbox2",main.mostCurrent._listbox2,"Listbox3",main.mostCurrent._listbox3,"Listbox4",main.mostCurrent._listbox4,"pill_1",Debug.moduleToString(b4a.example.pill_1.class),"pill_2",Debug.moduleToString(b4a.example.pill_2.class),"pill_3",Debug.moduleToString(b4a.example.pill_3.class),"pill_4",Debug.moduleToString(b4a.example.pill_4.class),"pill_count_box1",main._pill_count_box1,"pill_count_box2",main._pill_count_box2,"pill_count_box3",main._pill_count_box3,"pill_count_box4",main._pill_count_box4,"Starter",Debug.moduleToString(b4a.example.starter.class)};
}
}
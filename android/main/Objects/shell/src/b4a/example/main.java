
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
public static RemoteObject _pill_naim1 = RemoteObject.createImmutable("");
public static RemoteObject _pill_count_box1 = RemoteObject.createImmutable(0);
public static RemoteObject _start_time_1 = RemoteObject.createImmutable("");
public static RemoteObject _interval_1 = RemoteObject.createImmutable("");
public static RemoteObject _box1_alarm = RemoteObject.createImmutable("");
public static RemoteObject _pill_naim2 = RemoteObject.createImmutable("");
public static RemoteObject _pill_count_box2 = RemoteObject.createImmutable(0);
public static RemoteObject _start_time_2 = RemoteObject.createImmutable("");
public static RemoteObject _interval_2 = RemoteObject.createImmutable("");
public static RemoteObject _box2_alarm = RemoteObject.createImmutable("");
public static RemoteObject _pill_naim3 = RemoteObject.createImmutable("");
public static RemoteObject _pill_count_box3 = RemoteObject.createImmutable(0);
public static RemoteObject _start_time_3 = RemoteObject.createImmutable("");
public static RemoteObject _interval_3 = RemoteObject.createImmutable("");
public static RemoteObject _box3_alarm = RemoteObject.createImmutable("");
public static RemoteObject _pill_naim4 = RemoteObject.createImmutable("");
public static RemoteObject _pill_count_box4 = RemoteObject.createImmutable(0);
public static RemoteObject _start_time_4 = RemoteObject.createImmutable("");
public static RemoteObject _interval_4 = RemoteObject.createImmutable("");
public static RemoteObject _box4_alarm = RemoteObject.createImmutable("");
public static RemoteObject _viber = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneVibrate");
public static RemoteObject _count = RemoteObject.createImmutable((byte)0);
public static RemoteObject _socket1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _astreams = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
public static RemoteObject _input = RemoteObject.createImmutable("");
public static RemoteObject _label17 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label11 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label12 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label13 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label14 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label15 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label16 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label18 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label19 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label21 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label20 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imagepill1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imagepill2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imagepill3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imagepill4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _setconnect1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pattern1 = RemoteObject.createImmutable("");
public static RemoteObject _pattern2 = RemoteObject.createImmutable("");
public static RemoteObject _pattern3 = RemoteObject.createImmutable("");
public static RemoteObject _pattern4 = RemoteObject.createImmutable("");
public static RemoteObject _pattern5 = RemoteObject.createImmutable("");
public static RemoteObject _pattern6 = RemoteObject.createImmutable("");
public static RemoteObject _pattern7 = RemoteObject.createImmutable("");
public static RemoteObject _pattern8 = RemoteObject.createImmutable("");
public static RemoteObject _pattern9 = RemoteObject.createImmutable("");
public static RemoteObject _data1 = RemoteObject.createImmutable(0);
public static RemoteObject _data2 = RemoteObject.createImmutable(0);
public static RemoteObject _data3 = RemoteObject.createImmutable(0);
public static RemoteObject _data4 = RemoteObject.createImmutable(0);
public static RemoteObject _data5 = RemoteObject.createImmutable(0);
public static RemoteObject _data6 = RemoteObject.createImmutable(0);
public static RemoteObject _data7 = RemoteObject.createImmutable(0);
public static RemoteObject _data8 = RemoteObject.createImmutable(0);
public static RemoteObject _data9 = RemoteObject.createImmutable(0);
public static RemoteObject _matcher = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
public static RemoteObject _label_size1 = RemoteObject.createImmutable(0);
public static RemoteObject _label_size2 = RemoteObject.createImmutable(0);
public static RemoteObject _label_size3 = RemoteObject.createImmutable(0);
public static RemoteObject _label_size4 = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.naseri_func _naseri_func = null;
public static b4a.example.pill_1 _pill_1 = null;
public static b4a.example.pill_2 _pill_2 = null;
public static b4a.example.pill_3 _pill_3 = null;
public static b4a.example.pill_4 _pill_4 = null;
public static b4a.example.starter _starter = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"astreams",main._astreams,"box1_alarm",main._box1_alarm,"box2_alarm",main._box2_alarm,"box3_alarm",main._box3_alarm,"box4_alarm",main._box4_alarm,"count",main._count,"data1",main._data1,"data2",main._data2,"data3",main._data3,"data4",main._data4,"data5",main._data5,"data6",main._data6,"data7",main._data7,"data8",main._data8,"data9",main._data9,"DateUtils",main.mostCurrent._dateutils,"Imagepill1",main.mostCurrent._imagepill1,"Imagepill2",main.mostCurrent._imagepill2,"Imagepill3",main.mostCurrent._imagepill3,"Imagepill4",main.mostCurrent._imagepill4,"input",main._input,"interval_1",main._interval_1,"interval_2",main._interval_2,"interval_3",main._interval_3,"interval_4",main._interval_4,"label_size1",main._label_size1,"label_size2",main._label_size2,"label_size3",main._label_size3,"label_size4",main._label_size4,"Label1",main.mostCurrent._label1,"Label10",main.mostCurrent._label10,"Label11",main.mostCurrent._label11,"Label12",main.mostCurrent._label12,"Label13",main.mostCurrent._label13,"Label14",main.mostCurrent._label14,"Label15",main.mostCurrent._label15,"Label16",main.mostCurrent._label16,"Label17",main.mostCurrent._label17,"Label18",main.mostCurrent._label18,"Label19",main.mostCurrent._label19,"Label2",main.mostCurrent._label2,"Label20",main.mostCurrent._label20,"Label21",main.mostCurrent._label21,"Label3",main.mostCurrent._label3,"Label4",main.mostCurrent._label4,"Label5",main.mostCurrent._label5,"Label6",main.mostCurrent._label6,"Label7",main.mostCurrent._label7,"Label8",main.mostCurrent._label8,"Label9",main.mostCurrent._label9,"ListView1",main.mostCurrent._listview1,"Matcher",main.mostCurrent._matcher,"naseri_func",Debug.moduleToString(b4a.example.naseri_func.class),"Panel1",main.mostCurrent._panel1,"Panel2",main.mostCurrent._panel2,"Panel3",main.mostCurrent._panel3,"Panel4",main.mostCurrent._panel4,"Panel5",main.mostCurrent._panel5,"pattern1",main.mostCurrent._pattern1,"pattern2",main.mostCurrent._pattern2,"pattern3",main.mostCurrent._pattern3,"pattern4",main.mostCurrent._pattern4,"pattern5",main.mostCurrent._pattern5,"pattern6",main.mostCurrent._pattern6,"pattern7",main.mostCurrent._pattern7,"pattern8",main.mostCurrent._pattern8,"pattern9",main.mostCurrent._pattern9,"pill_1",Debug.moduleToString(b4a.example.pill_1.class),"pill_2",Debug.moduleToString(b4a.example.pill_2.class),"pill_3",Debug.moduleToString(b4a.example.pill_3.class),"pill_4",Debug.moduleToString(b4a.example.pill_4.class),"pill_count_box1",main._pill_count_box1,"pill_count_box2",main._pill_count_box2,"pill_count_box3",main._pill_count_box3,"pill_count_box4",main._pill_count_box4,"pill_naim1",main._pill_naim1,"pill_naim2",main._pill_naim2,"pill_naim3",main._pill_naim3,"pill_naim4",main._pill_naim4,"setconnect1",main.mostCurrent._setconnect1,"socket1",main._socket1,"start_time_1",main._start_time_1,"start_time_2",main._start_time_2,"start_time_3",main._start_time_3,"start_time_4",main._start_time_4,"Starter",Debug.moduleToString(b4a.example.starter.class),"Timer1",main._timer1,"viber",main._viber,"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}
package pill.boxV1;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class naseri_func {
private static naseri_func mostCurrent = new naseri_func();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public pill.boxV1.main _main = null;
public pill.boxV1.pill_1 _pill_1 = null;
public pill.boxV1.pill_2 _pill_2 = null;
public pill.boxV1.pill_3 _pill_3 = null;
public pill.boxV1.pill_4 _pill_4 = null;
public pill.boxV1.starter _starter = null;
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static byte[]  _string2byte(anywheresoftware.b4a.BA _ba,String _input) throws Exception{
byte[] _bytearray = null;
byte[] _bytearray_tx = null;
byte _bytevalue = (byte)0;
int _i = 0;
 //BA.debugLineNum = 10;BA.debugLine="Sub   string2byte (input As String) As Byte()";
 //BA.debugLineNum = 13;BA.debugLine="Dim byteArray() As Byte";
_bytearray = new byte[(int) (0)];
;
 //BA.debugLineNum = 14;BA.debugLine="Dim byteArray_tx(1) As Byte";
_bytearray_tx = new byte[(int) (1)];
;
 //BA.debugLineNum = 15;BA.debugLine="Dim byteValue As Byte";
_bytevalue = (byte)0;
 //BA.debugLineNum = 17;BA.debugLine="byteArray =input.GetBytes(\"UTF8\")";
_bytearray = _input.getBytes("UTF8");
 //BA.debugLineNum = 18;BA.debugLine="byteValue=0";
_bytevalue = (byte) (0);
 //BA.debugLineNum = 19;BA.debugLine="For i=0 To byteArray.Length-1 Step 1";
{
final int step6 = 1;
final int limit6 = (int) (_bytearray.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 20;BA.debugLine="byteValue=byteValue*10";
_bytevalue = (byte) (_bytevalue*10);
 //BA.debugLineNum = 21;BA.debugLine="byteValue=byteValue+(byteArray(i)-48)";
_bytevalue = (byte) (_bytevalue+(_bytearray[_i]-48));
 //BA.debugLineNum = 23;BA.debugLine="Log(i)";
anywheresoftware.b4a.keywords.Common.LogImpl("73604493",BA.NumberToString(_i),0);
 }
};
 //BA.debugLineNum = 27;BA.debugLine="byteArray_tx(0)=byteValue";
_bytearray_tx[(int) (0)] = _bytevalue;
 //BA.debugLineNum = 28;BA.debugLine="Return byteArray_tx";
if (true) return _bytearray_tx;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
}

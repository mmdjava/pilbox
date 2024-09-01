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
public pill.boxV1.setconnect _setconnect = null;
public pill.boxV1.starter _starter = null;
public static byte[]  _string2byte(anywheresoftware.b4a.BA _ba,String _input) throws Exception{
RDebugUtils.currentModule="naseri_func";
if (Debug.shouldDelegate(null, "string2byte", false))
	 {return ((byte[]) Debug.delegate(null, "string2byte", new Object[] {_ba,_input}));}
byte[] _bytearray = null;
byte[] _bytearray_tx = null;
byte _bytevalue = (byte)0;
int _i = 0;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub   string2byte (input As String) As Byte";
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Dim byteArray() As Byte";
_bytearray = new byte[(int) (0)];
;
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="Dim byteArray_tx(1) As Byte";
_bytearray_tx = new byte[(int) (1)];
;
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="Dim byteValue As Byte";
_bytevalue = (byte)0;
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="byteArray =input.GetBytes(\"UTF8\")";
_bytearray = _input.getBytes("UTF8");
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="byteValue=0";
_bytevalue = (byte) (0);
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="For i=0 To byteArray.Length-1 Step 1";
{
final int step6 = 1;
final int limit6 = (int) (_bytearray.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="byteValue=byteValue*10";
_bytevalue = (byte) (_bytevalue*10);
RDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="byteValue=byteValue+(byteArray(i)-48)";
_bytevalue = (byte) (_bytevalue+(_bytearray[_i]-48));
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="Log(i)";
anywheresoftware.b4a.keywords.Common.LogImpl("34456461",BA.NumberToString(_i),0);
 }
};
RDebugUtils.currentLine=4456465;
 //BA.debugLineNum = 4456465;BA.debugLine="byteArray_tx(0)=byteValue";
_bytearray_tx[(int) (0)] = _bytevalue;
RDebugUtils.currentLine=4456466;
 //BA.debugLineNum = 4456466;BA.debugLine="Return byteArray_tx";
if (true) return _bytearray_tx;
RDebugUtils.currentLine=4456467;
 //BA.debugLineNum = 4456467;BA.debugLine="End Sub";
return null;
}
}
package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class naseri_func {
private static naseri_func mostCurrent = new naseri_func();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.pill_1 _pill_1 = null;
public b4a.example.pill_2 _pill_2 = null;
public b4a.example.pill_3 _pill_3 = null;
public b4a.example.pill_4 _pill_4 = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static byte[]  _string2byte(anywheresoftware.b4a.BA _ba,String _input) throws Exception{
RDebugUtils.currentModule="naseri_func";
if (Debug.shouldDelegate(null, "string2byte", false))
	 {return ((byte[]) Debug.delegate(null, "string2byte", new Object[] {_ba,_input}));}
byte[] _bytearray = null;
byte[] _bytearray_tx = null;
byte _bytevalue = (byte)0;
int _i = 0;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub   string2byte (input As String) As Byte()";
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Dim byteArray() As Byte";
_bytearray = new byte[(int) (0)];
;
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Dim byteArray_tx(1) As Byte";
_bytearray_tx = new byte[(int) (1)];
;
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Dim byteValue As Byte";
_bytevalue = (byte)0;
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="byteArray =input.GetBytes(\"UTF8\")";
_bytearray = _input.getBytes("UTF8");
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="byteValue=0";
_bytevalue = (byte) (0);
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="For i=0 To byteArray.Length-1 Step 1";
{
final int step6 = 1;
final int limit6 = (int) (_bytearray.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="byteValue=byteValue*10";
_bytevalue = (byte) (_bytevalue*10);
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="byteValue=byteValue+(byteArray(i)-48)";
_bytevalue = (byte) (_bytevalue+(_bytearray[_i]-48));
 }
};
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="byteArray_tx(0)=byteValue";
_bytearray_tx[(int) (0)] = _bytevalue;
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="Return byteArray_tx";
if (true) return _bytearray_tx;
RDebugUtils.currentLine=1376275;
 //BA.debugLineNum = 1376275;BA.debugLine="End Sub";
return null;
}
}
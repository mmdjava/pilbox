package Pill_Box.v1;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class naseri_func_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _string2byte(RemoteObject _ba,RemoteObject _input) throws Exception{
try {
		Debug.PushSubsStack("string2byte (naseri_func) ","naseri_func",6,_ba,naseri_func.mostCurrent,10);
if (RapidSub.canDelegate("string2byte")) { return Pill_Box.v1.naseri_func.remoteMe.runUserSub(false, "naseri_func","string2byte", _ba, _input);}
RemoteObject _bytearray = null;
RemoteObject _bytearray_tx = null;
RemoteObject _bytevalue = RemoteObject.createImmutable((byte)0);
int _i = 0;
;
Debug.locals.put("input", _input);
 BA.debugLineNum = 10;BA.debugLine="Sub   string2byte (input As String) As Byte()";
Debug.ShouldStop(512);
 BA.debugLineNum = 13;BA.debugLine="Dim byteArray() As Byte";
Debug.ShouldStop(4096);
_bytearray = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("byteArray", _bytearray);
 BA.debugLineNum = 14;BA.debugLine="Dim byteArray_tx(1) As Byte";
Debug.ShouldStop(8192);
_bytearray_tx = RemoteObject.createNewArray ("byte", new int[] {1}, new Object[]{});Debug.locals.put("byteArray_tx", _bytearray_tx);
 BA.debugLineNum = 15;BA.debugLine="Dim byteValue As Byte";
Debug.ShouldStop(16384);
_bytevalue = RemoteObject.createImmutable((byte)0);Debug.locals.put("byteValue", _bytevalue);
 BA.debugLineNum = 17;BA.debugLine="byteArray =input.GetBytes(\"UTF8\")";
Debug.ShouldStop(65536);
_bytearray = _input.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("byteArray", _bytearray);
 BA.debugLineNum = 18;BA.debugLine="byteValue=0";
Debug.ShouldStop(131072);
_bytevalue = BA.numberCast(byte.class, 0);Debug.locals.put("byteValue", _bytevalue);
 BA.debugLineNum = 19;BA.debugLine="For i=0 To byteArray.Length-1 Step 1";
Debug.ShouldStop(262144);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_bytearray.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 20;BA.debugLine="byteValue=byteValue*10";
Debug.ShouldStop(524288);
_bytevalue = BA.numberCast(byte.class, RemoteObject.solve(new RemoteObject[] {_bytevalue,RemoteObject.createImmutable(10)}, "*",0, 1));Debug.locals.put("byteValue", _bytevalue);
 BA.debugLineNum = 21;BA.debugLine="byteValue=byteValue+(byteArray(i)-48)";
Debug.ShouldStop(1048576);
_bytevalue = BA.numberCast(byte.class, RemoteObject.solve(new RemoteObject[] {_bytevalue,(RemoteObject.solve(new RemoteObject[] {_bytearray.getArrayElement(true,BA.numberCast(int.class, _i)),RemoteObject.createImmutable(48)}, "-",1, 1))}, "+",1, 1));Debug.locals.put("byteValue", _bytevalue);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 27;BA.debugLine="byteArray_tx(0)=byteValue";
Debug.ShouldStop(67108864);
_bytearray_tx.setArrayElement (_bytevalue,BA.numberCast(int.class, 0));
 BA.debugLineNum = 28;BA.debugLine="Return byteArray_tx";
Debug.ShouldStop(134217728);
if (true) return _bytearray_tx;
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
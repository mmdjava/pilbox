B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=12.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub


Sub   string2byte (input As String) As Byte()
	
	'========================================================
	Dim byteArray() As Byte
	Dim byteArray_tx(1) As Byte
	Dim byteValue As Byte
	'=================d1===============================
	byteArray =input.GetBytes("UTF8")
	byteValue=0
	For i=0 To byteArray.Length-1 Step 1
		byteValue=byteValue*10
		byteValue=byteValue+(byteArray(i)-48)
		'==================
		Log(i)
		'===================
			
	Next
	byteArray_tx(0)=byteValue
	Return byteArray_tx
End Sub


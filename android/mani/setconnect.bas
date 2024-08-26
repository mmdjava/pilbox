﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim astreams As AsyncStreams
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	Dim viber As PhoneVibrate
	Dim count As Byte = 1

	Dim socket1 As Socket
	Private Label1 As Label
	Private Button1 As Button
	Private EditText1 As EditText
	Private Button_connect As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("setconnect")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub Button_connect_Click
	ProgressDialogShow2("درحال اتصال...",False)
	socket1.Initialize("socket1")
	socket1.Connect("192.168.4.1",8888,5000)
	
End Sub

Sub Button1_Click
	
	astreams.Write(EditText1.Text.GetBytes("UTF8"))
End Sub

Private Sub EditText1_TextChanged (Old As String, New As String)
	
	
	
End Sub
'############################################### تابع اتصال ################################
Sub Socket1_Connected(Connected As Boolean)As Boolean

	If Connected = True Then
		ToastMessageShow("ارتباط برقرار شد",True)
		astreams.Initialize(socket1.InputStream, socket1.OutputStream, "AStreams")
		viber.Vibrate(50)
		Button_connect.Enabled =False
		Button_connect.Text = "متصل شد"
		'Label_status.Color = 0xFF16860D
	Else
   	
		ToastMessageShow("مشکلی رخ داده است",True)
		'Label_status.Color = 0xFFE40909
		Button_connect.Text = "اتصال"
		viber.Vibrate(500)
	   
	End If
	ProgressDialogHide
   
End Sub


 
'###############################################تابع خطای################################
Sub AStreams_Error
	Button_connect.Enabled = True
	ToastMessageShow("مشکلی رخ داده است",True)
	'Label_status.Color = 0xFFE40909
	Button_connect.Text = "اتصال"
	viber.Vibrate(1000)
	socket1.Close
End Sub

'###############################################تابع دریافت دیتا################################		
 

Sub AStreams_NewData (Buffer() As Byte)
 
 	
	Dim input As String = BytesToString(Buffer, 0, Buffer.Length, "UTF-8")
	'EditText1.Text = input
	Log(input)
	
	Label1.Text =Label1.Text &   (input)
 

	'Label1.Text = Buffer
	 
End Sub
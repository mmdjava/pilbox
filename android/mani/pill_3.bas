B4A=true
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



End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private Button1 As Button
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private Label4 As Label
	Private EditText1 As EditText
	Private EditText2 As EditText
	Private EditText3 As EditText
	Private AutoCompleteEditText1 As AutoCompleteEditText
	
	Dim etext1 As String
	Dim etext2 As String
	Dim etext3 As String
	Dim etext4 As String
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("pill_3")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Button1_Click
	
	Main.pill_naim3 = etext1
	Main.pill_count_box3 = etext2
	Main.start_time_3 = etext3
	Main.interval_3 = etext4
	File.WriteString(File.DirInternal, "pill_naim3.txt",Main.pill_naim3)
	File.WriteString(File.DirInternal, "pill_count_box3.txt",Main.pill_count_box3)
	File.WriteString(File.DirInternal, "start_time_3.txt",Main.start_time_3)
	File.WriteString(File.DirInternal, "interval_3.txt",Main.interval_3)
	
	
	
	StartActivity("main")
	Activity.Finish
	
End Sub


Private Sub AutoCompleteEditText1_TextChanged (Old As String, New As String)
	
	etext4 = New
	
End Sub

Private Sub EditText3_TextChanged (Old As String, New As String)
	
	etext3 = New
	
End Sub

Private Sub EditText2_TextChanged (Old As String, New As String)
	
	etext2 = New
	
End Sub

Private Sub EditText1_TextChanged (Old As String, New As String)
	
	etext1 = New
	
End Sub
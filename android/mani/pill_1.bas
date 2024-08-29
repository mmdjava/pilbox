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
	
	
	Dim etext1_flag1 As Boolean
	Dim etext2_flag2 As Boolean
	Dim etext3_flag3 As Boolean
	Dim etext4_flag4  As Boolean
	Dim togeleButton_flge  As Boolean
	
	Dim data_count As String
	Dim data_starttime As String
	Dim data_interval As String
	
	etext1_flag1 =False
    etext2_flag2 =False
	etext3_flag3=False
	etext4_flag4 =False
	togeleButton_flge=False
	Private ToggleButton As ToggleButton
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("pill_1")
	
	Try
		Log("try")
		ToggleButton.Checked= File.ReadString(File.DirInternal,"toogle_en.txt")
		Dim newImage As Bitmap

		If ToggleButton.Checked=True Then
			newImage.Initialize(File.DirAssets, "switch-on.png")  ' Load a new image from assets
		Else
		
			newImage.Initialize(File.DirAssets, "switch-off.png")  ' Load a new image from assets
		End If
		ToggleButton.SetBackgroundImage(newImage)
	EditText1.Text = File.ReadString(File.DirInternal, "pill_naim1.txt")
	EditText2.Text = File.ReadString(File.DirInternal, "pill_count_box1.txt")
	EditText3.Text = File.ReadString(File.DirInternal, "start_time_1.txt")
	AutoCompleteEditText1.Text = File.ReadString(File.DirInternal, "interval_1.txt")
	
	Catch
		Log("catch")
		ToggleButton.Checked=False
		Dim newImage As Bitmap
		newImage.Initialize(File.DirAssets, "switch-off.png")  ' Load a new image from assets
		ToggleButton.SetBackgroundImage(newImage)
	End Try


End Sub


Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Button1_Click
	
'	Main.pill_naim1 = etext1
'	Main.pill_count_box1 = etext2
'	Main.start_time_1 = etext3
'	Main.interval_1 = etext4
	File.WriteString(File.DirInternal, "toogle_en.txt",ToggleButton.Checked)
    If(etext1_flag1=True ) Then
	File.WriteString(File.DirInternal, "pill_naim1.txt",etext1)
	End If
	If(etext2_flag2=True ) Then
		

		File.WriteString(File.DirInternal, "pill_count_box1.txt",etext2)
	End If
	If(etext3_flag3=True ) Then
				
	
	
		File.WriteString(File.DirInternal, "start_time_1.txt",etext3)
	End If
	If(etext4_flag4=True ) Then
				
		File.WriteString(File.DirInternal, "interval_1.txt",etext4)
    End If
	If (ToggleButton.Checked And (etext2_flag2 Or etext3_flag3 Or etext3_flag3)) Then
		
		setconnect.astreams.Write("p1s".GetBytes("UTF8"))	
		If ToggleButton.Checked=True Then
			setconnect.astreams.Write(naseri_func.string2byte("1"))
			Else
			setconnect.astreams.Write(naseri_func.string2byte("0"))
		End If
		
		setconnect.astreams.Write(naseri_func.string2byte(etext2))
		setconnect.astreams.Write(naseri_func.string2byte(etext3))
		setconnect.astreams.Write(naseri_func.string2byte(etext4))
		setconnect.astreams.Write("p1e".GetBytes("UTF8"))

	
		Log(ToggleButton.Checked & data_count & data_starttime & data_interval)
	End If
	
	StartActivity("Main")
	Activity.Finish
	
		
End Sub

Private Sub AutoCompleteEditText1_TextChanged (Old As String, New As String)
    
	etext4 = New
	etext4_flag4=True 
	
End Sub

Private Sub EditText3_TextChanged (Old As String, New As String)
	
	

	etext3 = New
	etext3_flag3=True
End Sub

Private Sub EditText2_TextChanged (Old As String, New As String)
	
	
	etext2 = New	
	etext2_flag2=True
End Sub

Private Sub EditText1_TextChanged (Old As String, New As String)
	
	
		etext1 = New
	etext1_flag1=True
End Sub



Private Sub ToggleButton_CheckedChange(Checked As Boolean)

	Dim newImage As Bitmap

	If Checked=True Then
	newImage.Initialize(File.DirAssets, "switch-on.png")  ' Load a new image from assets
	Else 
		
		newImage.Initialize(File.DirAssets, "switch-off.png")  ' Load a new image from assets
	End If
	ToggleButton.SetBackgroundImage(newImage)
End Sub
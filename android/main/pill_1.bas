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
	
	Private ImageView1 As ImageView
	Dim rp As RuntimePermissions
	
	Dim hourSpinner As Spinner
	Dim minuteSpinner As Spinner
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	' Initialize spinners for hours and minutes
	hourSpinner.Initialize("hourSpinner")
	minuteSpinner.Initialize("minuteSpinner")

	' Add values to hour spinner (0 to 23 for 24-hour format)
	For i = 0 To 23
		hourSpinner.Add(i)
	Next

	' Add values to minute spinner (0 to 59)
	For i = 0 To 59
		minuteSpinner.Add(i)
	Next

	' Add spinners to the activity with proper position and size
	Activity.AddView(hourSpinner, 50%x - 75dip, 50%y - 40dip, 100dip, 60dip)
	Activity.AddView(minuteSpinner, 50%x + 25dip, 50%y - 40dip, 100dip, 60dip)

	
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("pill_1")
	
	' بررسی اینکه آیا عکس ذخیره شده وجود دارد یا نه
	If File.Exists(File.DirInternal, "Imagepill1.png") Then
		' اگر عکس موجود باشد، آن را بارگذاری و نمایش می‌دهیم
		ImageView1.Bitmap = LoadBitmap(File.DirInternal, "Imagepill1.png")
	Else
		ToastMessageShow("No image found.", False)
	End If
	
	Try
'		Log("try")
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
'		Log("catch")
'		ToggleButton.Checked=False
'		Dim newImage As Bitmap
'		newImage.Initialize(File.DirAssets, "switch-off.png")  ' Load a new image from assets
'		ToggleButton.SetBackgroundImage(newImage)
	End Try


End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Button1_Click

	File.WriteString(File.DirInternal, "toogle_en.txt",ToggleButton.Checked)'ذخیره داده های فعال یا غیرفعال بودن قرص
	
	If(etext1_flag1=True ) Then'اگر متن etext1 تغییر کرد متن جدید را در حافظه ذخیره کن
	File.WriteString(File.DirInternal, "pill_naim1.txt",etext1)
	End If
	
	If(etext2_flag2=True ) Then'اگر متن etext2 تغییر کرد متن جدید را در حافظه ذخیره کن
		File.WriteString(File.DirInternal, "pill_count_box1.txt",etext2)
	End If
	
	If(etext3_flag3=True ) Then'اگر متن etext3 تغییر کرد متن جدید را در حافظه ذخیره کن
		File.WriteString(File.DirInternal, "start_time_1.txt",etext3)
	End If
	
	If(etext4_flag4=True ) Then'اگر متن etext4 تغییر کرد متن جدید را در حافظه ذخیره کن
		File.WriteString(File.DirInternal, "interval_1.txt",etext4)
    End If
	
	If (ToggleButton.Checked) Then
		
		Main.astreams.Write("p1s".GetBytes("UTF8"))	
		If ToggleButton.Checked=True Then
			Main.astreams.Write(naseri_func.string2byte("1"))
			Else
			Main.astreams.Write(naseri_func.string2byte("0"))
		End If
		
		Main.astreams.Write(naseri_func.string2byte(File.ReadString(File.DirInternal, "pill_count_box1.txt")))
		Main.astreams.Write(naseri_func.string2byte(File.ReadString(File.DirInternal, "start_time_1.txt")))
		Main.astreams.Write(naseri_func.string2byte(File.ReadString(File.DirInternal, "interval_1.txt")))
		Main.astreams.Write("p1e".GetBytes("UTF8"))

	
'		Log(ToggleButton.Checked & data_count & data_starttime & data_interval)
	End If
	
	etext2_flag2=False
	
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

Private Sub ImageView1_LongClick
	
	Dim fc As ContentChooser
	fc.Initialize("fc")
	fc.Show("image/*", "Select Image")
	
End Sub

' مدیریت نتیجه انتخاب تصویر
Sub fc_Result(Success As Boolean, Dir As String, FileName As String)
	If Success Then
		' نمایش عکس انتخاب شده
		Dim bmp As Bitmap
		bmp = LoadBitmap(Dir, FileName)
		ImageView1.Bitmap = bmp
        
		' ذخیره عکس انتخاب شده در حافظه داخلی
		File.Copy(Dir, FileName, File.DirInternal, "Imagepill1.png")
        
		ToastMessageShow("Image saved successfully!", False)
	Else
		ToastMessageShow("Failed to choose an image.", False)
	End If
End Sub

Sub hourSpinner_ItemClick (Position As Int, Value As Object)
    Log("Selected hour: " & Value)
End Sub

Sub minuteSpinner_ItemClick (Position As Int, Value As Object)
    Log("Selected minute: " & Value)
End Sub
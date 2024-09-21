B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'تعریف متغیرها
End Sub

Sub Globals
	'ایجاد متغیر برای ImageView
	Private imgView As ImageView
	Private btnChangeImage As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'بارگذاری Layout
	Activity.LoadLayout("Main")
    
	'تنظیم یک عکس اولیه در ImageView
	imgView.Bitmap = LoadBitmap(File.DirAssets, "default_image.jpg")
    
	'وقتی دکمه برای تغییر عکس کلیک می‌شود
	btnChangeImage.Initialize("btnChangeImage")
End Sub

Sub btnChangeImage_Click
	'باز کردن FileChooser برای انتخاب عکس
	Dim fc As ContentChooser
	fc.Initialize("fc")
	fc.Show("image/*", "Select Image")
End Sub

Sub fc_Result(Success As Boolean, Dir As String, FileName As String)
	If Success Then
		'نمایش عکس انتخاب شده در ImageView
		imgView.Bitmap = LoadBitmap(Dir, FileName)
	Else
		ToastMessageShow("Failed to choose an image.", False)
	End If
End Sub


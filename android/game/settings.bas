﻿B4A=true
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
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("settings")

	Activity.AddMenuItem("صفحه اصلی", "Layout")
	Activity.AddMenuItem("تنظیمات", "settings")
	Activity.AddMenuItem("درباره ما", "about")
	Activity.AddMenuItem("تماس با ما", "call")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


'****************************  صفحه اصلی  ****************************
Sub Layout_clik
	
	StartActivity("Layout")
	Activity.Finish
	
End Sub
'****************************  صفحه تنظیمات  ****************************
Sub settings_clik
	
	StartActivity("settings")
	Activity.Finish
	
End Sub
'****************************  درباره ما  ****************************
Sub about_clik
	
	StartActivity("about")
	Activity.Finish
	
End Sub
'****************************  تماس با ما  ****************************
Sub call_clik
	
	StartActivity("call")
	Activity.Finish
	
End Sub
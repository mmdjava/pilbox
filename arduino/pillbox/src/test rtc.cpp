/*
#include <Wire.h>
#include <RTClib.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SCREEN_WIDTH 128//تعریف طول نمایشگر 
#define SCREEN_HEIGHT 32//تعریف عرض نمایشگر
#define OLED_RESET    -1//تعریف پین ریست نرم افزاری 
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);//کلاس Adafruit_SSD1306 ایجاد می‌کند

RTC_DS3231 rtc;

void setup() {
    Wire.begin(13,14);
  Serial.begin(115200);

  if (!rtc.begin()) {
    Serial.println("Couldn't find RTC");
    while (1);
  }

  // اگر RTC در حال حاضر به درستی تنظیم نشده باشد
  if (rtc.lostPower()) {
    Serial.println("RTC lost power, setting the time!");
    // تنظیم زمان به زمان کامپایل
    rtc.adjust(DateTime(F(__DATE__), F(__TIME__)));

  
  }


  if (!display.begin(SSD1306_SWITCHCAPVCC, 0x3C)) {
    Serial.println(F("SSD1306 allocation failed"));
    for (;;);
  }

  display.clearDisplay();

}
 DateTime now;
void loop() {
  now = rtc.now();

  display.clearDisplay();
  display.setTextSize(2);
  display.setTextColor(SSD1306_WHITE);
  display.setCursor(0, 0);
  display.print(" ");
  display.print(now.year(), DEC);
  display.print('/');
  display.print(now.month(), DEC);
  display.print('/');
  display.print(now.day(), DEC);
  display.print("  ");
  display.print(now.hour(), DEC);
  display.print(':');
  display.print(now.minute(), DEC);
  display.print(':');
  display.print(now.second(), DEC);

  display.display();

}
-----------------------------------------------------------------------------*/

#include <Wire.h>
#include <RTClib.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SCREEN_WIDTH 128//تعریف طول نمایشگر 
#define SCREEN_HEIGHT 32//تعریف عرض نمایشگر
#define OLED_RESET    -1//تعریف پین ریست نرم افزاری 
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);//کلاس Adafruit_SSD1306 ایجاد می‌کند

//---------------- تعریف زمان‌های شروع و فاصله‌های زمانی---------------- 
const int numAlarms = 4; // تعداد آلارم‌ها
const int startHour[numAlarms] = {6, 7, 8, 9};
const int startMinute[numAlarms] = {30, 30, 30, 30};
const int intervalHours[numAlarms] = {24, 24, 24, 24};
//---------------- ---------------- ---------------- 

//---------------- تعریف پین های وردی  خروجی---------------- 
int buzzerPin = 8;
//---------------- ---------------- ----------------

//----------------تعریف متغیرها برای زمان آلارم----------------
DateTime alarmTime[numAlarms];
//---------------- ---------------- ----------------

RTC_DS3231 rtc;// ایجاد شیء از کتابخانه RTC



void setup() {
  Wire.begin(13,14);// نرم افزاری i2c راه اندازی
  Serial.begin(115200);// راه اندازی پورت سریال

  pinMode(buzzerPin,OUTPUT);
  //----------------بررسی اتصال به ماژول DS3231----------------
  if (!rtc.begin()) {
    Serial.println("Couldn't find RTC");
    while (1);
  }//---------------- ---------------- ----------------

  //----------------بررسی اتصال به ماژول SSD1306----------------
  if (!display.begin(SSD1306_SWITCHCAPVCC, 0x3C)) {
    Serial.println(F("SSD1306 allocation failed"));
    for (;;);
  }//---------------- ---------------- ----------------
DateTime now = rtc.now();//دریافت زمان کنونی از ماژول
  // تنظیم زمان اولیه (تنها برای تنظیم یک بار)
  // rtc.adjust(DateTime(F(__DATE__), F(__TIME__))); // تنظیم به زمان کامپیوتر

  //----------------محاسبه زمان‌های آلارم اولیه----------------
  for (int i = 0; i < numAlarms; i++) {
    DateTime startTime(now.year(), now.month(), now.day(), startHour[i], startMinute[i], 0);
    alarmTime[i] = startTime;
    while (alarmTime[i] <= now) {
      alarmTime[i] = alarmTime[i] + TimeSpan(intervalHours[i] * 3600);
    }
    Serial.print("Next alarm time for alarm ");
    Serial.print(i + 1);
    Serial.print(": ");
    Serial.println(alarmTime[i].timestamp());
  }//---------------- ---------------- ----------------
}

void loop() {
  DateTime now = rtc.now();// rtc دریافت زمان کنونی از 
  //----------------برسی میکند آیا زمان کنونی با زمان آلارم برابراست----------------
  for (int i = 0; i < numAlarms; i++) {
    if (now >= alarmTime[i]) {
      Serial.print("Alarm ");
      Serial.print(i + 1);
      Serial.println(" triggered!");

      //----------------تولید یک زنگ هشدار سیگنال دادن به خروجی buzzer----------------
      for (int i = 0; i < 3; i++) {
        digitalWrite(buzzerPin,HIGH);
        delay(100); // مدت زمان پخش صدا به میلی‌ثانیه
        digitalWrite(buzzerPin,LOW);
        delay(100); // مدت زمان توقف صدا به میلی‌ثانیه
        digitalWrite(buzzerPin,HIGH);
        delay(100); // مدت زمان پخش صدا به میلی‌ثانیه
        digitalWrite(buzzerPin,LOW);
        //delay(1000); // مدت زمان توقف صدا به میلی‌ثانیه
        digitalWrite(buzzerPin,HIGH);
        delay(100); // مدت زمان پخش صدا به میلی‌ثانیه
        digitalWrite(buzzerPin,LOW);
        delay(100); // مدت زمان توقف صدا به میلی‌ثانیه
        digitalWrite(buzzerPin,HIGH);
        delay(100); // مدت زمان پخش صدا به میلی‌ثانیه
        digitalWrite(buzzerPin,LOW);
        delay(1000); // مدت زمان توقف صدا به میلی‌ثانیه
      }//---------------- ---------------- ----------------


      //----------------به‌روزرسانی زمان آلارم برای بار بعدی----------------
      alarmTime[i] = alarmTime[i] + TimeSpan(intervalHours[i] * 3600);
      Serial.print("Next alarm time for alarm ");
      Serial.print(i + 1);
      Serial.print(": ");
      Serial.println(alarmTime[i].timestamp());
      //---------------- ---------------- ----------------
    }
  }//---------------- ---------------- ---------------- ----------------
 
  //----------------نمایش ساعت و تاریخ روی نمایشگر----------------
    display.clearDisplay();
  display.setTextSize(2);
  display.setTextColor(SSD1306_WHITE);
  display.setCursor(0, 0);
  display.print(" ");
  display.print(now.year(), DEC);
  display.print('/');
  display.print(now.month(), DEC);
  display.print('/');
  display.print(now.day(), DEC);
  display.print("  ");
  display.print(now.hour(), DEC);
  display.print(':');
  display.print(now.minute(), DEC);
  display.print(':');
  display.print(now.second(), DEC);
  display.display();
  //---------------- ---------------- ----------------
  delay(1000); // تاخیر برای کاهش بار پردازنده
}

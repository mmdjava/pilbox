
#include <WiFi.h>
#include <string.h>
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <Wire.h>
#include <RTClib.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SCREEN_WIDTH 128//تعریف طول نمایشگر 
#define SCREEN_HEIGHT 32//تعریف عرض نمایشگر
#define OLED_RESET    -1//تعریف پین ریست نرم افزاری 
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);//کلاس Adafruit_SSD1306 ایجاد می‌کند

const char* ssid = "mmd";
const char* password = "12345678";

// تنظیم آدرس IP، گیت‌وی و ماسک زیرشبکه به صورت دستی
IPAddress local_IP(192, 168, 4, 1);
IPAddress gateway(192, 168, 4, 1);
IPAddress subnet(255, 255, 255, 0);

const int port = 8888;
WiFiServer server(port);
//WiFiClient client;

//----------------قرص 1---------------- 
char pill1_en;//وضعیت قرص 1
char pill_count_box1;//تعداد قرص 1
int start_time_1 = 0;//تایم شروع قرص 1
int interval_1 = 1;//چرخه مصرف قرص 1
//---------------- ---------------- ----------------

//----------------قرص 2---------------- 
char pill2_en;//وضعیت قرص 2
char pill_count_box2;//تعداد قرص 2
int start_time_2 = 0;//تایم شروع قرص 2
int interval_2 = 1;//چرخه مصرف قرص 2
//---------------- ---------------- ----------------

//----------------قرص 3---------------- 
char pill3_en;//وضعیت قرص 3
char pill_count_box3;//تعداد قرص 3
int start_time_3 = 0;//تایم شروع قرص 3
int interval_3 = 1;//چرخه مصرف قرص 3
//---------------- ---------------- ----------------

//----------------قرص 4---------------- 
char pill4_en;//وضعیت قرص 4
char pill_count_box4;//تعداد قرص 4
int start_time_4 = 0;//تایم شروع قرص 4
int interval_4 = 1;//چرخه مصرف قرص 4
//---------------- ---------------- ----------------

//----------------کیلید 1---------------- 
char pill_count1 = 5;//تعداد پیشفرض قرص 1
int keyState1 = 0;//وضعیت پیشفرض قرص 1
int lastKeyState1 = HIGH; // وضعیت قبلی کلید
unsigned long lastDebounceTime1 = 0;
unsigned long debounceDelay1 = 50; // تأخیر برای حذف نویز
int reading1;
//---------------- ---------------- ----------------

//----------------کیلید 2---------------- 
char pill_count2 = 5;//تعداد پیشفرض قرص 2
int keyState2 = 0;//وضعیت پیشفرض قرص 2
int lastKeyState2 = HIGH; // وضعیت قبلی کلید
unsigned long lastDebounceTime2 = 0;
unsigned long debounceDelay2 = 50; // تأخیر برای حذف نویز
int reading2;
//---------------- ---------------- ----------------

//----------------کیلید 3---------------- 
char pill_count3 = 5;//تعداد پیشفرض قرص 3
int keyState3 = 0;//وضعیت پیشفرض قرص 3
int lastKeyState3 = HIGH; // وضعیت قبلی کلید
unsigned long lastDebounceTime3 = 0;
unsigned long debounceDelay3 = 50; // تأخیر برای حذف نویز
int reading3;
//---------------- ---------------- ----------------

//----------------کیلید 4---------------- 
char pill_count4 = 5;//تعداد پیشفرض قرص 4
int keyState4 = 0;//وضعیت پیشفرض قرص 4
int lastKeyState4 = HIGH; // وضعیت قبلی کلید
unsigned long lastDebounceTime4 = 0;
unsigned long debounceDelay4 = 50; // تأخیر برای حذف نویز
int reading4;
//---------------- ---------------- ----------------

 //---------------- تعریف زمان‌های شروع و فاصله‌های زمانی---------------- 
const int numAlarms = 4; // تعداد آلارم‌ها
const int startHour[numAlarms] = { start_time_1 , start_time_2 , start_time_3 , start_time_4 };
const int startMinute[numAlarms] = {0, 0, 0, 0};
const int intervalHours[numAlarms] = { interval_1 , interval_2 , interval_3 , interval_4 };
//---------------- ---------------- ----------------


//----------------تابع پردازش داده ورودی----------------
int in_find_word(char *array_in, char *target) {
  int i,j=0,find=0;
  int len_array_in,len_target;
  len_array_in=strlen(array_in);
  len_target=strlen(target);
  for(i = 0; i < len_array_in; i++) {
      for(j=0;j<len_target;j++){
         if(array_in[i+j]==target[j]){
         find=1;

        }
        else{

        find=0;break;


        }
      }
      if(find)
        return i;
    }
    return -1;
  }

int  wordFilter(char output[],char in[],char in1[],char in2[])
{   int index1,index2;

    char input[100];strcpy(input,in);
    index1=in_find_word(input, in1);
    index2=in_find_word(input, in2);
    if((index1==-1 ||index2==-1))
        return -1;
    index1+=+strlen(in1);
    input[index2]=0;
    strcpy(output,input+index1);
    return index2-index1;


}
char output[50];
int rxCount=0;
char rxBufer[50]="";
int len=0;
//---------------- ---------------- ---------------- ----------------

//---------------- تعریف پین های وردی  خروجی---------------- 
int buzzerPin = 8;//پین بازر
int key1 = 44;//کلید قرص 1
int key2 = 42;//کلید قرص 2
int key3 = 40;//کلید قرص 3
int key4 = 39;//کلید قرص 4
int led1 = 35;//ال ای دی قرص 1
int led2 = 36;//ال ای دی قرص 2
int led3 = 37;//ال ای دی قرص 3
int led4 = 38;//ال ای دی قرص 4
//---------------- ---------------- ----------------

//----------------تعریف متغیرها برای زمان آلارم----------------
DateTime alarmTime[numAlarms];
//---------------- ---------------- ----------------

RTC_DS3231 rtc;// ایجاد شیء از کتابخانه RTC
 

//----------------core 0 لوپ پردازش موازی----------------
void Task1(void *pvParameters) {
    while(1) {
    
    
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
      
        switch (i) {
          case 0:
            digitalWrite(led1, HIGH);
            break;
          case 1:
            digitalWrite(led2, HIGH);
            break;
          case 2:
            digitalWrite(led3, HIGH);
            break;
          case 3:
            digitalWrite(led4, HIGH);
            break;
        }
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


        vTaskDelay(1000 / portTICK_PERIOD_MS);
    }
}


void setup() {
  Serial.begin(115200);// راه اندازی پورت سریال
  Wire.begin(13,14);// نرم افزاری i2c راه اندازی
 //---------------- تعریف پین های وردی  خروجی---------------- 
  pinMode(buzzerPin,OUTPUT);
  pinMode(key1, INPUT_PULLUP);
  pinMode(key2, INPUT_PULLUP);
  pinMode(key3, INPUT_PULLUP);
  pinMode(key4, INPUT_PULLUP);

 //---------------- ---------------- ----------------

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

 

  WiFi.mode(WIFI_AP);
  WiFi.softAPConfig(local_IP, gateway, subnet);
  WiFi.softAP(ssid, password);

  IPAddress myIP = WiFi.softAPIP();
  Serial.println("Connected to AP, IP address: " + myIP.toString());

  server.begin();
  Serial.print("Server started at IP: ");
  Serial.println(myIP);
  
 // ایجاد Task1 روی Core 0
 xTaskCreatePinnedToCore(Task1, "Task1", 10000, NULL, 1, NULL, 0);

}
  WiFiClient client;

void loop() {
 DateTime now = rtc.now();//دریافت زمان کنونی از ماژول
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
 
  //----------------برسی اتصال کلاینت---------------- 

  if(!client.connected()){

   client = server.available();

  }
 //---------------- ---------------- ----------------

//----------------دریافت دیتا---------------   
         
  if(client.available()>0){

    rxBufer[rxCount]= client.read();

    rxCount++;

  }
 //---------------- ---------------- ----------------

 //======================پردازش دیتا قرص ها==========================

  if(rxCount>9){
       
   len= wordFilter( output,rxBufer,"p1s","p1e");
          
    if(len){

     pill1_en=output[0];
     pill_count_box1=output[1];
     start_time_1=output[2];
     interval_1=output[3];
     pill_count1 =pill_count_box1;
     rxCount=0;

    }     
   len= wordFilter( output,rxBufer,"p2s","p2e");
          
    if(len){

     pill2_en=output[0];
     pill_count_box2=output[1];
     start_time_2=output[2];
     interval_2=output[3];
     pill_count2 =pill_count_box2;
     rxCount=0;

    }

   len= wordFilter( output,rxBufer,"p3s","p3e");
          
    if(len){

     pill3_en=output[0];
     pill_count_box3=output[1];
     start_time_3=output[2];
     interval_3=output[3];
     pill_count3 =pill_count_box3;
     rxCount=0;

    }

   len= wordFilter( output,rxBufer,"p4s","p4e");
          
    if(len){

     pill4_en=output[0];
     pill_count_box4=output[1];
     start_time_4=output[2];
     interval_4=output[3];
     pill_count4 =pill_count_box4;
     rxCount=0;

    } 
  }
  //-----------------------------------------------------------

 //--------------------------------بخش عملکرد کیلید 1--------------------------------
 reading1 = digitalRead(key1);

   if(reading1 != lastKeyState1) {

   lastDebounceTime1 = millis();

  }

 if ((millis() - lastDebounceTime1) > debounceDelay1) {

    if (reading1 == LOW && keyState1 == HIGH) {

      if (pill_count1 > 1) { // فقط زمانی کاهش بده که pill_count_box1 بزرگتر از صفر است

       pill_count1--;
       char data_1[20];
       sprintf(data_1,"%d",pill_count1);

       std::string count_1 = data_1;  // داده‌ای که می‌خواهید اضافه کنید
       std::string dataout_1;
       dataout_1 = "p1cs" + count_1 + "p1ce";    // ترکیب پیشوند، داده و پسوند

       client.print(dataout_1.c_str()); //ارسال مقدار به شبکه

       Serial.print(dataout_1.c_str());// ارسال مقدار به سریال
      }

      else {  // اگر مقدار pill_count_box1 به صفر رسید

       std::string zero_1 = "0";  // داده‌ای که می‌خواهید اضافه کنید
       std::string zero_out_1;
       zero_out_1 = "p1cs" + zero_1 + "p1ce";    // ترکیب پیشوند، داده و پسوند

       client.print(zero_out_1.c_str()); // وقتی قرص ها تمام شود

       Serial.print(zero_out_1.c_str()); // وقتی قرص ها تمام شود
      }
    }  
   keyState1 = reading1;
  }
 lastKeyState1 = reading1;
 //---------------- ---------------- ----------------

 //--------------------------------بخش عملکرد کیلید 2--------------------------------
 reading2 = digitalRead(key2);

   if(reading2 != lastKeyState2) {

   lastDebounceTime2 = millis();

  }

 if ((millis() - lastDebounceTime2) > debounceDelay2) {

    if (reading2 == LOW && keyState2 == HIGH) {

      if (pill_count2 > 1) { // فقط زمانی کاهش بده که pill_count_box2 بزرگتر از صفر است

       pill_count2--;
       char data_2[20];
       sprintf(data_2,"%d",pill_count2);

       std::string count_2 = data_2;  // داده‌ای که می‌خواهید اضافه کنید
       std::string dataout_2;
       dataout_2 = "p2cs" + count_2 + "p2ce";    // ترکیب پیشوند، داده و پسوند

       client.print(dataout_2.c_str()); //ارسال مقدار به شبکه

       Serial.print(dataout_2.c_str());// ارسال مقدار به سریال
      }

      else {  // اگر مقدار pill_count_box2 به صفر رسید

       std::string zero_2 = "0";  // داده‌ای که می‌خواهید اضافه کنید
       std::string zero_out_2;
       zero_out_2 = "p2cs" + zero_2 + "p2ce";    // ترکیب پیشوند، داده و پسوند

       client.print(zero_out_2.c_str()); // وقتی قرص ها تمام شود

       Serial.print(zero_out_2.c_str()); // وقتی قرص ها تمام شود
      }
    }  
   keyState2 = reading2;
  }
 lastKeyState2 = reading2;
 //---------------- ---------------- ----------------
 
 //--------------------------------بخش عملکرد کیلید 3--------------------------------
 reading3 = digitalRead(key3);

   if(reading3 != lastKeyState3) {

   lastDebounceTime3 = millis();

  }

 if ((millis() - lastDebounceTime3) > debounceDelay3) {

    if (reading3 == LOW && keyState3 == HIGH) {

      if (pill_count3 > 1) { // فقط زمانی کاهش بده که pill_count_box3 بزرگتر از صفر است

       pill_count3--;
       char data_3[20];
       sprintf(data_3,"%d",pill_count3);

       std::string count_3 = data_3;  // داده‌ای که می‌خواهید اضافه کنید
       std::string dataout_3;
       dataout_3 = "p3cs" + count_3 + "p3ce";    // ترکیب پیشوند، داده و پسوند

       client.print(dataout_3.c_str()); //ارسال مقدار به شبکه

       Serial.print(dataout_3.c_str());// ارسال مقدار به سریال
      }

      else {  // اگر مقدار pill_count_box3 به صفر رسید

       std::string zero_3 = "0";  // داده‌ای که می‌خواهید اضافه کنید
       std::string zero_out_3;
       zero_out_3 = "p3cs" + zero_3 + "p3ce";    // ترکیب پیشوند، داده و پسوند

       client.print(zero_out_3.c_str()); // وقتی قرص ها تمام شود

       Serial.print(zero_out_3.c_str()); // وقتی قرص ها تمام شود
      }
    }  
   keyState3 = reading3;
  }
 lastKeyState3 = reading3;
 //---------------- ---------------- ----------------
 
 //--------------------------------بخش عملکرد کیلید 4--------------------------------
 reading4 = digitalRead(key4);

   if(reading4 != lastKeyState4) {

   lastDebounceTime4 = millis();

  }

 if ((millis() - lastDebounceTime4) > debounceDelay4) {

    if (reading4 == LOW && keyState4 == HIGH) {

      if (pill_count4 > 1) { // فقط زمانی کاهش بده که pill_count_box4 بزرگتر از صفر است

       pill_count4--;
       char data_4[20];
       sprintf(data_4,"%d",pill_count4);

       std::string count_4 = data_4;  // داده‌ای که می‌خواهید اضافه کنید
       std::string dataout_4;
       dataout_4 = "p4cs" + count_4 + "p4ce";    // ترکیب پیشوند، داده و پسوند

       client.print(dataout_4.c_str()); //ارسال مقدار به شبکه

       Serial.print(dataout_4.c_str());// ارسال مقدار به سریال
      }

      else {  // اگر مقدار pill_count_box4 به صفر رسید

       std::string zero_4 = "0";  // داده‌ای که می‌خواهید اضافه کنید
       std::string zero_out_4;
       zero_out_4 = "p4cs" + zero_4 + "p4ce";    // ترکیب پیشوند، داده و پسوند

       client.print(zero_out_4.c_str()); // وقتی قرص ها تمام شود

       Serial.print(zero_out_4.c_str()); // وقتی قرص ها تمام شود
      }
    }  
   keyState4 = reading4;
  }
 lastKeyState4 = reading4;
 //---------------- ---------------- ----------------       

                       
 }   
  
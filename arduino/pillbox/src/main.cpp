#include <WiFi.h>
#include <string.h>
const char* ssid = "mmd";
const char* password = "12345678";

// تنظیم آدرس IP، گیت‌وی و ماسک زیرشبکه به صورت دستی
IPAddress local_IP(192, 168, 4, 1);
IPAddress gateway(192, 168, 4, 1);
IPAddress subnet(255, 255, 255, 0);

const int port = 8888;
WiFiServer server(port);
//WiFiClient client;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
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
//======================================================={


char pill1_e;
char pill_count_box1;
char start_time_1;
char interval_1;

int key = 40;
char pill_count = 5;
int keyState = 0;
int lastKeyState = HIGH; // وضعیت قبلی کلید
unsigned long lastDebounceTime = 0;
unsigned long debounceDelay = 50; // تأخیر برای حذف نویز

//=======================================================}
void setup() {
  Serial.begin(115200);
//======================================================={
pinMode(key, INPUT_PULLUP);
//=======================================================}
  WiFi.mode(WIFI_AP);
  WiFi.softAPConfig(local_IP, gateway, subnet);
  WiFi.softAP(ssid, password);

  IPAddress myIP = WiFi.softAPIP();
  Serial.println("Connected to AP, IP address: " + myIP.toString());

  server.begin();
  Serial.print("Server started at IP: ");
  Serial.println(myIP);
  
}
  WiFiClient client;

void loop() {
 
  //======================check clint conection  ===========================

  if(!client.connected()){

   client = server.available();

  }

 //===================== get data ========================
         
  if(client.available()>0){

    rxBufer[rxCount]= client.read();

    rxCount++;

  }

  //======================   proses data ========================== 

  if(rxCount>9){
       
   len= wordFilter( output,rxBufer,"p1s","p1e");
          
    if(len){

     pill1_e=output[0];
     pill_count_box1=output[1];
     start_time_1=output[2];
     interval_1=output[3];
     pill_count =pill_count_box1;
     rxCount=0;

    }     

            
       
  }

  //==========================  read keys =============================

 int reading = digitalRead(key);

   if(reading != lastKeyState) {

   lastDebounceTime = millis();

  }

 if ((millis() - lastDebounceTime) > debounceDelay) {

    if (reading == LOW && keyState == HIGH) {

      if (pill_count > 01) { // فقط زمانی کاهش بده که pill_count_box1 بزرگتر از صفر است

        pill_count--;
       char data[20];
       sprintf(data,"%d",pill_count);
       client.print(data); // نمایش مقدار در سریال مانیتور
        Serial.print(pill_count); // وقتی قرص ها تمام شود

      }

      else {  // اگر مقدار pill_count_box1 به صفر رسید
      
       client.print("pill_1=0"); // وقتی قرص ها تمام شود
       Serial.print("pill_1=0"); // وقتی قرص ها تمام شود

      }

    }  

   keyState = reading;

  }

 lastKeyState = reading;
                       
 }     
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
WiFiClient client;
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
/*
int key = 40;
int pill_count = 8;
int keyState = 0;
int lastKeyState = HIGH; // وضعیت قبلی کلید
unsigned long lastDebounceTime = 0;
unsigned long debounceDelay = 50; // تأخیر برای حذف نویز

int pill1_e;
int pill_count_box1;
int start_time_1;
int interval_1;
*/

//=======================================================}
void setup() {
  Serial.begin(115200);
//======================================================={
//pinMode(key, INPUT_PULLUP);
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

void loop() 
{
  WiFiClient client = server.available();
  
  if (client){ 
    if(client.connected()){
    {

      Serial.println("clint conected");

    }
  

   while(client.connected()){      
      while(client.available()>0){
        // read data from the connected client

        rxBufer[rxCount]= client.read();
        rxCount++;

      }
        if(rxCount>5){
       
         len= wordFilter( output,rxBufer,"p1s","p1e");
          Serial.println(len);
         if(len){
           //  pill1_e=output[0];
           //  pill_count_box1=output[1];
           //  start_time_1=output[2];
           //  interval_1=output[3];
          

         rxCount=0;
         for(int i=0;i<len;i++){
 
            Serial.println(output[i]);
            client.println(output[i]);
        }      
       }
      }
    }

  } 
          client.stop();
    Serial.println("Client disconnected");
  }
  //===================================================={
/*
     int reading = digitalRead(key);

  if (reading != lastKeyState) {
    lastDebounceTime = millis();
  }

  if ((millis() - lastDebounceTime) > debounceDelay) {
    if (reading == LOW && keyState == HIGH) {
      if (pill_count > 0) { // فقط زمانی کاهش بده که pill_count_box1 بزرگتر از صفر است
        pill_count--;
        Serial.println(pill_count); // نمایش مقدار در سریال مانیتور
      }

      if (pill_count == 0) { // اگر مقدار pill_count_box1 به صفر رسید
        Serial.println("pill=0!!!"); // وقتی قرص ها تمام شود
      }
    }
    keyState = reading;
  }

  lastKeyState = reading;
   
   
   */
  //====================================================}

  }

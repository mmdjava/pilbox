#include <WiFi.h>
#include <string.h>
#include <stdio.h>
#include <stdlib.h>

// Wi-Fi تنظیمات
const char* ssid = "mmd";
const char* password = "12345678";

// تنظیم آدرس IP، گیت‌وی و ماسک زیرشبکه به صورت دستی
IPAddress local_IP(192, 168, 4, 1);
IPAddress gateway(192, 168, 4, 1);
IPAddress subnet(255, 255, 255, 0);

const int port = 8888;
WiFiServer server(port);

// توابع کمکی برای جستجو و فیلتر کردن کلمات
int in_find_word(const char *array_in, const char *target) {
    int len_array_in = strlen(array_in);
    int len_target = strlen(target);

    for (int i = 0; i <= len_array_in - len_target; i++) {
        if (strncmp(&array_in[i], target, len_target) == 0) {
            return i;
        }
    }
    return -1;
}

int wordFilter(char *output, const char *in, const char *in1, const char *in2) {
    char input[100];
    strcpy(input, in);

    int index1 = in_find_word(input, in1);
    int index2 = in_find_word(input, in2);

    if (index1 == -1 || index2 == -1) return -1;

    index1 += strlen(in1);
    input[index2] = '\0';
    strcpy(output, input + index1);

    return index2 - index1;
}

char output[50];
int rxCount = 0;
char rxBuffer[50] = "";
int len = 0;

const int key = 40;
int pill_count_box1 = 5; // مقدار پیش‌فرض برای تعداد قرص‌ها
int keyState = 0;
int lastKeyState = HIGH; // وضعیت قبلی کلید
unsigned long lastDebounceTime = 0;
const unsigned long debounceDelay = 50; // تأخیر برای حذف نویز

void setup() {
    Serial.begin(115200);
    pinMode(key, INPUT_PULLUP);

    WiFi.mode(WIFI_AP);
    WiFi.softAPConfig(local_IP, gateway, subnet);
    WiFi.softAP(ssid, password);

    IPAddress myIP = WiFi.softAPIP();
    Serial.println("Connected to AP, IP address: " + myIP.toString());

    server.begin();
    Serial.print("Server started at IP: ");
    Serial.println(myIP);
}

void loop() {
    WiFiClient client = server.available();

    if (client) {
        if (client.connected()) {
            Serial.println("Client Connected");
        }

        while (client.connected()) {
            while (client.available() > 0) {
                // خواندن داده از کلاینت
                if (rxCount < sizeof(rxBuffer) - 1) {
                    rxBuffer[rxCount++] = client.read();
                } else {
                    rxCount = 0; // با پر شدن بافر، خواندن مجدد
                }
            }//=========================================
                    int reading = digitalRead(key);

                    if (reading != lastKeyState) {
                        lastDebounceTime = millis();
                    }

                    if (reading == LOW && keyState == HIGH) {
            if (pill_count_box1 > 0) {
                pill_count_box1--;
                client.print("Pill count: ");
                 Serial.println(pill_count_box1);
                 client.println(pill_count_box1);
                // ارسال داده به کلاینت

            }
        }


                    lastKeyState = reading;
                  
                   
              //========================================
            if (rxCount > 5) {
                len = wordFilter(output, rxBuffer, "p1s", "p1e");

                if (len > 0) {
                    rxCount = 0;
                    for (int i = 0; i < len; i++) {
                        Serial.print(output[i]);
                    }
                    Serial.println(); // پایان خط بعد از چاپ داده
                }
            }
        }

        client.stop();
        Serial.println("Client disconnected");
    }


/*
    if ((millis() - lastDebounceTime) > debounceDelay) {
        if (reading == LOW && keyState == HIGH) {
            if (pill_count_box1 > 0) {
                pill_count_box1--;
                Serial.print("Pill count: ");
                Serial.println(pill_count_box1);

                // ارسال داده به کلاینت
                WiFiClient client = server.available();
                if (client) {
                    client.println(pill_count_box1); // ارسال مقدار باقیمانده برای اندرید

                    if (pill_count_box1 == 0) {
                        client.println("pill=0"); // وقتی قرص‌ها تمام شود
                    }
                }
            }
        }
        keyState = reading;
    }
*/
    
}

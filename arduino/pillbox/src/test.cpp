/*
#include <Arduino.h>


int key = 40;
int pill_count_box1 = 5;
int keyState = 0;
int lastKeyState = HIGH; // وضعیت قبلی کلید
unsigned long lastDebounceTime = 0;
unsigned long debounceDelay = 50; // تأخیر برای حذف نویز

void setup() {
  pinMode(key, INPUT_PULLUP);
  Serial.begin(115200);
}

void loop() {
  int reading = digitalRead(key);

  if (reading != lastKeyState) {
    lastDebounceTime = millis();
  }

  if ((millis() - lastDebounceTime) > debounceDelay) {
    if (reading == LOW && keyState == HIGH) {
      if (pill_count_box1 > 0) { // فقط زمانی کاهش بده که pill_count_box1 بزرگتر از صفر است
        pill_count_box1--;
        Serial.println(pill_count_box1); // نمایش مقدار در سریال مانیتور
      }

      if (pill_count_box1 == 0) { // اگر مقدار pill_count_box1 به صفر رسید
        Serial.println("pill=0!!!"); // وقتی قرص ها تمام شود
      }
    }
    keyState = reading;
  }

  lastKeyState = reading;
}
*/
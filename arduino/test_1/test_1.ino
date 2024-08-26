#include <Wire.h>
#include <RTClib.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 32
#define OLED_RESET    -1
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);

RTC_DS3231 rtc;

void setup() {
  Serial.begin(115200);
  Wire.begin(13, 14);
  Serial.println("ok");
  if (!rtc.begin()) {
    Serial.println("Couldn't find RTC");
    //while (1);
  }
Serial.println("ok2");
  if (rtc.lostPower()) {
    Serial.println("RTC lost power, let's set the time!");
    rtc.adjust(DateTime(F(__DATE__), F(__TIME__)));
  }

  if (!display.begin(SSD1306_SWITCHCAPVCC, 0x3C)) {
    Serial.println(F("SSD1306 allocation failed"));
    //for (;;);
  }else 
      Serial.println(F("SSD1306 allocation ok"));

  display.begin(SSD1306_SWITCHCAPVCC, 0x3C);
    delay(200);
 // display.display();
 // delay(2000);
  display.clearDisplay();
}

void loop() {
/*
 if (Serial.available()) {
    String input = Serial.readStringUntil('\n');
    int year, month, day, hour, minute, second;
    sscanf(input.c_str(), "%d-%d-%d %d:%d:%d", &year, &month, &day, &hour, &minute, &second);
    rtc.adjust(DateTime(year, month, day, hour, minute, second));
  }
*/
  DateTime now = rtc.now();
  display.clearDisplay();
  display.setTextSize(2);
  display.setTextColor(SSD1306_WHITE);
  display.setCursor(0, 0);
  display.print(now.year(), DEC);
  display.print('/');
  display.print(now.month(), DEC);
  display.print('/');
  display.print(now.day(), DEC);
  display.print(" ");
  display.print(now.hour(), DEC);
  display.print(':');
  display.print(now.minute(), DEC);
  display.print(':');
  display.print(now.second(), DEC);
  display.display();
  delay(100);
}

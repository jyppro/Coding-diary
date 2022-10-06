/*************************************************** 
  프로젝트명은 Lights Out 게임입니다.
  4x4 구조로 되어있는 LED에 켜져있는 라이트를 전부 끄면 끝납니다.
  라이트는 누르는 버튼을 포함하여
  십자모양으로 켜져있는 라이트는 꺼지고, 꺼져있는 라이트는 켜지도록 설계하였습니다.
***************************************************/
#include <Wire.h>
#include "Adafruit_Trellis.h"

Adafruit_Trellis matrix0 = Adafruit_Trellis();
Adafruit_Trellis matrix1 = Adafruit_Trellis();
Adafruit_Trellis matrix2 = Adafruit_Trellis();
Adafruit_Trellis matrix3 = Adafruit_Trellis();

Adafruit_TrellisSet trellis =  Adafruit_TrellisSet(&matrix0, &matrix1, &matrix2, &matrix3);

#define NUMTRELLIS 4

#define numKeys (NUMTRELLIS * 16)

int chessboard[8][8] = {
  {60, 56, 52, 48, 44, 40, 36, 32},
  {61, 57, 53, 49, 45, 41, 37, 33},
  {62, 58, 54, 50, 46, 42, 38, 34},
  {63, 59, 55, 51, 47, 43, 39, 35},
  {12, 8, 4, 0, 28, 24, 20, 16},
  {13, 9, 5, 1, 29, 25, 21, 17},
  {14, 10, 6, 2, 30, 26, 22, 18},
  {15, 11, 7, 3, 31, 27, 23, 19}
};

#define INTPIN 5

void setup() {
  Serial.begin(9600);
  Serial.println("Trellis Lights Out");

  pinMode(INTPIN, INPUT);
  digitalWrite(INTPIN, HIGH);
  
  trellis.begin(0x71, 0x72, 0x73, 0x70);
  
  for (uint8_t i=0; i<8; i++) {
    for (uint8_t j=0; j<8; j++) {
      trellis.setLED(chessboard[i][j]);
      trellis.writeDisplay();
      delay(50);
    }
  }
  
  for (uint8_t i=0; i<numKeys; i++) {
    trellis.clrLED(i);
  }
  trellis.writeDisplay();
 
  makeRandomBoard();
}

void toggle(int placeVal) {
 if (trellis.isLED(placeVal))
    trellis.clrLED(placeVal);
  else
    trellis.setLED(placeVal);
}

int getNeighbor(int placeVal, int neighbor) {
  int px = 0;
  int py = 0;
  int x = 0;
  int y = 0;
  
  getPosition(placeVal, &px, &py);
  switch (neighbor) {
    case 0:
      x = px;
      y = py - 1;
      break;
    case 4:
      x = px;
      y = py + 1;
      break;
    case 2:
      x = px + 1;
      y = py;
      break;
    case 6:
      x = px - 1;
      y = py;
      break;
    case 1:
      x = px - 1;
      y = py + 1;
      break;
    case 7:
      x = px - 1;
      y = py - 1;
      break;
    case 3:
      x = px + 1;
      y = py + 1;
      break;
    case 5:
      x = px + 1;
      y = py - 1;
      break;
    default:
      x = 0;
      y = 0;
  }
  if (x < 0) x = 7;
  if (x > 7) x = 0;
  if (y < 0) y = 7;
  if (y > 7) y = 0;
  
  return chessboard[x][y];
}

int getPosition(int pv, int *tx, int *ty) {
  for (int i=0; i<8; i++) {
    for (int j=0; j<8; j++) {
      if (chessboard[i][j] == pv) {
        *tx = i;
        *ty = j;
        return 1;  
      }
    }
  }
  return -1;
}

void makeRandomBoard() {
  int x = 0;
  int y = 0;
  for (int i=0; i<10; i++) {
    x = random(0,7);
    y = random(0,7);
    makeYourMove(chessboard[x][y]);
  }
  trellis.writeDisplay();
  delay(100);
}

void makeYourMove(int placeVal) {
  toggle(placeVal);
    
  toggle(getNeighbor(placeVal, 0)); // North
  toggle(getNeighbor(placeVal, 2)); // East
  toggle(getNeighbor(placeVal, 4)); // South
  toggle(getNeighbor(placeVal, 6)); // West 
}

void loop() {
  delay(30);
    if (trellis.readSwitches()) {
      for (uint8_t i=0; i<numKeys; i++) {
        if (trellis.justPressed(i)) {
          makeYourMove(i);
        }
      }
      trellis.writeDisplay();
    }
}

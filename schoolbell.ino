#define C4 262
#define CS4 277
#define D4 294
#define DS4 311
#define E4 330
#define F4 349
#define FS4 370
#define G4 392
#define GS4 415
#define A4 440
#define AS4 466
#define B4 494
#define C5 523
int speakPin = 8;
int numTones = 26;
 

int tones[] =

{G4, G4, A4, A4, G4, G4, E4, G4, G4, E4, E4, D4, 0,

 G4, G4, A4, A4, G4, G4, E4, G4, E4, D4, E4, C4, 0};

int Darray[] = {500, 500, 500, 500, 500, 500, 950,
500, 500, 500, 500, 1450,
500, 500, 500, 500, 500, 500, 500,
950, 500, 500, 500, 500, 1450, 500};

 

void setup() {
}

 
void loop() {
  for(int i = 0; i < numTones; i++){
    tone(speakPin, tones[i]);
    delay(Darray[i]);
    noTone(speakPin);
    delay(50);
 }
}

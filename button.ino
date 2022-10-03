int led1 = 7;
int led2 = 6;
int key1 = 13;
int key2 = 12;
int buzzer = 8;

void setup() {
  // put your setup code here, to run once:
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(key1, INPUT);
  pinMode(key2, INPUT);
  pinMode(buzzer, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  if(digitalRead(key1)== HIGH){
    digitalWrite(led1, HIGH);
    digitalWrite(buzzer, HIGH); //Buzzer on
  delay(250);
   digitalWrite(buzzer, LOW); //Buzzer off
  delay(250);
    }
    else
    digitalWrite(led1, LOW);
    
  if(digitalRead(key2)==HIGH){
    digitalWrite(led2, HIGH);
    delay(100);
    digitalWrite(led2, LOW);
    delay(100);
    }
    else
    digitalWrite(led2, LOW);
}

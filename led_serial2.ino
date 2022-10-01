int led1 = 4;
int led2 = 5;
int led3 = 6;
int led4 = 7;
int led1_status = LOW;
int led2_status = LOW;
int led3_status = LOW;
int led4_status = LOW;

void setup() {
  // put your setup code here, to run once:
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(led3, OUTPUT);
  pinMode(led4, OUTPUT);
  digitalWrite(led1, LOW);
  digitalWrite(led2, LOW);
  digitalWrite(led3, LOW);
  digitalWrite(led4, LOW);
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  char read_data;

    if(Serial.available()){
    read_data = Serial.read();
    if( read_data == '8' && led1_status == LOW){
      digitalWrite(led1, HIGH);
      led1_status = HIGH;
      Serial.println("LED1 ON");
    }
    else if( read_data == '8' && led1_status == HIGH ){
      digitalWrite(led1, LOW);
      led1_status = LOW;
      Serial.println("LED1 OFF");
    }
  if( read_data == '6' && led2_status == LOW){
      digitalWrite(led2, HIGH);
      led2_status = HIGH;
      Serial.println("LED2 ON");
    }
    else if( read_data == '6' && led2_status == HIGH ){
      digitalWrite(led2, LOW);
      led2_status = LOW;
      Serial.println("LED2 OFF");
    }
  if( read_data == '4' && led3_status == LOW){
      digitalWrite(led3, HIGH);
      led3_status = HIGH;
      Serial.println("LED3 ON");
    }
    else if( read_data == '4' && led3_status == HIGH ){
      digitalWrite(led3, LOW);
      led3_status = LOW;
      Serial.println("LED3 OFF");
    }
  if( read_data == '2' && led4_status == LOW){
      digitalWrite(led4, HIGH);
      led4_status = HIGH;
      Serial.println("LED4 ON");
    }
    else if( read_data == '2' && led4_status == HIGH ){
      digitalWrite(led4, LOW);
      led4_status = LOW;
      Serial.println("LED4 OFF");
    }
  if( read_data == ' '){
      digitalWrite(led1, LOW);
      digitalWrite(led2, LOW);
      digitalWrite(led3, LOW);
      digitalWrite(led4, LOW);
      led1_status = LOW;
      led2_status = LOW;
      led3_status = LOW;
      led4_status = LOW;
      Serial.println("ALL OFF");
    }
  }
  delay(10);
}

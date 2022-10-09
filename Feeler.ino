/*로봇이 시계 방향으로 원 주행을 하다가 
   바깥쪽 더듬이가 터치될 때마다 큰 원을 그리고 
   안쪽 더듬이가 터치될 때마다  작은 원을 그리는데
   작은 원은 오른쪽 바퀴가 정지할 때까지,
   큰 원은 직선이 될 때까지만 변하도록 */
#include <Servo.h>                // Include servo library
Servo servoLeft;                   // Declare left and right servos
Servo servoRight;
int speed;                           // Right speed

void setup()                       // Built-in initialization block
{
  pinMode(7, INPUT);              // Set right whisker pin to input
  pinMode(5, INPUT);              // Set left whisker pin to input  
  pinMode(8, OUTPUT);            // Left LED indicator -> output
  pinMode(2, OUTPUT);            // Right LED indicator -> output 

  tone(4, 3000, 1000);             // Play tone for 1 second
  delay(1000);                      // Delay to finish tone

  servoLeft.attach(13);              // Attach left signal to pin 13
  servoRight.attach(12);            // Attach right signal to pin 12

  speed = 1450;
} 
void loop()                        // Main loop auto-repeats
{
  byte wLeft = digitalRead(5);       // Copy left result to wLeft  
  byte wRight = digitalRead(7);      // Copy right result to wRight
  // Whisker Navigation
  if((wLeft == 0) && (wRight == 0)) // If both whiskers contact
  {  digitalWrite(8, HIGH);          // Left LED on
     digitalWrite(2, HIGH);          // Right LED on
     servoLeft.writeMicroseconds(1500); // Left wheel stop
     servoRight.writeMicroseconds(1500); // Right wheel stop
     delay(300);
  }
  else if(wRight == 0) // If only left whisker contact
  {  digitalWrite(8, HIGH);          // Left LED on
     digitalWrite(2, LOW);          // Right LED off
     if(speed < 1500)
          speed += 10;
     servoLeft.writeMicroseconds(1700); // Left wheel counterclockwise
     servoRight.writeMicroseconds(speed); // Right wheel clockwise
     delay(300);
  }
  else if(wLeft == 0) // If only right whisker contact
  {  digitalWrite(8, LOW);          // Left LED off
     digitalWrite(2, HIGH);          // Right LED on
     if(speed > 1400)
          speed -= 10;
     servoLeft.writeMicroseconds(1700); // Left wheel counterclockwise
     servoRight.writeMicroseconds(speed); // Right wheel clockwise
     delay(300);
  }
  else // Otherwise, no whisker contact
 {   digitalWrite(8, LOW);          // Left LED off
     digitalWrite(2, LOW);          // Right LED off
     servoLeft.writeMicroseconds(1700); // Left wheel counterclockwise
     servoRight.writeMicroseconds(speed); // Right wheel clockwise
     delay(100);
 }
}

void setup() {
  // put your setup code here, to run once:
  pinMode(5, OUTPUT);
  pinMode(3, INPUT_PULLUP);
}

void loop() {
  // put your main code here, to run repeatedly:
  bool porta3 = digitalRead(3);
  if(porta3 == LOW){
    digitalWrite(5, LOW);
  }
  else{
    digitalWrite(5, HIGH);
  }
}

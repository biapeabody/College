#define tran 5
#define led 11
#define botao 13

void setup()
{
  pinMode(botao, INPUT_PULLUP);
  pinMode(led, OUTPUT);
  pinMode(tran, OUTPUT);
}

void loop()
{
  if(digitalRead(botao) == LOW){
    digitalWrite(led, HIGH);
    digitalWrite(tran, HIGH);
    delay(6225);
  }
  else {
    digitalWrite(led, LOW);
    digitalWrite(tran, LOW);
  }
}

int led = 4;

int delai[] = {200, 200, 200, 500, 500, 500, 200, 200, 200};

void setup() {
  pinMode(led, OUTPUT);
}

void loop() {
  for(int i = 0; i < 9; i++){
    flash(delai[i]);
  }
  delay(3000);
}

void flash(int timer){
  digitalWrite(led, HIGH);
  delay(timer);
  digitalWrite(led, LOW);
  delay(timer);
}

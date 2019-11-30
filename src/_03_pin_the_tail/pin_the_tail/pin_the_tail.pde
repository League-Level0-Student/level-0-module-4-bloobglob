import ddf.minim.*;   
AudioSample woohooSound; 
boolean playSound = true; 
int x;
int y;
boolean stick = false;
PImage donkey;
PImage tail;
void setup() {
  size(500, 250);
  Minim minim = new Minim(this);
  woohooSound = minim.loadSample("homer-woohoo.wav");
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  donkey.resize(500, 250);
  tail.resize(45, 75);
}

void draw() {
  if(dist(0, 0, mouseX, mouseY)<30){
    background (donkey);
  }else{
    background(#000000);
  }
  if(mousePressed){
    stick = true;
    if(dist(47, 111, mouseX, mouseY)<40){
     if (playSound) {
     woohooSound.trigger();
     playSound = false;
} 
    }
  }
  rect(0, 0, 30, 30);
  if(!stick){
    x = mouseX-35;
    y = mouseY;
  }else{
    background(donkey);
  }
  image(tail, x, y);
}

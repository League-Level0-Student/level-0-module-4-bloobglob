int x =round(random(600));
int y = round(random(400));
PImage creeper; 
PImage minecraft;
void setup() {
  size(600, 400);
  creeper=loadImage("creeper.png");
   minecraft = loadImage("minecraft.png"); 
  minecraft.resize(width, height); 
  creeper.resize(5, 5);
  background(minecraft);
  noStroke();
}

void draw() {
  image(creeper, x, y); 
  if(mousePressed){
    if(isNear(mouseX, x) && isNear(mouseY, y)){
      fill(#00FF00);
    }else{
      fill(#FF0000);
    }
    ellipse(mouseX, mouseY, 4, 4);
    if(dist(x, y, mouseX, mouseY)<5){
      x = round(random(600));
      y = round(random(400));
      background(minecraft);
    }
  }
}
boolean isNear(int a, int b) {
if (abs(a - b) < 15)
     return true;
else
     return false;
}

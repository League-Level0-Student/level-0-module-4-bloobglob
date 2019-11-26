PImage face;
int x1 = 387;
int y1 = 140;
int x2 = 436;
int y2 = 123;
void setup() {
    face=loadImage("face.jpeg");
    size(800,600);
    face.resize(width,height);
}

void draw() {
  background(face);
  //Left Eye
  if(mouseX>=376 && mouseX<=400){
    x1=mouseX;
  }else if(mouseX<376){
    x1=376;
  }else{
    x1=400;
    }  
  if(mouseY>=129 && mouseY<=152){
    y1=mouseY;
  }else if(mouseY<129){
    y1=129;
  }else{
    y1=152;
  }
  //Right Eye
    if(mouseX>=425 && mouseX<=447){
    x2=mouseX;
  }else if(mouseX<425){
    x2=425;
  }else{
    x2=447;
    }  
  if(mouseY>=112 && mouseY<=134){
    y2=mouseY;
  }else if(mouseY<112){
    y2=112;
  }else{
    y2=134;
  }
  fill(#FFFFFF);
  ellipse(387, 140, 50, 50);
  ellipse(436, 123, 50, 50);
  fill(#000000);
  ellipse(x1, y1, 25, 25);
  ellipse(x2, y2, 25, 25);
  if(mousePressed){
    println(mouseX + ", " + mouseY);
  }
}

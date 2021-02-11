color grey = color(128,128,128);
color red = color(255,0,0);
color orange = color(255,69,0);
color green = color(0,255,0);

void setup(){
size(400,700);
frameRate(0.5);
}

void draw(){
  rectMode(CORNERS);
  fill(grey);
  rect(50,50, 350,650);
 
  if (frameCount%2 == 0){
  fill(red);
  } else {
    fill(grey);
  }
  ellipseMode(CENTER);
  ellipse(200,150, 180,180);
  
 fill(grey);
  ellipseMode(CENTER);
  ellipse(200,350, 180,180);
  
  if (frameCount%2 == 1){
  fill(green);
  } else {
    fill(grey);
  }
  ellipseMode(CENTER);
  ellipse(200,550, 180,180);
  
  
  
   
  
}

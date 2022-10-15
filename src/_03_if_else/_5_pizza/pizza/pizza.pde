PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
    size(1000,1000);
 pepperoni=loadImage("pepperoni.png");
 olive=loadImage("olive.png");
 mushroom=loadImage("mushroom.png");
 }
void draw() {
    fill(#AA8848);
    ellipse(500,500,1000,1000);
fill(#FF4800);
  ellipse(500,500,900,900);
 fill(#FFD900);
  ellipse(500,500,800,800);  
 
if(mousePressed){
image(pepperoni,200,200);
image(olive,400,200);
image(mushroom,600,200);
}
}

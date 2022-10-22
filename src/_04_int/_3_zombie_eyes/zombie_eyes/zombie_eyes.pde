
PImage dog;
void setup() {
dog = loadImage("dog.jpeg");
size(1000,1000);
}
void draw() {
dog.resize(width, height);
image(dog, 0, 0);

fill(255,3,3);
ellipse(270,325,200,200);
ellipse(725,322,200,200);
if (mousePressed){
fill(0,255,232);
  ellipse(270,325,200,200);
  ellipse(725,322,200,200);





}
}

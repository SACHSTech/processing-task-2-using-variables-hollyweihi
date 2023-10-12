import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(300, 300);
  }
  public void setup() {
    background(0, 200, 0);
  }
  public void draw() {

    stroke(128);
    fill(255, 128, 0);
    ellipse(width/4, height/4,
        width/2, height/2);
    ellipse(width/2, height/4,
        width/2, height/2);
    ellipse(width/4, height/2,
        width/2, height/2);
    ellipse(width/2, height/2,
        width/2, height/2);
    
  fill(255, 0, 0);
    ellipse(width/3, height/3,
            width/3, height/3);
  }
}
  
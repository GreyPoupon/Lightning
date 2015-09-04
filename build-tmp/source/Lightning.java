import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

lightning tom;
public void setup()
{
  size(800,500); 
  frameRate(60);
}
public void draw()
{
  fill(0, 25);
  rect(-25, -25, 850, 550);
}
public void mousePressed()
{
  for(int x = 0; x <= (int)(Math.random()*16); x += 1)
  {
  	tom = new lightning((int)(Math.random()*801), 0);
  	tom.zap();
  }
}
class lightning
{
  int lightX, lightY;
  lightning(int x, int y)
  {
  	lightX = x;
  	lightY = y;
  }
  public void zap()
  {
  	int strikeX;
  	int strikeY;
  	int strokeR = (int)(Math.random()*256);
  	int strokeG = (int)(Math.random()*256);
  	int strokeB = (int)(Math.random()*256);
  	while(lightY < 500)
  	{
  		strikeX = lightX + (int)(Math.random()*19) - 9;
  		strikeY = lightY + (int)(Math.random()*10);
  		strokeWeight(3);
  		stroke(strokeR, strokeG, strokeB);
  		line(lightX, lightY, strikeX, strikeY);
  		strokeWeight(30);
  		stroke(strokeR, strokeG, strokeB, 25);
  		line(lightX, lightY, strikeX, strikeY);
  		lightX = strikeX;
  		lightY = strikeY;
  	}
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

lightning tom;
void setup()
{
  size(800,500); 
  frameRate(60);
}
void draw()
{
  fill(0, 25);
  rect(-25, -25, 850, 550);
}
void mousePressed()
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
  void zap()
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
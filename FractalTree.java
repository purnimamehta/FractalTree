import java.applet.Applet; 
import java.awt.*; 

public class FractalTree extends Applet 
{ 
  public void paint(Graphics g) 
  { 
    tree(200, 250, 100, 90);
  }
  
  public void tree(int x, int y, double size, int angle) //x value is 200, y value is 250, size is 100, angle is 90
  {
    try
    {
      if (size < 3) return;
      Graphics g= getGraphics();
      
      int newx = x+(int)(size*Math.cos(Math.toRadians(angle)));
      int newy = y-(int)(size*Math.sin(Math.toRadians(angle)));
      
      Thread.sleep(1); //
      
      g.drawLine(x, y, newx, newy);
      
      int angle1 = angle + 90;
      int angle2 = angle - 90;
      
      
      tree(newx, newy, size*.6, angle1);
      tree(newx, newy, size*.6, angle2);
    }
    catch (Exception e)
    {
    
    }
  }
}

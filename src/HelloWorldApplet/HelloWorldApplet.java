package HelloWorldApplet;

import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet{
	public void paint(Graphics g){
		g.drawString("hello world!",5,35);
	} 
}

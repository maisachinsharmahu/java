import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

/* <applet code="HelloApplet" width="300" height="300"></applet> */

public class HelloApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Welcome to Java Applets", 20, 100);
        
        g.setColor(Color.RED);
        g.drawRect(15, 70, 260, 50);
    }
}

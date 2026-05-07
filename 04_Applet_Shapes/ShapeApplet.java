import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="ShapeApplet" width="400" height="400"></applet> */

public class ShapeApplet extends Applet implements MouseListener {
    int x = 0, y = 0;
    String msg = "Click anywhere to draw a Circle!";

    public void init() {
        addMouseListener(this);
        setBackground(Color.LIGHT_GRAY);
    }

    public void paint(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.drawString(msg, 20, 20);
        
        if (x > 0 && y > 0) {
            g.setColor(Color.ORANGE);
            g.fillOval(x - 25, y - 25, 50, 50);
            g.setColor(Color.BLACK);
            g.drawOval(x - 25, y - 25, 50, 50);
        }
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        msg = "Circle drawn at: " + x + ", " + y;
        repaint();
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}

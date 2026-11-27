package lab6;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;


public class Game extends Canvas {
public static void main(String[] args) {
new Game();
}


Ball[] balls = {
	    new Ball(20, 30, 40, 40, 1, 2),
	    new Ball(100, 100, 40, 40, 2, 3),
	    new Ball(190, 200, 40, 40, 3, 4)
	};

Game() {

JFrame frame = new JFrame();
this.setSize(400, 400);
frame.add(this);
frame.pack();
frame.setVisible(true);


Timer t = new Timer();
TimerTask tt = new TimerTask() {
@Override
public void run() {
draw();
}
};


t.schedule(tt, 0, 50);


frame.addWindowListener(new WindowAdapter() {
@Override
public void windowClosing(WindowEvent e) {
t.cancel();
tt.cancel();
}
});
}


public void draw() {
this.repaint();
}


public void paint(Graphics g) {
g.setColor(Color.RED);
g.fillRect(0, 0, 300, 300);


// move each ball and then draw
g.setColor(Color.blue);
for (Ball ball : balls) {
    g.fillOval(ball.x, ball.y, ball.w, ball.h);
}

}}
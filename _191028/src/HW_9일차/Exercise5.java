package HW_9ÀÏÂ÷;

import java.awt.*;
import java.awt.event.*;

class Exercise5 {
	public static void main(String[] args) {
		EventHandler eventhandler = new EventHandler() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		};
			
		Frame f = new Frame();
		f.addWindowListener(eventhandler);
	}
}

class EventHandler extends WindowAdapter {
	public void windowClosing(WindowEvent e) {}
}





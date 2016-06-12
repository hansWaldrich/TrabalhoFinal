package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		View view = new View();
		view.setExtendedState(JFrame.MAXIMIZED_BOTH);
		view.setVisible(true);
	}
}

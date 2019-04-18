package com.github.tsedmik.simpleswingapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * SimpleSwingApp
 */
public class SimpleSwingApp {

	public static void main(String args[]) {
		JFrame frame = new JFrame("Close me once you are done :-)");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		JButton button = new JButton("Quit");
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				System.exit(0);
			}
		};
		button.addActionListener(actionListener);
		frame.getContentPane().add(button); // Adds Button to content pane of frame
		frame.setVisible(true);
	}
}

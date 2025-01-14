package src;

import javax.swing.ImageIcon;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener, KeyListener, MouseListener{
	
	JButton button;
	JLabel label;
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	MyFrame(){
		
//		Border border = BorderFactory.createLineBorder(Color.green);
//		
//		JLabel label = new JLabel();
//		label.setText("Hello, this is a label");
//		ImageIcon image2 = new ImageIcon("D:\\Courses\\Java Full Course\\JavaProject\\src\\pngegg.png");
//		label.setIcon(image2);
//		label.setHorizontalTextPosition(JLabel.CENTER);
//		
//		label.setBorder(border);
//		
//		
//		this.setTitle("this title");
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setResizable(false);
//		this.setSize(1000,1000);
//		this.add(label);
//		
//		this.setVisible(true);
//		ImageIcon image = new ImageIcon("D:\\Courses\\Java Full Course\\JavaProject\\src\\pngegg.png");
//		
//		this.setIconImage(image.getImage());
//		
//		this.pack();
		
		
//		JButton
		
//		ImageIcon icon = new ImageIcon("pngeeg.png");
//		label = new JLabel();
//		label.setText("label text");
//		label.setIcon(icon);
//		label.setBounds(150,250,150,150);
//		label.setVisible(false);
//		
//		button = new JButton();
//		button.setBounds(200,100,100,50);
//		button.addActionListener(this);
//		
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(null);
//		this.setSize(500,500);
//		this.setVisible(true);
//		this.add(button);
//		this.add(label);
		
		
//		MenuBar
		
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(new FlowLayout());
//		this.setSize(500,500);
//		this.setVisible(true);
//		
//		menuBar = new JMenuBar();
//		fileMenu = new JMenu("File");
//		editMenu = new JMenu("Edit");
//		helpMenu = new JMenu("Help");
//		
//		loadItem = new JMenuItem("Load");
//		saveItem = new JMenuItem("Save");
//		exitItem = new JMenuItem("Exit");
//		
//		loadItem.addActionListener(this);
//		saveItem.addActionListener(this);
//		exitItem.addActionListener(this);
//		
//		fileMenu.add(loadItem);
//		fileMenu.add(saveItem);
//		fileMenu.add(exitItem);
//		
//		
//		menuBar.add(fileMenu);
//		menuBar.add(editMenu);
//		menuBar.add(helpMenu);
//		
//		
//		this.setJMenuBar(menuBar);
//		this.setVisible(true);
		
		
//		KeyListener
		
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(new FlowLayout());
//		this.setSize(500,500);
//		this.addKeyListener(this);
//		
//		label = new JLabel();
//		label.setText("label");
//		label.setBounds(0, 0, 50, 50);
//		label.setBackground(Color.red);
//		label.setOpaque(true);
//		
//		this.add(label);
//		this.setVisible(true);
		
		
//		2d animation
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(500,500);
		this.setVisible(true);
		
	}
	
	
	public void paint(Graphics g) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		
//		if(e.getSource()==button) {
//			System.out.println("button clicked");
//			label.setVisible(true);
//		}
		
//		Menu Bar
		if(e.getSource()== loadItem) {
			System.out.println("file loaded");
		}
		if(e.getSource()== saveItem) {
			System.out.println("file saved");
		}
		
		
		
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-10, label.getY());
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("You release key: "+e.getKeyChar());
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

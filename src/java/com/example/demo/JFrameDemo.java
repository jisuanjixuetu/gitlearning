package com.example.demo;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
 
public class JFrameDemo extends JFrame{
	public JFrameDemo(){
		this.setTitle("JFrameTest");
		this.setSize(200,300);
		
		//定义一个按钮
		JButton bt =new JButton("按钮");
		
		this.setLayout(new FlowLayout());
		this.add(bt);
		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrameDemo.this.dispose();
			}
		});
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args)throws Exception{
        new JFrameDemo();
	}
}
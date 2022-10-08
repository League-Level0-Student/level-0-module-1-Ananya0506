package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import java.util.Random;

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

	
	String name= JOptionPane.showInputDialog("what is your name?");
	
	String re= " you are very funny!";
    String marka="you are very kind!";
    String ble="you are very brave!";
    String ha="you are very smart!";
    String boo="you are very strong!";
    
	Random thing=new Random();
	int weird=thing.nextInt(5);
	 
	if (weird==0)  {
		JOptionPane.showMessageDialog(null,name+","+ re);
	}
	
	if (weird==1)  {
		JOptionPane.showMessageDialog(null, name+","+ marka);
	}
	
	if (weird==2)  {
		JOptionPane.showMessageDialog(null, name+","+ ble);
	}
	
	if (weird==3)  {
		JOptionPane.showMessageDialog(null,name+","+ ha);
	}
	
	if (weird==4)  {
		JOptionPane.showMessageDialog(null,name+","+ boo);
	}
	
	
	
		// 1. Save something remarkable about each person in a variable.
      
		// 2. Ask the user to enter a name. Store their answer in a variable.
      
		// 3. In a pop-up, tell the user what is remarkable about that person. 
  	
	}
}


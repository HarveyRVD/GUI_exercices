package GUI;

import javax.swing.*;

/////////////////////////////////////////
///           Q.1 GUI JAVA             //
/////////////////////////////////////////

public class Prog611
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your family name?");
		String input = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(input);
		System.out.print("Hello, " + name + ".");
		System.out.print(" In five years, you\'ll be " + (age + 5));
		System.exit(0);
	}
}

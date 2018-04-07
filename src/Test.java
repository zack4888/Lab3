import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Password();
		Counting();
		PhoneNumber();
		IDNum();
	

	}
	public static void Counting() {//Counts number of words 
		String Words;
		String[] Words1;
		Words = JOptionPane.showInputDialog("Please enter any number of words, separeted by \ncomma's, spaces, periods, semicolon, exclamation points, or question marks");
		Words1 = Words.split("\\W+");
		JOptionPane.showMessageDialog(null,Words1.length);
		
	}
public static void Password() {// Requires you to make a password
		
		Boolean Final = false;
		String Passwords ="";
		
		while (Final == false) {
			Passwords = JOptionPane.showInputDialog("Please enter a password between 6 and 10 characters long, it must contain at least one capital letter and one number");
			if (Passwords.length() > 5) {
				if(Passwords.length() < 11) {
					for(char i : Passwords.toCharArray()) {
						if(Character.isUpperCase(i)) {
							for(char v : Passwords.toCharArray()) {
								if (Character.isDigit(v)) {
									Final = true;
									
								}
								
							}
						}
						
					}
				}
				else {
					JOptionPane.showMessageDialog(null,"Password was too long");
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null,"Your password was too short");
			}
			
			
		}
		
	}
public static void PhoneNumber() { // Adds to phone number
	String Number;
	while(true) {
	Number = JOptionPane.showInputDialog("Please enter a ten digit phone number\nor enter 999 to exit");
	if(Number.equals("999")) {
		break;
	}
	if (Number.length() == 10) {
		JOptionPane.showMessageDialog(null, "("+Number.substring(0,3)+")"+Number.substring(3,6)+"-"+Number.substring(6));
	}
	else {
		JOptionPane.showMessageDialog(null, "Your phone number did not contain the proper number of digits.");
	}
	}
}
public static void IDNum() { // Creates an ID number
	String[] Name;
	String[] Address;
	String ID = "";
	JOptionPane.showMessageDialog(null, "Here we will be making an ID number using your name and Address.");
	Name = JOptionPane.showInputDialog("Please enter your full name").split("\\W");
	Address = JOptionPane.showInputDialog("Please enter your Address").split("\\s+");
	
	for(String i : Name) {
		ID = ID + i.charAt(0);
	}
	ID = ID + Address[0];
	
	JOptionPane.showMessageDialog(null,"Your ID Number is" + ID );
}

}

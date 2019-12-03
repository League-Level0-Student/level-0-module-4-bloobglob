package _11_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You are a merchant travelling to a land of great wealth. Your goal is to not lose your goods.");
		int path1 = JOptionPane.showOptionDialog(null, "Which path do you want to take?", "Dangerous Paths", 0, JOptionPane.INFORMATION_MESSAGE, null,new String[] { "Beyond this"
				+ " path, you see a valley with lots of gold.", "It seems this leads to a forest, the path is too dark.", "This path looks normal." }, null);
		if(path1 == 2) {
			int path2 = JOptionPane.showOptionDialog(null, "You here a rustling in the bush right in front of you, what do you want to do?", "Escape or Stay?", 0, JOptionPane
			.INFORMATION_MESSAGE, null, new String[] { "Run", "Stay"}, null);
		}else {
			JOptionPane.showMessageDialog(null, "This was a trap! Bandits jump out and steal all your belongings.");
		}
	}
}

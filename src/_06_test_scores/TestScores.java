package _06_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What did you get on the test?");
		double scoreNum = Double.parseDouble(score);
		if(scoreNum>=90) {
			JOptionPane.showMessageDialog(null, "You're the smartest person I know!");
		}else if(scoreNum>=70){
			JOptionPane.showMessageDialog(null, "You must have studied really hard!");
		}else {
			JOptionPane.showMessageDialog(null, "That must have been a really hard test!");
		}
	}
}

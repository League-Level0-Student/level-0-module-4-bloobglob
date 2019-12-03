package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String pet;
	public static void main(String[] args) {
		boolean completeGame = false;
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		pet  = JOptionPane.showInputDialog("What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while(true) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to keep your pet entertained?", "Entertain Your Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed it", "Talk to it", "Clean up poop", "Take a walk" }, null);
System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
			if(task==3) {
				takeWalk();
			}else if(task ==1) {
				talkToPet();
			}else if(task==2) {
				cleanPoop();				
			}else {
				feedPet();
			}
			if(happinessLevel>20) {
				JOptionPane.showMessageDialog(null, "You truly love your " + pet);
				break;
			}
		}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void feedPet() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " is happy and full.");
		happinessLevel+=3;
	}
	static void talkToPet() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " doesn't understand you.");
	}
	static void cleanPoop() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " is clean.");
		happinessLevel+=5;
	}
	static void takeWalk() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " is happy to go on the walk.");
		happinessLevel+=1;
	}
}

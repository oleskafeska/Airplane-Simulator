package cursor.edu.main;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import cursor.edu.planeparts.Target;
import cursor.edu.planes.MitsubishiATD;

public class App {
	private static MitsubishiATD mitsubishi;
	private static Target target;

	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		mitsubishi = MitsubishiATD.getInstance();
		mitsubishi.readingOfDirection();
		nextStep();

	}

	private static void resultOfAttack() {
		if (mitsubishi.getLength() >= target.getDistance() || mitsubishi.getPunchingArmor() >= target.getArmor()) {
			System.out.println("BOOOM!!!!You are distroyed this target!CONGRATULATION");

		} else if (mitsubishi.getLength() < target.getDistance()) {
			System.out.println("Sorry, you have fallen down.The target is too far from you");
		} else if (mitsubishi.getPunchingArmor() < target.getArmor()) {
			System.out.println("Sorry, you have fallen down. You don`t have enough weapons to destroy the target");
		}
		System.out.println("GAME OVER. BYE-BYE");
		System.exit(0);
	}

	private static void createTarget() {

		target = Target.getInstance();
		NumberFormat formatted = new DecimalFormat("#0.00");
		System.out.println("In our direction has one target.It is " + target.getName() + " in distance "
				+ formatted.format(target.getDistance()));
		System.out.println("Armor of this target is " + formatted.format(target.getArmor()));

		System.out.println("Do you wanna attack this target? Press 'y' or 'n'");
		String answer;
		answer = sc.nextLine();
		switch (answer) {
		case "y":
		case "Y": {
			System.out.println("You have invisability function. Do you want to use it?");
			System.out.println("Enter 'y' or 'n' ");
			answer = sc.nextLine();
			switch (answer) {
			case "y":
			case "Y": {
				mitsubishi.setInvisible();
				resultOfAttack();
				break;

			}
			case "n":
			case "N": {
				resultOfAttack();
				break;
			}
			default:
				System.out.println("You entered wrong letter.Try again");
				resultOfAttack();

			}
		}
		case "n":
		case "N": {
			System.out.println("Ok, select another direction!Maybe we will find one more target.");
			mitsubishi.readingOfDirection();
			nextStep();
			break;
		}
		default:
			System.out.println("You entered wrong letter.Try again");
			createTarget();
		}

	}

	public static void nextStep() {
		System.out.println("What's next? Enter 'f' for 'fly |'s' for 'search targets' | 'l' for land the plane ");

		String answer;

		answer = sc.nextLine();
		switch (answer) {
		case "f":
		case "F": {
			mitsubishi.readingOfDirection();
			nextStep();
			break;
		}
		case "s":
		case "S": {
			createTarget();
			break;

		}
		case "l":
		case "L": {
			System.out.println("Your plane is successfully landed. BYE-BYE");
			System.exit(0);
			break;
		}
		default:
			System.out.println("You entered wrong letter.try again");
			nextStep();

		}
	}

}

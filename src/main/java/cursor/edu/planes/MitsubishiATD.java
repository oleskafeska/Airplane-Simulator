package cursor.edu.planes;
import cursor.edu.constants.Constatable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


import cursor.edu.planeparts.*;
public class MitsubishiATD extends Plane implements Constatable {

	private static MitsubishiATD instance;
	private Shotgun shotgun = new Shotgun();
	private Rocket rocket = new Rocket();
	private static Scanner sc = new Scanner(System.in);
	private String direction;

	private MitsubishiATD() {
		buildName();
		buildParam(shotgun.generateBullets(), rocket.generateRockets());

	}

	public static MitsubishiATD getInstance() {
		if (instance == null) {
			instance = new MitsubishiATD();
		}
		return instance;

	}

	private void buildParam(int bullCount, int rockCount) {

		if (bullCount == MIN_BULL || rockCount == MIN_ROCK) {
			setLength(MIN_LENGTH);
			setWeight(MIN_WEIGHT);
			setWidth(MAX_WIDTH);
			setPunchingArmor(MIN_PUNCHING_ARMOR);
		} else if (bullCount == MEDIUM_BULL || rockCount == MEDIUM_ROCK) {
			setLength(MEDIUM_LENGTH);
			setWeight(MEDIUM_WEIGHT);
			setWidth(MEDIUM_WIDTH);
			setPunchingArmor(MEDIUM_PUNCHING_ARMOR);
		} else if (bullCount == MAX_BULL || rockCount == MAX_ROCK || rockCount < MAX_ROCK) {
			setLength(MAX_LENGTH);

			setWeight(MAX_WEIGHT);
			setWidth(MIN_WIDTH);
			setPunchingArmor(MAX_PUNCHING_ARMOR);
		}
		System.out.println("Okey..GO!!");
		System.out.println("Your length is " + getLength() + " km, your weight " + getWeight() + " kg, your width "
				+ getWidth() + " km");
	}

	public void readingOfDirection() {

		System.out.println("Enter direction - west,east,north or south :");
		direction = inputDirection();
		System.out.println("How many km? : ");
		double kilometrage = sc.nextDouble();
		sc.nextLine();

		switch (direction) {
		case "west": {
			goToWest(kilometrage);

			break;
		}
		case "east": {
			goToEast(kilometrage);
			break;
		}
		case "north": {
			goToNorth(kilometrage);
			break;
		}
		case "south": {
			goToSouth(kilometrage);
			break;
		}

		default: {
			System.out.print("Wrong  direction. ");
			readingOfDirection();

		}

		}

		// double isThereLength = getLength()-kilometrage;
		// if (isThereLength>getLength()) {
		// System.out.println("You fallen down");
		// }
	}

	private static String inputDirection() {
		while (!sc.hasNextLine()) {

			sc.nextLine();
			System.out.println("You input wrong direction");
		}
		return sc.nextLine();
	}

	public void setInvisible() {
		NumberFormat formatted = new DecimalFormat("#0.00");
		double invis = Math.random() * 4 + 1;
		System.out.println("You are invisible for " + formatted.format(invis) + " seconds");

	}

}

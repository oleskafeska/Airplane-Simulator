package cursor.edu.planeparts;

import java.util.Random;

import cursor.edu.constants.Constatable;

public class Rocket implements Constatable{
	private int countRocket;
	Random rand = new Random();

	public int getRocketCount() {
		return countRocket;
	}

	public int generateRockets() {
		countRocket = rand.nextInt(MAX_ROCK - MIN_ROCK) + MIN_ROCK;
		return countRocket;
	}
}

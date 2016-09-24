package cursor.edu.planeparts;

import java.util.Random;



import cursor.edu.constants.Constatable;

public class Shotgun implements Constatable {

	private int countBull;
	Random rand = new Random();
    
	
     
     public int generateBullets() {
		countBull = rand.nextInt(MAX_BULL - MIN_BULL) + MIN_BULL;
		return countBull;
	}
	
	public int getBulletCount()  {
		return countBull;
	}

}

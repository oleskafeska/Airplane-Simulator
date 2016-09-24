package cursor.edu.planeparts;

public class Target {
	public static final double MIN_DISTANCE = 500;
	public static final double MEDIUM_DISTANCE = 750;
	public static final double MAX_DISTANCE = 1000;
	public static final double MIN_ARMOR = 100;
	public static final double MEDIUM_ARMOR = 300;
	public static final double MAX_ARMOR = 500;
	private double distance;
	private String name;
	private double armor;
	private static Target instance;

	private Target() {
		buildTargetParam();
		buildName();

	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double d) {
		this.distance = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArmor() {
		return armor;
	}

	public void setArmor(double armor) {
		this.armor = armor;
	}

	public static Target getInstance() {
		if (instance == null) {
			instance = new Target();
		}
		return instance;
	}

	private void buildTargetParam() {
		setDistance(Math.random() * MAX_DISTANCE + MIN_DISTANCE);
		setArmor(Math.random() * MAX_ARMOR + MIN_ARMOR);
	}

	private void buildName() {
		 String[] targets = { "Old Jiguli", "Your School", "UFO" };

	        int length = targets.length;

	        for (int i = 0; i < length; i++)
			{
	            int rand = (int) (Math.random() * length);

	            setName(targets[rand]);
			}
	        

	            
	}
}

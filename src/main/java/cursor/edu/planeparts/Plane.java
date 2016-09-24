package cursor.edu.planeparts;

public abstract class Plane implements Flieble {

	private String name;
	private double weight; // ����
	private double width; // ������ �������
	private double length; // ����� �������
	private double punchingArmor;

	public double getPunchingArmor() {
		return punchingArmor;
	}

	public void setPunchingArmor(double punchingArmor) {
		this.punchingArmor = punchingArmor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Plane [name=" + name + ", weight=" + weight + ", width=" + width + ", length=" + length + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	@Override
	public void goToWest(double km) {
		System.out.println("You move to west for " + km + " km");

	}

	@Override
	public void goToEast(double km) {
		System.out.println("You move to east for " + km + " km");
		;
	}

	@Override
	public void goToNorth(double km) {
		System.out.println("You move to north for  " + km + "km");

	}

	@Override
	public void goToSouth(double km) {
		System.out.println("You move to south for " + km + "km");

	}

	public void buildName() {
		String[] planeNames = { "Rembo", "Angry Beaver", "El Barto" };

		int length = planeNames.length;

		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * length);

			setName(planeNames[rand]);

		}
		System.out.println("Your plane`s name is " + getName());
	}

}

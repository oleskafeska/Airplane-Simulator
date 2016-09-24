package cursor.edu.planeparts;

public interface Flieble {
	default public void sentMess() {
		System.out.println("Select direction:");
	}
	public void goToWest(double km);
	public void goToEast(double km);
	public void goToNorth(double km);
	public void goToSouth(double km);

}

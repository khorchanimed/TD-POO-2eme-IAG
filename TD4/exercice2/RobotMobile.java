package exercice2;

public class RobotMobile extends Robot implements IDeplacer, ITourner {

	private int distance;
	private String direction;
	private Position pos;

	public RobotMobile(String reference, int chargeMax, String direction, Position pos) {
		super(reference, chargeMax);
		this.distance = 0;
		this.direction = direction;
		this.pos = pos;
	}

	public String toString() {
		return super.toString() + ", distance=" + distance + ", direction=" + direction + ", pos=" + pos.toString();
	}

	public void tourner() {

		switch (direction) {

		case "Nord":
			direction = "Est";
			break;
		case "Est":
			direction = "Sud";
			break;
		case "Sud":
			direction = "Ouest";
			break;
		case "Ouest":
			direction = "Nord";
			break;
		}

	}

	public void avancer() {

		switch (direction) {

		case "Nord":
			pos.setY(pos.getY() + 1);
			distance++;
			break;
		case "Est":
			pos.setX(pos.getX() + 1);
			distance++;
			break;
		case "Sud":
			pos.setY(pos.getY() - 1);
			distance++;
			break;
		case "Ouest":
			pos.setX(pos.getX() - 1);
			distance++;
			break;

		}

	}

	public void reculer() {

		switch (direction) {

		case "Nord":
			pos.setY(pos.getY() - 1);
			distance++;
			break;
		case "Est":
			pos.setX(pos.getX() - 1);
			distance++;
			break;
		case "Sud":
			pos.setY(pos.getY() + 1);
			distance++;
			break;
		case "Ouest":
			pos.setX(pos.getX() + 1);
			distance++;
			break;
		}

	}

	public int calculEnergie() {

		return chargeMax * distance;
	}

}

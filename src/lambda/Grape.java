package lambda;

public class Grape {
	private int weight = 0;
	private String color = "";

	public Grape(int weight, String color) {
		this.weight = weight;
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Grape [weight=" + weight + ", color=" + color + "]";
	}

}

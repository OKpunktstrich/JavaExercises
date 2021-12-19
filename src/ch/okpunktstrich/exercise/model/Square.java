package ch.okpunktstrich.exercise.model;

public class Square extends Polygon {
	public Square() {
		super("Square", 4);
	}

	@Override
	public void render() {
		System.out.println("|----|");
		System.out.println("|    |");
		System.out.println("|----|");
	}
}

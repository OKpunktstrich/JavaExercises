package ch.okpunktstrich.exercise.model;

public class Triangle extends Polygon {

	public Triangle() {
		super("Triangle", 3);
	}

	@Override
	public void render() {
		System.out.println("  ^  ");
		System.out.println(" /_\\  ");
	}
	
}

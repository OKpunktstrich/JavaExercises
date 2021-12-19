package ch.okpunktstrich.exercise.model;

import ch.okpunktstrich.exercise.ViewRenderer;

public abstract class Polygon implements ViewRenderer {
	private final String name;
	private final double cornerCount;
	
	public Polygon(String name, double cornerCount) {
		this.name = name;
		this.cornerCount = cornerCount;
	}
	
	public String getName() {
		return name;
	}

	public double getCornerCount() {
		return cornerCount;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public void render() {
		System.out.println("You've selected a " + this.getName() + " which has " + this.getCornerCount() + " corners!");	
	}
}



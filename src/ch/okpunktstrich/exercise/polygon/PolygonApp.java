package ch.okpunktstrich.exercise.polygon;

import java.util.Scanner;

import ch.okpunktstrich.exercise.ViewRenderer;
import ch.okpunktstrich.exercise.model.Circle;
import ch.okpunktstrich.exercise.model.Polygon;
import ch.okpunktstrich.exercise.model.Square;
import ch.okpunktstrich.exercise.model.Triangle;

/**
 * This program renders polygon
 */
public class PolygonApp {

	public PolygonApp(Scanner scanner) {
		boolean runningProgram = true;
		while(runningProgram) {			
			System.out.println("How many corners do you want? Or select -1 to go back to main menu ");
			System.out.print("Input > ");
			double select = scanner.nextDouble();
			if(select > 0) {
				ViewRenderer renderer = getPolygonByCornerCountRenderer(select);
				renderer.render();
			} else if (select == -1) {
				runningProgram = false;
			} else {
				System.out.println("You cannot have minus corners!");
			}
		}
	}
	
	private ViewRenderer getPolygonByCornerCountRenderer(double cornerCount) {
		if(cornerCount == 3) {
			return new Triangle();
		}else if(cornerCount == 4) {
			return new Square();
		}else if(cornerCount > 100) {
			return new Circle();
		}
		
		return new Polygon("Polygon", cornerCount) {};
	}
}

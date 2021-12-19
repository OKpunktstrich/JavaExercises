package ch.okpunktstrich.exercise;

import java.util.Scanner;

import ch.okpunktstrich.exercise.polygon.PolygonApp;
import ch.okpunktstrich.exercise.reverse.ReverseApp;

public class ConsoleApp {
	private Scanner scanner = new Scanner(System.in);
	private boolean runtime = true;
	
	public ConsoleApp() {
		System.out.println("Square, Triangle, Circle Differencer [Programm Start]");

		while(runtime) {
			showMainMenu();
		}
		scanner.close();
		System.out.println("Program End");
	}
	
	private void showMainMenu() {
		System.out.print("Select Menu [1=Start, 2=reverse text, 0=Ende] > ");
		int select = scanner.nextInt();
		if(select == 1) {
			new PolygonApp(scanner);
		} else if (select == 2) {
			new ReverseApp(scanner);
		} else if (select == 0) {
			runtime = false;
		} else {
			System.out.println("Wrong Input!");
		}
	};
	
}

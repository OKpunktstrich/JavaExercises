package ch.okpunktstrich.exercise.reverse;

import java.util.Scanner;

import ch.okpunktstrich.exercise.utils.StringUtils;

/**
 * This app reverse text
 */
public class ReverseApp {

	public ReverseApp(Scanner scanner) {
		boolean runningProgram = true;
		while(runningProgram) {
			System.out.println("Type in your text, it will be reversed. Or type 0 to exit");
			System.out.print("Input > ");
			String input = scanner.next();
			
			if (input.equals("0")) {					
					runningProgram = false;
			} else {
				System.out.println(StringUtils.reverseString(input));
			}
		}
	}
}

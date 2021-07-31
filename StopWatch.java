package StopWatch;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Press any number to Start :");
		sc.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.print("Press any number to Stop :");
		sc.nextInt();
		sc.close();
		long endTime = System.currentTimeMillis();
		long timeElapsed = (endTime - startTime) / 1000;//calculating the elapsed time
		System.out.print("Time between two was in second: " + timeElapsed);
	}

}

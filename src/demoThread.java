
/*
 *  Program to check prime number by thread class and RUNNALE interface
 */
import java.util.Scanner;

//demoThread using Thread xlass
public class demoThread extends Thread {
	// counter
	int flag = 0;

	// override run method
	public void run() {
		// try and catch block to handle interrupt
		try {
			sleep(6000);
		} catch (InterruptedException e) {

		}
		// user input
		System.out.println("Enter the no to check whether prime or not by THREAD class");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		// logic for prime number
		for (int i = 2; i < a - 1; i++) {
			if (a % i == 0) {

				System.out.println(" ");
				System.out.println("no is not prime");
				flag++;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("number is  prime ");
		}
	}
}

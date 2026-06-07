import java.util.Scanner;

public class busfare{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	 System.out.print("Enter total no of stops in the bus  : ");
        int   n = sc.nextInt();
        int totalAmount = 0;

        for (int i = 1; i <= n; i++) {
	
            System.out.println("\n Passenger at the Stop  " + i);

            System.out.print("Enter boarding stop: ");
            int start = sc.nextInt();

            System.out.print("Enter destination stop: ");
            int end = sc.nextInt();

            int fare = (end - start) * 5;
            totalAmount += fare;

            System.out.println("Entered   Stop : " + start);
            System.out.println("Exit  Stop : " + end);
            System.out.println("Ticket Amount : Rs." + fare);
        }

        System.out.println("\nTotal Passengers in the bus  : " + n);
        System.out.println("Total Collection  : Rs." + totalAmount);
    }
}
import java.util.Scanner;

public class theaterbooking {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] theater = new int[50][10]; 
        boolean running = true;

 while (running) {
  System.out.println("\n--- Current Seating Plan (0 = Free, 1 = Booked) ---");

    for (int i = 0; i < 50; i++) {
    System.out.printf("%2d: ", i);
     for (int j = 0; j < 10; j++) {
      System.out.print(theater[i][j] + "  ");
      }
     System.out.println();
   }
     System.out.print("\nEnter Row number (0-49) to book: ");
    int row = sc.nextInt();
      System.out.print("Enter Column number (0-9) to book: ");
   int col = sc.nextInt();

    if (row < 0 || row > 49 || col < 0 || col > 9) {
   System.out.println("Invalid choice! Rows and columns must be between 0 and 49.");
  } else if (theater[row][col] == 1) {
  System.out.println("Sorry, this seat is already booked!");
   } else {
    theater[row][col] = 1;
  System.out.println("Seat successfully booked!");
    }

    System.out.print("\nDo you want to book another ticket? (1 for Yes, 0 for No): ");
   int choice = sc.nextInt();
  if (choice == 0) {
   running = false;
   }
  }
 
  System.out.println("Thank you for using the booking system!");
        
    }
}
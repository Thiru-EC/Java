import java.util.Scanner;

public class namepattern {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
   System.out.print("Enter name: ");
  String name = sc.nextLine().toUpperCase();
        
System.out.print("Enter size: ");
int size = sc.nextInt();
int mid = size / 2; 
System.out.println();
        
   for (int i = 0; i < size; i++) {
   for (char ch : name.toCharArray()) {
   for (int j = 0; j < size; j++) {
   boolean print = false;
                    
                    switch (ch) {
                        case 'A':
                            print = ((j == 0 || j == size - 1) && i > 0) || 
                                    (i == mid) || 
                                    (i == 0 && j > 0 && j < size - 1);
                            break;
                        case 'B':
                            print = (j == 0) || 
                                    ((i == 0 || i == mid || i == size - 1) && j < size - 1) || 
                                    (j == size - 1 && i != 0 && i != mid && i != size - 1);
                            break;
                        case 'C':
                            print = (j == 0 && i > 0 && i < size - 1) || 
                                    ((i == 0 || i == size - 1) && j > 0);
                            break;
                        case 'D':
                            print = (j == 0) || 
                                    ((i == 0 || i == size - 1) && j < size - 1) || 
                                    (j == size - 1 && i > 0 && i < size - 1);
                            break;
                        case 'E':
                            print = (j == 0) || (i == 0) || (i == mid) || (i == size - 1);
                            break;
                        case 'F':
                            print = (j == 0) || (i == 0) || (i == mid);
                            break;
                        case 'G':
                            print = (j == 0 && i > 0 && i < size - 1) || 
                                    ((i == 0 || i == size - 1) && j > 0) || 
                                    (i >= mid && j == size - 1) || 
                                    (i == mid && j >= mid);
                            break;
                        case 'H':
                            print = (j == 0) || (j == size - 1) || (i == mid);
                            break;
                        case 'I':
                            print = (i == 0) || (i == size - 1) || (j == mid);
                            break;
                        case 'J':
                            print = (i == 0) || (j == mid && i < size - 1) || 
                                    (i == size - 1 && j < mid && j > 0);
                            break;
                        case 'K':
                            print = (j == 0) || (i < mid && j == size - 1 - i) || 
                                    (i >= mid && j == i);
                            break;
                        case 'L':
                            print = (j == 0) || (i == size - 1);
                            break;
                        case 'M':
                            print = (j == 0) || (j == size - 1) || 
                                    (i <= mid && (j == i || j == size - 1 - i));
                            break;
                        case 'N':
                            print = (j == 0) || (j == size - 1) || (j == i);
                            break;
                        case 'O':
                            print = (j == 0 && i > 0 && i < size - 1) || 
                                    (j == size - 1 && i > 0 && i < size - 1) || 
                                    ((i == 0 || i == size - 1) && j > 0 && j < size - 1);
                            break;
                        case 'P':
                            print = (j == 0) || 
                                    ((i == 0 || i == mid) && j < size - 1) || 
                                    (j == size - 1 && i > 0 && i < mid);
                            break;
                        case 'Q':
                            print = ((j == 0 || j == size - 2) && i > 0 && i < size - 2) || 
                                    ((i == 0 || i == size - 2) && j > 0 && j < size - 2) || 
                                    (i >= mid && j == i);
                            break;
                        case 'R':
                            print = (j == 0) || 
                                    ((i == 0 || i == mid) && j < size - 1) || 
                                    (j == size - 1 && i > 0 && i < mid) || 
                                    (i > mid && j == i);
                            break;
                        case 'S':
                            print = (i == 0) || (i == mid) || (i == size - 1) || 
                                    (i < mid && j == 0) || (i > mid && j == size - 1);
                            break;
                        case 'T':
                            print = (i == 0) || (j == mid);
                            break;
                        case 'U':
                            print = ((j == 0 || j == size - 1) && i < size - 1) || 
                                    (i == size - 1 && j > 0 && j < size - 1);
                            break;
                        case 'V':
                            print = (i < mid && (j == 0 || j == size - 1)) || 
                                    (i >= mid && (j == i - mid || j == size - 1 - (i - mid)));
                            break;
                        case 'W':
                            print = (j == 0) || (j == size - 1) || 
                                    (i >= mid && (j == i || j == size - 1 - i));
                            break;
                        case 'X':
                            print = (j == i) || (j == size - 1 - i);
                            break;
                        case 'Y':
                            print = (i < mid && (j == i || j == size - 1 - i)) || 
                                    (i >= mid && j == mid);
                            break;
                        case 'Z':
                            print = (i == 0) || (i == size - 1) || (j == size - 1 - i);
                            break;
                        
                        default:
                            print = false;
                    }
   System.out.print(print ? "*" : " ");
   }
   System.out.print("  ");
   }
   System.out.println();
   }
  
    }
}
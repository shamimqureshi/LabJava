import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number of (1 to 7)to select a day of the week");
        int day = in.nextInt();
    

        //Switch Statment...

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thurstday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7");
        }
    
    
    }
}

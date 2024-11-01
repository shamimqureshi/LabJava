import java.util.Scanner;
public class EvenOdd {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a first number");
         int firstnum = in.nextInt();

    //if else  Statment 
 if(firstnum %2 == 0){
    System.out.println(firstnum  + " Is Even ");
 }else{
    System.out.println(firstnum + " Is Odd ");
 }

    }
}
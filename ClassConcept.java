import java.util.Scanner;

class Student{
    String Name;
    int Age;
    String Grade; 

    void displayDetails(){
        System.out.println("Student Details");
        System.out.println("Name"+ Name );
        System.out.println("Age" + Age);
        System.out.println("Grade" + Grade);
    }
}


//Main method
class classConcept{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter the name of the student:");
        student.Name = sc.nextLine();

        System.out.println("Enter student age:");
        student.Age = sc.nextInt();
        sc.nextLine(); // Clear the newline left after nextInt

        System.out.println("Enter student grade:");
        student.Grade = sc.nextLine();

        student.displayDetails(); // Object ke sath displayDetails() call kiya
    }
}
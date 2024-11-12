 class Student{
    public void printInfo(){
        System.out.println("Hello world");
    }
           Student(){
                  System.out.println("Construtor called");
           }
}
public class Constructor {
    public static void main(String[] args) {
      Student s1= new Student();
      s1.printInfo();
    }
}

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the input:");
        int rollno = input.nextInt();
        System.out.println("your rollno is " + rollno);

        // int a = 234_000_000;
        // System.out.println(a);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}

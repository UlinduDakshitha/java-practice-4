import java.util.Scanner;

public class TeacherDetails {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );

        Teacher[] teacher=new Teacher[3];

        for(int i=0;i<teacher.length;i++){

            System.out.print("Enter your Name:");
            String name=sc.next();

            System.out.print("Enter your age:");
            int age= sc.nextInt();

            System.out.print("Enter your salary");
            double salary=sc.nextDouble();


        }
    }
}

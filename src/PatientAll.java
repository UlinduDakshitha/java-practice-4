import java.util.Scanner;

public class PatientAll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       Patient patient[]=new Patient[0];

        for (int i=0;i< patient.length;i++){


            System.out.print("Enter your name:");
            String name= sc.next();

            System.out.print("Enter your age:");
            int age=sc.nextInt();

            System.out.print("Enter your address:");
            String address=sc.next();

            System.out.print("Enter your Status:");
            String status=sc.next();


        }

    }
}

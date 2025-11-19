import java.util.Scanner;

public class PatientAll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       Patient patient[]=new Patient[5];

        for (int i=0;i< patient.length;i++){


            System.out.print("Enter your name:");
            String name= sc.next();

            System.out.print("Enter your age:");
            int age=sc.nextInt();

            System.out.print("Enter your address:");
            String address=sc.next();

            System.out.print("Enter your Status:");
            String status=sc.next();

            Patient patient1=new Patient();
            patient1.setName(name);
            patient1.setAge(age);
            patient1.setAddress(address);
            patient1.setStatus(status);

            patient[i]=patient1;


        }
        for(Patient details:patient){
            details.getAllDetails();
        }

    }

}

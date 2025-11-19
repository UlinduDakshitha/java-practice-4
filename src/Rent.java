import java.util.Scanner;

public class Rent {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Vehicle[] vehicle=new Vehicle[4];

        System.out.print("Enter your vehicle type car ot van");
        String type= sc.next();

        switch (type){

            case "car":
                System.out.print("we have 3 cars enter your number choose");
                int type1= sc.nextInt();

                switch (type1){

                    case 1:
                        Car car=new Car();
                        car.setModel("Allion");
                        car.setColor("Red");
                        car.setTransmission("Automatic");
                        car.start(2);




                }
        }

    }
}

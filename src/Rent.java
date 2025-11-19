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
                        vehicle[0]=car;

                    case 2:
                        Car car1=new Car();
                        car1.setModel("Yaris");
                        car1.setColor("Gold");
                        car1.setTransmission("Manual");
                        car1.start("take");
                        vehicle[1]=car1;

                    case 3:
                        Car car2=new Car();
                        car2.setModel("Yaris");
                        car2.setColor("Blue");
                        car2.setTransmission("Manual");
                        car2.start(2.3);
                        vehicle[2]=car2;



                }
            case "Van":
                Van van=new Van();
                van.setModel("Delica");
                van.setColor("White");
                van.setTransmission("automatic");
                van.start();
                vehicle[3]=van;
        }

    }
}

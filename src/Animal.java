import java.util.Scanner;

public class Animal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;

        Animal2 animal2=new Animal2();
        Animal2 animal3=new Animal2("Bear",4,"Black");

       Animal2[] animal4=new Animal2[2];

       for (int i=0;i< animal4.length;i++){

           System.out.println("Enter the animal name:");
           String name1=sc.next();

           System.out.println("Enter the animal how many legs:");
           int legs= sc.nextInt();

           System.out.println("Enter the animal color:");
           String color=sc.next();

           Animal2 animal=new Animal2();
           animal.setName(name1);
           animal.setLegs(legs);
           animal.setColor(color);


       }


    }
}

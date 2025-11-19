public class Car extends Van{

    public void start(int x){
        System.out.print(getModel()+""+getColor()+""+getTransmission());
        System.out.print(getModel()+"is Started");
    }
    public void start(String b){
        System.out.print(getModel()+""+getColor()+""+getTransmission());
        System.out.print(getModel()+"is Started");
    }

    public void start(double x){
        System.out.print(getModel()+""+getColor()+""+getTransmission());
        System.out.print(getModel()+"is Started");
    }

}

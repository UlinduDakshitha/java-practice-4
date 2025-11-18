public class Engineer2 {

    public static void main(String[] args) {

        Engineer[] engineers={
                new Engineer("Mr.kamal","Civil Engineer",85000.00),
                new Engineer("Mr.Siridasa","Planning Engineer",80000.00),
                new Engineer("Mr.Sugathadasa","Electrical Engineer",95000.00),
                new Engineer("Mrs.Nayani","Planning Engineer",75000.00)

        };
for(Engineer engineer:engineers){

    engineer.getEngineerDetails();
}

    }
}

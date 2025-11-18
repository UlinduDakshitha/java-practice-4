public class Engineer {
     private String name;
     private String role;
     private double salary;

    public Engineer(String name, String role, double salary) {
        this.name=name;
        this.role=role;
        this.salary=salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
public void getEngineerDetails(){
    System.out.println(getName() );
    System.out.println(getRole());
    System.out.println(getSalary());
}

}

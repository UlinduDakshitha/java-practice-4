public class Patient {
private String name;
private int age;
private String address;
private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void getAllDetails(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getAddress());
        System.out.println(getStatus());
    }

}

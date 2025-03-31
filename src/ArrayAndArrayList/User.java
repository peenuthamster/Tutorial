package ArrayAndArrayList;

public class User {
    private String userID, fullName, address;
    private int age;

    public User(String userID, String fullName, String address, int age){
        this.userID = userID;
        this.fullName = fullName;
        this.address = address;
        this.age = age;
    }

    public void printDetails(){
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}

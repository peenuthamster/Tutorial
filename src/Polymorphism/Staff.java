package Polymorphism;

public class Staff extends Faculty {
    private String role;

    public Staff(String name, String facultyID, String role) {
        super(name, facultyID);
        this.role = role;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.print(", Role: " + role);
    }



}

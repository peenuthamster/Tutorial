package Polymorphism;

public class Faculty {
    private String name;
    private String facultyID;

    public Faculty(String name, String facultyID) {
        this.name = name;
        this.facultyID = facultyID;
    }

    public void displayInfo(){
        System.out.println(toString());
    }

    public void displayInfo(String department) {
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Faculty ID: " + facultyID;
    }
}


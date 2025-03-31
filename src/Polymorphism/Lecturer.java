package Polymorphism;

public class Lecturer extends Faculty{

    private String course;

    public Lecturer(String name, String facultyID, String course) {
        super(name, facultyID);
        this.course = course;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(", Course: " + this.course);
    }

}

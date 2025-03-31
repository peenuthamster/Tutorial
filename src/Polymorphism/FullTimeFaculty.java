package Polymorphism;

public class FullTimeFaculty extends Faculty {

    private double salary;

    public FullTimeFaculty(String name, String facultyID, double salary) {
        super(name, facultyID);
        this.salary =  salary;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.print(", Salary: " + salary);
    }

}

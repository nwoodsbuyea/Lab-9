package Student;


public class UndergraduateStudent extends Student{
    private int year;
    
    public UndergraduateStudent(int year, String studentID, String firstName, String lastName) {
        super(studentID, firstName, lastName);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}

package Student;


public class GraduateStudent extends Student{
    private String type;
    
    public GraduateStudent(String type, String studentID, String firstName, String lastName){
        super(studentID, firstName, lastName);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int numberOfStudent;
    private static final int MAX_REGISTERED_STU=10;
    List<Student>students=new ArrayList<Student>();

    public Course(String name,int numberOfStudent){
        this.name=name;
        this.numberOfStudent= numberOfStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name:'" + name + '\'' +
                ", numberOfStudent:" + numberOfStudent +
                '}';
    }

    public List<Student> getStudent(){
        return students;
    }
    public boolean isFull(Course course){
        if (course.getNumberOfStudent() == MAX_REGISTERED_STU){
            return true;
        }
        else
            return false;
    }
    public void registerStudent(Student student,Course course){
        if(course.isFull(course)==false){
            students.add(student);
        }
        else
            System.out.println(course.getName()+" is full, cannot add student");
    }


}

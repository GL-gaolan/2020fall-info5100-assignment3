import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int numberOfStudent;
    private static final int MAX_REGISTERED_STU=10;
    List students=new ArrayList();

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

    public List getStudent(){
        students.forEach(n->System.out.println(n));
        return students;
    }

    public boolean isFull(){
        if (getNumberOfStudent() == MAX_REGISTERED_STU){
            System.out.println(name +" is full.");
            return true;
        }
        else
            System.out.println(name +" is not full.");
            return false;
    }

    public void registerStudent(Student student){
        if(isFull()==false){
            if(students.contains(student)==false){
            students.add(student);}
            setNumberOfStudent(numberOfStudent+1);
            System.out.println(name+" add this student successfully!");
        }
        else
            System.out.println(name+" fails to add student.");
    }


}

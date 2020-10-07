
public class Test {
    public static void main(String[] args){
        //test class ReverseString
        ReverseString rs=new ReverseString();
        System.out.println(rs.reverse("Hello   this world!"));

        //test class Course and class Student
        Course course1= new Course("info5100",10);
        Course course2= new Course("Quantum Mechanics",5);
        //test isFull()
        course1.isFull( );
        course2.isFull( );

        //test registerStudent()
        Student stu1=new Student(1,"Bonnie");
        course1.registerStudent(stu1);
        System.out.println("Student number of "+course1.getName()+" is "+course1.getNumberOfStudent());
        course2.registerStudent(stu1);
        System.out.println("Student number of "+course2.getName()+" is "+course2.getNumberOfStudent());

        Student stu2=new Student(2,"Will");
        course1.registerStudent(stu1);
        System.out.println("Student number of "+course1.getName()+" is "+course1.getNumberOfStudent());
        course2.registerStudent(stu1);
        System.out.println("Student number of "+course2.getName()+" is "+course2.getNumberOfStudent());

        //test getStudent()
        course2.getStudent();



        Professor professor = new Professor.Builder("Emma", "Wang")
                .setId(1).build();
        System.out.println(professor.toString());


    }
}

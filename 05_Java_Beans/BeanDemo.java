public class BeanDemo {
    public static void main(String[] args) {
        StudentBean student = new StudentBean();
        
        // Setting properties
        student.setName("Sachin Sharma");
        student.setAge(21);
        
        // Getting properties
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}

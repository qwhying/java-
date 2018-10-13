package homework;
/**
 * Created by Qwhying on 2018/10/13
 */
public class main {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(1);
        q.dequeue();
        q.empty();
        q.getSize();
        Course c=new Course("discrete math");
        c.addStudent("hxf");
        String cn= c.getCourseName();
        c.getNumberOfStudents();
        c.getStudents();
        c.dropStudent("hxf");
        c.clear();
        System.out.println("HELLO WORLD");
    }
}

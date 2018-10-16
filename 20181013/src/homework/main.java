package homework;
/**
 * Created by Qwhying on 2018/10/13
 */
public class main {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.dequeue();
        boolean a=q.empty();
        if(a)System.out.println("empty");
        else System.out.println("not empty");
        System.out.println("The size is "+q.getSize()+" .");
        Course c=new Course("discrete math");
        c.addStudent("1");
        c.addStudent("2");
        String cn= c.getCourseName();
        System.out.println("The course's name is "+cn);
        System.out.println("There we have "+c.getNumberOfStudents()+" students in this course.");
        c.getStudents();
        c.dropStudent("1");
        System.out.println("There we have "+c.getNumberOfStudents()+" students in this course.");
        c.dropStudent("3");
        c.clear();
        System.out.println("There we have "+c.getNumberOfStudents()+" students in this course.");
    }
}

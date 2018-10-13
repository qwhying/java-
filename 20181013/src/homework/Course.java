package homework;

/**
 * Created by Qwhying on 2018/10/13
 */
public class Course {
    private String  courseName;
    private int size=100;
    private String[] students=new String[size];
    private int numberOfStudents;
    public Course(String courseName)
    {
        this.courseName=courseName;
    }
    public void addStudent(String student)
    {
        if(numberOfStudents>size){
            String[] temp=new String[size*2];
            students=temp;
            size*=2;
        }
        students[numberOfStudents]=student;
        numberOfStudents++;
    }
    public String[] getStudents()
    {
        return students;
    }
    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void dropStudent(String student)
    {
        for(int i=0;i<numberOfStudents;i++)
        {
            if(students[i].equals(student)) {
                for (int j = i + 1; j < numberOfStudents; j++)
                {
                    students[j - 1] = students[j];
                }
                students[numberOfStudents - 1] = "";
                numberOfStudents--;
            }
        }

    }
    public void clear(){
        for(int i=0;i<numberOfStudents;i++)
        {
            students[i]="";
        }
    }
}
/**
 * Created by Qwhying on 2018/11/9
 */
public class Course {
    private String courseName;//课程名称
    private String[] students;//存储该课程学生的数组
    private int numberOfStudents;//选择该课程的学生人数
    public Course(String courseName)
    {
        this.courseName=courseName;
        numberOfStudents=0;
        students=new String[numberOfStudents];
    }

    public String getCourseName() {
        return courseName;
    }
    public void addStudent(String student)
    {
        String[] temp=new String[numberOfStudents+1];
        for(int i=0;i<numberOfStudents;i++)
        {
            temp[i]=students[i];
        }
        temp[numberOfStudents]=student;
        students=temp;

    }
    public void dropStudent(String student)
    {
        String[] temp=new String[numberOfStudents-1];
        for(int i=0,j=0;i<numberOfStudents&&j<numberOfStudents-1;i++,j++)
        {
            if(students[i].equals(student))
            {
                j--;
            }
            else
            temp[j]=students[i];
        }

    }
    public String[] getStudents()
    {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}

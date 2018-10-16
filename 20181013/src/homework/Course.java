package homework;

/**
 * Created by Qwhying on 2018/10/13
 */
public class Course {
    private String  courseName;
    private int size=1;
    private String[] students=new String[size];
    private int numberOfStudents;
    public Course(String courseName)
    {
        this.courseName=courseName;
    }
    public void addStudent(String student)
    {
        if(numberOfStudents>=size){//判断学生人数是否超过了容量
            String[] temp=new String[size*2];
            System.arraycopy(students,0,temp,0,students.length);
            students=temp;
            size*=2;
        }
        students[numberOfStudents++]=student;
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
        boolean found=false;
        for(int i=0;i<numberOfStudents;i++)
        {
            if(students[i].equals(student)) {
                found=true;
                for (int j = i + 1; j < numberOfStudents; j++)
                {
                    students[j - 1] = students[j];
                }
                students[--numberOfStudents] = "";
            }
        }
        if(!found)
        {
            System.out.println("Can not find the student!");
        }

    }
    public void clear(){
        for(int i=0;i<numberOfStudents;i++)
        {
            students[i]="";
        }
        numberOfStudents=0;
    }
}
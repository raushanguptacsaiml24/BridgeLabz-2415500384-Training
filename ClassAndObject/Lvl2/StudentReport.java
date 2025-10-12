class Student{
    String name;
    int roll;
    double marks;

    public String grade(){
        if(marks>=90)
        {
            return "A";
        }
        else if (marks >= 75)
        {
            return "B";
        }
        else if(marks >= 50)
        {
            return "C";
        }
        else
        {
            return "Fail";
        }

    }

    public void displayInfo(){
        System.out.println("nmae of student " + name);
        System.out.println("roll number of student" + roll);
        System.out.println("marks of student"+ marks);
        System.out.println("grade of student is "+ this.grade());
    }
    Student(String name, int roll, double marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    
}



public class StudentReport{
    public static void main(String[] arge){
        Student s1 = new Student("arun",10,94);
        s1.displayInfo();
    }

}
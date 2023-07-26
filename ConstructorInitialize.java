/**
 * ConstructorInitialize
 */
public class ConstructorInitialize {

    public static void main(String[] args) {
        Student s1 = new Student("karan", 1056, 8.8) ;
        s1.displayProfile();
        double percentage = s1.findPercentage();
        System.out.println("Percentage of s1 is " + percentage);
    }
}

class Student {

    public int rollno;
    public String name;
    public double cgpa;

    public Student(String name, int rollno, double cgpa){
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
    }

    public void displayProfile(){
        System.out.println(rollno + " " + name + " " + cgpa);
    }

    public double findPercentage(){
        double percentage = cgpa * 10;
        return percentage;
    }

}
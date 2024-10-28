public class student {
    String studentName;
    int regNo;
    String course;
    public student(String studentName,int regNo,String course){
        this.studentName=studentName;
        this.regNo=regNo;
        this.course=course;
    }
    public void displayStudentInfo(){
        System.out.println("studentName="+ this.studentName);
        System.out.println("regNo"+ this.regNo);
        System.out.println("course"+ this.course);
    }

    public static void main(String[] args) {
        student student1 = new student("chithra",2619,"CS");
        student student2 = new student("shwetha",1627,"EC");
        student student3 = new student("Bhuvuksha",2536,"civil");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

    }
}

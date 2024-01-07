package InfyTrainingInstituteDB;

public class StudentDBApp {
    
    public static void main(String[] args){
        Student stud1 = new Student();
        Student stud2 = new Student();

        stud1.setStudentId("4596");
        stud1.setName("John Whedon");

        System.out.println(stud1.generateExamId());

        stud2.setStudentId("3412");
        stud2.setName("Ross Stark");
        System.out.println(stud2.generateExamId());

    }
}

package InfyTrainingInstituteDB;


public class Student {
    private String studentId;
    private String name;
    private String examId;


    public String getStudentId() {
        return studentId;
    }

    public void  setStudentId(String studentId){
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId){
        this.examId = examId;
    }

    public String generateExamId(){
        // Integer.parseInt(this.getStudentId());
        // return null;

        int studentIdInt   = Integer.parseInt(this.getStudentId());
        String[] nameParts = this.getName().split(" ");
        String examSlot    = String.valueOf(studentIdInt % 10);


        String firstThreeLetters = nameParts[0].substring(0 , Math.min(nameParts[0].length(), 3));
        String secondThreeLetter = nameParts[1].substring(0,Math.min(nameParts[1].length(), 3));

        this.setExamId(firstThreeLetters +"-" + secondThreeLetter + ":" + studentIdInt + "-" +examSlot);

        return this.getExamId();
    }
}
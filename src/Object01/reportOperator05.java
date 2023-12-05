package Object01;

public class reportOperator05 {
    private report05 student;
    public reportOperator05(report05 student){
        this.student = student;
    }
    public void printPass(){
        if(student.getScore() >= 60){
            System.out.println(student.getName() + "学生成绩及格");
        }else {
            System.out.println(student.getName() + "学生成绩不及格");
        }
    }

}

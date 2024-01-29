// package text13;
//13-3
public class Teacher implements Person {
    private String name;
    private String job;
    private String subject;

    public Teacher(String name, String job, String subject) {
        this.name=name;
        this.job=job;
        this.subject = subject;
    }
 
    @Override
    public void introduce() {
        System.out.println("氏名: " + this.name + "職業:" + this.job + "担当科目:" + this.subject);
    }
}

package text13;
//13-3
public class Cook implements Person {
    private String name;
    private String job;
    private String specialities;

    public Cook(String name, String job, String specialities) {
        this.name = name;
        this.job = job;
        this.specialities = specialities;
    }
    
    @Override
    public void introduce() {
        System.out.println("氏名: " + this.name + "職業:" + this.job + "得意料理:" + this.specialities);
    }
}

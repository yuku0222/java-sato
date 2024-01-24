class Student {
    private String name;
    private String studentNumber;
    private int japanese;
    private int math;
    private int english;

    public Student(String name, String studentNumber, int japanese, int math, int english) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.japanese = japanese;
        this.math = math;
        this.english = english;
    }

    public double calculateAverage() {
        return Math.round((japanese + math + english) / 3.0 * 100.0) / 100.0;
    }

    public int calculateTotal() {
        return japanese + math + english;
    }

    public String getStudentInfo() {
        return studentNumber + "番 " + name + " 平均点 " + calculateAverage();
    }
}
class Main {
    public static void main(String[] args) {
        Student studentA = new Student("Aさん", "001", 89, 65, 88);
        Student studentB = new Student("Bさん", "002", 80, 95, 64);
        Student studentC = new Student("Cさん", "003", 70, 80, 98);

        displayStudentInfo(studentA);
        displayStudentInfo(studentB);
        displayStudentInfo(studentC);
    }

    private static void displayStudentInfo(Student student) {
        System.out.println(student.getStudentInfo());
    }
}

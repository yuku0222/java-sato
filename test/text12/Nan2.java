// スーパークラス
class Person {
    String name;
    String job;
    //-------- コンストラクタ ------------
    public Person(String name,String job) {
        this.name = name;
        this.job = job;
    }
    //-----------------------------------
    public void introduce() {
        System.out.println("氏名: " + name + "職業:" + job);
    }
}

// Teacher クラス
class Teacher extends Person {
    String subject;
   //-------- コンストラクタ ------------
    public Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }
    //----------------------------------


    // Teacher クラスの introduce メソッド
    public void introduceAsTeacher() {
        System.out.println("氏名: " + name + "職業:" + job + "担当科目:" + subject);
    }
}

// Cook クラス
class Cook extends Person {
    String specialities;
    //-------- コンストラクタ ------------
    public Cook(String name, String job, String specialities) {
        super(name, job);
        this.specialities = specialities;
    }
    //----------------------------------


    // Cook クラスの introduce メソッド
    public void introduceAsCook() {
        System.out.println("氏名: " + name + "職業:" + job + "担当科目:" + specialities);
    }
}


// メインクラス
public class Nan2 {
    public static void main(String[] args) {
        // Teacher クラスのインスタンスを作成
        Teacher myTeacher = new Teacher("近藤勇\n","教員\n" ,"Go言語\n");

        // Cook クラスのインスタンスを作成
        Cook myCook = new Cook("沖田総司\n","シェフ\n", "オムライス\n");

        // インスタンスのメソッドを呼び出し
        myTeacher.introduceAsTeacher();

        myCook.introduceAsCook();
    }
}

package text13;

abstract class Person {
    String name;
    String job;
    //-------- コンストラクタ ------------
    public Person(String name,String job) {
        this.name = name;
        this.job = job;
    }
    //-----------------------------------
    public abstract void introduce(); 
      
    }


//<            サブクラス                >
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
    public void introduce() {
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
    public void introduce() {
        System.out.println("氏名: " + name + "職業:" + job + "得意料理:" + specialities);
    }
}

    //<                                         >



// メインクラス
class Keisyou {
    public static void main(String[] args) {
        // Teacher クラスのインスタンスを作成
        Teacher myTeacher = new Teacher("竹井一馬\n","教員\n" ,"情報処理\n");

        // Cook クラスのインスタンスを作成
        Cook myCook = new Cook("大原太郎\n","シェフ\n", "オムライス\n");
    
        myTeacher.introduce();

        myCook.introduce();
    }
}

package text13;
//13-3
class Main {
    public static void main(String[] args) {
        // Teacher クラスのインスタンスを作成
        Teacher myTeacher = new Teacher("竹井一馬\n","教員\n" ,"情報処理\n");

        // Cook クラスのインスタンスを作成
        Cook myCook = new Cook("大原太郎\n","シェフ\n", "オムライス\n");
    
        myTeacher.introduce();

        myCook.introduce();
    }
}

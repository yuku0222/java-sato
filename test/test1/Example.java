import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // Scanner オブジェクトを作成
        Scanner scanner = new Scanner(System.in);

        // ユーザーからの文字入力を受け取る
        System.out.print("文字の入力: ");
        String mozi = scanner.nextLine();

        // ユーザーからの数値入力を受け取る
        System.out.print("整数の入力: ");
        int sei = scanner.nextInt();

        // ユーザーからの文字入力を受け取る
        System.out.print("小数の入力: ");
        String syou = scanner.next();

        // Scanner を閉じる
        scanner.close();

        // 文字列を作成して表示
        String result = "入力された文字: " + mozi + "\n入力された整数: " + sei + "\n入力された小数: " + syou;
        System.out.println("\n作成した文字列:\n" + result);
    }
}

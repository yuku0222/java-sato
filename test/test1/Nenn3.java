import java.time.LocalDate;
import java.util.Scanner;

public class Nenn3 {
    public static void main(String[] args) {
        // Scanner オブジェクトを作成
        Scanner scanner = new Scanner(System.in);

        // ユーザーから年月日の入力を受け取る
        System.out.print("年を入力してください: ");
        int year = scanner.nextInt();

        System.out.print("月を入力してください: ");
        int month = scanner.nextInt();

        System.out.print("日を入力してください: ");
        int day = scanner.nextInt();

        // Scanner を閉じる
        scanner.close();

        // LocalDate オブジェクトを作成
        LocalDate date = LocalDate.of(year, month, day);

        // 文字列を作成して表示
        String result = "入力された日付: " + date.toString();
        System.out.println(result);
    }
}

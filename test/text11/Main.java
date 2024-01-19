import java.util.Scanner;
class MainProcess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // ユーザーが入力した半径の値を取得
        System.out.print("半径を入力してください: ");
        double radius = scanner.nextDouble();
 
        // Circle クラスのインスタンスを作成
        Circle circle = new Circle(radius);
 
        // 円周の長さと面積を計算
        double circumference = circle.calculateCircumference();
        double area = circle.calculateArea();
 
        // 結果を出力
        System.out.printf("円周の長さは %.3f です。\n", circumference);
        System.out.printf("円の面積は %.3f です。\n", area);
    }
}

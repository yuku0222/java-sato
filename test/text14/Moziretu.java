package text14;

import java.util.Scanner;

public class Moziretu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("文字列を入力：");
        String stdIn = scanner.nextLine();

        StringBuilder resultBuilder = new StringBuilder(stdIn);

        if (resultBuilder.length() >= 11) {
            resultBuilder.setLength(10);
        }

        System.out.println("結果文字列：" + resultBuilder.toString());
    }
}

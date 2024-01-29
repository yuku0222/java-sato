package text14;

import java.util.Scanner;

public class Ketugou {
    public static void main(String[] args) {


        String content1 = "東京都千代田区";
        String content2 = "神田神保町";


        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(content1);
        resultBuilder.append(content2);

        System.out.println(resultBuilder.toString());
    }
}

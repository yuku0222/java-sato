
    import java.util.Scanner; 
    class Circle {     
        final static double PI = 3.1415; 
        // 定数 PI     
        double radius; 
        // インスタンス変数     
        Circle(double radius) {         this.radius = radius;     }     double calculateCircumference() {        
        // 円周の長さを求めるメソッド        
        return 2 * PI * radius;     }     double calculateArea() {         
        // 円の面積を求めるメソッド        
        return PI * radius * radius;     } 
    }


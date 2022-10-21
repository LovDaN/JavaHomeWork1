import java.util.Scanner;

public class Piramida {
    public static void main(String[] args){
        System.out.println("ведите число");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        triangleNumber(num);
    }

    private static void triangleNumber(int n) {
        int result = (n * (n + 1)) / 2;
        System.out.println("Результат: " + result);
    }
}

import java.util.Scanner;

public class Quiz_02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a;

        System.out.printf("입력값 : ");
        a = s.nextInt();

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.printf("3의 배수와 5의 배수를 둘다 만족합니다. \n");

        }
    }
}

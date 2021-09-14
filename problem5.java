import java.util.Scanner;

public class problem5 {
        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            System.out.println("What is the first number? ");
            int ans = x.nextInt();
            System.out.println("What is the second number? ");
            int ans2 = x.nextInt();
            int add = ans + ans2;
            int subtract = ans - ans2;
            int multiply = ans * ans2;
            int divide = ans / ans2;
            System.out.println(ans + " + " + ans2 + " = " + add
                    + "\n" + ans + " - " + ans2 + " = " + subtract
                    + "\n" + ans + " * " + ans2 + " = " + multiply
                    + "\n" + ans + " / " + ans2 + " = " + divide);
        }

}

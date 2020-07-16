import java.util.Scanner;

public class Square_Area {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int number = Integer.parseInt(input);
        int result = number*number;
        System.out.println(result);
    }
}

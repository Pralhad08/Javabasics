import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = sc.next().toLowerCase();
            System.out.print(input);
        }
        sc.close();
    }
}

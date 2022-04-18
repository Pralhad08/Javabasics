import java.util.Scanner;

public class MixLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(true){
            System.out.println("Input: ");
            input = sc.nextLine().toLowerCase();
            if (input.equals("pass"))
            continue;
            if (input.equals("quit"))
            break;
            else
            System.out.println(input);
        }
        sc.close();
    }
}


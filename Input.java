import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("what's your age? ");
        //byte age = sc.nextByte();
       // System.out.println("you are " + age + " years old.");
        System.out.print("What's your name? ");
        String name = sc.nextLine().trim();
        System.out.println("your name is: " +name);
        sc.close();
    }
}

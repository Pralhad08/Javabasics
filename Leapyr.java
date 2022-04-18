import java.util.Scanner;

public class Leapyr {
    public static void main(String[] args) {
      boolean flag = false;
      Scanner  sc = new Scanner(System.in);
      System.out.print("Enter the year:: ");
      int yr = sc.nextInt();
      if(yr%4 ==0){
          if(yr%100 == 0){
              if(yr%400 ==0)
                  flag = true;
                  else
                    flag = false;
            }
            else
                flag = true;    
          }
          else
            flag = false; 
            
        if(flag== true){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("the year is not leap year");
        }
        sc.close();
    }
}


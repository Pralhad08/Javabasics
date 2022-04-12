public class Strings {
    public static void main(String[] ags) {
       String message = "hello hello ";
       String name = "hello \"humagain\"";
       String halo = "hello \n humagain";
       System.out.println(message);
       System.out.println(message.length()); 
       System.out.println(message.startsWith("H"));
       System.out.println(message.startsWith("h"));
       System.out.println(message.indexOf("h")); 
       System.out.println(message.replace("h", "e"));
       System.out.println(message.toUpperCase());
       System.out.println(name);
       System.out.println(halo);
    }
    
}

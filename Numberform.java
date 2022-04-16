import java.text.NumberFormat;
public class Numberform {
    public static void main(String[] args) {
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        //String result = currency.format(1234567.890);
        //NumberFormat percent = NumberFormat.getPercentInstance();
        //String result = percent.format(0.3);
        String result = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(result);
    }
}

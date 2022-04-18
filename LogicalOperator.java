public class LogicalOperator {
    public static void main(String[] args) {
      //int temperature = 12;
      //boolean isWarm = temperature > 20 && temperature < 30;// and operator if one exp is false then false
      //System.out.println(isWarm);  

      // or operator
      boolean hasHighIncome = false;
      boolean hasGoodCredit = true;
      boolean hasCriminalRecord = false;
      boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord ; //use of OR  And & not gate
      System.out.println(isEligible);
    }
}

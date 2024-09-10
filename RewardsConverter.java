import java.util.Scanner;


public class RewardsConverter {
    public static class RewardValue{
        int miles;
        double cash;
        public RewardValue(double cash){
            this.cash=cash;
        }
        public RewardValue(int miles){
            this.miles=miles;
        }
        double getCashValue(){
                return this.cash;
        }
        int getMilesValue(){
            double ans=0.0035*cash;
            this.miles+=(int)ans;
          return this.miles;
        }
        
    
    }
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
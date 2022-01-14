// Methods go here
import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum++;
            System.out.println(sum);
        }
        return sum;
    }

    public double getOrderTotal(double[] price){
        double sum = 0;
        for(double orderPrice: price) {
            sum += orderPrice;
        }
        return sum;
    }

    public void displayMenu (ArrayList<String>menu) {
        for (int i = 0; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i));
        }
    }

    public void addCustomer (ArrayList<String> people) {
        System.out.print("Please enter you name:");
        String userName = System.console().readLine();
        System.out.print("Hello " + userName);
        System.out.print(". There is " + people.size() + " customer(s) in front of you.\n");
        people.add(userName);
        System.out.println(people);

    }
}
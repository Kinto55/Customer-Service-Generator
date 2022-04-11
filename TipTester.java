
/**
 * I am currently class TipTester here for Ms W and hunter
 *
 * @author (Markintus Morris)
 * @version (3/28/21)
 */
import java.util.Scanner;
public class TipTester
{
    public static void main(String[] args)
    {
        //Scanner object for this file
        Scanner in = new Scanner(System.in);
        // i am advocating and printing the results
        System.out.println("Please enter the cost of your meal: ");
        double mealCost = in.nextDouble();
        //i am advocating and printing the results
        System.out.println("How satisfied were you? 1 for totally satisfied, 2 for satisfied, and 3 for less satisfied: ");
        int satisfaction = in.nextInt();
        //i am establishing and creating a new object for Tip using satisfaction
        Tip mytip = new Tip(satisfaction);
        //i am Calling calculateTip method
        mytip.calculateTip(mealCost);
        //i am Calling getTip and assigning it to a new variable
        double tip = mytip.getTip();
        //This isString variable
        String satisfactionLevel = " ";
        //if statements for the satisfaction level
        if (satisfaction == 1) 
            {
                satisfactionLevel = "Totally Satisfied";
            }
            else if (satisfaction == 2)
            {
                satisfactionLevel = "Satisfied";
            }
            else if (satisfaction == 3) 
            {
                satisfactionLevel = "Less Satisfied";
            }
        
        System.out.println("Satisfaction Level is: " + satisfactionLevel);
        //Creating a new value for totalMealCost
        double totalMealCost = mealCost  + tip;
        //Printing the base meal cost
        System.out.println("The cost of the meal was " + mealCost);
        //Printing the tip value
        System.out.println("The tip was: " + tip);
        //Printing the total meal cost
        System.out.println("The total cost of the meal was " + totalMealCost);
    }
}

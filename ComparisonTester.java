
/**
 * I am currently Testing my Comparison class for Ms W and hunter
 *
 * @author (Markintus Morris)
 * @version (3/28/21)
 */
import java.util.Scanner;
public class ComparisonTester
{
    public static void main(String[] args)
    {
        //Creating a Scanner object
        Scanner in = new Scanner(System.in);
        // Prompting and printing the results for the double values
        System.out.print("Please enter a double value for comparison: ");
        double dValue1 = in.nextDouble();
        System.out.print("Please enter another double to compare: ");
        double dValue2 = in.nextDouble();
        //Prompting and printing the results for the integer values
        System.out.print("Please enter an integer value for comparison: ");
        int iValue1 = in.nextInt();
        System.out.print("Please enter another integer value to compare: ");
        int iValue2 = in.nextInt();
        // Prompting and printing the results for the string values
        in.nextLine(); //throwing away the \n not consumed by nextInt()
        System.out.print("Please enter a string value for comparison: ");
        String sValue1 = in.nextLine();
        System.out.print("Please enter another string value to compare: ");
        String sValue2 = in.nextLine();
        //Create a comparisons object
        Comparison comp = new Comparison();
        // Creating a boolean variable
        boolean areTheyEqual;
        //Calling the compFloat2 and assign it to are they equal
        areTheyEqual = comp.compFloat2(dValue1, dValue2);
        System.out.println("The two doubles are equal up to two decimal points: " + areTheyEqual);
        //Calling the compFloat5 and assign it to are they equal
        areTheyEqual = comp.compFloat5(dValue1, dValue2);
        System.out.println("The two doubles are equal up to five decimal points: " + areTheyEqual);
        //Calling the compInt method and assigning it to a variable
        areTheyEqual = comp.compInt(iValue1, iValue2);
        System.out.println("The two integers are equal: " + areTheyEqual);
        //Calling the stringEqual method and assigning it to a variable
        areTheyEqual = comp.stringEqual(sValue1, sValue2);
        System.out.println("The string values are equal: " + areTheyEqual);
        //Calling the stringEqualNoCase method and assigning it to a variable
        areTheyEqual = comp.stringEqualNoCase(sValue1, sValue2);
        System.out.println("The string values are equal (excluding case): " + areTheyEqual);
        //Calling the stringCompare method and assigning it to a variable
        areTheyEqual = comp.stringCompare(sValue1, sValue2);
    }
}

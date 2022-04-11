
/**
 * I am creating a class Tip here for Ms W and hunter
 *
 * @author (Markintus Morris)
 * @version (3/28/21)
 */
public class Tip
{
    //the instance variables - must replace the example 
    private int satisfactionRating;
    private double tip;

    /**
     * Constructor for objects of class Tip
     */
    public Tip(int sr)
    {
        // initialise instance variables
        satisfactionRating = sr;
        double tip = 0;
    }

    /**
     * calculating the tip based off of satisfaction
     *
     * @param   meal cost
     * @return    none
     */
    public void calculateTip(double mealCost)
    {
        // implimenting your code here whcih is madatory 
        if (satisfactionRating == 1)
        {
            tip = mealCost * .20;
        }
        else if (satisfactionRating == 2)
        {
            tip = mealCost * .15;
        }
        else if(satisfactionRating == 3)
        {
            tip = mealCost * .10;
        }
    }
    
    /**
     * Method to return the tip
     * 
     * param none
     * return  tip
     */
    public double getTip()
    {
        return tip;
    }  
}

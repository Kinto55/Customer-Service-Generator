
/**
 * Comparing numbers for Ms W and hunter
 *
 * @author (Markintus Morris)
 * @version (3/28/21)
 */
public class Comparison
{
    /**
     * Taking two doubles to test if they are close enough to two decimal places.
     * 
     * @param double value1 and double value2
     * @return Boolean
     */
    public boolean compFloat2(double value1, double value2)
    {
        final double closeEnough = 1E-2;
        return (Math.abs(value1 - value2) < closeEnough);
    }
    
    /**
     * Taking two doubles to determine how close they get to 5 decimal places.
     * 
     * @param double value1 and double value2
     * @return Boolean
     */
    public boolean compFloat5(double value1, double value2)
    {
        final double closeEnough = 1E-5;
        return (Math.abs(value1 - value2) < closeEnough);
    }
    
    /**
     * Taking two integers to test if they are equal to each other.
     * 
     * @param String value1 and String value2
     * @return Boolean
     */
    public boolean compInt(int value1, int value2)
    {
        return (value1 == value2);
    }
    
    /**
     * Taking two string values to test if they are equal to each other.
     * 
     * @param String value1 and String value2
     * @return 
     */
    public boolean stringEqual(String value1, String value2)
    {
        return value1.equals(value2);
    }
    
    /**
     * Taking two string variables and comparing if they are equal ignoring the case
     * 
     * @param String value1 and String value2
     * @return 
     */
    public boolean stringEqualNoCase(String value1, String value2)
    {
        return value1.equalsIgnoreCase(value2);
    }
    
    /**
     * Taking two string variables and comparing if value1 is larger than value2
     * 
     * @param String value1 and String value2
     * @return 
     */
    public boolean stringCompare(String value1, String value2)
    {
        return value1.compareTo(value2) < 0;
    }
}
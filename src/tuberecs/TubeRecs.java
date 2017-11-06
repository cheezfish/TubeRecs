package tuberecs;

import java.util.Scanner;
//Scanner takes input, importing it here

/**
 * @author Imran Aziz 17:03 5th Oct 2017
 */

public class TubeRecs {
            
    public static void main(String[] args) 
    {
        
        recs(); //displays output based on scanner input
        
    }
   
    public static void recs()
    {
        
        Station s1 = new Station(); //declaring each of my stations in the specified format
        s1.name = "St Pauls";
        s1.zone = 3;
        s1.accessibility = true;
        
        Station s2 = new Station();
        s2.name = "Bank";
        s2.zone = 2;
        s2.accessibility = true;
        
        Station s3 = new Station();
        s3.name = "Liverpool Street";
        s3.zone = 2;
        s3.accessibility = true;
        
        Station s4 = new Station();
        s4.name = "Bethnal Green";
        s4.zone = 2;
        s4.accessibility = true;
        
        Station s5 = new Station();
        s5.name = "Mile End";
        s5.zone = 2;
        s5.accessibility = true;
       
        Station s6 = new Station();
        s6.name = "Stratford";
        s6.zone = 2;
        s6.accessibility = true;
        
        output(s1, s2, s3, s4, s5, s6);
    }
    
    public static void output(Station s1, Station s2, Station s3, Station s4, Station s5, Station s6) 
    {
        
        System.out.println("Please choose a station");
        Scanner train = new Scanner(System.in);
        String choose = train.nextLine();
        
        if (choose.equalsIgnoreCase("St Pauls")) //if else statements dictate output, use records. 
        {
            System.out.println(s1.name);
            System.out.println("zone: " + s1.zone);
            System.out.println("Disabled access: " + wheelchairboolean(s1.accessibility));
        }
        
        else if (choose.equalsIgnoreCase("Bank"))
        {
            System.out.println(s2.name);
            System.out.println("zone: " + s2.zone);
            System.out.println("Disabled access: " + wheelchairboolean(s2.accessibility));
        }
        
        else if (choose.equalsIgnoreCase("Liverpool Street"))
        {
            System.out.println(s3.name);
            System.out.println("zone: " + s3.zone);
            System.out.println("Disabled access: " + wheelchairboolean(s3.accessibility));
        }
        
        else if (choose.equalsIgnoreCase("Bethnal Green"))
        {
            System.out.println(s4.name);
            System.out.println("zone: " + s4.zone);
            System.out.println("Disabled access: " + wheelchairboolean(s4.accessibility));
        }
        
        else if (choose.equalsIgnoreCase("Mile End"))
        {
            System.out.println(s5.name);
            System.out.println("zone: " + s5.zone);
            System.out.println("Disabled access: " + wheelchairboolean(s5.accessibility));
        }
        
        else if (choose.equalsIgnoreCase("Stratford"))
        {
            System.out.println(s6.name);
            System.out.println("zone: " + s6.zone);
            System.out.println("Disabled access: " + wheelchairboolean(s6.accessibility));
            System.out.println("");
        }
        
        else 
        {
            System.out.println("Please try again, the following issues may have occured:");
            System.out.println("The station you entered is not in our database");
            System.out.println("You mistyped the name");
            System.out.println("");
            output(s1, s2, s3, s4, s5, s6);
        }
        
    }
    
    public static String wheelchairboolean(boolean access) 
    {
        //converts booleans to strings
        String option;
        if (access == true) {
            option = " yes ";
        }
        else {
            option = " no ";
        }
        return option;
        
    }
}

class Station //declares the record, and parts of it
{
    String name; 
    int zone;
    boolean accessibility;
}
    

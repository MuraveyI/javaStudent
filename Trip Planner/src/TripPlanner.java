//     _____     _         ____  _
//    |_   _| __(_)_ __   |  _ \| | __ _ _ __  _ __   ___ _ __
//      | || '__| | '_ \  | |_) | |/ _` | '_ \| '_ \ / _ \ '__|
//      | || |  | | |_) | |  __/| | (_| | | | | | | |  __/ |
//      |_||_|  |_| .__/  |_|   |_|\__,_|_| |_|_| |_|\___|_|
//                |_|

/* Instructions *********************************************************************
 *                                                                                  *
 *  First, you’ll want to greet your user and ask them their name. As you can       *
 *    see above the user types their response ON THE SAME LINE as the question.     *
 *    To do this you’ll want to use a print() statement. Once you have their        *
 *    name use it to greet your user, and then ask them where they would like       *
 *    to go. Finally, tell your user, their destination sounds like a great trip!   *
 *    All the code to accomplish Part 1 should be in its own method.                *
 *                                                                                  *
 *  HINT: Some names and destinations are more than 1 word! Plan accordingly.       *
 *                                                                                  *
 *  def greetingPerson():                                                           *
 *      ''' None -> None                                                            *
 *      First you’ll want to greet your user and ask them their name.               *
 *      Once you have their name use it to greet your user, and then ask them       *
 *      where they would like to go. Finally tell you user their destination        *
 *      sounds like a great trip! All the code to accomplish Part 1 should be       *
 *      in its own method.                                                          *
 *      '''                                                                         *
 *      # write your code here                                                      *
 *                                                                                  *
 *  Sample output:                                                                  *
 *    student@lab4:~$                                                               *
 *    Welcome to Vacation Planner!                                                  *
 *    What is your name: Ernest Hemingway                                           *
 *    Nice to meet you Ernest Hemingway, where are you traveling to? Rome           *
 *    Great! Rome sounds like a great trip                                          *
 *    ***********                                                                   *
 *                                                                                  *
 ************************************************************************************/

import java.util.Scanner;

public class TripPlanner
{
    public static void main(String[] args)
    {
        // Part 1: Greeting
        greeting();

        // Part 2: Travel Time and Budget
        // travelTimeBudget();

        // Part 3: Time difference
        // timeDifference();

        // Part 4: Country Area
        // countryArea();
    }

    public static void greeting()
    {
        Scanner input = new Scanner( System.in );
        String travellerName ;
        String travelLocation ;

        System.out.print( "Welcome to Vacation Planner!\n" );
        System.out.print( "What is your name: " );  travellerName = input.next();
        System.out.print( "Nice to meet you " + travellerName + ", where are you traveling to? " );  travelLocation = input.next();
        System.out.print( "Great! " + travelLocation + " sounds like a great trip\n" );
        System.out.print( "***********" );
    }

    private static void travelTimeBudget()
    {
        // write your code here

    }

    public static void timeDifference()
    {
        // write your code here
    }

    public static void countryArea()
    {
        // write your code here
    }
}

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner( System.in );

        int arraySize = input.nextInt();                        // Learn arraySize
        int[] numberArray = new int[ arraySize ];               //
        for ( int index = 0 ; index < arraySize ; index++ )     //  // Learn arrayElements
        {                                                       //  //
            numberArray[index] = input.nextInt();               //  //
        }                                                       //  //

        int span = 1;

        for ( int index = 0 ; index < arraySize ; index++ )                                     // For all the elements in numberArray
        {                                                                                       //
            int reappearingNumberIndex = index ;                                                //
                                                                                                //
            for ( int innerIndex = index ; innerIndex < arraySize ; innerIndex++ )              //
            {                                                                                   //
                if ( numberArray[ reappearingNumberIndex ] == numberArray[ innerIndex ] )       //  // If element reappears
                {                                                                               //  //
                    if ( (innerIndex - reappearingNumberIndex) > span )                         //  //  // and if span between reappearing elements is larger than before
                    {                                                                           //  //  //
                        span = innerIndex - reappearingNumberIndex;                             //  //  //  // update span
                    }                                                                           //  //  //
                }                                                                               //  //
            }                                                                                   //
        }                                                                                       //

        System.out.print( span + 1 );

    }
}

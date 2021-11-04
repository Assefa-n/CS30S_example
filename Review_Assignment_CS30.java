import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Naga Assefa
 *  Class:          CS30S
 * 
 *  Assignment:     Review Assignment
 * 
 *  Description:    This Program will convert biinary numbers from a file into decimal numbers
 * 
 *************************************************************/

public class Review_Assignment_CS30 {

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string for keyboard and file input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        int base = 2;                     //  the 2 in the conversion equation x * 2^y
        int exponent = 0;                 // the calculation of the power of to in x * 2^y 
        int Multipacation = 0;           // the calculation of the multpication in this equation x * 2^y 
        int RT = 0;                 // the sum of the numbers convert every time the bianary numbers go through a for loop
        int y = 0;                  // the exponent of the number two in x * 2^y 
        int x = 0;                  // the number being multplied by 2 to the power of a number in this ecuation x * 2^y 
        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // ***** objects *****

        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        BufferedReader fin = new BufferedReader(new FileReader("binData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("Decimal Output.txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Naga Assefa" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Review Assignment" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        fout.print(banner);

        // ***** Main Processing *****
        //pre loop procceing
        // Prime the Loop
        strin = fin.readLine();      // It reads the a line in the input data file

        //Eof loop

        while(strin != null) {
            // set total to 0
            x = 0;                         // the number being multplied by 2 to the power of a number in this ecuation x * 2^y
            y = 0;                         // the power of the number two in x * 2^y
            RT = 0;                        // the sum of the numbers convert every time the bianary numbers go through a for loop 
            exponent= 0;                   // the calculation of the power of to in x * 2^y 
            Multipacation = 0;             // the calculation of the multpication in this equation x * 2^y
            //parse input
            for(int i = strin.length()-1; i >= 0; i--) {
                //parse input

                //magnatude of x
                x = Integer.parseInt(strin.valueOf(strin.charAt(i))); 

                //calculate the base 2 digit base 10 eqivilent
                exponent= (int) Math.pow(base,y);
                Multipacation = exponent * x;

                //keep running total
                RT = RT + Multipacation;

                // update the exponent for the dext digit
                y = y+1;
            } //end of for loop

            //output
            strout = String.format( "%6s %9s %s %6s %7d %s %s","Bianary number = ", strin, nl, "Decimal number = ", RT, nl, nl);
            System.out.print(strout);
            fout.print(strout);

            // update control variable
            strin = fin.readLine();
        }//end of eof loop

        // ***** Print Formatted Output *****

        // ***** Closing Message *****
        System.out.println(nl+"end of processing");

        fout.println("end of processing");

        // **** close io buffers *****

        fin.close();
        fout.close();
    } // end main 

} // end FormatTemplate

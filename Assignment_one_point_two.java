import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Naga Assefa
 *  Class:          CS30S
 * 
 *  Assignment:     Assignment 1.2
 * 
 *  Description:    This program will calulate the grades of a class of up 30 students.
 * 
 *************************************************************/

public class Assignment_one_point_two {

    public static void main(String[] args) throws IOException{
        // ***** constants *******
        final int Max = 30;              // the maximum nuber of values in an array
        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[  ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // parellel arrays for calculating the grades
        String[] names = new String[Max];       //the array of the names of the student
        int[] ID = new int[Max];                //the array of for the id of the student
        int[] A1 = new int[Max];                //the array of fist assignment
        int[] A2 = new int[Max];                //the array of second assignment
        int[] A3 = new int[Max];                //the array of thired assignment
        double[] Grades = new double [Max];

        int n = 0;                       // actual number of values inside of the parrallel arrays
        double grades = 0.0;             // the calculation of the grades of the assignments

        BufferedReader fin = null;       // reads in the file 

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // ***** objects *****

        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files
        try{
            fin = new BufferedReader(new FileReader("studentData.txt"));
        }//end try
        catch(FileNotFoundException e) {
            System.out.println(" file name error");
        }//end catch
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter(".txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Naga Assefa" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1.2" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** Get Input *****
        //pre loop prossesing 
        n = 0;

        strin = fin.readLine();
               
         while( strin != null){
            // split the string
            tokens = strin.split(delim);
            
            // parellel arrays
            names[n] = tokens[0];
            ID[n] = Integer.parseInt(tokens[1]);
            A1[n] = Integer.parseInt(tokens[2]);
            A2[n] = Integer.parseInt(tokens[3]);
            A3[n] = Integer.parseInt(tokens[4]);

            // // calculations for the grade
            grades= (A1[n] + A2[n] + A3[n])/ 3;   
            Grades[n] = grades;
            
            // // update the counter
            n++;    
            
            // // update the input
             strin = fin.readLine();
         }// end while

          
        for(int i= 0; i < n; i++){
            if(i == 0){
             strout = String.format("Name"+ "ID" + "A1"+ "A2" +"A3"+"Grade\n"); 
           }
                              
            strout += String.format("14s",names[i]);
            strout += String.format("14d", ID[i] );
            strout += String.format(A1[i] + "\t");
            strout += String.format(A2[i] + "\t");
            strout += String.format(A3[i]+ "\t");   
            strout += String.format(Grades[i]+nl );
        
        }        

        // // ***** Main Processing *****

        // // ***** Print Formatted Output *****

        // // ***** Closing Message *****

         System.out.println();
         System.out.println("end of processing");
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 
} // end FormatTemplate

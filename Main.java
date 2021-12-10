import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
/********************************************************************
 * Programmer:      Naga Assefa
 * Class:           CS30S
 *
 * Assignment:      OOP Lab 1 Driver
 *
 * Description:     add your code as directed by the instructions and
 *                  the comments to complete the 
 *                  driver code for this lab. Note that you will also 
 *                  have to write the class code for the Product class
 ***********************************************************************/
  public class Main{
    public static void main(String[] args){
// ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
        ArrayList<Product> snacks = new ArrayList<>();
        
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Circle OOP Example" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
    // ***** Main Processing *****
        // Product variables
        Product snack1 = new Product("Chocolate", 1.75);  // the first snack chocolate
        Product snack2 = new Product("Chips", 1.89);      // the second snack chips
        Product snack3 = new Product("Banana", 0.95);     // the thired snack banana 
        Product snack4 = new Product("Cookie", 0.75);     // the thired snack banana 
        Product snack5= new Product(); //the  fourth snack which is sent from the first constructor
        Product snack6 = new Product("fish sticks", 2.15);     // the thired snack banana 
        Product snack7 = new Product("Jelly beans", 0.25);     // the thired snack banana 
        
        // list-array loading
        snacks.add(snack1);
        snacks.add(snack2);
        snacks.add(snack3);
        snacks.add(snack4);
        snacks.add(snack5);
        snacks.add(snack6);
        snacks.add(snack7);
        
        //print snack details
        System.out.println("----------Menu-----------");
        for(Product s:snacks){
            System.out.println(s);
        }//end for each loop
        
        snack4.setNam("Oreo Cookie");
        snack2.setPri(1.05);
        snack5.setNam("susi");
        snack5.setPri(2.45);
        System.out.println(nl+"the fourth menu item: "+snack4.getNam());
        System.out.println("the price of menue item 2: $"+snack2.getPri()+nl);
        
        System.out.println("----------Menu-----------");
        for(Product s:snacks){
            System.out.println(s);
        } // end for each loop
        System.out.println("We are soory for our mistake fish sticks will be removed");
        snacks.remove(5);
    
        System.out.println("----------Menu-----------");
        for(Product s:snacks){
            System.out.println(s);
        } // end for each loop
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
        // create some Product objecrs
    }
}

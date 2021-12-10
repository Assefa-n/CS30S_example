/********************************************************************
 * Programmer:      your name here
 * Class:           CS30S
 *
 * Assignment:      OOP Lab 1 Product Class
 *
 * Description:     add you code as directed by the comments and the 
 *                  instructions
 ***********************************************************************/
public class Product{
    // fields
    private String name;  // name of product
    private double price; // price of product

    // add your code here
    // constructors
     public Product(){
      name = "Unknown"; // the name of product in the main that can be set
      price = 0.0;      // the proce of product in the main that can be set
    }// end no-arg constructor

     public Product(String na, double pr){
      this.name = na;  // the name of the product based on the name of                        the product in the main class

      this.price = pr;// the price of the product based on the price of                      the product in the main class
    }// end full-arg constructor
    
    // getters
    /*****************************************
    * Description: get product name
    * 
    * Interface:
    
    * @return      String: name of product
    * ****************************************/
    public String getNam(){
      return this.name;
    }//end getNam()
    
    /*****************************************
    * Description: get product price
    * 
    * Interface:
    
    * @return      Double: price of product
    * ****************************************/
    public Double getPri(){
      return this.price;
    }//end getPri()
    
    // setters
    /*****************************************
    * Description: set product name to new name
    * 
    * Interface:
    * 
    * @param        String: new name for product
    * 
    * ****************************************/
    public void  setNam(String n){
      this.name = n;
    }//end setNam()
    
    /*****************************************
    * Description: set price to new value
    * 
    * Interface:
    * 
    * @param        double: new price for product
    * 
    * ****************************************/
    public void  setPri(double p){
      this.price = p;
    }// end setPri()
    
    //*****Others******
  
    
    /*****************************************
    * Description: override toString
    * 
    * Interface:
    * 
    * 
    * @return               String: product name and proce state
    * ****************************************/
    // other methods
    @Override
  public String toString(){
      
        StringBuilder St = new StringBuilder();
        
        St.append(String.format(this.getNam()));
        St.append(String.format( " $" + this.getPri()));
            
        return St.toString();
    }
}// end of class

package orangeInc;

//Amina Hussain
//ITSS 3311.501 - Project 4

public class OrangeInc {
	
	/*Revenue in 2020 and projected revenue in 2025:
	  The revenue in 2020 is $717000.0
      The projected revenue in 2025 is $830450.0
	 */

	public static void main(String[] args) {
      // TODO Auto-generated method stub
      //arrays 
      //array (i)
        int [] productPrice =  {1300, 350, 900, 3000, 250};
      //array (ii)
        int [] productSales2020 = {100, 150, 180, 120, 50};
      //array (iii)
        double [] productRevenue2020 = new double [5];
      //growth rate
        double [] projRate = {2.25, 3.5, 1, 4.2, 0.5};     
                
      //total revenue in 2020
        //variable to store total revenue of 2020
        double totalRevenue2020 = 0;
        //for loop to compute revenue for each product
        for(int i = 0; i < 5; i++) {
        	//store revenue in array 
        	productRevenue2020[i] = productPrice[i] * productSales2020[i];
        	//summed elements to calculate total revenue
        	totalRevenue2020 += productRevenue2020[i];
        } //end for loop
        //prints total revenue for 2020
        System.out.println("The revenue in 2020 is $" + totalRevenue2020);
        
      //call method
	      int [] productSales2025 = ProjSales(productSales2020, projRate, 5);
	    //array for 2025 revenue
	      double [] productRevenue2025 = new double [5];
	    //total revenue in 2025 
	      double totalRevenue2025 = 0;
	    //for loop to compute revenue for each product
	      for(int i = 0; i < 5; i++) {
	    	  //stores revenue in array
	    	  productRevenue2025[i] = productPrice[i] * productSales2025[i];
	    	  ///summed elements to calculate total revenue 
	    	  totalRevenue2025 += productRevenue2025[i];
	      } //end for loop
	      //prints projected revenue for 2025
	      System.out.println("The projected revenue in 2025 is $" + totalRevenue2025);
	} //end method
       
       //new method for projected sales in 2025
	    public static int [] ProjSales(int productSales2020[], double projRate[], int numYears) {
	    	//array for 2025 product sales
	        int [] productSales2025 = new int [5];
	        //for loop to compute projected sales
        	for(int i = 0; i < 5; i++) {
            //calculation for projected sales
            productSales2025[i] = (int) ((productSales2020[i]) * (Math.pow((1 + projRate[i]/100), numYears)));
        } //end for loop
        //return projected sales of 2025 array
        return productSales2025; 
        } //end method
	      
	}




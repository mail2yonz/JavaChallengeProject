/*
Yonatan Mengesha
october 2017

First java challenge


*/
import java.util.Scanner;

public class JavaChallenge {

    //This is the main method where the user inserts the record
    public static void main(String[] args)
    {

        int customer_Id;
        String customer_Name,tax_Code;
        double sales_Amount,discount=0.00,total_Amount,tax_Amount=0.00;

        // Creates a Scanner object called keyboard
        Scanner keyboard = new Scanner(System.in);

      do{
          System.out.println("Enter Customer's ID: ");
          customer_Id=keyboard.nextInt();

          System.out.println("Enter Customer's Name: ");
          keyboard = new Scanner(System.in);
          customer_Name=keyboard.nextLine ();


          // Askes a user to enter tax code  and accepts from the input from keyboard

          System.out.println("Enter Customer's TaxCode:(BIZ,NPF,NRM) ");
          keyboard = new Scanner(System.in);
          tax_Code=keyboard.nextLine ();




          // checks what kind of tax code it is and assignes a tax amount

          if(tax_Code.equalsIgnoreCase (  "NRM"))
          {
              tax_Amount=0.06;
          }else if (tax_Code.equalsIgnoreCase ( "NPF" ))
          {
              tax_Amount=0.00;
          } else if (tax_Code.equalsIgnoreCase ( "BIZ" ))
          {
              tax_Amount=0.045;
          } else {
              System.out.println("Please Enter Customer's TaxCode Correct next time!:(BIZ,NPF,NRM)  ");

          }






          // Askes a user to enter sales amount and accepts from the input from keyboard
          System.out.println("Enter Customer's SalesAmount: ");
          keyboard = new Scanner(System.in);
          sales_Amount=keyboard.nextDouble();





          //This determines the discount amount
          if(sales_Amount>15000)
          {
             discount=0.03;

          } else if (sales_Amount >10000)
          {
              discount=0.02;

          } else if(sales_Amount>5000)
          {
              discount=0.01;

          }




          //Applying a Discount

          if(sales_Amount>15000)
          {
              discount=.03;
              sales_Amount=sales_Amount-(sales_Amount*discount);
              //System.out.println(sales_Amount);
          } else if (sales_Amount >10000)
          {
              discount=.02;
              sales_Amount=sales_Amount-(sales_Amount*discount);
              //System.out.println(sales_Amount);
          } else if(sales_Amount>5000)
          {
              discount=.01;
              sales_Amount=sales_Amount-(sales_Amount*discount);
             // System.out.println(sales_Amount);
          }

          //calculates the total amount
          total_Amount=sales_Amount + sales_Amount*tax_Amount;

          //Displayes the Record
          displayDetails(customer_Id,customer_Name,tax_Code,sales_Amount,discount,tax_Amount,total_Amount);



          System.out.println("Do you want to Enter  another Record ?(yes/No)");
         // displayDetails("Do you want to Enter  another Record ?(yes/No)");

      }while(keyboard.next ().equalsIgnoreCase ( "Yes" ));



    }

        //This displayDetails method Displays the record of a customer to the screen
    private static void displayDetails(int customerId,String customerName,String taxCode,double salesAmount,double discount ,double taxAmount ,double totalAmount)
    {
        System.out.println("The Customer ID is :"+ customerId);
        System.out.println("");

        System.out.println("The Customers Name is :"+ customerName);
        System.out.println("");
        System.out.println("The TaxCode is: :"+ taxCode);
        System.out.println("");
        System.out.println("The  SalesAmount is :"+ salesAmount);
        System.out.println("");
        System.out.println("The  DiscountAmount is :"+ discount);
        System.out.println("");
        System.out.println("The  TaxAmount is :"+ taxAmount);
        System.out.println("");
        System.out.println("The total Amount is :"+ totalAmount);
        System.out.println("");
    }


}

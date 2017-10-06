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
        double sales_Amount,total_Amount,tax_Amount=0.00;

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
          tax_Code=keyboard.next ();

         // Askes a user to enter sales amount and accepts from the input from keyboard
          System.out.println("Enter Customer's SalesAmount: ");
          keyboard = new Scanner(System.in);
          sales_Amount=keyboard.nextDouble();

          // checks what kind of tax code it is and assignes a tax amount
          if(tax_Code.equalsIgnoreCase ( "NRM" ))
          {
              tax_Amount=0.06;
          }else if(tax_Code.equalsIgnoreCase ( "NPF" ))
          {
              tax_Amount=0.00;
          }else if(tax_Code.equalsIgnoreCase ( "BIZ" ))
          {
              tax_Amount=0.045;
          }
          //Applying a Discount

          if(sales_Amount>15000)
          {
              sales_Amount=sales_Amount-(sales_Amount*.03);
              //System.out.println(sales_Amount);
          } else if (sales_Amount >10000)
          {
              sales_Amount=sales_Amount-(sales_Amount*.02);
              //System.out.println(sales_Amount);
          } else if(sales_Amount>5000)
          {
              sales_Amount=sales_Amount-(sales_Amount*.01);
             // System.out.println(sales_Amount);
          }

          //calculates the total amount
          total_Amount=sales_Amount + sales_Amount*tax_Amount;

          //Displayes the Record
          displayDetails(customer_Id,customer_Name,tax_Code,sales_Amount,tax_Amount,total_Amount);



          System.out.println("Do you want to Enter  another Record ?(yes/No)");
         // displayDetails("Do you want to Enter  another Record ?(yes/No)");

      }while(keyboard.next ().equalsIgnoreCase ( "Yes" ));



    }

        //This displayDetails method Displays the record of a customer
    private static void displayDetails(int customerId,String customerName,String taxCode,double salesAmount,double taxAmount ,double totalAmount)
    {
        System.out.println("The Customer ID is :"+ customerId);
        System.out.println("The Customer ID is :"+ customerName);
        System.out.println("The TaxCode is: :"+ taxCode);
        System.out.println("The  SalesAmount is :"+ salesAmount);
        System.out.println("The  TaxAmount is :"+ taxAmount);
        System.out.println("The total Amount is :"+ totalAmount);
        System.out.println("");
    }


}

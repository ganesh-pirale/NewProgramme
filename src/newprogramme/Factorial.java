 
package newprogramme;
 
public class Factorial {
 
     public  int fact(int f){
         int fno=1;
         
         for(int i = f; i >= 1; i--){
             fno = fno * i;             
         }
         System.out.println("Result is : "+fno);
         return f;
     }
     
     public void factreturn(int r){
         int fno=1;
         for(int i = 1; i <= r; i++){
             fno = fno * i;
         }
         System.out.println("Result is : " +fno);
     }
     
     public int disc(int PurAmount, String PaymentBy){
         
         if(PaymentBy.equals("Cash")){
             double dis = PurAmount * 0.1;
             double ActAmtToPay = PurAmount - dis;
             System.out.println("Discount is : " +dis);
             System.out.println("Actual amount to pay is : " +ActAmtToPay);
             
         }
         else if(PaymentBy.equals("Card")){
             double dis = PurAmount * 0.2;
             double ActAmtToPay = PurAmount - dis;
             System.out.println("Discount is : " +dis);
             System.out.println("Actual amount to pay is : " +ActAmtToPay);
             
         }
         return PurAmount;
     }
     
     public void Hello(){
         
         System.out.print("This is to print ");
         
         for(int i = 1 ; i < 6 ; i++){
         System.out.print(+i+".Hello ");
         
     }
         System.out.println();
         
     }
     
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam;

/**
 *
 * @author DIBO
 */
public class ExamTest {
    String name="James";
    double height=1.0;
    double weight=60.5;
    
 public static void main(String[] args){
     
     double height=1.0;
     double weight=60.5;
     double getBMI=60.5/1.0;
     
     for(double i=0.0; i<3; i++){
        // System.out.println("The value of i is: "+ getBMI(height, weight));
         
        height ++;
        weight ++;
        
         if(getBMI(height, weight)>=25){
             System.out.println("Overweight" + i);
         }
         
         
         if(getBMI(height, weight)<=18){
              System.out.println("Underweight" + i);
         }
        
          if(getBMI(height, weight)>=20){
              System.out.println("Healthy" + i);
              
              
          }
         
   

     
    
     }
    
     
     
     
    
     
     
 }
 public static double getBMI(double height, double weight){
    
    double BMI= weight/height;
    return BMI;
    
    
    
    

}
    
    
  
     
    
    
    
    
}

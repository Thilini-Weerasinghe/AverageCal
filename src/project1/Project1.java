
package project1;


import java.util.Scanner;

public class Project1 {

   
    public static void main(String[] args) {
       int a;
       //for(int x=0;x<10;x++)
      Scanner in = new Scanner(System.in);
        System.out.println("enter the no of students");
        a = in.nextInt();
       int arr[] = new int[a];
             
       System.out.println("enter the score of students");
       //int[] score = {55 , 62 , 45 ,78, 97};
        
        
        // reading the values of array
        for (int x=0;x<a;x++){
        arr[x]=in.nextInt();
        }
        
        // getting the values from array
        for(int x:arr){
            System.out.println(x);
        }
       // getting sum of students 
        int sum=0;
        for(int x:arr){
        sum=sum+x;
        }
        System.out.println("sum ="+sum);
        
       // average of the students
       
      int average= sum/a;
        System.out.println("average ="+average);
      
    
       
    }    
    }
    


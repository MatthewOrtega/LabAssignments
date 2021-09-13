package com.mycompany.hwassignment1;

public class Lab1 {
    public static void main(String[] args){
        //Basic header to begin the program.
        int b = 100;
        //Setting a variable outside the for loop. This way the program knows to stop at 100.
        for(int a=0; a <= b; a++){
            //This loop is taking the variable "a", and incrementing it by 1 so long as it's less than or equal to "b".
            //Which in this case is 100.
            if (a % 2 == 0)
                //This if statement here and the modulus divide "a" by 2 and check if 
                //it's equivalent to 0. Hence why it prints all even numbers. If I were to change
                //the 0 to 1, it would print all even numbers instead. 
            System.out.println(a);
        }
    }
}

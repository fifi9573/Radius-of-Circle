//Name: Fiona Tong
//Date: 10/10/18

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //initializes the function Scanner
        System.out.print("What is the area? ");//prints what is in the phrase
        double area = scan.nextDouble();//stores number into variable area
        double divided = area/Math.PI;//states that the variable divided is the area/PI
        double final_Answer = Math.sqrt(divided);//stores the sqrt of the divided expression into final_Answer 
        System.out.println("Radius of your circle is: " + final_Answer);//prints the result
    }
}

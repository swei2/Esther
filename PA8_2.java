import java.util.Scanner;
import java.text.DecimalFormat;
public class PA8_2
 {

        public static double perimeter(double sides[]) {
                return sides[0] + sides[1] + sides[2];
        }

        public static boolean Equilateral(double sides[]) {
                return (sides[0] == sides[1]) && (sides[1] == sides[2]);
        }

        public static double area(double sides[]) {
                double p = (sides[0] + sides[1] + sides[2]) / 2.0;
                return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
        }
        
        public static void main(String[] args) {
                Scanner k = new Scanner(System.in);

                double sides[] = new double[3];
                for (int i = 0; i < 3; i++) {
                        System.out.print("Please enter the value for the side" + (i + 1) + ": ");
                        try 
                        {
                                sides[i] = Double.parseDouble(k.next());
                                if (sides[i] <= 0) 
                                {
                                 System.out.println("Error: Side cannot be 0 or lesser.");
                                 i--;
                                }
                        } 
                        catch (NumberFormatException e) 
                         {
                           System.out.println("Error: Invalid number");
                           i--;
                        }
                }

                System.out.println("The three sides that you enetered are: ");
                System.out.println(sides[0] + " " + sides[1] + " " + sides[2]);
                
                System.out.println("The perimeter of the triangle is: " + perimeter(sides));
                if (Equilateral(sides)) 
                {
                  System.out.println("The triangle IS equilateral.");
                } 
                else 
                {
                  System.out.println("The triangle IS NOT equilateral.");
                }
                 DecimalFormat df = new DecimalFormat("#.00");
                System.out.printf("The area of the triangle is: "+ df.format(area(sides)));

                k.close();
        }

}

import java.util.Scanner;
class Order1
{
public static void main(String[] args){
int[] quantities = {2, 1, 3, 2};      
        int[] prices = {15000, 55000, 1200, 500};

        int total = 0;

        for (int i = 0; i < quantities.length; i++) {
            total += quantities[i] * prices[i];
        }

        System.out.println("Total Price (Procedural): ₹" + total);
    }
}     
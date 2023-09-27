import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double itemCost = 0;

        System.out.println("Please enter the price of your item. If 100$ or greater 2% shipping tax's will apply.");
        itemCost = scan.nextInt();

        if(itemCost < 100 && itemCost > 0){
            itemCost = itemCost * 1.02;
            System.out.println("Your item costs $" + itemCost + ". Shipping costs were applied.");

        }
        else {
            System.out.println("Your item costs $" + itemCost + ". Shipping is free!");

        }
    }
}
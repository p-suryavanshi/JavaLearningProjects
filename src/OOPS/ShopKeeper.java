package OOPS;
import java.util.Scanner;

class Shop {

    String shopName;
    String shopOwner;

    public void display() {

        System.out.println("\n========================");
        System.out.println("\nShop: " + shopName);
        System.out.println("Owner: " + shopOwner);

    }

}

public class ShopKeeper {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shop s1 = new Shop();

        s1.shopName = "Smart Sewa Junction";
        s1.shopOwner = "Pavan Suryavanshi";

        s1.display();

    }

}
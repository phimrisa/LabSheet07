import java.util.Scanner;

public class ProductMain4 {
    public static void setting_product(Product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};
        for (int i=0; i<products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[4];

        setting_product(products);

        System.out.println("Welcome to MINI SHOP!!");
        System.out.println("-----------------------------------");
        for(int i=0; i<=products.length-1; i++){
            System.out.println("Press " + (i+1) + " buy " + products[i].name + " (items=" + products[i].quantity + ")");
        }
        System.out.println("-----------------------------------");

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        while(number < 1 || number > 4){
            System.out.print("Invalid!! Enter a number, again: ");
            number = scanner.nextInt();
        }
        System.out.println("-----------------------------------");

        if(number == 1){
            System.out.print("How many " + products[0].name + " do you want to buy? ");
            products[0].sell(scanner.nextInt());
            System.out.println();
            products[0].showInfo();
        }
        if(number == 2){
            System.out.print("How many " + products[1].name + " do you want to buy? ");
            products[1].sell(scanner.nextInt());
            System.out.println();
            products[1].showInfo();
        }
        if(number == 3){
            System.out.print("How many " + products[2].name + " do you want to buy? ");
            products[2].sell(scanner.nextInt());
            System.out.println();
            products[2].showInfo();
        }
        if(number == 4){
            System.out.print("How many " + products[3].name + " do you want to buy? ");
            products[3].sell(scanner.nextInt());
            System.out.println();
            products[3].showInfo();
        }
    }
}

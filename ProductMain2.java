import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;
        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("Welcome to Mini Shop" +
                "\n-----------------------------------" +
                "\nPress [1] to buy " + product1.name +
                "\nPress [2] to buy " + product2.name);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        while(number != 1 && number != 2){
            System.out.print("Invalid number! Enter a number, again: ");
            number = scanner.nextInt();
        }

        if(number == 1){
            product1.showInfo();
            System.out.println("-----------------------------------");
            System.out.print("How many " + product1.name + " do you want to buy? ");
            product1.sell(scanner.nextInt());
            System.out.println("-----------------------------------");
            product1.showInfo();

        }
    }
}

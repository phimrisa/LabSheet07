public class Product {
    //Attribute
    public String name;
    public double price = 0;
    public int quantity = 0;

    //Methods
    public void addStock(int amount){
         quantity += amount;
        if(amount > 0){
            System.out.println("Added " + amount + " items to stock");
        }
    }

    public void sell(int amount){
        amount += quantity;
        if(amount <= quantity){
            System.out.println("Sold " + amount + " items");
        }
        System.out.println("Not enough items on stock");
    }

    public void changePrice(double newPrice){
        if(newPrice > 0){
            price = newPrice;
            System.out.println("Change price to " + newPrice + " baht");
        }
    }

    public double stockValue(){
        return price * quantity;
    }

    public void showInfo(){
        System.out.println("Name       : " + name);
        System.out.println("Price      : " + price + " Baht/Item");
        System.out.println("Quantity   : " + quantity + " Items");
        System.out.println("Stock Value: " + stockValue() + " Baht");
    }
}

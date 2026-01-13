import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();

        JOptionPane.showMessageDialog(null,
                "Welcome to Product Stock System");
        product.name = JOptionPane.showInputDialog("Enter product name:");
        product.price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));
        product.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:"));

        product.showInfo();
        System.out.println();

        int add_more_item = JOptionPane.showConfirmDialog(null,
                "Do you want to add more item?");

        if(add_more_item == JOptionPane.YES_OPTION){
            product.addStock(Integer.parseInt(JOptionPane.showInputDialog("How many items to add in stock?:")));
        }

        int change_price = JOptionPane.showConfirmDialog(null,
                "Do you want to change price?");

        if(change_price == JOptionPane.YES_OPTION){
            product.changePrice(Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per item?:")));
        }
        System.out.println();

        product.showInfo();
    }
}

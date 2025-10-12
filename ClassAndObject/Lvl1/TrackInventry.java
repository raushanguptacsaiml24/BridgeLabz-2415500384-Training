class Item {
    int itemCode;
    String itemName;
    double price;
    int quantity;

    Item(int itemCode, String itemName, double price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayInfo() {
        System.out.println("Item Code   : " + itemCode);
        System.out.println("Item Name   : " + itemName);
        System.out.println("Price       : " + price);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Total Value : " + (quantity * price));
    }
}

public class TrackInventry {
    public static void main(String[] args) {
        // Create object with constructor
        Item i1 = new Item(11, "Dhaniya", 12, 12);

        // Display info
        i1.displayInfo();
    }
}

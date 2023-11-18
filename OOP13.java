// Inventory.java
import java.util.HashMap;
import java.util.Map;

 class Inventory {
    private Map<String, Integer> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(String productName, int quantity) {
        products.put(productName, quantity);
    }

    public void removeProduct(String productName) {
        products.remove(productName);
    }

    public boolean isLowInventory(String productName, int threshold) {
        return products.containsKey(productName) && products.get(productName) < threshold;
    }
}

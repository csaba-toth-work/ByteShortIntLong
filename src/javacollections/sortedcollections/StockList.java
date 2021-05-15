package javacollections.sortedcollections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            // check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // if there are already stocks on this item, adjust the quantity
            if (inStock != item) {
                item.adjustStock(inStock.availableQuantity());
            }

            list.put(item.getName(), item);
            return item.availableQuantity();
        }
        return 0;
    }

    public int reserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if ((inStock != null) && (quantity > 0)) {
            return inStock.reserveStock(quantity);
        }
        return 0;
    }

    public int unreserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if ((inStock != null) && (quantity > 0)) {
            return inStock.unreserveStock(quantity);
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if ((inStock != null) && (quantity > 0)) {
            return inStock.finaliseStock(quantity);
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, Double> priceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItem> items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockitem = item.getValue();

            double itemValue = stockitem.getPrice() * stockitem.availableQuantity();

            s = s + stockitem + ". There are " + stockitem.availableQuantity() + " in stock. Value of items: ";
            s = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value " + totalCost;
    }
}

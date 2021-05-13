package javacollections.sortedcollections;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.items().keySet()) {
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");
            timsBasket.addToBasket(stockList.get("vase"), 2);
            timsBasket.addToBasket(stockList.get("vase"), 2);
            checkOut(timsBasket);
        System.out.println(timsBasket);
//        checkOut(timsBasket, "car", 1);
//        System.out.println(timsBasket);
//
//        checkOut(timsBasket, "car", 1);
//        System.out.println(timsBasket);
//
//        if (checkOut(timsBasket, "car", 1) != 1) {
//            System.out.println("There are no more cars in the stock");
//        }
//        ;
//        checkOut(timsBasket, "spanner", 5);
//        System.out.println(timsBasket);
//
//        checkOut(timsBasket, "juice", 4);
//        checkOut(timsBasket, "cup", 12);
//        checkOut(timsBasket, "bread", 1);
        System.out.println(timsBasket);

        System.out.println(stockList);

//        temp =  new StockItem("pen", 1.12);
//        stockList.items().put(temp.getName(), temp);
        stockList.items().get("car").adjustReservedStock(2000);
        stockList.get("car").adjustReservedStock(-1000);
        System.out.println(stockList);
        for (Map.Entry<String, Double> price : stockList.priceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }

    public static int checkOut(Basket basket) {
        // retrieve the item from stock list
        stockList.priceList();
       basket.clear();
        return 0;
    }

    public static int placeIntoBasket(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null || quantity == 0) {
            System.out.println("We dont sell " + item);
            return 0;
        }
        if (stockItem.getReserved() <= stockItem.availableQuantity()) {
            stockItem.reserveStock(quantity);
            basket.addToBasket(stockItem, quantity);
            return quantity;
        } else {
            System.out.println("Not enough items on stock");
            return 0;
        }
    }

    public static int removeFromBasket(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null || quantity == 0) {
            System.out.println("The item is not in the basket");
            return 0;
        }
        if(basket.items().containsKey(stockItem)) {
            stockItem.unreserveStock(quantity);
            basket.items().put(stockItem,stockItem.getReserved() - quantity);
        }
        return quantity;
    }
}

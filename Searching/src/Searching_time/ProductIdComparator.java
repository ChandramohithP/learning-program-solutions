package Searching_time;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Product>{

 @Override
 public int compare(Product p1, Product p2) {

     return p1.getProductId() - p2.getProductId();
 }
}

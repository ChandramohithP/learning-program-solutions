package Searching_time;

public class LinearSearchExample {

    public static Product linearSearch(Product[] products, int targetId) 
    {
        for (Product product : products)
        {
            if (product.getProductId() == targetId) 
            {
                return product; 
            }
        }
        return null; 
    }
    }
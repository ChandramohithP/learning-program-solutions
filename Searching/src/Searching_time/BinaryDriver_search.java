package Searching_time;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryDriver_search {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 
        Product[] products = new Product[size];
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Category: ");
            String category = scanner.nextLine();
            products[i] = new Product(id, name, category);
        }
        Arrays.sort(products, new ProductIdComparator());
        System.out.print("\nEnter Product ID to search: ");
        int searchId = scanner.nextInt();
        Product result = BinarySearchExample.binarySearch(products, searchId);
        if (result != null)
        {
            System.out.println("Product Found: " + result);
        } else {
            System.out.println("Product Not Found.");
        }
        scanner.close();
	}
}

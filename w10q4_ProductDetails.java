
import java.io.*;

class Product1 {
    int productCode;
    double cost;
    int quantity;

     Product1(int productCode, double cost, int quantity) {
        this.productCode = productCode;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String toString() {
        return "Product Code: " + productCode + ", Cost: " + cost + ", Quantity: " + quantity;
    }
}

public class w10q4_ProductDetails {
    public static void main(String[] args) {
        Product1[] products = new Product1[5];
        for (int i = 0; i < products.length; i++) {
            products[i] = readProductDetailsFromKeyboard();
        }
        writeProductDetailsToFile(products);
        System.out.println("Product details written to file successfully.");
    }

    static Product1 readProductDetailsFromKeyboard() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("\nEnter details for a product:");
            System.out.print("Product Code: ");
            int productCode = Integer.parseInt(reader.readLine());
            System.out.print("Cost: ");
            double cost = Double.parseDouble(reader.readLine());
            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(reader.readLine());
            return new Product1(productCode, cost, quantity);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    static void writeProductDetailsToFile(Product1[] products) {
        try {
            FileWriter writer = new FileWriter("product_details.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for (Product1 product : products) {
                bufferedWriter.write(product.productCode + "," + product.cost + "," + product.quantity + "\n");
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

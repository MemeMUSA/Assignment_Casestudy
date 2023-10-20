public class Management {
    Product[] products = new Product[10];
    int counter = 0;

    public void addProduct(Product product) {
        if (counter < products.length) {
            products[counter] = product;
            counter++;
            System.out.println("Product ADDED");
        } else {
            System.out.println("No space left for adding new product");
        }
    }

    public void removeProduct(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getId() == id) {
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[products.length -1] = null;
                System.out.println("Product REMOVED");
                break;

            }
        }
    }

    public void updateProduct(int id, Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                products[i] = product;
                System.out.println("Product UPDATED");
                return;
            }
        }
        System.out.println("Product not available");
    }

    public void getDetail() {
        System.out.println("Inventory Details:");
        for (int i = 0; i < products.length; i++) {
            if(products[i] != null) {
                System.out.println(products[i]);
            }
        }

    }
}
public class Sales {
    String saler_name;
    int noOfSales;
    int saleId;

    // Constructor
    public Sales(String saler_name, int noOfSales, int saleId) {
        this.saler_name = saler_name;
        this.noOfSales = noOfSales;
        this.saleId = saleId;
    }

    // Show method
    public void show() {
        System.out.println("Sale Details:");
        System.out.println("Saler Name: " + saler_name);
        System.out.println("No. of Sales: " + noOfSales);
        System.out.println("Sale ID: " + saleId);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Friendship", "Nagaraj", "Tanvi", 2000, "1956");
        b1.display();

        Sales s1 = new Sales("Chumni", 20, 202);
        s1.show();
    }
}

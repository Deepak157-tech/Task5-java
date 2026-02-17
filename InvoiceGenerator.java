public class InvoiceGenerator {
    public static void main(String[] args){
        StringBuilder invoice = new StringBuilder();
        invoice.append("------ INVOICE ------\n");
        invoice.append("Product: Laptop\n");
        invoice.append("Price: 76000\n");
        invoice.append("Tax: 4000\n");
        invoice.append("Total: 80000\n");
        invoice.append("---------------------");

        System.out.println(invoice.toString());
    }
}

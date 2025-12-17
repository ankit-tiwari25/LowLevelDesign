
import SOLID.SRP.solution.Invoice;
public class InvoiceDao{
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB(){
        System.out.println("Data save in DB");
    }
}

// Existing code

public class InvoiceDao{
    Invoice invoice;

    public  InvoiceDao (Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        System.out.println("Information Saved to DB!");
    }
}
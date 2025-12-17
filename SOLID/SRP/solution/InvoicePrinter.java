package SOLID.SRP.solution;

import SOLID.SRP.solution.*;
public class InvoicePrinter{
    private Invoice invoice;

    public  InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){
        System.out.println("Printing invoice!");
    }
}
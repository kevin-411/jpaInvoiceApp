package beans;

import entities.Invoice;

import javax.ejb.Local;
import java.text.ParseException;

@Local
public interface InvoiceInt {
    void addInvoice(Invoice invoice) throws ParseException;
    Invoice viewInvoice(int invoiceId);
    void editInvoice(Invoice invoice);
    void deleteInvoice(Invoice invoice);
    Invoice getInvoiceByNumber(int invoiceNumber);
}

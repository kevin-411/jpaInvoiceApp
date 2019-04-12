package beans;

import javax.ejb.Local;

@Local
public interface InvoiceLineInt {
    void addInvoiceLine();
    void deleteInvoiceLine();
}

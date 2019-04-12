package beans;

import javax.ejb.Local;

@Local
public interface InvoiceInt {
    void addInvoice();
    void deleteInvoice();
}

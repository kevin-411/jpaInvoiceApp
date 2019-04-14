package beans;

import entities.Invoice;

import javax.ejb.Local;

@Local
public interface InvoiceInt {
    void addInvoice(Invoice invoice);
    Invoice viewInvoice(int invoiceId);
    void editInvoice(Invoice invoice);
    void deleteInvoice(Invoice invoice);
}

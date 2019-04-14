package beans;

import entities.InvoiceLine;

import javax.ejb.Local;

@Local
public interface InvoiceLineInt {
    void addInvoiceLine(InvoiceLine invoiceLine);
    InvoiceLine viewInvoiceLine(int invoiceLineId);
    void editInvoiceLine(InvoiceLine invoiceLine);
    void deleteInvoiceLine(InvoiceLine invoiceLine);
}

package beans;

import entities.Invoice;

public class InvoiceBn extends Bean implements InvoiceInt {
    Invoice invoice;
    @Override
    public void addInvoice() {
        entityManager.persist(invoice);
    }

    @Override
    public void deleteInvoice() {
        entityManager.remove(invoice);
    }
}

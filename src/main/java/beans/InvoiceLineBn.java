package beans;

import entities.InvoiceLine;

public class InvoiceLineBn extends Bean implements InvoiceLineInt {

    InvoiceLine invoiceLine;
    @Override
    public void addInvoiceLine() {
        entityManager.persist(invoiceLine);
    }

    @Override
    public void deleteInvoiceLine() {
        entityManager.remove(invoiceLine);
    }
}

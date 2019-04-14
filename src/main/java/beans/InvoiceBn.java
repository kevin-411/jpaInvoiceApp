package beans;

import entities.Invoice;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

@Stateless
public class InvoiceBn extends Bean implements InvoiceInt {


    @Override
    public void addInvoice(Invoice invoice) {
        entityManager.persist(invoice);
    }

    @Override
    public Invoice viewInvoice(int invoiceId) {
        Invoice invoice = entityManager.find(Invoice.class, invoiceId);
        return invoice;
    }

    @Override
    public void editInvoice(Invoice invoice) {
        entityManager.merge(invoice);
    }

    @Override
    public void deleteInvoice(Invoice invoice) {
        Invoice invoice1 = entityManager.find(Invoice.class, invoice.getId());
        entityManager.remove(invoice1);
    }
}

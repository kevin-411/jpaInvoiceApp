package beans;

import com.google.gson.Gson;
import entities.InvoiceLine;

import javax.ejb.Stateless;

@Stateless
public class InvoiceLineBn extends Bean implements InvoiceLineInt {

    @Override
    public void addInvoiceLine(InvoiceLine invoiceLine) {
        entityManager.persist(invoiceLine);
    }

    @Override
    public InvoiceLine viewInvoiceLine(int invoiceLineId) {
        InvoiceLine invoiceLine = entityManager.find(InvoiceLine.class, invoiceLineId);
        return invoiceLine;
    }

    @Override
    public void editInvoiceLine(InvoiceLine invoiceLine) {
        entityManager.merge(invoiceLine);
    }

    @Override
    public void deleteInvoiceLine(InvoiceLine invoiceLine) {
        InvoiceLine invoiceLine1 = entityManager.find(InvoiceLine.class, invoiceLine.getInvoiceLineId());
        entityManager.remove(invoiceLine1);
    }
}

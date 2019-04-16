package beans;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import entities.Customer;
import entities.Invoice;
import entities.InvoiceLine;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Stateless
public class InvoiceBn extends Bean implements InvoiceInt {


    @Override
    public Invoice getInvoiceByNumber(int invoiceNumber) {

        List<Invoice> invoice = entityManager.createNamedQuery("selectInvoicebyInvoiceNo").setParameter("invoiceNo", String.valueOf(invoiceNumber)).getResultList();
        if(invoice!=null && invoice.size() > 0) return invoice.get(0);
        else return null;
    }

    @Override
    public void addInvoice(Invoice invoice){
        //Customer customer = entityManager.find(Customer.class, );
        Set<InvoiceLine> invoiceLineSet = null;
       // invoiceLineSet.add(entityManager.find(InvoiceLine.class, invoice.getInvoic()));

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

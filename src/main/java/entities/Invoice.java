package entities;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tble_invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String invoiceNo;
    private Date invoiceDate;
    private Date dueDate;/*
    private String invoiceDateS;*/

    @ManyToOne
    private Customer invoicee;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<InvoiceLine> invoiceLines;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInvoiceeS(){
        return String.valueOf(invoicee.getCustomerId());
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) throws ParseException {
        Date invoiceDateD = new SimpleDateFormat("DD-MM-YYYY").parse(invoiceDate);
        this.invoiceDate = invoiceDateD;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) throws ParseException {
        Date dueDateD = new SimpleDateFormat("DD-MM-YYYY").parse(dueDate);
        this.dueDate = dueDateD;
    }

    public void setDueDate(Date dueDate) throws ParseException {
        this.dueDate = dueDate;
    }

    public Customer getInvoicee() {
        return invoicee;
    }

    public void setInvoicee(Customer invoicee) {
        this.invoicee = invoicee;
    }

    public Set<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }

    //public

    public void setInvoiceLines(Set<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }
}

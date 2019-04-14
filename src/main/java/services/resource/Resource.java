package services.resource;

import beans.CustomerInt;
import beans.InvoiceInt;
import beans.InvoiceLineInt;
import com.google.gson.Gson;
import entities.Customer;
import entities.Invoice;
import entities.InvoiceLine;
import jdk.nashorn.internal.runtime.JSONListAdapter;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/invoice")
public class Resource {
    @EJB
    CustomerInt customerInt;
    @EJB
    InvoiceInt invoiceInt;
    @EJB
    InvoiceLineInt invoiceLineInt;

    @Path("/customer/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addCustomer(String json){
        Customer customer = new Gson().fromJson(json, Customer.class);
        customerInt.addCustomer(customer);
        return "success";
    }

    @Path("/customer/view/{customerId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewCustomer(@PathParam("customerId") int customerId){
        Customer customer = customerInt.viewCustomer(customerId);
        return Response.ok().entity(customer).build();
    }

    @Path("/customer/edit")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editConsumer(String json){
        Customer customer = new Gson().fromJson(json, Customer.class);
        customerInt.editCustomer(customer);
        return "success";
    }

    @Path("/customer/delete")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteConsumer(String json){
        Customer customer = new Gson().fromJson(json, Customer.class);
        customerInt.deleteCustomer(customer);
        return "success";
    }

    @Path("/invoice/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addInvoice(String json){
        Invoice invoice = new Gson().fromJson(json, Invoice.class);
        invoiceInt.addInvoice(invoice);
        return "success";
    }

    @Path("/invoice/view/{invoiceId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewInvoice(@PathParam("invoiceId") int invoiceId){
        Invoice invoice = invoiceInt.viewInvoice(invoiceId);
        return Response.ok().entity(invoice).build();
    }

    @Path("/invoice/edit")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editInvoice(String json){
        Invoice invoice = new Gson().fromJson(json, Invoice.class);
        invoiceInt.editInvoice(invoice);
        return "success";
    }

    @Path("/invoice/delete")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteInvoice(String json){
        Invoice invoice = new Gson().fromJson(json, Invoice.class);
        invoiceInt.deleteInvoice(invoice);
        return "success";
    }

    @Path("/invoiceLine/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addInvoiceLine(String json){
        InvoiceLine invoiceLine = new Gson().fromJson(json, InvoiceLine.class);
        invoiceLineInt.addInvoiceLine(invoiceLine);
        return "success";
    }

    @Path("/invoiceLine/view/{invoiceLineId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewInvoiceLine(@PathParam("invoiceLineId") int invoiceLineId){
        InvoiceLine invoiceLine = invoiceLineInt.viewInvoiceLine(invoiceLineId);
        return Response.ok().entity(invoiceLine).build();
    }

    @Path("/invoiceLine/edit")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editInvoiceLine(String json){
        InvoiceLine invoiceLine = new Gson().fromJson(json, InvoiceLine.class);
        invoiceLineInt.editInvoiceLine(invoiceLine);
        return "success";
    }

    @Path("/invoiceLine/delete")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteInvoiceLine(String json){
        InvoiceLine invoiceLine = new Gson().fromJson(json, InvoiceLine.class);
        invoiceLineInt.deleteInvoiceLine(invoiceLine);
        return "success";
    }


}

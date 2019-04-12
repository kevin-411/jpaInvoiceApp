package services.resource;

import beans.CustomerInt;
import beans.InvoiceInt;
import beans.InvoiceLineInt;
import com.google.gson.Gson;
import entities.Customer;
import jdk.nashorn.internal.runtime.JSONListAdapter;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/invoice")
public class Resource {
    @EJB
    CustomerInt customerInt;
   /* @EJB
    InvoiceInt invoiceInt;
    @EJB
    InvoiceLineInt invoiceLineInt;*/

    @Path("/customer/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addCustomer(String json){
        Customer customer = new Gson().fromJson(json, Customer.class);
        System.out.println(json+"**********************************");
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
        System.out.println(json+"**********************************");
        customerInt.deleteCustomer(customer);
        return "success";
    }


}

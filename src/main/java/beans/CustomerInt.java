package beans;

import entities.Customer;

import javax.ejb.Local;

@Local
public interface CustomerInt {
    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    Customer viewCustomer(int customerId);
    void editCustomer(Customer customer);
}

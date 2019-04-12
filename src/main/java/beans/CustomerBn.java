package beans;

import entities.Customer;

import javax.ejb.Stateful;
import javax.persistence.PersistenceContext;

@Stateful
public class CustomerBn extends Bean implements CustomerInt {

    @Override
    public void addCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        Customer customer1 = entityManager.find(Customer.class, customer.getCustomerId());
        entityManager.remove(customer1);
    }

    @Override
    public Customer viewCustomer(int customerId) {
        Customer customer = entityManager.find(Customer.class, customerId);
        return customer;
    }

    @Override
    public void editCustomer(Customer customer) {
        entityManager.merge(customer);
    }
}

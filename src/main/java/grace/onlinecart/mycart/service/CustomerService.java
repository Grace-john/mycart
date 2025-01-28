package grace.onlinecart.mycart.service;
import java.util.List;
import grace.onlinecart.mycart.model.Customer;


public interface CustomerService  {
    Customer create(Customer customer);
    List<Customer> read();
    Customer read(Long id);
    Customer update(long id,Customer customer);
    Customer delete(Long id);
    Customer loginCheck(String userName,String password);

}

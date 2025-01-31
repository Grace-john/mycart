package grace.onlinecart.mycart.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

import grace.onlinecart.mycart.model.Customer;


public interface CustomerRepository  extends CrudRepository<Customer,Long>{
    @Query("select c from Customer c where c.userName=?1 and c.password=?2 ")
    List<Customer>  login(String userName,String password);
    
    boolean existsByUserName(String userName);

}

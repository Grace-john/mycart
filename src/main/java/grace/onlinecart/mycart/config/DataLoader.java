package grace.onlinecart.mycart.config;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import grace.onlinecart.mycart.model.Customer;
import grace.onlinecart.mycart.repository.CustomerRepository;


@Component
public class DataLoader implements CommandLineRunner {
    
    @Override
    public void run(String... args) throws Exception{
                    //  repository.save(new Customer((long)1,"Administrator","admin@gmail.com","123456","admin"));
    }
    
    @Autowired
    private CustomerRepository repository;

}

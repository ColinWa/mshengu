/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.repository.customer;

import org.springframework.data.repository.PagingAndSortingRepository;
import zm.hashcode.mshengu.domain.customer.Customer;

/**
 *
 * @author Luckbliss
 */
public interface CustomerRepository extends PagingAndSortingRepository<Customer, String> {

    public Customer findByName(String name);
}

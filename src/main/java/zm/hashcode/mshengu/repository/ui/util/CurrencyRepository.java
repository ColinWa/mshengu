/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.repository.ui.util;

import java.util.List;
import java.util.Set;
import org.springframework.data.repository.PagingAndSortingRepository;
import zm.hashcode.mshengu.domain.ui.util.Currency;

/**
 *
 * @author lucky
 */
public interface CurrencyRepository extends PagingAndSortingRepository<Currency, String>{
    
}

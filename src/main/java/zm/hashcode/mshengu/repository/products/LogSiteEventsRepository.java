/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.repository.products;

import org.springframework.data.repository.PagingAndSortingRepository;
import zm.hashcode.mshengu.domain.products.LogSiteEvents;

/**
 *
 * @author Ferox
 */
public interface LogSiteEventsRepository extends PagingAndSortingRepository< LogSiteEvents, String> {
}

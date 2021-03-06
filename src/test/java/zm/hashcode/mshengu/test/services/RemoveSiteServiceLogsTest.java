/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.test.services;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import zm.hashcode.mshengu.domain.procurement.Request;
import zm.hashcode.mshengu.domain.products.Site;
import zm.hashcode.mshengu.domain.products.SiteServiceLog;
import zm.hashcode.mshengu.services.fieldservices.ServiceUnit;
import zm.hashcode.mshengu.services.procurement.RequestService;
import zm.hashcode.mshengu.services.products.SiteService;
import zm.hashcode.mshengu.test.AppTest;
import static zm.hashcode.mshengu.test.AppTest.ctx;

/**
 *
 * @author boniface
 */
public class RemoveSiteServiceLogsTest extends AppTest {

     @Autowired
    private SiteService siteService;
    @Autowired
    private RequestService requestService;

//    @Test
    public void deleteSiteServiceLogs() {

        siteService = ctx.getBean(SiteService.class);
        List<Site> siteList = siteService.findAll();
       int totalBefore = 0;
       int totalAfter = 0;
       
        System.out.println("\n\nsite count " + siteList.size());
        for (Site site : siteList) {
            totalBefore += site.getSiteServiceLog().size();
            Set<SiteServiceLog> siteServiceLogList = new HashSet<>();
            Site newSite = new Site.Builder(site.getName())
                    .site(site)
                    .siteServiceLog(siteServiceLogList)
                    .build();

//            siteService.merge(newSite);
            
            totalAfter += newSite.getSiteServiceLog().size();

        }
        System.out.println("\nTotal Site Sevice logs before " +  totalBefore);
        System.out.println("\n");
        System.out.println("\nTotal Site Sevice logs after " + totalAfter);
    }

//    @Test
    public void updatePurchaseOrderTotal() {
        requestService = ctx.getBean(RequestService.class);

        Request request = requestService.findById("530241fb334efdd25d91cfc9");
        
//        Request request = requestService.findByOrderNumber("MSH_PO-000025");

        System.out.println("\n\nBefore update");
        System.out.println(" --> Request Number " + request.getOrderNumber());
        System.out.println(" --> Request Total " + request.getTotal());
        Request newrequest = new Request.Builder(request.getPerson())
                .request(request)
                .total(BigDecimal.ZERO)
                .build();

        requestService.merge(newrequest);
//        Request request2 = requestService.findByOrderNumber("MSH_PO-000025");
        Request request2 = requestService.findById("530241fb334efdd25d91cfc9");
        System.out.println("\n\n-------------------------------\n After Updateate");
        System.out.println(" --> Request Number " + request2.getOrderNumber());
        System.out.println(" --> Request Total " + request2.getTotal());

    }

}

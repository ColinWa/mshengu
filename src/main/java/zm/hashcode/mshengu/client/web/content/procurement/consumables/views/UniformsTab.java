/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.client.web.content.procurement.consumables.views;

import com.vaadin.data.Property;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.VerticalLayout;
import zm.hashcode.mshengu.client.web.MshenguMain;
//import zm.hashcode.mshengu.client.web.content.dashboard.kpianalysis.forms.LandingPage;
import zm.hashcode.mshengu.client.web.content.assets.AssetsMenu;

/**
 *
 * @author Ferox
 */
public class UniformsTab extends VerticalLayout implements
        Button.ClickListener, Property.ValueChangeListener {

    private final MshenguMain main;
//    private final LandingPage landingPage;
    private final Embedded logo = new Embedded("", new ThemeResource("scorecard.png"));

    public UniformsTab(MshenguMain app) {
        main = app;
//        landingPage = new LandingPage(main);


        setSizeFull();
//        addComponent(logo);


    }

    @Override
    public void buttonClick(Button.ClickEvent event) {
        final Button source = event.getButton();
    }

    @Override
    public void valueChange(Property.ValueChangeEvent event) {
        final Property property = event.getProperty();
    }

    private void getHome() {
        main.content.setSecondComponent(new AssetsMenu(main, "UNIFORMS"));
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.client.web.content.assets.siteunit.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import zm.hashcode.mshengu.app.util.UIComboBoxHelper;
import zm.hashcode.mshengu.app.util.UIComponentHelper;
import zm.hashcode.mshengu.client.web.content.assets.siteunit.models.SiteUnitUnitBulkTagBean;

/**
 *
 * @author Ferox
 */
public class SiteUnitBulkTagForm extends FormLayout {

    private UIComponentHelper UIComponent = new UIComponentHelper();
    private UIComboBoxHelper UIComboBox = new UIComboBoxHelper();
    private final SiteUnitUnitBulkTagBean bean;
    public final BeanItem<SiteUnitUnitBulkTagBean> item;
    public final FieldGroup binder;
    // Define Buttons
    public Button save = new Button("Tag Toilet Units");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public SiteUnitBulkTagForm() {
        bean = new SiteUnitUnitBulkTagBean();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);
        HorizontalLayout buttons = getButtons();
        buttons.setSizeFull();
        // Determines which properties are shown
        update.setVisible(false);
        delete.setVisible(false);

        // UIComponent

        ComboBox unitTypeId = UIComboBox.getUnitTypeComboBox("Unit Type :", "siteUnitTypeId", SiteUnitUnitBulkTagBean.class, binder);
        ComboBox sequenceId = UIComboBox.getUnitNameCodeComboBox("Unit Naming Code :", "sequenceId", SiteUnitUnitBulkTagBean.class, binder);
        TextField quantity = UIComponent.getTextField("Total Number of Toilets", "quantity", SiteUnitUnitBulkTagBean.class, binder);



        GridLayout grid = new GridLayout(4, 10);
        grid.setSizeFull();

        grid.addComponent(unitTypeId, 0, 0);
        grid.addComponent(sequenceId, 1, 0);
        grid.addComponent(quantity, 2, 0);



        grid.addComponent(new Label("<hr/>", ContentMode.HTML), 0, 4, 2, 4);
        grid.addComponent(buttons, 0, 5, 2, 5);

        addComponent(grid);

    }

    private HorizontalLayout getButtons() {
        HorizontalLayout buttons = new HorizontalLayout();
        save.setSizeFull();
        edit.setSizeFull();
        cancel.setSizeFull();
        update.setSizeFull();
        delete.setSizeFull();

        save.setStyleName("default");
        edit.setStyleName("default");
        cancel.setStyleName("default");
        update.setStyleName("default");
        delete.setStyleName("default");

        buttons.addComponent(save);
//        buttons.addComponent(edit);
//        buttons.addComponent(cancel);
//        buttons.addComponent(update);
//        buttons.addComponent(delete);
        return buttons;
    }
}

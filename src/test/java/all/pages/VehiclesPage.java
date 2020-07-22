package all.pages;

import all.base.VytrackPageBase;
import all.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage extends VytrackPageBase {

    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}

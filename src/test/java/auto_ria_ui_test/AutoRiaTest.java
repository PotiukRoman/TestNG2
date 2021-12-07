package auto_ria_ui_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginAutoRioPage;
import pages.LoginPage;
import ui_tests.BaseTest;

public class AutoRiaTest extends BaseTest {

    @Test
    public void checkSpecificAdvertisementNissanPatrolLocated() {
        String expectedVinCode = "JN1WRG160U0883171";
        LoginAutoRioPage targetWindow = new LoginAutoRioPage().goToRioStartPage()
                .setMarka()
                .setModel()
                .setYearFrom()
                .setYearTo()
                .clickOnRioSubitButton();

        String actualVinCode = targetWindow.getVinCode();

        Assert.assertEquals(actualVinCode,expectedVinCode,"Specific Advertisement is absent");
    }
}

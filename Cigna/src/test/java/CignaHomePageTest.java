import CignaPKG.CignaHomePage;
import framework.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaHomePageTest extends commonAPI {
    CignaHomePage cignaHomePage;

    @BeforeMethod
    public void init() {
        cignaHomePage = PageFactory.initElements(driver, CignaHomePage.class);
    }

    @Test(priority = 1)
    public void setLogIn() {
        cignaHomePage.setLongin();

    }

//    @Test(priority = 2)
//    public void SetLogIn() {
//        cignaHomePage.setLongin();
//        cignaHomePage.setEnteremail();
//        cignaHomePage.setPassword();
//    }
        @Test(priority = 2)
        public void setIndivFamily () {
            cignaHomePage.setIndivFamily();
        }
        @Test(priority = 3)
    public void setempBroker(){
        cignaHomePage.setEmpBroker();
        }
        @Test(priority = 4)
    public void sethealthprovider(){
        cignaHomePage.setHealthprovider();
        }
        @Test(priority = 5)
    public void setmedicaltool(){
        cignaHomePage.setSearchmedicaltool();
        }
    }

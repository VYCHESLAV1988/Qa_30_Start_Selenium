import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {


    @BeforeClass
    public void preCondition(){
        //  step 1  Open browser
        //  step 2 Open url
    }

    @Test
    public void LoginSuccess(){
        // step 1  Open form ( find element + click )
        // step 2  Fill Email  ( find element + click + clear + type )
        // step 3  Fill Password   ( find element + click + clear + type
        // step 4  Submit form   ( find element + click )
    }

    @Test
    public void LoginWrongEmail(){
        // step 1  Open form ( find element + click )
        // step 2  Fill Email  ( find element + click + clear + type )
        // step 3  Fill Password   ( find element + click + clear + type
        // step 4  Submit form  ( find element + click )
    }

    @Test
    public void LoginWrongPassword(){
        // step 1  Open form ( find element + click )
        // step 2  Fill Email  ( find element + click + clear + type )
        // step 3  Fill Password   ( find element + click + clear + type
        // step 4  Submit form  ( find element + click )
    }

    @Test
    public void LoginUnregistered(){
        // step 1  Open form ( find element + click )
        // step 2  Fill Email  ( find element + click + clear + type )
        // step 3  Fill Password   ( find element + click + clear + type
        // step 4  Submit form  ( find element + click )
    }

    @AfterClass
    public void postCondition(){
        //Closed browser
    }
}

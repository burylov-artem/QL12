package mail.Suite;

import mail.test.Base;
import mail.test.DateAuthorization;
import mail.test.DateLetter;
import org.testng.annotations.Test;

public class TestSuite extends Base {

date_testsuite date = new date_testsuite();
    @Test
    public void TestSuite() throws InterruptedException {
        testMethod.authorization(new DateAuthorization(date.user, date.pass));
        testMethod.writeLetter(new DateLetter(date.recipient, date.subject, date.text));
        testMethod.send();
    }

}

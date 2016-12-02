import com.marriagemodule.MarriageModule;
import com.marriagemodule.Person;
import com.marriagemodule.Sex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarriageTest {
    @Test
    public void inputTrueDates() {
        Person person1 = new Person("df", Sex.MALE, 25, false);
        Person person2 = new Person("dfgfgf", Sex.FEMALE, 25, false);

        MarriageModule marriage = new MarriageModule();
        boolean status = marriage.marriageModule(person1,person2);
        assertTrue (status);
    }
//    @Test
//    public void txtReaderTest() {
//        txtReader();
//        assertArrayEquals(List<Person> != null);
//
//    }

    private void txtReader() {
    }

}


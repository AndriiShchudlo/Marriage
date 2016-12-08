import main.java.com.entities.Person;
import main.java.com.entities.Sex;
import main.java.com.marriage.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MarriageTest {
    @Test
    public void inputTrueDates() {
        Person person1 = new Person("df", Sex.MALE, 25, false);
        Person person2 = new Person("dfgfgf", Sex.FEMALE, 25, false);

        Marriage marriage = new Marriage();
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


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContactSorter {
    public static void sortByDateTime(List<Contact> contacts) {
        Collections.sort(contacts, Comparator.comparing(Contact::getDate).thenComparing(Contact::getTime));
    }
}

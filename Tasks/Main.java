import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        Menu menu = new Menu(contacts);
        menu.display();
    }
}

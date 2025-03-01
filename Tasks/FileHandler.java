import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    public static void saveToFile(List<Contact> contacts, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Contact contact : contacts) {
                writer.println(
                    contact.getId() + "," +
                    contact.getFirstName() + "," +
                    contact.getLastName() + "," +
                    contact.getAddress() + "," +
                    contact.getPhone() + "," +
                    contact.getNote() + "," +
                    contact.getDate() + "," +
                    contact.getTime()
                );
            }
        }
    }

    public static List<Contact> loadFromFile(String filename) throws IOException {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                LocalDate date = LocalDate.parse(parts[6]);
                LocalTime time = LocalTime.parse(parts[7]);
                contacts.add(new Contact(
                    id, parts[1], parts[2], parts[3], parts[4], parts[5], date, time
                ));
            }
        }
        return contacts;
    }
}

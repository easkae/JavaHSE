import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// RUN WITH
// java -jar .\junit-platform-console-standalone-1.9.3.jar --class-path . --scan-class-path

public class ContactTest {
    @Test
    public void testContactToString() {
        Contact contact = new Contact(
            1,
            "Иван",
            "Петров",
            "ул. Ленина, 1",
            "+79991234567",
            "Коллега",
            LocalDate.of(2023, 10, 15),
            LocalTime.of(14, 30)
        );

        String expected = "ID: 1\nИмя: Иван\nФамилия: Петров\nАдрес: ул. Ленина, 1\nТелефон: +79991234567\nЗаметка: Коллега\nДата: 2023-10-15\nВремя: 14:30\n";
        assertEquals(expected, contact.toString());
    }
}
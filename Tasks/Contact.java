import java.time.LocalDate;
import java.time.LocalTime;

public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String note;
    private LocalDate date;
    private LocalTime time;

    public Contact(int id, String firstName, String lastName, String address, String phone, String note, LocalDate date, LocalTime time) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.note = note;
        this.date = date;
        this.time = time;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public LocalTime getTime() { return time; }
    public void setTime(LocalTime time) { this.time = time; }

    @Override
    public String toString() {
        return String.format(
            "ID: %d\nИмя: %s\nФамилия: %s\nАдрес: %s\nТелефон: %s\nЗаметка: %s\nДата: %s\nВремя: %s\n",
            id, firstName, lastName, address, phone, note, date, time
        );
    }
}

public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String note;

    public Contact(int id, String firstName, String lastName, String address, String phone, String note) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return String.format("Contact ID: %d\nFirst Name: %s\nLast Name: %s\nAddress: %s\nPhone: %s\nNote: %s", 
                id, firstName, lastName, address, phone, note);
    }

    public static void main(String[] args) {
        Contact contact = new Contact(1, "John", "Doe", "123 Main St", "+1234567890", "Friend from work");
        System.out.println(contact);
    }
}

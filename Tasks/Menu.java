import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Menu {
    private List<Contact> contacts;
    private Scanner scanner;

    public Menu(List<Contact> contacts) {
        this.contacts = contacts;
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        while (true) {
            System.out.println("1. Добавить контакт");
            System.out.println("2. Сортировать по дате и времени");
            System.out.println("3. Сохранить в файл");
            System.out.println("4. Загрузить из файла");
            System.out.println("5. Вывести все контакты");
            System.out.println("6. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    ContactSorter.sortByDateTime(contacts);
                    System.out.println("Контакты отсортированы.");
                    break;
                case 3:
                    saveToFile();
                    break;
                case 4:
                    loadFromFile();
                    break;
                case 5:
                    printContacts();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Неверный ввод!");
            }
        }
    }

    private void addContact() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Фамилия: ");
        String lastName = scanner.nextLine();
        System.out.print("Адрес: ");
        String address = scanner.nextLine();
        System.out.print("Телефон: ");
        String phone = scanner.nextLine();
        System.out.print("Заметка: ");
        String note = scanner.nextLine();
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        contacts.add(new Contact(id, firstName, lastName, address, phone, note, date, time));
        System.out.println("Контакт добавлен.");
    }

    private void saveToFile() {
        System.out.print("Введите имя файла: ");
        String filename = scanner.nextLine();
        try {
            FileHandler.saveToFile(contacts, filename);
            System.out.println("Данные сохранены.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        System.out.print("Введите имя файла: ");
        String filename = scanner.nextLine();
        try {
            contacts = FileHandler.loadFromFile(filename);
            System.out.println("Данные загружены.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void printContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}

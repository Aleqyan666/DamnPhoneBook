public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("Hayk's Contacts");
        Contact developersContact = new Contact("Hayk","+37498980098","4847862968");
        Contact firemanContact = new Contact("John","+11847694660","4885518986");

        /*phoneBook.addContact(developersContact);
        System.out.println("=========================");
        phoneBook.removeContact(developersContact);
        System.out.println("=========================");
        phoneBook.removeContact(firemanContact);*/
        phoneBook.showMenu();
    }
}
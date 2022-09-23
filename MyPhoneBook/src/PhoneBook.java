import java.util.*;

public class PhoneBook  {

    private ArrayList<Contact> contactArrayList = new ArrayList<>();

    private String name;



    public PhoneBook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * adds contact
     *  @author Hayk Alekyan
     *  @since 2022-09-21
     * @param contact
     * @return true
     */
    public boolean addContact(Contact contact){
        if (contactArrayList.contains(contact)){
            contact.setName();
            System.out.println(contact.getName() + " is already on contact list ");
            return false;
        }else{
            contactArrayList.add(contact);
            System.out.println("Contact name : " + contact.getName());
            System.out.println("Contact number : " + contact.getNumber());
            System.out.println("Contact work number : " + contact.getWorkNumber());

        }
        return true;
    }

//    public int addSearchUserNumber(String  unName){
//        contactArrayList.add(unName);
//    }

    /**
     * removes contact if contact does exist, otherwise does nothing
     * @author Hayk Alekyan
     * @since 2022-09-21
     * @param inputNumber
     */
    public void removeContact(String inputNumber) {

        for (Contact myContacts : contactArrayList) {
            if (myContacts.getNumber().equals(inputNumber)) {
                contactArrayList.remove(inputNumber);
                System.out.println("Contact has been successfully deleted");
            } else {
                System.out.println("Such contact does not exist");
            }
        }
    }

    /**
     * @author Hayk Alekyan
     * @since 2022-09-21
     * @return quantity of contacts in contacts list
     */
    public int qtyContacts(){
        return this.contactArrayList.size();
    }

    public void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check the quantity of your contacts : ");
        System.out.println("B. Add contact");
        System.out.println("C. Remove a contact");
        System.out.println("D. Print all contacts");
        System.out.println("E. Exit");


        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();


            switch (option) {

                case 'A':
                    System.out.println("================");
                    System.out.println("Number of contacts in phonebook :" + qtyContacts());
                    System.out.println("================");
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("Adding a contact");
                    System.out.println("Add a name: ");
                    String enterUserName = scanner.next();
                    System.out.println("Add a number: ");
                    String enterUserNumber = scanner.next();
                    System.out.println("Add a work number");
                    String enterUserWorkNumber = scanner.next();
                    addContact(new Contact(enterUserName, enterUserNumber,enterUserWorkNumber));
                    break;

                case 'C':
                    System.out.println("Removing a contact");
                    System.out.println("Enter contact number to remove contact");
                    String enterSearchUserNumber = scanner.next();


                    if (enterSearchUserNumber.length() > 0) {
                            removeContact(enterSearchUserNumber);
                        //use for each Contact.getName . equals
                        System.out.println("Number of contacts after removing latter one :" + (contactArrayList.size() - 1));
                        System.out.println("Contact removed successfully");
                    } else {
                        System.out.println("Contact not found");
                    }

                    break;

                case 'D':
                    System.out.println("Printing all contacts");
                    for (Contact allContacts:contactArrayList){
                        System.out.println("Name: " + allContacts.getName() + " | " + "Number :" + allContacts.getNumber() + "| Work Number :" + allContacts.getWorkNumber());
                    }
                    break;

                case 'E':
                    System.out.println("======================");
                    break;

                default:
                    System.out.println();
                    System.out.println("Error: Invalid option. Please enter A, B, C, D, E");
                    break;
            }
        }while (option != 'E');
        System.out.println("Thank you for trusting our service");
    }
}


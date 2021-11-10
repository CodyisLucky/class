public class Main {

    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone("1115556666");
        Contact contact1 = new Contact("Jeff", "2255");
        Contact contact2 = new Contact("Susy", "2266");
        Contact contact3 = new Contact("Jeff", "2255");
        Contact contact4 = new Contact("Jim", "2155");

        System.out.println(phone.addNewContact(contact1));
        System.out.println(phone.addNewContact(contact2));
        System.out.println(phone.addNewContact(contact3));
        System.out.println(phone.addNewContact(contact4));
    }


}





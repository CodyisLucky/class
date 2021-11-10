import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact) != -1){
            return false;
        }
        else{
            return myContacts.add(contact);
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int location = findContact(oldContact);
        if(location != -1){
            myContacts.set(location, newContact);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        int location = findContact(contact);
        if(location != -1){
            myContacts.remove(location);
            return true;
        }
        else{
            return false;
        }
    }

    private int findContact(Contact contact){
        return findContact(contact.getName()); //Need to check by name because even if the name and number of a different contact are the same, the contact is "different" in memory.
    }

    private int findContact(String contact){
        for (int i = 0; i < myContacts.size(); i++){
            if (myContacts.get(i).getName() == contact){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName){
        int index = findContact(contactName);
        return myContacts.get(index);
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}


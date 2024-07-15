package Beginner;


import java.util.ArrayList;
import java.util.Scanner;

class contact{
    private String name;
    private String mobileNo;
    private String email;

    public contact(String name, String mobileNo, String email){
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getmobileNo(){
        return mobileNo;
    }
    public void setmobileNo(String mobileNo){
        this.mobileNo = mobileNo;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String toString(){
        return "Name: " + name + "\nMobile Number: " + mobileNo + "\nEmail: " + email;
    }

}
public class ContactManagement {
    private static ArrayList<contact> contacts = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addContact(sc);
                    break;
                case 2:
                    view();
                    break;

                case 3:
                    update(sc);
                    break;

                case 4:
                    delete(sc);
                    break;

                case 5:
                    System.out.println("Thank you!!!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid, please try again.");
            }
        }
    }

    private static void addContact(Scanner sc){
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Mobile number: ");
        String mobileNo = sc.nextLine();
        System.out.print("Enter email address: ");
        String email = sc.nextLine();
        contacts.add(new contact(name, mobileNo, email));
        System.out.println("Contact added successfully.");    
    }

    private static void view(){
        if (contacts.isEmpty()){
            System.out.println("No contacts available.");
        }
        else{
            System.out.println("Contact List: ");
            for(int i=0;i<contacts.size();i++){
                System.out.println((i + 1) + ". "+ contacts.get(i));
            }
        }
    } 

    private static void update(Scanner sc){
        if (contacts.isEmpty()){
            System.out.println("No contacts available.");
            return;
        }
        view();
        System.out.print("Enter contact number to update: ");
        int index = sc.nextInt() -1;
        sc.nextLine(); 
        if(index >= 0 && index < contacts.size()){
            contact cont = contacts.get(index);
            System.out.println("update contact: "+cont);

            System.out.print("Enter new name (Just leave blank to keep current): ");
            String name = sc.nextLine();
            if(!name.isEmpty()){
                cont.setName(name);
            }

            System.out.print("Enter new phone number (Just leave blank to keep current): ");
            String mobileNo = sc.nextLine();
            if(!mobileNo.isEmpty()){
                cont.setName(mobileNo);
            }

            System.out.print("Enter new email address (Just leave blank to keep current): ");
            String email = sc.nextLine();
            if(!email.isEmpty()){
                cont.setName(email);
            }

            System.out.println("Updated successfully.");
        }
        else{
            System.out.println("Invalid Contact.");
        }
    }

    private static void delete(Scanner sc){
        if (contacts.isEmpty()){
            System.out.println("No contacts available.");
            return;
        }
        view();
        System.out.print("Enter contact number to delete: ");
        int index = sc.nextInt() -1;
        sc.nextLine();

        if(index >= 0 && index < contacts.size()){
            contacts.remove(index);
            System.out.println("Deleted successfully.");
        }
        else{
            System.out.println("Invalid Contact.");
        }
    }
}

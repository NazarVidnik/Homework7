
import java.util.Scanner;
public static Scanner cin = new Scanner(System.in);

public static int getContNumb (int contactCount){
    int numb= cin.nextInt();
    while (numb<1||numb>contactCount){
        System.out.println("contact number can not be less than 0 And bigger than number of last contact!\n" +
                "currently it is "+contactCount);
        numb= cin.nextInt();

    }
    cin.nextLine();
    return numb;
}
public static int getMenuNumb (){
    int numb= cin.nextInt();
    while (numb<1||numb>7){
        System.out.println("Enter only the values --- listed in the menu—from 1 to 7. Try  again : ");
        numb= cin.nextInt();

    }
    cin.nextLine();
    return numb;
}

public static void AddContacts (String[] contacts, int contactCount) {
    System.out.println("Please enter new contact in this way : Name +380xxxxxxx and then press Enter ");
    contacts[contactCount]=cin.nextLine();
}
public static void ShowContacts (String[] contacts, int contactCount) {
    System.out.println("Your contact list: \n ");
    for (int i=0;i<contactCount;i++){
        System.out.println((i+1) + ". "+ contacts[i]);
    }
    System.out.println("Done!");
}
public static void Search(String[] contacts, int contactCount) {
    System.out.println("Enter keyword:");
    String searched = cin.nextLine();
    int matches = 0;
    for (int i = 0; i < contactCount; i++) {
        if (contacts[i].toLowerCase().contains(searched.toLowerCase())) {
            System.out.println((i + 1) + ". " + contacts[i]);
            matches++;
        }
    }
    if (matches == 0) {
        System.out.println("No contacts found!");
    }
    System.out.println("Done!");
}
public static void Edit (String[] contacts, int contactCount) {
    System.out.println("Please enter the sequence number of the contact you would like to edit.  \n ");
    int edited=getContNumb(contactCount);

    System.out.println("Please enter please enter the edited contact \n ");
    contacts[edited-1]=cin.nextLine();

    System.out.println("Done! \n ");
    }
public static void delete (String[] contacts, int contactCount) {
    System.out.println("Please enter the sequence number of the contact you would like to DELETE.  \n ");
    int delete=getContNumb(contactCount);
    contacts[delete-1]="DELETED";
    System.out.println("Done! \n ");
}
public static void deleteALL (String[] contacts,int contactCount) {
    for (int i=0;i<contactCount;i++){
        contacts[i]=" ";
    }
}



static void main(String[] args) {
    String[] contacts = new String[1000];
    int contactCount=0;
    int systemNumb=0;
    while (systemNumb!=7){

        System.out.println("1 Add contacts\n" +
            "2 Show contacts\n" +
            "3 Search in contact\n" +
            "4 Edit contact\n" +
            "5 Delete contact\n" +
            "6 Delete all\n" +
            "7 Exit \n");
    System.out.println("Please enter the number corresponding to the menu section");
    systemNumb= getMenuNumb();
    switch (systemNumb){
        case 1:
            AddContacts(contacts,contactCount);
            contactCount++;
            break;
        case 2:
            ShowContacts(contacts,contactCount);
            break;
        case 3:
            Search(contacts,contactCount);
            break;
        case 4:
            if (contactCount > 0) {
                Edit(contacts, contactCount);
            } else {
                System.out.println("Contact list is empty!");
            }
            break;
        case 5:
            delete(contacts,contactCount);
            break;
        case 6:
            deleteALL(contacts, contactCount);
            contactCount = 0;
            break;
        case 7:
            System.out.println("Thank you, bye ");
        }
    }

}


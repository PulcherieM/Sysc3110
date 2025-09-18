import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> listBuddy;
    public AddressBook(){
        this.listBuddy = new ArrayList<BuddyInfo>();
    }



    public boolean addBuddy(BuddyInfo buddy){
        return listBuddy.add(buddy);

    }

    public boolean removeBuddy(BuddyInfo buddy){
        return listBuddy.remove(buddy);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(buddy);
        System.out.println("hello");
    }


}

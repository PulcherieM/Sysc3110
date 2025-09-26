public class BuddyInfo {
    private String name;
    private String address;
    private int phone;

    public BuddyInfo() {
        this.name = "";
        this.address = "";
        this.phone = 0;
    }

    public BuddyInfo(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getPhone() {
        return this.phone;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

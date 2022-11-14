package chapters.chapter11.exercise11_02;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String e_mailAddress;

    public Person(){
        this("","","","");
    }
    public Person(String name){
        this(name,"","","");
    }
    public Person(String name, String address, String phoneNumber, String e_mailAddress){
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setE_mailAddress(e_mailAddress);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getE_mailAddress() {
        return e_mailAddress;
    }

    public void setE_mailAddress(String e_mailAddress) {
        this.e_mailAddress = e_mailAddress;
    }

    @Override
    public String toString() {
        return "class Name : Person\n" +
                "name : " + name ;
    }
}

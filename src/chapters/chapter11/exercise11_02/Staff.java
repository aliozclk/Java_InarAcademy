package chapters.chapter11.exercise11_02;

public class Staff extends Employee{
    private String title;

    public Staff(){
        this("","");
    }

    public Staff(String title,String name) {
        this(name,"",0,"");
    }

    public Staff(String name,String office, double salary, String title) {
        this(name,"","","",office,salary,title);

    }

    public Staff(String name, String address, String phoneNumber, String e_mailAddress, String office, double salary, String title) {
        super(name, address, phoneNumber, e_mailAddress, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class Name: Staff\n" + "Person's name : " + this.getName();
    }
}

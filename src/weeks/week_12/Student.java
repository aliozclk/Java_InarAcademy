package weeks.week_12;

public class Student {
    //DataField
    //
    private String name;
    private String surname;
    private long id ;
    private String e_mail ;

    //Constructor

    public Student(){
    }

    public Student(String n , String surn , long num , String mail){
        this.name = n;
        this.surname = surn;
        this.id = num ;
        this.e_mail = mail ;
    }

    //getter/setter methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void print(){
        System.out.println("Name: " + name + "\nSurname: " + surname +
                "\nid : " + id + "\ne-mail: " + e_mail);
        System.out.println("___________________________");
    }
}

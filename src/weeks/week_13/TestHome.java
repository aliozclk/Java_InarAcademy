package weeks.week_13;

public class TestHome {
    public static void main(String[] args) {
        Home home1 = new Home(150,2,4);
        Home home2 = new Home();
        Home home3 = new Home(180,2,6,true,1000000,20000,"kuzey",1453);

        home3.display();
        home3.renovasyon();
        home3.display();

        StringBuilder sb1 = new StringBuilder("Ali");
        sb1.append(" Özçelik");
        System.out.println(sb1);

        //Encapsulation-Kapsulleme


        //Abstraction-Soyutlama

        //Inheritance-Kalıtım


    }
}

package weeks.week_12;

public class Player {
    String name ;
    long fee;

    static int numberOfPlayer ;
    Player(String name , long fee){
        this.name = name;
        this.fee = fee;
        numberOfPlayer++;
    }

    Player(){
        this("",0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

}

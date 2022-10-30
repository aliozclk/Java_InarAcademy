package weeks.week_12;

public class FootballClub {
    //DataFields

    private long balance;
    private String clubName ;
    private double ticketFee;
    private String stadium;
    private final double stadiumCapacity ;

    private Player[] players;

    //Constructors

    public FootballClub(){
        this("",0,"",0 , 0 , new Player[25]);
    }
    public FootballClub(String clubName , double ticketFee , String stadium , double stadiumCapacity , long balance , Player[] players){
        this.clubName = clubName;
        this.ticketFee = ticketFee;
        this.stadium = stadium;
        this.stadiumCapacity = stadiumCapacity;
        this.balance = balance;
        this.players = players;
    }

    //Methods


    public long getBalance() {
        return balance;
    }

    public double getStadiumCapacity() {
        return stadiumCapacity;
    }

    public String getClubName() {
        return clubName;
    }

    public double getTicketFee() {
        return ticketFee;
    }

    public String getStadium() {
        return stadium;
    }

    public Player[] getPlayers(){
        return players;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setTicketFee(double ticketFee) {
        this.ticketFee = ticketFee;
    }

    public void setPlayers(Player[] players){
        this.players = players;
    }

    public void sellTicket(int numberOfTicket){
        this.balance += numberOfTicket * ticketFee;
    }

    public void sellPlayer(Player player){
        if(doPlayerExistInMyTeam(player)) {
            this.balance -= player.getFee();
            removePlayer(player);
        }else {
            System.out.println("Player is not in my team.");
        }
    }

    private boolean doPlayerExistInMyTeam(Player player) {

        for (int i = 0; i < this.players.length; i++) {
            Player myPlayer = players[i];
            if(myPlayer.getName().equals(player.getName())) {
                return true;

            }
        }
        return false;
    }

    public void buyPlayer(Player player){
        if(doWeHaveEnoughSpace()) {
            this.balance -= player.getFee();
        }
    }

    private boolean doWeHaveEnoughSpace() {
        for (int i = 0; i < this.players.length; i++) {
            Player myPlayer = players[i];
            if(myPlayer== null){
               return true;
            }
        }

        return false;
    }

    private void removePlayer(Player p){
        for (int i = 0; i < this.players.length; i++) {
            Player myPlayer = players[i];
            if(myPlayer.getName().equals(p.getName())){
                players[i] = null;
                break;
            }
        }
    }
}

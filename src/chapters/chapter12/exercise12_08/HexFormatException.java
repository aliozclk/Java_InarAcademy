package chapters.chapter12.exercise12_08;

public class HexFormatException extends Exception{
    private String hex;

    public HexFormatException(String hex){
        super(hex + " is not a hex string");
        this.hex = hex;
    }
    public HexFormatException(){
        this("It is not a hex string");
    }

    public String getHex() {
        return hex;
    }
}

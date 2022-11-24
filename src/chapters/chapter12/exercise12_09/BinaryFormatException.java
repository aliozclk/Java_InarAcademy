package chapters.chapter12.exercise12_09;

public class BinaryFormatException extends  Exception{
    private String bin;

    public BinaryFormatException(String bin){
        super(bin);
        this.bin = bin;
    }

    public String getBin() {
        return bin;
    }
}

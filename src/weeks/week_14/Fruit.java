package weeks.week_14;

public class Fruit extends Plants {
    private boolean hasSeed;
    private boolean juicy;

    public Fruit(){
        this(true,false);
    }

    public Fruit(boolean hasSeed, boolean juicy) {
        this("",true,true,"",hasSeed,juicy);

    }
    public Fruit(String name,boolean hasLeaves,boolean eatable, String color,boolean hasSeed, boolean juicy){
        super(name,hasLeaves,eatable,color);
        this.hasSeed = hasSeed;
        this.juicy = juicy;
    }
    public boolean isHasSeed() {
        return hasSeed;
    }

    public boolean isJuicy() {
        return juicy;
    }

    @Override
    public void hasBeenSow(){
        System.out.println("This fruit has been sow.");
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "hasSeed=" + hasSeed +
                ", juicy=" + juicy +
                ", name='" + name + '\'' +
                ", hasLeaves=" + hasLeaves +
                ", eatable=" + eatable +
                ", color='" + color + '\'' +
                '}';
    }
}

package weeks.week_14;
public class Animal extends  Object{
    protected double height;
    protected double weight;
    protected boolean hasSwimmingSkills;
    protected boolean hasFlyingSkills;

    public Animal(){
        this(1,10,false,false);
    }
    public Animal(double height, double weight, boolean hasFlyingSkills , boolean hasSwimmingSkills){
        this.setHeight(height);
        this.setWeight(weight);
        this.setHasFlyingSkills(hasFlyingSkills);
        this.setHasSwimmingSkills(hasSwimmingSkills);
    }

    public void runs(){
        System.out.println("Animal is running");

    }
    public void eats(){
        System.out.println("Animal is eating");
    }
    public void sleeps(){
        System.out.println("Animal is sleeping");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }
    public final void animalMethod(){
        System.out.println("Final method");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", hasSwimmingSkills=" + hasSwimmingSkills +
                ", hasFlyingSkills=" + hasFlyingSkills +
                '}';
    }
}

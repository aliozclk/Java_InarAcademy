package weeks.week_14;

public class Lion extends  Animal{
    private int tailSize;

    public Lion(){
        this(1,200,100,true,false);
    }

    public Lion(int tail, double weight , double height , boolean hasSwimmingSkills, boolean hasFlyingSkills){
        this.setTailSize(tail);
        this.setWeight(weight);
        this.setHeight(height);
        this.setHasSwimmingSkills(hasSwimmingSkills);
        this.setHasFlyingSkills(hasFlyingSkills);
    }


    public void roar(){
        System.out.println("Animal is roaring");
    }

    public int getTailSize() {
        return tailSize;
    }

    public void setTailSize(int tail) {
        this.tailSize = tail;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void eats(){
        System.out.println("Lion is eating");
    }

    @Override
    public String toString(){
        String str = "";
        str += getHeight() +"\n"+ getWeight() + "\n"+
                getTailSize() + "\n" + isHasFlyingSkills() + "\n"+
                isHasSwimmingSkills();
        return str;
    }

    //Final MEthod Cant be Ovirridden
    //public void animalMethod(){
    //}


}

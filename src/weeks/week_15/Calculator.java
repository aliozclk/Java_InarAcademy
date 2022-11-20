package weeks.week_15;

public class Calculator {

    private Number number1;
    private Number number2 ;

    public Number getResult() {
        return result;
    }

    private Number result;

    public Calculator(double number, double number2){
        this.number1 = new Number(number);
        this.number2 = new Number(number2);
        result = new Number();
    }


    public void getSum(){
        this.result = new Number(number1.getValue() + number2.getValue()) ;
    }

    public void getSubtract(){
        this.result = new Number(number1.getValue() - number2.getValue()) ;
    }

    public void getMultiply(){
        this.result =  new Number(number1.getValue() * number2.getValue()) ;
    }

    public void getDivide(){
        this.result = new Number(number1.getValue() / number2.getValue()) ;
    }

    public void getRemainder(){
        this.result = new Number(number1.getValue() % number2.getValue()) ;
    }

    public void change(Number num){
        if(num.getValue() > 0 ){
            num.setValue(0 - num.getValue());
        } else if (num.getValue() < 0) {
            num.setValue(Math.abs(num.getValue()));
        }
    }

    public void clear(){
        number2 = null;
        number1 = null;
    }

    public Number getNumber2() {
        return number2;
    }
}

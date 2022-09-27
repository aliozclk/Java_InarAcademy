package chapters.Chapter6;

public class Exercise06_08 {
    public static void main(String[] args) {
        System.out.println("Celcius\t\tFahrenheit\t\t|\t\tFahrenheit\t\tCelcius");
        System.out.println("_____________________________________________________");

        for (double c = 40 , f = 120 ; c >= 31  ; c -= 1.0 , f -= 10.0  ){
            System.out.printf("%-7.1f\t\t%-10.1f\t\t%c\t\t%-10.1f\t\t%-7.2f\n", c , celsiusToFahrenheit(c) , '|' , f ,
                    fahrenheitToCelsius(f));
       }

    }
    public static double celsiusToFahrenheit(double celsius){
        return  (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){

        return  (5.0 / 9) * (fahrenheit - 32);
    }
}

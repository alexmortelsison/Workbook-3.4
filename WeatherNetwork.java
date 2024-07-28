public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 25;  

        String forecast = "";

        if (temp >= 25) {
            forecast = "It's warm. Go outside";
        } else if (temp >= 8) {
            forecast = "It's chilly. Wear a coat";
        } else {
            forecast = "It's FREEZING! Stay at home.";
        }
        
        
        System.out.println(forecast);
    }
}

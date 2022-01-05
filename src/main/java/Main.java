import java.time.LocalTime;

class Main {
    public static void main(String[] args){

        LocalTime openingTime = LocalTime.parse("10:30:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        Restaurant restaurant = new Restaurant("Kolkata Bites","Kolkata",openingTime,closingTime);
        restaurant.addToMenu("Noodles",120);
        restaurant.addToMenu("Veg Soup", 60);
    }
}
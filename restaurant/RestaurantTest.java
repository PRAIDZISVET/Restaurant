package by.itacademy.restaurant;

import by.itacademy.restaurant.dao.RestaurantDao;
import by.itacademy.restaurant.model.Restaurant;

public class RestaurantTest {

    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.builder()
                .name("Раковский Бровар")
                .build();

        RestaurantDao.getInstance().save(restaurant);
        System.out.println(restaurant);
    }
}

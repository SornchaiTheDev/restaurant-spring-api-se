// 6510405814 Sornchai Somsakul

package ku.cs.restaurant.controller;

import ku.cs.restaurant.entity.Restaurant;
import ku.cs.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @GetMapping("/restaurants")
    public List<Restaurant> getAllRestaurants() {
        return service.getAll();
    }

    @PostMapping("/restaurant")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return service.create(restaurant);
    }

    @GetMapping("/restaurant/{id}")
    public Restaurant getRestaurantById(@PathVariable UUID id) {
        return service.getById(id);
    }

    @PutMapping("/restaurant")
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
        return service.update(restaurant);
    }

    @DeleteMapping("/restaurant/{id}")
    public Restaurant deleteRestaurant(@PathVariable UUID id) {
        return service.delete(id);
    }

    @GetMapping("/restaurant/name/{name}")
    public Restaurant getRestaurantByName(@PathVariable String name) {
        return service.getByName(name);
    }

    @GetMapping("/restaurant/location/{location}")
    public List<Restaurant> getRestaurantByLocation(@PathVariable String location) {
        return service.getByLocation(location);
    }




}

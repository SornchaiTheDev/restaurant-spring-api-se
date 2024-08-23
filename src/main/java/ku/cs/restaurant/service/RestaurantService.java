// 6510405814 Sornchai Somsakul

package ku.cs.restaurant.service;

import ku.cs.restaurant.entity.Restaurant;
import ku.cs.restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> getAll() {
        return repository.findAll();
    }

    public Restaurant create(Restaurant restaurant) {
        Restaurant createdRestaurant = repository.save(restaurant);
        return createdRestaurant;
    }

    public Restaurant getById(UUID id) {
        return repository.findById(id).get();
    }

    public Restaurant update(Restaurant body) {
        UUID id = body.getId();
        Restaurant restaurant = repository.findById(id).get();

        restaurant.setName(body.getName());
        restaurant.setLocation(body.getLocation());
        restaurant.setRating(body.getRating());

        restaurant = repository.save(restaurant);
        return restaurant;
    }

    public Restaurant delete(UUID id) {
        Restaurant restaurant = repository.findById(id).get();
        repository.deleteById(id);
        return restaurant;
    }

    public Restaurant getByName(String name) {
        return repository.findByName(name);
    }

    public List<Restaurant> getByLocation(String location) {
        return repository.findByLocation(location);
    }



}

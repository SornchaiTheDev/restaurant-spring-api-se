// 6510405814 Sornchai Somsakul

package ku.cs.restaurant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data // Spring bean Data class
@Entity // auto gen getter , setter , default constructor
public class Restaurant {

    @Id // Primary key
    @GeneratedValue
    private UUID id;

    private String name;
    private double rating;
    private String location;
}

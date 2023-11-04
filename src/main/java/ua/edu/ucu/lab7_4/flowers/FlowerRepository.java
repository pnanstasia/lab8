package ua.edu.ucu.lab7_4.flowers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer>{
    
}

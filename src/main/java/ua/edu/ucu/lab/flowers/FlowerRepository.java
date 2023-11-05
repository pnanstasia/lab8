package ua.edu.ucu.lab.flowers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    
}

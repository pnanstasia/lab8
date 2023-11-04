package ua.edu.ucu.lab7_4.flowers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/flower/")
public class FlowerController {
	private FlowerService flowerService;

	@Autowired
	public FlowerController(FlowerService flowerService) {
		this.flowerService = flowerService;
	}

    @GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}

	@GetMapping("/flower")
	public List<Flower> getFlower() {
		return flowerService.getflowers();
	}

	@PostMapping("/add")
	public void addFlower(@RequestBody Flower flower) {
		flowerService.add(flower);
	}
}

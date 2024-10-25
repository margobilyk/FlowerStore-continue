package Lab7.FlowerContinue.Contollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Lab7.FlowerContinue.Store.Flower;
import Lab7.FlowerContinue.Store.FlowerColor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(path = "api/v1/flower-bucket")
public class FlowerBucketController {
    
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Flower(25, FlowerColor.RED, 109));
    }
    
}

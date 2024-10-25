package Lab7.FlowerContinue.Contollers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Lab7.FlowerContinue.Store.Flower;
import Lab7.FlowerContinue.Store.FlowerColor;


@Controller
@RequestMapping(path = "api/v1/flowers")
public class FlowerController {
    
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(
            new Flower(29, FlowerColor.BLUE, 87),
            new Flower(15, FlowerColor.RED, 105),
            new Flower(21, FlowerColor.GREEN, 120)
        );
    }
}

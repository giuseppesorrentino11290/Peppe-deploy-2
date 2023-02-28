package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/basic")
public class BasicController {


    @GetMapping("/casualSum")
    public int casualSum(){
        Random random = new Random();
        int var1 =random.nextInt();
        int var2 = random.nextInt();
        return var1 + var2;
    }
}
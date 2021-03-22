package uchetka.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import uchetka.demo.entity.ClothesAll;
import uchetka.demo.repository.ClothesAllRepository;

@RequestMapping("/clothesall")
@RestController
public class ClothesAllController {
    @Autowired
    private ClothesAllRepository clothesAllRepository;
    
    @CrossOrigin
    @PostMapping
    public ClothesAll addClothes (@RequestParam(value = "djogger") String djogger,
                                  @RequestParam(value = "hoody") String hoody,
                                  @RequestParam(value = "price") Integer price){
        ClothesAll clothesAll = new ClothesAll();
    clothesAll.setDjogger(djogger);
    clothesAll.setHoody(hoody);
    if (price <= 0) {throw new ResponseStatusException(HttpStatus.NOT_FOUND, "мена меньше нуля");
    }
    clothesAll.setPrice(price);
    return clothesAll;
    }



}

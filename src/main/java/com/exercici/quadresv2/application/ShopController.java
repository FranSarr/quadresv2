package com.exercici.quadresv2.application;


import com.exercici.quadresv2.domain.Shop;
import com.exercici.quadresv2.persistence.HelperShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/shops") //This means URL's start with /shops (after Application path)
public class ShopController {

    @Autowired
    private HelperShopRepository helperShopRepository;

    //@RequestMapping(value="", method = RequestMethod.GET)
    //public String listaUsuarios(ModelMap mp){
    //    mp.put("shops", helperShopRepository.findAll());
    //    return "shops/lista";
    //}

    @GetMapping(path="")
    public @ResponseBody
    Iterable<Shop> getAllShops() {
       // This returns a JSON or XML with all the shops
    return helperShopRepository.findAll();
    }

    @PostMapping(path="")
    public Shop newShop(@RequestBody Shop newShop) {
        return helperShopRepository.save(newShop);
    }


}

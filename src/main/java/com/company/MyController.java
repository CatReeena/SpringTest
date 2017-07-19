package com.company;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Shera on 27.06.2017.
 */

@Controller
public class MyController {

    @GetMapping("/test")
    public String index(Model m) {

        
        List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");


        m.addAttribute("supplierNames", supplierNames);
        return "welcome";
    }
}




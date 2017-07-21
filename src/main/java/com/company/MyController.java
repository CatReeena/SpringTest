package com.company;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Shera on 27.06.2017.
 */

@Controller
@ContextConfiguration(classes = AppConfig.class)
public class MyController {

    @Autowired
    CinemaDAOHibernate cinemaDAOHibernate;

    @GetMapping("/test")
    public String index(Model m) {


        List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");


        m.addAttribute("supplierNames", supplierNames);
        return "welcome";
    }

    @GetMapping("/testInjection")
    public String testInjection(Model m) {


        List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");


        m.addAttribute("supplierNames", supplierNames);
        return "welcome";
        ///test
    }
}




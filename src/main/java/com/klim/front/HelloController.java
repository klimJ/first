package com.klim.front;

/**
 * Created by Artem on 05.11.2016.
 */
import com.klim.dao.IResultsRepository;
import com.klim.entity.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/hello")
public class HelloController{

    @Autowired
    private IResultsRepository resultsRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {

        model.addAttribute("message", "Hello Spring MVC Framework!");
        Iterable<Results> all = resultsRepository.findAll();

        return "hello";
    }

}
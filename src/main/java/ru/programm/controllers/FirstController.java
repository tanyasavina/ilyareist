package ru.programm.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @RequestMapping("/suter")
    public ModelAndView firstPage()
    {
      Date dateAndTime = new Date();
      String firstString = "string";
        System.out.println("running");
        // TODO We will use a proper view resolver very quickly
        return new ModelAndView("welcome", "dateAndTime", firstString);


   //     return new ModelAndView("/WEB-INF/jsp/welcome.jsp");


    }

}

package elite.fighters.suter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class Root {

    @RequestMapping("/")
    public ModelAndView rootPage() {
        Date dateAndTime=new Date();
        return new ModelAndView("welcome","dateAndTime",dateAndTime);
    }
}

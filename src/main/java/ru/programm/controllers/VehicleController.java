package ru.programm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ru.programm.Vehicle;

@Controller
@RequestMapping
public class VehicleController {


    @Controller
    @RequestMapping("/website/vehicles")
    public class VehicleController
    {
        @Autowired
        private VehicleRepository data;

        @RequestMapping(value="/newVehicle.html",method=RequestMethod.POST)
        public String newVehicle(Vehicle vehicle)
        {

        }

        @RequestMapping(value="/newVehicle.html",method=RequestMethod.GET)
        public ModelAndView renderNewVehicleForm()
        {

        }

        @RequestMapping(value="/list.html", method=RequestMethod.GET)
        public ModelAndView vehicles()
        {
            // TODO
        }

        @RequestMapping(value="/vehicle/{name}")
        public ModelAndView showVehicleByName(@PathVariable("name") String name)
        {
            // TODO
        }

    }



}

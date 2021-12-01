package com.example.group11officedeskbooking.controller;

import com.example.group11officedeskbooking.forms.DeskForm;
import com.example.group11officedeskbooking.repository.DeskRepository;
import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class GeneralController {

    //    When login by user, it will route you to the user dashboard

    @RequestMapping(path = "/dashboard")
    public ModelAndView dashboard(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("dashboard");
        return mav;
    }

    @RequestMapping(path = "/bookings")
    public ModelAndView bookings(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("bookings");
        return mav;
    }


    @RequestMapping(path = "/login")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    //Routing for the Admin Home Page

    @RequestMapping(path = "/admin/home")
    public ModelAndView Admin_Home(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Admin_Home");
        return mav;
    }

    //Routing for the Admin Location Bristol Page

    @RequestMapping(path = "/admin/location/bristol")
    public ModelAndView Admin_AllLocations_Bristol(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Admin_AllLocations_Bristol");
        return mav;
    }

    //Routing for the Admin Location Cardiff Page

    @RequestMapping(path = "/admin/location/cardiff")
    public ModelAndView Admin_AllLocations_Cardiff(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Admin_AllLocations_Cardiff");
        return mav;
    }
    @RequestMapping(path = "/Home")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("dashboard");
        return mav;
    }


    @RequestMapping(path = "/admin/calendar")
    public ModelAndView Admin_Calendar(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Admin_Calendar");
        return mav;
    }

}

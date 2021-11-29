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

    @RequestMapping(path = "/searchDate2", method = RequestMethod.GET)
    public ModelAndView search(@RequestParam(value="date", defaultValue = "null") String date){

        //Add temporary test array of desks
        DeskForm testDesk1 = new DeskForm("Desk 1", "Standing", "notAnImage.jpg", "available");
        DeskForm testDesk2 = new DeskForm("Desk 2", "Standing", "notAnImage.jpg", "available");
        DeskForm testDesk3 = new DeskForm("Desk 3", "Standing", "notAnImage.jpg", "available");
        DeskForm testDesk4 = new DeskForm("Desk 4", "Standing", "notAnImage.jpg", "available");
        DeskForm testDesk5 = new DeskForm("Desk 5", "Standing", "notAnImage.jpg", "available");
        ArrayList<DeskForm> listOfDesks = new ArrayList<>();
        listOfDesks.add(testDesk1);
        listOfDesks.add(testDesk2);
        listOfDesks.add(testDesk3);
        listOfDesks.add(testDesk4);
        listOfDesks.add(testDesk5);

        //Need to make call to the database with date and return list of Desk objects from database
        //Decide on Sql query
        //Query bookings table for all bookings of date
        //return all desk objects not in bookings table on that date && not
        //"select * from desk where desk.desk_id not in (select Desk_desk_id from booking where booking.booking_date=?), now Oject[]{searchDate}, new deskMapper();



        ModelAndView mav = new ModelAndView();
        mav.addObject("deskList", listOfDesks);
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


    @RequestMapping(path = "/Admin/Calendar")
    public ModelAndView Admin_Calendar(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Admin_Calendar");
        return mav;
    }

}

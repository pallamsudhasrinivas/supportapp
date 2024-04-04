package com.mphasis.supportapp.servicenow;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
//@RequestMapping("/servicenow/api/v1")
public class ServiceNowController {
    //rest api to get all open incidents based on role
    @GetMapping("/openIncidents/{role}")
    public TicketDetails getOpenIncidents(@PathVariable String role) {

        TicketDetails ticketsDetails;
        switch (role) {
            case "OperationsManager" -> {
                ticketsDetails = new TicketDetails(2000, 200, 500, 1300);

            }
            case "Developer" -> {
                ticketsDetails = new TicketDetails(2200, 200, 100, 1000);

            }
            case "SupportEngineer" -> {
                    ticketsDetails = new TicketDetails(1200, 100, 600, 500);

            }
            case "Admin" -> {
                    ticketsDetails = new TicketDetails(2500, 300, 1200, 1000);

            }
            default -> {
                ticketsDetails = new TicketDetails(0, 0, 0, 0);

            }
        }
        return ticketsDetails;
    }




}

package com.mphasis.supportapp.servicenow;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/servicenow/api/v1")
public class ServiceNowController {
    //rest api to get all open incidents based on role
    @GetMapping("/openIncidents/{role}")
    public ResponseEntity<HashMap<String,Integer>> getOpenIncidents(@PathVariable String role) {

        // check role and return values based
        HashMap<String,Integer> openIncidents = new HashMap<>();
        switch (role) {
            case "OperationsManager" -> openIncidents.put("openIncidents", 20);
            case "Developer" -> openIncidents.put("openIncidents", 15);
            case "SupportEngineer" -> openIncidents.put("openIncidents", 5);
            case "Admin" -> openIncidents.put("openIncidents", 0);
            default -> openIncidents.put("openIncidents", 0);
        }
        return ResponseEntity.ok(openIncidents);
    }




}

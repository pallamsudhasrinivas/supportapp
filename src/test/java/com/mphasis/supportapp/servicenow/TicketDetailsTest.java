package com.mphasis.supportapp.servicenow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketDetailsTest {
    @Test
    public void shouldReturnCorrectTicketDetailsWhenOpenIncidentsAreSet() {
        TicketDetails ticketDetails = new TicketDetails(2000, 200, 500, 1300);
        ticketDetails.setOpenIncidents(2500);
        assertEquals(2500, ticketDetails.getOpenIncidents());
    }

    @Test
    public void shouldReturnCorrectTicketDetailsWhenHighPriorityIsSet() {
        TicketDetails ticketDetails = new TicketDetails(2000, 200, 500, 1300);
        ticketDetails.setHighPriority(300);
        assertEquals(300, ticketDetails.getHighPriority());
    }

    @Test
    public void shouldReturnCorrectTicketDetailsWhenMediumPriorityIsSet() {
        TicketDetails ticketDetails = new TicketDetails(2000, 200, 500, 1300);
        ticketDetails.setMediumPriority(600);
        assertEquals(600, ticketDetails.getMediumPriority());
    }

    @Test
    public void shouldReturnCorrectTicketDetailsWhenLowPriorityIsSet() {
        TicketDetails ticketDetails = new TicketDetails(2000, 200, 500, 1300);
        ticketDetails.setLowPriority(1400);
        assertEquals(1400, ticketDetails.getLowPriority());
    }
}

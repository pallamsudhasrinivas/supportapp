package com.mphasis.supportapp.servicenow;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ServiceNowControllerTest {

    @InjectMocks
    private ServiceNowController serviceNowController;

    @Test
    public void testGetOpenIncidentsForOperationsManager() {
        // Arrange
        String role = "OperationsManager";
        TicketDetails expectedTicketDetails = new TicketDetails(2000, 200, 500, 1300);

        // Act
        TicketDetails actualTicketDetails = serviceNowController.getOpenIncidents(role);

        // Assert
        assertEquals(expectedTicketDetails.getOpenIncidents(), actualTicketDetails.getOpenIncidents());
        assertEquals(expectedTicketDetails.getHighPriority(), actualTicketDetails.getHighPriority());
        assertEquals(expectedTicketDetails.getMediumPriority(), actualTicketDetails.getMediumPriority());
        assertEquals(expectedTicketDetails.getLowPriority(), actualTicketDetails.getLowPriority());
    }

    // Add more test methods for other roles and edge cases like invalid role
    @Test
    public void testGetOpenIncidentsForDeveloper() {
        // Arrange
        String role = "Developer";
        TicketDetails expectedTicketDetails = new TicketDetails(2200, 200, 100, 1000);

        // Act
        TicketDetails actualTicketDetails = serviceNowController.getOpenIncidents(role);

        // Assert
        assertEquals(expectedTicketDetails.getOpenIncidents(), actualTicketDetails.getOpenIncidents());
        assertEquals(expectedTicketDetails.getHighPriority(), actualTicketDetails.getHighPriority());
        assertEquals(expectedTicketDetails.getMediumPriority(), actualTicketDetails.getMediumPriority());
        assertEquals(expectedTicketDetails.getLowPriority(), actualTicketDetails.getLowPriority());
    }

    @Test
    public void testGetOpenIncidentsForSupportEngineer() {
        // Arrange
        String role = "SupportEngineer";
        TicketDetails expectedTicketDetails = new TicketDetails(1200, 100, 600, 500);

        // Act
        TicketDetails actualTicketDetails = serviceNowController.getOpenIncidents(role);

        // Assert
        assertEquals(expectedTicketDetails.getOpenIncidents(), actualTicketDetails.getOpenIncidents());
        assertEquals(expectedTicketDetails.getHighPriority(), actualTicketDetails.getHighPriority());
        assertEquals(expectedTicketDetails.getMediumPriority(), actualTicketDetails.getMediumPriority());
        assertEquals(expectedTicketDetails.getLowPriority(), actualTicketDetails.getLowPriority());
    }

    @Test
    public void testGetOpenIncidentsForAdmin() {
        // Arrange
        String role = "Admin";
        TicketDetails expectedTicketDetails = new TicketDetails(2500, 300, 1200, 1000);

        // Act
        TicketDetails actualTicketDetails = serviceNowController.getOpenIncidents(role);

        // Assert
        assertEquals(expectedTicketDetails.getOpenIncidents(), actualTicketDetails.getOpenIncidents());
        assertEquals(expectedTicketDetails.getHighPriority(), actualTicketDetails.getHighPriority());
        assertEquals(expectedTicketDetails.getMediumPriority(), actualTicketDetails.getMediumPriority());
        assertEquals(expectedTicketDetails.getLowPriority(), actualTicketDetails.getLowPriority());
    }

    @Test
    public void shouldReturnEmptyTicketDetailsForInvalidRole() {
        String role = "InvalidRole";
        TicketDetails expectedTicketDetails = new TicketDetails(0, 0, 0, 0);
        TicketDetails actualTicketDetails = serviceNowController.getOpenIncidents(role);
        assertEquals(expectedTicketDetails.getOpenIncidents(), actualTicketDetails.getOpenIncidents());
        assertEquals(expectedTicketDetails.getHighPriority(), actualTicketDetails.getHighPriority());
        assertEquals(expectedTicketDetails.getMediumPriority(), actualTicketDetails.getMediumPriority());
        assertEquals(expectedTicketDetails.getLowPriority(), actualTicketDetails.getLowPriority());
    }

}

# JAVA_PROJECT


### Project Overview: Train Ticket Booking API

This project is a Spring Boot application that provides a RESTful API for booking train tickets from London to France. The key functionalities include purchasing tickets, viewing ticket details, managing user seat allocations, and modifying or removing user bookings. Below are the main features and components of the application:

#### Key Features:

1. **Purchase Ticket API:**
   - Allows users to purchase a train ticket by providing their details (first name, last name, email).
   - Automatically assigns a seat in one of the two sections (A or B).
   - Generates a receipt including the journey details, user information, and price paid.

2. **View Ticket Details API:**
   - Fetches and displays the details of a purchased ticket using the ticket ID.

3. **View Users by Section API:**
   - Retrieves and lists users along with their seat allocations for a specified section (A or B).

4. **Remove User from Train API:**
   - Deletes a user's ticket, freeing up their seat.

5. **Modify User Seat API:**
   - Allows updating the seat allocation for a user.

#### Project Structure:

- **Model Classes:**
  - `User`: Represents a user with attributes such as ID, first name, last name, and email.
  - `Ticket`: Represents a ticket with attributes such as ID, fromLocation, toLocation, price, section, seatNumber, and user.

- **Controller Class:**
  - `TicketController`: Handles HTTP requests for ticket operations like purchasing, viewing, modifying, and removing tickets.

- **Service Classes:**
  - `TicketService`: Contains business logic for managing tickets.
  - `UserService`: Contains business logic for managing users.

- **Repository Interfaces:**
  - `TicketRepository`: Extends JpaRepository to provide CRUD operations for Ticket entities.
  - `UserRepository`: Extends JpaRepository to provide CRUD operations for User entities.

#### Running the Application:

To run the application, use the following commands:

1. **Build the Project:**
   ```sh
   mvn clean install
   ```

2. **Run the Application:**
   ```sh
   mvn spring-boot:run
   ```

This project demonstrates a simple implementation of a train ticket booking system using Spring Boot, providing essential CRUD operations and RESTful APIs for effective ticket management.

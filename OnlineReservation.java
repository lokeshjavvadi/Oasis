import java.sql.*;

import java.util.Scanner;

public class ReservationSystem {

    public static void main(String[] args) {

        try {

            // Connect to the database

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservation_system", "username", "password");

            

            // Prompt the user to enter their details

            Scanner input = new Scanner(System.in);

            System.out.print("Enter your name: ");

            String name = input.nextLine();

            System.out.print("Enter your email: ");

            String email = input.nextLine();

            System.out.print("Enter your phone number: ");

            String phone = input.nextLine();

            System.out.print("Enter the train number: ");

            String trainNumber = input.nextLine();

            System.out.print("Enter the class type: ");

            String classType = input.nextLine();

            System.out.print("Enter the date of journey (YYYY-MM-DD): ");

            String dateOfJourney = input.nextLine();

            System.out.print("Enter the from location: ");

            String fromLocation = input.nextLine();

            System.out.print("Enter the to location: ");

            String toLocation = input.nextLine();

            

            // Insert the reservation into the database

            String sql = "INSERT INTO reservations (name, email, phone, train_number, class_type, date_of_journey, from_location, to_location) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, name);

            stmt.setString(2, email);

            stmt.setString(3, phone);

            stmt.setString(4, trainNumber);

            stmt.setString(5, classType);

            stmt.setString(6, dateOfJourney);

            stmt.setString(7, fromLocation);

            stmt.setString(8, toLocation);

            stmt.executeUpdate();

            

            // Display a confirmation message

            System.out.println("Reservation created successfully!");

// Close the database connection

            conn.close();

        } catch (SQLException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}

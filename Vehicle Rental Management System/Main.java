package Rental.vehicle;
import agency.RentalAgency;
import customer.Customer;


public class Main{
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("C500","Benz",80,true);
        Motorcycle motorcycle = new Motorcycle("H650","Fusion", 60 ,true);
        Truck truck = new Truck("T650", "Kia", 100 , 500);
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        Customer customer = new Customer("Attah-Nimoh","Dl22041547");
        agency.registerCustomer(customer);

        agency.processRental(customer,car,4);
        agency.processReturn(car);

        agency.processRental(customer,truck,6);
    }

}
package edu.bu.met.cs665.data;

import edu.bu.met.cs665.actors.Seller;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListingsTest {
  
  @Test
  public void printInfo() {
    
    // Call Listings instance.
    Listings data = Listings.getInstance();
    
    // Create a seller.
    Seller seller1 = new Seller("Sarah", "Jones", "Sj1975");
  
    // Create properties using the property factory method.
    seller1.createProperty("House", 1, 100000, 1, 1, 100);
    
    // Test the data structure(ArrayList) inside the Listings instance
    assertEquals(data.getListings().get(0).getSellerId(),"Sj1975");
    
    // Test the print info method
    assertEquals(data.printInfo(), "Asking price: 100000\n" +
        "Rooms: 1\n" +
        "Bathrooms: 1\n" +
        "Square Foot: 100 \n");
  }
}
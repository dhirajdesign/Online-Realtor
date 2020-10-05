package edu.bu.met.cs665.product;

import edu.bu.met.cs665.actors.Seller;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyTest {
  
  @Test
  public void printInfo() {
    
    // Create Seller object.
    Seller seller1 = new Seller("Dhiraj", "Totwani", "dt1995");
    
    // Create Property type Condo.
    Condo condominium = new Condo("dt1995",1,150000,2,2, 1100);
    
    // Set a description for the property.
    condominium.setDescription("Cool Condo Test!");
    
    // Add the listing to the Seller's myListings array list.
    seller1.addListing(condominium);
    
    // Pull the property object from the seller's myListings array list.
    Property test = seller1.getMyListings().get(0);
    Condo property1 = (Condo) test;
    
    // Test the condo object
    assertEquals(property1.getDescription(), "Cool Condo Test!");
    
  }
}
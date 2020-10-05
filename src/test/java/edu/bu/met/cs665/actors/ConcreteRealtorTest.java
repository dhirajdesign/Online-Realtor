package edu.bu.met.cs665.actors;

import edu.bu.met.cs665.product.House;
import edu.bu.met.cs665.product.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ConcreteRealtorTest {
  
  @Test
  public void getInstance() {
    
    // Call the singleton instance and/or instantiate it.
    ConcreteRealtor realtor = ConcreteRealtor.getInstance();
  
    // Create the buyer.
    Buyer buyer1 = new Buyer("Sanjay", "Martin", "Jm1995");
    
    // Create a seller.
    Seller seller1 = new Seller("Sarah", "Jones", "Sj1975");
  
    // Create the Property type of House.
    House villa = new House("Sj1975", 1, 1000000, 5, 6, 4500 );
    
    // Set the seller's description of the house.
    villa.setDescription("Gorgeous Beach view villa. It has 5 spacious rooms and 6 " +
        "whole bathrooms. The asking price is 1 million dollars.");
    
    // Register Buyer and seller into static list inside the concrete realtor instance.
    realtor.registerBuyer(buyer1);
    realtor.registerSeller(seller1);
    
    // Add the property object into the seller and entire listings list.
    seller1.addListing(villa);
    
    // Add to the buyer's interest list.
    buyer1.addListing(villa);
    
    // Get the property object from the array list.
    Property interest = buyer1.getInterestList().get(0);
    
    // Check if the property object has the right fields.
    assertEquals(interest.getAskingPrice(), 1000000);
    
    // Check if the singleton instance registered the Buyer and Seller into the static ArrayList
    assertEquals(realtor.getSellerList().get(0).getFirstName(), "Sarah");
    assertEquals(realtor.getBuyerList().get(0).getFirstName(), "Sanjay");
  }
}
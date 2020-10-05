package edu.bu.met.cs665.actors;

import org.junit.Test;

import static org.junit.Assert.*;

public class SellerTest {
  
  @Test
  public void createProperty() {
  
    // Create a seller.
    Seller seller1 = new Seller("Sarah", "Jones", "Sj1975");
    
    // Create properties using the property factory method.
    seller1.createProperty("House", 1, 100000, 1, 1, 100);
    seller1.createProperty("Condo", 2, 200000, 2, 2, 200);
    seller1.createProperty("Apartment", 3, 300000, 3, 3, 300);
    seller1.createProperty("TownHouse", 4, 400000, 4, 4, 400);
    
    // Check if the values are correct.
    assertEquals(seller1.getMyListings().get(0).getPropertyNumber(), 1);
    assertEquals(seller1.getMyListings().get(1).getPropertyNumber(), 2);
    assertEquals(seller1.getMyListings().get(2).getPropertyNumber(), 3);
    assertEquals(seller1.getMyListings().get(3).getPropertyNumber(), 4);
  
    // Check if the Seller id exist.
    assertEquals(seller1.getMyListings().get(0).getSellerId(), "Sj1975");
  }
}
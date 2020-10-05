package edu.bu.met.cs665.product;

/**
 * Provides the methods for the seller to add or remove listings.
 * The interface should be implemented by the seller and/or the realtor.
 */
public interface Listing {
  
  public void addListing(Property property);
  
  public void removeListing(Property property);
  
}

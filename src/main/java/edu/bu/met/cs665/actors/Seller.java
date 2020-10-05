package edu.bu.met.cs665.actors;

import edu.bu.met.cs665.data.Listings;
import edu.bu.met.cs665.product.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * Extends the User class to provide object specific methods for the Seller object.
 */
public class Seller extends User implements PropertyFactory {
  
  private List<Property> myListings; // The seller's active listings in an array list.
  
  /**
   * Constructor for the Seller class.
   * Creates the Seller object with an ArrayList that stores
   * the seller's property listings.
   * @param firstName is the first name of the user.
   * @param lastName  is the last name of the user.
   * @param id        is the unique id of the user.
   */
  public Seller(String firstName, String lastName, String id) {
    
    super(firstName, lastName, id);
    this.myListings = new ArrayList<Property>();
    
  }
  
  private static Logger logger = Logger.getLogger(Seller.class);
  
  // Getters
  public List<Property> getMyListings() {
    return myListings;
  }
  
  // Setters
  public void setMyListings(List<Property> myListings) {
    this.myListings = myListings;
  }
  
  /**
   * The method is called when the buyer adds a listing to their interest list.
   * This notifies the buyer of the interest of the seller.
   * @param b is the buyer.
   * @param p is the property the buyer showed interest in.
   */
  public void update(Buyer b, Property p) {
    System.out.println("Buyer " + b.getFirstName() + " "
        + b.getLastName() + " is interested in viewing your listing #"
        + p.getPropertyNumber());
  }
  
  /**
   * Adds the property listing to the object's myListing Arraylist,
   * and it also adds it to the applications listings Arraylist.
   * @param property is the property object that will be manipulated.
   */
  @Override
  public void addListing(Property property) {
    
    super.addListing(property);
    myListings.add(property);
    Listings.getInstance().getListings().add(property);
    ConcreteRealtor realtor = ConcreteRealtor.getInstance();
    realtor.notifyBuyer(property);
  }
  
  /**
   * Removes the property listing from the object's myListing Arraylist,
   * and it also removes it from the application's listings Arraylist.
   * @param property is the property object that will be manipulated.
   */
  @Override
  public void removeListing(Property property) {
    
    super.removeListing(property);
    myListings.remove(property);
    Listings.getInstance().getListings().remove(property);
    
  }
  
  /**
   * Creates the property object based on the type provided in the parameters.
   * @param type can be either House, Condo, TownHouse, or Apartment.
   */
  @Override
  public void createProperty(String type, int propertyNum, int askingPrice, int numberOfRooms,
                             int numberOfBathrooms, int squareFootage) {
    
    if (type.equalsIgnoreCase("House")) {
  
      logger.debug("PropertyFactory: Creating House type Property!");
      
      House listing = new House(this.getId(), propertyNum, askingPrice,
          numberOfRooms, numberOfBathrooms, squareFootage);
      
      this.addListing(listing);
      
    }
    if (type.equalsIgnoreCase("Condo")) {
  
      logger.debug("PropertyFactory: Creating Condominium type Property!");
      
      Condo listing = new Condo(this.getId(), propertyNum, askingPrice,
          numberOfRooms, numberOfBathrooms, squareFootage);
      
      this.addListing(listing);
      
    }
    if (type.equalsIgnoreCase("TownHouse")) {
  
      logger.debug("PropertyFactory: Creating TownHouse type Property!");
      
      TownHouse listing = new TownHouse(this.getId(), propertyNum, askingPrice,
          numberOfRooms, numberOfBathrooms, squareFootage);
      
      this.addListing(listing);
  
    }
    if (type.equalsIgnoreCase("Apartment")) {
      
      logger.debug("PropertyFactory: Creating Apartment type Property!");
      
      Apartment listing = new Apartment(this.getId(), propertyNum, askingPrice,
          numberOfRooms, numberOfBathrooms, squareFootage);
      
      this.addListing(listing);
    } else {
      logger.debug("Enter a valid Property Type!");
    }
  }
  
}

package edu.bu.met.cs665.actors;

import edu.bu.met.cs665.product.Property;
import java.util.ArrayList;
import java.util.List;

/**
 * Subclass of User.
 * Provides the buyer specific data structure
 * called interestList that holds the property objects
 * of interest to the buyer object.
 */
public class Buyer extends User {

  private List<Property> interestList; // Holds the property interests of the buyer
  
  /**
   * Constructor for the Buyer class object.
   * @param firstName is the first name of the Buyer.
   * @param lastName is the last name of the Buyer.
   * @param id is the unique id number of the Buyer.
   */
  public Buyer(String firstName, String lastName, String id) {
    
    super(firstName, lastName, id);
    this.interestList = new ArrayList<Property>(); // Buyer object's own interest list.
    
  }
  
  // Getters
  public List<Property> getInterestList() {
    return interestList;
  }
  
  // Setters
  public void setInterestList(List<Property> interestList) {
    this.interestList = interestList;
  }
  
  public void update(Property p) {
    System.out.println("Brand New Listing: " + "\n" + p.printInfo());
  }

  /**
   * The property object that the Buyer likes will be added to the buyer's own interest list.
   * @param property is the property object that will be manipulated.
   */
  @Override
  public void addListing(Property property) {

    super.addListing(property);
    this.interestList.add(property);
    ConcreteRealtor realtor = ConcreteRealtor.getInstance();
    realtor.notifySeller(this,realtor.findSeller(property.getSellerId()),property);
    
  }
  
  /**
   * This removes the specific property object from the buyer's interest list.
   * @param property is the property object that will be manipulated.
   */
  @Override
  public void removeListing(Property property) {
    super.removeListing(property);
    if (interestList.contains(property)) {
      interestList.remove(property);
    }
  }
}

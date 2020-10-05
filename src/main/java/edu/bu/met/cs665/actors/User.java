package edu.bu.met.cs665.actors;

import edu.bu.met.cs665.product.Listing;
import edu.bu.met.cs665.product.Property;

/**
 * Super class for User objects such as Buyer or Seller.
 * The User class provides the basic attributes and methods for creating
 * a specific user subclass object.
 */
public abstract class User implements Listing {
  
  private String firstName; // First name of the user.
  private String lastName; // Last name of the user.
  private String id; // Unique identification number for the user.
  
  /**
   * Constructor for the User Class.
   * @param firstName is the first name of the user.
   * @param lastName is the last name of the user.
   * @param id is the unique id of the user.
   */
  public User(String firstName, String lastName, String id) {
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
  
  }
  
  // Getters
  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public String getId() {
    return id;
  }
  
  // Setters
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  /**
   * Implements the method from the listing interface.
   * It will be used by the subclasses to add class
   * specific logic.
   * @param property is the property object that will be manipulated.
   */
  @Override
  public void addListing(Property property) {
  }
  
  /**
   * Implements the method from the listing interface.
   * It will be used by the subclasses to add class
   * specific logic.
   * @param property is the property object that will be manipulated.
   */
  @Override
  public void removeListing(Property property) {
  }
}

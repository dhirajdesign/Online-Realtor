package edu.bu.met.cs665.product;

import edu.bu.met.cs665.data.Print;

public abstract class Property implements Print {
  
  private String sellerId;
  private int propertyNumber;
  private int askingPrice;
  private int numberOfRooms;
  private int numberOfBathrooms;
  private int squareFootage;
  
  // Default Constructor
  public Property() {}

  /**
   * Default constructor for the super class Property.
   * This is inherited by all the property subclasses.
   * @param sellerId is the unique seller identification number.
   * @param propertyNumber is the number the seller uses to identify their listing.
   * @param askingPrice is the selling price.
   * @param numberOfRooms is the number of rooms in the property.
   * @param numberOfBathrooms is the number of bathrooms in the property.
   * @param squareFootage is the size of the property in square foot.
   */
  public Property(String sellerId, int propertyNumber, int askingPrice,
                  int numberOfRooms, int numberOfBathrooms, int squareFootage) {
   
    this.sellerId = sellerId;
    this.propertyNumber = propertyNumber;
    this.askingPrice = askingPrice;
    this.numberOfRooms = numberOfRooms;
    this.numberOfBathrooms = numberOfBathrooms;
    this.squareFootage = squareFootage;
  }
  
  // Getters
  
  public String getSellerId() {
    return sellerId;
  }
  
  public int getPropertyNumber() {
    return propertyNumber;
  }
  
  public int getAskingPrice() {
    return askingPrice;
  }
  
  public int getNumberOfRooms() {
    return numberOfRooms;
  }
  
  public int getNumberOfBathrooms() {
    return numberOfBathrooms;
  }
  
  public int getSquareFootage() {
    return squareFootage;
  }
  
  // Setters
  
  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }
  
  public void setPropertyNumber(int propertyNumber) {
    this.propertyNumber = propertyNumber;
  }
  
  public void setAskingPrice(int askingPrice) {
    this.askingPrice = askingPrice;
  }
  
  public void setNumberOfRooms(int numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }
  
  public void setNumberOfBathrooms(int numberOfBathrooms) {
    this.numberOfBathrooms = numberOfBathrooms;
  }
  
  public void setSquareFootage(int squareFootage) {
    this.squareFootage = squareFootage;
  }
  
  @Override
  public String printInfo() {
    String fullDescription = "Asking price: "
        + this.getAskingPrice() + "\n" + "Rooms: " + getNumberOfRooms()
        + "\n" + "Bathrooms: " + this.getNumberOfBathrooms() + "\n"
        + "Square Foot: " + this.getSquareFootage() + " \n";
    return fullDescription;
  }
}

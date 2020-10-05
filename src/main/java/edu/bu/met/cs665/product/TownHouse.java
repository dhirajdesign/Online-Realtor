package edu.bu.met.cs665.product;

/**
 * Represent a Townhouse property.
 */
public class TownHouse extends Property {
  
  private String description; // Description of the property.
  
  // Default Constructor
  public TownHouse() {}

  /**
   * Constructor for the class.
   * @param askingPrice is the asking price of the property object.
   * @param numberOfRooms is the number of rooms in the property.
   * @param numberOfBathrooms is the number of bathrooms on the property.
   * @param squareFootage is the size of the property.
   */
  public TownHouse(String sellerId, int propertyNumber, int askingPrice,
                   int numberOfRooms, int numberOfBathrooms, int squareFootage) {
  
    super(sellerId, propertyNumber, askingPrice, numberOfRooms, numberOfBathrooms, squareFootage);
    this.description = "Default";
  }
  
  // Getters
  public String getDescription() {
    return description;
  }
  
  // Setters
  public void setDescription(String description) {
    this.description = description;
  }
  
  /**
   * Prints all the attribute members of the class into a string format.
   * @return the entire description of the property object in string format.
   */
  @Override
  public String printInfo() {
    return super.printInfo() + "Description: " + this.getDescription();
  }
  
}

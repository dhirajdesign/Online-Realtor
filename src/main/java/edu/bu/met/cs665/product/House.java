package edu.bu.met.cs665.product;

/**
 * Represents a property that is a House.
 */
public class House extends Property {
  
  private String description; // Paragraph format description of the property.
  
  // Default Constructor
  public House() {}

  /**
   * Constructor of the House class.
   * @param askingPrice is the asking price of the house.
   * @param numberOfRooms is the number of rooms in the house.
   * @param numberOfBathrooms is the number of bathrooms in the house.
   * @param squareFootage is the size of the house.
   */
  public House(String sellerId, int propertyNumber, int askingPrice,
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

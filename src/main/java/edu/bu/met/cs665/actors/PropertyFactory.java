package edu.bu.met.cs665.actors;

/**
 * Interface to create Property Objects.
 * Implemented by the Seller class.
 */
public interface PropertyFactory {
  public void createProperty(String type, int askingPrice, int propertyNumber, int numberOfRooms,
                             int numberOfBathrooms, int squareFootage);
}

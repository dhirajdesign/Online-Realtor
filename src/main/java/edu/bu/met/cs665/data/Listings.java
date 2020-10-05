package edu.bu.met.cs665.data;

import edu.bu.met.cs665.product.Property;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains the active listings created by the Seller.
 */
public class Listings implements Print {
  
  private static volatile  Listings instance; // Singleton Listings Instance.
  
  private static List<Property> activeListings; // Static list containing all the activeListings.
  
  private Listings() {
  }

  /**
   * Singleton Instance constructor.
   * @return Singleton instance.
   */
  public static Listings getInstance() {
    if (instance == null) {
      synchronized (Listings.class) {
        if (instance == null) {
          instance = new Listings();
          activeListings = new ArrayList<Property>();
        }
      }
    }
    return instance;
  }
  
  public List<Property> getListings() {
    return this.activeListings;
  }

  /**
   * Concatenates all the seller listings and prints it at once.
   * @return the string format of all listings.
   */
  @Override
  public java.lang.String printInfo() {
    StringBuffer largeString = new StringBuffer();
    for (Property p : this.getListings()) {
      largeString.append("Asking price: "
          + p.getAskingPrice() + "\n" + "Rooms: " + p.getNumberOfRooms()
          + "\n" + "Bathrooms: " + p.getNumberOfBathrooms() + "\n"
          + "Square Foot: " + p.getSquareFootage() + " \n");
    }
    String text = largeString.toString();
    return text;
  }
}

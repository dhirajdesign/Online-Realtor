package edu.bu.met.cs665.actors;

import edu.bu.met.cs665.data.Listings;
import edu.bu.met.cs665.product.Property;
import java.util.ArrayList;
import java.util.List;

/**
 * The concrete mediator class implements the realtor interface.
 * This class communicates between the Buyer and Seller objects to
 * notify, and register both buyers and sellers. It manages the list of sellers
 * and buyers.
 */
public class ConcreteRealtor implements Realtor {
  
  private static volatile ConcreteRealtor instance = new ConcreteRealtor();
  private static List<Seller> sellerList = new ArrayList<>();
  private static List<Buyer> buyerList = new ArrayList<>();
  
  /**
   * Singleton constructor.
   */
  private ConcreteRealtor() {
  }
  
  /**
   * Gets the Singleton instance of the class.
   * @return the singleton instance.
   */
  public static ConcreteRealtor getInstance() {
    if (instance == null) {

      synchronized (ConcreteRealtor.class) {

        if (instance == null) {
          instance = new ConcreteRealtor();

        }
      }
    }
    return instance;
  }
  
  /**
   * Notify the buyers of a new property entry.
   * This would run the update command on each buyer
   * in the buyerList.
   * @param p is the property object pushed to the buyers.
   */
  @Override
  public void notifyBuyer(Property p) {
    for (Buyer buyer: buyerList) {
      buyer.update(p);
    }
  }
  
  @Override
  public void notifySeller(Buyer b, Seller s, Property p) {
    s.update(b, p);
  }
  
  /**
   * Add the seller to the list containing seller objects.
   * @param seller is a Seller type object from the User super class.
   */
  @Override
  public void registerSeller(Seller seller) {
    
    sellerList.add(seller);
    
  }
  
  /**
   * Adds the buyer to the list containing buyers.
   * @param buyer is a Buyer object from the User super class.
   */
  @Override
  public void registerBuyer(Buyer buyer) {
  
    buyerList.add(buyer);
    
  }

  /**
   * Assist in finding the seller using the seller id given to property object.
   * @param id the seller id provided in the property object.
   * @return returns the seller object.
   */
  public Seller findSeller(String id) {
    
    Seller s = null;
    
    for (int i = 0; i < sellerList.size(); i++) {
      
      
      if (sellerList.get(i).getId().equals(id)) {
        
        s = sellerList.get(i);
        return s;
        
      }
    }
    return null;
  }

  // Getters
  public static List<Buyer> getBuyerList() {
    return buyerList;
  }
  
  public static List<Seller> getSellerList() {
    return sellerList;
  }

  // Setters
  public static void setBuyerList(List<Buyer> buyerList) {
    ConcreteRealtor.buyerList = buyerList;
  }
  
  public static void setSellerList(List<Seller> sellerList) {
    ConcreteRealtor.sellerList = sellerList;
  }
}


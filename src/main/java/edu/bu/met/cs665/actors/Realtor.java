package edu.bu.met.cs665.actors;

import edu.bu.met.cs665.product.Property;

/**
 * The mediator interface class.
 * Provides method to interact with the two colleagues.
 * The Buyer and Seller use the ConcreteMediator as a middleman
 * to communicate any updates or changes to their data structures.
 */
public interface Realtor {

  public void notifyBuyer(Property p); // Notify buyer when seller shows interest.

  public void notifySeller(Buyer b, Seller s, Property p); // Notify seller of new listings.

  public void registerSeller(Seller seller); // Add seller to static list.

  public void  registerBuyer(Buyer buyer); // Add buyer to the static list.

}

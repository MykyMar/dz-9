package org.example.people;

public interface Partnership {

   void registerPartnership(Person partner,  boolean changeLastNameYou, boolean changeLastNamePartner);

   void deregisterPartnership(boolean changeLastNameYou, boolean changeLastNamePartner);

}

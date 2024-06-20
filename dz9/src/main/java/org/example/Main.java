package org.example;

import org.example.people.Man;
import org.example.people.Person;
import org.example.people.Woman;

public class Main {
    public static void main(String[] args) {

        Person tom = new Person("Tom", "Thomson", 59);
        Person lili = new Person("Lili", "Smith", 55);

    }
}


//
//        шаблони println якщо потрібно
//        kate.changePregnantStatus();
//        kate.setPartner(jack);
//        System.out.println("kate.isPregnant " + kate.isPregnant() + ",kate.isChildren " + kate.isChildren() + ",kate.getPartner " + kate.getPartner().getFirstName());
//        System.out.println("jack.isChildren " + jack.isChildren()+ ",+jack.getPartner "+jack.getPartner().getFirstName());
//        kate.changePregnantStatus();
//        System.out.println("kate.isPregnant " + kate.isPregnant() + ",kate.isChildren " + kate.isChildren() + ",kate.getPartner " + kate.getPartner().getFirstName());
//        System.out.println("jack.isChildren " + jack.isChildren()+ ",+jack.getPartner "+jack.getPartner().getFirstName());

//        System.out.println("Lili Last Name: " + lili.getLastName() +
//                ", Old Last Name: " + lili.getOldLastName() +
//                ", Partner's First Name: " +
//                (lili.getPartner() != null ? lili.getPartner().getFirstName() : "No partner"));
//
//
//        System.out.println("Jack Last Name: " + jack.getLastName() +
//                ", Old Last Name: " + jack.getOldLastName() +
//                ", Partner's First Name: " +
//                (jack.getPartner() != null ? jack.getPartner().getFirstName() : "No partner"));



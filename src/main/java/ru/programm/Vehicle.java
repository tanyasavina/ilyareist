package ru.programm;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import  javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private long id;
 private String name;
 private int odometer;
 private int avgSpeed;
 private String status;
 private String latitude;
 private String longitude;
 private int drivers;


 public String toString (){
     return this.name + " odometer " + this.odometer;
 }
}

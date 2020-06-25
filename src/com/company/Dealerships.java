package com.company;
/*
Project: Car Dealership Project
Purpose Details: Learn how to utilize Object Oriented Programming skills
Course: IST 242
Author: Natalie Dwyer
Date Developed: 6/19/2020
Last Date Changed:
Revision: 2
*/
import java.util.Scanner;
//2. Add constructor methods that set properties needed for each class. Remember you can have many
// constructor methods if needed.
public class Dealerships {
    private String LocationName;
    private Integer locationID;
    private Integer SalesPerDay;
    private Boolean Active;

    public Dealerships() {
    }

            //setters and getters
            public String getLocationName() {
                return LocationName;
            }
            public void setLocationName() {
                this.LocationName = LocationName;
            }
            public Integer getlocationID(){
                return locationID;
            }
            public void setlocationID(){
                this.locationID = locationID;
            }
            public Integer getSalesPerDay(){
                return SalesPerDay;
            }
            public void setSalesPerDay(){
                this.SalesPerDay = SalesPerDay;
            }
            public Boolean getActive(){
                return Active;
            }
            public void setActive(){
                this.Active = Active;
            }

            public void CustomerList() {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your name: ");

            }

            private void Transactions() {
                Scanner sc = new Scanner(System.in);
                System.out.println("");
            }

            private void InventoryCheck() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Number of Trucks: ");
                System.out.print("Number of SUV'S: ");
                System.out.print("Number of Sedans : ");
                System.out.print("Number of MiniVans: ");
            }

            public void carInsurance() {
                System.out.print("Enter what car insurance you have: ");
        }
            public void addCar() {

            }

            public void carSold() {

            }
    }



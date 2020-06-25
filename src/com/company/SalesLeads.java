/*
Project: Car Dealership Team Project
Purpose Details: A text-based car dealership system
Course: IST 242
Author: Marcos Diaz Rico
Date Developed: 6/13/2020
Last Date Changed: 6/21/2020
Revision: 2
 */

package com.company;



import java.util.Scanner;



public class SalesLeads {



    private String leadName;

    private int saleID;

    private String Descrip;

    private Boolean Active;



    //setter and getter

    public String getleadName() {

        return leadName;

    }

    public void setleadName() {

        this.leadName = leadName;

    }

    public int getsaleID() {

        return saleID;

    }

    public void setsaleID() {

        this.saleID = saleID;

    }

    public String getDescrip() {

        return Descrip;

    }

    public void setDescrip () {

        this.Descrip = Descrip;

    }

    public Boolean getActive() {

        return Active;

    }

    public void setActive() {

        this.Active = Active;

    }

    public void customerInfo () {

        Scanner cust = new Scanner(System.in);

        System.out.println("Enter your Name: ");

    }

    private void Transactions() {


    }

    private void updateInfo () {

        Scanner update = new Scanner(System.in);

        System.out.println("Enter any updated info: ");

    }

}
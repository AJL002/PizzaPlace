/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci142.gui.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author littl
 */
public class Customer {
    private String mName;
    private String mPhoneNumber;
    private String mAddress;
    
    public Customer()
    {
        mName = null;
        mPhoneNumber = null;
        mAddress = null;
    }
    
    public Customer(String name, String phonenumber, String address)
    {
        mName = name;
        mPhoneNumber = phonenumber;
        mAddress = address;
    
    }
    
    public void toCSV(File file, Customer object)
    {
        try
        {
            FileWriter write = new FileWriter(file, true);
            BufferedWriter bwrite = new BufferedWriter(write);
            PrintWriter pwrite = new PrintWriter(bwrite);
        
            pwrite.println(object.getName() + "," + object.getPhoneNumber() + "," + object.getAddress());
            pwrite.flush();
            pwrite.close();
        }
        
        catch (IOException e)
        {
            e.printStackTrace();
        }
    
    }
    
    //GETTERS
    public String getName()
    {
        return mName;
    }
    public String getPhoneNumber()
    {
        return mPhoneNumber;
    }
    public String getAddress()
    {
        return mAddress;
    }
    
    //SETTERS
    public void setName(String name)
    {
        mName = name;
    }
    public void setPhoneNumber(String phonenumber)
    {
        mPhoneNumber = phonenumber;
    }
    public void setAddress(String address)
    {
        mAddress = address;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Creates a Personal bank client 
 * @author Youssef Khaled(20190632)
 */
public class Client {
    protected String name ;
    protected String nationalID ;
    protected String address ;
    protected String phone ;
    protected Account account ;

    /**
     * empty constructor to initialize everything to null
     * account number is incremented to the last account number
     */
    public Client() {
        this.name = "" ;
        this.nationalID = "0" ;
        this.address = "" ;
        this.phone = "" ;
        this.account = new Account() ;
    }

    /**
     * Parameterized constructor to initialize the attributes of the Client
     * @param name
     * @param nationalID
     * @param address
     * @param phone
     * @param account 
     */
    public Client(String name, String nationalID, String address, String phone, Account account) {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
        this.account = account;
    }

    /**
     * Same parameterized constructor but this is used in the commercial client
     * which inherits from client class as it doesn't have national ID 
     * @param name
     * @param address
     * @param phone
     * @param account 
     */
    public Client(String name, String address, String phone, Account account) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.account = account;
    }
    
    /**
     * 
     * @return the name of the client
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name of the client
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return the national ID of the client
     */
    public String getNationalID() {
        return nationalID;
    }

    /**
     * 
     * @param nationalID of the client
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    /**
     * 
     * @return the address of the client 
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address of the client
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return the phone number of the client
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone of the client
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return the account of the client
     */
    public Account getAccount() {
        return account;
    }

    /**
     * 
     * @param account of the client 
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * 
     * @return the Attributes of the client in a certain way
     */
    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", nationalID=" + nationalID + ", address=" + address + ", phone=" + phone + ", account=" + account + '}';
    }
    
    
}

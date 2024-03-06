public class Customer {

    private Integer customerID;
    private String name;

    /*
     * Create a new customer
     * 
     * @param customerID the customer's ID
     * @param name the customer's name
     * 
     * @return void
     */
    public Customer(Integer customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }

    /*
     * Get the customer's ID
     * 
     * @return the customer's ID
     */
    public Integer getCustomerID() {
        return customerID;
    }

    /*
     * Get the customer's name
     * 
     * @return the customer's name
     */
    public String getName() {
        return name;
    }

    /*
     * Set the customer's name
     * 
     * @param name the customer's name
     * 
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }
}

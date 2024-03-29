public class CommercialCustomer extends Customer {
    private Integer creditRating;
    private String contactPerson;
    private String contactPersonPhoneNumber;

    public CommercialCustomer(String name, String address, String phoneNumber, Integer creditRating, String contactPerson, String contactPersonPhoneNumber) {
        super(name, address, phoneNumber);
        this.creditRating = creditRating;
        this.contactPerson = contactPerson;
        this.contactPersonPhoneNumber = contactPersonPhoneNumber;
    }

    public Integer getCreditRating() {
        return this.creditRating;
    }

    public String getContactPerson() {
        return this.contactPerson;
    }

    public String getContactPersonPhoneNumber() {
        return this.contactPersonPhoneNumber;
    }

    public void setCreditRating(Integer creditRating) {
        this.creditRating = creditRating;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setContactPersonPhoneNumber(String contactPersonPhoneNumber) {
        this.contactPersonPhoneNumber = contactPersonPhoneNumber;
    }
}
package Customer;

import java.util.Objects;

public class Customer {

    private int idCustomer;
    private String name;
    private String surname;
    private String postCode;
    private String address;
    private int houseNumber;
    private int mobileNumber;


    public int getIdCustomer() {
        return idCustomer;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getAddress() {
        return address;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public Customer(int idCustomer, String surname, String name, String postCode,
                  String address, int houseNumber,int mobileNumber) {
        this.idCustomer = idCustomer;
        this.surname = surname;
        this.name = name;
        this.postCode = postCode;
        this.address = address;
        this.houseNumber = houseNumber;
        this.mobileNumber = mobileNumber;
    }

    public int hashCode() {
        return this.surname.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            Customer other = (Customer) obj;
            if (!Objects.equals(this.idCustomer, other.idCustomer)) {
                return false;
            } else if (!Objects.equals(this.surname, other.surname)) {
                return false;
            } else if (!Objects.equals(this.name, other.name)) {
                return false;
            } else if (!Objects.equals(this.postCode, other.postCode)) {
                return false;
            } else if (!Objects.equals(this.address, other.address)) {
                return false;
            } else if (!Objects.equals(this.houseNumber, other.houseNumber)) {
                return false;
            } else {
                return this.mobileNumber == other.mobileNumber;
            }
        }
    }

    public String toString() {
        return this.idCustomer + " " + this.surname + " " + this.name + " " + this.mobileNumber + " ";
    }
}

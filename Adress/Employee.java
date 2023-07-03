public class Employee extends Address {
    private String name;
    private Address address;

    Employee(String name,String country, int postalCode, String street, int houseNr) {
        super(country, postalCode, street, houseNr);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}

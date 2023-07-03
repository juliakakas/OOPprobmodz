public abstract class Address {
    private String country;
    private int postalCode;
    private String street;
    private int houseNr;

    Address(String country, int postalCode, String street, int houseNr){
        this.country = country;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNr = houseNr;
    }


    public String getCountry() {
        return country;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNr() {
        return houseNr;
    }

    public static void main(String[] args) {

    }
}

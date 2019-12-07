package person;

public class Address
{
    private int zone;
    private String city;
    private String street;
    private String ally;
    private String postalCode;


    public Address(int zone, String city, String street, String ally, String postalCode) {
        this.zone = zone;
        this.city = city;
        this.street = street;
        this.ally = ally;
        this.postalCode = postalCode;
    }


    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAlly() {
        return ally;
    }

    public void setAlly(String ally) {
        this.ally = ally;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zone=" + zone +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", ally='" + ally + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}

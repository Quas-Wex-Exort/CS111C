import java.util.Objects;

public class Address {

    private int streetNumber, zip;
    private String streetName, city, state;

    public Address(int streetNumber, String streetName, String city, String state, int zip) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber=" + streetNumber +
                ", zip=" + zip +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Address) {
            Address otherAddress = (Address) o;
            return streetNumber == otherAddress.streetNumber &&
                    streetName.equals(otherAddress.streetName) &&
                    city.equals(otherAddress.city) &&
                    state.equals(otherAddress.state) &&
                    zip == otherAddress.zip;
        } else {
            return false;
        }
    }

    /*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return streetNumber == address.streetNumber &&
                zip == address.zip &&
                Objects.equals(streetName, address.streetName) &&
                Objects.equals(city, address.city) &&
                Objects.equals(state, address.state);
    }
    */

    @Override
    public int hashCode() {
        return Objects.hash(streetNumber, zip, streetName, city, state);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

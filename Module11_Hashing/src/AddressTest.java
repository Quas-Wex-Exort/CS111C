import java.util.*;

public class AddressTest {

    public static void main(String []args) {

        Address sf = new Address(139,"Sweeny Street", "San Francisco","CA",94134);
        Address mission = new Address(957, "Mission Street", "San Francisco", "CA", 94103);

        System.out.println("sf hashcode: " + sf.hashCode());
        System.out.println("Is sf and mission equal?: " + sf.equals(mission));
        System.out.println(sf.toString());

        Set<Address> addressSet = new HashSet <>();
        addressSet.add(sf);
        addressSet.add(mission);

        System.out.println(addressSet.contains(sf));
    }
}

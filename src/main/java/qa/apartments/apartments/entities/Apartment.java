package qa.apartments.apartments.entities;

import javax.persistence.*;

@Entity
@Table
public class Apartment {

    @Id
    @GeneratedValue
    @Column
    private long apartmentId;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String estateAgent;

    @Column
    private String price;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEstateAgent(String estateAgent) {
        this.estateAgent = estateAgent;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public long getApartmentId() {
        return apartmentId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEstateAgent() {
        return estateAgent;
    }

    public String getPrice() {
        return price;
    }
}

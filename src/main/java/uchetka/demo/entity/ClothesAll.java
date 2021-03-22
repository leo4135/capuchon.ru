package uchetka.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClothesAll {
    @Column
    @Id
    private int id;
    @Column
    private String djogger;
    @Column
    private String hoody;
    @Column
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDjogger() {
        return djogger;
    }

    public void setDjogger(String djogger) {
        this.djogger = djogger;
    }

    public String getHoody() {
        return hoody;
    }

    public void setHoody(String hoody) {
        this.hoody = hoody;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}

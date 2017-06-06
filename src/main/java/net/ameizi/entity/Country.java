package net.ameizi.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(mappedBy = "country", cascade = CascadeType.ALL)
    private President president;
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Province> provinces = new ArrayList<>();
    @ManyToMany(mappedBy = "countries", cascade = CascadeType.ALL)
    private List<BigCompany> companies = new ArrayList();

    public Country() {
    }

    public void setPresident(President president) {
        president.setCountry(this);
        this.president = president;
    }

    public void addProvince(Province province) {
        province.setCountry(this);
        provinces.add(province);
    }

    public void setProvinces(List<Province> provinces){
        if(provinces != null){
            provinces.forEach(province -> province.setCountry(this));
        }
        this.provinces = provinces;
    }

}

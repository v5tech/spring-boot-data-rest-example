package net.ameizi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class BigCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany
    @JoinTable(name = "country_company",
            joinColumns = @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false))
    private List<Country> countries = new ArrayList<>();

    public BigCompany() {
    }

    public BigCompany(String name) {
        this.name = name;
    }

}

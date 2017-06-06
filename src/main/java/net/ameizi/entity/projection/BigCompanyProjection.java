package net.ameizi.entity.projection;


import net.ameizi.entity.BigCompany;
import net.ameizi.entity.Country;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "base", types = {BigCompany.class})
interface BigCompanyProjection {

    int getId();

    String getName();
}

@Projection(name = "withCountry", types = {BigCompany.class})
interface BigCompanyWithCountry extends BigCompanyProjection {

    List<Country> getCountries();
}
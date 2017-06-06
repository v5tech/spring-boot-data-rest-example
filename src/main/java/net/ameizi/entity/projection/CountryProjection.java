package net.ameizi.entity.projection;

import net.ameizi.entity.BigCompany;
import net.ameizi.entity.Country;
import net.ameizi.entity.President;
import net.ameizi.entity.Province;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "base", types = {Country.class})
interface CountryProjection {
    int getId();

    String getName();
}


@Projection(name = "withPresident", types = {Country.class})
interface CountryWithPresident extends CountryProjection {

    President getPresident();
}


@Projection(name = "withProvinces", types = {Country.class})
interface CountryWithProvinces extends CountryProjection {

    List<Province> getProvinces();
}

@Projection(name = "withProvinces", types = {Country.class})
interface CountryWithCompanies extends CountryProjection {

    List<BigCompany> getCompanies();
}


@Projection(name = "withAll", types = {Country.class})
interface CountryWithAll extends CountryProjection {

    List<BigCompany> getCompanies();

    List<Province> getProvinces();

    President getPresident();
}

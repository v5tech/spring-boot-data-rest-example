package net.ameizi.service;

import net.ameizi.entity.Country;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    public void handleCountryCreateBefore(Country country){
        System.out.println("创建country之前：" + country);
    }

    public void handleCountryCreateAfter(Country country){
        System.out.println("创建country之后：" + country);
    }

    public void handleCountrySaveBefore(Country country){
        System.out.println("Save country之前：" + country);
    }

    public void handleCountrySaveAfter(Country country){
        System.out.println("Save country之后：" + country);
    }
}

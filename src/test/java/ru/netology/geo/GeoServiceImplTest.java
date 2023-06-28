package ru.netology.geo;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    public void testByIpRussia() {
        GeoService geoService = new GeoServiceImpl();

        Country actual = geoService.byIp("172.").getCountry();
        Country expected = new Location(null, Country.RUSSIA, null, 01).getCountry();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testByIpUSA() {
        GeoService geoService = new GeoServiceImpl();

        Country actual = geoService.byIp("96.").getCountry();
        Country expected = new Location(null, Country.USA, null, 01).getCountry();

        Assertions.assertEquals(expected,actual);

    }

}
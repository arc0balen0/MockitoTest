package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class LocalizationServiceImplTest {

    class localizationServiceImplTest {

        @Test
        public void testLocalRussia() {
            LocalizationService localizationService = new LocalizationServiceImpl();

            String actual = localizationService.locale(Country.RUSSIA);
            String expected = "Добро пожаловать";

            Assertions.assertEquals(expected, actual);
        }

    }

    @Test
    public void testLocalOther() {
        LocalizationService localizationService = new LocalizationServiceImpl();

        String actual = localizationService.locale(Country.BRAZIL);
        String expected = "Welcome";

        Assertions.assertEquals(expected, actual);
    }
}
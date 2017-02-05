package ru.beorg.test.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.beorg.test.entity.Price;
import ru.beorg.test.service.PriceService;

import java.math.BigDecimal;

/**
 * Created by Vlad on 05.02.2017.
 */
@Service
public class PriceApiLogic {

    @Autowired
    private PriceService service;

    public BigDecimal getAveragePrice(Long productId) {
        return service.getAveragePrice(productId);
    }

    public void save(Price price) {
        service.save(price);
    }
}

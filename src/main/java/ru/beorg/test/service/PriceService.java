package ru.beorg.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.beorg.test.entity.Price;
import ru.beorg.test.repository.PriceRepository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Created by Vlad on 05.02.2017.
 */
@Service
public class PriceService {

    @Autowired
    private PriceRepository repository;

    public BigDecimal getAveragePrice(Long productId) {
        List<Price> prices = repository.findAllByProductId(productId);
        if (prices.isEmpty()) {
            return BigDecimal.ZERO;
        }
        BigDecimal sum = prices.stream().map(Price::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
        return sum.divide(new BigDecimal(prices.size()), 2, RoundingMode.HALF_UP);
    }

    public void save(Price price) {
        repository.save(price);
    }
}

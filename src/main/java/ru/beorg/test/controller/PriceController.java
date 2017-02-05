package ru.beorg.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.beorg.test.entity.Price;
import ru.beorg.test.logic.PriceApiLogic;

import javax.validation.Valid;
import java.math.BigDecimal;

/**
 * Created by Vlad on 05.02.2017.
 */
@RestController
public class PriceController {

    @Autowired
    private PriceApiLogic logic;

    @GetMapping("average/{productId}")
    public ResponseEntity<BigDecimal> getAverage(@PathVariable Long productId) {
        return ResponseEntity.ok(logic.getAveragePrice(productId));
    }

    @PostMapping("add")
    public ResponseEntity add(@Valid @RequestBody Price price) {
        logic.save(price);
        return ResponseEntity.ok(null);
    }
}

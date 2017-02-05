package ru.beorg.test.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

/**
 * Created by Vlad on 05.02.2017.
 */
@Data
public class Price {

    @Id
    private ObjectId id;
    private Long productId;
    private BigDecimal price;
}

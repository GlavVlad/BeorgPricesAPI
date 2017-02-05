package ru.beorg.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.beorg.test.entity.Price;

import java.util.List;

/**
 * Created by Vlad on 05.02.2017.
 */
public interface PriceRepository extends MongoRepository<Price, Long> {

    List<Price> findAllByProductId(Long productId);
}

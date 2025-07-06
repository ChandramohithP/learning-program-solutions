package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByStCodeAndStDateBetween(String code, LocalDate start, LocalDate end);

    List<Stock> findByStCodeAndStCloseGreaterThan(String code, BigDecimal price);

    List<Stock> findTop3ByOrderByStVolumeDesc();

    List<Stock> findTop3ByStCodeOrderByStCloseAsc(String code);
}

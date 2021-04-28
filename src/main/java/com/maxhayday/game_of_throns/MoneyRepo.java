package com.maxhayday.game_of_throns;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface MoneyRepo extends PagingAndSortingRepository<Bank,Integer> {
        List<Bank> findByFilialNameStartingWith(String prefix);
}

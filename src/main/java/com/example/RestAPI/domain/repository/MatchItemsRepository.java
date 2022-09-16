package com.example.RestAPI.domain.repository;


import com.example.RestAPI.domain.entity.ItemTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchItemsRepository extends JpaRepository<ItemTable, String>{
    List<ItemTable> findByTitle(String title);
}

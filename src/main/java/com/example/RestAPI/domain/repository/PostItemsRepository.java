package com.example.RestAPI.domain.repository;


import com.example.RestAPI.domain.entity.ItemTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostItemsRepository extends JpaRepository<ItemTable, String>{
    boolean existsByTitle(String title);
}


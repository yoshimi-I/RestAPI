package com.example.RestAPI.domain.service;

import com.example.RestAPI.domain.entity.ItemTable;
import com.example.RestAPI.domain.repository.ItemRepository;
import com.example.RestAPI.domain.repository.MatchItemsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ItemGetServices {
    private final ItemRepository itemRepository;
    private final MatchItemsRepository matchItemsRepository;
    public List<ItemTable> MatchItems(String text){
        if (text == null){
            return itemRepository.findAll();
        }else {
            return matchItemsRepository.findByTitle(text);
        }
    }
}

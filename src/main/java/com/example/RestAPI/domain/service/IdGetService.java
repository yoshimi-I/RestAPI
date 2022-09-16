package com.example.RestAPI.domain.service;

import com.example.RestAPI.domain.entity.ItemTable;
import com.example.RestAPI.domain.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IdGetService {
    private final ItemRepository itemRepository;
    public Optional<ItemTable> getId(Integer id) {
        if (itemRepository.existsById(id)){
            return itemRepository.findById(id);
        }else {
            return Optional.empty();
        }

    }

    public List<ItemTable> getAllItems() {
        return itemRepository.findAll();
    }

    public List<ItemTable> register(ItemTable itemTable) {
        return Collections.singletonList(itemRepository.save(itemTable));
    }

    public List<ItemTable> update(Integer id, ItemTable itemTable){
        return Collections.singletonList(itemRepository.save(itemTable));
    }

    public void deleteItem(Integer id) {
        itemRepository.deleteById(id);
    }
}

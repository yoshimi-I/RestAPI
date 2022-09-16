package com.example.RestAPI.domain.service;

import com.example.RestAPI.domain.entity.ItemTable;
import com.example.RestAPI.domain.error.ResponseError;
import com.example.RestAPI.domain.form.RegisterForm;
import com.example.RestAPI.domain.repository.ItemRepository;
import com.example.RestAPI.domain.repository.PostItemsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemPostService {
    private final PostItemsRepository postItemsRepository;
    private final ItemRepository itemRepository;

    public List<ItemTable> register(RegisterForm registerForm) {
        if (postItemsRepository.existsByTitle(registerForm.getTitle())) {
            throw new ResponseError("もう存在します");
        }else {
            ItemTable itemTable = new ItemTable();
            itemTable.setTitle(registerForm.getTitle());
            itemTable.setDescription(registerForm.getTitle());
            itemTable.setPrice(registerForm.getPrice());
            itemTable.setImage_path(registerForm.getImage_path());
            return Collections.singletonList(itemRepository.save(itemTable));
        }

    }
}

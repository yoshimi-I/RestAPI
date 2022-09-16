package com.example.RestAPI.controller;

import com.example.RestAPI.domain.entity.ItemTable;
import com.example.RestAPI.domain.form.RegisterForm;
import com.example.RestAPI.domain.service.IdGetService;
import com.example.RestAPI.domain.service.ItemGetServices;
import com.example.RestAPI.domain.service.ItemPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ItemsController {

    private final IdGetService idGetService;
    private final ItemGetServices itemGetServices;
    private final ItemPostService itemPostService;

    @GetMapping("")
    @Transactional
    @ResponseStatus()
    public List<ItemTable> getTitles(@RequestParam(value = "title", required = false) String name){
        return itemGetServices.MatchItems(name);
    }

    @GetMapping("{id}")
    public Optional<ItemTable> getItemId(@PathVariable("id") Integer id){

        return idGetService.getId(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public List<ItemTable> postItems(@RequestBody RegisterForm registerForm){
        return itemPostService.register(registerForm);
    }

    @PutMapping("{id}")
    public List<ItemTable> putItems(@PathVariable("id") Integer id, @RequestBody ItemTable itemTable){
        return idGetService.update(id,itemTable);
    }

    @DeleteMapping("{id}")
    public void deleteItem(@PathVariable("id") Integer id){
        idGetService.deleteItem(id);
    }


}

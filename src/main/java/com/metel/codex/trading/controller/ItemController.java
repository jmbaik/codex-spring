package com.metel.codex.trading.controller;

import com.metel.codex.trading.dto.Items;
import com.metel.codex.trading.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trading")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping("/items")
    public List<Items> getItems() {
        return service.getItems();
    }
}

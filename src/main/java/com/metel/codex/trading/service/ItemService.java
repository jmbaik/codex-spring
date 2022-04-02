package com.metel.codex.trading.service;

import com.metel.codex.trading.dto.Items;
import com.metel.codex.trading.dao.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemDao mapper;

    public List<Items> getItems() {
        return mapper.getItems();
    }
}

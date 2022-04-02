package com.metel.codex.trading.dao;

import com.metel.codex.trading.dto.Items;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemDao {
    List<Items> getItems();
}

package com.demo.service;

import com.demo.entity.MarketOrders;
import com.demo.entity.Types;

import java.util.List;

public interface MarketService {
    void updateMarketGroups();

    void updateMarketOrders();

    List<List<MarketOrders>> getOrders(int regionId, List<Integer> typeIds);

    List<Types> getTypeDetails(int marketGroupId);

    List<Integer> getAllTypeIds(int marketGroupId);
}

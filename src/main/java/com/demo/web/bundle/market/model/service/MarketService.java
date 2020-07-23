package com.demo.web.bundle.market.model.service;

import com.demo.web.bundle.market.entity.MarketOrders;
import com.demo.web.bundle.universe.entity.Types;

import java.util.List;

public interface MarketService
{
    void updateMarketGroups();

    void updateMarketOrders();

    List<List<MarketOrders>> getOrders(String regionId, List<String> typeIds);

    List<Types> getTypeDetails(String marketGroupId);

    List<String> getAllTypeIds(String marketGroupId);
}

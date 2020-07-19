package com.demo.web.bundle.market.model.dao;

import com.demo.web.bundle.market.entity.MarketGroups;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * (MarketGroups)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-28 12:00:09
 */
public interface MarketGroupsDao extends JpaRepository<MarketGroups, Integer> {
    @Query(value = "select mg.types from MarketGroups mg where mg.marketGroupId = :groupId")
    String getTypeIdsByGIdAndRId(@Param("groupId") int groupId);
}
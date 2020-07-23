package com.demo.web.bundle.universe.model.dao;

import com.demo.web.bundle.universe.entity.Constellations;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * (Constellations)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-03 15:45:54
 */
public interface ConstellationsDao
        extends JpaRepository<Constellations, String>
{

}
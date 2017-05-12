package com.pra.iprapoc.service;

import com.pra.iprapoc.model.Link;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
    @Cacheable("mainmenu")
    @Query("SELECT l FROM Link l WHERE l.recordType.name = 'Main Menu Item' ORDER BY l.weight, l.name")
    List<Link> leftMenuLinks();
}

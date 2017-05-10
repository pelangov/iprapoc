package com.pra.iprapoc.service;

import com.pra.iprapoc.model.Link;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
    @Cacheable("mainmenu")
    List<Link> findByRecordTypeNameOrderByWeightAscNameAsc(String name);
    @Cacheable("submenu")
    List<Link> findByRecordTypeNameAndParentLinkSfIdOrderByWeightAscNameAsc(String name, String parentLink);
}

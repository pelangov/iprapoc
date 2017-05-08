package com.pra.iprapoc.service;

import com.pra.iprapoc.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface POCRepository extends JpaRepository<Record, Long> {
}

package com.thinhung.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinhung.restful.model.domain.Goods;;

public interface GoodsRepository extends JpaRepository<Goods, Long> {

}
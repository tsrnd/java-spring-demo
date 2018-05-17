package com.thinhung.restful.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thinhung.restful.model.domain.Material;

public interface MaterialRepository extends JpaRepository<Material, Long> {
	
	@Query(value = "SELECT m.name FROM Material m") 
	public Page<Material> getAll(Pageable pageable);
}

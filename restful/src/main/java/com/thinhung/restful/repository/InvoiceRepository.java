package com.thinhung.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinhung.restful.model.entity.InvoiceEntity;
import com.thinhung.restful.repository.extensions.InvoiceRepositoryExtensions;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Long>, InvoiceRepositoryExtensions {	

}

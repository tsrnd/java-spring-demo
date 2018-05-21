package vn.dl.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.dl.domain.entity.BookEntity;

public interface BookCommandRepository extends JpaRepository<BookEntity, Long> {

}

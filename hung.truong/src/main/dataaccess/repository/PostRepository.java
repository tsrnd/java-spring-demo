package main.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.domain.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>, PostRepositoryExtension {

}

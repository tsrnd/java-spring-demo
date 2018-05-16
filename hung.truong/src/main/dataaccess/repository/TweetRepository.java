package main.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.domain.entity.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long>, TweetRepositoryExtension {
}

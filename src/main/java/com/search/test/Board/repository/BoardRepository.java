package com.search.test.Board.repository;


import com.search.test.Board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Board,Long> {
}

package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer>{

}

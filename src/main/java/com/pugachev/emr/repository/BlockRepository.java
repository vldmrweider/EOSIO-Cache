package com.pugachev.emr.repository;

import com.pugachev.emr.model.Block;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlockRepository extends MongoRepository<Block, String> {


    @Override
    List<Block> findAll();

    @Query(value = "{ 'block_num' : ?0 }")
    Block findByBlock_num(int block_num);
}
package com.pugachev.emr.repository;

import com.pugachev.emr.model.Block;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends MongoRepository<Block, String> {

    Block findTop1ByOrderByIdDesc();

    @Query(value = "{ 'block_num' : ?0 }")
    Block findByBlock_num(int block_num);
}
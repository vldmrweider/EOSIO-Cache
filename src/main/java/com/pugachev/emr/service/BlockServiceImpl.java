package com.pugachev.emr.service;

import com.pugachev.emr.model.Block;
import com.pugachev.emr.repository.BlockRepository;
import com.pugachev.emr.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockRepository blockRepository;


    @Override
    public List<Block> findAll() {
        return null;
    }

    @Override
    public Block block(int block_num) {
        return blockRepository.findByBlock_num(block_num);
    }
}

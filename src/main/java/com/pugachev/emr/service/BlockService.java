package com.pugachev.emr.service;

import com.pugachev.emr.model.Block;

import java.util.List;

public interface BlockService {
    Block lastblock();

    Block block(int block_num);


}
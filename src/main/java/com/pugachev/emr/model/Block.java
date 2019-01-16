package com.pugachev.emr.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blocks")
public class Block {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    private int block_num;

    public int getBlock_num() {
        return block_num;
    }

    public void setBlock_num(int block_num) {
        this.block_num = block_num;
    }

    private BlockDetail block;

    public BlockDetail getBlock() {
        return block;
    }

}

package com.pugachev.emr.controller;

import com.pugachev.emr.model.Block;
import com.pugachev.emr.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockController {

    @Autowired
    private BlockService blockService;

    // list of all employee
    @RequestMapping(value = "list", method = RequestMethod.GET)   // or use @GetMapping
    public java.util.List<Block> listEmployee() {
        return blockService.findAll();
    }

    @RequestMapping(value = "block", method = RequestMethod.GET)   // or use @GetMapping
    public Block block(@RequestParam("block_num") int block_num) {
        return blockService.block(block_num);
    }
}

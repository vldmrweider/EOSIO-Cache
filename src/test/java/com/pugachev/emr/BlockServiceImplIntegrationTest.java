package com.pugachev.emr;

import com.pugachev.emr.model.Block;
import com.pugachev.emr.repository.BlockRepository;
import com.pugachev.emr.service.BlockService;
import com.pugachev.emr.service.BlockServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class BlockServiceImplIntegrationTest {

    @TestConfiguration
    static class BlockServiceImplTestContextConfiguration {

        @Bean
        public BlockService blockService() {
            return new BlockServiceImpl();
        }
    }

    @Autowired
    private BlockService blockService;

    @MockBean
    private BlockRepository blockRepository;


    @Before
    public void setUp() {
        Block block = new Block();
        block.setBlock_num(777);

        Mockito.when(blockRepository.findByBlock_num(block.getBlock_num())).thenReturn(block);
    }

    @Test
    public void whenValidBlockNum_thenBlockShouldBeFound() {
        int block_num = 777;
        Block found = blockService.block(block_num);

        assertThat(found.getBlock_num()).isEqualTo(block_num);
    }
}

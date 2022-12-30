package com.mvrsoftware.rebrickable.service;

import com.mvrsoftware.rebrickable.model.BrickSet;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RebrickableServiceTest {


    private RebrickableService rebrickableService = new RebrickableService();

    @Test
    public void testGetBrickSet() throws Exception {
        //Given
        int setNumber = 1;

        //When
        BrickSet brickSet = rebrickableService.getSet(setNumber);

        //Then
        assertThat(brickSet).isNotNull();
    }
}

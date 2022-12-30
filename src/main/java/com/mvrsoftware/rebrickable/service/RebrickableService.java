package com.mvrsoftware.rebrickable.service;

import com.mvrsoftware.rebrickable.model.BrickSet;
import org.springframework.stereotype.Component;

@Component
public class RebrickableService {

    public BrickSet getSet(int setID) {
        BrickSet brickSet = new BrickSet();
        brickSet.setSetNumber("1");
        brickSet.setSetUrl("http://www.ggoogle.com");
        brickSet.setImageUrl("http://www.google.com");
        brickSet.setNumberParts(1000);
        brickSet.setThemeId(1);
        brickSet.setYear(2002);
        return brickSet;

    }
}

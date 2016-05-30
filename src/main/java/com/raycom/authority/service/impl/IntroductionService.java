package com.raycom.authority.service.impl;

import com.raycom.authority.service.IIntroductionService;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by dingjinlin on 16-5-30.
 */
public class IntroductionService implements IIntroductionService {
    @Override
    public void induct() {
        System.out.println("========== introduction");
    }

    @Override
    public void before(String param) {
        System.out.println("Introduction service before(" + param + ")");
    }
}

package com.raycom.authority.service.impl;

import com.raycom.authority.info.AdminInfo;
import com.raycom.authority.service.IManageOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dingjinlin on 16-5-27.
 */
public class GroupManageOperation implements IManageOperation<AdminInfo> {
    private Map<Long, String> groups = new HashMap<>();

    @Override
    public void addInfo(AdminInfo adminInfo, Object... info) {

    }

    @Override
    public void listInfo(AdminInfo adminInfo, Object... info) {

    }

    @Override
    public void findInfo(AdminInfo adminInfo, Object... info) {

    }

    @Override
    public void modifyInfo(AdminInfo adminInfo, Object... info) {

    }

    @Override
    public void changeStatusInfo(AdminInfo adminInfo, Object... info) {

    }

    @Override
    public void removeInfo(AdminInfo adminInfo, Object... info) {

    }

    @Override
    public void delInfo(AdminInfo adminInfo, Object... info) {

    }
}

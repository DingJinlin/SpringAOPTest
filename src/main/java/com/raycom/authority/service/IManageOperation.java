package com.raycom.authority.service;

/**
 * Created by dingjinlin on 16-5-27.
 */
public interface IManageOperation<ADMIN> {
    /**
     * 增加信息
     * @param admin
     * @param info
     */
    public void addInfo(ADMIN admin, Object... info);

    /**
     * 获取列表
     * @param admin
     * @param info
     */
    public void listInfo(ADMIN admin, Object... info);

    /**
     * 获取单条信息
     * @param info
     */
    public void findInfo(ADMIN admin, Object... info);

    /**
     * 修改信息
     * @param admin
     * @param info
     */
    public void modifyInfo(ADMIN admin, Object... info);

    /**
     * 变更状态
     * @param admin
     * @param info
     */
    public void changeStatusInfo(ADMIN admin, Object... info);

    /**
     * 移除信息
     * @param admin
     * @param info
     */
    public void removeInfo(ADMIN admin, Object... info);

    /**
     * 删除信息
     * @param admin
     * @param info
     */
    public void delInfo(ADMIN admin, Object... info);
}

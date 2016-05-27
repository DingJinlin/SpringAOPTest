package com.raycom.authority.info;

/**
 * Created by dingjinlin on 16-5-27.
 */
public class AdminInfo {
    long id;
    String name;

    public AdminInfo(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

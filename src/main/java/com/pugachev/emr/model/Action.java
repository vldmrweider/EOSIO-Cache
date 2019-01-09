package com.pugachev.emr.model;

import java.util.Map;

public class Action {
    private String account;

    public String getAccount() {
        return account;
    }

    private String name;

    public String getName() {
        return name;
    }

    private Map<String, Object> data;

    public Map<String, Object> getData() {
        return data;
    }
}

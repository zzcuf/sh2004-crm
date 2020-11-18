package com.excise.crm.setting.bean;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description: TODO
 * @author: FLY
 * @date: 2020/11/18 10:00
 * @version: v1.0
 */
@Table(name = "tbl_user")
public class User {
    @Id
    private String id;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

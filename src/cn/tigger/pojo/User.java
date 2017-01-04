package cn.tigger.pojo;

import java.io.Serializable;

/**
 * Created by bowen on 2017/1/4.
 */
public class User implements Serializable {

    private String username;
    private String id;
    private String desc;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

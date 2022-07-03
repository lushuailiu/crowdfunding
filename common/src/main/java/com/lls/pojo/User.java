package com.lls.pojo;

import org.apache.ibatis.type.Alias;
import org.codehaus.jackson.annotate.JsonProperty;


public class User {
    @JsonProperty(value = "id")
    private Integer id;
    @JsonProperty(value = "loginacct")

    private String loginacct;
    @JsonProperty(value = "password")

    private String password;
    @JsonProperty(value = "username")

    private String username;
    @JsonProperty(value = "email")

    private String email;
    @JsonProperty(value = "createdate")

    private String createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
}

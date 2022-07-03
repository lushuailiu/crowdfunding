package com.lls.pojo;

import org.codehaus.jackson.annotate.JsonProperty;


public class Role {

    @JsonProperty(value = "id")
    private Integer id;

    @JsonProperty(value = "role")
    private String role;

    @JsonProperty(value = "createdate")
    private String createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
}

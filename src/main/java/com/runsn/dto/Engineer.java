package com.runsn.dto;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Title: Engineer
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class Engineer implements Serializable {
    private Integer id;
    private String name;
    private String desctription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesctription() {
        return desctription;
    }

    public void setDesctription(String desctription) {
        this.desctription = desctription;
    }
}

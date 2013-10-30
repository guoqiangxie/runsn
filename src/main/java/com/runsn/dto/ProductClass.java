package com.runsn.dto;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Title: ProductClass
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class ProductClass implements Serializable {
    private Integer id;
    private String className;
    private String classDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }
}

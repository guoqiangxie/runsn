package com.runsn.dto;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Title: Type
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class Type implements Serializable {
    private Integer id;
    private String title1;
    private Integer title1code;
    private String title2;
    private Integer title2code;
    private String title3;
    private Integer title3code;
    private Integer active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public Integer getTitle1code() {
        return title1code;
    }

    public void setTitle1code(Integer title1code) {
        this.title1code = title1code;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public Integer getTitle2code() {
        return title2code;
    }

    public void setTitle2code(Integer title2code) {
        this.title2code = title2code;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public Integer getTitle3code() {
        return title3code;
    }

    public void setTitle3code(Integer title3code) {
        this.title3code = title3code;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}

package com.runsn.dto;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Title: Document
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class Document implements Serializable {
    private Integer id;
    private String name;
    private String content;
    private String title;
    private String keywords;
    private String description;
    private Integer typeid;
    private Integer active;
    private Integer mainLevel;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getMainLevel() {
        return mainLevel;
    }

    public void setMainLevel(Integer mainLevel) {
        this.mainLevel = mainLevel;
    }
}

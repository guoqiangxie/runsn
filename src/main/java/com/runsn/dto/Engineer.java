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
    private String aptitude;//资质
    private String image;
    private String experiences;
    private Integer age;
    private String title;

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

    public String getAptitude() {
        return aptitude;
    }

    public void setAptitude(String aptitude) {
        this.aptitude = aptitude;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getExperiences() {
        return experiences;
    }

    public void setExperiences(String experiences) {
        this.experiences = experiences;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

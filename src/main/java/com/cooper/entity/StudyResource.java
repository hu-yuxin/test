package com.cooper.entity;

public class StudyResource {
    private Integer id;
    private String type;
    private String resourceName;
    private String description;
    private String pictureUrl;


    public StudyResource() {
    }

    public StudyResource(Integer id, String type, String resourceName, String description, String pictureUrl) {
        this.id = id;
        this.type = type;
        this.resourceName = resourceName;
        this.description = description;
        this.pictureUrl = pictureUrl;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取
     * @return pictureUrl
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * 设置
     * @param pictureUrl
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String toString() {
        return "StudyResource{id = " + id + ", type = " + type + ", resourceName = " + resourceName + ", description = " + description + ", pictureUrl = " + pictureUrl + "}";
    }
}

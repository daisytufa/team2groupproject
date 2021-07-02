package com.itlize.firstProject.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Resource {
    @Id
    @GeneratedValue
    private Long resourceID;
    private String resourceName;
    private String resourceCode;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "project_Resource", joinColumns = {@JoinColumn(name = "projectResourceID"), @JoinColumn(name = "projectID")},
            inverseJoinColumns = {@JoinColumn(name = "resourceID")}
    )
    private Set<Project> projects = new HashSet<>();

    public Resource(Long resourceID, String resourceName, String resourceCode, Set<Project> projects) {
        this.resourceID = resourceID;
        this.resourceName = resourceName;
        this.resourceCode = resourceCode;
        this.projects = projects;
    }

    public Resource(long resourceID, String resource1, String resourceCode) {

    }

    public Resource() {

    }

    public Long getResourceID() {
        return resourceID;
    }

    public void setResourceID(Long resourceID) {
        this.resourceID = resourceID;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }
}


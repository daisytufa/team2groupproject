
package com.itlize.firstProject.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project_Resources {
    @Id
    @GeneratedValue
    private Long projectResourceID;
    private Long projectID;
    private Long resourceID;

    public Project_Resources(long projectResourceID, long projectID, long resourceID) {
    }

    public Project_Resources() {

    }

    public Long getProjectResourceID() {
        return projectResourceID;
    }

    public void setProjectResourceID(Long projectResourceID) {
        this.projectResourceID = projectResourceID;
    }

    public Long getProjectID() {
        return projectID;
    }

    public void setProjectID(Long projectID) {
        this.projectID = projectID;
    }

    public Long getResourceID() {
        return resourceID;
    }

    public void setResourceID(Long resourceID) {
        this.resourceID = resourceID;
    }
}


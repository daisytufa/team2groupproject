
package com.itlize.firstProject.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ProjectUser {
    @Id
    @GeneratedValue
    private Long projectResourceID;
    private Long projectID;
    private Long resourceID;

    public ProjectUser(Long projectResourceID, Long projectID, Long resourceID) {
    }

    public ProjectUser() {

    }


    public Long getProjectResourceID() {
        return projectResourceID;
    }

    public void setProjectResourceID(Long projectResourceID) {
        this.projectResourceID = projectResourceID;
    }

    public long getProjectID() {
        return projectID;
    }

    public void setProjectID(long projectID) {
        this.projectID = projectID;
    }

    public long getResourceID() {
        return resourceID;
    }

    public void setResourceID(long resourceID) {
        this.resourceID = resourceID;
    }
}


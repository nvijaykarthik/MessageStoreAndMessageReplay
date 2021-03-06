package io.github.nvijaykarthik.flexifeature.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroupApplicationXref {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    String groupCode;
    @Column
    String applicationCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    @Override
    public String toString() {
        return "GroupApplicationXref [applicationCode=" + applicationCode + ", groupCode=" + groupCode + ", id=" + id
                + "]";
    }
}

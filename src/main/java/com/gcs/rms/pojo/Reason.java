package com.gcs.rms.pojo;

// Generated Mar 7, 2014 3:40:16 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Reason generated by hbm2java
 */
@Entity
@Table(name = "reason", catalog = "rmsdb")
public class Reason implements java.io.Serializable {

    private Integer reasonId;

    private String reasonName;

    private Integer code;

    private String description;

    private Set<ReasonPhase> reasonPhases = new HashSet<ReasonPhase>(0);

    public Reason() {
    }

    public Reason(String reasonName, Integer code, String description, Set<ReasonPhase> reasonPhases) {
        this.reasonName = reasonName;
        this.code = code;
        this.description = description;
        this.reasonPhases = reasonPhases;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Reason_ID", unique = true, nullable = false)
    public Integer getReasonId() {
        return this.reasonId;
    }

    public void setReasonId(Integer reasonId) {
        this.reasonId = reasonId;
    }

    @Column(name = "Reason_Name", length = 50)
    public String getReasonName() {
        return this.reasonName;
    }

    public void setReasonName(String reasonName) {
        this.reasonName = reasonName;
    }

    @Column(name = "Code")
    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Column(name = "Description", length = 1000)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "reason")
    public Set<ReasonPhase> getReasonPhases() {
        return this.reasonPhases;
    }

    public void setReasonPhases(Set<ReasonPhase> reasonPhases) {
        this.reasonPhases = reasonPhases;
    }

}

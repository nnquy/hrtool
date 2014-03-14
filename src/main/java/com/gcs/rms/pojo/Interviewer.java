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
 * Interviewer generated by hbm2java
 */
@Entity
@Table(name = "interviewer", catalog = "rmsdb")
public class Interviewer implements java.io.Serializable {

    private Integer interviewerId;

    private String interviewName;

    private String phone;

    private String email;

    private String picture;

    private Set<ScheduleInterviewInterviewer> scheduleInterviewInterviewers = new HashSet<ScheduleInterviewInterviewer>(
            0);

    public Interviewer() {
    }

    public Interviewer(String interviewName, String phone, String email, String picture,
            Set<ScheduleInterviewInterviewer> scheduleInterviewInterviewers) {
        this.interviewName = interviewName;
        this.phone = phone;
        this.email = email;
        this.picture = picture;
        this.scheduleInterviewInterviewers = scheduleInterviewInterviewers;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Interviewer_ID", unique = true, nullable = false)
    public Integer getInterviewerId() {
        return this.interviewerId;
    }

    public void setInterviewerId(Integer interviewerId) {
        this.interviewerId = interviewerId;
    }

    @Column(name = "Interview_Name", length = 50)
    public String getInterviewName() {
        return this.interviewName;
    }

    public void setInterviewName(String interviewName) {
        this.interviewName = interviewName;
    }

    @Column(name = "Phone", length = 50)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "Email", length = 50)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "Picture", length = 50)
    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewer")
    public Set<ScheduleInterviewInterviewer> getScheduleInterviewInterviewers() {
        return this.scheduleInterviewInterviewers;
    }

    public void setScheduleInterviewInterviewers(Set<ScheduleInterviewInterviewer> scheduleInterviewInterviewers) {
        this.scheduleInterviewInterviewers = scheduleInterviewInterviewers;
    }

}

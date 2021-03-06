package com.gcs.rms.pojo;

// Generated Mar 7, 2014 3:40:16 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ScheduleInterviewInterviewer generated by hbm2java
 */
@Entity
@Table(name = "schedule_interview_interviewer", catalog = "rmsdb")
public class ScheduleInterviewInterviewer implements java.io.Serializable {

    private Integer scheduleInterviewInterviewerId;

    private Interviewer interviewer;

    private ScheduleInterview scheduleInterview;

    public ScheduleInterviewInterviewer() {
    }

    public ScheduleInterviewInterviewer(Interviewer interviewer, ScheduleInterview scheduleInterview) {
        this.interviewer = interviewer;
        this.scheduleInterview = scheduleInterview;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Schedule_Interview_Interviewer_ID", unique = true, nullable = false)
    public Integer getScheduleInterviewInterviewerId() {
        return this.scheduleInterviewInterviewerId;
    }

    public void setScheduleInterviewInterviewerId(Integer scheduleInterviewInterviewerId) {
        this.scheduleInterviewInterviewerId = scheduleInterviewInterviewerId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Interviewer_ID")
    public Interviewer getInterviewer() {
        return this.interviewer;
    }

    public void setInterviewer(Interviewer interviewer) {
        this.interviewer = interviewer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Schedule_Interview_ID")
    public ScheduleInterview getScheduleInterview() {
        return this.scheduleInterview;
    }

    public void setScheduleInterview(ScheduleInterview scheduleInterview) {
        this.scheduleInterview = scheduleInterview;
    }

}

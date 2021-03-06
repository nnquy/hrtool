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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Application generated by hbm2java
 */
@Entity
@Table(name = "application", catalog = "rmsdb")
public class Application implements java.io.Serializable {

    private Integer applicationId;

    private Vacancy vacancy;

    private Phase phase;

    private Integer total;

    private Integer pass;

    private Integer reject;

    private Set<CandidateApplication> candidateApplications = new HashSet<CandidateApplication>(0);

    public Application() {
    }

    public Application(Vacancy vacancy, Phase phase, Integer total, Integer pass, Integer reject,
            Set<CandidateApplication> candidateApplications) {
        this.vacancy = vacancy;
        this.phase = phase;
        this.total = total;
        this.pass = pass;
        this.reject = reject;
        this.candidateApplications = candidateApplications;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Application_ID", unique = true, nullable = false)
    public Integer getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Vacancy_ID")
    public Vacancy getVacancy() {
        return this.vacancy;
    }

    public void setVacancy(Vacancy vacancy) {
        this.vacancy = vacancy;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Phase_ID")
    public Phase getPhase() {
        return this.phase;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    @Column(name = "Total")
    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Column(name = "Pass")
    public Integer getPass() {
        return this.pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    @Column(name = "Reject")
    public Integer getReject() {
        return this.reject;
    }

    public void setReject(Integer reject) {
        this.reject = reject;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "application")
    public Set<CandidateApplication> getCandidateApplications() {
        return this.candidateApplications;
    }

    public void setCandidateApplications(Set<CandidateApplication> candidateApplications) {
        this.candidateApplications = candidateApplications;
    }

}

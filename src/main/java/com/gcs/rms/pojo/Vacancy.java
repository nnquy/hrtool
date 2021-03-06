package com.gcs.rms.pojo;

// Generated Mar 7, 2014 3:40:16 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vacancy generated by hbm2java
 */
@Entity
@Table(name = "vacancy", catalog = "rmsdb")
public class Vacancy implements java.io.Serializable {

    private Integer vacancyId;

    private Manager manager;

    private Division division;

    private Status status;

    private Position position;

    private String vacancyName;

    private Integer number;

    private Date startDate;

    private Date endDate;

    private String yearOfExperience;

    private Integer workingLocationId;

    private String description;

    private Date createDate;

    private Set<VacancySkill> vacancySkills = new HashSet<VacancySkill>(0);

    private Set<WorkingLocation> workingLocations = new HashSet<WorkingLocation>(0);

    private Set<Application> applications = new HashSet<Application>(0);

    public Vacancy() {
    }

    public Vacancy(Manager manager, Division division, Status status, Position position, String vacancyName,
            Integer number, Date startDate, Date endDate, String yearOfExperience, Integer workingLocationId,
            String description, Date createDate, Set<VacancySkill> vacancySkills,
            Set<WorkingLocation> workingLocations, Set<Application> applications) {
        this.manager = manager;
        this.division = division;
        this.status = status;
        this.position = position;
        this.vacancyName = vacancyName;
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
        this.yearOfExperience = yearOfExperience;
        this.workingLocationId = workingLocationId;
        this.description = description;
        this.createDate = createDate;
        this.vacancySkills = vacancySkills;
        this.workingLocations = workingLocations;
        this.applications = applications;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Vacancy_ID", unique = true, nullable = false)
    public Integer getVacancyId() {
        return this.vacancyId;
    }

    public void setVacancyId(Integer vacancyId) {
        this.vacancyId = vacancyId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Manager_ID")
    public Manager getManager() {
        return this.manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Division_ID")
    public Division getDivision() {
        return this.division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Vacancy_Status_ID")
    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Position_ID")
    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Column(name = "Vacancy_Name", length = 50)
    public String getVacancyName() {
        return this.vacancyName;
    }

    public void setVacancyName(String vacancyName) {
        this.vacancyName = vacancyName;
    }

    @Column(name = "Number")
    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Start_Date", length = 19)
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "End_Date", length = 19)
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Column(name = "Year_Of_Experience", length = 50)
    public String getYearOfExperience() {
        return this.yearOfExperience;
    }

    public void setYearOfExperience(String yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    @Column(name = "Working_Location_ID")
    public Integer getWorkingLocationId() {
        return this.workingLocationId;
    }

    public void setWorkingLocationId(Integer workingLocationId) {
        this.workingLocationId = workingLocationId;
    }

    @Column(name = "Description", length = 1000)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Create_Date", length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vacancy")
    public Set<VacancySkill> getVacancySkills() {
        return this.vacancySkills;
    }

    public void setVacancySkills(Set<VacancySkill> vacancySkills) {
        this.vacancySkills = vacancySkills;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vacancy")
    public Set<WorkingLocation> getWorkingLocations() {
        return this.workingLocations;
    }

    public void setWorkingLocations(Set<WorkingLocation> workingLocations) {
        this.workingLocations = workingLocations;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vacancy")
    public Set<Application> getApplications() {
        return this.applications;
    }

    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }

}

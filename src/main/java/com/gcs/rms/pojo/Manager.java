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
 * Manager generated by hbm2java
 */
@Entity
@Table(name = "manager", catalog = "rmsdb")
public class Manager implements java.io.Serializable {

    private Integer managerId;

    private String managerName;

    private String phone;

    private String email;

    private String picture;

    private Set<Vacancy> vacancies = new HashSet<Vacancy>(0);

    public Manager() {
    }

    public Manager(String managerName, String phone, String email, String picture, Set<Vacancy> vacancies) {
        this.managerName = managerName;
        this.phone = phone;
        this.email = email;
        this.picture = picture;
        this.vacancies = vacancies;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Manager_ID", unique = true, nullable = false)
    public Integer getManagerId() {
        return this.managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Column(name = "Manager_Name", length = 50)
    public String getManagerName() {
        return this.managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "manager")
    public Set<Vacancy> getVacancies() {
        return this.vacancies;
    }

    public void setVacancies(Set<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }

}

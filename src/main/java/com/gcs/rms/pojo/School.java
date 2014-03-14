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
 * School generated by hbm2java
 */
@Entity
@Table(name = "school", catalog = "rmsdb")
public class School implements java.io.Serializable {

    private Integer schoolId;

    private String schoolName;

    private String address;

    private Set<EducationCertificate> educationCertificates = new HashSet<EducationCertificate>(0);

    public School() {
    }

    public School(String schoolName, String address, Set<EducationCertificate> educationCertificates) {
        this.schoolName = schoolName;
        this.address = address;
        this.educationCertificates = educationCertificates;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "School_ID", unique = true, nullable = false)
    public Integer getSchoolId() {
        return this.schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @Column(name = "School_Name", length = 50)
    public String getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Column(name = "Address", length = 50)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
    public Set<EducationCertificate> getEducationCertificates() {
        return this.educationCertificates;
    }

    public void setEducationCertificates(Set<EducationCertificate> educationCertificates) {
        this.educationCertificates = educationCertificates;
    }

}

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
 * SkillLevel generated by hbm2java
 */
@Entity
@Table(name = "skill_level", catalog = "rmsdb")
public class SkillLevel implements java.io.Serializable {

    private Integer skillLevelId;

    private String skillLevelName;

    private Integer code;

    private String description;

    private Set<Skill> skills = new HashSet<Skill>(0);

    public SkillLevel() {
    }

    public SkillLevel(String skillLevelName, Integer code, String description, Set<Skill> skills) {
        this.skillLevelName = skillLevelName;
        this.code = code;
        this.description = description;
        this.skills = skills;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Skill_Level_ID", unique = true, nullable = false)
    public Integer getSkillLevelId() {
        return this.skillLevelId;
    }

    public void setSkillLevelId(Integer skillLevelId) {
        this.skillLevelId = skillLevelId;
    }

    @Column(name = "Skill_level_Name", length = 50)
    public String getSkillLevelName() {
        return this.skillLevelName;
    }

    public void setSkillLevelName(String skillLevelName) {
        this.skillLevelName = skillLevelName;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "skillLevel")
    public Set<Skill> getSkills() {
        return this.skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

}

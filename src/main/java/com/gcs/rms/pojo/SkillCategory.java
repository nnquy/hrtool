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
 * SkillCategory generated by hbm2java
 */
@Entity
@Table(name = "skill_category", catalog = "rmsdb")
public class SkillCategory implements java.io.Serializable {

    private Integer skillCategoryId;

    private String skillCategoryName;

    private Set<SkillMaster> skillMasters = new HashSet<SkillMaster>(0);

    public SkillCategory() {
    }

    public SkillCategory(String skillCategoryName, Set<SkillMaster> skillMasters) {
        this.skillCategoryName = skillCategoryName;
        this.skillMasters = skillMasters;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Skill_Category_ID", unique = true, nullable = false)
    public Integer getSkillCategoryId() {
        return this.skillCategoryId;
    }

    public void setSkillCategoryId(Integer skillCategoryId) {
        this.skillCategoryId = skillCategoryId;
    }

    @Column(name = "Skill_Category_Name", length = 50)
    public String getSkillCategoryName() {
        return this.skillCategoryName;
    }

    public void setSkillCategoryName(String skillCategoryName) {
        this.skillCategoryName = skillCategoryName;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "skillCategory")
    public Set<SkillMaster> getSkillMasters() {
        return this.skillMasters;
    }

    public void setSkillMasters(Set<SkillMaster> skillMasters) {
        this.skillMasters = skillMasters;
    }

}

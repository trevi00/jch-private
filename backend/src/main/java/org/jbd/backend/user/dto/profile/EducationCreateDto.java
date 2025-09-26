package org.jbd.backend.user.dto.profile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.jbd.backend.user.domain.enums.EducationLevel;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EducationCreateDto {
    
    @NotNull(message = "교육 수준은 필수입니다.")
    private EducationLevel educationLevel;
    
    @NotBlank(message = "학교명은 필수입니다.")
    private String schoolName;
    
    private String major;
    private Integer graduationYear;
    private LocalDate graduationDate;
    private BigDecimal gpa;
    private BigDecimal maxGpa;
    
    protected EducationCreateDto() {}
    
    public EducationCreateDto(EducationLevel educationLevel, String schoolName, String major,
                             Integer graduationYear, LocalDate graduationDate, BigDecimal gpa, BigDecimal maxGpa) {
        this.educationLevel = educationLevel;
        this.schoolName = schoolName;
        this.major = major;
        this.graduationYear = graduationYear;
        this.graduationDate = graduationDate;
        this.gpa = gpa;
        this.maxGpa = maxGpa;
    }
    
    // Getters
    public EducationLevel getEducationLevel() {
        return educationLevel;
    }
    
    public String getSchoolName() {
        return schoolName;
    }
    
    public String getMajor() {
        return major;
    }
    
    public Integer getGraduationYear() {
        return graduationYear;
    }
    
    public LocalDate getGraduationDate() {
        return graduationDate;
    }
    
    public BigDecimal getGpa() {
        return gpa;
    }
    
    public BigDecimal getMaxGpa() {
        return maxGpa;
    }
}
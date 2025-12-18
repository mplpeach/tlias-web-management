package com.itheima.service;

import com.itheima.pojo.JobOption;
import com.itheima.pojo.StudentInClazzCountOption;

import java.util.List;
import java.util.Map;

public interface ReportService {

    JobOption getEmpJobData();

    List<Map<String, Object>> getEmpGenderData();

    StudentInClazzCountOption getStudentCountData();

    List<Map<String, Object>> getStudentDegreeData();
}

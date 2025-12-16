package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpQueryParam {
    private String name; // 姓名
    private Integer gender;// 性别
    private LocalDate begin;// 入职日期--开始
    private LocalDate end;// 入职日期--结束
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Integer page = 1;// 当前页码
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Integer pageSize = 10;// 每页显示记录数
}

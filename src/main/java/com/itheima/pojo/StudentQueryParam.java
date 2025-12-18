package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentQueryParam {
    private String name; // 姓名
    private Integer degree; // 学历
    private Integer clazzId; // 班级ID
    private Integer page; // 页码
    private Integer pageSize; // 每页条数
}

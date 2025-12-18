package com.itheima.exception;

public class DeptHasEmpException extends RuntimeException {
    public DeptHasEmpException() {
        super("该部门下仍存在员工，无法删除");
    }

    public DeptHasEmpException(String message) {
        super(message);
    }
}

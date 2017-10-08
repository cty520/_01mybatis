package cn.happy.entity;

/**
 * Created by Happy on 2017-09-14.
 * 部门实体
 */
public class Dept {
    private Integer deptno;
    private String deptname2;
    //快速封装属性的快捷键是 alt+insert键
    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDeptname2() {
        return deptname2;
    }

    public void setDeptname2(String deptname) {
        this.deptname2 = deptname;
    }
}

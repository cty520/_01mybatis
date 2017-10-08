package cn.happy.dao;

import entity.Dept;

import java.util.List;

/**
 * Created by Happy on 2017-09-14.
 * 部门接口
 */
public interface IDeptDAO {
    //查询所有  alt+enter alt+回车
    public List<Dept> findAll();
    //2.添加部门
    public int addDept(Dept dept);
    //3.修改部门
    public int editDept(Dept dept);
    //4.删除部门
    public int delDept(int deptno);
}

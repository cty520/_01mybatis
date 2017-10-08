package cn.happy.dao;

import cn.happy.entity.Dept;

import java.util.List;

/**
 * Created by adminastrator on 2017/9/17.
 */
public interface IDeptDAO {
    //查询部门
    public List<Dept> findAll();
    //添加部门
    public int addDept(Dept dept);
    //修改部门
    public int editDept(Dept dept);
    //删除
    public int delDept(int deptno);
}

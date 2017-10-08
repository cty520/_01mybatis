package cn.happy.dao;

import cn.happy.entity.Dept;
import cn.happy.entity.Emp;

import java.util.List;

/**
 * Created by Happy on 2017-09-14.
 * 部门接口
 */
public interface IEmpDAO {
    //查询所有 员工
    public List<Emp> findAll();

}

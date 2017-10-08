package cn.happy.entity;

import java.util.Date;

/**
 * Created by Happy on 2017-09-16.
 */
public class StudentInfo {
    private Integer stuid;
    private String stuname;
    private Integer stuage;
    private Date studate;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public Date getStudate() {
        return studate;
    }

    public void setStudate(Date studate) {
        this.studate = studate;
    }
}

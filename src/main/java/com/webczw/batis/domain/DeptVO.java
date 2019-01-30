package com.webczw.batis.domain;

import java.io.Serializable;

/**
 * @author Wilber
 */
public class DeptVO implements Serializable {
    private static final long serialVersionUID = -7895646746317534348L;
    private Long deptNO;
    private String name;
    private String loc;

    public Long getDeptNO() {
        return deptNO;
    }

    public void setDeptNO(Long deptNO) {
        this.deptNO = deptNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "DeptVO{" +
                "deptNO=" + deptNO +
                ", name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}

package cn.xym.dtool.dao;

import cn.xym.dtool.vo.Staff;

public interface  IStaffDao {
    Staff getStaffByName(String username);
    int updateStaffMac(Staff staff);
}

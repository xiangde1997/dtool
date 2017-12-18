package cn.xym.dtool.service.impl;
import cn.xym.dtool.dao.IStaffDao;
import cn.xym.dtool.service.IStaffService;
import cn.xym.dtool.vo.Staff;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StaffService implements IStaffService {
    @Resource
    private IStaffDao staffDao;

    @Override
    public String login(String username, String password) {
        Staff staff=staffDao.getStaffByName(username);
        if(null!=staff&&password.equals(staff.getLoginpwd())){
            staff.setLastmac("123456");
            staffDao.updateStaffMac(staff);
            return "success";
        }
        else
            return "false";
    }
}

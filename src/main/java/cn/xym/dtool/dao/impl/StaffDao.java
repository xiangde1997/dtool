package cn.xym.dtool.dao.impl;
import cn.xym.dtool.dao.IStaffDao;
import cn.xym.dtool.vo.Staff;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StaffDao extends SqlSessionDaoSupport implements IStaffDao {
    @Autowired
    public StaffDao(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public Staff getStaffByName(String username) {
        return (Staff)(getSqlSession().selectOne("cn.xym.dtool.dao.IStaffDao.getStaffByName",username));
    }

    @Override
    public int updateStaffMac(Staff staff) {
        return getSqlSession().update("cn.xym.dtool.dao.IStaffDao.updateStaffMac",staff);
    }


}

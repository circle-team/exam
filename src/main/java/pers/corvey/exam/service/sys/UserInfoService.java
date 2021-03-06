//package pers.corvey.exam.service.sys;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Service;
//import pers.corvey.exam.dao.UserInfoDAO;
//import pers.corvey.exam.entity.sys.SysUser;
//import pers.corvey.exam.entity.SysUserInfo;
//import pers.corvey.exam.service.common.BaseServiceImpl;
//
//@Service
//public class UserInfoService extends BaseServiceImpl<SysUser, Long> {
//    /**
//     * 为父类注入mainDAO
//     *
//     * @param mainDAO 该service主要用到的dao实例
//     */
//    private final UserInfoDAO userInfoDao;
//
//    @Autowired
//    public UserInfoService(CrudRepository<SysUser, Long> mainDAO, UserInfoDAO userInfoDao) {
//        super(mainDAO);
//        this.userInfoDao = userInfoDao;
//    }
//
//    public SysUserInfo GetUserInfoSerivce(Integer id){
//        return userInfoDao.findSysUserInfoById(id);
//    }
//}

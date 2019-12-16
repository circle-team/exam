package pers.corvey.exam.dao;

import org.springframework.data.repository.CrudRepository;

import pers.corvey.exam.entity.sys.SysUserInfo;

public interface UserInfoDao extends CrudRepository<SysUserInfo,Integer> {
    SysUserInfo findSysUserInfoById(Integer id);
}

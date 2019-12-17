package pers.corvey.exam.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pers.corvey.exam.entity.sys.SysUser;
@Repository
public class SysUserDAOImpl implements SysUserDAO  {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public SysUser findByUsername(String username) {
        return null;
    }

    @Override
    public Iterable<SysUser> findByNameStartingWith(String keyword) {
        return null;
    }

    @Override
    public <S extends SysUser> S save(S s) {
        return null;
    }

    @Override
    public <S extends SysUser> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public SysUser findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<SysUser> findAll() {
        return null;
    }

    @Override
    public Iterable<SysUser> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(SysUser sysUser) {

    }

    @Override
    public void delete(Iterable<? extends SysUser> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}

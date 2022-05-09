package com.zcl.service.impl;

import com.zcl.domain.Account;
import com.zcl.mapper.AccountMapper;
import com.zcl.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 项目名称：zcl_ssm
 * 描述：业务层接口实现类
 *
 * @author zhong
 * @date 2022-05-09 15:40
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    // 因为在applictionContext配置文件中扫描了mapper包，底层会自动帮我们产生mapper的实现类，调用的时候直接调用注入即可

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {
        accountMapper.save(account);
    }

    @Override
    public List<Account> findAll() {
        List<Account> all = accountMapper.findAll();
        return all;
    }
}

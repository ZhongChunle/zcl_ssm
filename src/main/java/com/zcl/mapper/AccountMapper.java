package com.zcl.mapper;

import com.zcl.domain.Account;

import java.util.List;

/**
 * 项目名称：zcl_ssm
 * 描述：账户业务接口
 *
 * @author zhong
 * @date 2022-05-09 15:34
 */
public interface AccountMapper {
    public void save(Account account);

    public List<Account> findAll();
}

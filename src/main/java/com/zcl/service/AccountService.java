package com.zcl.service;

import com.zcl.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名称：zcl_ssm
 * 描述：业务层接口
 *
 * @author zhong
 * @date 2022-05-09 15:37
 */
public interface AccountService {
    public void save(Account account);

    public List<Account> findAll();
}

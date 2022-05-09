package com.zcl.controller;

import com.zcl.domain.Account;
import com.zcl.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 项目名称：zcl_ssm
 * 描述：web层
 *
 * @author zhong
 * @date 2022-05-09 15:43
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    /**
     * 注入需要到对应的包接口上使用
     */
    @Autowired
    private AccountService accountService;
    /**
     * 保存账户数据，保存成功不进行页面跳转，直接字符串展示
     * @param account
     * @return
     */
    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Account account){
        accountService.save(account);
        return "恭喜您保存成功";
    }

    /**
     * 查询账户数据
     * @return
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> all = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList",all);
        modelAndView.setViewName("accountList");
        return modelAndView;
    }
}

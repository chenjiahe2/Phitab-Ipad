package com.hx.phitab.controller;

import com.hx.phitab.model.User;
import com.hx.phitab.service.UserService;
import com.hx.resultTool.Result;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService service;

    @RequestMapping("/info")
    public Result info(String id)
    {
        User user = service.selectOneByKey(id);

        JSONObject obj = new JSONObject();
        obj.put("id", user.getId());

        return Result.success(obj);
    }

    @RequestMapping("/add")
    public Result add(String name, String account)
    {
        User user = new User();
        user.setAccount(account);
        user.setName(name);
        service.add(user);

        return Result.success();
    }

}

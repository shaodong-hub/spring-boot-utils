package com.github.springbootutils.controller;

import com.github.springbootutils.pojo.UserDO;
import com.github.springbootutils.pojo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 创建时间为 09:20 2019-04-15
 * 项目名称 spring-boot-utils
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class UserController {

    @PostMapping("vo")
    public UserVO postUserVO(@RequestBody UserDO userDO) {
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userDO, userVO);
        return userVO;
    }


}

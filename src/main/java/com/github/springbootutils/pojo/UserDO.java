package com.github.springbootutils.pojo;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 创建时间为 09:19 2019-04-15
 * 项目名称 spring-boot-utils
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
public class UserDO {

    private String name;

    private Integer age;

    private String desc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

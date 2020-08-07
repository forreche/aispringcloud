package com.southwind.feign;


import com.southwind.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @Description: aispringcloud
 * @Param:
 * @return:
 * @Author: fxb
 * @Date: 2020/8/8
 */

@FeignClient(value = "provider")
public interface FeignProviderClient {

    /**
     * 查询全部
     *
     * @return
     */
    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    /**
     * 获取端口号
     *
     * @return
     */
    @GetMapping("/student/index")
    String index();

}

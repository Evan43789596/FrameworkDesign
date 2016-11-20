package com.eshare.core.mapping;

import com.eshare.core.config.WebConfig;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.util.Map;

/**
 * Created by liangyh on 2016/11/19.
 * Email:10856214@163.com
 */
public class ActionMapper {

    public ActionMapping findMapping(ServletRequest request) {
        ActionMapping actionMapping = new ActionMapping();
        //把请求实体类型转换成HttpServletRequest
        HttpServletRequest req = (HttpServletRequest) request;
        //从请求实体中获取Uri
        String uri = req.getRequestURI();
        //根据Uri地址截取用户请求的方法名
        String methodName = uri.substring(req.getContextPath().length()+1);
        //从配置文件获取所有规则匹配映射
        WebConfig webConfig = new WebConfig();
        Map<String, Mapping> mappings = webConfig.getMappings();
        //根据请求方法名找到匹配的映射类
        Mapping mapping = mappings.get(methodName);
        //把mapping转换成对应的actionMapping返回
        actionMapping.setClassName(mapping.getClassName());
        actionMapping.setMethodName(mapping.getMethodName());
        actionMapping.setResult(mapping.getResult());
        return actionMapping;
    }
}

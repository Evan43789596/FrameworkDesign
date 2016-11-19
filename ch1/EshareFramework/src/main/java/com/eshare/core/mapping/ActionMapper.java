package com.eshare.core.mapping;

import javax.servlet.ServletRequest;
import javax.swing.*;

/**
 * Created by liangyh on 2016/11/19.
 * Email:10856214@163.com
 */
public class ActionMapper {

    public ActionMapping findMapping(ServletRequest request) {
        ActionMapping actionMapping = new ActionMapping();
        actionMapping.setClassName("com.eshare.action.PersonAction");
        actionMapping.setMethodName("hello");
        return actionMapping;
    }
}

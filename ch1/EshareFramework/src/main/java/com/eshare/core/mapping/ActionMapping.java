package com.eshare.core.mapping;

/**
 * 请求映射类
 * Created by liangyh on 2016/11/19.
 * Email:10856214@163.com
 */
public class ActionMapping {
  private String className;
    private String methodName;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}

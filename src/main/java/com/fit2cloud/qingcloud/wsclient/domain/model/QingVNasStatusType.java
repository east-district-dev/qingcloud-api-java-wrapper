package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingVNasStatusType {
    public static final String PENDING = "pending";//： 等待被创建
    public static final String ACTIVE = "active";//： 运行状态
    public static final String POWEROFFED = "poweroffed";//： 关闭状态
    public static final String SUSPENDED = "suspended";//： 由于欠费，已被暂停使用
    public static final String DELETED = "deleted";//： 已被删除，被删除的共享存储服务器不可以被恢复
    public static final String CEASED = "ceased";//： 彻底删除
}
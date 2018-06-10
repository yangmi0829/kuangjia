package com.liugh.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 操作日志
 * </p>
 *
 * @author liugh123
 * @since 2018-05-08
 */
@TableName("sys_operation_log")
public class OperationLog extends Model<OperationLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "operation_log_id", type = IdType.AUTO)
    private Integer operationLogId;
    /**
     * 日志类型
     */
    @TableField("log_description")
    private String logDescription;
    /**
     * 日志名称
     */
    @TableField("action_args")
    private String actionArgs;
    /**
     * 用户id
     */
    @TableField("user_name")
    private String userName;
    /**
     * 类名称
     */
    @TableField("class_name")
    private String className;
    /**
     * 方法名称
     */
    private String method;

    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Long createTime;
    /**
     * 是否成功
     */
    private String succeed;
    /**
     * 备注
     */
    private String message;


    public Integer getOperationLogId() {
        return operationLogId;
    }

    public void setOperationLogId(Integer operationLogId) {
        this.operationLogId = operationLogId;
    }

    public String getLogDescription() {
        return logDescription;
    }

    public void setLogDescription(String logDescription) {
        this.logDescription = logDescription;
    }

    public String getActionArgs() {
        return actionArgs;
    }

    public void setActionArgs(String actionArgs) {
        this.actionArgs = actionArgs;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getSucceed() {
        return succeed;
    }

    public void setSucceed(String succeed) {
        this.succeed = succeed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    protected Serializable pkVal() {
        return this.operationLogId;
    }

    @Override
    public String toString() {
        return "OperationLog{" +
        "operationLogId=" + operationLogId +
        ", logDescription=" + logDescription +
        ", actionArgs=" + actionArgs +
        ", userName=" + userName +
        ", className=" + className +
        ", method=" + method +
        ", createTime=" + createTime +
        ", succeed=" + succeed +
        ", message=" + message +
        "}";
    }
}

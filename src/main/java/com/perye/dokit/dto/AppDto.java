package com.perye.dokit.dto;

import com.perye.dokit.base.BaseDTO;
import com.perye.dokit.base.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author perye
 * @email peryedev@gmail.com
 * @date 2019/12/10
 */
@Getter
@Setter
public class AppDto extends BaseDTO implements Serializable {

    /**
     * 应用编号
     */
    private Long id;

    /**
     * 应用名称
     */
    private String name;

    /**
     * 端口
     */
    private Integer port;

    /**
     * 上传目录
     */
    private String uploadPath;

    /**
     * 部署目录
     */
    private String deployPath;

    /**
     * 备份目录
     */
    private String backupPath;

    /**
     * 启动脚本
     */
    private String startScript;

    /**
     * 部署脚本
     */
    private String deployScript;

}

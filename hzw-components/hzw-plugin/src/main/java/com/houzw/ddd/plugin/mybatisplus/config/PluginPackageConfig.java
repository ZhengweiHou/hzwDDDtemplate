package com.houzw.ddd.plugin.mybatisplus.config;

import lombok.Getter;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author sirius
 * @since 2021-08-26
 */
@Getter
public class PluginPackageConfig {

    @Parameter
    private String parent = "com.sirius";
    /**
     * 父包模块名
     */
    @Parameter
    private String moduleName = "";
    /**
     * Entity包名
     */
    @Parameter
    private String entity = "entity";
    /**
     * Service包名
     */
    @Parameter
    private String service = "service";
    /**
     * Service Impl包名
     */
    @Parameter
    private String serviceImpl = "service.impl";
    /**
     * Mapper包名
     */
    @Parameter
    private String mapper = "mapper";
    /**
     * Mapper XML包名
     */
    @Parameter
    private String xml = "mapper.xml";
    /**
     * Controller包名
     */
    @Parameter
    private String controller = "controller";

}

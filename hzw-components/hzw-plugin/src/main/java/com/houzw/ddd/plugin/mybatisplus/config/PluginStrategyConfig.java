package com.houzw.ddd.plugin.mybatisplus.config;

import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import lombok.Getter;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

/**
 * @author sirius
 * @since 2021-08-26
 */
@Getter
public class PluginStrategyConfig {


    @Parameter
    private NamingStrategy naming;

    @Parameter
    private String[] include = null;

    @Parameter
    private String[] exclude = null;

    @Parameter
    private String superEntityClass;

    @Parameter
    private String versionFieldName;

    @Parameter
    private List<String> tableFillList = null;

    @Parameter
    private boolean entityLombokModel = false;

}

package com.alibaba.chaosblade.exec.plugin.jvm.thread;

import com.alibaba.chaosblade.exec.common.model.FlagSpec;
import com.alibaba.chaosblade.exec.plugin.jvm.JvmConstant;

/**
 * @author Changjun Xiao
 */
public class JvmThreadCountSpec implements FlagSpec {

    @Override
    public String getName() {
        return JvmConstant.ACTION_THREAD_COUNT;
    }

    @Override
    public String getDesc() {
        return "Binding thread core count";
    }

    @Override
    public boolean noArgs() {
        return false;
    }

    @Override
    public boolean required() {
        return true;
    }
}

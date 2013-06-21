package org.chimi.ipfilter.web.impl;

import org.chimi.ipfilter.web.IpBlocker;
import org.chimi.ipfilter.web.IpBlockerFactory;

import java.util.Map;

public class IpBlockerFactoryImpl extends IpBlockerFactory {
    @Override
    public IpBlocker create(Map<String, String> config) {
        IpBlockerImpl ipBlocker = new IpBlockerImpl();
        ipBlocker.init(config);
        return ipBlocker;
    }
}

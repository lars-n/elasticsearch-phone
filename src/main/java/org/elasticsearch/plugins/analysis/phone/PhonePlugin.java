package org.elasticsearch.plugins.analysis.phone;

import org.elasticsearch.index.analysis.AnalysisModule;
import org.elasticsearch.plugins.Plugin;

public class PhonePlugin extends Plugin {

    public static final String NAME = "phone-plugin";

    /* Return a description of this plugin. */
    public String description() {
        return "Makes a best attempt at tokenizing a phone number or sip address";
    }

    /**
     * Automatically called with the analysis module.
     */
    public void onModule(AnalysisModule analysisModule) {
        analysisModule.addProcessor(new PhoneBinderProcessor());
    }

    @Override
    public String name() {
        return NAME;
    }

}
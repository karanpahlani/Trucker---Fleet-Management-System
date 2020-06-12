package com.fleet;

/// public static void main  ///

import jdk.internal.jline.internal.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{App.class};
    }

    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/api/*"};
    }
}
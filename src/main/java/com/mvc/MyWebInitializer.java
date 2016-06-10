package com.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
 
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

@Override
protected Class<?>[] getServletConfigClasses() {
return new Class[] { AppConfig.class   };
}

@Override
protected String[] getServletMappings() {
return new String[] { "/hello" };
}

@Override
protected Class<?>[] getRootConfigClasses() {
return null;
}

}
package com.rboyo.oyo.miniproject.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoggingFilter implements Filter {

    public static final Logger logger = LoggerFactory.getLogger(LoggingFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // Start time
        long time = System.currentTimeMillis();

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //Request Logger
        logger.info("\nRequest Header :\n\nMethod: {}\nRequest URL: {}\nRequest URI: {}\nQuery String: {}\n",request.getMethod(),request.getRequestURL(),request.getRequestURI(),request.getQueryString());

        //Response Logger
        response.addDateHeader("Date",1000);
        response.addHeader("Custom Header","This is Custom Header.");
        logger.info("\nResponse Header :\n\nStatus Code: {}\nContent-Type: {}\nLocale: {}\nDate: {}\nCustom Header: {}\n",response.getStatus(),response.getContentType(),response.getLocale(),response.getHeader("Date"),response.getHeader("Custom Header"));

        //Calling FilterChain
        filterChain.doFilter(servletRequest,servletResponse);

        // End Time
        time=System.currentTimeMillis() - time;

        //Response Time
        logger.info("\n\nResponse Time: {}ms\n",time);
    }
}

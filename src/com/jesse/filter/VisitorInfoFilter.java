package com.jesse.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class VisitorInfoFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println(((HttpServletRequest)req).getContentType());
		System.out.println(((HttpServletRequest)req).getContextPath());
		System.out.println(((HttpServletRequest)req).getLocalAddr());
		System.out.println(((HttpServletRequest)req).getLocalName());
		System.out.println(((HttpServletRequest)req).getProtocol());
		System.out.println(((HttpServletRequest)req).getRemoteUser());
		System.out.println(((HttpServletRequest)req).getRemoteAddr());
		System.out.println(((HttpServletRequest)req).getRequestedSessionId());
		System.out.println(((HttpServletRequest)req).getServerName());
		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
}

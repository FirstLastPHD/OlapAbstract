package com.zps.middleware;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.webbitserver.netty.NettyHttpRequest;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

//@Singleton
public class CrossOriginHandler extends SimpleChannelInboundHandler<NettyHttpRequest> implements Filter {
	
	    protected void channelRead0(ChannelHandlerContext ctx, NettyHttpRequest request) throws Exception {
	        //request.getResponse().getOutputHeaders().add("Access-Control-Allow-Origin", "*");
	       // request.getResponse().getOutputHeaders().add("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
	       // request.getResponse().getOutputHeaders().add("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, Content-Length");

	        ctx.fireChannelRead(request);
	    }
	    
	    @Override
	    public void doFilter(ServletRequest request, ServletResponse response,
	    FilterChain filterChain) throws IOException, ServletException {

	        if(response instanceof HttpServletResponse){
	        HttpServletResponse alteredResponse = ((HttpServletResponse)response);
	        addCorsHeader(alteredResponse);
	    }

	    filterChain.doFilter(request, response);
	    }

	    private void addCorsHeader(HttpServletResponse response){
	        //TODO: externalize the Allow-Origin
	        response.addHeader("Access-Control-Allow-Origin", "*");
	        response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
	        response.addHeader("Access-Control-Allow-Headers", "X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
	        response.addHeader("Access-Control-Max-Age", "1728000");
	    }

	    @Override
	    public void destroy() {}

	    @Override
	    public void init(FilterConfig filterConfig)throws ServletException{}
	

}

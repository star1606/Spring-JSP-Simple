package com.cos.springjsp;

import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// 톰캣이나 서블릿 엔진에 배포할 때는 이 파일을 사용한다.
// 배포가능
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringjspApplication.class);
	}

}

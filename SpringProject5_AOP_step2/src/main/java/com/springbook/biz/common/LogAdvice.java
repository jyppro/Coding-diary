package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {
	public void printBeforeLog() {
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
	}
	public void printAfterLog() {
		System.out.println("[공통 로그] 비즈니스 로직 수행 후 동작");
	}
}

package com.sist.ann;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
/*
 *    애노테이션 유지 기간 
 *    SOURCE : 소스파일에만 존재 , 클래스파일에 존재하지 않는다 (한번만 사용)
 *    CLASS : 클래스파일에 존재 , 실행시 사용 불가 , 기본값 
 *    RUNTIME : 클래스파일에 존재 , 실행시 사용이 가능 
 *    --------  ------------- 컴파일이 가능 (RequestMapping.class)
 */
@Target(METHOD)
/*
 *   인덱스 => 어떤것을 찾을지 구분 
 *   METHOD : 메소드 구분
 *       @RequestMapping , @GetMapping , @PostMapping
 *   TYPE : 클래스 구분
 *       @Controller , @Repository , @Service 
 *       @Component , @ Bean , @RestController 
 *   PARAMETER : 매개변수 구분 
 *       @Autowired , @Resouce 
 *   CONSTRUCTOR : 생성자 구분 
 *       
 *   FIELD : 멤버 구분 
 * 
 *   @RequestMapping("w")
 */

public @interface RequestMapping {
    public String value();
}

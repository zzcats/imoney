package com.imoney.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({WebAppConfiguration.class})
@ComponentScan({"com.imoney.web","com.imoney.mongodb"})
public class WebRootConfiguration {

}

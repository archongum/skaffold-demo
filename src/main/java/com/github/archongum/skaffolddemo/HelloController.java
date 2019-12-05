package com.github.archongum.skaffolddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Archon  2019/12/5
 * @since
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    String hello() {
        return "<h1>hello world</h1>";
    }
}

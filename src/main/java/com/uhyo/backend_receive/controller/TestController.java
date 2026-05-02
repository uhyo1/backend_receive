package com.uhyo.backend_receive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 動作確認用のコントローラ
 */
@RestController
public class TestController {

    /**
     * GET /receive/test にアクセスされた時に実行されるメソッド
     */
    @GetMapping("/receive/test")
    public String test() {
        return "Hello from backend_receive!";
    }
}

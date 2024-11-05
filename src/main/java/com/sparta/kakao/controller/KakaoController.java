package com.sparta.kakao.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sparta.kakao.service.KakaoService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/kakaologin")
public class KakaoController {

    private final KakaoService kakaoService;



    @GetMapping("/callback")
    public String kakaoLogin(@RequestParam String code
        , HttpServletResponse response) throws JsonProcessingException {
        return kakaoService.getAccessToken(code);
    }

}

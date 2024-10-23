package com.tenco.blog_v2.common;

import com.tenco.blog_v2.common.errors.*;
import com.tenco.blog_v2.common.utils.ApiUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

// 데이터 반환
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 400 에러 처리 - return -json
    @ExceptionHandler(Exception400.class)
    public ResponseEntity<?> handleException400(Exception400 e) {
        ApiUtil<?> apiUtil = new ApiUtil<>(400, e.getMessage());
        return new ResponseEntity<>(apiUtil, HttpStatus.BAD_REQUEST);
    }

    /**
     * 400 Bad Request 예외 처리
     * @param ex
     * @param model
     * @return
     */
    @ExceptionHandler(Exception401.class)
    public ModelAndView handleException401(Exception401 ex, Model model) {
        // templates/err/400.mustache
        ModelAndView mav = new ModelAndView("err/401");
        mav.addObject("msg", ex.getMessage());
        return mav;
    }

    /**
     * 400 Bad Request 예외 처리
     * @param ex
     * @param model
     * @return
     */
    @ExceptionHandler(Exception403.class)
    public ModelAndView handleException403(Exception403 ex, Model model) {
        // templates/err/400.mustache
        ModelAndView mav = new ModelAndView("err/403");
        mav.addObject("msg", ex.getMessage());
        return mav;
    }

    /**
     * 400 Bad Request 예외 처리
     * @param ex
     * @param model
     * @return
     */
    @ExceptionHandler(Exception404.class)
    public ModelAndView handleException404(Exception404 ex, Model model) {
        // templates/err/400.mustache
        ModelAndView mav = new ModelAndView("err/404");
        mav.addObject("msg", ex.getMessage());
        return mav;
    }

    /**
     * 400 Bad Request 예외 처리
     * @param ex
     * @param model
     * @return
     */
    @ExceptionHandler(Exception500.class)
    public ModelAndView handleException500(Exception500 ex, Model model) {
        // templates/err/400.mustache
        ModelAndView mav = new ModelAndView("err/500");
        mav.addObject("msg", ex.getMessage());
        return mav;
    }



}

package com.ariel.testexceptionhandler.controller;

import com.ariel.testexceptionhandler.exceptions.NumberBiggerThan100Exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionsController {

    @ExceptionHandler(NumberBiggerThan100Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ModelAndView handlerBiggerThan100(Exception exception) {

        ModelAndView mav = new ModelAndView();

        mav.addObject("exception", exception);
        mav.setViewName("exceptions/error400");

        return mav;

    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ModelAndView handlerExceptions(Exception exception) {

        ModelAndView mav = new ModelAndView();

        mav.addObject("exception", exception);
        mav.setViewName("exceptions/error400");

        return mav;

    }

}

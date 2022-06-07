package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;

//쿼리스트링으로 '년, 월, 일'을 name=value로 줬을 때 '년, 월, 일, 요일'을 브라우저에 출력
@Controller
public class YoilTellerMVC1 {
    @RequestMapping("/getYoilMVC1")

    //1. 반환타입을 void로하면 뷰이름은 자동으로 맵핑된 주소의 이름으로 반환한다.
    //2. ModelAndView
    public ModelAndView main(int year, int month, int day) throws Exception {
        //ModelAndView를 직접 생성하고, 기본 뷰를 지정.
        ModelAndView mv = new ModelAndView();

        char yoil = getYoil(year, month, day);
        //ModelAndView는 addObject()로 작업결과를 저장.
        mv.addObject("year", year);
        mv.addObject("month", month);
        mv.addObject("day", day);
        mv.addObject("yoil", yoil);

        //결과를 보여줄 view를 mv에 저장

        mv.setViewName("yoil");

        //ModelAndView를 반환
        return mv;

    }

    private boolean isValid(int year, int month, int day) {
        return true;
    }

    private char getYoil(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return " 일월화수목금토".charAt(dayOfWeek);
    }
}


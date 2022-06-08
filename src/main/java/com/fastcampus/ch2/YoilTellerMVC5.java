package com.fastcampus.ch2;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//쿼리스트링으로 '년, 월, 일'을 name=value로 줬을 때 '년, 월, 일, 요일'을 브라우저에 출력
@Controller
public class YoilTellerMVC5 {
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex) {
		ex.printStackTrace();
		return "yoilError";
	}
	
    @RequestMapping("/getYoilMVC5")
    //1.입력을 분리
    public String main(@ModelAttribute MyDate date, Model model) throws Exception {
        //2. 유효성 검사
        if(!isValid(date))
            return "yoilError";

        //3. 작업을 분리
        //3-1. 요일계산
//        char yoil = getYoil(date);
        //3-2. 계산한 결과를 model에 저장
//        model.addAttribute("myDate", date);
//        model.addAttribute("yoil", yoil);
        
        

        //4. 출력을 분리
        return "yoil"; // /WEB-INF/views/yoil.jsp

    }

    private boolean isValid(MyDate date) {
		return isValid(date.getYear(), date.getMonth(), date.getDay());
	}

	private @ModelAttribute("yoil") char getYoil(MyDate date) {	
		return getYoil(date.getYear(), date.getMonth(), date.getDay());
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


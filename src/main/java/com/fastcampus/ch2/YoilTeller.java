package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Calendar;

//쿼리스트링으로 '년, 월, 일'을 name=value로 줬을 때 '년, 월, 일, 요일'을 브라우저에 출력
@Controller
public class YoilTeller {
    @RequestMapping("/getYoil")
    //입력, 작업, 출력 3개의 관심사를 분리 해야 함. - 코드의 분리 -> YoilTellerMVC
    public void main(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //1. 입력 - 쿼리스트링으로 입력받은 값을 변수에 저장
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");

        //2. 작업 - year, month, day를 int로 변환 후 요일을 얻는다.
        int yyyy = Integer.parseInt(year);
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);

        Calendar cal = Calendar.getInstance();
        cal.set(yyyy, mm - 1, dd);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        char yoil = " 일월화수목금토".charAt(dayOfWeek);

        //3. 출력 - reponse객체로 브라우저에 출력
        //응답의 타입 - html, 인코딩 - utf-8로 지정
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        //response객체에서 브라우저로의 출력 스트림(out)을 얻는다.
        PrintWriter out = response.getWriter();

        //년, 월, 일, 요일을 브라우저에 출력
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println(year + "년 "+month+"월 "+day+"일은 ");
        out.println(yoil+"요일입니다.");
        out.println("</body>");
        out.println("</html>");
        //스트림을 닫음음
        out.close();
    }
}


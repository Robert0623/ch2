package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//1~6사이 숫자의 주사위 사진을 브라우저에 랜덤하게 출력
@Controller
public class TwoDice {
    @RequestMapping("/rollDice")
    public void main(HttpServletResponse response) throws IOException {
        //타입, 인코딩 지정
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        //response의 출력스트림을 얻는다
        PrintWriter out = response.getWriter();

        //랜덤한 1~6의 값을 얻는다.
        int idx1 = (int) (Math.random() * 6) + 1;
        int idx2 = (int) (Math.random() * 6) + 1;

        //브라우저에 출력
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        //새로고침 할 때마다 다른 주사위게 나오게
        out.println("<img src='resources/img/dice"+idx1+".jpg'>");
        out.println("<img src='resources/img/dice"+idx2+".jpg'>");
        out.println("</body>");
        out.println("</html>");

    }
}

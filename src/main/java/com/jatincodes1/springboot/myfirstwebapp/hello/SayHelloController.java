package com.jatincodes1.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // added it to make compiler know it is a Bean
public class SayHelloController {

    //"say-hello" => "Hello! What are you learning today?"

    //say-hello
    // http://localhost:8080/say-hello
    @RequestMapping("say-hello")
    @ResponseBody   // will help to return the below string as it is to browser
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    // http://localhost:8080/say-hello-html
    @RequestMapping("say-hello-html")
    @ResponseBody   // will help to return the below string as it is to browser
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My First HTML Page - Changed</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body - Changed");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    //
    // "say-hello-jsp" => sayHello.jsp
    // /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    // /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
    // /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
    // /src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}

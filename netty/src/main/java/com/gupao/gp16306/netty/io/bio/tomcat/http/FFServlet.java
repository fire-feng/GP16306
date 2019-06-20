package com.gupao.gp16306.netty.io.bio.tomcat.http;

public abstract class FFServlet {
    public void service(FFRequest request, FFResponse response) throws Exception{
        if("GET".equalsIgnoreCase(request.getMethod())){
            doGet(request,response);
        }else{
            doPost(request,response);
        }
    }

    public abstract void doGet(FFRequest request, FFResponse response) throws Exception;
    public abstract void doPost(FFRequest request, FFResponse response) throws Exception;
}

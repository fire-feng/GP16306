package com.gupao.gp16306.netty.io.bio.tomcat.servlet;

import com.gupao.gp16306.netty.io.bio.tomcat.http.FFRequest;
import com.gupao.gp16306.netty.io.bio.tomcat.http.FFResponse;
import com.gupao.gp16306.netty.io.bio.tomcat.http.FFServlet;

public class FirstServlet extends FFServlet {

    public void doGet(FFRequest request, FFResponse response) throws Exception {
        this.doPost(request, response);
    }

    public void doPost(FFRequest request, FFResponse response) throws Exception {
        response.write("This is First Serlvet");
    }

}

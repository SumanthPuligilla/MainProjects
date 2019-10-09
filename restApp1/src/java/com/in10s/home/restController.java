/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in10s.home;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Administrator
 */
//@Path("/Hello")
public class restController {
    @GET
    @Path("/getRequest")
    public String getMethod(){
        System.out.println("This is get method");
        return "getReq0";
    }
}

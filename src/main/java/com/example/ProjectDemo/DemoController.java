package com.example.ProjectDemo;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
  
  @Autowired
  private DemoService demoService;
  
  @GetMapping("/home")
  public String home() {
    return "this is home page";
  }
  
  @PostMapping("/get")
  public JsonValues getJson()
  {
    return  demoService.returnJson();
  }


  @GetMapping("/getQuote")
  public String getQuote(){
    return demoService.getQuote();
  }
}


//curl -i -H "Accept:application/json" -H "Content-Type:application/json" -H "Authorization: Bearer c1532ea3b88389c3cee1ab674398c366c5616443a110b15f349c988c04f5f262" -XPOST "https://gorest.co.in/public/v2/users" -d '{"name":"Tenali Ramakrishna", "gender":"male", "email":"tenali.ramakrishna@15ce.com", "status":"active"}'
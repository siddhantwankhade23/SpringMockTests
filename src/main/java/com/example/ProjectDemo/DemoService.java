package com.example.ProjectDemo;

import org.apache.http.HttpHost;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;


@Service
public class DemoService {

  public JsonValues returnJson() {
    // TODO Auto-generated method stub
    Random random= new Random();
    JsonValues json= new JsonValues();
    json.setCellVolage(random.nextInt(100));
    json.setExtra(random.nextInt(100));
    json.setHealth(random.nextInt(100));
    json.setImbalance(random.nextInt(100));
    json.setLoad(random.nextInt(100));
    json.setVoltage(random.nextInt(100));
    json.setTemplerature(random.nextInt(100));
    json.setCharge(random.nextInt(100));
    json.setStatus(random.nextInt()%2==0?"OK":"ERROR");
    
   return json;
    
  }

  public String getQuote(){

    System.out.println("inside ");

    String responseString = null;

    HttpHost proxyHost = new HttpHost("192.168.29.241",8081,"http");

    DefaultProxyRoutePlanner routePlanner = new DefaultProxyRoutePlanner(proxyHost);

    CloseableHttpClient httpClient = HttpClients.custom().setRoutePlanner(routePlanner).build();

    HttpPost request = new HttpPost("http://192.168.29.241:8081/api/demo/get");

    try {
      CloseableHttpResponse closeableHttpResponse = httpClient.execute(request);

      ByteArrayOutputStream out = new ByteArrayOutputStream();

      closeableHttpResponse.getEntity().writeTo(out);

      responseString = out.toString();
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("response :" +responseString);
    return responseString;
  }
}

package org.zerock.myapp.programmers.lv2;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://openapi.price.go.kr/openApiImpl/ProductPriceInfoService/getProductPriceInfoSvc.do"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=����Ű"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("goodInspectDay","UTF-8") + "=" + URLEncoder.encode("20220805", "UTF-8")); /*��ǰ_����_�� (���� �ݿ��� ��¥)*/
        urlBuilder.append("&" + URLEncoder.encode("entpId","UTF-8") + "=" + URLEncoder.encode("697", "UTF-8")); /*��ü_���̵�*/
        urlBuilder.append("&" + URLEncoder.encode("goodId","UTF-8") + "=" + URLEncoder.encode("1182", "UTF-8")); /*��ǰ_���̵�*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}
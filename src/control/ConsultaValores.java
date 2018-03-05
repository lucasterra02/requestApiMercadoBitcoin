/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author lucas
 */
public class ConsultaValores {

    private final String USER_AGENT = "Mozilla/5.0";
    private final String API_MERCADO_BITCOIN = "https://www.mercadobitcoin.net/api/";

    // HTTP GET request
    public String sendGet(String coin) throws Exception {

        String url = API_MERCADO_BITCOIN + coin + "/ticker/";

        URL obj = new URL(url);

        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        if (responseCode != 200) {
            return "falha";
        }

        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        StringBuilder response;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }

        //print result
        //System.out.println(response.toString());
        return response.toString();

    }

}

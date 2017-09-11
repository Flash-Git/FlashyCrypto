package dev.flash.flashycrypto;


import sun.misc.IOUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HttpURLConnectionExample {
	private final String USER_AGENT = "Mozilla/5.0";
	
	public static void main(String[] args) throws Exception {
		
		HttpURLConnectionExample http = new HttpURLConnectionExample();
		
		System.out.println("Testing 1 - Send Http GET request");
		http.sendGetOMGETH();

		
	}
	
	// HTTP GET request
	public void sendGetOMGETH() throws Exception {
		
		String url = "https://api.cryptowat.ch/markets/bitfinex/omgeth/summary";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		// optional default is GET
		con.setRequestMethod("GET");
		
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		
		try{
			//String content = new String(Files.readAllBytes(Paths.get("D:\\CryptoFlash\\DATA.json")));
			
			
			File file = new File("D:\\CryptoFlash\\DATAOMGETH.json");
			Writer output = new BufferedWriter(new FileWriter(file, true));
			output.write("\n");
			while ((inputLine = in.readLine()) != null) {
				//output.write(inputLine);
				output.write(inputLine.toString());
			}
			in.close();
			
			/*
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
				//response.append(inputLine);
				output.write(inputLine);
			}
			in.close();
			*/
			output.close();
			System.out.println("File has been written");
			
		}catch(Exception e){
			System.out.println("Could not create file");
		}
		
		
		//print result
		//System.out.println(response.toString());
		
	}
	
	
	// HTTP GET request
	public void sendGetOMGUSD() throws Exception {
		
		String url = "https://api.cryptowat.ch/markets/bitfinex/omgusd/summary";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		// optional default is GET
		con.setRequestMethod("GET");
		
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		
		try{
			//String content = new String(Files.readAllBytes(Paths.get("D:\\CryptoFlash\\DATA.json")));
			
			
			File file = new File("D:\\CryptoFlash\\DATAOMGUSD.json");
			Writer output = new BufferedWriter(new FileWriter(file, true));
			output.write("\n");
			while ((inputLine = in.readLine()) != null) {
				//output.write(inputLine);
				output.write(inputLine.toString());
			}
			in.close();
			
			/*
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
				//response.append(inputLine);
				output.write(inputLine);
			}
			in.close();
			*/
			output.close();
			System.out.println("File has been written");
			
		}catch(Exception e){
			System.out.println("Could not create file");
		}
		
		
		//print result
		//System.out.println(response.toString());
		
	}
	
}
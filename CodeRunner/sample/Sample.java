package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;

import util.MersenneTwister;

public class Sample {
    static final String TOKEN = "CDX7S80YH5KNCQVCJWLGCHX3TY69TIGL";
    static final String BASE  = "https://game.coderunner.jp/";
    static int skill = 0;
    static MersenneTwister mt = new MersenneTwister();
    static LinkedList<Integer> list = new LinkedList<>();
    static int maxSkill = 0;
    static boolean maxFlg = false;
    static int maxDamage = 0;
    static int maxSkillMember = 0;
    static int betterSkill = 0;
    static boolean betterFlg = false;
    
    public static void main(String[] args)throws IOException{
    	for (int i=0; ; i++) {
    		skill = mt.nextInt(100);
    		try{
    			hiest();
    		}catch(Exception ex){
    			ex.printStackTrace();
    			continue;
    		}
    		if(maxFlg){
    			skill = maxSkill;
    			System.out.println("MAX!");
    		}else if(betterFlg && i%2==0){
    			System.out.println("Better");
    			skill = maxSkillMember;
    		}else{
    			System.out.println("random");
    			skill = betterSkill;
    		}
    		System.out.println("fire: "+skill);
            String url    = BASE + "attack?skill="+ skill +"&token=" + TOKEN;
            String result = "";
            try{
            	result = query(url);
            }catch(Exception e){
            	e.printStackTrace();
            	continue;
            }
            System.out.println(result);
            if(Integer.parseInt(result) > 300 && !maxFlg){
            	//list.add(skill);
            	betterSkill = skill;
            	/*if(list.size()>1){
            		list.removeFirst();
            	}*/
//            }else if(Integer.parseInt(result) < 300 && !list.isEmpty()){
            }else if(Integer.parseInt(result) < 300){
            	//list.removeFirst();
            	betterSkill = mt.nextInt(100);
            }
            if(Integer.parseInt(result) > 10000){
//            	list.clear();
            	maxSkill = skill;
            	maxFlg = true;
            }else if(Integer.parseInt(result) < 10000){
            	maxFlg = false;
            }
//            showList();
            try {
                Thread.sleep(1000L);
            } catch(InterruptedException e){}
        }
    }

    public static String query(String _url) throws IOException {
        URL url = new URL(_url);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET"); 
        if(connection.getResponseCode() == HttpURLConnection.HTTP_OK){
            InputStreamReader isr = new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(isr);
            String res = "";
            String line = null;
 
            while((line = reader.readLine()) != null){
                res += line;
            }
            return res.trim();
        }
        return "";
    }
    public static void showList(){
  		System.out.println("----LIST----");
    	for(int out : list){
    		System.out.println(out);
    	}
    	System.out.println("-----END----");
    }
    
    public static void hiest() throws IOException {
        URL url = new URL("https://game.coderunner.jp/info?token=CDX7S80YH5KNCQVCJWLGCHX3TY69TIGL&filter=all&style=text");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET"); 
        if(connection.getResponseCode() == HttpURLConnection.HTTP_OK){
        	maxDamage = 0;
        	maxSkillMember = 0;
            InputStreamReader isr = new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(isr);
            String res = "";
            String line = null;
            int number = 0;
            boolean flg = true;
            while((line = reader.readLine()) != null){
                res += line;
                if("members".equals(line)){
                	line = reader.readLine();
                	if(line.length() == 0){
                		betterFlg = false;
                		flg = false;
                	}
                }
                number++;
                if(number >= 13 && flg){
                	String[] tmp = line.split(" ");
                	if(Integer.parseInt(tmp[2]) >= maxDamage){
                		maxSkillMember = Integer.parseInt(tmp[1]);
                	}
                	betterFlg = true;
                }else{
                	betterFlg = false;
                }
            }
        }
    }
    
 }

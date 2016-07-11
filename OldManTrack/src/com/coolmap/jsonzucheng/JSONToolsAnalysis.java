package com.coolmap.jsonzucheng;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



import android.util.Log;

public class JSONToolsAnalysis {

	private static final String TAG = null;

	public   JSONToolsAnalysis(){

	}

	//��������JSON(����keyֵ)
	public  void    analysejsonkey(String jsonstring) throws JSONException{

		   JSONObject  jsonobject  = new JSONObject(jsonstring);  //��������json�ַ���
		   JSONObject  json  = jsonobject.getJSONObject("Person"); //���key�����е�valueֵ
		   String  name  = json.getString("name");
		   String  sex  =  json.getString("sex");
		   int  age = json.getInt("age");
		   Log.i(TAG, name + sex + age);
		
	}
	//����JSON����(����keyֵ)
	public  void    analysejsonskey(String jsonstring) throws JSONException{
          JSONObject  jsonobject = new JSONObject(jsonstring);
          JSONArray   jsonarray = jsonobject.getJSONArray("Person");           //���key�����е�valueֵ
          for(int i = 0;i < jsonarray.length(); i++){
		    	 JSONObject   jsonobject2 =  jsonarray.getJSONObject(i);      //json�������ж��json����
		         String name  =   jsonobject2.getString("name");
		         String sex  = jsonobject2.getString("sex");
		          int age  =  jsonobject2.getInt("age");
		          Log.i(TAG, name + sex + age);
		     }
          
	}

	//��������JSON(������keyֵ)
	public  void    analysejsonnokey(String jsonstring) throws JSONException{
             JSONObject  json = new JSONObject(jsonstring);
             String  name  = json.getString("name");
  		     String  sex  =  json.getString("sex");
  		     int  age = json.getInt("age");
  		     Log.i(TAG, name + sex + age);
	}

	//����JSON����(������keyֵ)
	public  void    analysejsonsnokey(String jsonstring) throws JSONException{
                   
		    JSONArray  jsonarray =  new JSONArray(jsonstring);
		    for(int i = 0 ; i < jsonarray.length(); i ++){
		    	String s = String.valueOf(jsonarray.get(i));
		    	JSONObject  jsonobject = new JSONObject(s);
		    	 String  name  = jsonobject.getString("name");
	  		     String  sex  =  jsonobject.getString("sex");
	  		     int  age = jsonobject.getInt("age");
	  		     Log.i(TAG, name + sex + age); 
		    }
		
		
	}
}

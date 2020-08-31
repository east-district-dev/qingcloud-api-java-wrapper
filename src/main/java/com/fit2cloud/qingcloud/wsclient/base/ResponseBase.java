package com.fit2cloud.qingcloud.wsclient.base;

import com.google.gson.Gson;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResponseBase {
    private String action;
    private Integer total_count = 0;
    private Integer ret_code;
    private String message;
    private String job_id;

    public static <T> T fromJson(String jsonCreateS2ServersResponse,Class<T> tClass) {
        Gson gson = new Gson();
        T t = gson.fromJson(jsonCreateS2ServersResponse, tClass);
        return t;
    }


    public <T> List<Map<String,T>> fromListHashMap(Class<T>tClass){
        List<Map<String,T>> mapList = new ArrayList<Map<String,T>>();
        List<Object> list = getSubClassPro();
        for(Object object:list){
            Map<String,T> map = fromHashMap(object,tClass);
            mapList.add(map);
        }
        return mapList;
    }

    public <T> Map<String,T> fromHashMap(Object requestClass,Class<T>tClass){
//        HashMap<String,T> hashMap = new HashMap<String, T>();
//        Field[] fields = requestClass.getClass().getDeclaredFields();
//        for(int i = 0 ; i < fields.length; i++){
//            try{
//                boolean accessFlag = fields[i].isAccessible();
//                fields[i].setAccessible(true);
//                if(fields[i].get(requestClass) != null && fields[i].getName().indexOf("$") == -1){
//                    hashMap.put(fields[i].getName(), (T)fields[i].get(requestClass));
//                }
//                fields[i].setAccessible(accessFlag);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
        Map<String, T> objectAsMap = new HashMap<String, T>();
        try {
            BeanInfo info = Introspector.getBeanInfo(this.getClass());
            for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
                Method reader = pd.getReadMethod();
                if (reader != null)
                    objectAsMap.put(pd.getName(), (T)reader.invoke(this));
            }
            objectAsMap.remove("class");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objectAsMap;
    }

    public List getSubClassPro(){
        List tClass = new ArrayList();
        tClass.add(this);
        return tClass;
    };

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Integer getRet_code() {
        return ret_code;
    }

    public void setRet_code(Integer ret_code) {
        this.ret_code = ret_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }
}

package com.study.json.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.study.json.pojo.Person;
import org.junit.Test;

import java.io.File;

/**
 * @author CHL
 * @date 2020/2/28
 */
public class PersonTest {


    //Jva对象转Json
    @Test
    public  void test1() throws Exception {
        Person per = new Person();
        per.getId(1);
        per.setAge(12);
        per.setName("张三");
        per.setGender("男");

        //创建jackson的核心对象 ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        //转换
        /*
        			转换方法
			1.writeValue(参数1，obj):
				参数1：
					File：将obj对象转换为JSON字符串，并保存到指定的文件中
					Writer：将obj对象转换为JSON字符串，并将json数据填充到字符输出流中
					OutputStream：将obj对象转换为JSON字符串，并将json数据填充到字节输出流中
            2.writeValueAsString(obj):将对象转为json字符串
         */

        //writeValueAsString(per)将对象转为json字符串
//        String json = objectMapper.writeValueAsString(per);
//        System.out.println(json);  //{"name":"张三","age":12,"gender":"男"}

        //writeValue(参数1，obj): 将obj对象转换为JSON字符串，并保存到指定的文件中
//        objectMapper.writeValue(new File("E://a.txt"),per);

        //writeValue(参数1，obj): 将obj对象转换为JSON字符串，并将json数据填充到字符输出流Writer中
        objectMapper.writeValue(new File("E://b.txt"),per);


    }

}

package com.itheima.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/*converter的泛型：S,T分别指的是：s:原来的类型 t:是要转换的类型   */
public class MyDateTimeConverter implements Converter<String, Date> {//选择实现converter接口的时候注意不要选错了 就是实现哪个core的那个
    @Override
    public Date convert(String source) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return dateFormat.parse(source); //把字符串parse成为一个date
        } catch (ParseException e) {
            e.printStackTrace();
            throw new
                    RuntimeException(e.getMessage());
        }
    }

}


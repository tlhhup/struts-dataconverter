package com.conver.converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class DateConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Object source, Class target) {
		try {
			if (target == Date.class) {
				if (source != null) {
					DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
					return format.parse(source.toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

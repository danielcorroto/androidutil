package com.danielcorroto.utils;

import java.lang.reflect.Field;

public class AndroidUtils {
	/**
	 * Gets the raw resource ID by name
	 * 
	 * @param name
	 *            Raw resource name
	 * @return Raw resource ID or -1 if not found
	 */
	public static int getRawResourceByName(String name) {
		try {
			Field field = R.raw.class.getDeclaredField(name);
			Object value = field.get(null);
			return Integer.parseInt(value.toString());
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * Gets the drawable resource ID by name
	 * 
	 * @param name
	 *            Drawable resource name
	 * @return Drawable resource ID or -1 if not found
	 */
	public static int getDrawableResourceByName(String name) {
		try {
			Field field = R.drawable.class.getDeclaredField(name);
			Object value = field.get(null);
			return Integer.parseInt(value.toString());
		} catch (Exception e) {
			return -1;
		}
	}
}

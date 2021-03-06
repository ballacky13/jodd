// Copyright (c) 2003-2013, Jodd Team (jodd.org). All Rights Reserved.

package jodd.petite;

import java.lang.reflect.Field;

/**
 * Property injection point.
 */
public class PropertyInjectionPoint {

	public static final PropertyInjectionPoint[] EMPTY = new PropertyInjectionPoint[0]; 

	public final Field field;
	public final String[] references;

	PropertyInjectionPoint(Field field, String[] references) {
		this.field = field;
		this.references = references;
	}

}

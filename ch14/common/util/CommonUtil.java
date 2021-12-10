package common.util;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

/**
 * <b>class : </b> CommonUtil
 * <b>Class Description</b><br>
 * ���� Util Class
 * <b>History</b><br>

*/
public class CommonUtil {
	
	/**
	 * ��ü���� �������ִ� �޼ҵ�
	 *
	 * @param objects       ���� ��� ��ü�� ����ִ� �迭
	 * @return Object[]     ����� ��ü���� ����� �迭
	 */
	public static Object[] clone(Object[] objects) {
		int length = objects.length;
		Class c = objects.getClass().getComponentType();
		Object array = Array.newInstance(c, length);
		for (int i = 0; i < length; i++) {
			Array.set(array, i, clone(objects[i]));
		}
		return (Object[]) array;
	}
	
	/**
	 * ��ü�� �������ִ� �޼ҵ�
	 *
	 * @param object      ���� ��� ��ü
	 * @return Object     ����� ��ü
	 */
	public static Object clone(Object object) {
		Class c = object.getClass();
		Object newObject = null;
		try {
			newObject = c.newInstance();
		}
		catch (Exception e) {
			return null;
		}
		Field[] field = c.getFields();
		for (int i = 0; i < field.length; i++) {
			try {
				Object f = field[i].get(object);
				field[i].set(newObject, f);
			}
			catch (Exception e) {
			}
		}
		return newObject;
	}
	
	/**
	 * Vector�� ��� ��ü���� �������ִ� �޼ҵ�
	 * @param objects   ���� ��� ��ü�� ����ִ� Vector
	 * @return Vector   ����� ��ü���� ����� Vector
	 */
	public static Vector clone(Vector objects) {
		Vector newObjects = new Vector();
		Enumeration e = objects.elements();
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			newObjects.addElement(clone(o));
		}
		return newObjects;
	}
	
	/**
	 * obj1�� obj2�� attr�� ���ؼ� �� ������� int�� �����ϴ� �޼ҵ�
	 *
	 * @param obj1      Object
	 * @param obj2      Object
	 * @param attr      �񱳴�� attr
	 * @return int      �� ��� ��
	 */
	private static int compareTo(Object obj1, Object obj2, String attr) {
		int ret = 0;
		Class c1 = obj1.getClass();
		Class c2 = obj2.getClass();
		if (c1.isPrimitive() || c2.isPrimitive()) {
			return ret;
		}
		Field[] f1 = c1.getFields();
		Field[] f2 = c2.getFields();
		int idx1 = -1, idx2 = -1;
		String type1 = null;
		String type2 = null;
		try {
			for (int i = 0; i < f1.length; i++) {
				if (f1[i].getName().equals(attr)) {
					type1 = f1[i].getType().getName();
					idx1 = i;
					break;
				}
			}
			for (int i = 0; i < f1.length; i++) {
				if (f2[i].getName().equals(attr)) {
					type2 = f2[i].getType().getName();
					idx2 = i;
					break;
				}
			}
			if (idx1 == -1 || idx2 == -1)
				return ret;
			if (type1 == null || type2 == null)
				return ret;
			if (!type1.equals(type2))
				return ret;
			if (type1.equals("java.lang.String"))
				ret = ( (String) f1[idx1].get(obj1)).compareTo( (String) f2[idx2].get(obj2));
			else if (type1.equals("int"))
				ret = f1[idx1].getInt(obj1) - f2[idx2].getInt(obj2);
			else if (type1.equals("double"))
				ret = (new Double(f1[idx1].getDouble(obj1))).compareTo(new Double(f2[idx2].getDouble(obj2)));
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * str�� �Է¹޾� byte�� ġȯ���ִ� �޼ҵ�
	 * @param str       ġȯ ��� ���ڿ�
	 * @param len       ����
	 * @return byte     ����Ʈ ������ ġȯ�� ���� �迭
	 */
	public static byte[] fixByteLength(String str, int len) {
		byte[] b = new byte[len];
		byte[] o = str.getBytes();
		int fix = (b.length < o.length) ? b.length : o.length;
		System.arraycopy(o, 0, b, 0, fix);
		return b;
	}
	
	/**
	 * �Է¹��� str�� off���� len��ŭ �߶� �� ���� �������ִ� �޼ҵ�
	 * @param str       ġȯ ��� ���ڿ�
	 * @param len       ���ڿ��� �ڸ� ���� ��
	 * @return String   ġȯ��� ���ڿ��� len��ŭ�� ���ڿ�
	 */
	public static String fixLength(String str, int len) {
		return fixLength(str, 0, len);
	}
	
	/**
	 * �Է¹��� str�� off���� len��ŭ �߶� �� ���� �������ִ� �޼ҵ�
	 * @param str       ġȯ ��� ���ڿ�
	 * @param off       ���� ���ڿ��� �ڸ���
	 * @param len       ���� ���ڿ����� �ڸ� ���� ��
	 * @return String   ġȯ��� ���ڿ��� off���� len��ŭ�� ���ڿ�
	 */
	public static String fixLength(String str, int off, int len) {
		int str_len = str.length();
		if (str_len <= off || len <= 0) {
			return "";
		}
		if (str_len - off < len) {
			return str.substring(off);
		}
		return str.substring(off, len + off);
	}
	
	public static boolean isNumber(Object element)
	{
		if (element instanceof Number)
			return true;
		else
			return false;
	}
	
	public static boolean isString(Object element)
	{
		if (element instanceof String)
			return true;
		else
			return false;
	}
	
	/**
	 *
	 * �Է��� ���� null �Ǵ� null String �� ��� true�� return �Ѵ�.
	 *
	 * <pre>
	 *
	 * [��� ����]
	 *
	 * ValidationUtil.isEmpty("")		===> true
	 * ValidationUtil.isEmpty(null)	===> true
	 * ValidationUtil.isEmpty("1")		===> false
	 *
	 * </pre>
	 *
	 * @param value
	 * @return boolean
	 * @roseuid 40394A4B0251
	 */
	public static boolean isEmpty(String value)
	{
		if (value == null || "".equals(value.trim()))
			return true;
		return false;
	}
	
	/**
	 *
	 * �Է��� Array�� ���� �Է��� Key �� ù��°�� ���� index�� return �Ѵ�.
	 *
	 * <pre>
	 *
	 * [��� ����]
	 *
	 *	String [] a = new String[3];
	 *	a[0] = new String("ccc");
	 *	a[1] = new String("bbb");
	 *	a[2] = new String("aaa");
	 *
	 *	searchArray(a,"aaa")	===> 2
	 *
	 *	String [] a = new String[3];
	 *	a[0] = new String("ccc");
	 *	a[1] = new String("bbb");
	 *	a[2] = new String("aaa");
	 *
	 *	searchArray(a,"a")	===> -1
	 *
	 * </pre>
	 *
	 * @param array
	 * @param key
	 * @return int
	 */
	public static int searchArray(Object [] array, Object key) {
		if (key==null || array == null)
			return -1;
		for (int i = 0; i < array.length; i++) {
			if (key.equals(array[i]))
				return i;
		}
		return -1;
	}
	
	/**
	 * Object�� null�� fix���ִ� ���ڿ�
	 *
	 * @param o     Object
	 */
	public static void fixNull(Object o) {
		if (o == null) {
			return;
		}
		Class c = o.getClass();
		if (c.isPrimitive()) {
			return;
		}
		Field[] fields = c.getFields();
		for (int i = 0; i < fields.length; i++) {
			try {
				Object f = fields[i].get(o);
				Class fc = fields[i].getType();
				if (fc.getName().equals("java.lang.String")) {
					if (f == null) {
						fields[i].set(o, "");
					}
					else {
						fields[i].set(o, f);
					}
				}
			}
			catch (Exception e) {
			}
		}
	}
	
	/**
	 * ��� ������ Null
	 * @param o
	 */
	public static void fixNullAll(Object o) {
		if (o == null) {
			return;
		}
		Class c = o.getClass();
		if (c.isPrimitive()) {
			return;
		}
		if (c.isArray()) {
			int length = Array.getLength(o);
			for (int i = 0; i < length; i++) {
				Object element = Array.get(o, i);
				fixNullAll(element);
			}
		}
		else {
			Field[] fields = c.getFields();
			for (int i = 0; i < fields.length; i++) {
				try {
					Object f = fields[i].get(o);
					Class fc = fields[i].getType();
					if (fc.isPrimitive()) {
						continue;
					}
					if (fc.getName().equals("java.lang.String")) {
						if (f == null) {
							fields[i].set(o, "");
						}
						else {
							fields[i].set(o, f);
						}
					}
					else if (f != null) {
						fixNullAll(f);
					}
					else {} // Some Object, but it's null.
				}
				catch (Exception e) {
				}
			}
		}
	}
	
	/**
	 * Object�� �Է¹޾� ���ڿ� �յ��� ������ �����ϰ� Null�� fix���ִ� �޼ҵ�
	 *
	 * @param o     Object
	 */
	public static void fixNullAndTrim(Object o) {
		if (o == null) {
			return;
		}
		Class c = o.getClass();
		if (c.isPrimitive()) {
			return;
		}
		Field[] fields = c.getFields();
		for (int i = 0; i < fields.length; i++) {
			try {
				Object f = fields[i].get(o);
				Class fc = fields[i].getType();
				if (fc.getName().equals("java.lang.String")) {
					if (f == null) {
						fields[i].set(o, "");
					}
					else {
						String item = trim( (String) f);
						fields[i].set(o, item);
					}
				}
			}
			catch (Exception e) {
			}
		}
	}
	
	/**
	 * Object�� �Է¹޾� ��繮�ڿ��� �����ϰ� Null�� fix���ִ� �޼ҵ�
	 *
	 * @param o Object
	 */
	public static void fixNullAndTrimAll(Object o) {
		if (o == null) {
			return;
		}
		Class c = o.getClass();
		if (c.isPrimitive()) {
			return;
		}
		if (c.isArray()) {
			int length = Array.getLength(o);
			for (int i = 0; i < length; i++) {
				Object element = Array.get(o, i);
				fixNullAndTrimAll(element);
			}
		}
		else {
			Field[] fields = c.getFields();
			for (int i = 0; i < fields.length; i++) {
				try {
					Object f = fields[i].get(o);
					Class fc = fields[i].getType();
					if (fc.isPrimitive()) {
						continue;
					}
					if (fc.getName().equals("java.lang.String")) {
						if (f == null) {
							fields[i].set(o, "");
						}
						else {
							String item = trim( (String) f);
							fields[i].set(o, item);
						}
					}
					else if (f != null) {
						fixNullAndTrimAll(f);
					}
					else {} // Some Object, but it's null.
				}
				catch (Exception e) {
				}
			}
		}
	}
	
	
	/**
	 * HashMap�� �Է¹޾� HashMap�� Key������ �����س��� �޼ҵ�
	 *
	 * @param map       HashMap
	 * @return String   HashMap�� Key������ ���� �迭
	 */
	public static String[] getHashMapKeys(HashMap map) {
		if (map == null)
			return null;
		
		String[] ret = new String[map.size()];
		int inc = 0;
		for (Iterator i = map.keySet().iterator(); i.hasNext(); ) {
			ret[inc++] = (String) i.next();
		}
		return ret;
	}
	
	/**
	 * ���ڿ��� �Է¹޾� ���ڿ��� ���Ե� ���ڸ� �����ؼ� ��ȯ�ϴ� �޼ҵ�
	 * @param str       �˻���� ���ڿ�
	 * @return String   ������ ���ڸ� ��� �ִ� ���ڿ�
	 */
	public static String getRawDigit(String str) {
		char[] c = str.toCharArray();
		StringBuffer buff = new StringBuffer();
		for (int i = 0; i < c.length; i++) {
			if (Character.isDigit(c[i])) {
				buff.append(c[i]);
			}
		}
		return buff.toString();
	}
	
	/**
	 * Set�� ��� ������ Object�� �迭 ���·� �����ϴ� �޼ҵ�
	 * @param set           Set
	 * @return Object       Set�� ��� ������ ���� �޼ҵ�
	 */
	public static Object[] getSetValues(Set set) {
		if (set == null)
			return null;
		
		Object[] ret = new Object[set.size()];
		int inc = 0;
		for (Iterator i = set.iterator(); i.hasNext(); ) {
			ret[inc++] = i.next();
		}
		return ret;
	}
	
	/**
	 * Throwable�� �Է¹޾� Stack�������� ��� ���븦 ���� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	 *
	 * @param e             Throwable
	 * @return String       Throwable�� ���� ���� ���ڿ�
	 */
	public static String getStackTrace(Throwable e) {
		java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
		java.io.PrintWriter writer = new java.io.PrintWriter(bos);
		e.printStackTrace(writer);
		writer.flush();
		return bos.toString();
	}
	
	/**
	 * ���� �̸��� �޾Ƽ� �ý����� �и���ȣ�� ġȯ�� ���� �̸��� �������ִ� �޼���
	 * @param fileName      ġȯ��� �����̸�
	 * @return String       �ý����� �и���ȣ�� ġȯ�� �����̸�
	 */
	public static String getSystemFileName(String fileName) {
		String separator = System.getProperty("file.separator");
		fileName = replaceAll(fileName, "\\", separator);
		fileName = replaceAll(fileName, "/", separator);
		return fileName;
	}
	
	/**
	 * ���� �޼ҵ�
	 *
	 * @param objs
	 * @param compareAttr
	 * @param order
	 */
	public static void quickSort(Object[] objs, String compareAttr, String order) {
		quickSort(objs, compareAttr, order, 0, objs.length);
	}
	
	/**
	 * ���� �޼ҵ�
	 *
	 * @param obj
	 * @param compareAttr
	 * @param order
	 * @param low
	 * @param high
	 */
	private static void quickSort(Object[] obj, String compareAttr, String order, int low, int high) {
		if (low >= high)
			return;
		
		int i, count = low;
		Object temp, pibot = obj[low];
		for (i = low + 1; i < high; i++) {
			if ( (order.equals("ASC") && compareTo(pibot, obj[i], compareAttr) > 0) ||
					(order.equals("DESC") && compareTo(pibot, obj[i], compareAttr) < 0)) {
				temp = obj[i];
				for (int j = i - 1; j >= low; j--) {
					obj[j + 1] = obj[j];
				}
				obj[low] = temp;
				count++;
			}
		}
		quickSort(obj, compareAttr, order, count + 1, i);
		quickSort(obj, compareAttr, order, low, count);
	}
	
	/**
	 * �ش� ���ڿ�(str)�� off���� leng�� ������ ���ڸ� replace�� ��ȭ�� �ִ� �޼ҵ�
	 *
	 * @param str           ġȯ ��� ���ڿ�
	 * @param off           ġȯ ��� ������
	 * @param len           ġȯ ��� ����
	 * @param replace       ġȯ�� ����
	 * @return String       ġȯ��� ���ڿ��� ġȯ�� ���ڿ��� �ٲ� ���ڿ�
	 */
	public static String replace(String str, int off, int len, String replace) {
		StringBuffer buff = new StringBuffer(str);
		buff.replace(off, off + len, replace);
		return buff.toString();
	}
	
	/**
	 * �ش� ���ڿ�(str1)�� Ư�� ���ڿ�(str2)�� off�� str2���̿��� ã�Ƽ� ���ϴ� ���ڿ�(replace)�� �ٲٱ�
	 *
	 * @param str1          ġȯ ��� ���ڿ�
	 * @param off           ġȯ ��� ���ڸ� ã�� ������
	 * @param str2          ġȯ ��� ����
	 * @param replace       ġȯ�� ����
	 * @return String       ġȯ ��� ���ڿ��� ġȯ�� ���ڿ��� �ٲ� ���ڿ�
	 */
	public static String replace(String str1, int off, String str2,
			String replace) {
		off = str1.indexOf(str2, off);
		if (off == -1)
			return str1;
		
		StringBuffer buff = new StringBuffer(str1);
		buff.replace(off, off + str2.length(), replace);
		return buff.toString();
	}
	
	/**
	 * �ش� ���ڿ�(str1)�� Ư�� ���ڿ�(str2)�� ���ڿ�(replace)�� �ٲٱ�
	 *
	 * @param str1          ġȯ ��� ���ڿ�
	 * @param str2          ġȯ ��� ����
	 * @param replace       ġȯ�� ����
	 * @return String       ġȯ ��� ���ڿ��� ġȯ�� ���ڿ��� �ٲ� ���ڿ�
	 */
	public static String replace(String str1, String str2, String replace) {
		return replace(str1, 0, str2, replace);
	}
	
	/**
	 * �ش� ���ڿ�(str1)�� Ư�� ���ڿ�(str2)�� off�� str2���̿��� ã�Ƽ� ���ϴ� ���ڿ�(replace)�� ��� �ٲٱ�
	 *
	 * @param str1          ġȯ ��� ���ڿ�
	 * @param off           ġȯ ��� ���ڸ� ã�� ������
	 * @param str2          ġȯ ��� ����
	 * @param replace       ġȯ�� ����
	 * @return String       ġȯ ��� ���ڿ��� ġȯ�� ���ڿ��� �ٲ� ���ڿ�
	 */
	public static String replaceAll(String str1, int off, String str2,
			String replace) {
		if (str1 == null || str2 == null || replace == null)
			return str1;
		
		off = str1.indexOf(str2, off);
		StringBuffer buff = new StringBuffer(str1);
		while (off != -1) {
			buff.replace(off, off + str2.length(), replace);
			str1 = buff.toString();
			if (off + str2.length() < str1.length())
				off = str1.indexOf(str2, off + str2.length() + 1);
			else
				off = -1;
		}
		return str1;
	}
	
	/**
	 * �ش� ���ڿ�(str1)�� Ư�� ���ڿ�(str2)�� ã�Ƽ� ���ϴ� ���ڿ�(replace)�� ��� �ٲٱ�
	 *
	 * @param str1          ġȯ ��� ���ڿ�
	 * @param str2          ġȯ ��� ����
	 * @param replace       ġȯ�� ����
	 * @return String       ġȯ ��� ���ڿ��� ġȯ�� ���ڿ��� �ٲ� ���ڿ�
	 */
	public static String replaceAll(String str1, String str2, String replace) {
		return replaceAll(str1, 0, str2, replace);
	}
	
	/**
	 * �ش� ���ڸ� ���� ��ȣ �������� �ٲٱ�
	 *
	 * @param zipCD     �����ȣ �������� ġȯ�� ���ڿ�
	 * @return String   �����ȣ �������� ġȯ�� ���ڿ�
	 */
	public static String toFormatZip(String zipCD) {
		if (zipCD == null || zipCD.length() != 6) {
			return zipCD;
		}
		return zipCD.substring(0, 3) + "-" + zipCD.substring(3);
	}
	
	/**
	 * �ش� ������ ��������
	 *
	 * @param s         ���� ���� ��� ���ڿ�
	 * @return String   ������ ���ŵ� ���ڿ�
	 */
	public static String trim(String s) {
		int st = 0;
		char[] val = s.toCharArray();
		int count = val.length;
		int len = count;
		while ( (st < len) && ( (val[st] <= ' ') || (val[st] == ' '))) {
			st++;
		}
		while ( (st < len) && ( (val[len - 1] <= ' ') || (val[len - 1] == ' '))) {
			len--;
		}
		return ( (st > 0) || (len < count)) ? s.substring(st, len) : s;
	}
	
}
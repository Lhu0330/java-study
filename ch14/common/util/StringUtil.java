package common.util;

// java API
import java.text.DecimalFormat;
import java.util.Vector;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * <b>class : </b> StringUtil
 * <b>Class Description</b><br>
 * String�� ���� ó���� ����ϴ� Util Class
 * <b>History</b><br>
 */
public class StringUtil {

    public StringUtil() {}

    /**
     * null ���� "" ���·� ġȯ���ִ� �޼ҵ�
     *
     * @param param     Object ������ ġȯ ���
     * @return          ġȯ�� ���ڿ�
     */
    public static String null2void(Object param) {
        if (( (String) param).trim().equals("null"))
            return "";
        if (param == null)
            return "";
        if ( ( (String) param).trim().equals(""))
            return "";
        else
            return trim( ( (String) param).trim());
    }

	/**
	 * ��Ʈ�� ���ڰ��� null�ϰ�� ���ϴ� ��Ʈ�� ��������� �����Ѵ�.
	 * @param object : check ��
	 * @param result : str�� null�ϰ�� ���ϴ� ��
	 */
	public static String null2void(String str, String result)
	{
		String returnStr = "";
		try{
			if(str==null || str.equals("null") || str.equals(""))
			{
				returnStr = result;
			}
			else
			{
				returnStr = str;
			}
		}catch(Exception e){
			returnStr = result;
		}finally{
			return delReq(returnStr);
		}
	}

    /**
     * null���� 0���� ġȯ���ִ� �޼ҵ�
     *
     * @param param     Object ������ ġȯ ���
     * @return          ġȯ�� ����
     */
    public static String null2zeroString(Object param) {
        if (param == null)
            return "0";
        if ( ( (String) param).trim().equals(""))
            return "0";
        else
            return (String) param;
    }

    /**
     * null���� 0���� ġȯ���ִ� �޼ҵ�
     *
     * @param param     Object ������ ġȯ ���
     * @return          ġȯ�� ����
     */
    public static int null2zeroint(Object param) {
        if (param == null)
            return 0;
        if ( ( (String) param).trim().equals(""))
            return 0;
        else
            return Integer.parseInt( (String) param);
    }

    /**
     * null���� 0���� ġȯ���ִ� �޼ҵ�
     *
     * @param param     Object ������ ġȯ ���
     * @return          ġȯ�� ����
     */
    public static double null2zerodbl(Object param) {
        if (param == null)
            return 0;
        if ( ( (String) param).trim().equals(""))
            return 0;
        else
            return Double.parseDouble( (String) param);
    }

    /**
     * null���� 0���� ġȯ���ִ� �޼ҵ�
     *
     * @param param     Object ������ ġȯ ���
     * @return          ġȯ�� ����
     */
    public static Integer null2zeroInt(Object param) {
        if (param == null)
            return Integer.getInteger("0");
        if ( ( (String) param).trim().equals(""))
            return Integer.getInteger("0");
        else
            return Integer.getInteger( (String) param);
    }

    /**
     * null���� 0���� ġȯ���ִ� �޼ҵ�
     *
     * @param param     Object ������ ġȯ ���
     * @return          ġȯ�� ����
     */
    public static long null2zerolong(Object param) {
        if (param == null)
            return 0;
        if ( ( (String) param).trim().equals(""))
            return 0;
        else
            return Long.parseLong( (String) param);
    }

    /**
     * null���� 0���� ġȯ���ִ� �޼ҵ�
     *
     * @param param     Object ������ ġȯ ���
     * @return          ġȯ�� ����
     */
    public static Long null2zeroLong(Object param) {
        if (param == null) {
            return Long.getLong("0");
        }

        if ( ( (String) param).trim().equals("")) {
            return Long.getLong("0");
        }
        else {
            return Long.getLong( (String) param);
        }
    }

    /**
     * �Է¹��� ���ڿ��� ���ڸ����� ���� ȭ�����ǥ���������� ��ȯ���ִ� �޼ҵ�
     *
     * @param str   ó����� ���ڿ�
     * @return      ȭ���������ǥ��� ġȯ�Ǿ��� ���ڿ�
     */
    public static String getMoneyForm(String str) {
        if (str == null)
            return "";

        int offset = str.indexOf(".");
        String work_str = "";
        String nonwork_str = "";

        if (offset > 0) {
            work_str = str.substring(0, offset);
            nonwork_str = str.substring(offset, str.length());
        }
        else {
            work_str = str;
        }

        DecimalFormat df = new DecimalFormat("###,##0");
        double d = 0.0D;

        try {
            d = Double.valueOf(work_str).doubleValue();
        }
        catch (Exception e) {
            d = 0.0D;
        }
        return df.format(d) + nonwork_str;
    }

    /**
     * �Ҽ����� �� str�� �޾Ƽ� �Ҽ��� �Ʒ� �ڸ��� cnt���� �����ִ� �޼ҵ�
     *
     * @param str       �Ҽ����� ������ ġȯ���
     * @param cnt       ġȯ�� �� �Ҽ��� �Ʒ� �ڸ���
     * @return          str�� �Ҽ��� �Ʒ� cnt�ڸ��� ���� ���ڿ�
     */
    public static String getRateForm(String str, int cnt) {
        if (str == null || str.trim().equals("")) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        if (str.indexOf(".") < 0) {
            sb.append(".");
            for (; cnt > 0; cnt--) {
                sb.append("0");
            }
        }
        else {
            for (; cnt >= str.length() - str.indexOf("."); cnt--) {
                sb.append("0");
                System.out.println(cnt);
            }
        }
        return sb.toString();
    }

    /**
     * ���ڿ��� �Է¹޾� ���ڿ� ���� 0�� �����ϴ� �޼ҵ�
     *
     * @param str       ġȯ��� ���ڿ�
     * @return String   ���ڿ��� �տ� ���Ե� 0�� ������ ���ڿ�
     */
    public static String rmZero(String str) {
        if (str == null)
            return "";

        char indexChr = ' ';
        int index = 0;
        while (index < str.length()) {
            if (str.charAt(index) == '0') {
                index++;
                continue;
            }
            indexChr = str.charAt(index);
            break;
        }
        if (index < str.length())
            return str.substring(indexChr != '.' ? index : index - 1);
        else
            return "0";
    }

    /**
     * �Է¹��� ���ڿ��� ������¹�ȣ �������� ��������ִ� �޼ҵ�
     * @param acct      ġȯ ��� ���ڿ�
     * @return          ������¹�ȣ �������� ġȯ�� ���ڿ�
     */
    public static String getAcctForm(String acct) {
        if (acct == null)
            return "";

        acct = acct.trim();
        if (acct.length() < 12)
            return acct;
        else
            return putDash(acct, 3, 7, 2);
    }

    /**
     * �Է¹��� ���ڿ��� ī���ȣ �������� ��������ִ� �޼ҵ�
     * @param card      ġȯ��� ���ڿ�
     * @return          ī���ȣ �������� ġȯ�� ���ڿ�
     */
    public static String getCardForm(String card) {
        if (card == null)
            return "";

        card = card.trim();
        if (card.length() < 16)
            return card;
        else
            return putDash(card, 4, 4, 4);
    }

    /**
     * str�� offset �ڸ� �ڿ� '-'���ڸ� �־��ִ� �޼ҵ�
     *
     * @param str       ġȯ��� ���ڿ�
     * @param offset    ġȯ��� ���ڿ� '-'���ڸ� �־��� ��ġ
     * @return          str�� offset�ڸ� �ڿ� '-'�� ÷����Ų ���ڿ�
     */
    public static String putDash(String str, int offset) {
        if (str == null)
            return "";

        if (str.length() < offset || offset <= 0)
            return str;

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == offset) {
                sb.append("-");
            }
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * str�� offset1 �ڸ��ڿ� offset1+cnt2�ڸ� �ڿ� '-'���ڸ� �־��ִ� �޼ҵ�
     * @param str       ġȯ��� ���ڿ�
     * @param offset1   ù��° '-'�� �� ��ġ
     * @param cnt2      offset1 �ڿ� �ι�° '-'�� �� ��ġ
     * @return          str�� offset1, cnt2 �ڸ� �ڿ� '-'�� �߰��� ���ڿ�
     */
    public static String putDash(String str, int offset1, int cnt2) {
        if (str == null)
            return "";

        int offset2 = offset1 + cnt2;
        if (str.length() < offset2 || offset2 <= 0)
            return str;

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == offset1 || i == offset2)
                sb.append("-");
            if (c != ' ')
                sb.append(c);
        }
        return sb.toString();
    }

    /**
     * str�� offset1 �ڸ��ڿ� offset1+cnt2�ڸ� ��, offset1+cnt2+cnt3�ڸ��ڿ� '-'���ڸ� �־��ִ� �޼ҵ�
     * @param str       ġȯ��� ���ڿ�
     * @param offset1   ù��° '-'�� �� ��ġ
     * @param cnt2      offset1 �ڿ� �ι�° '-'�� �� ��ġ
     * @param cnt3      cnt3 �ڿ� ����° '-'�� �� ��ġ
     * @return          str�� offset1, cnt2, cnt3��ġ �ڿ� '-'�� �߰��� ���ڿ�
     */
    public static String putDash(String str, int offset1, int cnt2, int cnt3) {
        if (str == null)
            return "";

        int offset2 = offset1 + cnt2;
        int offset3 = offset2 + cnt3;
        if (str.length() < offset3 || offset3 <= 0)
            return str;

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == offset1 || i == offset2 || i == offset3)
                sb.append("-");
            if (c != ' ')
                sb.append(c);
        }
        return sb.toString();
    }

    /**
     * ���ڿ� �յ��� ������ �߶��ִ� �޼ҵ�
     * @param s     ġȯ��� ���ڿ�
     * @return      ������ �߶� ���ڿ�
     */
    public static String trim(String s) {
        if (s == null)
            return "";

        int st = 0;
        char val[] = s.toCharArray();
        int count = val.length;
        int len;
        for (len = count; st < len && (val[st] <= ' ' || val[st] == '\u3000'); st++) {
            ;
        }
        for (; st < len && (val[len - 1] <= ' ' || val[len - 1] == '\u3000'); len--) {
            ;
        }
        return st <= 0 && len >= count ? s : s.substring(st, len);
    }

    /**
     * �Է¹��� ���ڿ��� length�� �ɶ����� �� ������ �ٿ��ִ� �޼ҵ�
     * @param str       ġȯ��� ���ڿ�
     * @param length    ������ ���ٿ� �ϼ��� ���ڿ��� ����
     * @return          ������ �ٿ� length�� ���̰� �� ���ڿ�
     */
    public static String getANstring(String str, int length) {
        if (str == null)
            return "";

        for (int i = length - str.length(); i > 0; i--) {
            str = str + " ";
        }
        return str;
    }

    /**
     * �Է¹��� ���ڸ� length�� �ɶ����� �� ������ �ٿ��ִ� �޼ҵ�
     * @param intstr        ġȯ��� ���ڿ�
     * @param length        ������ ���ٿ� �ϼ��� ���ڿ��� ����
     * @return              ������ �ٿ� length�� ���̰� �� ���ڿ�
     */
    public static String getNstring(int intstr, int length) {
        String str = Integer.toString(intstr);
        for (int i = length - str.length(); i > 0; i--) {
            str = "0" + str;
        }
        return str;
    }

    /**
     * ���¹�ȣ ������ ���ڿ����� '-'���ڸ� �������ִ� �޼ҵ�
     * @param str       ġȯ ��� ���ڿ�
     * @return String   '-'�� ���ŵ� ���ڿ�
     */
    public static String delDashAccNo(String str) {
        String temp = null;
        str = str.trim();
        int len = str.length();
        switch (len) {
            case 17: // '\021'
                temp = str.substring(0, 3) + str.substring(4, 10) +
                    str.substring(11, 13) + str.substring(14, 17);
                break;
            case 13: // '\r'
                temp = str.substring(0, 3) + str.substring(4, 6) +
                    str.substring(7, 13);
                break;
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            default:
                temp = str;
                break;
        }
        return temp;
    }

    /**
     * ȭ����� ǥ������ ���ڿ� ���̿� ','�� �߰����ִ� �޼ҵ�
     *
     * @param str       ġȯ ��� ���ڿ�
     * @return String   ȭ����� ǥ������ ','�� �߰��� ���ڿ�
     */
    public static String addComma(String str) {
        String temp = null;
        if (str == null) {
            temp = "0";
        }
        else {
            double change = Double.valueOf(str.trim()).doubleValue();
            DecimalFormat decimal = new DecimalFormat("###,###,###,###");
            temp = decimal.format(change);
        }
        return temp;
    }

    /**
     * �Ҽ����� ���Ե� ���ڿ��� �Ҽ��� ���ڸ��� ȭ����� ǥ������ ġȯ���ִ� �޼ҵ�
     * @param str       ġȯ ��� ���ڿ�
     * @return String   ȭ����� ǥ������ �Ҽ��� ���ڸ��� ','�� �߰��� ���ڿ�
     */
    public static String eRateFormat(String str) {
        String temp = null;
        if (str == null) {
            temp = "0";
        }
        else {
            double change = Double.valueOf(str.trim()).doubleValue();
            DecimalFormat decimal = new DecimalFormat("###,###,###.##");
            temp = decimal.format(change);
        }
        return temp;
    }

    /**
     * ���ڿ����� ','�� �������ִ� �޼ҵ�
     *
     * @param str       ġȯ��� ���ڿ�
     * @return String   ','�� ������ ���ڿ�
     */
    public static String delComma(String str) {
        if (str == null) {
            return "";
        }
        StringBuffer dest = new StringBuffer();
        for (int i = 0; i < str.length(); ) {
            int c = str.charAt(i);
            switch (c) {
                default:
                    dest.append( (char) c);
                    // fall through
                case 44: // ','
                    i++;
                    break;
            }
        }
        return dest.toString();
    }

    /**
     * ���ڿ����� '-'�� �������ִ� ���ڿ�
     * @param s         ġȯ��� ���ڿ�
     * @return String   '-'�� ������ ���ڿ�
     */
    public static String delDash(String s) {
        if (s == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '-') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * ���ڿ����� '/'�� �������ִ� ���ڿ�
     * @param s         ġȯ��� ���ڿ�
     * @return String   '-'�� ������ ���ڿ�
     */
    public static String delSlash(String s) {
        if (s == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '/') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    
    /**
     * ���ڿ����� '.'�� �������ִ� ���ڿ�
     * @param str       ġȯ��� ���ڿ�
     * @return String   '.'�� ������ ���ڿ�
     */
    public static String delDot(String str) {
        if (str == null) {
            return "";
        }
        StringBuffer dest = new StringBuffer();
        for (int i = 0; i < str.length(); ) {
            int c = str.charAt(i);
            switch (c) {
                default:
                    dest.append( (char) c);
                    // fall through
                case 46: // '.'
                    i++;
                    break;
            }
        }
        return dest.toString();
    }

    /**
     * ���ڿ����� ' '�� �������ִ� ���ڿ�
     * @param s       ġȯ��� ���ڿ�
     * @return String   ' '�� ������ ���ڿ�
     */
    public static String delSpace(String s) {
        if (s == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * ���ڿ����� Ư�� char�� �������ִ� �޼ҵ�
     * @param str       ġȯ��� ���ڿ�
     * @return String   '-',' ',':'�� ���ŵ� ���ڿ�
     */
    public static String delChar(String str) {
        if (str == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '-' && c != ' ' && c != ':') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * ������ &nbsp�±׷� ġȯ���ִ� �޼ҵ�
     * @param str       ġȯ��� ���ڿ�
     * @return String   ������ &nbsp�� ġȯ�� ���ڿ�
     */
    public static String nullToNbsp(String str) {
        String ret = null;
        try {
            ret = str;
            if (str == null)
                ret = "&nbsp;";
        }
        catch (NullPointerException e) {
            ret = "&nbsp;";
            return ret;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    /**
     * Enter�� br�±׷� �������ִ� �޼ҵ�
     *
     * @param str       ġȯ��� ���ڿ�
     * @return String   Enter�� br�±׷� ����� ���ڿ�
     */
    public static String enterToBr(String str) {
        String ret = "";
        try {
            for (StringTokenizer st = new StringTokenizer(str, "\n"); st.hasMoreTokens(); ) {
                ret = ret + st.nextToken() + "<br>";
            }
            return ret;
        }
        catch (Exception e) {
            return str;
        }
    }

    /**
     * ���ڿ��� ���Ե� ������ �������ִ� �޼ҵ�
     * @param param     ġȯ ��� ���ڿ�
     * @return String   ������ ���ŵ� ���ڿ�
     */
    public static String mTrim(String param) {
        try {
            for (int i = 0; i < param.length(); ) {
                if (param.substring(i, i + 1).equals(" ") || param.substring(i, i + 1).equals("-"))
                    param = param.substring(0, i) + param.substring(i + 1, param.length());
                else
                    i++;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        return param;
    }

    /**
     * ��ȭ��ȣ�� �Է¹޾� v_flag �ܰ迡 �ش��ϴ� ���� �������ִ� �޼ҵ�
     * @param v_telno       ó����� ���ڿ�
     * @param v_flag        ������ ���ϴ� ���ڿ� �ܰ�
     * @return String       v_flag �ܰ迡 �ش��ϴ� ���ڿ�
     */
    public static String getTelSep(String v_telno, int v_flag) {
        String telno = "";
        String d_telno = "";
        String r_telno = "";
        String telno1 = "";
        String telno2 = "";
        String telno3 = "";
        try {
            if (v_telno != null) {
                telno = mTrim(v_telno);
                if (telno.length() >= 9) {
                    d_telno = telno.substring(0, 2);
                    if (d_telno.equals("02")) {
                        telno1 = telno.substring(0, 2);
                    }
                    else {
                        telno1 = telno.substring(0, 3);
                    }
                    telno2 = telno.substring(telno1.length(),
                                             telno.length() - 4);
                    telno3 = telno.substring(telno.length() - 4, telno.length());
                    if (v_flag == 1) {
                        r_telno = telno1;
                    }
                    else
                    if (v_flag == 2) {
                        r_telno = telno2;
                    }
                    else
                    if (v_flag == 3) {
                        r_telno = telno3;
                    }
                    else
                    if (v_flag == 4) {
                        r_telno = telno1 + "-" + telno2 + "-" + telno3;
                    }
                }
                else {
                    r_telno = telno;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        return r_telno;
    }

    /**
     * �Է¹��� ���ڿ����� out_len�� ���̸�ŭ ���ڿ��� �߶� �����ϴ� �޼ҵ�
     *
     * @param str           ġȯ ��� ���ڿ�
     * @param out_len       �߶� ���ڿ��� ����
     * @return String       �߶� ���ڿ�
     */
    public static String getFixLen(String str, int out_len) {
        if (str == null || str.trim().equals("") || str.equals(null)) {
            return "ġȯ ��� ���ڿ��� �����ϴ�.";
        }
        byte input[] = str.getBytes();
        byte temp[] = new byte[out_len];
        int in_len = input.length;
        if (in_len > out_len)
            return bytesToText(input, 0, out_len);
        else
            return str;
    }

    /**
     * byte�� ���ڿ��� ġȯ���ִ� �޼ҵ�
     *
     * @param b             ����Ʈ �迭
     * @param bytesStart
     * @param textLength
     * @return String       ���ڿ��� ġȯ�� �����
     */
    public static String bytesToText(byte b[], int bytesStart, int textLength) {
        int len = 0;
        int i;
        for (i = bytesStart; i < b.length && len < textLength; i++) {
            if (b[i] >= 0 && b[i] <= 255) {
                len++;
                continue;
            }
            if ( ( -95 > b[i] || b[i] > -84) && ( -80 > b[i] || b[i] > -56) &&
                ( -54 > b[i] || b[i] > -3)) {
                break;
            }
            i++;
            try {
                if ( -95 <= b[i] && b[i] <= -2) {
                    len++;
                    continue;
                }
                i--;
            }
            catch (Exception e) {
                i--;
            }
            break;
        }
        if (i == bytesStart) {
            return "";
        }
        else {
            return new String(b, bytesStart, i);
        }
    }

    /**
     * �Է¹��� ���ڿ��� ����.����.���� ���θ� ���ϴ� �޼ҵ�
     *
     * @param input     ġȯ��� ���ڿ�
     * @return String   �˻� ���
     */
    public static String isEngDigitOrLetter(String input) {
        if (input == null || input.equals(""))
            return "";

        byte binput[] = input.getBytes();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                return "";
            }
        }
        for (int i = 0; i < binput.length; i++) {
            if ( (binput[i] < 0 || binput[i] > 255) &&
                ( -95 <= binput[i] && binput[i] <= -84 ||
                 -80 <= binput[i] && binput[i] <= -56 ||
                 -54 <= binput[i] && binput[i] <= -3)) {
                return "";
            }
        }
        return input;
    }

    /**
     * ���ڿ� ���� Ư�� ���� ��ü���ڷ� �������ִ� �޼ҵ�
     *
     * @param in        ġȯ ��� ���ڿ�
     * @param from      ġȯ ��� ����
     * @param to        ġȯ �� ����
     * @return String   ġȯ�� ���ڿ�
     */
    public static String replace(String in, String from, String to) {
        StringBuffer sb = new StringBuffer(in.length() * 2);
        String posString = in.toLowerCase();
        String cmpString = from.toLowerCase();
        int i = 0;
        for (boolean done = false; i < in.length() && !done; ) {
            int start = posString.indexOf(cmpString, i);
            if (start == -1) {
                done = true;
            }
            else {
                sb.append(in.substring(i, start) + to);
                i = start + from.length();
            }
        }
        if (i < in.length()) {
            sb.append(in.substring(i));
        }
        return sb.toString();
    }

    /**
     * �Է¹��� ���ڿ��� ������ ���ڿ��� ��ȯ���ִ� �޼ҵ�
     * @param sTagString    ġȯ ��� ���ڿ�
     * @return String       ġȯ ��� ���ڿ�
     */
    public static String replaceStr(String sTagString) {
        String sTextString = null;
        sTextString = replace(sTagString, "\"", "&quot;");
        sTextString = replace(sTextString, "& ", "&amp; ");
        sTextString = replace(sTextString, "<", "&lt;");
        sTextString = replace(sTextString, ">", "&gt;");
        sTextString = replace(sTextString, "\n", "<br>\n");
        return sTextString;
    }

	/**
	 * ��Ʈ���� ���ڰ��� HTML �ױ����³� �ݴ�� ��ȯ�Ѵ�.
	 * @param str ��ȯ�ϰ��� �ϴ� �ؽ�Ʈ
	 * @param n Ÿ��
	 * @return ��ȯ�� �ؽ�Ʈ�� �����Ѵ�.
	 */
  public static String convertText(String str,String n) {
  
      if(n.equals("1"))
      {
          if(str != null)
          {
              str = str.replaceAll("<", "&lt;");
              str = str.replaceAll("\n", "<br>");
              str = str.replaceAll("  ", "&nbsp;&nbsp;");
          }
      } else
      if(n.equals("2"))
      {
          if(str != null)
          {
              str = str.replaceAll("\b", "'");
              str = str.replaceAll("&quot;", "\"");
              str = str.replaceAll("\n", "<br>");
          }
      }
  	return str;
  }

  public static String convertHtml(String str) {
	  
      if(str != null)
      {
          str = str.replaceAll("&#38quot;", "\"");
          str = str.replaceAll("&lt;", "<");
          str = str.replaceAll("&gt;", ">");
//        str = str.replaceAll("&nbsp;", " ");
          str = str.replaceAll("&#38nbsp;", "&nbsp;");
          str = str.replaceAll("&#38amp;", "&");
      }
  	return str;
  }
	
  public static String convertSpace(String str) {
	  
      if(str != null)
      {
          str = str.replaceAll("\n", "");
          str = str.replaceAll("<br>", "");
          str = str.replaceAll("&nbsp;", "");
          str = str.replaceAll("<", "&lt;"); 
          str = str.replaceAll(">", "&gt;"); 
          str = str.replaceAll(" ", "");	
          str = str.replaceAll("chr(13)", "");
          str = str.replaceAll("chr(10)", "");
          str = str.replaceAll("chr(13)||chr(10)", "");
          str = str.replaceAll("\n\r", "");
      }
  	return str;
  }

	public static String chkLimit(String title,int maxNum)
	{	
		int re_level = 2;
	    int blankLen = 0;
	    int count = 0;
	    char c;
	    int tLen =title.length();
	    int s=0;
	    
	    if(re_level != 0){
	      blankLen = (re_level +1)*2;
	    }
	    
	    for(s=0;s<tLen;s++){
	      c = title.charAt(s);
	      if((int)(count) > (int)(maxNum-blankLen)){
	        break;
	      }
	      
	      if(c>127) count +=2 ;
	      else count ++;
	    }     
	    return (tLen >s)? title.substring(0,s)+"" : title;
	}

    /**
     * ���а� ���̿� ���� ���� �� �����ϴ� ���� ����
     *
     * @param strSplit_String       ġȯ ��� ���ڿ�
     * @param chrGubun_Character    ���а�
     * @return Vector               ���а��� �������� ���� ���ڿ��� ��� �ִ� ����
     */
    public static Vector split(String strSplit_String, char chrGubun_Character) {
        int intFrom = 0; // substring�ÿ� From �ڸ�
        int intTo = 0; // substing�ÿ� To �ڸ�
        int index = 0;
        Vector vc = new Vector();
        for (intTo = 0; intTo < strSplit_String.length(); intTo++) {
            if (strSplit_String.charAt(intTo) == chrGubun_Character) {
                if (intFrom < intTo) {
                    vc.addElement(strSplit_String.substring(intFrom, intTo));
                    index++;
                    intFrom = intTo + 1;
                }
            }
        }
        vc.addElement(strSplit_String.substring(intFrom, strSplit_String.length()));
        return vc;
    }

    /**
     * ���а� ���̿� ���� ���� �� ���鰪�� ���� ����
     *
     * @param strSplit_String       ġȯ ��� ���ڿ�
     * @param chrGubun_Character    ���а�
     * @return Vector               ���а��� �������� ���� ���ڿ��� ��� �ִ� ����
     */
    public static Vector null2split(String strSplit_String, char chrGubun_Character) {
        int intFrom = 0; // substring�ÿ� From �ڸ�
        int intTo = 0; // substing�ÿ� To �ڸ�
        int index = 0;
        Vector vc = new Vector();
        for (intTo = 0; intTo < strSplit_String.length(); intTo++) {
            if (strSplit_String.charAt(intTo) == chrGubun_Character) {
                vc.addElement(strSplit_String.substring(intFrom, intTo));
                index++;
                intFrom = intTo + 1;
            }
        }
        vc.addElement(strSplit_String.substring(intFrom, strSplit_String.length()));
        return vc;
    }

    /**
     *
     * �Էµ� ��Ʈ������ ������(delimiter)�� ������ ��� ���ڸ� �������� ���ڿ��� �и��ϰ� �и��� ���ڿ��� �迭�� �Ҵ��Ͽ� ��ȯ�Ѵ�.
     *
     * <pre>
     *
     * [��� ����]
     *
     * split2Array("ABCDEABCDE", "BE")
     * ===> A
     *         CD
     *         A
     *         CD
     *
     * </pre>
     *
     * @param strTarget
     * @param delimiter
     * @return java.NATIONAL_CD.String[]
     * @roseuid 403A9A6E036B
     */
    public static String[] split2Array(String strTarget, String delimiter) {
        if(strTarget == null) return null;

        StringTokenizer st = new StringTokenizer(strTarget, delimiter);
        String[] names = new String[st.countTokens()];
        for(int i = 0; i < names.length; i++) {
            names[i] = st.nextToken().trim();
        }

        return names;
    }

    /**
     *
     * �Էµ� ��Ʈ������ ������(delimiter)�� �ϳ��� �ܾ�� �ν��ϰ� �� �ܾ �������� ���ڿ��� �и�, �и��� ���ڿ��� �迭�� �Ҵ��Ͽ� ��ȯ�Ѵ�.
     *
     * <pre>
     *
     * [��� ����]
     *
     * split2Array("AA-BBB--DDDD", "-",true)
     * ===> AA
     *         BBB
     *
     *         DDDD
     *
     * split2Array("AA-BBB--DDDD", "-", false);
     * ===> AA
     *         BBB
      *         DDDD
     *
     * split2Array("ABCDEABCDE", "BE", true)
     * ===> ABCDEABCDE
     *
     * </pre>
     *
     * @param strTarget
     * @param delimiter ������(delimiter)�� �ν��� �ܾ�μ� ��� ���ڿ����� ���Ե��� �ʴ´�.
     * @param isIncludedNull �����ڷ� ���е� ���ڿ��� Null�� ��� ������� ���Կ��� ( true : ����, false : �������� ����. )
     * @return java.NATIONAL_CD.String[]
     * @roseuid 403A9A6E0399
     */
    public static String[] split2Array(String strTarget, String delimiter, boolean isIncludedNull) {

        int index = 0;
        String[] resultStrArray = null;

        try {
            Vector v =  new Vector();

            String strCheck = new String(strTarget);
            while (strCheck.length() != 0) {
                int begin = strCheck.indexOf(delimiter);
                if (begin == -1) {
                    v.add(strCheck);
                    break;
                } else {
                    int end = begin + delimiter.length();
                    //	StringTokenizer�� �����ڰ� �������� ��ø�Ǿ� ���� ��� ���� ���ڿ��� ��ȯ���� ����.
                    // ���� �Ʒ��� ���� �ۼ���.
                    if (isIncludedNull) {
                        v.add(strCheck.substring(0, begin));
                        strCheck = strCheck.substring(end);
                        if (strCheck.length() == 0 ) {
                            v.add(strCheck);
                            break;
                        }
                    } else{
                        if (! CommonUtil.isEmpty(strCheck.substring(0, begin))){
                            v.add(strCheck.substring(0, begin));
                        }
                        strCheck = strCheck.substring(end);
                    }

                }
            }

            String[] tempString = new String[0];
            resultStrArray = (String[]) v.toArray(tempString);

        } catch (Exception e) {
            return resultStrArray;
        }

        return resultStrArray;
    }

    /**
     *
     * �Էµ� ��Ʈ������ ������ ����(elimination)�� ������ ��� ���ڸ� �����Ѵ�.
     *
     * <pre>
     *
     * [��� ����]
     *
     * stringRemove("02)2344-5555", "-# /)(:;")	===> 0223445555
     * stringRemove("ABCDEABCDE", "BE")		===> ACDACD
     *
     * </pre>
     * @param strTarget
     * @param elimination
     * @return java.NATIONAL_CD.String
     */
    public static String stringRemove(String strTarget, String elimination) {
        if (strTarget == null || strTarget.length() == 0 || elimination == null)
            return strTarget;
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(strTarget, elimination);
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken());
        }
        return sb.toString();
    }

    /**
     *
     * �Է��� ���ڿ� �յڿ�  Ư�����ڸ� Left Padding�� ���ڿ��� ��ȯ�Ѵ�.
     *
     * <pre>
     *
     * [��� ����]
     *
     * padLeft("AAAAAA", 'Z', 10) )	===> ZZZZAAAAAA
     *
     * </pre>
     *
     * @param str
     * @param padValue
     * @param length
     * @param value
     * @return java.NATIONAL_CD.String
     */
    public static String padLeft(String value, char padValue, int length) {

        if (value == null)
            value = "";

        byte[] orgByte = value.getBytes();
        int orglength = orgByte.length;

        if (orglength < length) { //add Padding character
            byte[] paddedBytes = new byte[length];

            int padlength = length - orglength;

            for (int i = 0; i < padlength; i++) {
                paddedBytes[i] = (byte) padValue;
            }

            System.arraycopy(orgByte, 0, paddedBytes, padlength, orglength);

            return new String(paddedBytes);
        }
        else if (orglength > length) { //�־��� ���̺��� ���´ٸ�, �־��� ���̸�ŭ�� �߸���.
            byte[] paddedBytes = new byte[length];
            System.arraycopy(orgByte, 0, paddedBytes, 0, length);
            return new String(paddedBytes);
        }

        return new String(orgByte);
    }

    /**
     *
     * �Է��� ���ڿ� �յڿ�  Ư�����ڸ� Right Pading�� ���ڿ��� ��ȯ�Ѵ�.
     *
     * <pre>
     *
     * [��� ����]
     *
     * padRight("AAAAAA", 'Z', 10) )	===> AAAAAAZZZZ
     *
     * </pre>
     *
     * @param str
     * @param padValue
     * @param length
     * @param value
     * @return java.NATIONAL_CD.String
     */
    public static String padRight(String value, char padValue, int length) {

        if (value == null)
            value = "";

        byte[] orgByte = value.getBytes();
        int orglength = orgByte.length;

        if (orglength < length) { //add Padding character
            byte[] paddedBytes = new byte[length];

            System.arraycopy(orgByte, 0, paddedBytes, 0, orglength);
            while (orglength < length) {
                paddedBytes[orglength++] = (byte) padValue;
            }
            return new String(paddedBytes);
        }
        else if (orglength > length) { //�־��� ���̺��� ���´ٸ�, �־��� ���̸�ŭ�� �߸���
            byte[] paddedBytes = new byte[length];
            System.arraycopy(orgByte, 0, paddedBytes, 0, length);
            return new String(paddedBytes);
        }

        return new String(orgByte);
    }

   
	/**
	 * ���ڿ� ġȯ XSS ������
	 * �μ��� ���� ���ڿ����� <, > �� ġȯ��
	 * @param str
	 * @return
	 */
	public static String getScriptReplace(String str,String gubun){
		str = (str == null)? "" : str;
		if("tag".equals(gubun)){
			str = str.replaceAll("<+[S,s][C,c][R,r][I,i][P,p][T,t]", "<s-cript")
					 .replaceAll("[S,s][C,c][R,r][I,i][P,p][T,t]+>", "s-cript>")
					 .replaceAll("&lt;+[S,s][C,c][R,r][I,i][P,p][T,t]", "&lt;s-cript")
					 .replaceAll("[S,s][C,c][R,r][I,i][P,p][T,t]+&gt;", "s-cript&gt;");
		}else if("html".equals(gubun)){
			str = str.replaceAll("\"","&quot;")
					 .replaceAll("&","&#38")
					 .replaceAll("<","&lt;")
					 .replaceAll(">","&gt;")
					 .replaceAll("&lt;+[S,s][C,c][R,r][I,i][P,p][T,t]", "&lt;script")
					 .replaceAll("[S,s][C,c][R,r][I,i][P,p][T,t]+&gt;", "script&gt;");
		}
    	return str;
    }

	/**
	 * CharacterSet ��ȯ
	 * @param s
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String changeCharSet(String s, String IO) {
		try {
			if(s==null){
				s = "";
			} else {
				if ("O".equals(IO)) {
					//System.out.println("I'm OUTPUT");
					s = new String(s.getBytes("8859_1"), "KSC5601");
				} else if ("I".equals(IO)) {
					//System.out.println("I'm INPUT");
					s = new String(s.getBytes("KSC5601"), "8859_1");
					//System.out.println(s);
				}
			}
			return s;
		} catch (Exception e){
			return "changeCharSet Error"; 
		}
	}	

	/**
	 * ��Ʈ���� ��ū�� ���� ������ ���Ϳ� �־� ��ȯ�Ѵ�.
	 */
	public static String[] explode(String token, String input_str) {
		int size = 0;
		String[] ret_str = null;
		if(input_str.equals("")) {
			return null;
		}

		StringTokenizer stz = new StringTokenizer(input_str, token);
		size = stz.countTokens();

		if(size>0) {
			ret_str = new String[size];

			for(int i=0; i<size; i++) {
				ret_str[i] = stz.nextElement().toString();
			}

		}
		return ret_str;
	}

	/**
	 * ��¥���� ��,��,���� ������ �����ϴ� �޼���
	 * @param str 8�ڸ��� ��¥���ڿ�
	 * @return ��¥���� ��,��,���� ������ ����
	 */
	public static String convertDate(String str)
	{
		StringBuffer result = new StringBuffer();
		if(str != null && str.length()==8){
		  result.append(str.substring(0,4))
		  		.append("�� ")
		  		.append(str.substring(4,6))
		  		.append("�� ")
		  		.append(str.substring(6))
		  		.append("��");
		  return result.toString();
		}else{
		  return null2void(str);
		}
	}

	/**
	 * ��¥���� -�� ������ �����ϴ� �޼���
	 * @param str 8�ڸ��� ��¥���ڿ�
	 * @return ��¥���� ��,��,���� ������ ����
	 */
	public static String convertDashDate(String str)
	{
		StringBuffer result = new StringBuffer();
		if(str != null && str.length()==8){
		  result.append(str.substring(0,4))
		  		.append("-")
		  		.append(str.substring(4,6))
		  		.append("-")
		  		.append(str.substring(6));
		  return result.toString();
		}else{
		  return null2void(str);
		}
	}
	
	/**
	 * �ð� ���� :�� ������ �����ϴ� �޼���
	 * @param str 4�ڸ��� ��¥���ڿ�
	 * @return �ð� ���� ��,���� ������ ����
	 */
	public static String convertDashTime(String str)
	{
		StringBuffer result = new StringBuffer();
		if(str != null && str.length()==4){
		  result.append(str.substring(0,2))
		  		.append(":")
		  		.append(str.substring(2,4));
		  return result.toString();
		  
		}else{
		  return null2void(str);
		}
	}

	/**
	 * ��¥���� ���ϴ� Ÿ������ ������ �����ϴ� �޼���
	 * @param str 8�ڸ��� ��¥���ڿ�
	 * @return ��¥���� ���ϴ� Ÿ������ ������ ����
	 */
	public static String convertDate(String str, String oper)
	{
		StringBuffer result = new StringBuffer();
		if(str != null && str.length()==8){
		  result.append(str.substring(0,4))
		  		.append(oper)
		  		.append(str.substring(4,6))
		  		.append(oper)
		  		.append(str.substring(6))
		  		.append(oper);
		  return result.toString();
		}else{
		  return null2void(str);
		}
	}
	
	/**
	 * �����ȣ 6�ڸ��� 3�ڸ� ��� '-'�� �����ؼ� �����Ѵ�.
	 * @param str 6�ڸ� �����ȣ
	 * @return ��� ����� �����ȣ
	 */
	public static String convertAddr(String str)
	{
		StringBuffer result = new StringBuffer();
		if(str != null && str.length()==6){
		  result.append(str.substring(0,3))
		  		.append("-")
		  		.append(str.substring(3));
		  return result.toString();
		}else{
		  return null2void(str);
		}
	}

	/**
	 * �����  10�ڸ��� ����� ��ȣ ü�迡 ��� '-'�� �����ؼ� �����Ѵ�.
	 * @param str ����� ��Ϲ�ȣ 10�ڸ�
	 * @return ��� ����� ����� ��Ϲ�ȣ
	 */
	public static String convertSaupja(String str)
	{
		StringBuffer result = new StringBuffer();
		if(str != null && str.length()==10){
		  result.append(str.substring(0,3))
		  		.append("-")
		  		.append(str.substring(3,5))
		  		.append("-")
		  		.append(str.substring(5));
		  return result.toString();
		}else{
		  return null2void(str);
		}
	}

	/**
	 * �־��� ���ڿ����� html�±׸� ���� �Ѵ�..
	 * @param str
	 * @return String
	 */
	public static String delHtml(String str){
		try{
		 Pattern p = Pattern.compile("\\<(\\/?)(\\w+)*([^<>]*)>");
		 Matcher m = p.matcher(str);
		 str = m.replaceAll("");
		}catch(Exception e){
			
		}
		return str;
	}
	
	/**
	 * �־��� ���ڿ����� html�±׸� ���� �Ѵ�..
	 * @param str
	 * @return String
	 */
	public static String delReq(String str){
		try{
			str = str.replaceAll("\"", "").replaceAll("'", "").replaceAll("--", "").replaceAll("##", "").replaceAll(";", "");
		}catch(Exception e){
			
		}
		return str;
	}
	
	/**
	  * % ������ ��ȯ�Ѵ�.
	  * @param str , int
	  * @param n Ÿ��
	  * @return ���� Percent �� �����Ѵ�.
	  */
	  public static int getPercent(String isum, String sValue) {
	  
	   int iSum = 0;
	   String sSum = isum;
	   
	   int fSum = (int) (Float.parseFloat(sValue) / Float.parseFloat(isum)*100);
	   
	   iSum = fSum;

	   if(iSum == 0) iSum = 1;
	   
	   return iSum;
	  }
	  
}
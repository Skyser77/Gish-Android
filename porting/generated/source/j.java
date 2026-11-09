/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;

public final class j {
    private static String var_java_lang_String_a;
    private static String b;
    private static j var_j_a;
    private String[] var_java_lang_String_arr_a;
    private static Class var_java_lang_Class_a;

    private j(String[] stringArray) {
        this.var_java_lang_String_arr_a = stringArray;
    }

    public final void void_a() {
        j j2 = j.b();
        this.var_java_lang_String_arr_a = j2.var_java_lang_String_arr_a;
    }

    public final String a(int n2, Object[] objectArray) {
        if (n2 < 0 || n2 >= ((j)((Object)string)).var_java_lang_String_arr_a.length) {
            return null;
        }
        String string = ((j)((Object)string)).var_java_lang_String_arr_a[n2];
        if (string == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\\') {
                c2 = string.charAt(++i2);
                stringBuffer.append(c2);
                continue;
            }
            if (c2 == '%') {
                char c3;
                int n3;
                StringBuffer stringBuffer2 = new StringBuffer();
                for (n3 = i2 + 1; n3 < string.length() && Character.isDigit(c3 = string.charAt(n3)); ++n3) {
                    stringBuffer2.append(c3);
                    ++i2;
                }
                n3 = Integer.parseInt(stringBuffer2.toString());
                if (objectArray == null) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                stringBuffer.append(objectArray[n3]);
                continue;
            }
            stringBuffer.append(c2);
        }
        return stringBuffer.toString();
    }

    public final String a(int n2) {
        return this.a(n2, (Object[])null);
    }

    public final String a(int n2, int[] nArray) {
        Object[] objectArray = null;
        objectArray = new Object[nArray.length];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            objectArray[i2] = new Integer(nArray[i2]);
        }
        return this.a(n2, objectArray);
    }

    public static j j_a() {
        if (var_j_a == null) {
            var_j_a = j.b();
        }
        return var_j_a;
    }

    private static j b() {
        Object object = var_java_lang_String_a;
        try {
            if (object == null) {
                object = "en-US";
                object = ("/zc-" + (String)object + ".txt").replace('_', '-');
            }
            object = j.a((String)object, b);
            object = j.a((String)object, 0, 0);
            return new j((String[])object);
        }
        catch (IOException iOException) {
            throw new RuntimeException();
        }
    }

    public static void void_a(String string) {
        var_java_lang_String_a = string;
    }

    public static void b(String string) {
        b = string;
    }

    private static final String[] a(String string, int n2, int n3) {
        char c2;
        int n4;
        if (n2 >= string.length()) {
            return new String[n3];
        }
        int n5 = 0;
        int n6 = 0;
        for (n4 = n2; n4 < string.length() && (c2 = string.charAt(n4)) != '\n'; ++n4) {
            n6 = c2;
            ++n5;
        }
        n4 = n5;
        if (n6 == 13) {
            --n4;
        }
        if (n4 > 0) {
            ++n3;
        }
        String[] stringArray = j.a(string, n2 + n5 + 1, n3);
        if (n4 > 0) {
            stringArray[n3 - 1] = string.substring(n2, n2 + n4).intern();
        }
        return stringArray;
    }

    private static String a(String string, String string2) {
        InputStream inputStream = null;
        inputStream = (var_java_lang_Class_a == null ? (var_java_lang_Class_a = j.java_lang_Class_a("j")) : var_java_lang_Class_a).getResourceAsStream(string);
        if (null == inputStream) {
            throw new IOException();
        }
        string = j.a(inputStream, string2);
        try {
            inputStream.close();
        }
        catch (IOException iOException) {}
        return string;
    }

    private static String a(InputStream inputStream, String string) {
        byte[] byArray = new byte[1024];
        int n2 = 0;
        int n3 = 0;
        while ((n3 = inputStream.read()) > 0) {
            if (n2 >= byArray.length) {
                int n4 = byArray.length;
                byte[] byArray2 = new byte[n4 += 512];
                System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
                byArray = byArray2;
            }
            byArray[n2++] = (byte)n3;
        }
        inputStream.close();
        if (string == null) {
            return new String(byArray, 0, n2);
        }
        return new String(byArray, 0, n2, string);
    }

    private static Class java_lang_Class_a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    static {
        var_java_lang_String_a = null;
        b = null;
    }
}


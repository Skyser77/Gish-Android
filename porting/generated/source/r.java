/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Timer;
import java.util.TimerTask;

public final class r
implements Runnable {
    private an var_an_a;
    private c var_c_a;
    public Thread var_java_lang_Thread_a;
    ah var_ah_a;
    private Object var_java_lang_Object_a = new Object();
    private volatile boolean var_boolean_c = true;
    public volatile boolean var_boolean_a;
    volatile boolean var_boolean_b;
    private Object var_java_lang_Object_b = new Object();
    private Timer var_java_util_Timer_a;
    private byte[] var_byte_arr_a;
    private byte[] var_byte_arr_b;
    private int var_int_a;
    private short[] var_short_arr_a;
    private short[] var_short_arr_b;
    private int var_int_b;
    private int var_int_c;
    public Throwable var_java_lang_Throwable_a = null;

    public r(an an2, ah ah2) {
        this.var_an_a = an2;
        this.var_java_lang_Thread_a = new Thread(this);
        this.var_ah_a = ah2;
        this.var_short_arr_a = new short[6];
        this.var_short_arr_b = new short[6];
        for (int i2 = 0; i2 < this.var_short_arr_a.length; ++i2) {
            this.var_short_arr_a[i2] = 254;
            this.var_short_arr_b[i2] = 254;
        }
        this.var_c_a = new c();
        this.var_java_util_Timer_a = new Timer();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void void_a() {
        Object object = this.var_java_lang_Object_a;
        synchronized (object) {
            this.var_boolean_c = false;
            this.var_java_lang_Object_a.notify();
        }
        this.var_ah_a.void_b();
    }

    void b() {
        try {
            this.void_a();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public final void run() {
        block62: {
            this.var_java_lang_Throwable_a = null;
            var1_2 = false;
            try {
                var1_2 = this.var_ah_a.boolean_b();
                if (var1_2) {
                    this.var_ah_a.a(this);
                }
                this.var_ah_a.void_a();
            }
            catch (SecurityException var2_6) {
                this.var_java_lang_Throwable_a = var2_6;
                this.b();
            }
            catch (IOException var2_7) {
                if (!this.var_boolean_c) break block62;
                this.var_java_lang_Throwable_a = var2_7;
                this.b();
            }
        }
        if (this.var_boolean_c) {
            var2_8 = new e(this);
            this.var_java_util_Timer_a.schedule((TimerTask)var2_8, 15000L);
        }
        var2_9 = false;
        if (var1_2) {
            var1_3 = this.var_java_lang_Object_a;
            synchronized (var1_3) {
                while (this.var_boolean_c) {
                    try {
                        this.var_java_lang_Object_a.wait();
                    }
                    catch (InterruptedException v0) {}
                }
            }
        }
        block38: while (this.var_boolean_c) {
            var2_10 = this.int_a();
            switch (var2_10) {
                case 0: {
                    var1_4 = this;
                    if (var1_4.var_int_a == 0 || var1_4.var_byte_arr_b[0] != -95) ** GOTO lbl219
                    if (var1_4.var_boolean_b) ** GOTO lbl46
                    switch (var1_4.var_byte_arr_b[1]) {
                        case 3: 
                        case 4: 
                        case 5: {
                            ** GOTO lbl47
                        }
                    }
                    continue block38;
lbl46:
                    // 1 sources

                    if (!var1_4.var_boolean_a) ** GOTO lbl219
lbl47:
                    // 2 sources

                    block10 : switch (var1_4.var_byte_arr_b[1]) {
                        case 7: {
                            if (var1_4.var_int_a < 8) break;
                            var2_10 = 0;
                            for (var3_15 = 2; var3_15 < 8; ++var3_15) {
                                var1_4.var_short_arr_b[var2_10] = r.short_a(var1_4.var_byte_arr_b, var3_15);
                                ++var2_10;
                            }
                            var2_10 = 0;
                            for (var3_15 = 0; var3_15 < var1_4.var_short_arr_b.length && var1_4.var_short_arr_b[var3_15] != 254 && var1_4.var_short_arr_b[var3_15] != 255; ++var3_15) {
                                if (var1_4.var_short_arr_b[var3_15] == var1_4.var_short_arr_a[var2_10]) {
                                    ++var2_10;
                                    continue;
                                }
                                if (var1_4.var_short_arr_b[var3_15] < var1_4.var_short_arr_a[var2_10]) {
                                    var1_4.var_an_a.a(var1_4.var_short_arr_b[var3_15]);
                                    continue;
                                }
                                var1_4.var_an_a.b(var1_4.var_short_arr_a[var2_10]);
                                --var3_15;
                                ++var2_10;
                            }
                            for (var3_15 = var2_10; var3_15 < var1_4.var_short_arr_a.length && var1_4.var_short_arr_a[var3_15] != 254; ++var3_15) {
                                var1_4.var_an_a.b(var1_4.var_short_arr_a[var3_15]);
                            }
                            for (var3_15 = 0; var3_15 < var1_4.var_short_arr_a.length; ++var3_15) {
                                var1_4.var_short_arr_a[var3_15] = var1_4.var_short_arr_b[var3_15];
                            }
                            break;
                        }
                        case -3: 
                        case 8: {
                            if (var1_4.var_int_a < 5) break;
                            var2_10 = (byte)(var1_4.var_byte_arr_b[2] & 127);
                            var5_26 = false;
                            var4_25 = null;
                            var3_16 = var1_4.var_byte_arr_b[3];
                            var4_24 = var1_4.var_byte_arr_b[4];
                            if (var1_4.var_byte_arr_b[1] == -3) {
                                if (var3_16 == var1_4.var_int_b && var4_24 == var1_4.var_int_c) break;
                                var1_4.var_int_b = var3_16;
                                var1_4.var_int_c = var4_24;
                            }
                            v1 = var1_4.var_c_a;
                            var2_11 = v1;
                            v2 = var1_4.var_c_a;
                            var2_11 = v2;
                            v3 = var1_4.var_c_a;
                            var2_11 = v3;
                            var2_11 = var1_4.var_c_a;
                            var1_4.var_an_a.a(var2_10, var3_16, var4_24, v1.g, v2.h, v3.g, var2_11.h);
                            break;
                        }
                        case 9: {
                            if (var1_4.var_int_a < 7) break;
                            var2_10 = (byte)(var1_4.var_byte_arr_b[2] & 127);
                            var3_17 = r.short_b(var1_4.var_byte_arr_b, 3);
                            var4_24 = r.short_b(var1_4.var_byte_arr_b, 5);
                            v4 = var1_4.var_c_a;
                            var2_12 = v4;
                            v5 = var1_4.var_c_a;
                            var2_12 = v5;
                            v6 = var1_4.var_c_a;
                            var2_12 = v6;
                            var2_12 = var1_4.var_c_a;
                            var1_4.var_an_a.a(var2_10, var3_17, var4_24, v4.g, v5.h, v6.g, var2_12.h);
                            break;
                        }
                        case 10: {
                            if (var1_4.var_int_a < 11) break;
                            var2_10 = (byte)(var1_4.var_byte_arr_b[2] & 127);
                            var3_18 = r.int_b(var1_4.var_byte_arr_b, 3);
                            var4_24 = r.int_b(var1_4.var_byte_arr_b, 7);
                            v7 = var1_4.var_c_a;
                            var2_13 = v7;
                            v8 = var1_4.var_c_a;
                            var2_13 = v8;
                            v9 = var1_4.var_c_a;
                            var2_13 = v9;
                            var2_13 = var1_4.var_c_a;
                            var1_4.var_an_a.a(var2_10, var3_18, var4_24, v7.g, v8.h, v9.g, var2_13.h);
                            break;
                        }
                        case 17: {
                            if (var1_4.var_int_a < 4) break;
                            var2_10 = r.int_a(var1_4.var_byte_arr_b, 2);
                            var6_29 = var1_4.var_c_a;
                            var3_19 = var6_29.i;
                            var6_29 = var1_4.var_c_a;
                            var4_24 = var6_29.j;
                            var6_29 = var1_4.var_c_a;
                            var5_27 = var6_29.k;
                            if (var2_10 < var5_27) {
                                var2_10 = var5_27;
                            } else if (var2_10 > var3_19) {
                                var2_10 = var3_19;
                            }
                            var1_4.var_an_a.a(var2_10, var3_19, var4_24, var5_27);
                            break;
                        }
                        case 5: {
                            if (var1_4.var_int_a < 7) break;
                            var2_10 = var1_4.var_byte_arr_b[2];
                            var3_20 = r.int_b(var1_4.var_byte_arr_b, 3);
                            switch (var2_10) {
                                case 1: {
                                    var7_30 = var3_20;
                                    var6_29 = var1_4.var_c_a;
                                    var1_4.var_c_a.d = var7_30;
                                    if (var7_30 <= 0) break block10;
                                    var6_29.var_java_lang_String_arr_a = new String[var7_30];
                                    var6_29.var_int_arr_a = new int[var7_30];
                                    break;
                                }
                                case 2: {
                                    var7_30 = var3_20;
                                    var6_29 = var1_4.var_c_a;
                                    var1_4.var_c_a.e = var7_30;
                                    break;
                                }
                                case 3: {
                                    var7_30 = var3_20;
                                    var6_29 = var1_4.var_c_a;
                                    var1_4.var_c_a.f = var7_30;
                                    var3_20 = var7_30;
                                    var6_29.g = -c.a(2, var3_20 - 1);
                                    var3_20 = var7_30;
                                    var6_29.h = c.a(2, var3_20 - 1) - 1;
                                    break;
                                }
                                case 14: {
                                    var7_30 = var3_20;
                                    var6_29 = var1_4.var_c_a;
                                    var1_4.var_c_a.i = var7_30;
                                    break;
                                }
                                case 16: {
                                    var7_30 = var3_20;
                                    var6_29 = var1_4.var_c_a;
                                    var1_4.var_c_a.j = var7_30;
                                    break;
                                }
                                case 15: {
                                    var7_30 = var3_20;
                                    var6_29 = var1_4.var_c_a;
                                    var1_4.var_c_a.k = var7_30;
                                    break;
                                }
                                case -1: {
                                    if (var1_4.var_boolean_b) break;
                                    var2_14 = var1_4;
                                    if (var2_14.var_boolean_c && w.boolean_a()) {
                                        var2_14.d();
                                    }
                                    var6_29 = var1_4.var_c_a;
                                    var1_4.a(var6_29.e <= 0 || var6_29.f > 0);
                                    break;
                                }
                            }
                            break;
                        }
                        case 4: {
                            if (var1_4.var_int_a < 37) break;
                            var2_10 = r.short_a(var1_4.var_byte_arr_b, 2);
                            var3_21 = r.short_a(var1_4.var_byte_arr_b, 3);
                            var4_24 = r.short_a(var1_4.var_byte_arr_b, 4);
                            var5_28 = r.a(var1_4.var_byte_arr_b, 5, var4_24);
                            var6_29 = var1_4.var_c_a;
                            if (var2_10 >= var6_29.d) break;
                            var7_30 = var2_10;
                            var6_29 = var1_4.var_c_a;
                            var6_29.var_int_arr_a[var7_30] = var3_21;
                            var3_22 = var5_28;
                            var7_30 = var2_10;
                            var6_29 = var1_4.var_c_a;
                            var6_29.var_java_lang_String_arr_a[var7_30] = var3_22;
                            break;
                        }
                        case 3: {
                            if (var1_4.var_int_a < 45) break;
                            var2_10 = r.int_a(var1_4.var_byte_arr_b, 2);
                            var3_23 = r.int_a(var1_4.var_byte_arr_b, 4);
                            var4_24 = r.int_a(var1_4.var_byte_arr_b, 10);
                            var7_30 = var2_10;
                            var6_29 = var1_4.var_c_a;
                            var1_4.var_c_a.var_int_a = var7_30;
                            var7_30 = var3_23;
                            var6_29 = var1_4.var_c_a;
                            var1_4.var_c_a.b = var7_30;
                            var7_30 = var4_24;
                            var6_29 = var1_4.var_c_a;
                            var1_4.var_c_a.c = var7_30;
                        }
                    }
lbl219:
                    // 22 sources

                    continue block38;
                }
            }
            var1_5 = this;
            switch (var2_10) {
                case -1: {
                    if (!var1_5.var_boolean_c) continue block38;
                    var1_5.b();
                    continue block38;
                }
                case -2: {
                    if (!var1_5.var_boolean_c) continue block38;
                    var1_5.b();
                    continue block38;
                }
            }
            if (var1_5.var_boolean_c) {
                var1_5.b();
            }
            throw new IllegalStateException();
        }
        if (this.var_boolean_b) {
            if (this.var_boolean_a) {
                this.var_an_a.void_a();
                return;
            }
        } else {
            this.a(false);
        }
    }

    private int int_a() {
        try {
            this.var_byte_arr_a = this.var_ah_a.byte_arr_a(this.var_byte_arr_a);
        }
        catch (IOException iOException) {
            return -2;
        }
        if (this.var_byte_arr_a == null) {
            return -1;
        }
        this.var_int_a = this.var_byte_arr_a[0];
        if (this.var_int_a < 0) {
            return -1;
        }
        if (this.var_byte_arr_b == null || this.var_byte_arr_b.length < this.var_int_a) {
            this.var_byte_arr_b = new byte[this.var_int_a];
        }
        System.arraycopy(this.var_byte_arr_a, 1, this.var_byte_arr_b, 0, this.var_int_a);
        return 0;
    }

    private void d() {
        Object object = this.var_c_a;
        if (((c)object).c == 3) {
            object = this.var_c_a;
            if (((c)object).var_int_a <= 1) {
                object = this.var_c_a;
                if (((c)object).b < 1) {
                    try {
                        object = new byte[]{4, -94, 6, 8, 0};
                        this.var_ah_a.void_a((byte[])object);
                        object = new byte[]{4, -94, 6, -3, 1};
                        this.var_ah_a.void_a((byte[])object);
                        return;
                    }
                    catch (IOException iOException) {
                        if (this.var_boolean_c) {
                            this.b();
                        }
                        return;
                    }
                }
            }
        }
        try {
            object = new byte[]{4, -94, 25, 1, -12};
            this.var_ah_a.void_a((byte[])object);
            return;
        }
        catch (IOException iOException) {
            if (this.var_boolean_c) {
                this.b();
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(boolean bl) {
        Object object = this.var_java_lang_Object_b;
        synchronized (object) {
            if (this.var_boolean_b) {
                return;
            }
            this.var_boolean_b = true;
            this.var_boolean_a = bl;
            if (bl) {
                Object object2 = this.var_c_a;
                an an2 = this.var_an_a;
                this.var_an_a.var_c_a = object2;
                object2 = this.var_c_a;
                an2 = this.var_an_a;
                object2 = an2.var_java_lang_Object_a;
                synchronized (object2) {
                    if (an2.var_boolean_a && an2.var_java_util_Vector_a != null) {
                        new bf(an2);
                        for (int i2 = 0; i2 < an2.var_java_util_Vector_a.size(); ++i2) {
                            an2.var_java_util_Vector_a.elementAt(i2);
                        }
                    }
                }
            }
            this.var_java_lang_Object_b.notify();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void c() {
        while (!this.var_boolean_b) {
            Object object = this.var_java_lang_Object_b;
            synchronized (object) {
                this.var_java_lang_Object_b.wait();
            }
        }
    }

    private static short short_a(byte[] byArray, int n2) {
        return (short)(byArray[n2] & 0xFF);
    }

    private static short short_b(byte[] byArray, int n2) {
        return (short)((byArray[n2 + 1] & 0xFF) + ((byArray[n2] & 0xFF) << 8));
    }

    private static int int_a(byte[] byArray, int n2) {
        return (byArray[n2 + 1] & 0xFF) + ((byArray[n2] & 0xFF) << 8);
    }

    private static int int_b(byte[] byArray, int n2) {
        return (byArray[n2 + 3] & 0xFF) + ((byArray[n2 + 2] & 0xFF) << 8) + ((byArray[n2 + 1] & 0xFF) << 16) + ((byArray[n2] & 0xFF) << 24);
    }

    private static String a(byte[] byArray, int n2, int n3) {
        try {
            return new String(byArray, n2, n3, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return null;
        }
    }
}


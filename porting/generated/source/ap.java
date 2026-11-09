/*
 * Decompiled with CFR 0.152.
 */
public final class ap {
    public byte var_byte_a;
    public am var_am_a;
    public boolean var_boolean_a;
    public static af[] var_af_arr_a;
    ar var_ar_a;
    int var_int_a;
    public byte var_byte_b;
    byte var_byte_c;
    static int[][] var_int_arr_arr_a;
    public int var_int_b;
    public int var_int_c;
    public boolean var_boolean_b;

    public ap(ar ar2, byte by, int n2, int n3) {
        this.var_ar_a = ar2;
        this.var_byte_b = by;
        this.var_int_b = n2;
        this.var_int_c = n3;
    }

    public final void a() {
        this.var_byte_a = 0;
        this.var_int_a = -1;
        this.var_boolean_b = false;
        int n2 = this.var_int_b << 15;
        int n3 = this.var_int_c << 15;
        Object object = null;
        switch (this.var_byte_b) {
            case 0: {
                object = y.as_arr_a(32);
                this.var_byte_c = 0;
                break;
            }
            case 1: {
                object = y.a(96, 32, false);
                this.var_byte_c = 1;
                break;
            }
            case 7: {
                object = y.a(64, 32, false);
                this.var_byte_c = 0;
                break;
            }
            case 2: {
                object = y.a(96, 32, false);
                this.var_byte_c = 1;
                break;
            }
            case 8: {
                object = y.a(128, 32, false);
                this.var_byte_c = 1;
                break;
            }
            case 6: {
                object = new as[]{new as(33, -63), new as(31, 31), new as(0, 32), new as(0, -64)};
                y.a(object);
                this.var_byte_c = 1;
                break;
            }
            case 3: {
                object = new as[]{new as(32, -64), new as(32, 32), new as(0, 32), new as(0, -64)};
                y.a(object);
                this.var_byte_c = 1;
                break;
            }
            case 10: {
                object = new as[]{new as(32, -96), new as(32, 32), new as(0, 32), new as(0, -96)};
                y.a(object);
                this.var_byte_c = 1;
                break;
            }
            case 4: {
                object = new as[]{new as(2, 2), new as(62, 2), new as(62, 62), new as(1, 62)};
                y.a(object);
                this.var_byte_c = (byte)2;
                n3 -= 32 << 10;
                break;
            }
            case 5: {
                object = y.as_arr_a(16, 10);
                this.var_byte_c = (byte)3;
                n2 += 16384;
                break;
            }
            case 9: {
                object = y.a(96, 21, false);
                this.var_byte_c = (byte)4;
                break;
            }
            case 11: {
                object = y.a(256, 32, false);
                this.var_byte_c = 1;
            }
        }
        this.var_am_a = null;
        this.var_am_a = new am(this.var_byte_b == 5 ? 100000 : 0, false, false, this.var_byte_b == 2 || this.var_byte_b == 8 || this.var_byte_b == 11, this.var_byte_b == 0 || this.var_byte_b == 4 || this.var_byte_b == 7 || this.var_byte_b == 9);
        int n4 = this.var_am_a.j = this.var_byte_b == 2 || this.var_byte_b == 8 || this.var_byte_b == 11 ? 4 : 3;
        if (this.var_byte_b == 9) {
            this.var_am_a.h = 2;
        }
        this.var_am_a.var_java_lang_Object_a = this;
        int n5 = this.var_byte_b != 5 ? 1 : 0;
        am am2 = this.var_am_a;
        am2.d = n5 != 0 ? (am2.d |= 2) : (am2.d &= 0xFFFFFFFD);
        for (int i2 = 0; i2 < ((as[])object).length; ++i2) {
            object[i2].var_int_a += n2;
            object[i2].b += n3;
        }
        this.var_am_a.a((as[])object, this.var_byte_b == 4 ? 51200 : 2048);
        if (this.var_byte_b != 5) {
            this.var_am_a.a(1024, 1024, -512, -512);
            n2 = -512;
            n5 = 1024;
            am am3 = this.var_am_a;
            n2 = am3.var_java_util_Vector_a.size();
            n2 >>= 1;
            for (n3 = 0; n3 < n2; ++n3) {
                object = new t((s)am3.var_java_util_Vector_a.elementAt(n3), (s)am3.var_java_util_Vector_a.elementAt(n2 + n3), 1024, -512, -1);
                am3.void_a((t)object);
            }
        } else {
            this.var_am_a.a(1024, 512, -512, -512);
        }
        this.var_am_a.void_a();
        if (this.var_byte_b == 6) {
            this.var_am_a.var_s_arr_a[2].var_int_a = Integer.MAX_VALUE;
        }
        if (this.var_ar_a.var_ab_a != null && this.var_ar_a.var_ab_a.var_boolean_b) {
            this.var_ar_a.var_ab_a.a(this.var_am_a);
        }
    }

    public final void b() {
        this.var_byte_a = (byte)2;
        as as2 = this.var_am_a.as_a();
        this.var_ar_a.var_ac_a.a(as2.var_int_a >> 10, as2.b >> 10, 0);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import com.hardwire.blob.Main;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class q {
    public byte var_byte_a;
    public aa[] var_aa_arr_a;
    private int[][] var_int_arr_arr_a;
    public int var_int_a;
    private int k;
    public int var_int_b;
    private static int[] var_int_arr_a;
    private static final int[][][] var_int_arr_arr_arr_a;
    public byte var_byte_b;
    public byte var_byte_c;
    public byte var_byte_d;
    private int l;
    public int var_int_c;
    public int var_int_d;
    public int var_int_e;
    private am var_am_b;
    private int m;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    public boolean var_boolean_c;
    public int var_int_f;
    public int var_int_g;
    private ar var_ar_a;
    private ac var_ac_a;
    public am var_am_a;
    private af var_af_a;
    private static Image[][] var_javax_microedition_lcdui_Image_arr_arr_a;
    private int n = Integer.MAX_VALUE;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean var_boolean_i;
    public boolean var_boolean_d;
    public boolean var_boolean_e;
    public boolean var_boolean_f;
    public boolean var_boolean_g;
    public boolean var_boolean_h;
    private int y;
    public int var_int_h;
    public int var_int_i;
    private boolean var_boolean_j;
    public int var_int_j;
    public byte var_byte_e;

    public q(ar ar2, byte by, byte by2, int n2, int n3) {
        this.var_ar_a = ar2;
        this.var_byte_a = by;
        this.var_byte_e = by2;
        this.var_ac_a = this.var_ar_a.var_ac_a;
        this.a(n2, n3);
        if (this.var_byte_a == 1) {
            for (int i2 = 516; i2 <= 530; ++i2) {
                this.var_ar_a.var_ad_a.void_a(i2);
            }
        }
    }

    public static void a(ad ad2) {
        Image[][] imageArrayArray = new Image[2][];
        var_javax_microedition_lcdui_Image_arr_arr_a = imageArrayArray;
        imageArrayArray[0] = ad2.a(110, true);
        if (ad2.javax_microedition_lcdui_Image_a(516) == null) {
            q.var_javax_microedition_lcdui_Image_arr_arr_a[1] = null;
            return;
        }
        q.var_javax_microedition_lcdui_Image_arr_arr_a[1] = ad2.a(516, true);
    }

    public final void a(int n2, int n3) {
        as as2 = new as(n2 << 10, n3 << 10);
        if (this.var_am_a != null) {
            if (this.var_byte_d == 1) {
                as2 = this.var_am_a.as_a();
                n3 = this.var_am_a.var_s_arr_a.length;
                if (this.var_ar_a.var_ab_a != null && this.var_ar_a.var_ab_a.var_boolean_b) {
                    for (int i2 = 0; i2 < n3; ++i2) {
                        this.var_ar_a.var_ab_a.a(this.var_am_a.var_s_arr_a[i2]);
                    }
                }
            } else {
                as2 = this.var_am_a.as_a();
                if (this.var_ar_a.var_ab_a != null && this.var_ar_a.var_ab_a.var_boolean_b) {
                    this.var_ar_a.var_ab_a.b(this.var_am_a);
                }
            }
            am am2 = this.var_am_a;
            this.var_am_a.var_t_arr_a = null;
            am2.var_s_arr_a = null;
            am2.var_as_a = null;
            am2.var_as_b = null;
            am2.var_t_arr_b = null;
            am2.var_s_arr_c = null;
            am2.var_t_arr_c = null;
            am2.var_am_arr_a = null;
            am2.var_s_arr_b = null;
            am2.var_as_c = null;
        }
        this.var_byte_d = 0;
        this.y = 0;
        this.var_int_j = 0;
        this.var_boolean_b = false;
        this.var_boolean_a = false;
        this.var_int_c = 0;
        this.var_int_d = 102400;
        this.var_int_e = Integer.MIN_VALUE;
        this.o = -1;
        this.p = 20;
        this.q = -1;
        this.s = -1;
        this.t = -1;
        this.var_aa_arr_a = null;
        this.var_int_arr_arr_a = null;
        this.var_aa_arr_a = new aa[16];
        this.var_int_arr_arr_a = new int[16][2];
        this.var_int_a = 0;
        this.k = 0;
        this.u = -1;
        this.var_am_a = null;
        this.var_am_a = new am(0, true, true, false, false);
        this.var_am_a.j = 1;
        this.var_am_a.var_java_lang_Object_a = this;
        this.var_am_a.h = 2;
        this.l = 24;
        n3 = 18;
        if (this.var_byte_e == 1) {
            this.l = 20;
            n3 = 14;
        } else if (this.var_byte_e == 2) {
            this.l = 26;
        } else if (this.var_byte_e == 3) {
            this.l = 30;
        }
        as[] asArray = y.as_arr_a(this.l, n3);
        for (n3 = 0; n3 < asArray.length; ++n3) {
            asArray[n3].void_a(as2);
        }
        this.var_am_a.a(asArray, 1024);
        this.var_am_a.a(1024, 1024, -1, -1);
        this.var_am_a.void_a();
        this.var_am_a.void_b();
        if (this.var_ar_a.var_ab_a != null && this.var_ar_a.var_ab_a.var_boolean_b) {
            this.var_ar_a.var_ab_a.a(this.var_am_a);
        }
        this.var_af_a = null;
        this.var_af_a = new af(4, asArray.length);
        this.var_byte_c = 0;
        this.var_byte_b = 0;
    }

    public final void a(ai ai2) {
        if (!ai2.boolean_a() && ai2.var_byte_d != 2) {
            if (ai2.var_byte_d == 5 && (this.var_ar_a.var_int_b != 123 || this.var_ac_a.var_int_c <= 1) && ai2.var_byte_a != 6) {
                this.b(ai.var_int_arr_b[ai2.var_byte_d]);
                return;
            }
            long l2 = this.var_am_a.as_c().long_a();
            if (l2 > 0x3200000L || this.var_int_e > 0 && l2 > 0L) {
                if (ai2.var_int_a == -1) {
                    int n2 = this.var_int_b;
                    this.var_ar_a.var_int_arr_e[n2] = this.var_ar_a.var_int_arr_e[n2] + 30;
                    Object object = ai2.var_aa_a;
                    object = ((aa)object).var_s_a.var_as_a;
                    this.var_ac_a.void_a(((as)object).var_int_a >> 10, ((as)object).b >> 10, 30, 30);
                }
                ai2.b();
            }
        }
    }

    public final void a(am am2) {
        if (this.var_byte_d == 0 && this.var_byte_c == 2) {
            if (am2.j == 1 && ((q)am2.var_java_lang_Object_a).var_byte_a == 1 && ((q)am2.var_java_lang_Object_a).var_byte_e == 1) {
                return;
            }
            this.var_am_b = am2;
            this.m = 3;
        }
    }

    public final void a(int n2) {
        int n3 = this.var_am_a.as_a().var_int_a >> 10;
        int n4 = n3 >> 5;
        if (!this.var_ar_a.a(n4, n2)) {
            int n5 = this.var_am_a.int_arr_a()[0] >> 15;
            for (n3 = n4 - 1; n3 >= n5 && !this.var_ar_a.a(n3, n2); --n3) {
            }
            if (!this.var_ar_a.a(n3, n2)) {
                n5 = this.var_am_a.int_arr_a()[2] >> 15;
                for (n3 = n4 + 1; n3 >= n5 && !this.var_ar_a.a(n3, n2); ++n3) {
                }
            }
            n3 = (n3 << 5) + 16;
        }
        this.var_ac_a.a(n3, n2 << 5, 2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void void_a() {
        block183: {
            block179: {
                block182: {
                    block181: {
                        block180: {
                            block178: {
                                v0 = this.var_boolean_c = this.var_ac_a.var_int_c == 6 && (this.var_ar_a.var_int_b == 107 || this.var_ar_a.var_int_b == 112 || this.var_ar_a.var_int_b == 123 || this.var_ar_a.var_int_b == 128) || this.var_ac_a.var_int_c == 2 && this.var_ar_a.var_int_b == 133;
                                if (this.var_byte_d != 0) break block179;
                                if (this.var_ar_a.var_int_b == 123 && this.var_ac_a.var_int_c == 1 && this.var_ar_a.var_int_arr_e[this.var_int_b] >= 300) {
                                    this.var_ac_a.c(137);
                                    ++this.var_ac_a.var_int_c;
                                    for (var1_1 = 0; var1_1 < this.var_ar_a.var_ai_arr_a.length; ++var1_1) {
                                        if (this.var_ar_a.var_ai_arr_a[var1_1].var_byte_d != 6) continue;
                                        this.var_ar_a.var_ai_arr_a[var1_1].b();
                                    }
                                }
                                if (this.var_ar_a.var_int_b == 128 && this.var_ar_a.var_ai_arr_a[0].boolean_a() && this.var_ar_a.var_ai_arr_a[1].boolean_a() && !this.var_ar_a.var_ai_arr_a[this.var_ar_a.var_ai_arr_a.length - 1].boolean_a() && this.var_am_a.as_a().var_int_a >> 15 == this.var_ar_a.var_ai_arr_a[this.var_ar_a.var_ai_arr_a.length - 1].var_aa_a.var_s_a.var_as_a.var_int_a >> 15 && this.var_am_a.as_a().b >> 15 >= this.var_ar_a.var_ai_arr_a[this.var_ar_a.var_ai_arr_a.length - 1].var_aa_a.var_s_a.var_as_a.b >> 15) {
                                    this.var_am_a.b(new as(0, -5000));
                                    this.var_byte_b = 1;
                                }
                                var1_2 = this.var_am_a.int_arr_a();
                                if (this.var_byte_a != 1 || this.var_byte_e == 0) {
                                    var2_4 = var1_2[0] >> 15;
                                    var3_18 = var1_2[1] >> 15;
                                    var4_23 = var1_2[2] >> 15;
                                    var5_30 = var1_2[3] >> 15;
                                    var2_4 = var2_4 < 0 ? 0 : var2_4;
                                    var3_18 = var3_18 < 0 ? 0 : var3_18;
                                    var4_23 = var4_23 >= this.var_ar_a.var_int_d ? this.var_ar_a.var_int_d - 1 : var4_23;
                                    var5_30 = var5_30 >= this.var_ar_a.var_int_e ? this.var_ar_a.var_int_e - 1 : var5_30;
                                    var6_39 = new as();
                                    while (var2_4 <= var4_23) {
                                        for (var7_44 = var3_18; var7_44 <= var5_30; ++var7_44) {
                                            var8_48 = this.var_ar_a.var_byte_arr_arr_arr_a[1][var2_4][var7_44];
                                            if (var8_48 == 8 || var8_48 == 9 || var8_48 == 70) {
                                                var6_39.var_int_a = (var2_4 << 15) + 16384;
                                                var6_39.b = (var7_44 << 15) + 16384;
                                                if (!this.var_am_a.boolean_a(var6_39)) continue;
                                                switch (var8_48) {
                                                    case 8: {
                                                        if (this.var_int_b == this.var_ar_a.var_int_f) {
                                                            this.var_ar_a.var_com_hardwire_blob_Main_a.a(1, false);
                                                            this.var_ac_a.a(var6_39.var_int_a >> 10, var6_39.b >> 10, 5);
                                                        }
                                                        this.var_int_d += 10240;
                                                        if (this.var_int_d > 102400) {
                                                            this.var_int_d = 102400;
                                                        }
                                                        if (this.var_ar_a.var_byte_b != 2) break;
                                                        var8_48 = 2;
                                                        if (this.var_int_b == this.var_ar_a.var_int_g) {
                                                            var8_48 = 3;
                                                        }
                                                        this.var_ar_a.var_java_util_Vector_a.addElement(new byte[]{var8_48, (byte)var2_4, (byte)var7_44});
                                                        break;
                                                    }
                                                    case 9: {
                                                        if (this.var_int_b == this.var_ar_a.var_int_f) {
                                                            this.var_ar_a.var_com_hardwire_blob_Main_a.a(2, false);
                                                            this.var_ac_a.a(var6_39.var_int_a >> 10, var6_39.b >> 10, 4);
                                                        }
                                                        v1 = this.var_int_b;
                                                        this.var_ar_a.var_int_arr_e[v1] = this.var_ar_a.var_int_arr_e[v1] + 10;
                                                        this.var_ac_a.void_a(var6_39.var_int_a >> 10, var6_39.b >> 10, 10, 10);
                                                        if (this.var_ar_a.var_byte_b != 2) break;
                                                        var8_48 = 0;
                                                        if (this.var_int_b == this.var_ar_a.var_int_g) {
                                                            var8_48 = 1;
                                                        }
                                                        this.var_ar_a.var_java_util_Vector_a.addElement(new byte[]{var8_48, (byte)var2_4, (byte)var7_44});
                                                        break;
                                                    }
                                                    case 70: {
                                                        var8_48 = d.a(d.var_short_arr_a, this.var_ar_a.var_int_b);
                                                        this.var_ar_a.var_com_hardwire_blob_Main_a.int_arr_a((int)var8_48, -1);
                                                        this.var_ar_a.var_byte_arr_arr_arr_a[1][var2_4][var7_44] = -1;
                                                        var9_53 = this.var_ar_a.var_d_a.byte_arr_arr_a(137);
                                                        var10_58 = new byte[var9_53.length][];
                                                        System.arraycopy(var9_53, 0, var10_58, 0, var9_53.length - 1);
                                                        var10_58[var10_58.length - 1] = d.a(new byte[][]{var9_53[var9_53.length - 1], {d.a(3, ' ')}, d.byte_arr_a(3, Main.var_int_arr_e[var8_48])});
                                                        this.var_ac_a.var_int_e = 0;
                                                        this.var_ac_a.var_int_f = -11;
                                                        this.var_ar_a.var_ad_a.a(var10_58, 3, 3, -11579569, ad.var_int_b / 2 - 20);
                                                        this.var_ar_a.var_byte_d = (byte)6;
                                                    }
                                                }
                                                this.var_ar_a.var_byte_arr_arr_arr_a[1][var2_4][var7_44] = -1;
                                                continue;
                                            }
                                            if (var8_48 == 13) {
                                                this.var_boolean_c = true;
                                                continue;
                                            }
                                            if (var8_48 == 43 && this.var_ar_a.var_byte_b == 1) {
                                                v2 = this.var_int_b;
                                                this.var_ar_a.var_int_arr_f[v2] = this.var_ar_a.var_int_arr_f[v2] + 1;
                                                this.var_ar_a.var_byte_arr_arr_arr_a[1][var2_4][var7_44] = -1;
                                                var8_49 = null;
                                                for (var9_54 = 0; var9_54 < this.var_ar_a.var_com_hardwire_blob_Main_a.var_int_arr_arr_a.length; ++var9_54) {
                                                    if (this.var_ar_a.var_com_hardwire_blob_Main_a.var_int_arr_arr_a[var9_54][0] != var2_4 || this.var_ar_a.var_com_hardwire_blob_Main_a.var_int_arr_arr_a[var9_54][1] != var7_44) continue;
                                                    var8_49 = this.var_ar_a.var_com_hardwire_blob_Main_a.int_arr_a(d.a(d.var_short_arr_a, this.var_ar_a.var_int_b), var9_54);
                                                }
                                                if (this.var_int_b == this.var_ar_a.var_int_f) {
                                                    this.var_ac_a.void_a(var8_49);
                                                    continue;
                                                }
                                                if (this.var_ar_a.var_byte_b != 2) continue;
                                                this.var_ar_a.var_java_util_Vector_a.addElement(new byte[]{16});
                                                continue;
                                            }
                                            if (!this.var_ar_a.var_boolean_arr_f[var2_4] || !this.var_ar_a.var_boolean_arr_e[var7_44]) continue;
                                            var8_48 = 0;
                                            for (var9_55 = 0; var9_55 < this.var_ar_a.var_int_c; ++var9_55) {
                                                if (this.var_ar_a.var_short_arr_arr_a[var9_55][0] != var2_4 || this.var_ar_a.var_short_arr_arr_a[var9_55][1] != var7_44) continue;
                                                var10_59 = this.var_ar_a.var_short_arr_arr_a[var9_55][2];
                                                var8_48 = 1;
                                                if (this.var_ar_a.var_byte_b == 2) {
                                                    if (this.var_ar_a.var_byte_e == 2 || this.var_ar_a.var_byte_e == 3 && d.a(d.var_short_arr_d, this.var_ar_a.var_int_b) != -1) {
                                                        this.var_ac_a.c(var10_59);
                                                        this.var_ar_a.var_java_util_Vector_a.addElement(new byte[]{14, (byte)var10_59});
                                                    }
                                                } else if (this.var_int_b == this.var_ar_a.var_int_f) {
                                                    this.var_ac_a.c(var10_59);
                                                }
                                                for (var9_55 = 0; var9_55 < this.var_ar_a.var_int_c; ++var9_55) {
                                                    if (this.var_ar_a.var_short_arr_arr_a[var9_55][2] != var10_59 || this.var_ar_a.var_short_arr_arr_a[var9_55][0] < var2_4 - 4 || this.var_ar_a.var_short_arr_arr_a[var9_55][0] > var2_4 + 4 || this.var_ar_a.var_short_arr_arr_a[var9_55][1] < var7_44 - 4 || this.var_ar_a.var_short_arr_arr_a[var9_55][1] > var7_44 + 4) continue;
                                                    this.var_ar_a.var_boolean_arr_e[this.var_ar_a.var_short_arr_arr_a[var9_55][1]] = false;
                                                    this.var_ar_a.var_boolean_arr_f[this.var_ar_a.var_short_arr_arr_a[var9_55][0]] = false;
                                                    --this.var_ar_a.var_int_c;
                                                    if (var9_55 != this.var_ar_a.var_int_c) {
                                                        this.var_ar_a.var_short_arr_arr_a[var9_55] = this.var_ar_a.var_short_arr_arr_a[this.var_ar_a.var_int_c];
                                                    }
                                                    this.var_ar_a.var_short_arr_arr_a[this.var_ar_a.var_int_c] = null;
                                                    --var9_55;
                                                }
                                                break;
                                            }
                                            if (var8_48 == 0) continue;
                                            for (var9_55 = 0; var9_55 < this.var_ar_a.var_int_c; ++var9_55) {
                                                this.var_ar_a.var_boolean_arr_e[this.var_ar_a.var_short_arr_arr_a[var9_55][1]] = true;
                                                this.var_ar_a.var_boolean_arr_f[this.var_ar_a.var_short_arr_arr_a[var9_55][0]] = true;
                                            }
                                        }
                                        ++var2_4;
                                    }
                                }
                                if (this.var_int_e != -2147483648) {
                                    --this.var_int_e;
                                }
                                if (this.var_am_b != null) {
                                    --this.m;
                                    if (this.m == 0) {
                                        this.var_am_b = null;
                                    }
                                }
                                if ((var2_4 = this.var_ar_a.a((int[])var1_2)) != -1) {
                                    if (y.a(this.var_ac_a.var_int_arr_d, (int[])var1_2)) {
                                        if (!this.var_boolean_a && this.var_am_a.as_c().d() > 10240) {
                                            this.var_ar_a.var_com_hardwire_blob_Main_a.a(7, false);
                                            if (this.var_ac_a.g > 0) {
                                                this.a(var2_4);
                                            }
                                        }
                                        if (this.var_ac_a.g > 1 && this.var_am_a.int_arr_a()[1] >> 15 < var2_4) {
                                            this.var_ac_a.b(this.var_am_a.as_a().var_int_a >> 10, var2_4 << 5, 16, 1);
                                        }
                                    }
                                    this.var_boolean_a = true;
                                    this.var_am_a.a(var2_4 << 15, 200, 5, false);
                                    if (this.var_ac_a.var_int_a == 2) {
                                        this.b(2048);
                                    }
                                } else {
                                    this.var_boolean_a = false;
                                }
                                if (this.var_byte_a == 1 && this.var_byte_e > 0) {
                                    v3 = this;
                                    var1_2 = v3;
                                    v3.b();
                                    switch (var1_2.var_byte_e) {
                                        case 1: {
                                            var2_5 = var1_2.var_am_a.as_a();
                                            if (var1_2.var_ar_a.var_byte_arr_arr_arr_a[1][var2_5.var_int_a >> 15][var2_5.b >> 15] == 13) {
                                                var1_2.var_ac_a.c(80);
                                            }
                                            switch (var1_2.var_ac_a.var_int_c) {
                                                case 1: {
                                                    var1_2.var_byte_b = 0;
                                                    var1_2.var_boolean_g = true;
                                                    if (var1_2.var_am_a.as_a().var_int_a >> 15 < 10) break;
                                                    ++var1_2.var_ac_a.var_int_c;
                                                    break;
                                                }
                                                case 2: {
                                                    var1_2.var_byte_b = (byte)2;
                                                    var1_2.var_boolean_g = true;
                                                    if (var1_2.var_am_a.as_a().var_int_a >> 15 < 13) break;
                                                    ++var1_2.var_ac_a.var_int_c;
                                                    break;
                                                }
                                                case 3: {
                                                    var1_2.var_byte_b = 0;
                                                    var1_2.var_boolean_g = true;
                                                    if (var1_2.var_am_a.as_a().var_int_a >> 15 <= 28) break;
                                                    ++var1_2.var_ac_a.var_int_c;
                                                    break;
                                                }
                                                case 4: {
                                                    var1_2.var_byte_b = (byte)2;
                                                    var1_2.var_boolean_g = true;
                                                    var1_2.var_boolean_d = true;
                                                    if (var1_2.var_am_a.as_a().b >> 15 <= 5) {
                                                        ++var1_2.var_ac_a.var_int_c;
                                                        break;
                                                    }
                                                    if (var1_2.var_am_a.as_a().var_int_a >> 15 >= 29 || var1_2.var_am_a.as_a().b >> 15 < 10) break;
                                                    var1_2.var_ac_a.var_int_c = 2;
                                                    break;
                                                }
                                                case 5: {
                                                    var1_2.var_byte_b = (byte)2;
                                                    var1_2.var_boolean_f = true;
                                                    var1_2.var_boolean_d = true;
                                                    if (var1_2.var_am_a.as_a().var_int_a >> 15 < 27) {
                                                        ++var1_2.var_ac_a.var_int_c;
                                                        break;
                                                    }
                                                    if (var1_2.var_am_a.as_a().var_int_a >> 15 >= 29 || var1_2.var_am_a.as_a().b >> 15 < 10) break;
                                                    var1_2.var_ac_a.var_int_c = 2;
                                                    break;
                                                }
                                                case 6: {
                                                    var1_2.var_byte_b = 0;
                                                    var1_2.var_boolean_e = true;
                                                    var1_2.var_boolean_f = true;
                                                    if (var1_2.var_am_a.as_a().var_int_a >> 15 > 22) break;
                                                    ++var1_2.var_ac_a.var_int_c;
                                                    break;
                                                }
                                                case 7: {
                                                    var1_2.var_byte_b = (byte)2;
                                                    var1_2.var_boolean_d = true;
                                                    var1_2.var_boolean_f = true;
                                                    if (var1_2.var_am_a.as_a().b >> 15 > 1) break;
                                                    ++var1_2.var_ac_a.var_int_c;
                                                    break;
                                                }
                                                case 8: {
                                                    var1_2.var_byte_b = 0;
                                                    var1_2.var_boolean_g = true;
                                                    if (var1_2.var_am_a.as_a().b >> 15 >= 18) {
                                                        ++var1_2.var_ac_a.var_int_c;
                                                        break;
                                                    }
                                                    if (var1_2.var_am_a.as_a().var_int_a >> 15 > 30 || var1_2.var_am_a.as_a().b >> 15 < 5) break;
                                                    var1_2.var_ac_a.var_int_c = 7;
                                                    break;
                                                }
                                                case 9: {
                                                    var1_2.var_byte_b = (byte)2;
                                                    var1_2.var_boolean_g = true;
                                                }
                                            }
                                            break;
                                        }
                                        case 2: {
                                            if (var1_2.var_ac_a.var_int_c == 0) {
                                                var1_2.var_ac_a.var_int_c = 1;
                                            }
                                            if (var1_2.var_ac_a.var_int_c != 1) break;
                                            var2_6 = var1_2.var_ar_a.var_q_arr_a[0];
                                            var1_2.var_byte_b = (byte)2;
                                            var3_19 = var2_6.var_am_a.as_a();
                                            var4_24 = var1_2.var_am_a.as_a();
                                            var5_31 = var3_19.as_b(var4_24);
                                            if (var3_19.b < var4_24.b && var4_24.b >> 15 > 1 && var3_19.b >> 15 < 15) {
                                                var2_7 = var3_19.var_int_a >> 15;
                                                var6_40 = var4_24.var_int_a >> 15;
                                                if (var2_7 < 7) {
                                                    if (var6_40 > 1) {
                                                        var1_2.var_boolean_f = true;
                                                    }
                                                    var1_2.var_boolean_d = true;
                                                    break;
                                                }
                                                if (var2_7 <= 7) break;
                                                if (var6_40 < 13) {
                                                    var1_2.var_boolean_g = true;
                                                }
                                                var1_2.var_boolean_d = true;
                                                break;
                                            }
                                            if (var5_31.var_int_a > 0) {
                                                var1_2.var_boolean_g = true;
                                            } else if (var5_31.var_int_a < 0) {
                                                var1_2.var_boolean_f = true;
                                            }
                                            if (var5_31.b > 0) {
                                                var1_2.var_boolean_e = true;
                                                break;
                                            }
                                            if (var5_31.b >= 0) break;
                                            var1_2.var_boolean_d = true;
                                            break;
                                        }
                                        case 3: {
                                            if (var1_2.var_ac_a.var_int_c == 0) {
                                                var2_8 = var1_2.var_ar_a.var_k_arr_a[0];
                                                var1_2.var_ar_a.var_k_arr_a[0].var_boolean_a = false;
                                                var2_8 = var1_2.var_ar_a.var_k_arr_a[1];
                                                var1_2.var_ar_a.var_k_arr_a[1].var_boolean_a = false;
                                                break;
                                            }
                                            var1_2.var_ac_a.var_int_c = 1;
                                            if (!var1_2.var_ar_a.var_k_arr_a[0].var_boolean_a) {
                                                var1_2.var_ar_a.var_k_arr_a[0].a((byte)0, 0);
                                                var1_2.var_ar_a.var_k_arr_a[1].a((byte)0, 0);
                                            }
                                            var2_9 = var1_2.var_ar_a.var_q_arr_a[0];
                                            var1_2.var_byte_b = (byte)2;
                                            var3_20 = var2_9.var_am_a.as_a();
                                            var4_25 = var1_2.var_am_a.as_a();
                                            var5_32 = var3_20.as_b(var4_25);
                                            if (var5_32.var_int_a > 0) {
                                                var1_2.var_boolean_g = true;
                                            } else if (var5_32.var_int_a < 0) {
                                                var1_2.var_boolean_f = true;
                                            }
                                            if (var1_2.var_am_b == null && var4_25.b >> 15 > 5) {
                                                var1_2.var_boolean_d = true;
                                                break;
                                            }
                                            if (var5_32.b > 0) {
                                                var1_2.var_boolean_e = true;
                                                break;
                                            }
                                            if (var5_32.b >= 0) break;
                                            var1_2.var_boolean_d = true;
                                        }
                                    }
                                }
                                v4 = this;
                                var1_2 = v4;
                                if (v4.var_ar_a.var_int_b == 93) {
                                    if (var1_2.var_ac_a.var_int_c == 0) {
                                        var1_2.var_boolean_g = true;
                                        var1_2.var_byte_b = (byte)2;
                                        if (var1_2.var_am_a.as_a().var_int_a >> 15 >= 7) {
                                            ++var1_2.var_ac_a.var_int_c;
                                            var1_2.var_ac_a.c(9);
                                        }
                                    } else if (var1_2.var_ac_a.var_int_c == 1) {
                                        var1_2.var_boolean_g = true;
                                    } else if (var1_2.var_ac_a.var_int_c == 2) {
                                        var1_2.var_byte_b = 0;
                                        var1_2.var_boolean_g = false;
                                    } else if (var1_2.var_ac_a.var_int_c >= 3) {
                                        var1_2.var_ac_a.c();
                                        var1_2.var_boolean_g = true;
                                    }
                                } else if (var1_2.var_ar_a.var_int_b == 90 && var1_2.var_byte_a == 0) {
                                    if (var1_2.var_ac_a.var_int_c == 0 && var1_2.var_am_a.as_a().var_int_a > 206438) {
                                        var1_2.var_ac_a.var_int_c = 1;
                                        for (var2_10 = 0; var2_10 < var1_2.var_am_a.var_s_arr_a.length; ++var2_10) {
                                            var1_2.var_am_a.var_s_arr_a[var2_10].var_as_b.c(var1_2.var_am_a.var_s_arr_a[var2_10].var_as_a);
                                        }
                                        var1_2.var_ac_a.c(74);
                                    }
                                } else if (var1_2.var_ar_a.var_int_b == 134 && var1_2.var_ac_a.var_int_c == 1) {
                                    var1_2.b();
                                    var1_2.var_boolean_g = true;
                                    var1_2.var_byte_b = 0;
                                }
                                if (var1_2.var_boolean_h && var1_2.var_am_b != null) {
                                    if (var1_2.var_int_b == var1_2.var_ar_a.var_int_f) {
                                        var1_2.var_ar_a.var_com_hardwire_blob_Main_a.a(0, false);
                                    } else {
                                        var1_2.var_ar_a.var_java_util_Vector_a.addElement(new byte[]{9});
                                    }
                                    var2_11 = var1_2.var_am_b.as_a().as_b(var1_2.var_am_a.as_a());
                                    var3_21 = var1_2.var_am_b.j == 1;
                                    var4_26 = var3_21 != false && ((q)var1_2.var_am_b.var_java_lang_Object_a).var_byte_e == 2;
                                    v5 = var5_33 = var3_21 != false && ((q)var1_2.var_am_b.var_java_lang_Object_a).var_byte_e == 3;
                                    if (var3_21) {
                                        ((q)var1_2.var_am_b.var_java_lang_Object_a).var_am_a.void_c();
                                    }
                                    var2_11.a(var4_26 != false ? 200 : (var3_21 != false ? 100 : 400));
                                    var1_2.var_am_b.void_a(var2_11);
                                    var2_11.a(var4_26 != false || var5_33 != false ? -512 : (var3_21 != false ? -1024 : -256));
                                    var1_2.var_am_a.void_a(var2_11);
                                    var1_2.var_am_a.void_c();
                                    var1_2.var_am_b = null;
                                    var1_2.var_int_e = 0;
                                }
                                if (var1_2.var_boolean_h && var1_2.var_int_e < -20) {
                                    var1_2.var_int_e = 56;
                                }
                                if (var1_2.var_byte_b != var1_2.var_byte_c) {
                                    if (var1_2.var_byte_b != 2 && var1_2.var_byte_c == 2) {
                                        var1_2.var_am_a.void_c();
                                    }
                                    var1_2.var_byte_c = var1_2.var_byte_b;
                                }
                                var2_12 = 0;
                                var3_22 = var1_2.var_am_a.as_b();
                                if (var1_2.y == 0 && (var1_2.var_boolean_d && !var1_2.var_boolean_i || var1_2.var_boolean_j && var1_2.var_int_i < -100) && (var1_2.var_am_a.var_int_b & 1) != 0 && var3_22.var_int_a < var3_22.b && var3_22.var_int_a > -var3_22.b && var3_22.b > 0) {
                                    var1_2.var_boolean_j = false;
                                    if ((var1_2.var_am_a.var_int_b & 2) == 0) {
                                        var2_12 = 1;
                                    } else {
                                        var1_2.y = 1;
                                    }
                                } else if (!var1_2.var_boolean_d && var1_2.var_int_i >= -100) {
                                    var1_2.y = 0;
                                }
                                if (var1_2.y > 0) {
                                    var4_27 = var1_2.var_am_a.int_arr_a();
                                    if (++var1_2.y > 10 || var1_2.y == 2 && var4_27[3] - var4_27[1] < (var1_2.l << 10) * 14 / 10) {
                                        var2_12 = 1;
                                        var1_2.y = 0;
                                    }
                                }
                                var1_2.var_boolean_i = var1_2.var_boolean_d;
                                if (!var1_2.var_boolean_j && var1_2.var_int_i >= -100) {
                                    var1_2.var_boolean_j = true;
                                } else if (var1_2.var_boolean_j && var1_2.var_int_i < -100) {
                                    var1_2.var_boolean_j = false;
                                }
                                var1_2.var_am_a.var_int_c = var1_2.var_byte_c == 1 ? 0 : 1024;
                                var6_41 = var1_2.var_byte_c == 2 ? 1 : 0;
                                var5_34 = var1_2.var_am_a;
                                var5_34.d = var6_41 != 0 ? (var5_34.d |= 1) : (var5_34.d &= -2);
                                if (var2_12 != 0 && !var3_22.boolean_a()) {
                                    var4_28 = null;
                                    var4_28 = new as(0, -1024);
                                    var5_35 = 0x7FFFFFFF;
                                    var2_12 = -2147483648;
                                    var6_41 = 0;
                                    var7_44 = var1_2.var_am_a.var_s_arr_a.length;
                                    var8_50 = new int[var7_44];
                                    for (var9_56 = 0; var9_56 < var7_44; ++var9_56) {
                                        var8_50[var9_56] = var1_2.var_am_a.var_s_arr_a[var9_56].var_as_a.var_int_a * var4_28.var_int_a + var1_2.var_am_a.var_s_arr_a[var9_56].var_as_a.b * var4_28.b >> 10;
                                        if (var8_50[var9_56] < var5_35) {
                                            var5_35 = var8_50[var9_56];
                                        }
                                        if (var8_50[var9_56] > var2_12) {
                                            var2_12 = var8_50[var9_56];
                                        }
                                        if ((var1_2.var_am_a.var_s_arr_a[var9_56].var_int_b & 1) == 0) continue;
                                        ++var6_41;
                                    }
                                    if ((var2_12 -= var5_35) != 0 && var6_41 > 0) {
                                        if (var1_2.var_int_b == var1_2.var_ar_a.var_int_f) {
                                            var1_2.var_ar_a.var_com_hardwire_blob_Main_a.a(0, false);
                                        } else if (var1_2.var_ar_a.var_byte_b == 2) {
                                            var1_2.var_ar_a.var_java_util_Vector_a.addElement(new byte[]{11});
                                        }
                                        var4_28.a(25000);
                                        var4_28.a((int)(((long)var6_41 << 20) / ((long)var2_12 * (long)var7_44)));
                                        for (var9_56 = 0; var9_56 < var7_44; ++var9_56) {
                                            if ((var1_2.var_am_a.var_s_arr_a[var9_56].var_int_b & 1) != 0) continue;
                                            v6 = var9_56;
                                            var8_50[v6] = var8_50[v6] - var5_35;
                                            var1_2.var_am_a.var_s_arr_a[var9_56].c.var_int_a = (int)((long)var1_2.var_am_a.var_s_arr_a[var9_56].c.var_int_a + ((long)var4_28.var_int_a * (long)var8_50[var9_56] >> 10));
                                            var1_2.var_am_a.var_s_arr_a[var9_56].c.b = (int)((long)var1_2.var_am_a.var_s_arr_a[var9_56].c.b + ((long)var4_28.b * (long)var8_50[var9_56] >> 10));
                                        }
                                    }
                                    if (var1_2.var_byte_c == 2) {
                                        var1_2.var_am_a.void_c();
                                    }
                                }
                                if (var1_2.var_byte_c != 2) ** GOTO lbl-1000
                                if (var1_2.var_boolean_b) ** GOTO lbl-1000
                                var5_36 = var1_2.var_am_a;
                                for (var6_41 = 0; var6_41 < var5_36.g; ++var6_41) {
                                    if (var5_36.var_t_arr_b[var6_41].var_as_a == null) continue;
                                    v7 = true;
                                    break block178;
                                }
                                v7 = false;
                            }
                            if (v7) lbl-1000:
                            // 2 sources

                            {
                                v8 = 1;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v8 = 0;
                            }
                            var4_29 = v8;
                            var5_37 = new as();
                            if (var1_2.var_boolean_f || var1_2.var_boolean_g) {
                                var5_37.a((var1_2.var_boolean_f != false ? -1 : (var1_2.var_boolean_g != false ? 1 : 0)) * (var4_29 != 0 ? 150 : (var1_2.var_boolean_a != false && (var1_2.var_am_a.var_int_b & 2) == 0 ? 100 : 50)), 0);
                            }
                            if (var1_2.var_boolean_d) {
                                if (var4_29 != 0) {
                                    if (var3_22.b < 0) {
                                        var5_37.a(0, -350);
                                    } else if (!var3_22.boolean_a()) {
                                        var5_37.a(0, (int)(-350L * (long)(var3_22.var_int_a < 0 ? -var3_22.var_int_a : var3_22.var_int_a) / (long)var3_22.c()));
                                    }
                                } else if (!var1_2.var_boolean_a) {
                                    var5_37.a(0, -100);
                                }
                            }
                            if (var1_2.y <= 0) break block180;
                            v9 = var5_37;
                            v10 = 0;
                            v11 = 1000;
                            break block181;
                        }
                        if (!var1_2.var_boolean_e) break block182;
                        v9 = var5_37;
                        v10 = 0;
                        v11 = (var1_2.var_am_a.var_int_b & 2) != 0 ? 500 : (var1_2.var_boolean_a != false ? 400 : 100);
                    }
                    v9.a(v10, v11);
                }
                if (var5_37.boolean_a()) {
                    if (var1_2.var_int_h != 0) {
                        var5_37.a(var1_2.var_int_h * (var4_29 != 0 ? 150 : (var1_2.var_boolean_a != false && (var1_2.var_am_a.var_int_b & 2) == 0 ? 100 : 50)) / 127, 0);
                    }
                    if (var1_2.var_int_i < 0) {
                        if (var4_29 != 0) {
                            if (var3_22.b < 0) {
                                var5_37.a(0, -var1_2.var_int_i * -350 / 127);
                            } else if (!var3_22.boolean_a()) {
                                var5_37.a(0, -var1_2.var_int_i * (int)(-350L * (long)(var3_22.var_int_a < 0 ? -var3_22.var_int_a : var3_22.var_int_a) / (long)var3_22.c()) / 127);
                            }
                        } else if (!var1_2.var_boolean_a) {
                            var5_37.a(0, -var1_2.var_int_i * -100 / 127);
                        }
                    }
                    if (var1_2.var_int_i > 0) {
                        var5_37.a(0, var1_2.var_int_i * ((var1_2.var_am_a.var_int_b & 2) != 0 ? 500 : (var1_2.var_boolean_a != false ? 400 : 100)) / 127);
                    }
                }
                if ((var1_2.var_int_j & 130) != 0) {
                    var5_37.a(150, 0);
                }
                if ((var1_2.var_int_j & 68) != 0) {
                    var5_37.a(-150, 0);
                }
                if ((var1_2.var_int_j & 192) != 0) {
                    var5_37.a(0, -350);
                } else if ((var1_2.var_int_j & 8) != 0) {
                    var5_37.a(0, -700);
                }
                if (var1_2.var_byte_e == 1) {
                    var5_37.a(1945);
                } else if (var1_2.var_byte_e == 2 || var1_2.var_byte_e == 3) {
                    var5_37.a(1331);
                }
                if (!var5_37.boolean_a()) {
                    var6_42 = var5_37;
                    var5_37 = var1_2.var_am_a;
                    for (var2_12 = 0; var2_12 < var5_37.var_s_arr_a.length; ++var2_12) {
                        var7_46 = var5_37.var_s_arr_a[var2_12];
                        if ((var7_46.var_int_b & 5) != 0) continue;
                        var8_51 = var6_42;
                        if (var7_46.var_int_a == 0x7FFFFFFF) continue;
                        var7_46.c.var_int_a += var8_51.var_int_a;
                        var7_46.c.b += var8_51.b;
                    }
                }
                if ((var1_2.var_am_a.var_int_b & 1) != 0) {
                    var2_13 = new as(var1_2.var_boolean_f != false || (var1_2.var_int_j & 32) != 0 ? -1 : (var1_2.var_boolean_g != false || (var1_2.var_int_j & 16) != 0 ? 1 : 0), var1_2.var_boolean_d != false ? -1 : (var1_2.var_boolean_e != false ? 1 : 0));
                    var6_43 = 0;
                    if (var2_13.boolean_a()) {
                        var2_13.b(var1_2.var_int_h, var1_2.var_int_i);
                        var6_43 = 1;
                    }
                    if (!var2_13.boolean_a() && !var3_22.boolean_a() && (var2_13.var_int_a != 0 || var2_13.b != -1 || var3_22.b <= 0 || var3_22.var_int_a >= var3_22.b && var3_22.var_int_a <= -var3_22.b)) {
                        var7_47 = var3_22.int_a(var2_13);
                        var7_47 = var7_47 > 0 ? -1 : (var7_47 < 0 ? 1 : 0);
                        var8_52 = var1_2.var_am_a.as_a();
                        var7_47 = var6_43 != 0 ? var2_13.c() * (var7_47 * (var4_29 == 0 && var1_2.var_am_a.boolean_a() != false ? 200 : 300)) / 127 << 10 : var7_47 * (var4_29 == 0 && var1_2.var_am_a.boolean_a() != false ? 200 : 300) << 10;
                        var9_57 = var1_2.var_am_a.var_s_arr_a.length;
                        for (var2_14 = 0; var2_14 < var9_57; ++var2_14) {
                            var3_22 = var1_2.var_am_a.var_s_arr_a[var2_14];
                            var4_29 = -var3_22.var_as_a.b + var8_52.b;
                            var5_38 = var3_22.var_as_a.var_int_a - var8_52.var_int_a;
                            if (var4_29 == 0 || var5_38 == 0) continue;
                            var6_43 = var7_47 / y.int_a(var4_29, var5_38);
                            var3_22.c.var_int_a += var4_29 * var6_43 >> 10;
                            var3_22.c.b += var5_38 * var6_43 >> 10;
                        }
                    }
                }
                var1_2.var_int_j = 0;
                if (this.var_ar_a.var_int_b != 128) {
                    var1_2 = this;
                    var2_15 = var1_2.var_am_a.int_a();
                    if (var2_15 < 0) {
                        var2_15 = -var2_15;
                    }
                    if (var2_15 < var1_2.var_am_a.e >> 1) {
                        var1_2.b(102400);
                    }
                }
                break block183;
            }
            if (this.var_byte_d == 1) {
                var2_16 = this.var_am_a;
                this.var_am_a.var_boolean_a = true;
                this.var_am_a.d();
                this.var_am_a.e();
                if (this.var_ar_a.var_byte_b == 1 && this.r++ >= 100) {
                    if (this.var_byte_a == 0) {
                        this.var_ar_a.var_byte_d = (byte)2;
                    } else if (this.var_byte_e == 3 && this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_byte_d == 0 && !this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_boolean_c) {
                        this.var_ac_a.c(168);
                    }
                }
                if ((this.var_ar_a.var_byte_e == 4 || this.var_ar_a.var_byte_e == 5) && this.r++ >= 50) {
                    this.var_ar_a.var_byte_d = (byte)5;
                    if (this.var_ar_a.var_byte_b == 2) {
                        this.var_ar_a.var_byte_a = (byte)3;
                    }
                    v12 = this.var_ar_a.var_int_a = this.var_int_b == 0 ? 1 : 0;
                    this.var_ar_a.var_int_arr_e[v12] = this.var_ar_a.var_int_arr_e[v12] + 1;
                }
            } else if (this.var_byte_d == 2) {
                ++this.var_int_c;
                if (this.var_int_c == 10) {
                    this.var_int_c = 0;
                    this.var_byte_d = 0;
                }
            }
        }
        if (this.var_ac_a.g > 1 || this.var_ar_a.var_int_b == 84) {
            for (var1_3 = 0; var1_3 != this.var_int_a; ++var1_3) {
                var2_17 = this.var_int_arr_arr_a[var1_3];
                if (this.var_ar_a.var_byte_b == 1 && !y.a(this.var_ac_a.var_int_arr_d, this.var_aa_arr_a[var1_3].a()) || this.var_ar_a.var_byte_b == 2 && !this.var_ac_a.boolean_a(this.var_aa_arr_a[var1_3].a())) {
                    var2_17[0] = 30;
                    var2_17[1] = 3;
                }
                if (var2_17[0] == 30) {
                    var2_17[1] = var2_17[1] + 1;
                    if (var2_17[1] != 4) continue;
                    this.var_ar_a.var_ab_a.b(this.var_aa_arr_a[var1_3].c);
                    --this.var_int_a;
                    if (var1_3 != this.var_int_a) {
                        this.var_aa_arr_a[var1_3] = this.var_aa_arr_a[this.var_int_a];
                        var2_17[0] = this.var_int_arr_arr_a[this.var_int_a][0];
                        var2_17[1] = this.var_int_arr_arr_a[this.var_int_a][1];
                    }
                    this.var_aa_arr_a[this.var_int_a] = null;
                    --var1_3;
                    continue;
                }
                if (var2_17[0] >= 29 && (this.var_aa_arr_a[var1_3].var_s_a.var_int_b & 1) == 0) continue;
                var2_17[0] = var2_17[0] + 1;
            }
            if (this.k > 0) {
                --this.k;
            }
        }
        this.var_boolean_b = false;
    }

    public final boolean boolean_a() {
        return this.var_byte_d == 1;
    }

    public final void b(int n2) {
        int n3;
        Object object;
        if (this.var_int_b == this.var_ar_a.var_int_f) {
            this.var_ar_a.var_com_hardwire_blob_Main_a.void_a(Main.var_int_b / Main.var_int_c);
        }
        this.var_int_c = 2;
        this.var_int_d -= n2;
        if (this.var_int_d <= 0) {
            this.var_int_d = 0;
            object = this;
            if (((q)object).var_byte_d == 0 && (((q)object).var_byte_a != 1 || ((q)object).var_byte_e == 0 || ((q)object).var_byte_e == 3)) {
                if (y.a(((q)object).var_ac_a.var_int_arr_d, ((q)object).var_am_a.int_arr_a())) {
                    ((q)object).var_ar_a.var_com_hardwire_blob_Main_a.a(4, false);
                }
                ((q)object).var_byte_d = 1;
                ((q)object).r = 0;
                ((q)object).var_ar_a.var_ab_a.b(((q)object).var_am_a);
                n3 = ((q)object).var_am_a.var_s_arr_a.length;
                for (int i2 = 0; i2 < n3; ++i2) {
                    aa aa2 = new aa(((q)object).var_am_a.var_s_arr_a[i2], 4096);
                    if (((q)object).var_byte_a != 1 || ((q)object).var_byte_e == 0) {
                        aa2.d = 6;
                    }
                    aa2.var_java_lang_Object_a = object;
                    ((q)object).var_ar_a.var_ab_a.a(aa2);
                }
                ((q)object).var_int_g = n3;
            }
        }
        if ((this.var_ac_a.g > 1 || this.var_ar_a.var_int_b == 84) && this.k == 0) {
            this.k = 2;
            if ((n2 >>= 10) == 0) {
                n2 = 1;
            }
            object = this.var_am_a.int_arr_a();
            for (n3 = 0; this.var_int_a != 16 && n3 < n2; ++n3) {
                s s2 = new s(new as(y.b((int)(object[0] + 5120), (int)(object[2] - 5120)), y.b((int)(object[1] + 5120), (int)(object[3] - 10240))), 2048);
                new s(new as(y.b((int)(object[0] + 5120), (int)(object[2] - 5120)), y.b((int)(object[1] + 5120), (int)(object[3] - 10240))), 2048).var_as_b.var_int_a = s2.var_as_a.var_int_a + y.b(-3072, 3072);
                s2.var_as_b.b = s2.var_as_a.b + y.b(2048, 3072);
                this.var_aa_arr_a[this.var_int_a] = new aa(s2, 5120);
                this.var_aa_arr_a[this.var_int_a].var_boolean_b = true;
                this.var_ar_a.var_ab_a.a(this.var_aa_arr_a[this.var_int_a]);
                this.var_int_arr_arr_a[this.var_int_a][0] = 0;
                this.var_int_arr_arr_a[this.var_int_a][1] = 0;
                ++this.var_int_a;
            }
        }
    }

    public final void b() {
        this.var_boolean_h = false;
        this.var_boolean_g = false;
        this.var_boolean_f = false;
        this.var_boolean_e = false;
        this.var_boolean_d = false;
        this.var_int_i = 0;
        this.var_int_h = 0;
        this.var_boolean_j = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Graphics graphics) {
        int n2;
        int n3;
        int n4;
        block58: {
            block57: {
                int n5;
                block61: {
                    block66: {
                        block65: {
                            block64: {
                                block63: {
                                    block62: {
                                        block60: {
                                            block56: {
                                                block59: {
                                                    if (this.var_ac_a.g > 1 || this.var_ar_a.var_int_b == 84) {
                                                        graphics.setColor(74, 0, 0);
                                                        for (n4 = 0; n4 != this.var_int_a; ++n4) {
                                                            n3 = this.var_aa_arr_a[n4].var_s_a.var_as_a.var_int_a >> 10;
                                                            n5 = this.var_aa_arr_a[n4].var_s_a.var_as_a.b >> 10;
                                                            if (this.var_int_arr_arr_a[n4][0] == 30) {
                                                                n2 = 5 * (5 - this.var_int_arr_arr_a[n4][1]) / 6 << 10 >> 10;
                                                                graphics.fillArc(n3 - n2, n5 - n2, n2 << 1, n2 << 1, 0, 360);
                                                                continue;
                                                            }
                                                            graphics.drawImage(this.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(this.var_int_arr_arr_a[n4][0] > 15 ? 129 : 118), n3, n5, 3);
                                                        }
                                                    }
                                                    if (this.var_byte_d != 0) break block58;
                                                    if (this.var_boolean_a && this.var_ac_a.g > 1 && (this.var_ac_a.var_int_d & 1) == 0 && y.b(0, 1) == 0) {
                                                        as as2 = this.var_am_a.as_a();
                                                        this.var_ac_a.b(as2.var_int_a >> 10, as2.b >> 10, 0, 2);
                                                    }
                                                    if (this.o != -1) break block59;
                                                    n4 = 1647099 - this.n;
                                                    if (this.p != 0 || (this.var_am_a.var_int_b & 1) == 0 || n4 >= 183011 || n4 <= -183011) break block56;
                                                    n3 = 0;
                                                    if (this.var_ar_a.var_byte_b == 1) {
                                                        this.var_int_f = n3 = this.var_am_a.as_c().d();
                                                    }
                                                    if (n3 < 1024) {
                                                        if (y.b(0, 2) == 0) {
                                                            this.o = 0;
                                                            break block56;
                                                        } else {
                                                            this.p = 5;
                                                        }
                                                    }
                                                    break block56;
                                                }
                                                ++this.o;
                                                if (this.o == 5) {
                                                    this.o = -1;
                                                    this.p = 20;
                                                    this.n = 1647099;
                                                }
                                            }
                                            if (this.p > 0) {
                                                --this.p;
                                            }
                                            if (this.var_int_e <= 0) break block60;
                                            this.n = 1647099;
                                            this.q = -1;
                                            if (this.s < 1) {
                                                ++this.s;
                                            }
                                            break block61;
                                        }
                                        if (this.s <= -1) break block62;
                                        --this.s;
                                        break block61;
                                    }
                                    if (this.q != -1 || (this.var_am_a.var_int_b & 1) != 0) break block63;
                                    n4 = 1647099 - this.n;
                                    if (n4 < 253399 && n4 > -253399) {
                                        ++this.r;
                                        if (this.r == 2) {
                                            this.q = 0;
                                            this.r = 0;
                                        }
                                    }
                                    break block61;
                                }
                                if (this.q >= 2 || this.q <= -1) break block64;
                                ++this.q;
                                break block61;
                            }
                            if (this.q != 2 || (this.var_am_a.var_int_b & 1) == 0) break block65;
                            this.q = 3;
                            break block61;
                        }
                        if (this.q <= 2) break block66;
                        ++this.q;
                        if (this.q != 6) break block61;
                        this.q = -1;
                    }
                    this.r = 0;
                }
                if (this.q != -1 || this.s != -1 || this.t != -1) {
                    this.n = 1647099;
                } else if (this.o == -1) {
                    as as3 = this.var_am_a.as_b();
                    if (as3.boolean_a()) {
                        as3.b = 1024;
                    }
                    n3 = as3.int_a();
                    if (this.n == Integer.MAX_VALUE) {
                        this.n = n3;
                    } else {
                        n5 = n3 - this.n;
                        if (n5 < -3294198) {
                            n5 += 6588397;
                        } else if (n5 > 3294198) {
                            n5 -= 6588397;
                        }
                        this.n = y.int_a(this.n + n5 / 6);
                    }
                }
                this.var_af_a.a(this.var_am_a.var_s_arr_a, this.var_am_a.as_a());
                int n6 = 0;
                n6 = this.var_byte_a == 1 ? -6710887 : var_int_arr_a[this.var_int_b];
                if (this.var_int_c > 0) {
                    if (this.t++ == 2) {
                        this.t = 0;
                    }
                    int[] nArray = new int[]{-65536, -5177344, -10878976};
                    n6 = nArray[this.t];
                    --this.var_int_c;
                } else {
                    this.t = -1;
                }
                this.var_af_a.a(graphics, n6);
                try {
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    int n12;
                    if (this.var_ac_a.g <= 1 || this.t != -1) break block57;
                    Graphics graphics2 = graphics;
                    q q2 = this;
                    as as4 = q2.var_am_a.as_a();
                    n2 = as4.var_int_a >> 15;
                    int n13 = as4.b >> 15;
                    if (n2 < 0 || n13 < 0 || n2 >= q2.var_ar_a.var_int_d || n13 >= q2.var_ar_a.var_int_e || (n12 = q2.var_ar_a.var_byte_arr_arr_arr_a[0][n2][n13]) <= -1 || ar.var_boolean_arr_b[n12]) break block57;
                    int n14 = q2.var_am_a.var_s_arr_a.length;
                    int n15 = -1;
                    int n16 = 0;
                    if (q2.u == n2 && q2.v == n13) {
                        n15 = q2.w;
                        n16 = q2.x;
                    } else {
                        n11 = Integer.MAX_VALUE;
                        n12 = n2 - 8;
                        n10 = n13 - 8;
                        n9 = n2 + 8;
                        n8 = n13 + 8;
                        n12 = n12 < 0 ? 0 : n12;
                        n10 = n10 < 0 ? 0 : n10;
                        n9 = n9 >= q2.var_ar_a.var_int_d ? q2.var_ar_a.var_int_d - 1 : n9;
                        n8 = n8 >= q2.var_ar_a.var_int_e ? q2.var_ar_a.var_int_e - 1 : n8;
                        for (n7 = n12; n7 <= n9; ++n7) {
                            for (int i2 = n10; i2 <= n8; ++i2) {
                                int n17;
                                int n18;
                                n12 = q2.var_ar_a.var_byte_arr_arr_arr_a[0][n7][i2];
                                if (n12 != 8 && n12 != 9 && n12 != 30 && n12 != 36 && q2.var_ar_a.var_byte_arr_arr_arr_a[2][n7][i2] != 37 || !q2.var_ac_a.boolean_a(as4.var_int_a, as4.b, n7 << 15, i2 << 15) || (n18 = (n12 = n7 - n2) * n12 + (n17 = i2 - n13) * n17) >= n11) continue;
                                n15 = n7;
                                n16 = i2;
                                n11 = n18;
                            }
                        }
                    }
                    if (n15 != -1) {
                        q2.u = n2;
                        q2.v = n13;
                        q2.w = n15;
                        q2.x = n16;
                        n11 = (n15 << 15) + 16384 - as4.var_int_a;
                        int n19 = (n16 << 15) + 16384 - as4.b;
                        n12 = y.int_a(n11, n19);
                        n11 = (int)(((long)n11 << 10) / (long)n12);
                        n19 = (int)(((long)n19 << 10) / (long)n12);
                        graphics2.setColor(var_int_arr_arr_arr_a[q2.var_ac_a.var_int_a][q2.var_byte_a][0], var_int_arr_arr_arr_a[q2.var_ac_a.var_int_a][q2.var_byte_a][1], var_int_arr_arr_arr_a[q2.var_ac_a.var_int_a][q2.var_byte_a][2]);
                        n10 = 0;
                        n9 = n14 - 1;
                        n8 = n14 - 2;
                        n7 = n14 - 3;
                        while (n10 < n14) {
                            as as5 = q2.var_am_a.var_s_arr_a[n10].var_as_a;
                            as as6 = q2.var_am_a.var_s_arr_a[n9].var_as_a;
                            as as7 = q2.var_am_a.var_s_arr_a[n8].var_as_a;
                            as as8 = q2.var_am_a.var_s_arr_a[n7].var_as_a;
                            n2 = as6.b - as7.b;
                            n13 = as7.var_int_a - as6.var_int_a;
                            if (n2 * n11 + n13 * n19 > 0 && n13 * (as5.var_int_a - as6.var_int_a) - n2 * (as5.b - as6.b) <= 0 && n13 * (as7.var_int_a - as8.var_int_a) - n2 * (as7.b - as8.b) <= 0) {
                                n15 = y.int_a(n2, n13);
                                if ((n15 = (n2 = (int)(((long)n2 << 10) / (long)n15)) * n19 - (n13 = (int)(((long)n13 << 10) / (long)n15)) * n11 >> 10) < 341 && n15 > -341) {
                                    n15 = (as6.var_int_a + as7.var_int_a >> 1) - n2 * 5;
                                    int n20 = (as6.b + as7.b >> 1) - n13 * 5;
                                    if (n2 < 0) {
                                        n2 = -n2;
                                    }
                                    if (n13 < 0) {
                                        n13 = -n13;
                                    }
                                    n2 = (8 * (1024 - n2) >> 10) + 2;
                                    n13 = (8 * (1024 - n13) >> 10) + 2;
                                    graphics2.fillArc((n15 >> 10) - n2, (n20 >> 10) - n13, n2 << 1, n13 << 1, 0, 360);
                                }
                            }
                            n7 = n8;
                            n8 = n9;
                            n9 = n10++;
                        }
                    }
                }
                catch (Exception exception) {}
            }
            if (this.var_byte_a == 1) {
                this.var_am_a.a(graphics, as.var_as_a, this.var_byte_c == 0 ? 0x5D5D5D : (this.var_byte_c == 2 ? 0xCCCCCC : 10834699));
            } else {
                this.var_am_a.a(graphics, as.var_as_a, this.var_byte_c == 1 ? 8610063 : (this.var_byte_c == 2 ? (this.var_ac_a.g == 0 ? 0x888888 : 0x636363) : (this.var_ac_a.g == 0 ? 0x363636 : 0)));
            }
            as as9 = this.var_am_a.as_a();
            as as10 = as9.as_b(new as(this.n, 3072L, false));
            as10.var_int_a >>= 10;
            as10.b >>= 10;
            Image image = null;
            if (this.t != -1) {
                image = this.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(this.var_byte_a == 1 ? 525 : 125);
                graphics.drawImage(image, as9.var_int_a >> 10, (as9.b >> 10) - 1, 3);
                graphics.drawImage(this.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(126 + this.t), as9.var_int_a >> 10, (as9.b >> 10) - 20, 3);
                return;
            }
            if (this.s != -1) {
                image = this.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(this.var_byte_a == 1 ? 529 + this.s : 123 + this.s);
                graphics.drawImage(image, as9.var_int_a >> 10, as9.b >> 10, 3);
                return;
            }
            if (this.q != -1) {
                int n21 = this.q < 3 ? this.q : 5 - this.q;
                image = this.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(this.var_byte_a == 1 ? n21 + 526 : n21 + 120);
                graphics.drawImage(image, as9.var_int_a >> 10, (as9.b >> 10) + 1, 3);
                return;
            }
            if (this.o == -1) {
                ad.a(graphics, var_javax_microedition_lcdui_Image_arr_arr_a[this.var_byte_a], as10, this.n - 1647099);
                return;
            }
            if (this.o == 2) return;
            image = this.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(this.o == 0 || this.o == 4 ? (this.var_byte_a == 1 ? 516 : 110) : (this.var_byte_a == 1 ? 524 : 119));
            graphics.drawImage(image, as10.var_int_a, as10.b, 3);
            return;
        }
        if (this.var_byte_d != 1) {
            if (this.var_byte_d != 2) return;
            if (this.var_byte_a == 1) {
                graphics.setColor(-6710887);
            } else {
                graphics.setColor(var_int_arr_a[this.var_int_b]);
            }
            as as11 = this.var_am_a.as_a();
            n3 = this.var_int_c * 24 / 10 << 10 >> 10;
            graphics.fillArc((as11.var_int_a >> 10) - n3, (as11.b >> 10) - n3, n3 << 1, n3 << 1, 0, 360);
            return;
        }
        n4 = this.var_am_a.var_s_arr_a.length;
        n3 = 0;
        while (n3 < n4) {
            s s2 = this.var_am_a.var_s_arr_a[n3];
            if ((s2.var_int_b & 0x10) == 0) {
                n2 = s2.var_as_a.var_int_a >> 10;
                int n22 = s2.var_as_a.b >> 10;
                if (this.var_byte_a == 1) {
                    graphics.setColor(-6710887);
                    graphics.fillArc(n2 - 4, n22 - 4, 8, 8, 0, 360);
                } else {
                    graphics.drawImage(this.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(109), n2, n22, 3);
                }
            }
            ++n3;
        }
    }

    static {
        var_int_arr_a = new int[]{-16777216, -15592170};
        var_int_arr_arr_arr_a = new int[][][]{new int[][]{{50, 49, 20}, {200, 200, 200}}, new int[][]{{58, 49, 20}, {200, 200, 200}}, new int[][]{{64, 8, 0}, {200, 200, 200}}};
    }
}


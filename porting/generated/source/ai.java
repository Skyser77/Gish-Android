/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ai {
    public byte var_byte_a;
    public aa var_aa_a;
    public aa var_aa_b;
    private int var_int_b;
    public boolean var_boolean_a;
    private q var_q_a;
    private ar var_ar_a;
    private static final int[][] var_int_arr_arr_a;
    private static final int[][] var_int_arr_arr_b;
    private static final byte[][] var_byte_arr_arr_a;
    private static final byte[][] var_byte_arr_arr_b;
    private static int[] var_int_arr_c;
    public byte var_byte_b;
    public byte var_byte_c;
    public static final int[] var_int_arr_a;
    public byte var_byte_d;
    private static Image[][][] var_javax_microedition_lcdui_Image_arr_arr_arr_a;
    public boolean var_boolean_b;
    private boolean var_boolean_d;
    public int var_int_a;
    private int var_int_c;
    private int[] var_int_arr_d;
    public boolean var_boolean_c;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static int[] h;
    private static final int[] i;
    public static final int[] var_int_arr_b;
    private static final int[] j;

    public ai(ar ar2) {
        this.var_ar_a = ar2;
        this.var_byte_a = (byte)2;
    }

    public final void a(byte by, as as2, boolean bl) {
        this.var_byte_d = by;
        this.var_byte_a = 0;
        this.var_boolean_a = false;
        this.var_boolean_b = false;
        this.var_aa_a = null;
        this.var_aa_b = null;
        this.var_byte_b = 0;
        this.var_byte_c = 0;
        this.var_int_a = -1;
        this.var_int_c = 0;
        if (this.var_byte_d == 4) {
            this.var_aa_a = new aa(new s(as2, 0), 39936);
            this.var_aa_a.var_int_b = 0;
            this.var_boolean_d = false;
            return;
        }
        if (this.var_byte_d == 0) {
            this.var_aa_a = new aa(new s(as2, 6144), 12288);
            this.var_boolean_d = true;
        } else if (this.var_byte_d == 1) {
            as2.b += 3072;
            this.var_aa_a = new aa(new s(as2, 16384), 13312);
            this.var_aa_b = new aa(new s(as2.as_b(new as(0, 32768)), 16384), 14336);
            this.var_aa_b.d = 2;
            this.var_aa_b.var_java_lang_Object_a = this;
            this.var_aa_a.d = 5;
            this.var_aa_a.var_java_lang_Object_a = this;
            this.var_aa_b.var_int_b = 0;
            if (this.var_ar_a.var_ab_a != null && this.var_ar_a.var_ab_a.var_boolean_b) {
                this.var_ar_a.var_ab_a.a(this.var_aa_b);
            }
            this.var_int_b = this.var_aa_b.var_s_a.var_as_a.b - this.var_aa_a.var_s_a.var_as_a.b;
            this.var_aa_b.var_aa_a = this.var_aa_a;
            this.var_aa_a.var_aa_a = this.var_aa_b;
            this.var_boolean_d = true;
        } else if (this.var_byte_d == 2) {
            this.var_aa_a = new aa(new s(as2, 1000000), 15360);
            this.var_boolean_d = false;
        } else if (this.var_byte_d == 5) {
            this.var_aa_a = new aa(new s(as2.as_b(new as(0, 32768)), Integer.MAX_VALUE), 45056);
            this.var_aa_a.var_int_b = 0;
            this.var_int_c = 40;
            this.var_boolean_d = false;
        } else if (this.var_byte_d == 6) {
            this.var_aa_a = new aa(new s(as2.as_b(new as(0, 13312)), Integer.MAX_VALUE), 13312);
            this.var_aa_a.var_int_b = 0;
            this.var_boolean_d = false;
        }
        if (this.var_aa_b == null) {
            this.var_aa_a.d = 2;
            this.var_aa_a.var_java_lang_Object_a = this;
        }
        if (this.var_byte_d != 5 && this.var_byte_d != 6) {
            this.var_aa_a.var_int_b = 102;
        }
        if (this.var_ar_a.var_ab_a != null && this.var_ar_a.var_ab_a.var_boolean_b) {
            this.var_ar_a.var_ab_a.a(this.var_aa_a);
        }
    }

    public final int[] int_arr_a() {
        if (this.var_byte_d == 6) {
            if (this.var_int_arr_d == null) {
                this.var_int_arr_d = new int[4];
            }
            this.var_int_arr_d[0] = this.var_aa_a.var_s_a.var_as_a.var_int_a - this.var_aa_a.var_int_a;
            this.var_int_arr_d[2] = this.var_aa_a.var_s_a.var_as_a.var_int_a + this.var_aa_a.var_int_a;
            this.var_int_arr_d[3] = this.var_int_arr_d[1] = this.var_aa_a.var_s_a.var_as_a.b + this.var_aa_a.var_int_a * (this.var_int_c < 0 ? -1 : 1);
            if (this.var_int_c < 0) {
                this.var_int_arr_d[3] = this.var_int_arr_d[3] + (-this.var_int_c << 15);
            } else {
                this.var_int_arr_d[1] = this.var_int_arr_d[1] - (this.var_int_c << 15);
            }
            return this.var_int_arr_d;
        }
        if (this.var_aa_b == null) {
            return this.var_aa_a.a();
        }
        if (this.var_int_arr_d == null) {
            this.var_int_arr_d = new int[4];
        }
        int[] nArray = this.var_aa_b.a();
        this.var_int_arr_d[0] = nArray[0];
        this.var_int_arr_d[1] = nArray[1];
        this.var_int_arr_d[2] = nArray[2];
        this.var_int_arr_d[3] = nArray[3];
        if (this.var_byte_d == 1) {
            this.var_int_arr_d[3] = this.var_int_arr_d[3] + 38912;
        }
        return this.var_int_arr_d;
    }

    public static void a(ad ad2) {
        if (var_javax_microedition_lcdui_Image_arr_arr_arr_a == null) {
            var_javax_microedition_lcdui_Image_arr_arr_arr_a = new Image[var_int_arr_arr_a.length][][];
        }
        for (int i2 = 0; i2 < var_javax_microedition_lcdui_Image_arr_arr_arr_a.length; ++i2) {
            if (ad2.javax_microedition_lcdui_Image_a(256 + var_int_arr_arr_a[i2][0]) == null) {
                ai.var_javax_microedition_lcdui_Image_arr_arr_arr_a[i2] = null;
                continue;
            }
            ai.var_javax_microedition_lcdui_Image_arr_arr_arr_a[i2] = new Image[var_int_arr_arr_a[i2].length][];
            for (int i3 = 0; i3 < var_javax_microedition_lcdui_Image_arr_arr_arr_a[i2].length; ++i3) {
                if (var_int_arr_arr_a[i2][i3] == -1) continue;
                ai.var_javax_microedition_lcdui_Image_arr_arr_arr_a[i2][i3] = ad2.a(256 + var_int_arr_arr_a[i2][i3], var_int_arr_arr_b[i2][i3], i2 < 2);
            }
        }
    }

    public static void a(ad ad2, int n2) {
        for (int i2 = 0; i2 < var_int_arr_arr_a[n2].length; ++i2) {
            if (var_int_arr_arr_a[n2][i2] == -1) continue;
            for (int i3 = 0; i3 < var_int_arr_arr_b[n2][i2]; ++i3) {
                ad2.void_a(256 + var_int_arr_arr_a[n2][i2] + i3);
            }
        }
    }

    private int int_a() {
        switch (this.var_byte_a) {
            case 0: 
            case 6: {
                return 0;
            }
            case 3: {
                return 1;
            }
            case 1: {
                return 2;
            }
            case 4: {
                return 3;
            }
            case 5: {
                return 4;
            }
        }
        return 0;
    }

    public final void a(byte by) {
        if (this.var_ar_a.var_byte_b != 4 && (this.var_byte_d == 2 || this.var_byte_d == 5) && by == 4) {
            boolean bl = false;
            int n2 = this.var_ar_a.var_ai_arr_a.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.var_ar_a.var_ai_arr_a[i2].var_byte_a != 2 || this.var_ar_a.var_ai_arr_a[i2].var_byte_d != 0) continue;
                bl = true;
                break;
            }
            if (this.var_byte_d == 5) {
                this.var_int_c = 100;
            }
            if (bl && this.var_byte_d == 2) {
                this.var_int_c = 45;
            }
            if (!bl) {
                return;
            }
        }
        this.var_byte_a = by;
        this.var_byte_b = 0;
        this.var_byte_c = 0;
    }

    public final boolean boolean_a() {
        return this.var_byte_a == 1 || this.var_byte_a == 2 || this.var_byte_a == 5;
    }

    public final void a(Graphics graphics) {
        int n2;
        if (this.var_byte_a == 2) {
            return;
        }
        int n3 = this.int_a();
        if (this.var_byte_b < var_byte_arr_arr_a[var_int_arr_a[this.var_byte_d]][n3]) {
            n2 = this.var_aa_a.var_s_a.var_as_a.var_int_a >> 10;
            int n4 = this.var_aa_a.var_s_a.var_as_a.b >> 10;
            if (this.var_byte_d == 4) {
                Image image = var_javax_microedition_lcdui_Image_arr_arr_arr_a[var_int_arr_a[this.var_byte_d]][0][0];
                byte by = this.var_byte_b;
                if (n3 == 0) {
                    by = 0;
                    n4 = this.var_byte_b < 4 ? (n4 += (this.var_byte_b << 1) - 4) : (n4 += (7 - this.var_byte_b << 1) - 4);
                }
                ad.a(graphics, var_javax_microedition_lcdui_Image_arr_arr_arr_a[var_int_arr_a[this.var_byte_d]][n3], n2 + (var_javax_microedition_lcdui_Image_arr_arr_arr_a[var_int_arr_a[this.var_byte_d]][n3][by].getWidth() - image.getWidth() >> 1) * (this.var_boolean_a ? 1 : -1), n4 + (image.getHeight() >> 1), by, !this.var_boolean_a, false, 33);
                if (this.var_byte_a == 0 || this.var_byte_a == 3) {
                    n3 = -1;
                    if ((this.var_ar_a.var_ac_a.var_int_d & 0x10) == 0) {
                        n3 = this.var_ar_a.var_ac_a.var_int_d >> 1 & 0xF;
                        int n5 = n3 == 0 || n3 == 2 ? 0 : (n3 = n3 == 1 ? 1 : -1);
                    }
                    if (n3 != -1) {
                        ad.a(graphics, var_javax_microedition_lcdui_Image_arr_arr_arr_a[var_int_arr_a[this.var_byte_d]][4], n2 + 11 * (this.var_boolean_a ? 1 : -1), n4 - 15, n3, !this.var_boolean_a, false, 3);
                    }
                }
            } else if (this.var_byte_d == 5) {
                n4 += 48;
                if (this.var_byte_a == 1) {
                    n4 = this.var_ar_a.var_int_b == 128 ? (n4 += this.var_byte_b * 7) : (n4 += this.var_byte_b * 10);
                }
                Image[] imageArray = var_javax_microedition_lcdui_Image_arr_arr_arr_a[var_int_arr_a[this.var_byte_d]][0];
                graphics.drawImage(imageArray[0], n2, n4, 33);
                int n6 = -1;
                if ((this.var_ar_a.var_ac_a.var_int_d & 0x10) == 0) {
                    n6 = this.var_ar_a.var_ac_a.var_int_d >> 1 & 0xF;
                    int n7 = n6 == 0 || n6 == 2 ? 0 : (n6 = n6 == 1 ? 1 : -1);
                }
                if (this.var_byte_a == 6) {
                    n6 = 1;
                }
                if (n6 != -1) {
                    graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_arr_a[var_int_arr_a[this.var_byte_d]][1][n6], n2, n4, 33);
                }
                ad.a(graphics, imageArray, n2 - 16, n4, 2, false, false, 40);
                ad.a(graphics, imageArray, n2 + 16, n4, 2, true, false, 36);
                n4 -= 37;
                n3 = var_byte_arr_arr_a[var_int_arr_a[this.var_byte_d]][0];
                n6 = 0;
                if (!this.boolean_a()) {
                    n6 = this.var_byte_b << 1 < n3 >> 1 ? this.var_byte_b << 1 : n3 - (this.var_byte_b << 1);
                }
                int n8 = -2 + this.var_aa_a.var_int_b * 6;
                if (this.var_aa_a.var_int_b > 0) {
                    n8 += n6;
                    n6 = 0;
                }
                if (this.var_byte_a == 6) {
                    n8 = -10;
                    n6 = -3;
                    n4 += 5;
                }
                ad.a(graphics, imageArray, n2 - n8, n4 - n6 + (n3 >> 1), 1, false, false, 40);
                ad.a(graphics, imageArray, n2 + n8, n4 + n6, 1, true, false, 36);
            } else if (this.var_byte_d == 6) {
                int n9 = this.var_int_c < 0 ? -this.var_int_c : this.var_int_c;
                int n10 = this.var_int_c < 0 ? -1 : 1;
                n4 += ((n9 * 32 - this.var_aa_a.var_int_b << 5) / 32 + (this.var_aa_a.var_int_a >> 10)) * n10;
                for (n3 = 0; n3 < n9; ++n3) {
                    graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_arr_a[var_int_arr_a[this.var_byte_d]][0][this.var_byte_b], n2, n4 - (n3 << 5) * n10, 1 | (this.var_int_c < 0 ? 16 : 32));
                }
            } else if (this.var_byte_d == 2) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_arr_a[var_int_arr_a[this.var_byte_d]][n3][this.var_byte_b], n2, n4 + 16, 33);
                if (n3 == 3 && this.var_byte_b >= 3 && this.var_byte_b <= 5) {
                    graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_arr_a[var_int_arr_a[var_int_arr_a[this.var_byte_d]]][4][this.var_byte_b - 3], n2, n4 - 14, 33);
                }
            } else {
                if (this.var_byte_d == 0) {
                    n4 += 12;
                } else if (this.var_byte_d == 1) {
                    n4 += 13;
                }
                ad.a(graphics, var_javax_microedition_lcdui_Image_arr_arr_arr_a[var_int_arr_a[this.var_byte_d]][n3], n2, n4, this.var_byte_b, this.var_boolean_a, true, 33);
            }
        }
        if (this.var_aa_b != null) {
            if (this.var_byte_a == 5) {
                n2 = this.var_aa_b.var_int_a * (5 - this.var_byte_b) / 5 >> 10;
                graphics.setColor(49, 49, 49);
                graphics.fillArc((this.var_aa_b.var_s_a.var_as_a.var_int_a >> 10) - n2, (this.var_aa_b.var_s_a.var_as_a.b >> 10) - n2, n2 << 1, n2 << 1, 0, 360);
                return;
            }
            int n11 = n2 = this.var_byte_a == 4 || this.var_byte_a == 1 ? 2 : 1;
            if (this.var_q_a != null) {
                as as2 = this.var_q_a.var_am_a.as_a().as_b(this.var_aa_b.var_s_a.var_as_a);
                if (as2.b < 0 && (as2.var_int_a < 0 ? -as2.var_int_a : as2.var_int_a) < -as2.b) {
                    n2 = 0;
                }
            }
            ad.a(graphics, var_javax_microedition_lcdui_Image_arr_arr_arr_a[this.var_byte_d][4], this.var_aa_b.var_s_a.var_as_a.var_int_a >> 10, this.var_aa_b.var_s_a.var_as_a.b >> 10, n2, n2 == 0 ? false : this.var_boolean_a, true, 3);
        }
    }

    private void a(int n2) {
        as as2;
        boolean bl;
        ai ai2 = this.var_ar_a.var_ai_arr_a[n2];
        int n3 = this.var_aa_a.var_s_a.var_as_a.var_int_a >> 15;
        int n4 = this.var_aa_a.var_s_a.var_as_a.b >> 15;
        if (this.var_ar_a.var_int_b == 128 && n2 <= 1) {
            bl = false;
            int n5 = n2 == 0 ? -3 : 3;
            as2 = this.var_aa_a.var_s_a.var_as_a.as_a(new as(n5 << 15, 311296));
        } else {
            int n6;
            boolean bl2;
            bl = y.b(0, 1) == 1;
            if (bl) {
                n4 -= 3;
            }
            int n7 = 0;
            do {
                n6 = this.var_ar_a.var_int_b == 128 ? ((n2 & 1) == 0 ? y.b(-6, -2) : y.b(2, 6)) : (bl ? y.b(-8, 1) : y.b(-7, -2));
                bl2 = false;
                for (int i2 = 0; i2 < this.var_ar_a.var_ai_arr_a.length; ++i2) {
                    ai ai3 = this.var_ar_a.var_ai_arr_a[i2];
                    if (ai3.var_byte_d != 6 || ai3.boolean_a() || ai3.var_aa_a.var_s_a.var_as_a.var_int_a >> 15 != n3 + n6 || ai3.var_aa_a.var_s_a.var_as_a.b >> 15 != n4) continue;
                    bl2 = true;
                }
            } while (bl2 && ++n7 < 100);
            as2 = this.var_aa_a.var_s_a.var_as_a.as_a(new as(n6 << 15, 16384 - (bl ? 131072 : 0)));
        }
        ai2.a((byte)6, as2, true);
        if (this.var_ar_a.var_int_b == 123) {
            ai2.var_int_a = 200;
        }
        if (bl) {
            ai2.var_aa_a.var_s_a.var_as_a.b += ai2.var_aa_a.var_int_a << 1;
            ai2.var_int_c = -y.b(1, 2);
            return;
        }
        if (this.var_ar_a.var_int_b == 128 && n2 <= 1) {
            ai2.var_int_c = 2;
            return;
        }
        ai2.var_int_c = y.b(1, 2);
    }

    public final void void_a() {
        block101: {
            block105: {
                int n2;
                block109: {
                    block108: {
                        as as2;
                        block107: {
                            block106: {
                                int n3;
                                block102: {
                                    block104: {
                                        block103: {
                                            int n4;
                                            if (this.var_byte_a == 2) {
                                                return;
                                            }
                                            if (this.var_byte_d == 6 && this.var_byte_a == 1) {
                                                this.var_aa_a.var_int_b -= 3;
                                                if (this.var_aa_a.var_int_b <= 0) {
                                                    this.var_byte_a = (byte)2;
                                                    this.var_byte_d = 0;
                                                }
                                                return;
                                            }
                                            int n5 = this.int_a();
                                            if (n5 == 4) {
                                                if (this.var_byte_c == 1) {
                                                    this.var_byte_c = 0;
                                                    this.var_byte_b = (byte)(this.var_byte_b + 1);
                                                    if (this.var_byte_b == 5) {
                                                        this.var_byte_a = (byte)2;
                                                        this.var_ar_a.var_ab_a.b(this.var_aa_b.c);
                                                    }
                                                }
                                                this.var_byte_c = (byte)(this.var_byte_c + 1);
                                                return;
                                            }
                                            if (this.var_byte_c >= var_byte_arr_arr_b[var_int_arr_a[this.var_byte_d]][n5]) {
                                                this.var_byte_c = 0;
                                                this.var_byte_b = (byte)(this.var_byte_b + 1);
                                                if (this.var_byte_a == 1) {
                                                    if (this.var_aa_b != null) {
                                                        if (this.var_byte_b >= 15 && (this.var_aa_b.var_s_a.var_int_b & 2) != 0) {
                                                            this.var_byte_a = (byte)5;
                                                            this.var_byte_b = 0;
                                                            this.var_byte_c = 0;
                                                            return;
                                                        }
                                                    } else if (this.var_byte_b == var_byte_arr_arr_a[var_int_arr_a[this.var_byte_d]][n5]) {
                                                        this.var_byte_a = (byte)2;
                                                        if (this.var_byte_d == 4 || this.var_byte_d == 5) {
                                                            this.var_ar_a.var_ac_a.var_int_c = 6;
                                                        }
                                                        if (this.var_byte_d == 5) {
                                                            this.var_byte_a = 1;
                                                            this.var_byte_b = (byte)(this.var_byte_b - 1);
                                                        }
                                                        return;
                                                    }
                                                } else if (this.var_byte_b == var_byte_arr_arr_a[var_int_arr_a[this.var_byte_d]][n5]) {
                                                    this.var_byte_b = 0;
                                                    if (n5 == 3 && this.var_int_c > 0) {
                                                        this.a((byte)0);
                                                    }
                                                }
                                            }
                                            this.var_byte_c = (byte)(this.var_byte_c + 1);
                                            if (this.var_byte_a == 1) {
                                                return;
                                            }
                                            if (this.var_ar_a.var_int_b != 77 && (this.var_aa_a.var_s_a.var_int_b & 2) != 0 && ((this.var_aa_a.var_s_a.var_int_b & 0x40) != 0 || this.var_aa_b != null && (this.var_aa_b.var_s_a.var_int_b & 0x40) != 0) && ((n5 = this.var_aa_a.var_s_a.var_as_a.b - this.var_aa_a.var_s_a.var_as_b.b) > j[this.var_byte_d] || n5 < -j[this.var_byte_d])) {
                                                n5 = 0;
                                                while (n5 < this.var_ar_a.var_q_arr_a.length) {
                                                    int n6 = n5++;
                                                    this.var_ar_a.var_int_arr_e[n6] = this.var_ar_a.var_int_arr_e[n6] + 30;
                                                }
                                                aa aa2 = this.var_aa_a;
                                                as as3 = aa2.var_s_a.var_as_a;
                                                this.var_ar_a.var_ac_a.void_a(as3.var_int_a >> 10, as3.b >> 10, 30, 30);
                                                this.b();
                                                return;
                                            }
                                            if (this.var_byte_d == 2 && this.var_aa_a.a()[1] >= this.var_ar_a.var_int_e << 15) {
                                                this.var_byte_a = (byte)2;
                                                return;
                                            }
                                            n5 = this.var_ar_a.a(this.var_aa_a.a());
                                            if (n5 != -1) {
                                                if (!this.var_boolean_b && this.var_ar_a.var_ac_a.g > 0 && y.a(this.var_ar_a.var_ac_a.var_int_arr_d, this.var_aa_a.a())) {
                                                    aa aa3 = this.var_aa_a;
                                                    this.var_ar_a.var_ac_a.a(aa3.var_s_a.var_as_a.var_int_a >> 10, n5 << 5, 2);
                                                }
                                                this.var_boolean_b = true;
                                                int n7 = n5 << 15;
                                                n5 = 6;
                                                n5 = 200;
                                                n4 = n7;
                                                aa aa4 = this.var_aa_a;
                                                if ((n4 = (int)(((long)(aa4.var_int_arr_a[3] - n4) << 10) / (long)(aa4.var_int_arr_a[3] - aa4.var_int_arr_a[1]))) > 1024) {
                                                    n4 = 1024;
                                                }
                                                if (n4 > 0) {
                                                    n4 = (int)((long)-200 * (long)n4 >> 9);
                                                    aa4.a(new as(0, n4 -= aa4.var_s_a.var_as_a.b - aa4.var_s_a.var_as_b.b >> 6));
                                                }
                                            } else {
                                                this.var_boolean_b = false;
                                            }
                                            if (this.var_aa_b != null) {
                                                int n8;
                                                this.var_aa_b.var_s_a.var_as_a.var_int_a = n8 = this.var_aa_b.var_s_a.var_as_a.var_int_a + this.var_aa_a.var_s_a.var_as_a.var_int_a >> 1;
                                                this.var_aa_a.var_s_a.var_as_a.var_int_a = n8;
                                                n4 = this.var_aa_b.var_s_a.var_as_a.b - this.var_aa_a.var_s_a.var_as_a.b - this.var_int_b >> 1;
                                                this.var_aa_b.var_s_a.var_as_a.b -= n4;
                                                this.var_aa_a.var_s_a.var_as_a.b += n4;
                                            }
                                            if (this.var_ar_a.var_int_b == 93) {
                                                int n9 = 0;
                                                if (this.var_ar_a.var_ac_a.var_int_c <= 1) {
                                                    n9 = -f[this.var_byte_d] >> 2;
                                                    this.var_boolean_a = false;
                                                } else {
                                                    n9 = this.var_aa_a.var_s_a.var_as_a.var_int_a >> 15 >= 19 ? -f[this.var_byte_d] >> 2 : f[this.var_byte_d] << 1;
                                                    this.var_boolean_a = true;
                                                }
                                                this.var_aa_a.a(new as(n9, 0));
                                                if (this.var_byte_a != 3) {
                                                    this.a((byte)3);
                                                }
                                                if (this.var_aa_b.var_s_a.var_as_a.b >> 15 >= this.var_ar_a.var_int_e) {
                                                    ++this.var_ar_a.var_ac_a.var_int_c;
                                                    this.var_ar_a.var_ab_a.b(this.var_ar_a.var_ap_arr_a[0].var_am_a);
                                                    this.var_ar_a.var_ab_a.b(this.var_ar_a.var_ap_arr_a[1].var_am_a);
                                                    this.var_ar_a.var_ab_a.a(this.var_aa_a.var_s_a);
                                                    this.var_ar_a.var_ab_a.a(this.var_aa_b.var_s_a);
                                                    this.var_ar_a.var_ap_arr_a = null;
                                                    this.var_ar_a.var_ap_arr_a = new ap[0];
                                                    this.var_ar_a.var_t_arr_a = null;
                                                    this.var_ar_a.var_t_arr_a = new t[0];
                                                    this.var_ar_a.var_ai_arr_a = null;
                                                    this.var_ar_a.var_ai_arr_a = new ai[0];
                                                    this.var_ar_a.var_ac_a.g();
                                                    this.var_ar_a.var_ac_a.c(15);
                                                }
                                                return;
                                            }
                                            aa aa5 = this.var_aa_a;
                                            as2 = aa5.var_s_a.var_as_a;
                                            if (this.var_q_a != null) {
                                                if (this.var_q_a.boolean_a()) {
                                                    this.var_q_a = null;
                                                } else if (this.var_q_a.var_am_a.as_a().as_b(as2).d() > e[this.var_byte_d]) {
                                                    this.var_q_a = null;
                                                }
                                            }
                                            if (this.var_q_a == null) {
                                                for (int i2 = 0; i2 < this.var_ar_a.var_q_arr_a.length; ++i2) {
                                                    if (this.var_ar_a.var_q_arr_a[i2].boolean_a() || (n3 = this.var_ar_a.var_q_arr_a[i2].var_am_a.as_a().as_b(as2).d()) < 0 || n3 > e[this.var_byte_d] || this.var_q_a != null && n3 >= this.var_q_a.var_am_a.as_a().as_b(as2).d()) continue;
                                                    this.var_q_a = this.var_ar_a.var_q_arr_a[i2];
                                                }
                                            }
                                            if (this.var_q_a != null) {
                                                Object object = this.var_q_a.var_am_a.as_a().as_b(as2);
                                                if (this.var_byte_d == 4) {
                                                    if (this.var_ar_a.var_int_b == 107) {
                                                        if (this.var_ar_a.var_ac_a.var_int_c == 0) {
                                                            this.var_boolean_a = true;
                                                            return;
                                                        }
                                                        if (((as)object).d() > h[this.var_byte_d] / 2) {
                                                            ((as)object).int_b();
                                                            if (this.var_aa_a.var_int_b < f[this.var_byte_d]) {
                                                                this.var_aa_a.var_int_b += f[this.var_byte_d] / 30;
                                                            }
                                                            ((as)object).a(this.var_aa_a.var_int_b);
                                                            as2.void_a((as)object);
                                                            this.var_boolean_a = ((as)object).var_int_a >= 0;
                                                            object = this.var_aa_a;
                                                            this.var_aa_a.var_boolean_a = true;
                                                        }
                                                        if (this.var_ar_a.var_ac_a.var_int_c == 3) {
                                                            n3 = as2.var_int_a >> 15;
                                                            int n10 = as2.b >> 15;
                                                            boolean bl = false;
                                                            for (int i3 = n3 - 1; i3 <= n3 + 1; ++i3) {
                                                                for (int i4 = n10 - 1; i4 <= n10 + 1; ++i4) {
                                                                    if (i3 < 0 || i4 < 0 || i3 >= this.var_ar_a.var_int_d || i4 >= this.var_ar_a.var_int_e || this.var_ar_a.var_byte_arr_arr_arr_a[0][i3][i4] != 30) continue;
                                                                    bl = true;
                                                                }
                                                            }
                                                            if (bl) {
                                                                this.var_ar_a.var_ac_a.var_int_c = 4;
                                                                this.var_ar_a.var_ac_a.c(97);
                                                                return;
                                                            }
                                                        }
                                                        if (this.var_ar_a.var_ac_a.var_int_c == 4) {
                                                            this.var_ar_a.var_ac_a.var_int_c = 5;
                                                            this.b();
                                                        }
                                                        if (this.var_ar_a.var_ac_a.var_int_c != 1) {
                                                            return;
                                                        }
                                                    } else {
                                                        if (this.var_ar_a.var_ac_a.var_int_c == 0) {
                                                            this.var_boolean_a = true;
                                                            return;
                                                        }
                                                        if (this.var_ar_a.var_ac_a.var_int_c == 4) {
                                                            this.var_ar_a.var_ac_a.var_int_c = 5;
                                                            this.b();
                                                        }
                                                        if (((as)object).d() > h[this.var_byte_d] / 2) {
                                                            ((as)object).int_b();
                                                            if (this.var_aa_a.var_int_b < f[this.var_byte_d] / 2) {
                                                                this.var_aa_a.var_int_b += f[this.var_byte_d] / 60;
                                                            }
                                                            ((as)object).a(this.var_aa_a.var_int_b);
                                                            as2.void_a((as)object);
                                                            this.var_boolean_a = ((as)object).var_int_a >= 0;
                                                            object = this.var_aa_a;
                                                            this.var_aa_a.var_boolean_a = true;
                                                        }
                                                        if (this.var_ar_a.var_ac_a.var_int_c == 3 && y.b(this.var_ar_a.var_ac_a.var_int_arr_d, this.var_aa_a.a())) {
                                                            this.var_ar_a.var_ac_a.var_int_c = 4;
                                                            this.var_ar_a.var_ac_a.c(107);
                                                        }
                                                    }
                                                } else {
                                                    if (((as)object).var_int_a < -5120) {
                                                        this.var_boolean_a = false;
                                                    }
                                                    if (((as)object).var_int_a > 5120) {
                                                        this.var_boolean_a = true;
                                                    }
                                                    if (((as)object).d() > h[this.var_byte_d] && this.var_boolean_d && (this.var_boolean_b || (this.var_aa_a.var_s_a.var_int_b & 1) != 0)) {
                                                        n3 = 0;
                                                        n3 = (this.var_aa_a.var_s_a.var_int_b & 1) != 0 && this.var_boolean_b ? f[this.var_byte_d] >> 1 : (this.var_boolean_b ? f[this.var_byte_d] >> 4 : f[this.var_byte_d]);
                                                        this.var_aa_a.a(new as(this.var_boolean_a ? n3 : -n3, 0));
                                                    }
                                                }
                                            }
                                            if (this.var_byte_a != 4) break block102;
                                            if (this.var_q_a != null || this.var_byte_d == 2) break block103;
                                            this.a((byte)0);
                                            break block101;
                                        }
                                        if (this.var_q_a == null || this.var_q_a.var_am_a.as_a().as_b(as2).d() <= g[this.var_byte_d]) break block104;
                                        if (this.var_boolean_d) break block105;
                                        this.a((byte)0);
                                        break block101;
                                    }
                                    if ((this.var_byte_d == 2 || this.var_byte_d == 5) && this.var_ar_a.var_int_b != 189) {
                                        if (this.var_byte_b == var_int_arr_c[this.var_byte_d] && this.var_byte_c == 1) {
                                            int n11 = this.var_ar_a.var_ai_arr_a.length;
                                            for (n3 = 0; n3 < n11; ++n3) {
                                                ai ai2 = this.var_ar_a.var_ai_arr_a[n3];
                                                if (ai2.var_byte_a != 2 || ai2.var_byte_d != 0) continue;
                                                if (this.var_byte_d == 2) {
                                                    if (y.a(this.var_ar_a.var_ac_a.var_int_arr_d, this.int_arr_a())) {
                                                        this.var_ar_a.var_com_hardwire_blob_Main_a.a(11, false);
                                                    }
                                                    if (this.var_ar_a.var_byte_b == 2 && y.a(this.var_ar_a.var_int_arr_d, this.int_arr_a())) {
                                                        this.var_ar_a.var_java_util_Vector_a.addElement(new byte[]{13});
                                                    }
                                                    ai2.a((byte)0, as2.as_a(new as(0, -23552)), true);
                                                    ai2.var_int_a = 60;
                                                    ai2.var_aa_a.var_s_a.var_as_b.var_int_a = ai2.var_aa_a.var_s_a.var_as_a.var_int_a + ((this.var_boolean_a ? -1 : 1) * y.b(1, 2) << 10);
                                                    ai2.var_aa_a.var_s_a.var_as_b.b = ai2.var_aa_a.var_s_a.var_as_a.b + (y.b(2, 5) << 10);
                                                } else {
                                                    if (this.var_ar_a.var_int_b == 128 && n3 <= 1) continue;
                                                    this.a(n3);
                                                }
                                                break block101;
                                            }
                                        }
                                    } else if (this.var_byte_b == var_int_arr_c[this.var_byte_d] && this.var_byte_c == 1 && this.var_q_a.var_am_a.as_a().as_b(as2).d() <= h[this.var_byte_d]) {
                                        if (this.var_int_a == -1) {
                                            if (y.a(this.var_ar_a.var_ac_a.var_int_arr_d, this.int_arr_a())) {
                                                this.var_ar_a.var_com_hardwire_blob_Main_a.a(10, false);
                                            }
                                            if (this.var_ar_a.var_byte_b == 2 && y.a(this.var_ar_a.var_int_arr_d, this.int_arr_a())) {
                                                this.var_ar_a.var_java_util_Vector_a.addElement(new byte[]{12});
                                            }
                                        }
                                        if (this.var_byte_d == 4 && this.var_ar_a.var_int_b == 112) {
                                            this.var_q_a.b(var_int_arr_b[this.var_byte_d] >> 1);
                                        } else {
                                            this.var_q_a.b(var_int_arr_b[this.var_byte_d]);
                                        }
                                        if (this.var_byte_d == 4) {
                                            this.var_aa_a.var_int_b = 0;
                                        }
                                    }
                                    break block101;
                                }
                                if (this.var_byte_d != 5) break block106;
                                if (this.var_ar_a.var_int_b == 123 && this.var_ar_a.var_ac_a.var_int_c == 2 && y.b(this.var_ar_a.var_ac_a.var_int_arr_d, this.int_arr_a())) {
                                    this.b();
                                    return;
                                }
                                if (this.var_ar_a.var_int_b == 128 && this.var_ar_a.var_ac_a.var_int_c == 0) {
                                    for (int i5 = 0; i5 < this.var_ar_a.var_ai_arr_a.length - 1; ++i5) {
                                        this.a(i5);
                                    }
                                    this.var_ar_a.var_ac_a.var_int_c = 1;
                                }
                                if (this.var_byte_a == 0 && this.var_ar_a.var_ac_a.var_int_c == 1 && this.var_aa_a.var_int_b == 0 && this.var_int_c == 0) {
                                    this.a((byte)4);
                                }
                                if (this.var_byte_a == 0 && this.var_q_a != null && this.var_ar_a.var_int_b == 128) {
                                    int n12 = this.var_aa_a.var_s_a.var_as_a.var_int_a - this.var_q_a.var_am_a.as_a().var_int_a;
                                    if (n12 < 0) {
                                        n12 = -n12;
                                    }
                                    int n13 = n3 = n12 < 32768 ? 1 : 0;
                                    if (this.var_ar_a.var_ai_arr_a[0].boolean_a() && this.var_ar_a.var_ai_arr_a[1].boolean_a() && this.var_q_a.var_am_a.int_arr_a()[3] < this.var_aa_a.var_s_a.var_as_a.b - this.var_aa_a.var_int_a) {
                                        n3 = 0;
                                    }
                                    if (n3 != 0 && this.var_aa_a.var_int_b < 3) {
                                        if (++this.var_aa_a.var_int_b == 3) {
                                            this.var_ar_a.var_ab_a.b(this.var_aa_a.c);
                                        }
                                    } else if (n3 == 0 && this.var_aa_a.var_int_b > 0 && this.var_aa_a.var_int_b-- == 3) {
                                        this.var_ar_a.var_ab_a.a(this.var_aa_a);
                                    }
                                }
                                if (this.var_byte_a == 0 && this.var_ar_a.var_int_b == 128 && this.var_aa_a.var_int_b == 0 && this.var_ar_a.var_ai_arr_a[0].boolean_a() && this.var_ar_a.var_ai_arr_a[1].boolean_a() && this.var_q_a != null && this.var_q_a.var_am_a.as_a().b < this.var_aa_a.var_s_a.var_as_a.b + this.var_aa_a.var_int_a) {
                                    this.a((byte)6);
                                    this.var_ar_a.var_ac_a.c(150);
                                    this.var_q_a.var_byte_b = (byte)2;
                                }
                                break block101;
                            }
                            if (this.var_byte_d != 6) break block107;
                            int n14 = 32 * (this.var_int_c < 0 ? -this.var_int_c : this.var_int_c);
                            if (this.var_aa_a.var_int_b < n14) {
                                this.var_aa_a.var_int_b += 3;
                                if (this.var_aa_a.var_int_b > n14) {
                                    this.var_aa_a.var_int_b = n14;
                                }
                            }
                            if (this.var_q_a != null && y.a(this.var_q_a.var_am_a.int_arr_a(), this.int_arr_a())) {
                                this.var_q_a.b(var_int_arr_b[this.var_byte_d]);
                            }
                            break block101;
                        }
                        if (this.var_byte_d != 2 && (this.var_q_a == null || this.var_int_c != 0 || this.var_q_a.var_am_a.as_a().as_b(as2).d() > g[this.var_byte_d])) break block108;
                        this.a((byte)4);
                        break block101;
                    }
                    if (this.var_byte_a != 3) break block109;
                    int n15 = this.var_aa_a.var_s_a.var_as_a.var_int_a - this.var_aa_a.var_s_a.var_as_b.var_int_a;
                    if (n15 > -i[this.var_byte_d] && n15 < i[this.var_byte_d]) {
                        this.a((byte)0);
                    }
                    break block101;
                }
                if (!this.var_boolean_d || this.var_byte_a != 0 || (n2 = this.var_aa_a.var_s_a.var_as_a.var_int_a - this.var_aa_a.var_s_a.var_as_b.var_int_a) > -i[this.var_byte_d] && n2 < i[this.var_byte_d]) break block101;
            }
            this.a((byte)3);
        }
        if (this.var_byte_d != 6 && this.var_int_c > 0) {
            --this.var_int_c;
        }
        if (this.var_int_a != -1) {
            --this.var_int_a;
            if (this.var_int_a == 0) {
                this.b();
            }
        }
    }

    public final void b() {
        if (!this.boolean_a()) {
            if ((this.var_byte_d != 5 || this.var_ar_a.var_int_b == 128) && this.var_int_a == -1 && y.a(this.var_ar_a.var_ac_a.var_int_arr_d, this.int_arr_a())) {
                this.var_ar_a.var_com_hardwire_blob_Main_a.a(this.var_byte_d == 1 ? 8 : 4, false);
            }
            this.a((byte)1);
            this.var_q_a = null;
            if (this.var_byte_d != 4 && (this.var_byte_d != 5 || this.var_aa_a.var_int_b != 3)) {
                this.var_ar_a.var_ab_a.b(this.var_aa_a.c);
            }
            if (this.var_byte_d == 5 && this.var_ar_a.var_int_b == 128) {
                int n2 = this.var_aa_a.var_s_a.var_as_a.var_int_a >> 15;
                int n3 = this.var_aa_a.var_s_a.var_as_a.b >> 15;
                this.var_ar_a.var_byte_arr_arr_arr_a[1][n2][n3 + 2] = 69;
                this.var_ar_a.var_com_hardwire_blob_Main_a.void_a(n2, n3 + 2);
            }
            this.var_aa_a.var_aa_a = null;
            if (this.var_aa_b != null) {
                this.var_aa_b.var_aa_a = null;
            }
        }
    }

    static {
        var_int_arr_arr_a = new int[][]{{279, 280, 288, 293}, {218, 219, 230, 234, 227}, {238, -1, 239, 242, 248}, {251, -1, 256, 252, 304}, {297, 306}, {300}};
        var_int_arr_arr_b = new int[][]{{1, 8, 4, 4, 0}, {1, 8, 4, 4, 3}, {1, 0, 3, 6, 3}, {1, 0, 3, 4, 2}, {3, 2}, {4}};
        var_byte_arr_arr_a = new byte[][]{{1, 8, 4, 4, 0}, {1, 8, 4, 4, 0}, {1, 0, 3, 6, 3}, {8, 0, 3, 4, 0}, {4, 0, 12, 2, 0}, {4, 0, 10, 0, 0}};
        var_byte_arr_arr_b = new byte[][]{{0, 2, 2, 4, 0}, {0, 2, 4, 6, 0}, {0, 0, 4, 4, 0}, {2, 0, 4, 4, 0}, {4, 0, 2, 0, 0}, {4, 0, 2, 0, 0}};
        var_int_arr_c = new int[]{3, 1, 4, -1, 2, 1, 1};
        var_int_arr_a = new int[]{0, 1, 2, -1, 3, 4, 5};
        e = new int[]{0x3200000, 1048576000, 1048576000, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        f = new int[]{500, 400, 250, 0, 2764, 0, 0};
        g = new int[]{0x300000, 0x280000, Integer.MAX_VALUE, -1, 0x500000, Integer.MAX_VALUE, 0x300000};
        h = new int[]{0x1E6666, 0x280000, 0, -1, 0x600000, -1, 0x300000};
        i = new int[]{500, 300, 200, 0, 0, 0, 0};
        var_int_arr_b = new int[]{10240, 20480, 0, -1, 5120, 512, 512};
        j = new int[]{3072, 3072, 0, -1, 0};
    }
}


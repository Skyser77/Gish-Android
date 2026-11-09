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

public final class ac {
    private Main var_com_hardwire_blob_Main_a;
    private ar var_ar_a;
    private ad var_ad_a;
    private d var_d_a;
    public static final int[] var_int_arr_a;
    public static final int[] var_int_arr_b;
    public static final int[] var_int_arr_c;
    public static short[] var_short_arr_a;
    private static final short[] var_short_arr_b;
    private static final boolean[] var_boolean_arr_a;
    private static final boolean[] var_boolean_arr_b;
    public int var_int_a = -1;
    public int var_int_b;
    private static int k;
    private static int l;
    public int[] var_int_arr_d;
    public int var_int_c;
    private int m;
    private int[][] var_int_arr_arr_a;
    private int n;
    private int o;
    private int[][] var_int_arr_arr_b;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    public int var_int_d;
    public boolean var_boolean_a;
    private int u;
    private int v;
    private byte[][] var_byte_arr_arr_a;
    public int var_int_e;
    public int var_int_f;
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private boolean var_boolean_d;
    public boolean var_boolean_b = true;
    public boolean var_boolean_c = true;
    public int g = 2;
    public int h;
    private int[] var_int_arr_f = new int[]{15, 10, 0};
    private int C;
    private int D;
    private int[][] var_int_arr_arr_c;
    private int[][] var_int_arr_arr_d;
    private int E;
    private as var_as_a;
    private int F;
    private int G;
    public Image[] var_javax_microedition_lcdui_Image_arr_a;
    private Image[] var_javax_microedition_lcdui_Image_arr_b;
    public int i;
    public int j;
    public static byte[][][][] var_byte_arr_arr_arr_arr_a;
    public static int[] var_int_arr_e;

    public ac(Main main, ar ar2) {
        this.var_com_hardwire_blob_Main_a = main;
        this.var_ar_a = ar2;
        this.var_ad_a = this.var_com_hardwire_blob_Main_a.var_ad_a;
        this.var_d_a = this.var_com_hardwire_blob_Main_a.var_d_a;
    }

    public final void a() {
        Image image = this.var_ad_a.javax_microedition_lcdui_Image_a(471);
        this.var_javax_microedition_lcdui_Image_arr_b = new Image[4];
        this.var_javax_microedition_lcdui_Image_arr_b[0] = image;
        this.var_javax_microedition_lcdui_Image_arr_b[1] = Image.createImage((Image)image, (int)0, (int)0, (int)image.getWidth(), (int)image.getHeight(), (int)5);
        this.var_javax_microedition_lcdui_Image_arr_b[2] = Image.createImage((Image)image, (int)0, (int)0, (int)image.getWidth(), (int)image.getHeight(), (int)3);
        this.var_javax_microedition_lcdui_Image_arr_b[3] = Image.createImage((Image)image, (int)0, (int)0, (int)image.getWidth(), (int)image.getHeight(), (int)6);
    }

    private void b(Graphics graphics) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        boolean bl = this.var_ar_a.var_int_b == 93;
        if (bl) {
            graphics.setColor(20, 26, 72);
            graphics.fillRect(0, 0, ad.var_int_a, ad.var_int_b);
            n17 = this.var_int_arr_arr_d.length;
            n16 = (this.var_int_d / 42 & 1) == 0 ? 1 : 0;
            for (n15 = 0; n15 < n17; ++n15) {
                n14 = this.var_int_arr_arr_d[n15][0];
                n13 = this.var_int_arr_arr_d[n15][1];
                n12 = this.var_int_arr_arr_d[n15][2];
                if (n16 != 0 && n12 == 0) {
                    n12 = 1;
                } else if (n16 != 0 && n12 == 1) {
                    n12 = 0;
                }
                if (n12 == 0) {
                    graphics.setColor(71, 78, 131);
                    graphics.fillRect(n14, n13, 1, 1);
                    continue;
                }
                if (n12 == 1) {
                    graphics.setColor(139, 145, 189);
                    graphics.fillRect(n14, n13, 1, 1);
                    continue;
                }
                n11 = (this.var_int_d & 0x3F) >= 0 && (this.var_int_d & 0x3F) <= 1 || (this.var_int_d & 0x3F) >= 12 && (this.var_int_d & 0x3F) <= 13 ? 1 : ((this.var_int_d & 0x3F) >= 2 && (this.var_int_d & 0x3F) <= 11 ? 2 : 0);
                graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(n11 + 73), n14, n13, 3);
            }
        } else {
            graphics.setColor(this.var_int_a == 2 ? 2949124 : (this.var_int_a == 1 ? 2499085 : 5140));
            graphics.fillRect(0, 0, ad.var_int_a, ad.var_int_b);
        }
        ++this.var_int_d;
        if ((this.var_int_d & 1) == 0) {
            ++this.r;
            if (this.r == 4) {
                this.r = 0;
            }
        }
        if ((this.var_int_d & 1) == 0) {
            ++this.s;
            if (this.s == 4) {
                this.s = 0;
            }
        }
        if ((this.var_int_d & 3) == 0) {
            ++this.t;
            if (this.t == 2) {
                this.t = 0;
            }
        }
        graphics.translate(-k, -l);
        n16 = this.var_int_arr_d[0] >> 15;
        n15 = this.var_int_arr_d[1] >> 15;
        n14 = this.var_int_arr_d[2] >> 15;
        n13 = this.var_int_arr_d[3] >> 15;
        if ((this.var_int_arr_d[2] >> 10 & 0x1F) != 0) {
            ++n14;
        }
        if ((this.var_int_arr_d[3] >> 10 & 0x1F) != 0) {
            ++n13;
        }
        n16 = n16 < 0 ? 0 : n16;
        n15 = n15 < 0 ? 0 : n15;
        n14 = n14 < this.var_ar_a.var_int_d ? n14 : this.var_ar_a.var_int_d;
        int n18 = n13 = n13 < this.var_ar_a.var_int_e ? n13 : this.var_ar_a.var_int_e;
        if (this.g > 1) {
            n12 = Integer.MAX_VALUE;
            n11 = Integer.MAX_VALUE;
            n10 = Integer.MIN_VALUE;
            n9 = Integer.MIN_VALUE;
            byte[][] byArray = this.var_ar_a.var_byte_arr_arr_arr_a[0];
            for (n8 = n16; n8 < n14; ++n8) {
                for (int i2 = n15; i2 < n13; ++i2) {
                    byte by = byArray[n8][i2];
                    if (by == -1 || !var_boolean_arr_b[by]) continue;
                    if (n8 < n12) {
                        n12 = n8;
                    }
                    if (n8 > n10) {
                        n10 = n8;
                    }
                    if (i2 < n11) {
                        n11 = i2;
                    }
                    if (i2 <= n9) continue;
                    n9 = i2;
                }
            }
            if (n12 != Integer.MAX_VALUE) {
                n12 = ((n12 << 5) - k >> 6 << 6) + k;
                n11 = ((n11 << 5) - l >> 6 << 6) + l;
                if (n12 < k) {
                    n12 = k;
                }
                if (n11 < l) {
                    n11 = l;
                }
                n10 = n10 + 1 << 5;
                n9 = n9 + 1 << 5;
                Image image = this.var_ad_a.javax_microedition_lcdui_Image_a(468 + this.var_int_a);
                int[] nArray = new int[]{64, 64, 64};
                int[] nArray2 = new int[]{64, 64, 32};
                for (n7 = n12; n7 < n10; n7 += nArray[this.var_int_a]) {
                    for (n6 = n11; n6 < n9; n6 += nArray2[this.var_int_a]) {
                        graphics.drawImage(image, n7, n6, 0);
                    }
                }
            }
        }
        if (this.g > 0) {
            byte[][] byArray = this.var_ar_a.var_byte_arr_arr_arr_a[0];
            for (n11 = n16; n11 < n14; ++n11) {
                for (n10 = n15; n10 < n13; ++n10) {
                    n9 = byArray[n11][n10];
                    boolean bl2 = false;
                    if (n9 == 8) {
                        n9 = 5;
                        bl2 = true;
                    } else if (n9 == 9) {
                        n9 = 0;
                        bl2 = true;
                    }
                    if (n9 == 30) {
                        graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(272 + (this.var_int_d & 3)), n11 << 5, n10 << 5, 0);
                    } else if (n9 == 36) {
                        graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(564 + (this.var_int_d & 3)), n11 << 5, n10 << 5, 0);
                    } else if (n9 != -1 && n9 != 11 && n9 != 51) {
                        graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(var_int_arr_a[0] + n9), n11 << 5, n10 << 5, 0);
                    }
                    if (!bl2) continue;
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(var_int_arr_a[0] + 8 + this.t), (n11 << 5) + 1, n10 + 1 << 5, 36);
                }
            }
        }
        if (this.g > 0) {
            n17 = this.var_ar_a.var_bb_arr_a.length;
            for (int i3 = 0; i3 < n17; ++i3) {
                bb bb2;
                bb bb3 = bb2 = this.var_ar_a.var_bb_arr_a[i3];
                if (!y.a(this.var_int_arr_d, bb3.var_int_arr_a)) continue;
                bb3 = graphics;
                bb3.drawImage(bb2.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(bb2.boolean_a() ? 78 : 77), (bb2.var_short_a - 1 << 5) + 3, bb2.var_short_b - 1 << 5, 20);
            }
        }
        n17 = this.var_ar_a.var_ap_arr_a.length;
        for (n5 = 0; n5 < n17; ++n5) {
            int n19;
            int n20;
            ap ap2 = this.var_ar_a.var_ap_arr_a[n5];
            if (ap2.var_byte_a == 2 || !y.a(this.var_int_arr_d, ap2.var_am_a.int_arr_a())) continue;
            Graphics graphics2 = graphics;
            if (ap2.var_byte_a != 0) continue;
            Object object = ap2.var_am_a;
            if (((am)object).var_s_arr_b != null) {
                boolean bl3 = false;
                for (n8 = 0; n8 < ((am)object).var_s_arr_a.length; ++n8) {
                    int n21 = (((am)object).var_s_arr_a[n8].var_as_a.var_int_a >> 10) - (((am)object).var_s_arr_b[n8].var_as_a.var_int_a >> 10);
                    int n22 = (((am)object).var_s_arr_a[n8].var_as_a.b >> 10) - (((am)object).var_s_arr_b[n8].var_as_a.b >> 10);
                    if (n21 >= -1 && n21 <= 1 && n22 >= -1 && n22 <= 1) continue;
                    bl3 = true;
                    break;
                }
                if (bl3) {
                    for (n8 = 0; n8 < ((am)object).var_s_arr_a.length; ++n8) {
                        ((am)object).var_s_arr_b[n8].var_as_a.var_int_a = ((am)object).var_s_arr_a[n8].var_as_a.var_int_a;
                        ((am)object).var_s_arr_b[n8].var_as_a.b = ((am)object).var_s_arr_a[n8].var_as_a.b;
                    }
                }
            }
            if (ap2.var_byte_b == 5) {
                ap.var_af_arr_a[ap2.var_byte_c].a(ap2.var_am_a.s_arr_a(), null);
                ap.var_af_arr_a[ap2.var_byte_c].a(graphics2, 0);
                ap2.var_am_a.a(graphics2, as.var_as_a, 3612695);
                object = ap2.var_am_a.as_a();
                if (ap2.var_int_a == -1) {
                    graphics2.drawImage(ap2.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(140), ((as)object).var_int_a >> 10, (((as)object).b >> 10) - 2, 3);
                    if ((ap2.var_ar_a.var_ac_a.var_int_d & 7) != 0 || y.b(0, 3) != 0) continue;
                    ap2.var_int_a = 0;
                    continue;
                }
                if (ap2.var_int_a != 1) {
                    graphics2.drawImage(ap2.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(141), ((as)object).var_int_a >> 10, (((as)object).b >> 10) - 2, 3);
                }
                ++ap2.var_int_a;
                if (ap2.var_int_a != 3) continue;
                ap2.var_int_a = -1;
                continue;
            }
            int n23 = ap2.var_byte_c == 2 ? -14408668 : (n20 = ap2.var_byte_c == 4 ? -12630984 : -12699344);
            int n24 = ap2.var_byte_c == 2 ? -14009814 : (ap2.var_byte_c == 4 ? -11117743 : -14212321);
            ap.var_af_arr_a[ap2.var_byte_c].a(ap2.var_am_a.s_arr_a(), null);
            ap.var_af_arr_a[ap2.var_byte_c].a(graphics2, n20);
            s[] sArray = ap2.var_am_a.s_arr_a();
            n8 = sArray.length;
            if (ap.var_int_arr_arr_a == null || ap.var_int_arr_arr_a.length < n8) {
                ap.var_int_arr_arr_a = new int[n8][2];
            }
            for (n19 = 0; n19 < n8; ++n19) {
                ap.var_int_arr_arr_a[n19][0] = sArray[n19].var_as_a.var_int_a >> 10;
                ap.var_int_arr_arr_a[n19][1] = sArray[n19].var_as_a.b >> 10;
            }
            graphics2.setColor(n24);
            n19 = 0;
            int n25 = n8 - 1;
            while (n19 < n8) {
                graphics2.drawLine(ap.var_int_arr_arr_a[n19][0], ap.var_int_arr_arr_a[n19][1], ap.var_int_arr_arr_a[n25][0], ap.var_int_arr_arr_a[n25][1]);
                n25 = n19++;
            }
            if (ap2.var_ar_a.var_ac_a.g > 1) {
                if (ap2.var_byte_c == 0 || ap2.var_byte_c == 2) {
                    graphics2.setColor(3026983);
                    graphics2.drawLine(ap.var_int_arr_arr_a[0][0] + (ap.var_int_arr_arr_a[1][0] - ap.var_int_arr_arr_a[0][0] >> 2), ap.var_int_arr_arr_a[0][1] + (ap.var_int_arr_arr_a[1][1] - ap.var_int_arr_arr_a[0][1] >> 2), ap.var_int_arr_arr_a[3][0] - (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[2][0] >> 2), ap.var_int_arr_arr_a[3][1] - (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[2][1] >> 2));
                    graphics2.drawLine(ap.var_int_arr_arr_a[1][0] - (ap.var_int_arr_arr_a[1][0] - ap.var_int_arr_arr_a[0][0] >> 2), ap.var_int_arr_arr_a[1][1] - (ap.var_int_arr_arr_a[1][1] - ap.var_int_arr_arr_a[0][1] >> 2), ap.var_int_arr_arr_a[2][0] + (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[2][0] >> 2), ap.var_int_arr_arr_a[2][1] + (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[2][1] >> 2));
                    graphics2.drawLine(ap.var_int_arr_arr_a[0][0] + (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[0][0] >> 2), ap.var_int_arr_arr_a[0][1] + (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[0][1] >> 2), ap.var_int_arr_arr_a[1][0] + (ap.var_int_arr_arr_a[2][0] - ap.var_int_arr_arr_a[1][0] >> 2), ap.var_int_arr_arr_a[1][1] + (ap.var_int_arr_arr_a[2][1] - ap.var_int_arr_arr_a[1][1] >> 2));
                    graphics2.drawLine(ap.var_int_arr_arr_a[3][0] - (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[0][0] >> 2), ap.var_int_arr_arr_a[3][1] - (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[0][1] >> 2), ap.var_int_arr_arr_a[2][0] - (ap.var_int_arr_arr_a[2][0] - ap.var_int_arr_arr_a[1][0] >> 2), ap.var_int_arr_arr_a[2][1] - (ap.var_int_arr_arr_a[2][1] - ap.var_int_arr_arr_a[1][1] >> 2));
                    graphics2.setColor(ap2.var_byte_c == 2 ? 0x2A3A2A : 2564895);
                    graphics2.drawLine(ap.var_int_arr_arr_a[0][0] + ap.var_int_arr_arr_a[1][0] >> 1, ap.var_int_arr_arr_a[0][1] + ap.var_int_arr_arr_a[1][1] >> 1, ap.var_int_arr_arr_a[2][0] + ap.var_int_arr_arr_a[3][0] >> 1, ap.var_int_arr_arr_a[2][1] + ap.var_int_arr_arr_a[3][1] >> 1);
                    graphics2.drawLine(ap.var_int_arr_arr_a[0][0] + ap.var_int_arr_arr_a[3][0] >> 1, ap.var_int_arr_arr_a[0][1] + ap.var_int_arr_arr_a[3][1] >> 1, ap.var_int_arr_arr_a[2][0] + ap.var_int_arr_arr_a[1][0] >> 1, ap.var_int_arr_arr_a[2][1] + ap.var_int_arr_arr_a[1][1] >> 1);
                } else if (ap2.var_byte_c == 1) {
                    graphics2.setColor(3026983);
                    graphics2.drawLine(ap.var_int_arr_arr_a[0][0] + (ap.var_int_arr_arr_a[1][0] - ap.var_int_arr_arr_a[0][0] >> 3), ap.var_int_arr_arr_a[0][1] + (ap.var_int_arr_arr_a[1][1] - ap.var_int_arr_arr_a[0][1] >> 3), ap.var_int_arr_arr_a[3][0] - (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[2][0] >> 3), ap.var_int_arr_arr_a[3][1] - (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[2][1] >> 3));
                    graphics2.drawLine(ap.var_int_arr_arr_a[1][0] - (ap.var_int_arr_arr_a[1][0] - ap.var_int_arr_arr_a[0][0] >> 3), ap.var_int_arr_arr_a[1][1] - (ap.var_int_arr_arr_a[1][1] - ap.var_int_arr_arr_a[0][1] >> 3), ap.var_int_arr_arr_a[2][0] + (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[2][0] >> 3), ap.var_int_arr_arr_a[2][1] + (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[2][1] >> 3));
                    graphics2.drawLine((ap.var_int_arr_arr_a[0][0] + ap.var_int_arr_arr_a[1][0] >> 1) + (ap.var_int_arr_arr_a[1][0] - ap.var_int_arr_arr_a[0][0] >> 3), (ap.var_int_arr_arr_a[0][1] + ap.var_int_arr_arr_a[1][1] >> 1) + (ap.var_int_arr_arr_a[1][1] - ap.var_int_arr_arr_a[0][1] >> 3), (ap.var_int_arr_arr_a[2][0] + ap.var_int_arr_arr_a[3][0] >> 1) - (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[2][0] >> 3), (ap.var_int_arr_arr_a[2][1] + ap.var_int_arr_arr_a[3][1] >> 1) - (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[2][1] >> 3));
                    graphics2.drawLine((ap.var_int_arr_arr_a[0][0] + ap.var_int_arr_arr_a[1][0] >> 1) - (ap.var_int_arr_arr_a[1][0] - ap.var_int_arr_arr_a[0][0] >> 3), (ap.var_int_arr_arr_a[0][1] + ap.var_int_arr_arr_a[1][1] >> 1) - (ap.var_int_arr_arr_a[1][1] - ap.var_int_arr_arr_a[0][1] >> 3), (ap.var_int_arr_arr_a[2][0] + ap.var_int_arr_arr_a[3][0] >> 1) + (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[2][0] >> 3), (ap.var_int_arr_arr_a[2][1] + ap.var_int_arr_arr_a[3][1] >> 1) + (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[2][1] >> 3));
                    graphics2.drawLine(ap.var_int_arr_arr_a[0][0] + (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[0][0] >> 2), ap.var_int_arr_arr_a[0][1] + (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[0][1] >> 2), ap.var_int_arr_arr_a[1][0] + (ap.var_int_arr_arr_a[2][0] - ap.var_int_arr_arr_a[1][0] >> 2), ap.var_int_arr_arr_a[1][1] + (ap.var_int_arr_arr_a[2][1] - ap.var_int_arr_arr_a[1][1] >> 2));
                    graphics2.drawLine(ap.var_int_arr_arr_a[3][0] - (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[0][0] >> 2), ap.var_int_arr_arr_a[3][1] - (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[0][1] >> 2), ap.var_int_arr_arr_a[2][0] - (ap.var_int_arr_arr_a[2][0] - ap.var_int_arr_arr_a[1][0] >> 2), ap.var_int_arr_arr_a[2][1] - (ap.var_int_arr_arr_a[2][1] - ap.var_int_arr_arr_a[1][1] >> 2));
                    graphics2.setColor(2564895);
                    graphics2.drawLine(ap.var_int_arr_arr_a[0][0] + ap.var_int_arr_arr_a[1][0] >> 1, ap.var_int_arr_arr_a[0][1] + ap.var_int_arr_arr_a[1][1] >> 1, ap.var_int_arr_arr_a[2][0] + ap.var_int_arr_arr_a[3][0] >> 1, ap.var_int_arr_arr_a[2][1] + ap.var_int_arr_arr_a[3][1] >> 1);
                    graphics2.drawLine(ap.var_int_arr_arr_a[0][0] + ap.var_int_arr_arr_a[3][0] >> 1, ap.var_int_arr_arr_a[0][1] + ap.var_int_arr_arr_a[3][1] >> 1, ap.var_int_arr_arr_a[2][0] + ap.var_int_arr_arr_a[1][0] >> 1, ap.var_int_arr_arr_a[2][1] + ap.var_int_arr_arr_a[1][1] >> 1);
                    graphics2.drawLine(ap.var_int_arr_arr_a[0][0] + (ap.var_int_arr_arr_a[1][0] - ap.var_int_arr_arr_a[0][0] >> 2), ap.var_int_arr_arr_a[0][1] + (ap.var_int_arr_arr_a[1][1] - ap.var_int_arr_arr_a[0][1] >> 2), ap.var_int_arr_arr_a[3][0] - (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[2][0] >> 2), ap.var_int_arr_arr_a[3][1] - (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[2][1] >> 2));
                    graphics2.drawLine(ap.var_int_arr_arr_a[1][0] - (ap.var_int_arr_arr_a[1][0] - ap.var_int_arr_arr_a[0][0] >> 2), ap.var_int_arr_arr_a[1][1] - (ap.var_int_arr_arr_a[1][1] - ap.var_int_arr_arr_a[0][1] >> 2), ap.var_int_arr_arr_a[2][0] + (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[2][0] >> 2), ap.var_int_arr_arr_a[2][1] + (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[2][1] >> 2));
                } else if (ap2.var_byte_c == 4) {
                    graphics2.setColor(-11117743);
                    graphics2.drawLine(ap.var_int_arr_arr_a[0][0] + (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[0][0] >> 2), ap.var_int_arr_arr_a[0][1] + (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[0][1] >> 2), ap.var_int_arr_arr_a[1][0] + (ap.var_int_arr_arr_a[2][0] - ap.var_int_arr_arr_a[1][0] >> 2), ap.var_int_arr_arr_a[1][1] + (ap.var_int_arr_arr_a[2][1] - ap.var_int_arr_arr_a[1][1] >> 2));
                    graphics2.drawLine(ap.var_int_arr_arr_a[3][0] - (ap.var_int_arr_arr_a[3][0] - ap.var_int_arr_arr_a[0][0] >> 2), ap.var_int_arr_arr_a[3][1] - (ap.var_int_arr_arr_a[3][1] - ap.var_int_arr_arr_a[0][1] >> 2), ap.var_int_arr_arr_a[2][0] - (ap.var_int_arr_arr_a[2][0] - ap.var_int_arr_arr_a[1][0] >> 2), ap.var_int_arr_arr_a[2][1] - (ap.var_int_arr_arr_a[2][1] - ap.var_int_arr_arr_a[1][1] >> 2));
                    graphics2.drawLine(ap.var_int_arr_arr_a[0][0] + ap.var_int_arr_arr_a[3][0] >> 1, ap.var_int_arr_arr_a[0][1] + ap.var_int_arr_arr_a[3][1] >> 1, ap.var_int_arr_arr_a[2][0] + ap.var_int_arr_arr_a[1][0] >> 1, ap.var_int_arr_arr_a[2][1] + ap.var_int_arr_arr_a[1][1] >> 1);
                }
            }
            if (ap2.var_byte_b != 2 && ap2.var_byte_b != 8 && ap2.var_byte_b != 11) continue;
            graphics2.setColor(2564895);
            as as2 = ap2.var_am_a.as_a();
            graphics2.fillArc((as2.var_int_a >> 10) - 4, (as2.b >> 10) - 4, 8, 8, 0, 360);
        }
        n17 = this.var_ar_a.var_q_arr_a.length;
        for (n5 = 0; n5 < n17; ++n5) {
            q q2 = this.var_ar_a.var_q_arr_a[n5];
            if (!y.a(this.var_int_arr_d, q2.var_am_a.int_arr_a())) continue;
            q2.a(graphics);
        }
        n17 = this.var_ar_a.var_bb_arr_a.length;
        for (n5 = 0; n5 < n17; ++n5) {
            bb bb4;
            bb bb5 = bb4 = this.var_ar_a.var_bb_arr_a[n5];
            if (!y.a(this.var_int_arr_d, bb5.var_int_arr_a)) continue;
            bb5 = graphics;
            if (bb4.var_ar_a.var_byte_arr_arr_a[bb4.var_short_a][bb4.var_short_b] == -1) continue;
            n9 = bb4.var_short_a << 5;
            int n26 = bb4.var_short_b << 5;
            bb5.drawImage(bb4.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(79), n9, n26 - bb4.c, 0);
            boolean bl4 = bb4.var_boolean_b;
            n9 = bl4 ? 1 : 0;
            if (!bl4 && bb4.c < 5) {
                bb4.c = (byte)(bb4.c + 1);
                continue;
            }
            if (n9 == 0 || bb4.c <= 0) continue;
            bb4.c = (byte)(bb4.c - 1);
        }
        n17 = this.var_ar_a.var_ai_arr_a.length;
        for (n5 = 0; n5 < n17; ++n5) {
            ai ai2 = this.var_ar_a.var_ai_arr_a[n5];
            if (ai2.var_byte_d != 5 && ai2.var_byte_d != 6 || ai2.var_byte_a == 2 || !y.a(this.var_int_arr_d, ai2.int_arr_a())) continue;
            ai2.a(graphics);
        }
        if (this.g > 1) {
            int n27 = 0;
            if ((this.var_int_d & 3) == 0) {
                n5 = 4;
                n27 = 2;
            } else if ((this.var_int_d & 3) == 2) {
                n5 = 2;
                n27 = 4;
            } else {
                n5 = 3;
                n27 = 3;
            }
            n10 = this.C;
            while (n10 != this.D) {
                int[] nArray = this.var_int_arr_arr_c[n10];
                int n28 = nArray[4];
                graphics.setColor(n28 == 0 ? -8754086 : (n28 == 1 ? -4605658 : -5593722));
                graphics.fillRect(nArray[0] >> 10, nArray[1] >> 10, n5, n27);
                nArray[0] = nArray[0] + nArray[2];
                nArray[1] = nArray[1] + nArray[3];
                n8 = 0;
                if (n28 == 2) {
                    byte by = this.var_ar_a.var_byte_arr_arr_arr_a[2][nArray[0] >> 15][nArray[1] >> 15];
                    if (by != 6 && by != 7 && by != 18) {
                        n8 = 1;
                    }
                } else {
                    nArray[3] = nArray[3] + 1024;
                    nArray[5] = nArray[5] + 1;
                    if (nArray[5] >= this.var_int_arr_f[nArray[4]]) {
                        n8 = 1;
                    }
                }
                if (n8 != 0) {
                    if (n10 != this.C) {
                        this.var_int_arr_arr_c[n10] = this.var_int_arr_arr_c[this.C];
                        this.var_int_arr_arr_c[this.C] = nArray;
                    }
                    ++this.C;
                    if (this.C == 25) {
                        this.C = 0;
                    }
                }
                n10 = ++n10 == 25 ? 0 : n10;
            }
        }
        n17 = this.var_ar_a.var_k_arr_a.length;
        block39: for (n5 = 0; n5 < n17; ++n5) {
            k k2 = this.var_ar_a.var_k_arr_a[n5];
            if (!y.a(this.var_int_arr_d, k2.var_au_a.a())) continue;
            Graphics graphics3 = graphics;
            switch (k2.var_byte_b) {
                case 0: {
                    for (n9 = 0; n9 < 3; ++n9) {
                        graphics3.drawImage(k2.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(235), (k2.var_au_a.var_as_a.var_int_a >> 10) + n9 * 32, k2.var_au_a.var_as_a.b >> 10, 0);
                    }
                    continue block39;
                }
                case 1: {
                    for (n9 = 0; n9 < 3; ++n9) {
                        graphics3.drawImage(k2.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(235), k2.var_au_a.var_as_a.var_int_a >> 10, (k2.var_au_a.var_as_a.b >> 10) + n9 * 32, 0);
                    }
                    continue block39;
                }
                case 2: {
                    for (n9 = 0; n9 < 2; ++n9) {
                        graphics3.drawImage(k2.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(235), (k2.var_au_a.var_as_a.var_int_a >> 10) + n9 * 32, k2.var_au_a.var_as_a.b >> 10, 0);
                    }
                    continue block39;
                }
                case 3: {
                    for (n9 = 0; n9 < 8; ++n9) {
                        graphics3.drawImage(k2.var_ar_a.var_ad_a.javax_microedition_lcdui_Image_a(235), k2.var_au_a.var_as_a.var_int_a >> 10, (k2.var_au_a.var_as_a.b >> 10) + n9 * 32, 0);
                    }
                    continue block39;
                }
            }
        }
        byte[][] byArray = this.var_ar_a.var_byte_arr_arr_arr_a[1];
        for (int i4 = n16; i4 < n14; ++i4) {
            for (n10 = n15; n10 < n13; ++n10) {
                n9 = byArray[i4][n10];
                if (n9 == -1 || n9 == 13 || n9 == 43) continue;
                if (n9 == 8) {
                    int n29 = this.r > 2 ? 4 - this.r : this.r;
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(46), (i4 << 5) + 16, (n10 << 5) + 16 + n29, 3);
                    continue;
                }
                if (n9 == 9) {
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(this.s == 0 ? 47 : (this.s <= 2 ? 50 - this.s : 49)), (i4 << 5) + 16, (n10 << 5) + 16, 3);
                    continue;
                }
                if (n9 == 70) {
                    int n30 = this.var_int_d & 7;
                    n30 = -2 + (n30 > 4 ? 8 - n30 : n30);
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(var_int_arr_a[1] + n9), (i4 << 5) + 16, (n10 << 5) + 16 + n30, 3);
                    continue;
                }
                if (n9 == 69) continue;
                graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(var_int_arr_a[1] + n9), i4 << 5, n10 << 5, 0);
            }
        }
        n17 = this.var_ar_a.var_ai_arr_a.length;
        for (n4 = 0; n4 < n17; ++n4) {
            ai ai3 = this.var_ar_a.var_ai_arr_a[n4];
            if (ai3.var_byte_a == 2 || ai3.var_byte_d >= 4 || !y.a(this.var_int_arr_d, ai3.int_arr_a())) continue;
            ai3.a(graphics);
        }
        n4 = this.p;
        while (n4 != this.q) {
            int[] nArray = this.var_int_arr_arr_b[n4];
            switch (nArray[3]) {
                case 0: {
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(150 + nArray[2]), nArray[0], nArray[1], 3);
                    break;
                }
                case 1: {
                    Image image = this.var_ad_a.javax_microedition_lcdui_Image_a(150 + nArray[2]);
                    n9 = nArray[0];
                    int n31 = nArray[1];
                    graphics.drawImage(image, n9, n31, 40);
                    graphics.drawImage(image, n9, n31, 24);
                    graphics.drawImage(image, n9, n31, 36);
                    graphics.drawImage(image, n9, n31, 20);
                    break;
                }
                case 2: {
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(464 + nArray[2]), nArray[0], nArray[1], 33);
                    break;
                }
                case 4: {
                    n8 = nArray[2];
                    if (n8 >= 3) break;
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(n8 + 130), nArray[0], nArray[1], 3);
                    break;
                }
                case 5: {
                    n8 = nArray[2];
                    if (n8 >= 3) break;
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(n8 + 134), nArray[0], nArray[1], 3);
                }
            }
            if ((this.var_int_d & 1) == 0 && (nArray[2] = nArray[2] + 1) == 4) {
                ++this.p;
                if (this.p == 10) {
                    this.p = 0;
                }
            }
            n4 = ++n4 == 10 ? 0 : n4;
        }
        if (this.var_ar_a.var_int_b == 112 && this.var_int_c < 3) {
            boolean bl5 = false;
            n10 = 0;
            int[] nArray = new int[]{0, 3, 0, 2, 3, 0, 3, 1, 2};
            for (int i5 = 0; i5 < nArray.length; ++i5) {
                n8 = (this.var_int_d >> 1) + nArray[i5] & 3;
                graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(n8 + 531), 648 + i5 * 80 / (nArray.length - 1), 670 - (n8 << 1), 3);
            }
        }
        graphics.setColor(180, 123, 42);
        int[] nArray = new int[4];
        n17 = this.var_ar_a.var_t_arr_a.length;
        for (n3 = 0; n3 < n17; ++n3) {
            int n32;
            t t2 = this.var_ar_a.var_t_arr_a[n3];
            if (t2 == null) continue;
            int n33 = t2.var_s_a.var_as_a.var_int_a;
            int n34 = t2.var_s_a.var_as_a.b + (bl ? this.var_ar_a.var_ai_arr_a[0].var_aa_b.var_int_a : 0);
            if (t2.var_s_b == null) {
                n8 = t2.var_as_a.var_int_a;
                n32 = t2.var_as_a.b;
            } else {
                n8 = t2.var_s_b.var_as_a.var_int_a;
                n32 = t2.var_s_b.var_as_a.b;
            }
            if (n33 < n8) {
                nArray[0] = n33;
                nArray[2] = n8;
            } else {
                nArray[0] = n8;
                nArray[2] = n33;
            }
            if (n34 < n32) {
                nArray[1] = n34;
                nArray[3] = n32;
            } else {
                nArray[1] = n32;
                nArray[3] = n34;
            }
            if (!y.a(this.var_int_arr_d, nArray)) continue;
            if (this.g > 1) {
                as as3 = new as(n8 - n33, n32 - n34);
                n7 = as3.int_a() + 1647099;
                n6 = (as3.c() / this.var_javax_microedition_lcdui_Image_arr_a[0].getWidth() >> 10) + 1;
                int n35 = n33 + ((n8 >>= 10) - (n33 >>= 10)) / (n6 << 1);
                int n36 = (n34 >>= 10) + ((n32 >>= 10) - n34) / (n6 << 1);
                for (int i6 = 0; i6 < n6; ++i6) {
                    as3.b(n35 + (n8 - n33) * i6 / n6, n36 + (n32 - n34) * i6 / n6);
                    if (as3.var_int_a - k <= -4 || as3.b - l <= -4 || as3.var_int_a - k >= ad.var_int_a + 4 || as3.b - l >= ad.var_int_b + 4) continue;
                    ad.a(graphics, this.var_javax_microedition_lcdui_Image_arr_a, as3.var_int_a, as3.b, n7);
                }
                continue;
            }
            graphics.drawLine(n33 >> 10, n34 >> 10, n8 >> 10, n32 >> 10);
        }
        n3 = this.g > 0 ? 1 : 0;
        byte[][] byArray2 = this.var_ar_a.var_byte_arr_arr_arr_a[2];
        for (n2 = n16; n2 < n14; ++n2) {
            for (int i7 = n15; i7 < n13; ++i7) {
                int n37;
                n8 = byArray2[n2][i7];
                if (n8 == 37) {
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(460 + (this.var_int_d >> 1 & 3)), n2 << 5, i7 + 1 << 5, 36);
                    continue;
                }
                if (n8 == -1 || n3 == 0 && n8 != 6 && n8 != 7 && n8 != 17 && n8 != 18 && n8 != 36 && (n8 < 41 || n8 > 45)) continue;
                switch (n8) {
                    case 17: {
                        n37 = var_int_arr_a[1];
                        break;
                    }
                    case 18: {
                        n37 = var_int_arr_a[1] + 28;
                        break;
                    }
                    case 41: {
                        n37 = var_int_arr_a[1] + 52;
                        break;
                    }
                    case 42: {
                        n37 = var_int_arr_a[1] + 53;
                        break;
                    }
                    case 43: {
                        n37 = var_int_arr_a[1] + 54;
                        break;
                    }
                    case 44: {
                        n37 = var_int_arr_a[1] + 56;
                        break;
                    }
                    case 45: {
                        n37 = var_int_arr_a[1] + 50;
                        break;
                    }
                    default: {
                        n37 = var_int_arr_a[2] + n8;
                    }
                }
                graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(n37), n2 << 5, i7 << 5, 0);
            }
        }
        if (this.var_ar_a.var_int_b == 107) {
            as as4 = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_am_a.as_a();
            int n38 = as4.var_int_a >> 15;
            n2 = as4.b >> 15;
            boolean bl6 = false;
            for (n8 = n38 - 1; n8 <= n38 + 1; ++n8) {
                for (int i8 = n2 - 1; i8 <= n2 + 1; ++i8) {
                    if (n8 < 0 || i8 < 0 || n8 >= this.var_ar_a.var_int_d || i8 >= this.var_ar_a.var_int_e || this.var_ar_a.var_byte_arr_arr_arr_a[0][n8][i8] != 30) continue;
                    bl6 = true;
                }
            }
            if (bl6) {
                this.m += 4608;
                if (this.var_int_c == 1) {
                    this.var_int_c = 2;
                } else if (this.var_int_c == 2 && this.m > (ad.var_int_c > ad.var_int_d ? ad.var_int_c : ad.var_int_d) << 11) {
                    this.var_int_c = 3;
                    this.m = 0x3FFFFFFF;
                }
            }
            graphics.translate(k, l);
            graphics.setColor(0);
            n8 = (this.var_int_arr_d[0] >> 10) - k;
            graphics.fillRect(0, 0, n8, ad.var_int_b);
            int n39 = (this.var_int_arr_d[2] >> 10) - k;
            graphics.fillRect(n39, 0, ad.var_int_a - n39, ad.var_int_b);
            int n40 = (this.var_int_arr_d[1] >> 10) - l;
            graphics.fillRect(n8, 0, n39 - n8, n40);
            n7 = (this.var_int_arr_d[3] >> 10) - l;
            graphics.fillRect(n8, n7, n39 - n8, ad.var_int_b - n7);
            if (this.m == 46080) {
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_b[0], n8, n40, 20);
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_b[1], n39, n40, 24);
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_b[2], n39, n7, 40);
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_b[3], n8, n7, 36);
            } else {
                graphics.fillTriangle(n8, n40, n8 + 18, n40, n8, n40 + 18);
                graphics.fillTriangle(n39, n40, n39, n40 + 18, n39 - 18, n40);
                graphics.fillTriangle(n39, n7, n39 - 18, n7, n39, n7 - 18);
                graphics.fillTriangle(n8, n7, n8, n7 - 18, n8 + 18, n7);
            }
            graphics.translate(-k, -l);
        }
        if (this.var_ar_a.var_int_b == 107 || this.var_ar_a.var_int_b == 112) {
            n17 = this.var_ar_a.var_ai_arr_a.length;
            for (int i9 = 0; i9 < n17; ++i9) {
                ai ai4 = this.var_ar_a.var_ai_arr_a[i9];
                if (ai4.var_byte_a == 2 || ai4.var_byte_d != 4) continue;
                ai4.a(graphics);
            }
        }
        if (this.g > 0) {
            int n41 = this.n;
            while (n41 != this.o) {
                byte[] byArray3;
                int[] nArray3 = this.var_int_arr_arr_a[n41];
                if (nArray3[2] == 30) {
                    byte[] byArray4 = new byte[2];
                    byArray4[0] = 2;
                    byArray3 = byArray4;
                    byArray4[1] = 0;
                } else {
                    byte[] byArray5 = new byte[2];
                    byArray5[0] = 1;
                    byArray3 = byArray5;
                    byArray5[1] = 0;
                }
                this.var_d_a.a(graphics, 1, byArray3, nArray3[0], nArray3[1], 3);
                nArray3[3] = nArray3[3] - 1;
                if (nArray3[3] == 0) {
                    ++this.n;
                    if (this.n == 10) {
                        this.n = 0;
                    }
                } else {
                    nArray3[1] = nArray3[1] - 3;
                }
                n41 = ++n41 == 10 ? 0 : n41;
            }
        }
        q q3 = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f];
        if (this.E != 0) {
            if (q3.var_boolean_f && q3.var_boolean_d || q3.var_int_h < 0 && q3.var_int_i < 0) {
                this.E &= 0xFFFFFFFD;
            }
            if (q3.var_boolean_d || q3.var_int_i < 0) {
                this.E &= 0xFFFFFFFB;
            }
            if (q3.var_boolean_g && q3.var_boolean_d || q3.var_int_h > 0 && q3.var_int_i < 0) {
                this.E &= 0xFFFFFFF7;
            }
            if (q3.var_boolean_f || q3.var_int_h < 0) {
                this.E &= 0xFFFFFFEF;
            }
            if (q3.var_byte_b == 2) {
                this.E &= 0xFFFFFBFF;
            }
            if (q3.var_boolean_g || q3.var_int_h > 0) {
                this.E &= 0xFFFFFFBF;
            }
            if (q3.var_boolean_e || q3.var_int_i > 0) {
                this.E &= 0xFFFFFEFF;
            }
            if (q3.var_int_e > 0) {
                this.E &= 0xFFFFFFDF;
            }
            if (q3.var_byte_b == 1) {
                this.E &= 0xFFFFF7FF;
            }
        }
        if ((this.E != 0 || this.G != 0) && this.var_ar_a.var_byte_d == 0 && (this.var_int_d & 3) <= 1) {
            as as5 = q3.var_am_a.as_a();
            if (this.E != 0 && this.var_as_a.as_b(as5).d() > 23040000) {
                this.E = 0;
            }
            if ((n2 = this.F++ < 4 ? this.G : this.E) != 0) {
                int n42;
                int n43 = as5.var_int_a >> 10;
                n8 = as5.b >> 10;
                int n44 = n42 = this.var_com_hardwire_blob_Main_a.var_an_a != null && this.var_com_hardwire_blob_Main_a.var_an_a.boolean_a() ? 8 : 0;
                if ((n2 & 2) != 0) {
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(256 + var_int_arr_b[1] + n42), n43 - 40, n8 - 40, 40);
                }
                if ((n2 & 4) != 0) {
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(256 + var_int_arr_b[2] + n42), n43, n8 - 40, 33);
                }
                if ((n2 & 8) != 0) {
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(256 + var_int_arr_b[3] + n42), n43 + 40, n8 - 40, 36);
                }
                if ((n2 & 0x10) != 0) {
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(256 + var_int_arr_b[4] + n42), n43 - 40, n8, 10);
                }
                if ((n2 & 0x20) != 0) {
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(256 + var_int_arr_b[5] + n42), n43, n8 - 20, 3);
                }
                if ((n2 & 0x40) != 0) {
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(256 + var_int_arr_b[6] + n42), n43 + 40, n8, 6);
                }
                if ((n2 & 0x400) != 0 || (n2 & 0x800) != 0) {
                    if (this.var_com_hardwire_blob_Main_a.var_an_a != null && this.var_com_hardwire_blob_Main_a.var_an_a.boolean_a()) {
                        n42 -= var_int_arr_b[5];
                        n42 = (n2 & 0x400) != 0 ? (n42 += var_int_arr_c[10]) : (n42 += var_int_arr_c[11]);
                    }
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(256 + var_int_arr_b[5] + n42), k + 16, l + ad.var_int_b - this.var_ad_a.javax_microedition_lcdui_Image_a(4).getHeight() - 4, 36);
                }
            }
        }
        graphics.translate(k, l);
    }

    private static void a(Graphics graphics, Image image, int n2, int n3, int n4, boolean bl) {
        int n5 = image.getWidth();
        int n6 = n4 / n5;
        graphics.setClip(n2, 0, n4, ad.var_int_b);
        if (n4 % n5 != 0) {
            ++n6;
        }
        for (n4 = 0; n4 < n6; ++n4) {
            if (bl) {
                graphics.drawRegion(image, 0, 0, n5, image.getHeight(), 3, n2 + n5 * n4, n3, 0);
                continue;
            }
            graphics.drawImage(image, n2 + n5 * n4, n3, 0);
        }
    }

    private void c(Graphics graphics) {
        int n2;
        int n3;
        if (this.var_boolean_c) {
            if (this.var_ar_a.var_byte_c != 6) {
                graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(2), ad.var_int_a, ad.var_int_b, 40);
                graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(4 + this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_byte_c), 0, ad.var_int_b, 36);
            }
            if (this.var_ar_a.var_int_b == 93) {
                return;
            }
            this.var_d_a.a(graphics, 0, d.byte_arr_a(0, this.var_ar_a.var_int_arr_e[this.var_ar_a.var_int_f]), ad.var_int_a - 1, -9, 24);
            n3 = this.var_ad_a.javax_microedition_lcdui_Image_a(10).getWidth();
            n2 = ad.var_int_c - (n3 << 1) - 2 - 2;
            int n4 = 0;
            int n5 = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_int_d;
            int n6 = (n2 -= 3) * n5 / 100 >> 10;
            graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(10), 1, 1, 20);
            n4 = n3 + 1;
            ac.a(graphics, this.var_ad_a.javax_microedition_lcdui_Image_a(n5 < 25600 ? 14 + this.var_int_d % 3 : (n5 < 51200 ? 14 : 12)), n4, 1, n6, false);
            ac.a(graphics, this.var_ad_a.javax_microedition_lcdui_Image_a(13), n4 + n6, 1, n2 - n6, false);
            graphics.setClip(0, 0, ad.var_int_a, ad.var_int_b);
            graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(11), n4 + n2, 1, 20);
            this.var_d_a.a(graphics, 0, ac.byte_arr_a(this.var_ar_a.var_int_b == 117 ? 180000 - this.var_ar_a.k : this.var_ar_a.k), ad.var_int_c, -9, 20);
        }
        if (this.u != Integer.MAX_VALUE) {
            if (this.v > 0 && this.v < 50) {
                ++this.v;
            } else if (this.v >= 30) {
                this.u -= 5;
                if (this.u <= 0) {
                    this.u = Integer.MAX_VALUE;
                }
            } else {
                this.u += 5;
                n2 = d.c(this.var_d_a.byte_a(13)) * this.var_byte_arr_arr_a.length + 7;
                if (this.u >= n2) {
                    this.u = n2;
                    this.v = 1;
                }
            }
            if (this.u != Integer.MAX_VALUE) {
                graphics.setColor(0);
                graphics.fillRect(0, ad.var_int_b - this.u, ad.var_int_a, this.u);
                graphics.setColor(140, 140, 140);
                graphics.drawLine(0, ad.var_int_b - this.u, ad.var_int_a, ad.var_int_b - this.u);
                n2 = this.var_d_a.byte_a(13);
                for (n3 = 0; n3 < this.var_byte_arr_arr_a.length; ++n3) {
                    this.var_d_a.a(graphics, n2, this.var_byte_arr_arr_a[n3], ad.var_int_c, ad.var_int_b - this.u + 2 + d.c(n2) * n3, 17);
                }
            }
        }
        if (this.var_ar_a.m >= 0) {
            n2 = this.var_d_a.byte_a(158);
            n3 = d.c(n2) + 10;
            graphics.setColor(0);
            graphics.fillRect(0, ad.var_int_d - (n3 >> 1), ad.var_int_a, n3);
            graphics.setColor(240, 240, 240);
            graphics.drawLine(0, ad.var_int_d - (n3 >> 1), ad.var_int_a, ad.var_int_d - (n3 >> 1));
            graphics.drawLine(0, ad.var_int_d + (n3 >> 1), ad.var_int_a, ad.var_int_d + (n3 >> 1));
            n2 = this.var_d_a.d(158 + this.var_ar_a.m);
            this.var_d_a.a(graphics, 158 + this.var_ar_a.m, -(n2 >> 1) + (ad.var_int_a + n2) * this.var_ar_a.n / 6, ad.var_int_d, 3);
            return;
        }
        if (this.var_boolean_a) {
            n2 = this.var_d_a.d(50) + 4;
            n3 = d.c(this.var_d_a.byte_a(50)) + 4;
            graphics.setColor(0);
            graphics.fillRect(ad.var_int_c - (n2 >> 1), ad.var_int_d - (n3 >> 1), n2, n3);
            graphics.setColor(140, 140, 140);
            graphics.drawRect(ad.var_int_c - (n2 >> 1), ad.var_int_d - (n3 >> 1), n2, n3);
            this.var_d_a.a(graphics, 50, ad.var_int_c, ad.var_int_d, 3);
        }
    }

    public static byte[] byte_arr_a(int n2) {
        int n3 = n2 % 60000 / 1000;
        byte[] byArray = d.byte_arr_a(0, n3);
        byte[] byArray2 = d.byte_arr_a(0, n2 /= 60000);
        byte[] byArray3 = new byte[byArray2.length + 3];
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            byArray3[i2] = byArray2[i2];
        }
        byArray3[i2++] = d.a(0, ':');
        if (byArray.length < 2) {
            byArray3[i2++] = d.a(0, '0');
            byArray3[i2] = byArray[0];
        } else {
            byArray3[i2++] = byArray[0];
            byArray3[i2] = byArray[1];
        }
        return byArray3;
    }

    private void d(Graphics graphics) {
        this.var_com_hardwire_blob_Main_a.var_u_a.a(graphics);
        if (this.var_ar_a.var_byte_e == 4 || this.var_ar_a.var_byte_e == 5) {
            if (this.var_ar_a.var_int_arr_e[this.var_ar_a.var_int_f] == 5) {
                this.var_d_a.a(graphics, 51, ad.var_int_c, ad.var_int_d, 3);
                return;
            }
            if (this.var_ar_a.var_int_arr_e[this.var_ar_a.var_int_g] == 5) {
                this.var_d_a.a(graphics, 52, ad.var_int_c, ad.var_int_d, 3);
                return;
            }
            this.var_d_a.a(graphics, this.var_ar_a.var_int_a == this.var_ar_a.var_int_f ? 53 : 95, ad.var_int_c, ad.var_int_d, 3);
            return;
        }
        int n2 = this.var_ar_a.var_byte_e == 0 && this.var_ar_a.var_int_b == d.var_short_arr_a[d.var_short_arr_a.length - 1] || this.var_ar_a.var_byte_e == 2 && this.var_ar_a.var_int_b == d.var_short_arr_d[d.var_short_arr_d.length - 1] ? 1 : 0;
        int n3 = 0;
        int n4 = this.var_d_a.byte_a(36);
        int n5 = d.c(n4);
        this.var_d_a.a(graphics, n2 != 0 ? 38 : 40, ad.var_int_c, 20, 17);
        this.var_d_a.a(graphics, n2 != 0 ? 39 : 35, ad.var_int_c, (n5 -= 4) + 20, 17);
        n2 = ad.var_int_c + 5;
        int n6 = n2 + d.b(0);
        int n7 = 3;
        if (this.var_ar_a.var_byte_b != 1) {
            n7 = 2;
        }
        n3 = ad.var_int_b < 400 ? 40 + ad.var_int_d - n7 * n5 : 5 + ad.var_int_d - n7 * n5;
        this.var_d_a.a(graphics, 36, n2, n3, 24);
        this.var_d_a.a(graphics, n4, d.byte_arr_a(n4, this.var_ar_a.var_int_arr_e[this.var_ar_a.var_int_f]), n6, n3, 20);
        this.var_d_a.a(graphics, 37, n2, n3 + n5, 24);
        this.var_d_a.a(graphics, n4, ac.byte_arr_a(this.var_ar_a.k), n6, n3 + n5, 20);
        byte[] byArray = new byte[]{d.a(n4, '/')};
        if (this.var_ar_a.var_byte_b == 1) {
            this.var_d_a.a(graphics, 12, n2, n3 + (n5 << 1), 24);
            this.var_d_a.a(graphics, n4, d.a(new byte[][]{d.byte_arr_a(n4, this.var_ar_a.var_int_arr_f[this.var_ar_a.var_int_f]), byArray, d.byte_arr_a(n4, this.var_ar_a.l)}), n6, n3 + (n5 << 1), 20);
        }
        if (this.var_ar_a.var_byte_e == 0 || this.var_ar_a.var_byte_e == 2) {
            n3 += n5 * n7;
            n4 = this.var_d_a.d(155);
            graphics.setColor(120, 120, 120);
            graphics.drawLine(ad.var_int_c - n4, n3 += 5, ad.var_int_c + n4, n3);
            byte by = this.var_d_a.byte_a(155);
            n4 = by;
            n5 = d.c(by);
            this.var_d_a.a(graphics, 155, n2, n3 += 2, 24);
            this.var_d_a.a(graphics, n4, d.byte_arr_a(n4, this.var_ar_a.h), n6, n3, 20);
            this.var_d_a.a(graphics, 156, n2, n3 + n5, 24);
            this.var_d_a.a(graphics, n4, ac.byte_arr_a(this.var_ar_a.i), n6, n3 + n5, 20);
            if (this.var_ar_a.var_byte_b == 1) {
                this.var_d_a.a(graphics, 157, n2, n3 + (n5 << 1), 24);
                this.var_d_a.a(graphics, n4, d.a(new byte[][]{d.byte_arr_a(n4, this.i), byArray, d.byte_arr_a(n4, 71)}), n6, n3 + (n5 << 1), 20);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(Graphics graphics) {
        try {
            if (this.h < 4) {
                ++this.h;
                return;
            }
            switch (this.var_ar_a.var_byte_c) {
                case 0: {
                    this.b(graphics);
                    this.c(graphics);
                    return;
                }
                case 4: {
                    this.d(graphics);
                    return;
                }
                case 5: {
                    graphics.translate(0, -ad.var_int_b + ad.var_int_b * this.var_int_d / 7);
                    this.d(graphics);
                    graphics.setColor(140, 140, 140);
                    graphics.drawLine(0, ad.var_int_b, ad.var_int_a, ad.var_int_b);
                    ++this.var_int_d;
                    if (this.var_int_d <= 7) return;
                    this.var_ar_a.var_byte_d = (byte)4;
                    return;
                }
                case 6: {
                    int n2;
                    if (this.var_ad_a.var_byte_arr_arr_a == null) {
                        return;
                    }
                    if (this.var_int_e == 0 || this.var_int_f > 0 && this.var_int_e == 40 && var_boolean_arr_a[this.var_int_f - 1] || this.var_ar_a.var_int_b == 93 || this.var_ar_a.var_int_b == 134) {
                        this.b(graphics);
                        this.c(graphics);
                    }
                    int n3 = -1;
                    if (this.var_int_f >= 0) {
                        n3 = var_short_arr_b[this.var_int_f];
                    }
                    Image image = null;
                    if (n3 >= 0) {
                        image = this.var_ad_a.javax_microedition_lcdui_Image_a(n3);
                    }
                    int n4 = this.var_ad_a.g + this.var_ad_a.javax_microedition_lcdui_Image_a(3).getHeight() + 6;
                    n4 = n4 * (this.var_int_e > 4 ? 4 : this.var_int_e) / 4;
                    int n5 = ad.var_int_b - n4;
                    graphics.setColor(0);
                    graphics.fillRect(0, n5 - 2, ad.var_int_a, n4 + 4);
                    ac.a(graphics, this.var_ad_a.javax_microedition_lcdui_Image_a(90), 0, n5 - 2 - this.var_ad_a.javax_microedition_lcdui_Image_a(90).getHeight(), ad.var_int_a, false);
                    if (this.var_int_e++ >= 4) {
                        this.var_ad_a.b(graphics, 6, n5 + 2, this.var_ad_a.g, ad.var_int_a - 6);
                        graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(3), 2, ad.var_int_b - 2, 36);
                    }
                    if (n3 == -1) return;
                    int n6 = ad.var_int_a - (image == null ? 6 : 50);
                    n4 = n3;
                    switch (n4) {
                        case 82: 
                        case 84: {
                            n2 = 1;
                            break;
                        }
                        default: {
                            n2 = n4 = 0;
                        }
                    }
                    if (n2 != 0) {
                        n6 = 6;
                    }
                    n3 = ac.int_a(n3);
                    int n7 = this.var_d_a.d(n3) + 16 + 44 + 1;
                    int n8 = n4 != 0 ? n6 : n6 - n7 + 44;
                    graphics.setColor(9, 9, 9);
                    graphics.fillRect(n8 - 2, (n5 -= 46) - 2, n7 + 4, 47);
                    graphics.drawImage(image, n6, n5, 0);
                    int n9 = n4 != 0 ? (n6 += 44) + 1 : --n6 - n7 + 44 + 1;
                    graphics.setColor(23, 23, 23);
                    graphics.fillRect(n9 + 1, n5 + 1, n7 - 44 - 2, 43);
                    graphics.setColor(29, 29, 25);
                    graphics.fillRect(n9 + 1, n5 + 3, n7 - 44 - 2, 22);
                    graphics.setColor(255, 255, 255);
                    graphics.drawLine(n8, n5 - 1, n8 + n7, n5 - 1);
                    graphics.drawLine(n8 - 1, n5 - 1, n8 - 1, n5 + 44);
                    graphics.drawLine(n8 + n7, n5, n8 + n7, n5 + 44 - 1);
                    graphics.drawLine(n8, n5 + 44, n8 + n7, n5 + 44);
                    graphics.drawLine(n6, n5, n6, n5 + 44);
                    this.var_d_a.a(graphics, n3, n9 + 8, n5 + 2, 20);
                    return;
                }
                case 7: {
                    ac ac2 = this;
                    byte[][][] byArray = var_byte_arr_arr_arr_arr_a[ac2.j];
                    int n10 = byArray[0].length;
                    int n11 = (ad.var_int_a >> 5) + ((ad.var_int_a & 0x1F) == 0 ? 0 : 1);
                    if (n11 < n10) {
                        n10 = n11;
                    }
                    ac2.var_com_hardwire_blob_Main_a.var_u_a.d();
                    n11 = 2 * d.c(3) + 30;
                    int n12 = n10 << 5;
                    int n13 = n11 + 128;
                    n12 = ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_e - n12;
                    n13 = ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_f - n13;
                    ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_e -= n12;
                    ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_g += n12 >> 1;
                    ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_f -= n13;
                    ac2.var_com_hardwire_blob_Main_a.var_u_a.h += n13 >> 1;
                    ac2.var_com_hardwire_blob_Main_a.var_u_a.a(graphics);
                    n12 = ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_g;
                    n11 = ac2.var_com_hardwire_blob_Main_a.var_u_a.h + (n11 >> 1);
                    n13 = byArray[0].length - n10 >> 1;
                    int n14 = byArray[0][0].length - 4;
                    for (int i2 = 0; i2 < 3; ++i2) {
                        for (int i3 = n13; i3 < n13 + n10; ++i3) {
                            for (int i4 = n14; i4 < n14 + 4; ++i4) {
                                int n15 = byArray[i2][i3 - (n13 < 0 ? n13 : 0)][i4];
                                if (i2 == 0 && n15 == 30) {
                                    n15 = -4;
                                }
                                if (i2 == 0 && n15 == 36) {
                                    n15 = 288;
                                }
                                if (i2 == 2 && n15 == 37) {
                                    graphics.drawImage(ac2.var_ad_a.javax_microedition_lcdui_Image_a(460), n12 + (i3 - n13 << 5), n11 + (i4 - n14 + 1 << 5), 36);
                                    continue;
                                }
                                if (n15 == -1 || n15 == 11 && i2 == 0) continue;
                                graphics.drawImage(ac2.var_ad_a.javax_microedition_lcdui_Image_a(var_int_arr_a[i2] + n15), n12 + (i3 - n13 << 5), n11 + (i4 - n14 << 5), 0);
                            }
                        }
                    }
                    ac.a(graphics, ac2.var_ad_a.javax_microedition_lcdui_Image_a(90), 0, n11, ad.var_int_a, true);
                    ac.a(graphics, ac2.var_ad_a.javax_microedition_lcdui_Image_a(90), 0, n11 + 128 - ac2.var_ad_a.javax_microedition_lcdui_Image_a(90).getHeight(), ad.var_int_a, false);
                    n13 = ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_f - 128 >> 2;
                    if (ac2.var_ar_a.var_int_b >= 0) {
                        d.a(graphics, 3, ac2.var_d_a.byte_arr_a(ac2.var_ar_a.var_int_b), ad.var_int_c, n11 - n13 - 4, ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_g, ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_g + ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_e, 3);
                    }
                    d.a(graphics, 3, ac2.var_d_a.byte_arr_a(0), ad.var_int_c, n11 + 128 + n13, ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_g, ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_g + ac2.var_com_hardwire_blob_Main_a.var_u_a.var_int_e, 3);
                    return;
                }
                case 9: {
                    int n16 = this.y - this.w;
                    int n17 = this.z - this.x;
                    if (y.int_a(n16, n17) < 4096) {
                        this.void_a(-6);
                    } else {
                        int n18 = this.A + (n16 * 512 >> 10);
                        int n19 = this.B + (n17 * 512 >> 10);
                        this.A = (this.A - (n18 * 512 >> 10)) * 621 >> 10;
                        this.B = (this.B - (n19 * 512 >> 10)) * 621 >> 10;
                        this.y = this.w + ((n16 + n18) * 621 >> 10);
                        this.z = this.x + ((n17 + n19) * 621 >> 10);
                        k = this.y >> 10;
                        l = this.z >> 10;
                        if (k < 0) {
                            k = 0;
                        }
                        if (l < 0) {
                            l = 0;
                        }
                    }
                    this.var_int_arr_d[0] = k << 10;
                    this.var_int_arr_d[1] = l << 10;
                    this.var_int_arr_d[2] = k + ad.var_int_a << 10;
                    this.var_int_arr_d[3] = l + ad.var_int_b << 10;
                    this.b(graphics);
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(0), 0, ad.var_int_b, 36);
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private static int int_a(int n2) {
        switch (n2) {
            case 85: {
                return 97;
            }
            case 86: {
                return 147;
            }
            case 80: {
                return 98;
            }
            case 82: {
                return 99;
            }
            case 81: {
                return 100;
            }
            case 83: {
                return 101;
            }
            case 84: {
                return 102;
            }
            case 87: {
                return 135;
            }
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n2, int n3) {
        Image image = this.var_ad_a.javax_microedition_lcdui_Image_a(2);
        if (n2 > ad.var_int_a - image.getWidth() && n3 > ad.var_int_b - image.getHeight()) {
            this.void_a(-7);
            return;
        }
        if (this.var_ar_a.var_byte_c == 0 && this.var_ar_a.var_int_b != 93) {
            Image image2 = this.var_ad_a.javax_microedition_lcdui_Image_a(4);
            if (n2 < image2.getWidth() && n3 > ad.var_int_b - image2.getHeight()) {
                if (this.var_ar_a.var_byte_c != 0) return;
                if (this.var_ar_a.var_byte_b == 1 && this.var_ar_a.var_int_b == 73) {
                    if (this.var_int_c <= 0) return;
                }
                if (this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_byte_c == 0) {
                    if (this.var_ar_a.var_byte_c == 0 && (this.var_ar_a.var_byte_b != 1 || this.var_ar_a.var_int_b != 73 && (this.var_ar_a.var_int_b != 74 || this.var_int_c > 0))) {
                        this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_byte_b = (byte)2;
                        return;
                    }
                    this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_byte_b = 1;
                    return;
                }
                if (this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_byte_c == 2) {
                    this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_byte_b = 1;
                    return;
                }
                this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_byte_b = 0;
                return;
            }
            if (this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].boolean_a()) {
                int n4;
                int n5 = (n2 -= ad.var_int_c) < 0 ? -n2 : n2;
                int n6 = n4 = n3 < 0 ? -n3 : (n3 -= ad.var_int_d);
                if (n2 < 0 && n4 <= n5) {
                    this.void_a(ad.int_b(2));
                    return;
                }
                if (n2 > 0 && n4 <= n5) {
                    this.void_a(ad.int_b(3));
                    return;
                }
                if (n3 < 0 && n5 <= n4) {
                    this.void_a(ad.int_b(0));
                    return;
                }
                if (n3 <= 0) return;
                if (n5 > n4) return;
                this.void_a(ad.int_b(1));
                return;
            }
            as as2 = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_am_a.as_a();
            as as3 = new as(n2 - (as2.var_int_a >> 10) + k, n3 - (as2.b >> 10) + l);
            if (as3.long_a() < 2500L) {
                this.void_a(ad.int_b(11));
                return;
            }
            n2 = as3.int_a();
            if (n2 > 6176622 || n2 < 411774) {
                this.void_a(ad.int_b(3));
                return;
            }
            if (n2 < 1235324) {
                this.void_a(ad.int_b(7));
                return;
            }
            if (n2 < 2058874) {
                this.void_a(ad.int_b(1));
                return;
            }
            if (n2 < 2882423) {
                this.void_a(ad.int_b(6));
                return;
            }
            if (n2 < 3705973) {
                this.void_a(ad.int_b(2));
                return;
            }
            if (n2 < 4529522) {
                this.void_a(ad.int_b(4));
                return;
            }
            if (n2 < 5353072) {
                this.void_a(ad.int_b(0));
                return;
            }
            this.void_a(ad.int_b(5));
            return;
        }
        if (this.var_ar_a.var_byte_c == 4) {
            this.void_a(-6);
            return;
        }
        if (this.var_ar_a.var_byte_c != 9) {
            if (this.var_ar_a.var_byte_c != 6) return;
        }
        Image image3 = this.var_ad_a.javax_microedition_lcdui_Image_a(0);
        if (this.var_ar_a.var_byte_c == 6 || n2 < image3.getWidth() << 1 && n3 > ad.var_int_b - (image3.getHeight() << 1)) {
            this.void_a(-6);
            return;
        }
        if (this.var_ar_a.var_byte_c != 6) return;
        this.var_ad_a.var_boolean_d = true;
        this.var_ad_a.var_boolean_e = false;
        this.var_ad_a.i = n3;
        this.var_ad_a.j = this.var_ad_a.var_int_f;
    }

    public final void b() {
        this.c();
    }

    public final void b(int n2, int n3) {
        if (this.var_ar_a.var_byte_c == 6) {
            return;
        }
        Object object = this.var_ad_a.javax_microedition_lcdui_Image_a(2);
        if (n2 > ad.var_int_a - object.getWidth() && n3 > ad.var_int_b - object.getHeight()) {
            return;
        }
        object = this.var_ad_a.javax_microedition_lcdui_Image_a(4);
        if (n2 < object.getWidth() && n3 > ad.var_int_b - object.getHeight()) {
            return;
        }
        object = this;
        object.c();
        this.a(n2, n3);
    }

    public final void a(v v2) {
        switch (v2.a) {
            case 5: {
                this.void_a(this.var_ar_a.var_byte_c == 6 || this.var_ar_a.var_byte_c == 9 || this.var_ar_a.var_byte_c == 4 ? -6 : ad.int_b(9));
                return;
            }
            case 6: {
                this.void_a(ad.int_b(11));
                return;
            }
            case 7: {
                this.void_a(ad.int_b(10));
                return;
            }
            case 8: {
                this.void_a(-7);
                return;
            }
            case 1: {
                if (this.var_ar_a.var_byte_c != 6) break;
                this.var_ad_a.j();
                return;
            }
            case 2: {
                if (this.var_ar_a.var_byte_c != 6) break;
                this.var_ad_a.k();
            }
        }
    }

    public final void b(v v2) {
        switch (v2.a) {
            case 6: {
                this.b(ad.int_b(11));
                return;
            }
            case 1: 
            case 2: {
                if (this.var_ar_a.var_byte_c != 6) break;
                this.var_ad_a.l();
            }
        }
    }

    public final void a(o o2) {
        switch (this.var_ar_a.var_byte_c) {
            case 0: 
            case 6: 
            case 9: {
                if (this.var_ar_a.var_int_b == 93 || this.var_ar_a.var_q_arr_a == null || this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f] == null) break;
                q q2 = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f];
                o o3 = o2;
                int n2 = o3.a;
                o3 = o2;
                int n3 = o3.b;
                if (n2 > 127) {
                    n2 = 127;
                } else if (n2 < -127) {
                    n2 = -127;
                }
                if (n3 > 127) {
                    n3 = 127;
                } else if (n3 < -127) {
                    n3 = -127;
                }
                q2.var_int_h = n2 * 127 / 127;
                q2.var_int_i = n3 * 127 / 127;
            }
        }
    }

    public final void void_a(int n2) {
        block41: {
            try {
                block43: {
                    block42: {
                        q q2 = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f];
                        if (this.var_ar_a.var_byte_c == 0) {
                            if (ad.boolean_a(n2)) {
                                this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)1);
                                this.var_com_hardwire_blob_Main_a.var_u_a.c();
                                this.var_com_hardwire_blob_Main_a.var_byte_a = 1;
                                return;
                            }
                            if (this.var_ar_a.var_int_b != 93 && (this.var_ar_a.var_byte_b != 1 || this.var_ar_a.var_int_b != 73 || this.var_int_c > 0) && ad.boolean_c(n2)) {
                                if (q2.var_byte_c == 0) {
                                    if (this.var_ar_a.var_int_b != 73 && (this.var_ar_a.var_int_b != 74 || this.var_int_c > 0)) {
                                        q2.var_byte_b = (byte)2;
                                        return;
                                    }
                                    q2.var_byte_b = 1;
                                    return;
                                }
                                if (q2.var_byte_c == 2) {
                                    q2.var_byte_b = 1;
                                    return;
                                }
                                q2.var_byte_b = 0;
                                return;
                            }
                        }
                        if (this.var_ar_a.var_int_b != 93 && (this.var_ar_a.var_byte_c == 0 || this.var_ar_a.var_byte_c == 6 || this.var_ar_a.var_byte_c == 9)) {
                            switch (this.var_ad_a.int_a(n2)) {
                                case 0: {
                                    q2.var_boolean_d = true;
                                    break;
                                }
                                case 1: {
                                    q2.var_boolean_e = true;
                                    break;
                                }
                                case 2: {
                                    q2.var_boolean_f = true;
                                    break;
                                }
                                case 3: {
                                    q2.var_boolean_g = true;
                                    break;
                                }
                                case 4: {
                                    q2.var_boolean_d = true;
                                    q2.var_boolean_f = true;
                                    break;
                                }
                                case 5: {
                                    q2.var_boolean_d = true;
                                    q2.var_boolean_g = true;
                                    break;
                                }
                                case 6: {
                                    q2.var_boolean_e = true;
                                    q2.var_boolean_f = true;
                                    break;
                                }
                                case 7: {
                                    q2.var_boolean_e = true;
                                    q2.var_boolean_g = true;
                                    break;
                                }
                                case 8: 
                                case 11: {
                                    if (this.var_ar_a.var_byte_c != 0) break;
                                    q2.var_boolean_h = true;
                                    break;
                                }
                                case 9: {
                                    if (this.var_ar_a.var_byte_c != 0 || this.var_ar_a.var_byte_b == 1 && (this.var_ar_a.var_int_b == 73 || this.var_ar_a.var_int_b == 74 && this.var_int_c <= 0)) break;
                                    if (q2.var_byte_c == 2) {
                                        q2.var_byte_b = 0;
                                        break;
                                    }
                                    q2.var_byte_b = (byte)2;
                                    break;
                                }
                                case 10: {
                                    if (this.var_ar_a.var_byte_c != 0 || this.var_ar_a.var_byte_b == 1 && this.var_ar_a.var_int_b == 73 && this.var_int_c <= 0) break;
                                    q2.var_byte_b = q2.var_byte_c == 1 ? (byte)0 : 1;
                                }
                            }
                        }
                        if (this.var_ar_a.var_byte_c == 4 && (ad.boolean_a(n2) || ad.boolean_c(n2) || this.var_ad_a.int_a(n2) == 8)) {
                            this.var_ar_a.var_byte_d = (byte)8;
                        }
                        if (this.var_ar_a.var_byte_c != 6) break block42;
                        if (this.var_int_e < 8) break block43;
                        if (ad.boolean_c(n2) || this.var_ad_a.int_a(n2) == 8) {
                            this.var_ad_a.var_byte_arr_arr_a = null;
                            if (this.var_int_f >= 0 && var_boolean_arr_a[this.var_int_f]) {
                                this.c(this.var_int_f + 1);
                                this.var_int_e = 40;
                            } else if (this.var_int_f == 80 || this.var_int_f == 127) {
                                this.var_ar_a.var_byte_d = (byte)2;
                            } else {
                                if (this.var_int_f == 14) {
                                    this.var_ar_a.var_t_arr_a = null;
                                    this.var_ar_a.var_t_arr_a = new t[2];
                                    this.var_ar_a.var_t_arr_a[0] = new t(this.var_ar_a.var_ai_arr_a[0].var_aa_b.var_s_a, this.var_ar_a.var_ap_arr_a[0].var_am_a.var_s_arr_a[0], 1024, -1, this.var_ar_a.var_ai_arr_a[0].var_aa_b.var_int_a);
                                    this.var_ar_a.var_t_arr_a[1] = new t(this.var_ar_a.var_ai_arr_a[0].var_aa_b.var_s_a, this.var_ar_a.var_ap_arr_a[1].var_am_a.var_s_arr_a[0], 1024, -1, this.var_ar_a.var_ai_arr_a[0].var_aa_b.var_int_a);
                                    this.var_ar_a.var_ap_arr_a[0].var_am_a.var_t_arr_c = new t[]{this.var_ar_a.var_t_arr_a[0], this.var_ar_a.var_t_arr_a[1]};
                                } else if (this.var_int_f == 79 || this.var_int_f == 96 || this.var_int_f == 106 || this.var_int_f == 136 || this.var_int_f == 167 || this.var_int_f == 169 || this.var_int_f == 181) {
                                    ++this.var_int_c;
                                } else if (this.var_int_f == 171) {
                                    am am2 = this.var_ar_a.var_q_arr_a[0].var_am_a;
                                    am2.b(new as(8000, -10000));
                                    for (int i2 = 0; i2 < am2.var_s_arr_a.length; ++i2) {
                                        am2.var_s_arr_a[i2].var_as_b.b = am2.var_s_arr_a[i2].var_as_a.b -= 8192;
                                        am2.var_s_arr_a[i2].var_as_b.var_int_a = am2.var_s_arr_a[i2].var_as_a.var_int_a -= 8192;
                                    }
                                    am2.var_int_b &= 0xFFFFFFFE;
                                }
                                this.var_ar_a.var_byte_d = 0;
                                this.var_ar_a.var_byte_c = 0;
                                this.a(true);
                            }
                            break block41;
                        }
                        switch (this.var_ad_a.int_a(n2)) {
                            case 0: {
                                this.var_ad_a.j();
                                break block43;
                            }
                            case 1: {
                                this.var_ad_a.k();
                            }
                        }
                        break block41;
                    }
                    if (this.var_ar_a.var_byte_c == 9 && (ad.boolean_c(n2) || this.var_ad_a.int_a(n2) == 8)) {
                        if (this.var_boolean_d) {
                            this.var_ar_a.var_byte_d = 0;
                            break block41;
                        }
                        k = this.w >> 10;
                        l = this.x >> 10;
                        this.var_int_arr_d[0] = k << 10;
                        this.var_int_arr_d[1] = l << 10;
                        this.var_int_arr_d[2] = k + ad.var_int_a << 10;
                        this.var_int_arr_d[3] = l + ad.var_int_b << 10;
                        this.d();
                    }
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final void c() {
        q q2;
        if (this.var_ar_a.var_q_arr_a != null && (q2 = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f]) != null) {
            q2.b();
        }
    }

    public final void b(int n2) {
        if (this.var_ar_a.var_byte_c == 7 || this.var_ar_a.var_byte_c == 5 || this.var_ar_a.var_byte_c == 4 || this.var_ar_a.var_byte_c == 8 || this.var_ar_a.var_byte_c == 2) {
            return;
        }
        q q2 = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f];
        if (this.var_ar_a.var_int_b != 93 && (this.var_ar_a.var_byte_c == 0 || this.var_ar_a.var_byte_c == 6 || this.var_ar_a.var_byte_c == 9)) {
            switch (this.var_ad_a.int_a(n2)) {
                case 0: {
                    q2.var_boolean_d = false;
                    break;
                }
                case 1: {
                    q2.var_boolean_e = false;
                    break;
                }
                case 2: {
                    q2.var_boolean_f = false;
                    break;
                }
                case 3: {
                    q2.var_boolean_g = false;
                    break;
                }
                case 4: {
                    q2.var_boolean_d = false;
                    q2.var_boolean_f = false;
                    break;
                }
                case 5: {
                    q2.var_boolean_d = false;
                    q2.var_boolean_g = false;
                    break;
                }
                case 6: {
                    q2.var_boolean_e = false;
                    q2.var_boolean_f = false;
                    break;
                }
                case 7: {
                    q2.var_boolean_e = false;
                    q2.var_boolean_g = false;
                    break;
                }
                case 8: 
                case 11: {
                    q2.var_boolean_h = false;
                }
            }
        }
        if (this.var_ar_a.var_byte_c == 6) {
            switch (this.var_ad_a.int_a(n2)) {
                case 0: 
                case 1: {
                    this.var_ad_a.l();
                }
            }
        }
    }

    public final void void_a(int[] nArray) {
        this.u = 0;
        this.v = 0;
        this.var_byte_arr_arr_a = new byte[nArray[0] == 0 ? 1 : (nArray[0] == 3 ? 2 : 3)][];
        byte by = this.var_d_a.byte_a(13);
        this.var_byte_arr_arr_a[0] = d.a(new byte[][]{d.byte_arr_a((int)by, this.var_ar_a.var_int_arr_f[this.var_ar_a.var_int_f]), {d.a((int)by, '/')}, d.byte_arr_a((int)by, this.var_ar_a.l), this.var_d_a.byte_arr_a(13)});
        if (nArray[0] != 0) {
            this.var_byte_arr_arr_a[1] = d.a(new byte[][]{d.byte_arr_a((int)by, nArray[1]), {d.a((int)by, '/')}, d.byte_arr_a((int)by, 71), this.var_d_a.byte_arr_a(148)});
        }
        if (nArray[0] == 1) {
            this.var_byte_arr_arr_a[2] = this.var_d_a.byte_arr_a(136);
            return;
        }
        if (nArray[0] == 5) {
            this.var_byte_arr_arr_a[2] = this.var_d_a.byte_arr_a(149);
            return;
        }
        if (nArray[0] == 4) {
            this.var_byte_arr_arr_a[2] = this.var_d_a.byte_arr_a(150);
        }
    }

    private boolean a(boolean bl) {
        int n2;
        int n3;
        block23: {
            block22: {
                n3 = -1;
                n2 = -1;
                this.var_boolean_d = bl;
                if (!bl) break block22;
                switch (this.var_int_f + 1) {
                    case 33: 
                    case 51: 
                    case 52: 
                    case 86: 
                    case 90: 
                    case 103: 
                    case 114: 
                    case 117: 
                    case 137: 
                    case 148: 
                    case 196: {
                        as as2 = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_am_a.as_a();
                        this.w = as2.var_int_a - (ad.var_int_c << 10);
                        this.x = as2.b - (ad.var_int_d << 10);
                        break block23;
                    }
                    default: {
                        return false;
                    }
                }
            }
            switch (this.var_int_f + 1) {
                case 31: {
                    n3 = 4;
                    n2 = 11;
                    break;
                }
                case 49: {
                    n3 = 10;
                    n2 = 19;
                    break;
                }
                case 52: {
                    n3 = 23;
                    n2 = 2;
                    break;
                }
                case 85: {
                    n3 = 5;
                    n2 = 15;
                    break;
                }
                case 89: {
                    n3 = 6;
                    n2 = 18;
                    break;
                }
                case 102: {
                    n3 = 21;
                    n2 = 18;
                    break;
                }
                case 112: {
                    n3 = 10;
                    n2 = 3;
                    break;
                }
                case 117: {
                    n3 = 31;
                    n2 = 8;
                    break;
                }
                case 147: {
                    n3 = 14;
                    n2 = 37;
                    break;
                }
                case 135: 
                case 149: {
                    as as3 = this.var_ar_a.var_ai_arr_a[this.var_ar_a.var_ai_arr_a.length - 1].var_aa_a.var_s_a.var_as_a;
                    this.w = as3.var_int_a - (ad.var_int_c << 10);
                    this.x = as3.b - (ad.var_int_d << 10);
                    break;
                }
                case 169: {
                    as as4 = this.var_ar_a.var_q_arr_a[1].var_am_a.as_a();
                    this.w = as4.var_int_a - (ad.var_int_c << 10);
                    this.x = as4.b - (ad.var_int_d << 10);
                    break;
                }
                case 192: {
                    n3 = 13;
                    n2 = 11;
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        this.y = k << 10;
        this.z = l << 10;
        if (n3 != -1) {
            this.w = (n3 << 5) - ad.var_int_c << 10;
            this.x = (n2 << 5) - ad.var_int_d << 10;
        }
        if (this.w < 0) {
            this.w = 0;
        }
        if (this.x < 0) {
            this.x = 0;
        }
        if ((this.w >> 10) + ad.var_int_a > this.var_ar_a.var_int_d << 5) {
            this.w = (this.var_ar_a.var_int_d << 5) - ad.var_int_a << 10;
        }
        if ((this.x >> 10) + ad.var_int_b > this.var_ar_a.var_int_e << 5) {
            this.x = (this.var_ar_a.var_int_e << 5) - ad.var_int_b << 10;
        }
        this.B = 0;
        this.A = 0;
        this.var_ar_a.var_byte_c = (byte)9;
        this.var_ar_a.var_byte_d = (byte)9;
        return true;
    }

    public final void c(int n2) {
        this.var_int_f = n2;
        if (n2 == 17) {
            this.var_ar_a.var_byte_c = (byte)6;
            this.d();
            this.var_int_e = 40;
            this.void_a(-6);
            return;
        }
        if (n2 == 16 || n2 == 21) {
            ++this.var_int_c;
        }
        if (!this.var_boolean_b && ac.int_a(var_short_arr_b[n2]) == 102) {
            this.var_ar_a.var_byte_c = (byte)6;
            this.var_int_e = 40;
            this.void_a(-6);
            return;
        }
        if (!this.a(false)) {
            this.d();
        }
    }

    public final void d() {
        this.var_int_e = 0;
        int n2 = -1;
        if (this.var_com_hardwire_blob_Main_a.var_an_a != null && this.var_com_hardwire_blob_Main_a.var_an_a.boolean_a()) {
            switch (this.var_int_f + 1) {
                case 17: {
                    n2 = 207;
                    break;
                }
                case 21: {
                    n2 = 208;
                    break;
                }
                case 22: {
                    n2 = 209;
                    break;
                }
                case 47: {
                    n2 = 210;
                    break;
                }
                case 48: {
                    n2 = 211;
                    break;
                }
                case 59: {
                    n2 = 212;
                    break;
                }
                case 127: {
                    n2 = 213;
                }
            }
        }
        byte[][] byArray = null;
        byArray = n2 == -1 ? this.var_com_hardwire_blob_Main_a.var_d_b.byte_arr_arr_a(this.var_int_f) : this.var_com_hardwire_blob_Main_a.var_d_a.byte_arr_arr_a(n2);
        if (byArray != null && byArray.length > 0) {
            n2 = 0;
            this.var_ad_a.a(byArray, 3, 3, -11579569, ad.var_int_b);
            this.var_ar_a.var_byte_d = (byte)6;
        } else {
            this.var_ar_a.var_byte_d = 0;
        }
        this.E = var_short_arr_a[this.var_int_f];
        if (this.E != 0) {
            q q2 = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f];
            this.var_as_a = new as(q2.var_am_a.as_a());
            if (q2.var_byte_c == 2) {
                this.E &= 0xFFFFFBFF;
            }
            if (q2.var_int_e > 0) {
                this.E &= 0xFFFFFFDF;
            }
            if (q2.var_byte_c == 1) {
                this.E &= 0xFFFFF7FF;
            }
        }
        this.G = this.E;
        this.F = 0;
    }

    public final void void_a(int n2, int n3, int n4, int n5) {
        this.var_int_arr_arr_a[this.o][0] = n2;
        this.var_int_arr_arr_a[this.o][1] = n3;
        this.var_int_arr_arr_a[this.o][2] = n4;
        this.var_int_arr_arr_a[this.o][3] = n5;
        n2 = this.o++;
        if (this.o == 10) {
            this.o = 0;
        }
        if (this.o == this.n) {
            this.o = n2;
        }
    }

    public final void a(int n2, int n3, int n4) {
        if (n4 == 2 && this.var_int_a == 2) {
            return;
        }
        this.var_int_arr_arr_b[this.q][0] = n2;
        this.var_int_arr_arr_b[this.q][1] = n3;
        this.var_int_arr_arr_b[this.q][2] = 0;
        this.var_int_arr_arr_b[this.q][3] = n4;
        n2 = this.q++;
        if (this.q == 10) {
            this.q = 0;
        }
        if (this.q == this.p) {
            this.q = n2;
        }
    }

    public final void b(int n2, int n3, int n4, int n5) {
        if (this.g <= 1) {
            return;
        }
        if (n5 == 1 && this.var_int_a == 2) {
            return;
        }
        int n6 = 5;
        int n7 = n4;
        if (n5 == 1) {
            if ((this.var_int_d & 1) == 0) {
                return;
            }
            n6 = 1;
            n7 <<= 1;
            n4 = 0;
        } else if (n5 == 2) {
            n6 = 1;
        }
        for (int i2 = 0; i2 < n6; ++i2) {
            int[] nArray = this.var_int_arr_arr_c[this.D];
            if (n5 == 2) {
                nArray[0] = n2 << 10;
                nArray[1] = n3 << 10;
                nArray[2] = 0;
                nArray[3] = -5120;
            } else {
                nArray[0] = y.b(n2 - n7 << 10, n2 + n7 << 10);
                nArray[1] = y.b(n3 - n4 << 10, n3 + n4 << 10);
                if (n5 == 0) {
                    nArray[2] = y.b(-3072, 3072);
                    nArray[3] = y.b(-4096, 2048);
                } else if (n5 == 1) {
                    nArray[2] = y.b(-2048, 2048);
                    nArray[3] = y.b(-5120, -3072);
                }
            }
            nArray[4] = n5;
            nArray[5] = 0;
            int n8 = this.D++;
            if (this.D == 25) {
                this.D = 0;
            }
            if (this.D != this.C) continue;
            this.D = n8;
        }
    }

    public final boolean boolean_a(int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8 = n2 >> 15;
        int n9 = n3 >> 15;
        int n10 = n4 >> 15;
        int n11 = n5 >> 15;
        int n12 = n2 < n4 ? 1 : (n7 = n2 > n4 ? -1 : 0);
        int n13 = n3 < n5 ? 1 : (n3 > n5 ? -1 : 0);
        int n14 = n8 << 15;
        int n15 = n14 + 32768;
        int n16 = n9 << 15;
        int n17 = n16 + 32768;
        int n18 = n4 - n2;
        if (n18 < 0) {
            n18 = -n18;
        }
        if ((n6 = n5 - n3) < 0) {
            n6 = -n6;
        }
        int n19 = Integer.MAX_VALUE;
        int n20 = Integer.MAX_VALUE;
        if (n18 != 0) {
            n19 = (int)(((long)(n2 > n4 ? n2 - n14 : n15 - n2) << 20) / (long)n18);
            n20 = (int)(0x800000000L / (long)n18);
        }
        n2 = Integer.MAX_VALUE;
        n4 = Integer.MAX_VALUE;
        if (n6 != 0) {
            n2 = (int)(((long)(n3 > n5 ? n3 - n16 : n17 - n3) << 20) / (long)n6);
            n4 = (int)(0x800000000L / (long)n6);
        }
        while (true) {
            if (this.var_com_hardwire_blob_Main_a.byte_a(n8, n9) == 0) {
                return false;
            }
            if (n19 <= n2) {
                if (n8 == n10) break;
                n19 = n20 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (n19 += n20);
                n8 += n7;
                continue;
            }
            if (n9 == n11) break;
            n2 = n4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (n2 += n4);
            n9 += n13;
        }
        return true;
    }

    public final void e() {
        this.var_int_d = 0;
        this.u = Integer.MAX_VALUE;
        this.m = 46080;
        this.var_int_c = 0;
        this.r = 0;
        this.s = 0;
        this.var_int_arr_arr_a = new int[10][4];
        this.n = 0;
        this.o = 0;
        this.var_int_arr_arr_b = new int[10][4];
        this.p = 0;
        this.q = 0;
        this.E = 0;
        this.G = 0;
        this.D = 0;
        this.C = 0;
        this.var_int_arr_arr_c = new int[25][6];
        this.var_int_arr_d = new int[4];
        this.g();
        if (this.var_ar_a.var_int_b == 93) {
            int n2 = ad.var_int_a * ad.var_int_b / 2000;
            this.var_int_arr_arr_d = new int[n2][3];
            int n3 = ad.var_int_a - 1;
            int n4 = ad.var_int_b * 3 / 5;
            for (int i2 = 1; i2 < n2; ++i2) {
                this.var_int_arr_arr_d[i2][0] = y.b(0, n3);
                this.var_int_arr_arr_d[i2][1] = y.b(0, n4);
                this.var_int_arr_arr_d[i2][2] = y.b(0, 1);
            }
            this.var_int_arr_arr_d[0][0] = y.b(20, n3 - 20);
            this.var_int_arr_arr_d[0][1] = y.b(20, ad.var_int_b / 4);
            this.var_int_arr_arr_d[0][2] = 2;
        }
    }

    public final void f() {
        this.var_int_arr_arr_d = null;
        this.var_int_arr_arr_a = null;
        this.var_int_arr_arr_b = null;
        this.var_int_arr_arr_c = null;
    }

    public final void g() {
        int n2;
        Object object;
        if ((this.var_ar_a.var_byte_e == 2 || this.var_ar_a.var_byte_e == 3) && this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].boolean_a()) {
            object = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f];
            if (((q)object).var_boolean_f || ((q)object).var_int_h < -64) {
                k -= 10;
            }
            if (((q)object).var_boolean_g || ((q)object).var_int_h > 63) {
                k += 10;
            }
            if (((q)object).var_boolean_d || ((q)object).var_int_i < -64) {
                l -= 10;
            }
            if (((q)object).var_boolean_e || ((q)object).var_int_i > 63) {
                l += 10;
            }
        } else if (this.var_ar_a.var_int_b == 93 && this.var_int_c < 3) {
            object = null;
            if (this.var_int_c <= 1) {
                object = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_am_a.as_a();
                k = (((as)object).var_int_a - 24576 >> 10) - 30;
            } else {
                object = this.var_ar_a.var_ai_arr_a[0].var_aa_a;
                object = ((aa)object).var_s_a.var_as_a;
                n2 = (((as)object).var_int_a - this.var_ar_a.var_ai_arr_a[0].var_aa_a.var_int_a >> 10) - ad.var_int_c;
                if (k < n2) {
                    k += 10;
                }
                if (k > n2) {
                    k = n2;
                }
            }
            l = (((as)object).b >> 10) - ad.var_int_d;
        } else if (this.var_ar_a.var_int_b == 107) {
            object = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_am_a.as_a();
            k = (((as)object).var_int_a >> 10) - ad.var_int_a + 60;
            l = (((as)object).b >> 10) - ad.var_int_d;
        } else {
            object = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_am_a.as_a();
            k = (((as)object).var_int_a >> 10) - ad.var_int_c;
            l = (((as)object).b >> 10) - ad.var_int_d;
        }
        int n3 = (this.var_ar_a.var_int_d << 5) - ad.var_int_a;
        n2 = (this.var_ar_a.var_int_e << 5) - ad.var_int_b;
        int n4 = k > n3 ? n3 : (k = k < 0 ? 0 : k);
        if (l < 0) {
            l = 0;
        }
        if (l > n2) {
            l = n2;
        }
        this.var_int_arr_d[0] = k << 10;
        this.var_int_arr_d[1] = l << 10;
        this.var_int_arr_d[2] = k + ad.var_int_a << 10;
        this.var_int_arr_d[3] = l + ad.var_int_b << 10;
    }

    public final void h() {
        int n2;
        this.var_ar_a.k += Main.var_int_b;
        if (this.var_ar_a.var_int_b == 117 && this.var_ar_a.k >= 180000) {
            this.c(127);
        }
        this.g();
        this.var_ar_a.void_a();
        if ((this.var_ar_a.var_byte_b & 3) != 0 && (this.var_ar_a.m < 0 || this.var_ar_a.o < 1)) {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            ac ac2 = this;
            for (n8 = 0; n8 < ac2.var_ar_a.var_int_arr_arr_a.length; ++n8) {
                int n9;
                int[] nArray = ac2.var_ar_a.var_int_arr_arr_a[n8];
                if (ac2.var_ar_a.var_int_b == 93 || ac2.var_ar_a.var_int_b == 90 || ac2.var_ar_a.var_int_b == 107 || ac2.var_ar_a.var_int_b == 112 || ac2.var_ar_a.var_int_b == 117 || ac2.var_ar_a.var_int_b == 133 || ac2.var_ar_a.var_int_b == 123 || ac2.var_ar_a.var_int_b == 128 || ac2.var_ar_a.var_int_b == 143 || ac2.var_ar_a.var_byte_e == 4 || ac2.var_ar_a.var_byte_e == 5) {
                    nArray[0] = Integer.MIN_VALUE;
                    nArray[1] = Integer.MIN_VALUE;
                    nArray[2] = Integer.MAX_VALUE;
                    nArray[3] = Integer.MAX_VALUE;
                    continue;
                }
                if (n8 == 0) {
                    nArray[0] = ac2.var_int_arr_d[0];
                    nArray[1] = ac2.var_int_arr_d[1];
                    nArray[2] = ac2.var_int_arr_d[2];
                    nArray[3] = ac2.var_int_arr_d[3];
                } else {
                    nArray[0] = ac2.var_ar_a.var_int_arr_d[0];
                    nArray[1] = ac2.var_ar_a.var_int_arr_d[1];
                    nArray[2] = ac2.var_ar_a.var_int_arr_d[2];
                    nArray[3] = ac2.var_ar_a.var_int_arr_d[3];
                }
                n7 = ac2.var_ar_a.var_k_arr_a.length;
                for (n9 = 0; n9 < n7; ++n9) {
                    int n10;
                    k k2 = ac2.var_ar_a.var_k_arr_a[n9];
                    int[] nArray2 = k2.var_au_a.var_int_arr_a;
                    int n11 = nArray2[0] + k2.var_as_b.var_int_a;
                    int n12 = k2.var_au_a.var_int_arr_a[0] + k2.var_as_a.var_int_a;
                    if (n11 < n12) {
                        n12 = n11;
                    }
                    if ((n11 = nArray2[1] + k2.var_as_b.b) < (n6 = nArray2[1] + k2.var_as_a.b)) {
                        n6 = n11;
                    }
                    if ((n11 = nArray2[2] + k2.var_as_b.var_int_a) > (n5 = nArray2[2] + k2.var_as_a.var_int_a)) {
                        n5 = n11;
                    }
                    if ((n11 = nArray2[3] + k2.var_as_b.b) > (n10 = nArray2[3] + k2.var_as_a.b)) {
                        n10 = n11;
                    }
                    if (nArray[2] < n12 || nArray[0] > n5 || nArray[3] < n6 || nArray[1] > n10) continue;
                    int[] nArray3 = k2.var_au_a.a();
                    n4 = (k2.var_as_b.var_int_a - k2.var_as_a.var_int_a) / k2.var_int_b * (Main.var_int_c - 1);
                    int n13 = (k2.var_as_b.b - k2.var_as_a.b) / k2.var_int_b * (Main.var_int_c - 1);
                    if (n4 < 0) {
                        n4 = -n4;
                    }
                    if (n13 < 0) {
                        n13 = -n13;
                    }
                    nArray3[0] = nArray3[0] - ++n4;
                    nArray3[1] = nArray3[1] - (++n13 + 32768);
                    nArray3[2] = nArray3[2] + n4;
                    nArray3[3] = nArray3[3] + n13;
                    if (k2.var_au_a.var_int_a > 0) {
                        nArray3[3] = nArray3[3] + 98304;
                    }
                    if (nArray3[0] < nArray[0]) {
                        nArray[0] = nArray3[0];
                    }
                    if (nArray3[1] < nArray[1]) {
                        nArray[1] = nArray3[1];
                    }
                    if (nArray3[2] > nArray[2]) {
                        nArray[2] = nArray3[2];
                    }
                    if (nArray3[3] <= nArray[3]) continue;
                    nArray[3] = nArray3[3];
                }
                nArray[0] = nArray[0] >> 15;
                nArray[1] = nArray[1] >> 15;
                nArray[2] = (nArray[2] >> 15) + 1;
                nArray[3] = (nArray[3] >> 15) + 1;
                if (ac2.var_ar_a.var_byte_b == 2) {
                    if (nArray[2] - nArray[0] < 6) {
                        n9 = nArray[2] - nArray[0] >> 1;
                        nArray[0] = nArray[0] - n9;
                        nArray[2] = nArray[2] + n9;
                    }
                    if (nArray[3] - nArray[1] < 7) {
                        n9 = nArray[3] - nArray[1] >> 1;
                        nArray[1] = nArray[1] - n9;
                        nArray[3] = nArray[3] + n9;
                    }
                }
                nArray[0] = nArray[0] << 15;
                nArray[1] = nArray[1] << 15;
                nArray[2] = (nArray[2] << 15) - 1;
                nArray[3] = (nArray[3] << 15) - 1;
            }
            for (n3 = 0; this.var_ar_a.var_byte_d == 0 && n3 < Main.var_int_c; ++n3) {
                int n14;
                int n15;
                int n16;
                int n17;
                int n18;
                int n19;
                int n20;
                int n21;
                int n22;
                int n23;
                ab ab2;
                int n24;
                Object object;
                int n25;
                int n26;
                int n27 = 0;
                int n28 = this.var_ar_a.var_q_arr_a.length;
                for (n26 = 0; n26 < n28; ++n26) {
                    if (!this.boolean_a(this.var_ar_a.var_q_arr_a[n26].var_am_a.int_arr_a())) continue;
                    this.var_ar_a.var_q_arr_a[n26].void_a();
                    if (!this.var_ar_a.var_q_arr_a[n26].var_boolean_c) continue;
                    ++n27;
                    if (this.var_ar_a.var_byte_d != this.var_ar_a.var_byte_c || this.var_ar_a.var_byte_e != 5) continue;
                    this.var_ar_a.var_byte_d = (byte)5;
                    if (this.var_ar_a.var_byte_b == 2) {
                        this.var_ar_a.var_byte_a = (byte)3;
                    }
                    int n29 = n26;
                    this.var_ar_a.var_int_arr_e[n29] = this.var_ar_a.var_int_arr_e[n29] + 1;
                    this.var_ar_a.var_int_a = n26;
                }
                if (this.var_ar_a.var_byte_d == this.var_ar_a.var_byte_c && n27 == 1 && this.var_ar_a.var_byte_b == 1 || n27 == 2 && this.var_ar_a.var_byte_e != 4 && this.var_ar_a.var_byte_e != 5) {
                    this.var_ar_a.var_byte_d = (byte)5;
                    if (this.var_ar_a.var_byte_b == 2) {
                        this.var_ar_a.var_byte_a = (byte)3;
                    }
                    for (n26 = 0; n26 < this.var_ar_a.var_q_arr_a.length; ++n26) {
                        if (this.var_ar_a.var_q_arr_a[n26].var_byte_a != 0 && this.var_ar_a.var_q_arr_a[n26].var_byte_e != 0) continue;
                        this.var_ar_a.h += this.var_ar_a.var_int_arr_e[n26];
                        this.var_ar_a.j += this.var_ar_a.var_int_arr_f[n26];
                    }
                    this.var_ar_a.i += this.var_ar_a.k;
                }
                n28 = this.var_ar_a.var_ai_arr_a.length;
                for (n26 = 0; n26 < n28; ++n26) {
                    ai ai2 = this.var_ar_a.var_ai_arr_a[n26];
                    if (ai2.var_byte_a == 2) continue;
                    if (this.boolean_a(ai2.int_arr_a())) {
                        ai2.void_a();
                        continue;
                    }
                    if (ai2.var_int_a <= 0) continue;
                    ai2.b();
                    ai2.var_byte_a = (byte)2;
                }
                n28 = this.var_ar_a.var_ap_arr_a.length;
                for (n26 = 0; n26 < n28; ++n26) {
                    ap ap2 = this.var_ar_a.var_ap_arr_a[n26];
                    if (ap2.var_byte_a != 2 && this.boolean_a(ap2.var_am_a.int_arr_a())) {
                        boolean bl;
                        block206: {
                            n8 = ap2.var_ar_a.a(ap2.var_am_a.int_arr_a());
                            if (n8 != -1) {
                                if (!ap2.var_boolean_b && ap2.var_ar_a.var_ac_a.g > 0 && y.a(ap2.var_ar_a.var_ac_a.var_int_arr_d, ap2.var_am_a.int_arr_a())) {
                                    ap2.var_ar_a.var_ac_a.a(ap2.var_am_a.as_a().var_int_a >> 10, n8 << 5, 2);
                                }
                                ap2.var_boolean_b = true;
                                ap2.var_am_a.a(n8 << 15, ap2.var_ar_a.var_ac_a.var_int_a == 2 && ap2.var_byte_b == 0 ? 600 : (ap2.var_ar_a.var_ac_a.var_int_a == 2 && ap2.var_byte_b == 1 ? 3000 : 200), 6, ap2.var_am_a.var_s_arr_a.length <= 4 && ap2.var_byte_b != 1);
                            } else {
                                ap2.var_boolean_b = false;
                            }
                            if (ap2.var_ar_a.var_int_b == 112 && ap2.var_ar_a.var_ac_a.var_int_c == 1) {
                                as as2 = ap2.var_am_a.as_a();
                                n7 = as2.var_int_a >> 15;
                                n25 = as2.b >> 15;
                                int n30 = ap2.var_am_a.var_s_arr_a[2].var_as_a.b - ap2.var_am_a.var_s_arr_a[3].var_as_a.b;
                                if ((n30 < 0 ? -n30 : n30) < 2048 && ap2.var_ar_a.var_byte_arr_arr_arr_a[1][n7 - 1][n25 + 1] == 44) {
                                    ap2.var_ar_a.var_ac_a.var_int_c = 3;
                                }
                            }
                            if (ap2.var_byte_b == 9 || ap2.var_am_a.var_am_arr_a != null || ap2.var_am_a.var_t_arr_c != null || (ap2.var_am_a.d & 2) == 0) continue;
                            object = ap2.var_am_a;
                            n24 = ((am)object).var_s_arr_a.length;
                            as as3 = ((am)object).var_s_arr_a[n24 - 1].var_as_a;
                            as as4 = ((am)object).var_s_arr_a[n24 - 2].var_as_a;
                            for (n5 = 0; n5 < n24; ++n5) {
                                as as5 = ((am)object).var_s_arr_a[n5].var_as_a;
                                long l2 = as3.var_int_a - as4.var_int_a;
                                long l3 = as5.b - as3.b;
                                long l4 = as3.b - as4.b;
                                long l5 = as5.var_int_a - as3.var_int_a;
                                if ((int)(l2 * l3 - l4 * l5 >> 10) < 0) {
                                    bl = false;
                                    break block206;
                                }
                                as4 = as3;
                                as3 = as5;
                            }
                            bl = true;
                        }
                        if (bl) continue;
                        ap2.var_ar_a.var_ab_a.a(ap2.var_am_a.i);
                        ap2.b();
                        continue;
                    }
                    if (ap2.var_byte_a != 2) continue;
                    int[] nArray = ap2.var_am_a.int_arr_a();
                    int[] nArray4 = nArray;
                    nArray[0] = nArray4[2] = ap2.var_int_b << 15;
                    nArray4[1] = nArray4[3] = ap2.var_int_c << 15;
                    if (this.var_ar_a.var_ab_a.var_ak_a.a(-1, this.var_ar_a.var_ab_a.var_int_b, nArray4, false)[0] != 0 || this.var_ar_a.var_ab_a.var_ak_b.a(-1, this.var_ar_a.var_ab_a.var_int_a, nArray4, false)[0] != 0) continue;
                    ap2.a();
                }
                n28 = this.var_ar_a.var_k_arr_a.length;
                block8: for (n26 = 0; n26 < n28; ++n26) {
                    Object object2 = this.var_ar_a.var_k_arr_a[n26].var_au_a.a();
                    for (n8 = 0; n8 < this.var_ar_a.var_int_arr_arr_a.length; ++n8) {
                        Object object3;
                        if (!y.b(this.var_ar_a.var_int_arr_arr_a[n8], object2)) continue;
                        k k3 = this.var_ar_a.var_k_arr_a[n26];
                        object2 = k3;
                        if (!k3.var_boolean_a) continue block8;
                        ++object2.var_int_a;
                        if (object2.var_int_a >= object2.var_int_b << 1) {
                            object2.var_int_a = 0;
                            if (object2.var_byte_a == 2 || object2.var_byte_a == 1) {
                                object3 = object2;
                                object2.var_boolean_a = false;
                            }
                        } else if (object2.var_int_a == object2.var_int_b && object2.var_byte_a == 1) {
                            object3 = object2;
                            object2.var_boolean_a = false;
                        }
                        if (object2.var_ar_a.var_ab_a == null) continue block8;
                        if (object2.var_int_a < object2.var_int_b) {
                            object2.var_au_a.a(new as(object2.var_as_a.var_int_a + (object2.var_as_b.var_int_a - object2.var_as_a.var_int_a) * object2.var_int_a / object2.var_int_b, object2.var_as_a.b + (object2.var_as_b.b - object2.var_as_a.b) * object2.var_int_a / object2.var_int_b));
                            continue block8;
                        }
                        n8 = (object2.var_int_b << 1) - object2.var_int_a;
                        object2.var_au_a.a(new as(object2.var_as_a.var_int_a + (object2.var_as_b.var_int_a - object2.var_as_a.var_int_a) * n8 / object2.var_int_b, object2.var_as_a.b + (object2.var_as_b.b - object2.var_as_a.b) * n8 / object2.var_int_b));
                        continue block8;
                    }
                }
                n28 = this.var_ar_a.var_bb_arr_a.length;
                block10: for (n26 = 0; n26 < n28; ++n26) {
                    for (int i2 = 0; i2 < this.var_ar_a.var_int_arr_arr_a.length; ++i2) {
                        if (!y.b(this.var_ar_a.var_int_arr_arr_a[i2], this.var_ar_a.var_bb_arr_a[n26].var_int_arr_a)) continue;
                        this.var_ar_a.var_bb_arr_a[n26].var_boolean_a = false;
                        continue block10;
                    }
                }
                ab ab3 = ab2 = this.var_ar_a.var_ab_a;
                object = ab2;
                if (ab2.var_int_arr_a != null) {
                    n24 = ((ab)object).var_int_arr_a[0];
                    for (int i3 = 1; i3 <= n24; ++i3) {
                        ((ab)object).var_am_arr_a[((ab)object).var_int_arr_a[i3]].d &= 0xFFFFFFEF;
                    }
                }
                ((ab)object).var_int_arr_a = null;
                ((ab)object).var_int_arr_b = null;
                ab3.a();
                as as6 = new as(0, ab3.e);
                n7 = ab3.var_int_arr_a[0];
                for (n25 = 1; n25 <= n7; ++n25) {
                    int n31;
                    am am2 = ab3.var_am_arr_a[ab3.var_int_arr_a[n25]];
                    object = am2;
                    if (am2.var_int_a > 0) {
                        Object object4 = object;
                        if (((am)object4).var_int_a > 0) {
                            n31 = ((am)object4).int_a();
                            if (n31 < 0) {
                                n31 = -n31;
                            }
                            if (n31 < 32768) {
                                n31 = 32768;
                            }
                            n5 = ((am)object4).var_s_arr_a.length;
                            n4 = 0;
                            int n32 = n5 - 1;
                            while (n4 < n5) {
                                s s2 = ((am)object4).var_s_arr_a[n32];
                                s s3 = ((am)object4).var_s_arr_a[n4];
                                n23 = s3.var_as_a.b - s2.var_as_a.b;
                                int n33 = s2.var_as_a.var_int_a - s3.var_as_a.var_int_a;
                                n22 = (int)((long)n23 * (long)((am)object4).var_int_a / (long)n31);
                                int n34 = (int)((long)n33 * (long)((am)object4).var_int_a / (long)n31);
                                s2.c.var_int_a += n22;
                                s2.c.b += n34;
                                s3.c.var_int_a += n22;
                                s3.c.b += n34;
                                n32 = n4++;
                            }
                        }
                    }
                    am2.b(as6);
                    if (am2.var_s_arr_c == null) continue;
                    as as7 = as6;
                    object = am2;
                    for (n31 = 0; n31 < ((am)object).var_s_arr_c.length; ++n31) {
                        if (((am)object).var_s_arr_c[n31] == null) continue;
                        ((am)object).var_s_arr_c[n31].a(as7);
                    }
                }
                n7 = ab3.var_int_arr_b[0];
                for (n25 = 1; n25 <= n7; ++n25) {
                    ab3.var_aa_arr_a[ab3.var_int_arr_b[n25]].var_s_a.a(as6);
                }
                ab3 = ab2;
                ab3.a();
                int n35 = ab3.var_int_arr_a[0];
                for (n7 = 1; n7 <= n35; ++n7) {
                    int n36;
                    am am3 = ab3.var_am_arr_a[ab3.var_int_arr_a[n7]];
                    if (am3.var_s_arr_c != null) {
                        for (n36 = 0; n36 < am3.var_s_arr_c.length; ++n36) {
                            if (am3.var_s_arr_c[n36] == null) continue;
                            if ((am3.var_s_arr_c[n36].var_int_b & 0x10) != 0) {
                                am3.var_s_arr_c[n36] = null;
                                continue;
                            }
                            am3.var_s_arr_c[n36].a();
                        }
                    }
                    am3.d();
                    n36 = am3.var_s_arr_a.length;
                    for (int i4 = 0; i4 < n36; ++i4) {
                        am3.var_s_arr_a[i4].a();
                    }
                }
                n35 = ab3.var_int_arr_b[0];
                for (n7 = 1; n7 <= n35; ++n7) {
                    ab3.var_aa_arr_a[ab3.var_int_arr_b[n7]].var_s_a.a();
                }
                ab3 = ab2;
                ab3.a();
                n35 = ab3.var_int_arr_a[0];
                for (n7 = 1; n7 <= n35; ++n7) {
                    int n37;
                    int n38;
                    am am4 = ab3.var_am_arr_a[ab3.var_int_arr_a[n7]];
                    if ((am4.d & 4) == 0 || (n38 = am4.e - ((n37 = am4.int_a()) < 0 ? -n37 : n37)) == 0) continue;
                    long l6 = ((long)n38 << 10) / (long)am4.f;
                    n5 = am4.var_s_arr_a.length;
                    int n39 = am4.var_s_arr_a[n5 - 1].var_as_a.var_int_a;
                    int n40 = am4.var_s_arr_a[n5 - 1].var_as_a.b;
                    n4 = am4.var_s_arr_a[0].var_as_a.var_int_a;
                    int n41 = am4.var_s_arr_a[0].var_as_a.b;
                    for (n22 = 0; n22 < n5; ++n22) {
                        int n42;
                        if (n22 == n5 - 1) {
                            n23 = n4;
                            n42 = n41;
                        } else {
                            n23 = am4.var_s_arr_a[n22 + 1].var_as_a.var_int_a;
                            n42 = am4.var_s_arr_a[n22 + 1].var_as_a.b;
                        }
                        int n43 = n39 - n23;
                        int n44 = n42 - n40;
                        int n45 = y.int_a(n44, n43);
                        n39 = am4.var_s_arr_a[n22].var_as_a.var_int_a;
                        n40 = am4.var_s_arr_a[n22].var_as_a.b;
                        if (n45 == 0) continue;
                        am4.var_s_arr_a[n22].var_as_a.var_int_a += (int)(l6 * (long)n44 / (long)n45);
                        am4.var_s_arr_a[n22].var_as_a.b += (int)(l6 * (long)n43 / (long)n45);
                    }
                }
                ab3 = ab2;
                ab3.a();
                n35 = ab3.var_int_arr_a[0];
                for (n7 = 1; n7 <= n35; ++n7) {
                    am am5 = ab3.var_am_arr_a[ab3.var_int_arr_a[n7]];
                    if ((am5.var_int_b & 1) == 0) continue;
                    am5.e();
                }
                ab3 = ab2;
                ab3.a();
                n35 = ab3.var_int_arr_a[0];
                for (n7 = 1; n7 <= n35; ++n7) {
                    if (ab3.var_am_arr_a[ab3.var_int_arr_a[n7]].var_t_arr_c == null) continue;
                    am am6 = ab3.var_am_arr_a[ab3.var_int_arr_a[n7]];
                    for (int i5 = 0; i5 < am6.var_t_arr_c.length; ++i5) {
                        if (am6.var_t_arr_c[i5] == null || !am6.var_t_arr_c[i5].a(true)) continue;
                        t t2 = am6.var_t_arr_c[i5];
                        if ((t2.var_s_a.var_int_b & 0x20) != 0) {
                            t2.var_s_a.var_int_b |= 0x10;
                        }
                        if (t2.var_s_b != null && (t2.var_s_b.var_int_b & 0x20) != 0) {
                            t2.var_s_b.var_int_b |= 0x10;
                        }
                        t2.var_s_a = null;
                        am6.var_t_arr_c[i5] = null;
                    }
                }
                for (n7 = 1; n7 <= n35; ++n7) {
                    boolean bl;
                    int n46;
                    am am7;
                    am am8;
                    block207: {
                        int n47;
                        int n48;
                        am7 = am8 = ab3.var_am_arr_a[ab3.var_int_arr_a[n7]];
                        boolean bl2 = (am8.var_int_b & 4) != 0 && (am7.var_int_b & 8) != 0;
                        for (n46 = 0; n46 < am7.h; ++n46) {
                            n48 = am7.var_t_arr_a.length;
                            for (n47 = 0; n47 < n48; ++n47) {
                                if (!am7.var_t_arr_a[n47].a(bl2)) continue;
                                am7.d |= 0x20;
                                bl = true;
                                break block207;
                            }
                        }
                        if ((am7.d & 0x80) != 0) {
                            n46 = 0;
                            n48 = 0;
                            n47 = am7.var_s_arr_a.length;
                            for (n5 = 0; n5 < n47; ++n5) {
                                n46 += am7.var_s_arr_a[n5].var_as_a.var_int_a;
                                n48 += am7.var_s_arr_a[n5].var_as_a.b;
                            }
                            n46 = am7.var_as_c.var_int_a - n46 / am7.var_s_arr_a.length;
                            n48 = am7.var_as_c.b - n48 / am7.var_s_arr_a.length;
                            for (n5 = 0; n5 < n47; ++n5) {
                                am7.var_s_arr_a[n5].var_as_a.var_int_a += n46;
                                am7.var_s_arr_a[n5].var_as_a.b += n48;
                            }
                        }
                        bl = false;
                    }
                    if (bl) {
                        am8.void_c();
                        if (ab3.var_ar_a != null) {
                            ab3.var_ar_a.a(am8);
                        }
                        ab3.a(ab3.var_int_arr_a[n7]);
                        --n7;
                        --n35;
                        continue;
                    }
                    if ((am8.d & 1) == 0) continue;
                    am7 = am8;
                    for (n46 = 0; n46 < am7.g; ++n46) {
                        t t3 = am7.var_t_arr_b[n46];
                        if (!t3.a(true)) continue;
                        if (n46 < am7.g - 1) {
                            am7.var_t_arr_b[n46] = am7.var_t_arr_b[am7.g - 1];
                        }
                        --am7.g;
                        am7.var_t_arr_b[am7.g] = null;
                        --n46;
                        t3.a();
                        t3.var_s_a = null;
                    }
                }
                for (n7 = 0; n7 < ab3.var_int_a; ++n7) {
                    au au2 = ab3.var_au_arr_a[n7];
                    for (int i6 = 0; i6 < au2.var_int_a; ++i6) {
                        as as8 = au2.var_as_arr_b[i6];
                        if (as8.var_int_a != Integer.MAX_VALUE) continue;
                        --au2.var_int_a;
                        au2.var_as_arr_b[i6] = null;
                        if (i6 != au2.var_int_a) {
                            au2.var_as_arr_b[i6] = au2.var_as_arr_b[au2.var_int_a];
                            au2.var_as_arr_b[au2.var_int_a] = null;
                        }
                        --i6;
                    }
                }
                ab3 = ab2;
                ab3.a();
                n35 = ab3.var_int_arr_a[0];
                for (n7 = 1; n7 <= n35; ++n7) {
                    int n49;
                    am am9;
                    am am10 = am9 = ab3.var_am_arr_a[ab3.var_int_arr_a[n7]];
                    am9.var_int_b = 0;
                    int n50 = am10.var_s_arr_a.length;
                    for (n49 = 0; n49 < n50; ++n49) {
                        am10.var_s_arr_a[n49].var_int_b &= 0xFFFFFFBC;
                    }
                    ak ak2 = ab3.var_ak_a;
                    am10 = am9;
                    n49 = am10.var_int_arr_a[0];
                    int n51 = am10.var_int_arr_a[1];
                    int n52 = am10.var_int_arr_a[2];
                    n5 = am10.var_int_arr_a[3];
                    am10.var_boolean_a = true;
                    am10.int_arr_a();
                    ak2.a(am10.i, n49, n51, n52, n5, am10.var_int_arr_a[0], am10.var_int_arr_a[1], am10.var_int_arr_a[2], am10.var_int_arr_a[3]);
                }
                n35 = ab3.var_int_arr_b[0];
                for (n7 = 1; n7 <= n35; ++n7) {
                    aa aa2;
                    aa aa3 = aa2 = ab3.var_aa_arr_a[ab3.var_int_arr_b[n7]];
                    aa2.var_s_a.var_int_b &= 0xFFFFFFBC;
                    ak ak3 = ab3.var_ak_c;
                    aa3 = aa2;
                    int n53 = aa3.var_int_arr_a[0];
                    int n54 = aa3.var_int_arr_a[1];
                    int n55 = aa3.var_int_arr_a[2];
                    n5 = aa3.var_int_arr_a[3];
                    aa3.var_boolean_a = true;
                    aa3.a();
                    ak3.a(aa3.c, n53, n54, n55, n5, aa3.var_int_arr_a[0], aa3.var_int_arr_a[1], aa3.var_int_arr_a[2], aa3.var_int_arr_a[3]);
                }
                ab3 = ab2;
                ab3.a();
                for (int i7 = 1; i7 <= ab3.var_int_arr_a[0]; ++i7) {
                    am am11 = ab3.var_am_arr_a[ab3.var_int_arr_a[i7]];
                    int[] nArray = am11.int_arr_a();
                    int[] nArray5 = ab3.var_ak_a.a(ab3.var_int_arr_a[i7], ab3.var_int_b, nArray, false);
                    for (int i8 = 1; i8 <= nArray5[0]; ++i8) {
                        am am12 = ab3.var_am_arr_a[nArray5[i8]];
                        int n56 = 0;
                        if ((am11.d & 2) != 0 && (am12.d & 2) != 0) {
                            if (y.a(nArray, am12.int_arr_a())) {
                                int n57;
                                block208: {
                                    int n58;
                                    int[] nArray6;
                                    s[] sArray;
                                    s[] sArray2;
                                    am am13 = am12;
                                    am am14 = am11;
                                    ab ab4 = ab3;
                                    int[][] nArray7 = new int[am14.var_s_arr_a.length + am13.var_s_arr_a.length][2];
                                    int[] nArray8 = new int[nArray7.length];
                                    n21 = 0;
                                    n56 = am14.var_s_arr_a.length;
                                    int n59 = 0;
                                    int n60 = n56 - 1;
                                    while (n59 < n56) {
                                        nArray7[n21][0] = am14.var_s_arr_a[n60].var_as_a.b - am14.var_s_arr_a[n59].var_as_a.b;
                                        nArray7[n21][1] = am14.var_s_arr_a[n59].var_as_a.var_int_a - am14.var_s_arr_a[n60].var_as_a.var_int_a;
                                        if (!ab.a(am14.var_s_arr_a, am13.var_s_arr_a, nArray7, nArray8, n21)) {
                                            n57 = 0;
                                            break block208;
                                        }
                                        ++n21;
                                        n60 = n59++;
                                    }
                                    n56 = am13.var_s_arr_a.length;
                                    n59 = 0;
                                    n60 = n56 - 1;
                                    while (n59 < n56) {
                                        sArray2 = am13.var_s_arr_a[n59].var_as_a;
                                        sArray = am13.var_s_arr_a[n60].var_as_a;
                                        nArray7[n21][0] = sArray.b - sArray2.b;
                                        nArray7[n21][1] = sArray2.var_int_a - sArray.var_int_a;
                                        if (!ab.a(am14.var_s_arr_a, am13.var_s_arr_a, nArray7, nArray8, n21)) {
                                            n57 = 0;
                                            break block208;
                                        }
                                        ++n21;
                                        n60 = n59++;
                                    }
                                    as as9 = new as();
                                    int[] nArray9 = nArray6 = new int[1];
                                    as as10 = as9;
                                    n5 = n21;
                                    int[] nArray10 = nArray8;
                                    int[][] nArray11 = nArray7;
                                    int n61 = -1;
                                    int n62 = 0;
                                    for (int i9 = 0; i9 < n5; ++i9) {
                                        int n63 = y.int_a(nArray11[i9][0], nArray11[i9][1]);
                                        nArray10[i9] = n63 == 0 ? Integer.MAX_VALUE : (int)(((long)nArray10[i9] << 10) / (long)n63);
                                        if (n61 != -1 && nArray10[i9] >= nArray9[0]) continue;
                                        n61 = i9;
                                        n62 = n63;
                                        nArray9[0] = nArray10[i9];
                                        as10.var_int_a = nArray11[i9][0];
                                        as10.b = nArray11[i9][1];
                                    }
                                    n56 = n62;
                                    if (n56 != 0) {
                                        as9.c(n56);
                                    }
                                    sArray2 = new s[2];
                                    sArray = new s[2];
                                    n4 = ab.a(as9, am14.var_s_arr_a, sArray2);
                                    int n64 = ab.a(as9.as_a(), am13.var_s_arr_a, sArray);
                                    n22 = 0;
                                    int n65 = 0;
                                    n20 = 0;
                                    n19 = 0;
                                    n18 = 0;
                                    n17 = 0;
                                    for (n16 = 0; n16 < n4; ++n16) {
                                        n22 = sArray2[n16].var_int_a == Integer.MAX_VALUE ? Integer.MAX_VALUE : (n22 += sArray2[n16].var_int_a);
                                        n20 += sArray2[n16].var_as_a.var_int_a - sArray2[n16].var_as_b.var_int_a;
                                        n19 += sArray2[n16].var_as_a.b - sArray2[n16].var_as_b.b;
                                    }
                                    if (n4 == 2) {
                                        if (n22 != Integer.MAX_VALUE) {
                                            n22 >>= 1;
                                        }
                                        n20 >>= 1;
                                        n19 >>= 1;
                                    }
                                    for (n16 = 0; n16 < n64; ++n16) {
                                        n65 = sArray[n16].var_int_a == Integer.MAX_VALUE ? Integer.MAX_VALUE : (n65 += sArray[n16].var_int_a);
                                        n18 += sArray[n16].var_as_a.var_int_a - sArray[n16].var_as_b.var_int_a;
                                        n17 += sArray[n16].var_as_a.b - sArray[n16].var_as_b.b;
                                    }
                                    if (n64 == 2) {
                                        if (n65 != Integer.MAX_VALUE) {
                                            n65 >>= 1;
                                        }
                                        n18 >>= 1;
                                        n17 >>= 1;
                                    }
                                    n22 = (int)(((long)n22 << 10) / (long)(n22 + n65));
                                    n16 = 0;
                                    n15 = 0;
                                    n56 = 0;
                                    n65 = 0;
                                    n14 = am14.var_int_c + am13.var_int_c >> 1;
                                    if (n14 != 0) {
                                        n19 = -as9.b * (n20 - n18) + as9.var_int_a * (n19 - n17) >> 10;
                                        n20 = -as9.b * n19 >> 10;
                                        n19 = as9.var_int_a * n19 >> 10;
                                        if (n14 != 1024) {
                                            n20 = n20 * n14 >> 10;
                                            n19 = n19 * n14 >> 10;
                                        }
                                        n16 = n20 * (1024 - n22) >> 10;
                                        n15 = n19 * (1024 - n22) >> 10;
                                        n56 = n20 * -n22 >> 10;
                                        n65 = n19 * -n22 >> 10;
                                    }
                                    as9.var_int_a = as9.var_int_a * nArray6[0] >> 10;
                                    as9.b = as9.b * nArray6[0] >> 10;
                                    n19 = as9.var_int_a * (1024 - n22) >> 10;
                                    n20 = as9.b * (1024 - n22) >> 10;
                                    n18 = as9.var_int_a * -n22 >> 10;
                                    n22 = as9.b * -n22 >> 10;
                                    n17 = 1024;
                                    int n66 = 1024;
                                    if (n4 == 2 && n64 == 2) {
                                        n17 = Integer.MIN_VALUE;
                                        int n67 = sArray2[0].var_as_a.var_int_a - sArray2[1].var_as_a.var_int_a;
                                        int n68 = sArray2[0].var_as_a.b - sArray2[1].var_as_a.b;
                                        n5 = (int)((long)n67 * (long)n67 + (long)n68 * (long)n68 >> 10);
                                        if (n5 == 0) {
                                            n17 = 0;
                                        } else {
                                            int n69 = (int)(((long)(sArray[0].var_as_a.var_int_a - sArray2[1].var_as_a.var_int_a) * (long)n67 + (long)(sArray[0].var_as_a.b - sArray2[1].var_as_a.b) * (long)n68) / (long)n5);
                                            n67 = (int)(((long)(sArray[1].var_as_a.var_int_a - sArray2[1].var_as_a.var_int_a) * (long)n67 + (long)(sArray[1].var_as_a.b - sArray2[1].var_as_a.b) * (long)n68) / (long)n5);
                                            if (n69 >= 0 && n69 <= 1024 && n67 >= 0 && n67 <= 1024) {
                                                n17 = n69 + n67 >> 1;
                                            } else if (n69 >= 0 && n69 <= 1024 && n67 < 0) {
                                                n17 = n69 >> 1;
                                            } else if (n69 >= 0 && n69 <= 1024 && n67 > 1024) {
                                                n17 = n69 + 1024 >> 1;
                                            } else if (n67 >= 0 && n67 <= 1024 && n69 < 0) {
                                                n17 = n67 >> 1;
                                            } else if (n67 >= 0 && n67 <= 1024 && n69 > 1024) {
                                                n17 = n67 + 1024 >> 1;
                                            } else if (n69 < 0 && n67 > 1024 || n69 > 1024 && n67 < 0) {
                                                n17 = 512;
                                            }
                                        }
                                        n66 = Integer.MIN_VALUE;
                                        n67 = sArray[0].var_as_a.var_int_a - sArray[1].var_as_a.var_int_a;
                                        n68 = sArray[0].var_as_a.b - sArray[1].var_as_a.b;
                                        n5 = (int)((long)n67 * (long)n67 + (long)n68 * (long)n68 >> 10);
                                        if (n5 == 0) {
                                            n66 = 0;
                                        } else {
                                            int n70 = (int)(((long)(sArray2[0].var_as_a.var_int_a - sArray[1].var_as_a.var_int_a) * (long)n67 + (long)(sArray2[0].var_as_a.b - sArray[1].var_as_a.b) * (long)n68) / (long)n5);
                                            n67 = (int)(((long)(sArray2[1].var_as_a.var_int_a - sArray[1].var_as_a.var_int_a) * (long)n67 + (long)(sArray2[1].var_as_a.b - sArray[1].var_as_a.b) * (long)n68) / (long)n5);
                                            if (n70 >= 0 && n70 <= 1024 && n67 >= 0 && n67 <= 1024) {
                                                n66 = n70 + n67 >> 1;
                                            } else if (n70 >= 0 && n70 <= 1024 && n67 < 0) {
                                                n66 = n70 >> 1;
                                            } else if (n70 >= 0 && n70 <= 1024 && n67 > 1024) {
                                                n66 = n70 + 1024 >> 1;
                                            } else if (n67 >= 0 && n67 <= 1024 && n70 < 0) {
                                                n66 = n67 >> 1;
                                            } else if (n67 >= 0 && n67 <= 1024 && n70 > 1024) {
                                                n66 = n67 + 1024 >> 1;
                                            } else if (n70 < 0 && n67 > 1024 || n70 > 1024 && n67 < 0) {
                                                n66 = 512;
                                            }
                                        }
                                    } else if (n4 == 2 && n64 == 1) {
                                        int n71 = sArray2[0].var_as_a.var_int_a - sArray2[1].var_as_a.var_int_a;
                                        int n72 = sArray2[0].var_as_a.b - sArray2[1].var_as_a.b;
                                        n5 = (int)((long)n71 * (long)n71 + (long)n72 * (long)n72 >> 10);
                                        if (n5 == 0) {
                                            n17 = 0;
                                        } else {
                                            n17 = (int)(((long)(sArray[0].var_as_a.var_int_a - sArray2[1].var_as_a.var_int_a) * (long)n71 + (long)(sArray[0].var_as_a.b - sArray2[1].var_as_a.b) * (long)n72) / (long)n5);
                                            if (n17 < 0) {
                                                n17 = 0;
                                            }
                                            if (n17 > 1024) {
                                                n17 = 1024;
                                            }
                                        }
                                    } else if (n4 == 1 && n64 == 2) {
                                        int n73 = sArray[0].var_as_a.var_int_a - sArray[1].var_as_a.var_int_a;
                                        int n74 = sArray[0].var_as_a.b - sArray[1].var_as_a.b;
                                        n5 = (int)((long)n73 * (long)n73 + (long)n74 * (long)n74 >> 10);
                                        if (n5 == 0) {
                                            n66 = 0;
                                        } else {
                                            n66 = (int)(((long)(sArray2[0].var_as_a.var_int_a - sArray[1].var_as_a.var_int_a) * (long)n73 + (long)(sArray2[0].var_as_a.b - sArray[1].var_as_a.b) * (long)n74) / (long)n5);
                                            if (n66 < 0) {
                                                n66 = 0;
                                            }
                                            if (n66 > 1024) {
                                                n66 = 1024;
                                            }
                                        }
                                    }
                                    if (sArray2[0].var_int_a == Integer.MAX_VALUE) {
                                        n17 = 0;
                                    } else if (n4 == 2 && sArray2[1].var_int_a == Integer.MAX_VALUE) {
                                        n17 = 1024;
                                    }
                                    if (sArray[0].var_int_a == Integer.MAX_VALUE) {
                                        n66 = 0;
                                    } else if (n64 == 2 && sArray[1].var_int_a == Integer.MAX_VALUE) {
                                        n66 = 1024;
                                    }
                                    for (n58 = 0; n58 < n4; ++n58) {
                                        if (n58 == 1) {
                                            sArray2[n58].var_as_a.var_int_a += n19 * (1024 - n17) >> 10;
                                            sArray2[n58].var_as_a.b += n20 * (1024 - n17) >> 10;
                                        } else {
                                            sArray2[n58].var_as_a.var_int_a += n19 * n17 >> 10;
                                            sArray2[n58].var_as_a.b += n20 * n17 >> 10;
                                        }
                                        if (n14 != 0) {
                                            sArray2[n58].var_as_b.var_int_a += n16;
                                            sArray2[n58].var_as_b.b += n15;
                                        }
                                        sArray2[n58].var_int_b |= 1;
                                    }
                                    for (n58 = 0; n58 < n64; ++n58) {
                                        if (n58 == 1) {
                                            sArray[n58].var_as_a.var_int_a += n18 * (1024 - n66) >> 10;
                                            sArray[n58].var_as_a.b += n22 * (1024 - n66) >> 10;
                                        } else {
                                            sArray[n58].var_as_a.var_int_a += n18 * n66 >> 10;
                                            sArray[n58].var_as_a.b += n22 * n66 >> 10;
                                        }
                                        if (n14 != 0) {
                                            sArray[n58].var_as_b.var_int_a += n56;
                                            sArray[n58].var_as_b.b += n65;
                                        }
                                        sArray[n58].var_int_b |= 1;
                                    }
                                    n57 = 1;
                                }
                                n56 = n57;
                            }
                        } else if (y.a(nArray, am12.int_arr_a())) {
                            n56 = ab.a(am11, am12);
                            int n75 = n56 = ab.a(am12, am11) || n56 != 0 ? 1 : 0;
                        }
                        if (n56 == 0) continue;
                        am11.var_int_b |= 1;
                        am12.var_int_b |= 1;
                        ar.a(am11, am12);
                    }
                }
                int[] nArray = new int[4];
                for (n6 = 1; n6 <= ab3.var_int_arr_b[0]; ++n6) {
                    int n76;
                    int n77;
                    int n78;
                    aa aa4 = ab3.var_aa_arr_a[ab3.var_int_arr_b[n6]];
                    if (aa4.var_boolean_b) continue;
                    nArray[0] = aa4.var_s_a.var_as_a.var_int_a - aa4.var_int_a;
                    nArray[1] = aa4.var_s_a.var_as_a.b - aa4.var_int_a;
                    nArray[2] = aa4.var_s_a.var_as_a.var_int_a + aa4.var_int_a;
                    nArray[3] = aa4.var_s_a.var_as_a.b + aa4.var_int_a;
                    int[] nArray12 = ab3.var_ak_c.a(ab3.var_int_arr_b[n6], ab3.var_int_c, nArray, false);
                    for (n5 = 1; n5 <= nArray12[0]; ++n5) {
                        aa aa5 = ab3.var_aa_arr_a[nArray12[n5]];
                        if (aa5.var_boolean_b) continue;
                        int n79 = aa4.var_s_a.var_as_a.var_int_a - aa5.var_s_a.var_as_a.var_int_a;
                        n78 = aa4.var_s_a.var_as_a.b - aa5.var_s_a.var_as_a.b;
                        n4 = aa4.var_int_a + aa5.var_int_a;
                        int n80 = (int)((long)n79 * (long)n79 + (long)n78 * (long)n78 >> 10);
                        if (n80 == 0 || n80 >= (int)((long)n4 * (long)n4 >> 10)) continue;
                        int n81 = y.int_a(n79, n78);
                        n79 = (int)(((long)n79 << 10) / (long)n81);
                        n78 = (int)(((long)n78 << 10) / (long)n81);
                        n77 = n4 - n81;
                        if (aa4.var_s_a.var_int_a == aa5.var_s_a.var_int_a) {
                            n22 = n76 = n77 >> 1;
                        } else {
                            n22 = (int)((long)aa5.var_s_a.var_int_a * (long)n77 / (long)(aa4.var_s_a.var_int_a + aa5.var_s_a.var_int_a));
                            n76 = n77 - n22;
                        }
                        aa4.var_s_a.var_as_a.var_int_a += n79 * n22 >> 10;
                        aa4.var_s_a.var_as_a.b += n78 * n22 >> 10;
                        aa5.var_s_a.var_as_a.var_int_a -= n79 * n76 >> 10;
                        aa5.var_s_a.var_as_a.b -= n78 * n76 >> 10;
                        aa4.var_s_a.var_int_b |= 1;
                        aa5.var_s_a.var_int_b |= 1;
                    }
                    nArray12 = ab3.var_ak_a.a(-1, ab3.var_int_b, nArray, false);
                    for (n5 = 1; n5 <= nArray12[0]; ++n5) {
                        am am15 = ab3.var_am_arr_a[nArray12[n5]];
                        if (!y.a(nArray, am15.int_arr_a())) continue;
                        int n82 = aa4.var_int_b;
                        s[] sArray = am15.var_s_arr_a;
                        n28 = aa4.var_int_a;
                        s s4 = aa4.var_s_a;
                        boolean bl = false;
                        n21 = 0;
                        int n83 = sArray.length - 1;
                        while (n21 < sArray.length) {
                            s s5 = s4;
                            s s6 = sArray[n21];
                            s s7 = sArray[n83];
                            n78 = s5.var_as_a.var_int_a - s7.var_as_a.var_int_a;
                            n4 = s5.var_as_a.b - s7.var_as_a.b;
                            n22 = y.int_a(n78, n4);
                            n77 = n28 - n22;
                            if (n77 >= 0) {
                                bl = true;
                                n76 = (int)(((long)(-n78) << 10) / (long)n22);
                                n20 = (int)(((long)(-n4) << 10) / (long)n22);
                                n19 = s5.var_int_a == Integer.MAX_VALUE ? 1024 : (s7.var_int_a == Integer.MAX_VALUE ? 0 : (s5.var_int_a == s7.var_int_a ? 512 : (s5.var_int_a == s7.var_int_a << 1 ? 682 : (s5.var_int_a == s7.var_int_a >> 1 ? 341 : (int)(((long)s5.var_int_a << 10) / (long)(s5.var_int_a + s7.var_int_a))))));
                                n18 = n19 - 1024;
                                if ((n76 != 0 || n20 != 0) && n82 != 0) {
                                    n17 = s5.var_as_a.var_int_a - s5.var_as_b.var_int_a - s7.var_as_a.var_int_a + s7.var_as_b.var_int_a;
                                    n16 = s5.var_as_a.b - s5.var_as_b.b - s7.var_as_a.b + s7.var_as_b.b;
                                    n15 = -n20 * n17 + n76 * n16 >> 10;
                                    if (n82 != 1024) {
                                        n15 = n15 * n82 >> 10;
                                    }
                                    n17 = -n20 * n15 >> 10;
                                    n16 = n76 * n15 >> 10;
                                    s5.var_as_b.var_int_a -= n17 * n18 >> 10;
                                    s5.var_as_b.b -= n16 * n18 >> 10;
                                    s7.var_as_b.var_int_a -= n17 * n19 >> 10;
                                    s7.var_as_b.b -= n16 * n19 >> 10;
                                }
                                n76 = n76 * n77 >> 10;
                                n20 = n20 * n77 >> 10;
                                s5.var_as_a.var_int_a += n76 * n18 >> 10;
                                s5.var_as_a.b += n20 * n18 >> 10;
                                s7.var_as_a.var_int_a += n76 * n19 >> 10;
                                s7.var_as_a.b += n20 * n19 >> 10;
                                s5.var_int_b |= 1;
                                s7.var_int_b |= 1;
                                n78 = s5.var_as_a.var_int_a - s7.var_as_a.var_int_a;
                                n4 = s5.var_as_a.b - s7.var_as_a.b;
                            }
                            n76 = sArray[n21].var_as_a.var_int_a - sArray[n83].var_as_a.var_int_a;
                            n20 = sArray[n21].var_as_a.b - sArray[n83].var_as_a.b;
                            n19 = y.int_a(n76, n20);
                            n18 = (n76 = (int)(((long)n76 << 10) / (long)n19)) * n78 + (n20 = (int)(((long)n20 << 10) / (long)n19)) * n4 >> 10;
                            if (n18 >= 0 && n18 <= n19) {
                                n17 = n76 * n4 - n20 * n78 >> 10;
                                if (n17 > 0) {
                                    n17 = -n17;
                                }
                                if ((n77 = n17 + n28) >= 0 && n17 < 0) {
                                    bl = true;
                                    n16 = -n20;
                                    n15 = n76;
                                    n83 = n18;
                                    n76 = s5.var_int_a == Integer.MAX_VALUE ? 1024 : (s6.var_int_a == Integer.MAX_VALUE || s7.var_int_a == Integer.MAX_VALUE ? 0 : (s5.var_int_a == s7.var_int_a && s7.var_int_a == s6.var_int_a ? 512 : (s5.var_int_a == s7.var_int_a << 1 && s7.var_int_a == s6.var_int_a ? 682 : (s5.var_int_a == s7.var_int_a >> 1 && s7.var_int_a == s6.var_int_a ? 341 : (int)(((long)s5.var_int_a << 10) / (long)(s5.var_int_a + (s6.var_int_a + s7.var_int_a >> 1)))))));
                                    n14 = n76 - 1024;
                                    n83 = (int)(((long)n83 << 10) / (long)n19);
                                    n19 = 1024 - n83;
                                    if ((n16 != 0 || n15 != 0) && n82 != 0) {
                                        n20 = s5.var_as_a.var_int_a - s5.var_as_b.var_int_a - (s7.var_as_a.var_int_a + s6.var_as_a.var_int_a >> 1) + (s7.var_as_b.var_int_a + s6.var_as_b.var_int_a >> 1);
                                        n18 = s5.var_as_a.b - s5.var_as_b.b - (s7.var_as_a.b + s6.var_as_a.b >> 1) + (s7.var_as_b.b + s6.var_as_b.b >> 1);
                                        n18 = -n15 * n20 + n16 * n18 >> 10;
                                        if (n82 != 1024) {
                                            n18 = n18 * n82 >> 10;
                                        }
                                        n20 = -n15 * n18 >> 10;
                                        n18 = n16 * n18 >> 10;
                                        s5.var_as_b.var_int_a -= n20 * n14 >> 10;
                                        s5.var_as_b.b -= n18 * n14 >> 10;
                                        n22 = n20 * n76 >> 10;
                                        n17 = n18 * n76 >> 10;
                                        s7.var_as_b.var_int_a -= n22 * n19 >> 10;
                                        s7.var_as_b.b -= n17 * n19 >> 10;
                                        s6.var_as_b.var_int_a -= n22 * n83 >> 10;
                                        s6.var_as_b.b -= n17 * n83 >> 10;
                                    }
                                    n16 = n16 * n77 >> 10;
                                    n15 = n15 * n77 >> 10;
                                    s5.var_as_a.var_int_a += n16 * n14 >> 10;
                                    s5.var_as_a.b += n15 * n14 >> 10;
                                    n20 = n16 * n76 >> 10;
                                    n18 = n15 * n76 >> 10;
                                    s7.var_as_a.var_int_a += n20 * n19 >> 10;
                                    s7.var_as_a.b += n18 * n19 >> 10;
                                    s6.var_as_a.var_int_a += n20 * n83 >> 10;
                                    s6.var_as_a.b += n18 * n83 >> 10;
                                    s5.var_int_b |= 1;
                                    s7.var_int_b |= 1;
                                    s6.var_int_b |= 1;
                                }
                            }
                            n83 = n21++;
                        }
                        if (!bl) continue;
                        aa4.var_s_a.var_int_b |= 1;
                        am15.var_int_b |= 1;
                        ab3.var_ar_a.a(am15, aa4);
                    }
                }
                int n84 = -1;
                ab3 = ab2;
                Object var21_130 = null;
                ab3.a();
                for (int i10 = 1; i10 <= ab3.var_int_arr_a[0]; ++i10) {
                    int[] nArray13;
                    am am16 = ab3.var_am_arr_a[ab3.var_int_arr_a[i10]];
                    int n85 = am16.var_s_arr_a.length;
                    int[] nArray14 = am16.int_arr_a();
                    ab3.f = 0;
                    for (n28 = 0; n28 < n85; ++n28) {
                        as as11;
                        s s8 = am16.var_s_arr_a[n28];
                        if (s8.var_int_a == Integer.MAX_VALUE) continue;
                        int n86 = s8.var_as_a.var_int_a >> ab3.d;
                        int n87 = s8.var_as_a.b >> ab3.d;
                        if (n86 < 0 || n87 < 0 || n86 >= ab3.var_byte_arr_arr_a.length || n87 >= ab3.var_byte_arr_arr_a[0].length) {
                            ab.a(s8, ab3.var_as_arr_arr_a[14], s8.var_as_a.var_int_a - (n86 << ab3.d), s8.var_as_a.b - (n87 << ab3.d), am16.var_int_c);
                            continue;
                        }
                        if (ab3.var_byte_arr_arr_a[n86][n87] == -1 || (as11 = ab.a(s8, ab3.var_as_arr_arr_a[ab3.var_byte_arr_arr_a[n86][n87]], s8.var_as_a.var_int_a - (n86 << ab3.d), s8.var_as_a.b - (n87 << ab3.d), ab3.var_boolean_arr_a == null || ab3.var_boolean_arr_a[ab3.var_byte_arr_arr_b[n86][n87]] ? am16.var_int_c : 0)) == null) continue;
                        int n88 = s8.var_as_a.var_int_a - as11.var_int_a >> ab3.d;
                        n6 = s8.var_as_a.b - as11.b >> ab3.d;
                        if ((n88 != n86 || n6 != n87) && n88 >= 0 && n6 >= 0 && n88 < ab3.var_byte_arr_arr_a.length && n6 < ab3.var_byte_arr_arr_a[0].length && ab3.var_byte_arr_arr_a[n88][n6] != -1) {
                            ab.a(s8, ab3.var_as_arr_arr_a[ab3.var_byte_arr_arr_a[n88][n6]], am16.var_s_arr_a[n28].var_as_a.var_int_a - (n88 << ab3.d), s8.var_as_a.b - (n6 << ab3.d), am16.var_int_c);
                        }
                        s8.var_int_b |= 3;
                        if ((ab3.var_boolean_arr_a == null || ab3.var_boolean_arr_a[ab3.var_byte_arr_arr_b[n86][n87]]) && (am16.d & 1) != 0 && (s8.var_int_b & 4) == 0 && am16.boolean_a(new t(s8, new as(s8.var_as_a), 204, 10240, 0))) {
                            s8.var_int_b |= 0xC;
                        }
                        am16.var_int_b |= 7;
                        if (ab3.f == 15) continue;
                        boolean bl = false;
                        for (int i11 = 0; i11 < ab3.f; ++i11) {
                            if (ab3.var_int_arr_arr_b[i11][0] != n86 || ab3.var_int_arr_arr_b[i11][1] != n87) continue;
                            bl = true;
                            break;
                        }
                        if (bl) continue;
                        ab3.var_int_arr_arr_b[ab3.f][0] = n86;
                        ab3.var_int_arr_arr_b[ab3.f][1] = n87;
                        ++ab3.f;
                    }
                    n28 = 0;
                    n26 = n85 - 1;
                    while (n28 < n85) {
                        s s9 = am16.var_s_arr_a[n28];
                        s s10 = am16.var_s_arr_a[n26];
                        n5 = (s9.var_as_a.var_int_a < s10.var_as_a.var_int_a ? s9.var_as_a.var_int_a : s10.var_as_a.var_int_a) >> ab3.d;
                        int n89 = (s9.var_as_a.b < s10.var_as_a.b ? s9.var_as_a.b : s10.var_as_a.b) >> ab3.d;
                        int n90 = (s9.var_as_a.var_int_a > s10.var_as_a.var_int_a ? s9.var_as_a.var_int_a : s10.var_as_a.var_int_a) >> ab3.d;
                        n4 = (s9.var_as_a.b > s10.var_as_a.b ? s9.var_as_a.b : s10.var_as_a.b) >> ab3.d;
                        for (int i12 = n5; i12 <= n90; ++i12) {
                            for (int i13 = n89; i13 <= n4; ++i13) {
                                if (i12 < 0 || i13 < 0 || i12 >= ab3.var_byte_arr_arr_a.length || i13 >= ab3.var_byte_arr_arr_a[0].length || ab3.var_byte_arr_arr_a[i12][i13] == -1 || !ab.a(s10, s9, ab3.var_as_arr_arr_a[ab3.var_byte_arr_arr_a[i12][i13]], s10.var_as_a.var_int_a - (i12 << ab3.d), s10.var_as_a.b - (i13 << ab3.d), s9.var_as_a.var_int_a - (i12 << ab3.d), s9.var_as_a.b - (i13 << ab3.d), am16.var_int_c, (am16.d & 2) != 0)) continue;
                                s9.var_int_b |= 3;
                                s10.var_int_b |= 3;
                                am16.var_int_b |= 7;
                                if (ab3.f == 15) continue;
                                boolean bl = false;
                                for (int i14 = 0; i14 < ab3.f; ++i14) {
                                    if (ab3.var_int_arr_arr_b[i14][0] != i12 || ab3.var_int_arr_arr_b[i14][1] != i13) continue;
                                    bl = true;
                                    break;
                                }
                                if (bl) continue;
                                ab3.var_int_arr_arr_b[ab3.f][0] = i12;
                                ab3.var_int_arr_arr_b[ab3.f][1] = i13;
                                ++ab3.f;
                            }
                        }
                        n26 = n28++;
                    }
                    if (ab3.var_ar_a != null) {
                        for (n28 = 0; n28 < ab3.f; ++n28) {
                            ab3.var_ar_a.a(am16, ab3.var_int_arr_arr_b[n28][0], ab3.var_int_arr_arr_b[n28][1]);
                        }
                    }
                    int[] nArray15 = ab3.var_ak_b.a(-1, ab3.var_int_a, nArray14, false);
                    for (n28 = 0; n28 < nArray15[0]; ++n28) {
                        au au3 = ab3.var_au_arr_a[nArray15[n28 + 1]];
                        nArray13 = au3.a();
                        if (!y.a(nArray14, nArray13)) continue;
                        for (n26 = 0; n26 < n85; ++n26) {
                            as as12;
                            s s11 = am16.var_s_arr_a[n26];
                            if (!y.a(nArray13, s11.var_as_a) || ab.a(s11, au3.var_as_arr_a, s11.var_as_a.var_int_a - au3.var_as_a.var_int_a, s11.var_as_a.b - au3.var_as_a.b, am16.var_int_c) == null) continue;
                            s11.var_int_b |= 0x43;
                            am16.var_int_b |= 0xB;
                            if ((am16.d & 1) == 0 || (s11.var_int_b & 4) != 0 || !am16.boolean_a(new t(s11, as12 = new as(s11.var_as_a), 512, 5120, 0))) continue;
                            s11.var_int_b |= 0xC;
                            au3.b(as12);
                        }
                    }
                    nArray15 = ab3.var_ak_b.a(-1, ab3.var_int_a, nArray14, false);
                    for (n28 = 0; n28 < nArray15[0]; ++n28) {
                        au au4 = ab3.var_au_arr_a[nArray15[n28 + 1]];
                        nArray13 = au4.a();
                        if (!y.a(nArray14, nArray13)) continue;
                        n26 = 0;
                        int n91 = n85 - 1;
                        while (n26 < n85) {
                            s s12 = am16.var_s_arr_a[n91];
                            s s13 = am16.var_s_arr_a[n26];
                            if (ab.a(s12, s13, au4.var_as_arr_a, s12.var_as_a.var_int_a - au4.var_as_a.var_int_a, s12.var_as_a.b - au4.var_as_a.b, s13.var_as_a.var_int_a - au4.var_as_a.var_int_a, s13.var_as_a.b - au4.var_as_a.b, am16.var_int_c, (am16.d & 2) != 0)) {
                                s13.var_int_b |= 0x43;
                                s12.var_int_b |= 0x43;
                                am16.var_int_b |= 0xB;
                            }
                            n91 = n26++;
                        }
                    }
                }
                for (n26 = 1; n26 <= ab3.var_int_arr_b[0]; ++n26) {
                    int n92;
                    aa aa6 = ab3.var_aa_arr_a[ab3.var_int_arr_b[n26]];
                    s s14 = aa6.var_s_a;
                    if (s14.var_int_a == Integer.MAX_VALUE) continue;
                    n5 = s14.var_as_a.var_int_a - aa6.var_int_a >> ab3.d;
                    int n93 = s14.var_as_a.b - aa6.var_int_a >> ab3.d;
                    int n94 = s14.var_as_a.var_int_a + aa6.var_int_a >> ab3.d;
                    n4 = s14.var_as_a.b + aa6.var_int_a >> ab3.d;
                    for (n92 = n5; n92 <= n94; ++n92) {
                        for (int i15 = n93; i15 <= n4; ++i15) {
                            if (n92 < 0 || i15 < 0 || n92 >= ab3.var_byte_arr_arr_a.length || i15 >= ab3.var_byte_arr_arr_a[0].length || ab3.var_byte_arr_arr_a[n92][i15] == -1 || ab.a(s14, aa6.var_int_a, ab3.var_as_arr_arr_a[ab3.var_byte_arr_arr_a[n92][i15]], s14.var_as_a.var_int_a - (n92 << ab3.d), s14.var_as_a.b - (i15 << ab3.d), aa6.var_int_b) == null) continue;
                            aa6.var_s_a.var_int_b |= 3;
                            if (ab3.var_ar_a == null) continue;
                            ab3.var_ar_a.a(aa6, n92, i15);
                        }
                    }
                    for (n92 = 0; n92 < ab3.var_int_a; ++n92) {
                        au au5 = ab3.var_au_arr_a[n92];
                        int[] nArray16 = au5.a();
                        if (s14.var_as_a.var_int_a - aa6.var_int_a > nArray16[2] || s14.var_as_a.var_int_a + aa6.var_int_a < nArray16[0] || s14.var_as_a.b - aa6.var_int_a > nArray16[3] || s14.var_as_a.b + aa6.var_int_a < nArray16[1] || ab.a(s14, aa6.var_int_a, au5.var_as_arr_a, s14.var_as_a.var_int_a - au5.var_as_a.var_int_a, s14.var_as_a.b - au5.var_as_a.b, aa6.var_int_b) == null) continue;
                        aa6.var_s_a.var_int_b |= 0x41;
                    }
                }
                n28 = this.var_ar_a.var_bb_arr_a.length;
                block66: for (n26 = 0; n26 < n28; ++n26) {
                    for (int i16 = 0; i16 < this.var_ar_a.var_int_arr_arr_a.length; ++i16) {
                        if (!y.a(this.var_ar_a.var_bb_arr_a[n26].var_int_arr_a, this.var_ar_a.var_int_arr_arr_a[i16])) continue;
                        bb bb2 = this.var_ar_a.var_bb_arr_a[n26];
                        if (bb2.var_boolean_b && !bb2.var_boolean_a) {
                            bb2.var_byte_b = (byte)(bb2.var_byte_b - 1);
                            if (!(bb2.var_byte_b > 0 || bb2.var_byte_a != 3 && bb2.var_byte_a != 4 && bb2.boolean_a())) {
                                bb2.void_a();
                            }
                        }
                        if (bb2.var_boolean_a) {
                            bb2.var_byte_b = (byte)10;
                        }
                        if (bb2.var_boolean_b || !bb2.var_boolean_a) continue block66;
                        bb2.b();
                        continue block66;
                    }
                }
            }
            n3 = this.var_ar_a.var_t_arr_a.length;
            for (n2 = 0; n2 < n3; ++n2) {
                t t4 = this.var_ar_a.var_t_arr_a[n2];
                if (t4 == null || t4.var_s_a != null) continue;
                this.var_ar_a.var_com_hardwire_blob_Main_a.a(9, false);
                this.var_ar_a.var_t_arr_a[n2] = null;
                if (this.var_ar_a.var_byte_b != 2) continue;
                this.var_ar_a.var_java_util_Vector_a.addElement(new byte[]{5, (byte)n2});
            }
        }
        this.var_ar_a.b();
        this.var_ar_a.var_boolean_a = false;
        ++this.var_ar_a.o;
        if (this.var_ar_a.var_int_b == 107) {
            as as13 = this.var_ar_a.var_q_arr_a[this.var_ar_a.var_int_f].var_am_a.as_a();
            this.var_int_arr_d[0] = as13.var_int_a - this.m;
            this.var_int_arr_d[1] = as13.b - this.m;
            this.var_int_arr_d[2] = this.var_int_arr_d[0] + (this.m << 1);
            this.var_int_arr_d[3] = this.var_int_arr_d[1] + (this.m << 1);
            n2 = (this.var_ar_a.var_int_d << 15) - 1;
            int n95 = (this.var_ar_a.var_int_e << 15) - 1;
            if (this.var_int_arr_d[0] < 0) {
                this.var_int_arr_d[0] = 0;
            }
            if (this.var_int_arr_d[1] < 0) {
                this.var_int_arr_d[1] = 0;
            }
            if (this.var_int_arr_d[2] > n2) {
                this.var_int_arr_d[2] = n2;
            }
            if (this.var_int_arr_d[3] > n95) {
                this.var_int_arr_d[3] = n95;
            }
        }
    }

    public final boolean boolean_a(int[] nArray) {
        for (int i2 = 0; i2 < this.var_ar_a.var_int_arr_arr_a.length; ++i2) {
            if (!y.a(this.var_ar_a.var_int_arr_arr_a[i2], nArray)) continue;
            return true;
        }
        return false;
    }

    static {
        var_int_arr_a = new int[]{276, 336, 407};
        var_int_arr_b = new int[]{-1, 0, 1, 2, 3, 4, 5, -1, -1, -1, 4, 4};
        var_int_arr_c = new int[]{-1, 0, 1, 2, 3, 4, 5, -1, -1, -1, 6, 7};
        var_short_arr_a = new short[]{2, 4, 8, 16, 32, 64, 256, 1024, 2048, 0, 0, 0, 0, 0, 0, 0, 0, 2048, 0, 0, 1032, 1032, 0, 0, 1028, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1032, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        var_short_arr_b = new short[]{84, 84, 84, 84, 84, 84, 84, 84, 84, 87, 80, 82, 81, 80, 81, 82, 84, 84, 84, 84, 84, 84, 84, 82, 84, 82, 80, 82, 80, 84, 85, 82, 84, 87, 82, 87, 82, 84, 82, 82, 84, 84, 82, 82, 80, 82, 84, 84, 85, 82, 85, 82, 84, 85, 87, 82, 82, 82, 84, 84, 82, 80, 82, 80, 82, 87, 82, 82, 80, 82, 80, 82, 80, 82, 82, 83, 82, 83, 82, 83, 83, 82, 82, 87, 82, 81, 84, 82, 81, 82, 80, 82, 87, 86, 82, 86, 82, 86, 82, 87, 82, 81, 82, 82, 86, 82, 86, 86, 87, 82, 87, 82, 87, 82, 82, 87, 82, 82, 82, 87, 82, 83, 82, 83, 82, 83, 84, 83, 82, 82, 87, 82, 82, 82, 82, 87, 82, 82, 82, 87, 82, 81, 82, 84, 87, 82, 81, 87, 82, 82, 82, 87, 82, 87, 82, 87, 82, 87, 82, 82, 87, 82, 83, 82, 83, 82, 83, 87, 87, 82, 87, 82, 80, 82, 80, 82, 80, 82, 80, 82, 80, 82, 87, 87, 82, 83, 84, 84, 84, 83, 82, 85, 83, 85, 82, 83};
        var_boolean_arr_a = new boolean[]{false, false, false, false, false, false, false, false, false, false, true, true, true, true, false, false, true, false, false, true, false, false, false, false, false, false, true, true, false, false, true, true, false, true, true, true, false, false, false, false, false, false, false, false, true, false, false, false, true, true, false, false, false, false, true, false, false, false, false, false, false, true, true, false, true, true, false, true, true, true, true, true, false, false, true, true, true, true, true, false, false, false, true, false, true, false, false, true, true, false, true, true, false, true, true, true, false, true, true, false, false, true, false, false, true, true, false, true, true, true, false, true, true, false, true, false, false, false, true, true, false, true, true, true, true, true, false, false, false, true, false, false, false, false, true, true, false, false, true, false, true, true, false, false, true, true, true, false, false, false, true, false, true, true, true, false, true, false, false, true, false, true, true, true, true, true, true, false, true, false, true, false, true, true, true, true, true, true, true, true, true, false, false, true, true, true, true, true, false, true, true, true, true, true, true, false};
        var_boolean_arr_b = new boolean[]{false, true, true, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, true, false, true, false, false, true, false, false, true, true, false, false, true, true, false, false, true, true, false, false, true, false, true, false};
        var_byte_arr_arr_arr_arr_a = new byte[][][][]{new byte[][][]{new byte[][]{{0, 0, 0, 15}, {0, 0, 0, 3}, {0, 0, 3, 5}, {0, 5, 5, 17}, {5, 18, 19, 5}, {10, 20, 5, 5}, {4, 5, 0, 0}, {21, 23, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}, new byte[][]{{24, 0, -1, -1}, {41, 0, -1, -1}, {42, 18, -1, -1}, {0, 4, -1, -1}, {4, -1, -1, 2}, {-1, -1, 2, 0}, {-1, -1, 0, 41}, {-1, -1, 0, 5}, {10, 10, 41, 19}, {0, 0, 42, 5}}, new byte[][]{{-1, -1, 9, -1}, {-1, -1, 8, 8}, {-1, -1, -1, -1}, {2, 0, 0, 0}, {1, -1, -1, -1}, {1, -1, -1, -1}, {4, -1, -1, -1}, {-1, 10, 12, -1}, {-1, 11, -1, -1}, {-1, -1, -1, -1}}}, new byte[][][]{new byte[][]{{0, 0, 16, 0}, {0, 15, 16, 0}, {21, 21, 21, 0}, {1, 15, 1, 0}, {11, 1, 11, 0}, {11, 11, 11, 0}, {11, 11, 2, 0}, {2, 2, 0, 0}, {16, 0, 0, 0}, {16, 0, 0, 0}}, new byte[][]{{0, -1, -1, 20}, {0, -1, -1, 21}, {4, -1, -1, 20}, {-1, -1, 7, 20}, {-1, -1, 7, 20}, {-1, -1, 7, 20}, {-1, -1, 7, 21}, {-1, 2, 0, 20}, {-1, 41, 24, 20}, {-1, 42, 22, 20}}, new byte[][]{{-1, -1, 10, 12}, {-1, 19, 11, 12}, {-1, -1, 20, 12}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}}}, new byte[][][]{new byte[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 3, 0}, {2, 3, 18, 0}, {22, 12, 12, 0}, {10, 20, 20, 0}, {4, 5, 0, 0}, {16, 0, 0, 0}, {16, 0, 0, 0}}, new byte[][]{{20, 22, 23, 24}, {21, 23, 41, 0}, {1, 0, 5, 41}, {-1, -1, -1, 5}, {-1, -1, -1, 5}, {-1, -1, -1, 5}, {-1, -1, -1, 5}, {-1, 2, 5, 42}, {-1, 20, 42, 18}, {-1, 21, 23, 22}}, new byte[][]{{-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, 22, 22, -1}, {-1, -1, 7, 23}, {-1, -1, 7, 23}, {-1, -1, 7, 23}, {-1, -1, 7, 23}, {-1, -1, 21, -1}, {-1, -1, -1, -1}, {20, -1, -1, -1}}}, new byte[][][]{new byte[][]{{0, 0, 0, 0}, {0, 0, 3, 0}, {0, 3, 5, 0}, {22, 12, 5, 0}, {10, 20, 0, 0}, {10, 20, 0, 0}, {23, 12, 5, 0}, {0, 4, 5, 0}, {0, 0, 4, 0}, {0, 0, 0, 0}}, new byte[][]{{23, 18, 0, 15}, {0, -1, -1, 15}, {4, -1, 17, 15}, {-1, -1, 15, 15}, {-1, -1, 15, 15}, {-1, -1, 15, 15}, {-1, -1, 15, 15}, {3, -1, 16, 15}, {18, -1, -1, 15}, {0, -1, -1, 15}}, new byte[][]{{-1, -1, -1, -1}, {-1, 19, 20, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, 10, -1, -1}, {-1, 11, -1, -1}, {-1, 20, -1, -1}, {-1, -1, -1, -1}, {0, 0, 0, 0}, {-1, 9, 20, -1}}}, new byte[][][]{new byte[][]{{11, 11, 11, 25}, {11, 11, 29, 24}, {29, 29, 24, 24}, {26, 30, 24, 24}, {27, 26, 24, 24}, {26, 27, 26, 24}, {27, 30, 27, 24}, {24, 24, 24, 24}, {24, 24, 24, 25}, {25, 24, 24, 24}}, new byte[][]{{-1, -1, -1, 26}, {-1, -1, -1, 27}, {-1, -1, -1, 25}, {-1, -1, -1, 25}, {-1, -1, -1, 26}, {-1, -1, -1, 27}, {-1, -1, 38, 35}, {-1, 38, 32, 33}, {38, 32, 29, 34}, {32, 28, 30, 33}}, new byte[][]{{27, 24, 25, -1}, {-1, -1, 30, -1}, {-1, 27, 24, -1}, {-1, -1, 30, -1}, {27, 25, 24, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}}}, new byte[][][]{new byte[][]{{24, 24, 25, 11}, {24, 28, 24, 24}, {24, 11, 11, 11}, {24, 24, 24, 24}, {24, 24, 24, 24}, {24, 11, 11, 11}, {24, 29, 24, 24}, {24, 24, 26, 11}, {24, 26, 27, 24}, {25, 27, 24, 24}}, new byte[][]{{37, 32, 39, -1}, {39, 37, 32, 47}, {32, 39, -1, -1}, {35, 35, 35, 35}, {36, 36, 36, 36}, {32, 40, -1, -1}, {40, 38, 32, 48}, {38, 32, 40, -1}, {28, 40, 38, 48}, {40, 38, 32, 28}}, new byte[][]{{-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}}}, new byte[][][]{new byte[][]{{24, 24, 24, 24}, {24, 24, 24, 24}, {24, 24, 24, 24}, {24, 24, 24, 24}, {24, 24, 24, 24}, {24, 30, 24, 24}, {24, 24, 24, 24}, {24, 24, 26, 24}, {24, 26, 27, 24}, {24, 27, 25, 24}}, new byte[][]{{33, 33, 34, 33}, {34, 36, 33, 36}, {36, 31, 36, 29}, {47, 47, 32, 30}, {-1, -1, 37, 26}, {-1, -1, -1, 27}, {39, -1, -1, 25}, {32, -1, -1, 25}, {29, -1, -1, 26}, {30, -1, -1, 27}}, new byte[][]{{-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, 28, -1}, {-1, -1, 29, -1}, {25, 26, 27, 24}, {-1, -1, -1, -1}, {-1, -1, 30, -1}}}, new byte[][][]{new byte[][]{{25, 24, 24, 24}, {28, 28, 24, 24}, {11, 11, 24, 24}, {11, 11, 24, 24}, {29, 11, 29, 24}, {24, 29, 24, 24}, {24, 25, 24, 26}, {30, 26, 30, 27}, {24, 27, 24, 25}, {24, 24, 24, 24}}, new byte[][]{{37, 32, 32, 34}, {-1, 37, 32, 33}, {-1, -1, 26, 36}, {-1, -1, 27, 28}, {-1, -1, 37, 32}, {-1, -1, -1, 37}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {48, 48, 48, 48}}, new byte[][]{{-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, 28, -1, -1}, {-1, 29, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {25, 26, -1, -1}, {-1, -1, -1, -1}, {-1, 27, 24, 24}, {-1, -1, -1, -1}}}, new byte[][][]{new byte[][]{{31, 38, 42, 46}, {33, 39, 43, 47}, {33, 40, 44, 48}, {35, 40, 43, 47}, {33, 40, 44, 48}, {32, 39, 43, 47}, {37, 41, 45, 49}, {31, 38, 42, 46}, {32, 39, 43, 47}, {33, 40, 44, 48}}, new byte[][]{{-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, 58, 59, 59}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, 58, 59}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {52, 55, -1, -1}, {53, 56, -1, -1}}, new byte[][]{{-1, -1, -1, 37}, {-1, -1, -1, 37}, {31, -1, -1, -1}, {-1, -1, -1, 37}, {-1, -1, -1, 37}, {34, 35, -1, -1}, {-1, -1, -1, 37}, {-1, -1, -1, 37}, {-1, -1, -1, 37}, {-1, -1, -1, 37}}}, new byte[][][]{new byte[][]{{39, 32, 32, 32}, {40, 32, 32, 32}, {39, 43, 32, 32}, {40, 44, 32, 32}, {39, 43, 47, 32}, {40, 44, 48, 50}, {41, 45, 49, 50}, {11, 11, 34, 50}, {11, 11, 34, 50}, {38, 42, 46, 50}}, new byte[][]{{-1, 50, 53, 53}, {-1, 51, 64, 53}, {-1, -1, 50, 53}, {-1, -1, 50, 53}, {-1, -1, 51, 54}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}}, new byte[][]{{-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {32, 33, -1, -1}, {34, 35, -1, 39}, {-1, -1, 37, -1}, {-1, -1, 37, -1}, {-1, -1, 37, -1}, {-1, -1, 37, -1}, {-1, -1, 37, -1}}}, new byte[][][]{new byte[][]{{33, 40, 32, 32}, {32, 39, 32, 32}, {33, 40, 32, 32}, {32, 39, 32, 32}, {33, 40, 43, 32}, {35, 39, 44, 42}, {33, 40, 43, 47}, {32, 39, 44, 44}, {32, 32, 32, 32}, {32, 32, 32, 32}}, new byte[][]{{-1, -1, 50, 53}, {-1, 49, 63, 53}, {-1, 51, 64, 53}, {-1, -1, 50, 53}, {-1, -1, 68, 64}, {-1, -1, -1, 51}, {-1, -1, -1, -1}, {55, -1, -1, 49}, {61, 52, 52, 63}, {53, 53, 53, 53}}, new byte[][]{{-1, -1, -1, -1}, {20, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, 32, 33, -1}, {-1, -1, -1, -1}, {-1, -1, 31, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}}}, new byte[][][]{new byte[][]{{33, 32, 36, 40}, {33, 33, 33, 39}, {35, 36, 35, 33}, {35, 33, 35, 33}, {36, 32, 33, 33}, {35, 33, 33, 33}, {33, 33, 33, 33}, {35, 33, 33, 33}, {33, 33, 33, 40}, {33, 33, 33, 39}}, new byte[][]{{56, -1, -1, -1}, {57, -1, -1, -1}, {-1, -1, -1, 49}, {-1, -1, -1, 50}, {-1, -1, 49, 63}, {-1, -1, 50, 53}, {-1, 49, 63, 53}, {-1, 50, 53, 62}, {49, 63, 62, 57}, {50, 62, 57, -1}}, new byte[][]{{-1, 9, -1, -1}, {-1, -1, 34, 35}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {31, -1, -1, -1}, {20, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}}}};
        var_int_arr_e = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2};
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import com.hardwire.blob.Main;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ad
extends Canvas
implements av {
    private Main var_com_hardwire_blob_Main_a;
    private d var_d_a;
    public static int var_int_a;
    public static int var_int_b;
    public static int var_int_c;
    public static int var_int_d;
    public Image[] var_javax_microedition_lcdui_Image_arr_a;
    public int var_int_e;
    private Image[] var_javax_microedition_lcdui_Image_arr_b;
    private int k = -1;
    private Image[] var_javax_microedition_lcdui_Image_arr_c;
    private int[] var_int_arr_a;
    private boolean[] var_boolean_arr_a;
    private int l;
    public boolean var_boolean_a = false;
    private int m;
    private int n;
    public boolean var_boolean_b = true;
    public boolean var_boolean_c = false;
    public byte[][] var_byte_arr_arr_a;
    private int o;
    public int var_int_f;
    private int p;
    private byte var_byte_a;
    private long var_long_a;
    public int g;
    private int q;
    private int r;
    private int s;
    private static char[][] var_char_arr_arr_a;
    private short var_short_a;
    public StringBuffer var_java_lang_StringBuffer_a;
    private long var_long_b;
    private int t;
    public int h;
    private int u;
    public boolean var_boolean_d;
    public boolean var_boolean_e;
    public int i;
    public int j;
    private byte[] var_byte_arr_a = null;
    private InputStream var_java_io_InputStream_a;
    public boolean var_boolean_f = false;

    public ad(Main main) {
        this.var_com_hardwire_blob_Main_a = main;
        this.var_d_a = this.var_com_hardwire_blob_Main_a.var_d_a;
        this.setFullScreenMode(true);
        this.b();
    }

    public final void void_a() {
        int n2;
        this.m = 0;
        this.a("/images.img");
        this.var_javax_microedition_lcdui_Image_arr_a = new Image[4];
        for (n2 = 0; n2 < 3; ++n2) {
            this.var_javax_microedition_lcdui_Image_arr_a[n2] = this.javax_microedition_lcdui_Image_a();
        }
        this.var_javax_microedition_lcdui_Image_arr_b = new Image[4];
        for (n2 = 0; n2 < this.var_javax_microedition_lcdui_Image_arr_b.length; ++n2) {
            this.var_javax_microedition_lcdui_Image_arr_b[n2] = this.javax_microedition_lcdui_Image_a();
        }
        this.n = (var_int_a - (this.var_javax_microedition_lcdui_Image_arr_b[1].getWidth() << 1)) * 9 / 10;
    }

    public final void b() {
        var_int_a = this.getWidth();
        var_int_b = this.getHeight();
        var_int_c = var_int_a >> 1;
        var_int_d = var_int_b >> 1;
    }

    public final Image javax_microedition_lcdui_Image_a(int n2) {
        return this.var_javax_microedition_lcdui_Image_arr_c[this.var_int_arr_a[n2]];
    }

    public final void c() {
        try {
            short s2;
            int n2 = 0;
            this.var_int_arr_a = new int[1024];
            int n3 = 0;
            int n4 = 0;
            for (n2 = 0; n2 < 1024; ++n2) {
                this.var_int_arr_a[n2] = -1;
            }
            Object object = null;
            try {
                object = new DataInputStream(Main.java_io_InputStream_a("/images.map"));
                n3 = ((DataInputStream)object).readShort();
                for (n2 = 0; n2 < n3; ++n2) {
                    s2 = ((DataInputStream)object).readShort();
                    this.var_int_arr_a[s2] = n2;
                }
            }
            catch (Exception exception) {}
            try {
                ((FilterInputStream)object).close();
            }
            catch (Exception exception) {}
            try {
                object = new DataInputStream(Main.java_io_InputStream_a("/images2.map"));
                n4 = ((DataInputStream)object).readShort();
                for (n2 = 0; n2 < n4; ++n2) {
                    s2 = ((DataInputStream)object).readShort();
                    this.var_int_arr_a[s2 + 256] = n3 + n2;
                }
            }
            catch (Exception exception) {}
            try {
                ((FilterInputStream)object).close();
            }
            catch (Exception exception) {}
            this.var_javax_microedition_lcdui_Image_arr_c = new Image[n3 + n4];
            for (n2 = 7; n2 < n3; ++n2) {
                this.var_javax_microedition_lcdui_Image_arr_c[n2] = this.javax_microedition_lcdui_Image_a();
                object = this;
                ((ad)object).void_b(1);
            }
            this.n();
            this.l = n3;
            this.var_boolean_arr_a = new boolean[n4];
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void d() {
        try {
            int n2;
            for (n2 = 0; n2 < this.var_boolean_arr_a.length; ++n2) {
                if (this.var_boolean_arr_a[n2]) continue;
                this.var_javax_microedition_lcdui_Image_arr_c[n2 + this.l] = null;
            }
            System.gc();
            n2 = 0;
            int n3 = -1;
            for (int i2 = 0; i2 < this.var_boolean_arr_a.length; ++i2) {
                if (!this.var_boolean_arr_a[i2] || this.var_javax_microedition_lcdui_Image_arr_c[i2 + this.l] != null) continue;
                if (i2 + this.l == this.var_int_arr_a[ac.var_int_arr_a[2] + 6]) {
                    this.var_javax_microedition_lcdui_Image_arr_c[i2 + this.l] = Image.createImage((String)"/img_tiles/fg/6_alpha.png");
                    continue;
                }
                if (i2 + this.l == this.var_int_arr_a[ac.var_int_arr_a[2] + 7]) {
                    this.var_javax_microedition_lcdui_Image_arr_c[i2 + this.l] = Image.createImage((String)"/img_tiles/fg/7_alpha.png");
                    continue;
                }
                if (i2 + this.l == this.var_int_arr_a[ac.var_int_arr_a[2] + 36]) {
                    this.var_javax_microedition_lcdui_Image_arr_c[i2 + this.l] = Image.createImage((String)"/img_tiles/fg/36_alpha.png");
                    continue;
                }
                if (i2 + this.l == this.var_int_arr_a[471]) {
                    this.var_javax_microedition_lcdui_Image_arr_c[i2 + this.l] = Image.createImage((String)"/img_gish/dark_corner_alpha.png");
                    this.var_com_hardwire_blob_Main_a.var_ar_a.var_ac_a.a();
                    continue;
                }
                if (n2 == 0) {
                    this.a("/images2.img");
                    n2 = 1;
                }
                while (n3 < i2 - 1) {
                    int n4;
                    ad ad2 = this;
                    int n5 = 256 * ad2.var_java_io_InputStream_a.read() + ad2.var_java_io_InputStream_a.read();
                    int n6 = ad2.var_java_io_InputStream_a.read() * 3;
                    for (n4 = 0; n4 < 10; ++n4) {
                        ad2.var_java_io_InputStream_a.read();
                    }
                    for (n4 = 0; n4 < n6 + 4; ++n4) {
                        ad2.var_java_io_InputStream_a.read();
                    }
                    for (n4 = 0; n4 < n5 + 4; ++n4) {
                        ad2.var_java_io_InputStream_a.read();
                    }
                    ++n3;
                }
                this.var_javax_microedition_lcdui_Image_arr_c[i2 + this.l] = this.javax_microedition_lcdui_Image_a();
                n3 = i2;
            }
            if (n2 != 0) {
                this.n();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void void_a(int n2) {
        if (n2 < 256) {
            return;
        }
        if (n2 == ac.var_int_arr_a[0] + 8 || n2 == ac.var_int_arr_a[0] + 9) {
            for (n2 = 0; n2 < 2; ++n2) {
                this.var_boolean_arr_a[this.var_int_arr_a[ac.var_int_arr_a[0] + 8 + n2] - this.l] = true;
            }
            return;
        }
        if (n2 == ac.var_int_arr_a[0] + 30) {
            for (n2 = 0; n2 < 4; ++n2) {
                this.var_boolean_arr_a[this.var_int_arr_a[n2 + 272] - this.l] = true;
            }
            return;
        }
        if (n2 == ac.var_int_arr_a[0] + 36) {
            for (n2 = 0; n2 < 4; ++n2) {
                this.var_boolean_arr_a[this.var_int_arr_a[n2 + 564] - this.l] = true;
            }
            return;
        }
        if (n2 == ac.var_int_arr_a[2] + 7) {
            this.var_boolean_arr_a[this.var_int_arr_a[n2] - this.l] = true;
            for (n2 = 0; n2 < 4; ++n2) {
                this.var_boolean_arr_a[this.var_int_arr_a[n2 + 464] - this.l] = true;
            }
            return;
        }
        if (n2 == ac.var_int_arr_a[2] + 37) {
            for (n2 = 0; n2 < 4; ++n2) {
                this.var_boolean_arr_a[this.var_int_arr_a[n2 + 460] - this.l] = true;
            }
            return;
        }
        if ((n2 = this.var_int_arr_a[n2] - this.l) >= 0) {
            this.var_boolean_arr_a[n2] = true;
        }
    }

    public final void e() {
        for (int i2 = 0; i2 < this.var_boolean_arr_a.length; ++i2) {
            this.var_boolean_arr_a[i2] = false;
        }
    }

    public final void f() {
        byte[][][] byArray = ac.var_byte_arr_arr_arr_arr_a[this.var_com_hardwire_blob_Main_a.var_ar_a.var_ac_a.j];
        int n2 = byArray[0].length;
        int n3 = byArray[0][0].length;
        for (int i2 = 0; i2 < 3; ++i2) {
            for (int i3 = 0; i3 < n2; ++i3) {
                for (int i4 = 0; i4 < n3; ++i4) {
                    this.void_a(ac.var_int_arr_a[i2] + byArray[i2][i3][i4]);
                }
            }
        }
    }

    public final Image[] a(int n2, int n3, boolean bl) {
        Image[] imageArray;
        if (bl) {
            imageArray = new Image[n3 << 1];
            for (int i2 = 0; i2 < n3; ++i2) {
                Image image;
                imageArray[i2 << 1] = image = this.javax_microedition_lcdui_Image_a(n2 + i2);
                imageArray[(i2 << 1) + 1] = Image.createImage((Image)image, (int)0, (int)0, (int)image.getWidth(), (int)image.getHeight(), (int)2);
            }
        } else {
            imageArray = new Image[n3];
            for (int i3 = 0; i3 < n3; ++i3) {
                imageArray[i3] = this.javax_microedition_lcdui_Image_a(n2 + i3);
            }
        }
        return imageArray;
    }

    public static void a(Graphics graphics, Image[] image, int n2, int n3, int n4, boolean bl, boolean bl2, int n5) {
        if (bl2) {
            graphics.drawImage(image[(n4 << 1) + (bl ? 1 : 0)], n2, n3, n5);
            return;
        }
        image = image[n4];
        graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), bl ? 2 : 0, n2, n3, n5);
    }

    public final Image[] javax_microedition_lcdui_Image_arr_a(int n2) {
        Image[] imageArray = new Image[16];
        for (int i2 = 0; i2 < imageArray.length; ++i2) {
            if (i2 < 4) {
                imageArray[i2] = this.javax_microedition_lcdui_Image_a(i2 + 145);
                continue;
            }
            Image image = this.javax_microedition_lcdui_Image_a(145 + (i2 & 3));
            int n3 = image.getWidth();
            int n4 = image.getHeight();
            imageArray[i2] = Image.createImage((Image)image, (int)0, (int)0, (int)n3, (int)n4, (int)(i2 < 8 ? 5 : (i2 < 12 ? 3 : 6)));
        }
        return imageArray;
    }

    public static void a(Graphics graphics, Image[] imageArray, int n2, int n3, int n4) {
        n4 = y.int_a(n4 + 205887);
        n4 = (n4 << 4) / 6588397;
        graphics.drawImage(imageArray[n4], n2, n3, 3);
    }

    public final Image[] a(int n2, boolean bl) {
        Image[] imageArray = new Image[32];
        for (int i2 = 0; i2 < imageArray.length; ++i2) {
            if (i2 < 8) {
                imageArray[i2] = this.javax_microedition_lcdui_Image_a(n2 + i2);
                continue;
            }
            Image image = this.javax_microedition_lcdui_Image_a(n2 + (i2 & 7));
            int n3 = image.getWidth();
            int n4 = image.getHeight();
            imageArray[i2] = Image.createImage((Image)image, (int)0, (int)0, (int)n3, (int)n4, (int)(i2 < 16 ? 5 : (i2 < 24 ? 3 : 6)));
        }
        return imageArray;
    }

    public static void a(Graphics graphics, Image[] image, as as2, int n2) {
        n2 = y.int_a(n2 + 102943);
        n2 = (n2 << 5) / 6588397;
        if (((Image[])image).length > 8 || n2 < 8) {
            graphics.drawImage(image[n2], as2.var_int_a, as2.b, 3);
            return;
        }
        image = image[n2 & 7];
        n2 = n2 < 16 ? 5 : (n2 < 24 ? 3 : 6);
        graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), n2, as2.var_int_a, as2.b, 3);
    }

    public final Image javax_microedition_lcdui_Image_b(int n2) {
        Image image = Image.createImage((int)(this.var_d_a.d(54) + 1), (int)(d.c(0) + 1));
        Graphics graphics = image.getGraphics();
        graphics.setColor(-13684945);
        graphics.fillRect(0, 0, image.getWidth(), image.getHeight());
        this.var_d_a.a(graphics, 54, 1, 0, 0);
        return image;
    }

    public final void g() {
        this.void_b(1);
    }

    public final void void_b(int n2) {
        this.m += n2;
        if (this.k * this.n / 196 != this.m * this.n / 196) {
            this.m();
        }
    }

    public final void h() {
        this.m = 196;
        this.m();
        for (int i2 = 0; i2 < this.var_javax_microedition_lcdui_Image_arr_b.length; ++i2) {
            this.var_javax_microedition_lcdui_Image_arr_b[i2] = null;
        }
        this.var_javax_microedition_lcdui_Image_arr_b = null;
    }

    protected final void paint(Graphics graphics) {
        if (this.var_boolean_f) {
            return;
        }
        this.setFullScreenMode(true);
        this.b();
        graphics.setClip(0, 0, var_int_a, var_int_b);
        if (this.var_boolean_a) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, var_int_a, var_int_b);
            this.var_d_a.a(graphics, 0, var_int_c, var_int_d, 3);
            this.var_boolean_c = false;
            return;
        }
        switch (this.var_com_hardwire_blob_Main_a.var_byte_a) {
            case 0: {
                this.var_com_hardwire_blob_Main_a.var_ar_a.var_ac_a.a(graphics);
                break;
            }
            case 1: {
                this.var_com_hardwire_blob_Main_a.var_u_a.b(graphics);
                break;
            }
            case 2: {
                int[] nArray = new int[]{1912910, 0xFFFFFF, 2056, 0};
                int n2 = this.var_int_e >= this.var_javax_microedition_lcdui_Image_arr_a.length ? this.var_javax_microedition_lcdui_Image_arr_a.length - 1 : this.var_int_e;
                graphics.setColor(nArray[n2]);
                graphics.fillRect(0, 0, var_int_a, var_int_b);
                if (this.var_javax_microedition_lcdui_Image_arr_a[n2] == null) break;
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_a[n2], var_int_c, var_int_d, 3);
                break;
            }
            case 3: {
                int n3;
                if (this.var_javax_microedition_lcdui_Image_arr_b == null) {
                    return;
                }
                if (this.var_boolean_b) {
                    graphics.setColor(0);
                    graphics.fillRect(0, 0, var_int_a, var_int_b);
                }
                int n4 = n3 + this.m * this.n / 196;
                if (this.var_boolean_b) {
                    graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_b[1], n3, var_int_d, 10);
                    int n5 = n3 + this.n;
                    for (n3 = var_int_c - (this.n >> 1); n3 < n4; ++n3) {
                        graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_b[0], n3, var_int_d, 6);
                    }
                    while (n3 < n5) {
                        graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_b[2], n3, var_int_d, 6);
                        ++n3;
                    }
                    graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_b[3], n3, var_int_d, 6);
                } else {
                    n3 += this.k * this.n / 196;
                    while (n3 < n4) {
                        graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_b[0], n3, var_int_d, 6);
                        ++n3;
                    }
                }
                if (this.m == 196) {
                    ad.a(graphics, this.var_javax_microedition_lcdui_Image_arr_b, var_int_c - (this.n >> 1) + this.n + (this.var_javax_microedition_lcdui_Image_arr_b[1].getWidth() >> 1), var_int_d, 1, true, false, 3);
                }
                this.k = this.m;
                this.var_boolean_b = false;
            }
        }
        this.var_boolean_c = false;
    }

    public final void a(short s2, String string, int n2) {
        this.var_short_a = (short)58;
        this.u = -1;
        this.var_java_lang_StringBuffer_a = new StringBuffer(string);
        this.h = 11;
    }

    public final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        this.var_d_a.a(graphics, this.var_short_a, n2, n3, 0);
        graphics.setColor(n4);
        graphics.fillRect(n2, n3 += 1 + d.c(this.var_d_a.byte_a(this.var_short_a)), this.h * d.a(0, d.a(0, 'm')), d.c(0));
        this.var_d_a.a(graphics, 0, this.var_java_lang_StringBuffer_a.toString(), n2 + 1, n3 - 1, 0);
    }

    public final void void_c(int n2) {
        if (n2 == 35 || n2 == -8) {
            if (this.var_java_lang_StringBuffer_a.length() > 0) {
                this.var_java_lang_StringBuffer_a.deleteCharAt(this.var_java_lang_StringBuffer_a.length() - 1);
            }
            this.u = -1;
            return;
        }
        if (this.var_java_lang_StringBuffer_a.length() < this.h && (n2 == 35 || n2 == 42 || n2 >= 48 && n2 <= 57)) {
            int n3 = n2 - 46;
            if (n2 == 42) {
                n3 += 5;
            } else if (n2 == 35) {
                n3 += 11;
            }
            if (this.u != n3 || System.currentTimeMillis() - this.var_long_b > 500L) {
                this.var_java_lang_StringBuffer_a.append(var_char_arr_arr_a[n3][0]);
                this.t = 1;
            } else if (this.t < var_char_arr_arr_a[n3].length) {
                this.var_java_lang_StringBuffer_a.setCharAt(this.var_java_lang_StringBuffer_a.length() - 1, var_char_arr_arr_a[n3][this.t]);
                ++this.t;
            }
            this.u = n3;
            this.var_long_b = System.currentTimeMillis();
        }
    }

    public final void a(byte[][] byArray, int n2, int n3, int n4, int n5) {
        this.var_byte_arr_arr_a = byArray;
        this.p = 3;
        this.var_int_f = 0;
        n2 = d.c(3) + 1;
        this.o = n5 / n2;
        if (this.o > byArray.length) {
            this.o = byArray.length;
        }
        this.q = 0;
        for (n3 = 0; n3 < byArray.length; ++n3) {
            n5 = d.a(3, byArray[n3]);
            if (this.q >= n5) continue;
            this.q = n5;
        }
        this.var_byte_a = 0;
        this.g = this.o * n2;
        this.r = 3;
        this.s = n4;
    }

    public final void b(Graphics graphics, int n2, int n3, int n4, int n5) {
        byte[][] byArray = this.var_byte_arr_arr_a;
        int n6 = this.var_int_f + Math.min(byArray.length, this.o);
        n3 += (n4 >> 1) - ((n6 - this.var_int_f) * (1 + d.c(this.p)) >> 1);
        n4 = n3;
        int n7 = this.var_int_f;
        while (n7 < n6) {
            if (byArray[n7].length > 0) {
                if (byArray[n7][0] == -3) {
                    graphics.setColor(this.s);
                    graphics.fillRect(n2, n4 - 1, d.a(this.r, byArray[n7]) + 1, d.c(this.r) + 2);
                    this.var_d_a.a(graphics, this.r, byArray[n7], n2 + 1, n4, 20);
                    ++n4;
                } else {
                    this.var_d_a.a(graphics, this.p, byArray[n7], n2, n4, 20);
                }
            }
            ++n7;
            n4 += 1 + d.c(this.p);
        }
        if (byArray.length > this.o) {
            n7 = n5;
            n4 = n3;
            n2 = this.g;
            ++n7;
            ++n4;
            graphics.setColor(255, 255, 255);
            n2 = 2 + n2 * (this.o - 1) / (byArray.length - 1);
            graphics.fillRect(--n7, n4 += (n2 -= 2) * this.var_int_f / (byArray.length - 1), 4, n2);
        }
    }

    public final void i() {
        if (this.var_byte_a == 0) {
            return;
        }
        if (System.currentTimeMillis() - this.var_long_a > 100L) {
            if (this.var_byte_a == 1) {
                if (this.var_int_f + this.o < this.var_byte_arr_arr_a.length) {
                    ++this.var_int_f;
                    this.repaint();
                }
            } else if (this.var_int_f > 0) {
                --this.var_int_f;
                this.repaint();
            }
            this.var_long_a = System.currentTimeMillis();
        }
    }

    public final void j() {
        this.var_byte_a = (byte)-1;
        this.var_long_a = 0L;
        this.i();
    }

    public final void k() {
        this.var_byte_a = 1;
        this.var_long_a = 0L;
        this.i();
    }

    public final void l() {
        this.var_byte_a = 0;
    }

    public static boolean boolean_a(int n2) {
        return n2 == -7 || n2 > 20 && n2 == 7;
    }

    public static boolean boolean_b(int n2) {
        return n2 == -5;
    }

    public static boolean boolean_c(int n2) {
        return n2 == -6 || n2 > 20 && n2 == 6;
    }

    public final int int_a(int n2) {
        switch (n2) {
            case 49: {
                return 4;
            }
            case -1: 
            case 50: {
                return 0;
            }
            case 51: {
                return 5;
            }
            case -3: 
            case 52: {
                return 2;
            }
            case -5: 
            case 53: {
                if (this.var_com_hardwire_blob_Main_a.var_byte_a == 0 && this.var_com_hardwire_blob_Main_a.var_ar_a.var_byte_c == 0) {
                    return 9;
                }
                return 8;
            }
            case -4: 
            case 54: {
                return 3;
            }
            case 55: {
                return 6;
            }
            case -2: 
            case 56: {
                return 1;
            }
            case 57: {
                return 7;
            }
            case 42: {
                return 9;
            }
            case 48: {
                return 11;
            }
            case 35: {
                return 10;
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int int_b(int n2) {
        switch (n2) {
            case 2: {
                return 52;
            }
            case 3: {
                return 54;
            }
            case 0: {
                return 50;
            }
            case 1: {
                return 56;
            }
            case 4: {
                return 49;
            }
            case 5: {
                return 51;
            }
            case 6: {
                return 55;
            }
            case 7: {
                return 57;
            }
            case 8: {
                return 53;
            }
            case 9: {
                return 42;
            }
            case 10: {
                return 35;
            }
            case 11: {
                return 48;
            }
        }
        return Integer.MIN_VALUE;
    }

    protected final void keyPressed(int n2) {
        if (this.var_boolean_a) {
            return;
        }
        switch (this.var_com_hardwire_blob_Main_a.var_byte_a) {
            case 0: {
                this.var_com_hardwire_blob_Main_a.var_ar_a.var_ac_a.void_a(n2);
                return;
            }
            case 1: {
                this.var_com_hardwire_blob_Main_a.var_u_a.void_a(n2);
                return;
            }
            case 2: {
                ++this.var_int_e;
            }
        }
    }

    protected final void keyReleased(int n2) {
        if (this.var_boolean_a) {
            return;
        }
        try {
            switch (this.var_com_hardwire_blob_Main_a.var_byte_a) {
                case 0: {
                    this.var_com_hardwire_blob_Main_a.var_ar_a.var_ac_a.b(n2);
                    break;
                }
                case 1: {
                    this.var_com_hardwire_blob_Main_a.var_u_a.b(n2);
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    public final void a(v v2) {
        if (this.var_boolean_a) {
            return;
        }
        try {
            switch (this.var_com_hardwire_blob_Main_a.var_byte_a) {
                case 0: {
                    this.var_com_hardwire_blob_Main_a.var_ar_a.var_ac_a.a(v2);
                    break;
                }
                case 1: {
                    this.var_com_hardwire_blob_Main_a.var_u_a.a(v2);
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    public final void b(v v2) {
        if (this.var_boolean_a) {
            return;
        }
        try {
            switch (this.var_com_hardwire_blob_Main_a.var_byte_a) {
                case 0: {
                    this.var_com_hardwire_blob_Main_a.var_ar_a.var_ac_a.b(v2);
                    break;
                }
                case 1: {
                    this.var_com_hardwire_blob_Main_a.var_u_a.b(v2);
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    public final void a(o o2) {
        if (this.var_boolean_a) {
            return;
        }
        try {
            switch (this.var_com_hardwire_blob_Main_a.var_byte_a) {
                case 0: {
                    this.var_com_hardwire_blob_Main_a.var_ar_a.var_ac_a.a(o2);
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    protected final void pointerPressed(int n2, int n3) {
        try {
            if (this.var_boolean_a) {
                return;
            }
            switch (this.var_com_hardwire_blob_Main_a.var_byte_a) {
                case 0: {
                    this.var_com_hardwire_blob_Main_a.var_ar_a.var_ac_a.a(n2, n3);
                    break;
                }
                case 1: {
                    this.var_com_hardwire_blob_Main_a.var_u_a.void_a(n2, n3);
                    break;
                }
                case 2: {
                    ++this.var_int_e;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    protected final void pointerReleased(int n2, int n3) {
        try {
            if (this.var_boolean_a) {
                return;
            }
            this.var_boolean_d = false;
            if (this.var_boolean_e) {
                this.var_boolean_e = false;
                ad ad2 = this;
                this.var_byte_a = 0;
                return;
            }
            switch (this.var_com_hardwire_blob_Main_a.var_byte_a) {
                case 0: {
                    this.var_com_hardwire_blob_Main_a.var_ar_a.var_ac_a.b();
                    break;
                }
                case 1: {
                    this.var_com_hardwire_blob_Main_a.var_u_a.b(n2, n3);
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    protected final void pointerDragged(int n2, int n3) {
        try {
            if (this.var_boolean_a) {
                return;
            }
            if (this.var_boolean_d) {
                if (this.var_com_hardwire_blob_Main_a.var_byte_a == 1 && this.var_com_hardwire_blob_Main_a.var_u_a.var_byte_b == 0) {
                    int n4;
                    int n5 = this.j + (this.i - n3) / this.var_com_hardwire_blob_Main_a.var_u_a.var_int_d;
                    if (n5 != this.var_com_hardwire_blob_Main_a.var_u_a.var_int_c) {
                        this.var_boolean_e = true;
                    }
                    if (n5 + this.var_com_hardwire_blob_Main_a.var_u_a.var_int_b >= (n4 = this.var_com_hardwire_blob_Main_a.var_u_a.int_a())) {
                        n5 = n4 - this.var_com_hardwire_blob_Main_a.var_u_a.var_int_b;
                    }
                    if (n5 < 0) {
                        n5 = 0;
                    }
                    this.var_com_hardwire_blob_Main_a.var_u_a.var_int_c = n5;
                    if (this.var_com_hardwire_blob_Main_a.var_u_a.var_int_a < this.var_com_hardwire_blob_Main_a.var_u_a.var_int_c) {
                        this.var_com_hardwire_blob_Main_a.var_u_a.var_int_a = this.var_com_hardwire_blob_Main_a.var_u_a.var_int_c;
                    } else if (this.var_com_hardwire_blob_Main_a.var_u_a.var_int_a >= this.var_com_hardwire_blob_Main_a.var_u_a.var_int_c + this.var_com_hardwire_blob_Main_a.var_u_a.var_int_b) {
                        this.var_com_hardwire_blob_Main_a.var_u_a.var_int_a = this.var_com_hardwire_blob_Main_a.var_u_a.var_int_c + this.var_com_hardwire_blob_Main_a.var_u_a.var_int_b - 1;
                    }
                } else if (this.var_com_hardwire_blob_Main_a.var_byte_a == 1 && this.var_com_hardwire_blob_Main_a.var_u_a.var_byte_b == 1 || this.var_com_hardwire_blob_Main_a.var_byte_a == 0 && this.var_com_hardwire_blob_Main_a.var_ar_a.var_byte_c == 6) {
                    int n6;
                    int n7 = this.j + (this.i - n3) / (1 + d.c(this.p));
                    if (n7 != this.var_int_f) {
                        this.var_boolean_e = true;
                    }
                    if (n7 + this.o >= (n6 = this.var_byte_arr_arr_a.length)) {
                        n7 = n6 - this.o;
                    }
                    if (n7 < 0) {
                        n7 = 0;
                    }
                    if (this.var_int_f != n7) {
                        this.var_int_f = n7;
                        this.repaint();
                    }
                }
                if (this.var_boolean_e) {
                    return;
                }
            }
            switch (this.var_com_hardwire_blob_Main_a.var_byte_a) {
                case 0: {
                    this.var_com_hardwire_blob_Main_a.var_ar_a.var_ac_a.b(n2, n3);
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    protected final void hideNotify() {
        this.var_com_hardwire_blob_Main_a.c();
    }

    protected final void showNotify() {
        this.var_com_hardwire_blob_Main_a.d();
    }

    private void a(String string) {
        this.var_java_io_InputStream_a = Main.java_io_InputStream_a(string);
    }

    private void n() {
        try {
            this.var_byte_arr_a = null;
            this.var_java_io_InputStream_a.close();
            this.var_java_io_InputStream_a = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private Image javax_microedition_lcdui_Image_a() {
        int n2 = 0;
        try {
            int n3;
            int n4 = 256 * (this.var_java_io_InputStream_a.read() & 0xFF) + (this.var_java_io_InputStream_a.read() & 0xFF);
            int n5 = (this.var_java_io_InputStream_a.read() & 0xFF) * 3;
            int n6 = this.var_java_io_InputStream_a.read() & 0xFF;
            n2 = n4 + n5 + 69 + n6 * 13;
            if (this.var_byte_arr_a == null || n2 > this.var_byte_arr_a.length) {
                this.var_byte_arr_a = null;
                this.var_byte_arr_a = new byte[n2];
            }
            this.var_byte_arr_a[0] = -119;
            this.var_byte_arr_a[1] = 80;
            this.var_byte_arr_a[2] = 78;
            this.var_byte_arr_a[3] = 71;
            this.var_byte_arr_a[4] = 13;
            this.var_byte_arr_a[5] = 10;
            this.var_byte_arr_a[6] = 26;
            this.var_byte_arr_a[7] = 10;
            this.var_byte_arr_a[8] = 0;
            this.var_byte_arr_a[9] = 0;
            this.var_byte_arr_a[10] = 0;
            this.var_byte_arr_a[11] = 13;
            this.var_byte_arr_a[12] = 73;
            this.var_byte_arr_a[13] = 72;
            this.var_byte_arr_a[14] = 68;
            this.var_byte_arr_a[15] = 82;
            this.var_byte_arr_a[16] = 0;
            this.var_byte_arr_a[17] = 0;
            this.var_byte_arr_a[18] = (byte)this.var_java_io_InputStream_a.read();
            this.var_byte_arr_a[19] = (byte)this.var_java_io_InputStream_a.read();
            this.var_byte_arr_a[20] = 0;
            this.var_byte_arr_a[21] = 0;
            this.var_byte_arr_a[22] = (byte)this.var_java_io_InputStream_a.read();
            this.var_byte_arr_a[23] = (byte)this.var_java_io_InputStream_a.read();
            this.var_byte_arr_a[24] = (byte)this.var_java_io_InputStream_a.read();
            this.var_byte_arr_a[25] = 3;
            this.var_byte_arr_a[26] = 0;
            this.var_byte_arr_a[27] = 0;
            this.var_byte_arr_a[28] = 0;
            this.var_byte_arr_a[29] = (byte)this.var_java_io_InputStream_a.read();
            this.var_byte_arr_a[30] = (byte)this.var_java_io_InputStream_a.read();
            this.var_byte_arr_a[31] = (byte)this.var_java_io_InputStream_a.read();
            this.var_byte_arr_a[32] = (byte)this.var_java_io_InputStream_a.read();
            this.var_byte_arr_a[33] = 0;
            this.var_byte_arr_a[34] = 0;
            this.var_byte_arr_a[35] = (byte)(n5 >> 8);
            this.var_byte_arr_a[36] = (byte)n5;
            this.var_byte_arr_a[37] = 80;
            this.var_byte_arr_a[38] = 76;
            this.var_byte_arr_a[39] = 84;
            this.var_byte_arr_a[40] = 69;
            for (n3 = 0; n3 < n5 + 4; ++n3) {
                this.var_byte_arr_a[n3 + 41] = (byte)this.var_java_io_InputStream_a.read();
            }
            n3 = n5 + 41 + 4;
            if (n6 == 1) {
                this.var_byte_arr_a[n3++] = 0;
                this.var_byte_arr_a[n3++] = 0;
                this.var_byte_arr_a[n3++] = 0;
                this.var_byte_arr_a[n3++] = 1;
                this.var_byte_arr_a[n3++] = 116;
                this.var_byte_arr_a[n3++] = 82;
                this.var_byte_arr_a[n3++] = 78;
                this.var_byte_arr_a[n3++] = 83;
                this.var_byte_arr_a[n3++] = 0;
                this.var_byte_arr_a[n3++] = 64;
                this.var_byte_arr_a[n3++] = -26;
                this.var_byte_arr_a[n3++] = -40;
                this.var_byte_arr_a[n3++] = 102;
            }
            this.var_byte_arr_a[n3++] = 0;
            this.var_byte_arr_a[n3++] = 0;
            this.var_byte_arr_a[n3++] = (byte)(n4 >> 8);
            this.var_byte_arr_a[n3++] = (byte)n4;
            this.var_byte_arr_a[n3++] = 73;
            this.var_byte_arr_a[n3++] = 68;
            this.var_byte_arr_a[n3++] = 65;
            this.var_byte_arr_a[n3++] = 84;
            for (n5 = 0; n5 < n4 + 4; ++n5) {
                this.var_byte_arr_a[n3++] = (byte)this.var_java_io_InputStream_a.read();
            }
            this.var_byte_arr_a[n3++] = 0;
            this.var_byte_arr_a[n3++] = 0;
            this.var_byte_arr_a[n3++] = 0;
            this.var_byte_arr_a[n3++] = 0;
            this.var_byte_arr_a[n3++] = 73;
            this.var_byte_arr_a[n3++] = 69;
            this.var_byte_arr_a[n3++] = 78;
            this.var_byte_arr_a[n3++] = 68;
            this.var_byte_arr_a[n3++] = -82;
            this.var_byte_arr_a[n3++] = 66;
            this.var_byte_arr_a[n3++] = 96;
            this.var_byte_arr_a[n3] = -126;
        }
        catch (Exception exception) {}
        if (this.var_byte_arr_a == null) {
            return null;
        }
        return Image.createImage((byte[])this.var_byte_arr_a, (int)0, (int)n2);
    }

    public final void m() {
        if (!this.isShown()) {
            return;
        }
        this.var_boolean_c = true;
        this.repaint();
        while (this.var_boolean_c) {
            Thread.yield();
            try {
                Thread.sleep(1L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    protected final void sizeChanged(int n2, int n3) {
        new Thread(new f(this, this.var_com_hardwire_blob_Main_a, null)).start();
    }

    static {
        var_char_arr_arr_a = new char[][]{{' '}, {'-', '_'}, {'0'}, {'1', '@', '-', '_', '*', '#', '+'}, {'a', 'b', 'c', '2'}, {'d', 'e', 'f', '3'}, {'g', 'h', 'i', '4'}, {'j', 'k', 'l', '5'}, {'m', 'n', 'o', '6'}, {'p', 'q', 'r', 's', '7'}, {'t', 'u', 'v', '8'}, {'w', 'x', 'y', 'z', '9'}};
    }
}


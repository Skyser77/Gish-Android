/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.ServiceRecord
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import com.hardwire.blob.Main;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.bluetooth.ServiceRecord;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class u {
    private Main var_com_hardwire_blob_Main_a;
    private ar var_ar_a;
    private ad var_ad_a;
    private d var_d_a;
    public byte var_byte_a;
    public byte var_byte_b;
    private int i = 10;
    private Vector var_java_util_Vector_a;
    private int j;
    public int var_int_a;
    private int k;
    private short[] var_short_arr_a;
    private short[] var_short_arr_b;
    private byte[] var_byte_arr_a;
    public int var_int_b;
    public int var_int_c;
    public int var_int_d;
    private byte[] var_byte_arr_b;
    private boolean var_boolean_a;
    private byte[][] var_byte_arr_arr_a;
    private boolean var_boolean_b;
    private boolean var_boolean_c;
    private boolean var_boolean_d;
    private Image var_javax_microedition_lcdui_Image_a;
    private Image var_javax_microedition_lcdui_Image_b;
    private Image var_javax_microedition_lcdui_Image_c;
    private boolean var_boolean_e;
    private boolean var_boolean_f;
    public int var_int_e;
    public int var_int_f;
    public int var_int_g;
    public int h;
    private int l = 0;
    private String[] var_java_lang_String_arr_a;
    private byte[] var_byte_arr_c;
    public byte var_byte_c;
    private boolean var_boolean_g;
    private long var_long_a;
    private int m;
    private p var_p_a;
    private static short[][] var_short_arr_arr_a;
    private static final short[][][] var_short_arr_arr_arr_a;

    /*
     * WARNING - void declaration
     */
    private void a(byte by, boolean bl, int n2, int n3) {
        boolean bl2;
        void var4_7;
        void var5_8 = var4_7;
        var4_7 = bl2;
        bl2 = bl;
        byte by2 = by;
        u u2 = this;
        this.var_byte_b = 0;
        u2.j = by2;
        u2.var_int_a = 0;
        u2.var_boolean_b = bl2;
        u2.var_boolean_a = false;
        if (var_short_arr_arr_a[u2.j] != null) {
            u2.var_byte_arr_b = new byte[var_short_arr_arr_a[u2.j].length];
            u2.var_int_d = d.c(u2.var_d_a.byte_a(var_short_arr_arr_a[u2.j][0]));
        } else {
            u2.var_int_d = d.c(0);
        }
        u2.var_int_d -= 2;
        u2.var_int_c = 0;
        u2.var_int_b = var5_8 / u2.var_int_d;
        u2.k = var4_7;
        int n4 = u2.int_a();
        u2.var_byte_arr_a = new byte[n4];
        u2.var_short_arr_a = new short[n4];
        u2.var_short_arr_b = new short[n4];
        switch (this.j) {
            case 2: {
                this.var_byte_arr_b[0] = !Main.i ? (byte)0 : (byte)Main.var_int_e;
                this.var_byte_arr_b[1] = !Main.j ? (byte)0 : (byte)Main.var_int_f;
                this.var_byte_arr_b[2] = (byte)(!this.var_com_hardwire_blob_Main_a.var_boolean_g ? 1 : 0);
                this.var_byte_arr_b[3] = (byte)(!this.var_ar_a.var_ac_a.var_boolean_b ? 1 : 0);
                this.var_byte_arr_b[4] = (byte)this.var_ar_a.var_ac_a.g;
                this.var_byte_arr_b[5] = (byte)this.var_com_hardwire_blob_Main_a.var_int_d;
                this.var_byte_arr_b[6] = (byte)(!this.var_ar_a.var_ac_a.var_boolean_c ? 1 : 0);
            }
        }
        this.j();
    }

    private void c(int n2) {
        this.var_boolean_a = true;
        switch (this.j) {
            case 2: {
                if (n2 == 0) {
                    Main.i = true;
                    Main.var_int_e = this.var_byte_arr_b[n2];
                    if (Main.var_int_e > 0) {
                        this.var_com_hardwire_blob_Main_a.c(12);
                        this.var_com_hardwire_blob_Main_a.a(2, false);
                    }
                }
                if (n2 == 1) {
                    Main.j = true;
                    Main.var_int_f = this.var_byte_arr_b[n2];
                    if (Main.var_int_f == 0) {
                        this.var_com_hardwire_blob_Main_a.c(12);
                    } else {
                        this.var_com_hardwire_blob_Main_a.b(12);
                        this.var_com_hardwire_blob_Main_a.a(12, true);
                    }
                }
                if (n2 != 2 || !(this.var_com_hardwire_blob_Main_a.var_boolean_g = this.var_byte_arr_b[n2] == 0)) break;
                this.var_com_hardwire_blob_Main_a.void_a(70);
            }
        }
    }

    private void g() {
        if (!this.var_boolean_a) {
            return;
        }
        switch (this.j) {
            case 2: {
                Main.var_int_e = this.var_byte_arr_b[0];
                Main.var_int_f = this.var_byte_arr_b[1];
                this.var_com_hardwire_blob_Main_a.var_boolean_g = this.var_byte_arr_b[2] == 0;
                this.var_ar_a.var_ac_a.var_boolean_b = this.var_byte_arr_b[3] == 0;
                this.var_ar_a.var_ac_a.g = this.var_byte_arr_b[4];
                this.var_com_hardwire_blob_Main_a.var_int_d = this.var_byte_arr_b[5];
                this.var_ar_a.var_ac_a.var_boolean_c = this.var_byte_arr_b[6] == 0;
                this.var_com_hardwire_blob_Main_a.void_a();
                this.var_ad_a.var_boolean_a = true;
                this.var_ad_a.m();
                this.m();
                this.var_ad_a.var_boolean_a = false;
            }
        }
    }

    private void h() {
        if (!this.var_com_hardwire_blob_Main_a.boolean_a(12)) {
            this.var_com_hardwire_blob_Main_a.a(3, false);
        }
        block5 : switch (this.var_byte_a) {
            case 0: {
                switch (var_short_arr_arr_a[this.j][this.var_int_a]) {
                    case 11: {
                        this.k();
                        this.a((byte)5);
                        break block5;
                    }
                    case 24: {
                        this.k();
                        this.a((byte)6);
                        break block5;
                    }
                    case 62: {
                        this.k();
                        if (Main.boolean_a("score")) {
                            this.a((byte)28);
                            break block5;
                        }
                        this.a((byte)32);
                        break block5;
                    }
                    case 9: {
                        this.k();
                        this.a((byte)3);
                        break block5;
                    }
                    case 7: {
                        this.k();
                        this.a((byte)2);
                        break block5;
                    }
                    case 27: {
                        this.k();
                        this.a((byte)12);
                        break block5;
                    }
                    case 2: {
                        this.k();
                        this.a((byte)49);
                    }
                }
                return;
            }
            case 1: {
                switch (var_short_arr_arr_a[this.j][this.var_int_a]) {
                    case 10: {
                        this.i();
                        break block5;
                    }
                    case 3: {
                        this.k();
                        if (this.var_ar_a.var_byte_e == 4 || this.var_ar_a.var_byte_e == 5) {
                            this.a((byte)48);
                            break block5;
                        }
                        this.a((byte)13);
                        break block5;
                    }
                    case 48: {
                        this.k();
                        this.a((byte)24);
                        break block5;
                    }
                    case 9: {
                        this.k();
                        this.a((byte)15);
                        break block5;
                    }
                    case 7: {
                        this.k();
                        this.a((byte)18);
                        break block5;
                    }
                    case 27: {
                        this.k();
                        this.a((byte)19);
                        break block5;
                    }
                    case 29: {
                        this.k();
                        this.a((byte)14);
                    }
                }
                return;
            }
            case 49: {
                this.var_com_hardwire_blob_Main_a.var_boolean_f = true;
                return;
            }
            case 3: 
            case 15: {
                switch (var_short_arr_arr_a[this.j][this.var_int_a]) {
                    case 15: {
                        this.g();
                        this.var_com_hardwire_blob_Main_a.var_ag_b = this.var_com_hardwire_blob_Main_a.var_ag_a;
                        x x2 = this.var_com_hardwire_blob_Main_a.var_ag_b.x_a();
                        this.var_com_hardwire_blob_Main_a.var_byte_b = this.var_com_hardwire_blob_Main_a.var_byte_a;
                        this.var_byte_c = this.var_byte_a;
                        this.k();
                        try {
                            x x3 = x2;
                            if (x3.var_int_a == 0) {
                                ((m)x2).x_a();
                            }
                        }
                        catch (Exception exception) {}
                        this.e();
                        break block5;
                    }
                    case 16: {
                        this.g();
                        this.k();
                        this.a(this.var_byte_a == 15 ? (byte)43 : 41);
                    }
                }
                return;
            }
            case 4: {
                this.var_ar_a.var_int_b = d.var_short_arr_a[this.var_int_a];
                this.l();
                this.var_java_util_Vector_a.removeAllElements();
                this.var_ar_a.a((byte)1, (byte)1);
                return;
            }
            case 6: {
                switch (var_short_arr_arr_a[this.j][this.var_int_a]) {
                    case 19: {
                        this.k();
                        this.a((byte)9);
                        at at2 = this.var_com_hardwire_blob_Main_a.var_at_a;
                        at2.void_a();
                        at2.var_byte_a = 0;
                        at2.var_byte_b = 0;
                        new Thread(at2).start();
                        break block5;
                    }
                    case 18: {
                        this.k();
                        this.a((byte)8);
                        at at3 = this.var_com_hardwire_blob_Main_a.var_at_a;
                        at3.void_a();
                        at3.var_byte_a = 1;
                        at3.var_byte_b = 1;
                        new Thread(at3).start();
                    }
                }
                return;
            }
            case 7: {
                this.var_ad_a.var_boolean_a = true;
                this.var_ad_a.m();
                int n2 = this.var_int_a;
                at at4 = this.var_com_hardwire_blob_Main_a.var_at_a;
                this.var_com_hardwire_blob_Main_a.var_at_a.var_int_a = n2;
                at4.var_byte_b = (byte)2;
                new Thread(at4).start();
                return;
            }
            case 17: {
                switch (var_short_arr_arr_a[this.j][this.var_int_a]) {
                    case 205: {
                        try {
                            this.var_com_hardwire_blob_Main_a.void_a("msave");
                            this.var_ar_a.var_int_b = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            this.var_ar_a.h = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            this.var_ar_a.i = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            this.var_ar_a.j = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            this.var_com_hardwire_blob_Main_a.a(false);
                        }
                        catch (Exception exception) {}
                        this.b((byte)2);
                        break block5;
                    }
                    case 25: {
                        this.k();
                        if (!Main.boolean_a("msave")) {
                            this.var_byte_a = (byte)23;
                            this.h();
                            break block5;
                        }
                        this.a((byte)23);
                        break block5;
                    }
                    case 43: {
                        this.k();
                        this.a((byte)20);
                        break block5;
                    }
                    case 44: {
                        this.k();
                        this.a((byte)21);
                        break block5;
                    }
                    case 45: {
                        this.k();
                        this.a((byte)22);
                        break block5;
                    }
                    case 151: {
                        this.k();
                        this.a((byte)47);
                        break block5;
                    }
                    case 94: {
                        this.k();
                        this.a((byte)45);
                    }
                }
                return;
            }
            case 45: {
                this.var_ar_a.var_int_b = d.var_short_arr_b[this.var_int_a];
                this.b((byte)3);
                return;
            }
            case 47: {
                this.var_ar_a.var_int_b = d.var_short_arr_c[this.var_int_a];
                this.b((byte)3);
                return;
            }
            case 20: {
                this.var_ar_a.var_int_b = d.var_short_arr_d[this.var_int_a];
                this.b((byte)3);
                return;
            }
            case 21: {
                this.var_ar_a.var_int_b = d.var_short_arr_e[this.var_int_a];
                this.b((byte)4);
                return;
            }
            case 22: {
                this.var_ar_a.var_int_b = d.f[this.var_int_a];
                this.b((byte)5);
                return;
            }
            case 23: {
                this.var_com_hardwire_blob_Main_a.c("msave");
                this.var_ar_a.var_int_b = d.var_short_arr_d[0];
                this.var_ar_a.h = 0;
                this.var_ar_a.i = 0;
                this.var_ar_a.j = 0;
                this.b((byte)2);
                return;
            }
            case 24: {
                this.a((byte)17);
                return;
            }
            case 5: {
                switch (var_short_arr_arr_a[this.j][this.var_int_a]) {
                    case 205: {
                        try {
                            this.var_com_hardwire_blob_Main_a.void_a("save");
                            this.var_ar_a.var_int_b = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            this.var_ar_a.h = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            this.var_ar_a.i = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            this.var_ar_a.j = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            this.var_com_hardwire_blob_Main_a.a(false);
                        }
                        catch (Exception exception) {}
                        this.var_ar_a.a((byte)1, (byte)0);
                        break block5;
                    }
                    case 25: {
                        this.k();
                        if (!Main.boolean_a("save")) {
                            this.var_byte_a = (byte)16;
                            this.h();
                            break block5;
                        }
                        this.a((byte)16);
                        break block5;
                    }
                    case 26: {
                        this.k();
                        this.a((byte)4);
                        break block5;
                    }
                    case 94: {
                        this.k();
                        this.a((byte)44);
                        break block5;
                    }
                    case 145: {
                        this.k();
                        this.a((byte)46);
                    }
                }
                return;
            }
            case 44: {
                this.var_ar_a.var_int_b = d.var_short_arr_b[this.var_int_a];
                this.l();
                this.var_java_util_Vector_a.removeAllElements();
                this.var_ar_a.a((byte)1, (byte)1);
                return;
            }
            case 13: {
                if (this.var_ar_a.var_byte_b == 2 || this.var_ar_a.var_byte_b == 4) {
                    this.var_ar_a.var_byte_a = 1;
                }
                this.l();
                this.var_com_hardwire_blob_Main_a.var_byte_a = 0;
                this.var_ar_a.var_byte_d = (byte)2;
                return;
            }
            case 14: 
            case 25: {
                if (this.var_ar_a.var_byte_b == 2 || this.var_ar_a.var_byte_b == 4) {
                    this.var_com_hardwire_blob_Main_a.var_at_a.b();
                }
                this.var_ar_a.d();
                this.a((byte)0);
                return;
            }
            case 16: {
                this.var_com_hardwire_blob_Main_a.c("save");
                this.var_ar_a.var_int_b = 93;
                this.var_ar_a.h = 0;
                this.var_ar_a.i = 0;
                this.var_ar_a.j = 0;
                this.l();
                this.var_java_util_Vector_a.removeAllElements();
                this.var_ar_a.a((byte)1, (byte)0);
                return;
            }
            case 26: {
                if (this.var_ad_a.var_java_lang_StringBuffer_a.length() == 0) break;
                this.var_ad_a.var_boolean_a = true;
                this.var_ad_a.m();
                boolean bl = false;
                try {
                    int n3;
                    String[] stringArray = new String[]{"", "", "", ""};
                    int[] nArray = new int[]{0, 0, 0, 0};
                    int[] nArray2 = new int[]{3540000, 3540000, 3540000, 3540000};
                    int[] nArray3 = new int[]{0, 0, 0, 0};
                    if (Main.boolean_a("score")) {
                        this.var_com_hardwire_blob_Main_a.void_a("score");
                        for (n3 = 0; n3 < 4; ++n3) {
                            stringArray[n3] = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readUTF();
                            nArray[n3] = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            nArray2[n3] = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            nArray3[n3] = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                        }
                        this.var_com_hardwire_blob_Main_a.a(false);
                    }
                    n3 = 0;
                    if (this.var_ar_a.var_byte_b != 1) {
                        n3 = 2;
                    }
                    if (this.var_ar_a.h > nArray[n3 + 0]) {
                        bl = true;
                        stringArray[n3 + 0] = this.var_ad_a.var_java_lang_StringBuffer_a.toString();
                        nArray[n3 + 0] = this.var_ar_a.h;
                        nArray2[n3 + 0] = this.var_ar_a.i;
                        nArray3[n3 + 0] = this.var_ar_a.j;
                    }
                    if (this.var_ar_a.i < nArray2[n3 + 1]) {
                        bl = true;
                        stringArray[n3 + 1] = this.var_ad_a.var_java_lang_StringBuffer_a.toString();
                        nArray[n3 + 1] = this.var_ar_a.h;
                        nArray2[n3 + 1] = this.var_ar_a.i;
                        nArray3[n3 + 1] = this.var_ar_a.j;
                    }
                    this.var_com_hardwire_blob_Main_a.b("score");
                    for (int i2 = 0; i2 < 4; ++i2) {
                        this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeUTF(stringArray[i2]);
                        this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeInt(nArray[i2]);
                        this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeInt(nArray2[i2]);
                        this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeInt(nArray3[i2]);
                    }
                    this.var_com_hardwire_blob_Main_a.a(true);
                }
                catch (Exception exception) {}
                this.var_ad_a.var_boolean_a = false;
                this.var_java_util_Vector_a.removeAllElements();
                this.a(bl ? (byte)30 : 31);
                return;
            }
            case 27: {
                this.a((byte)33);
                try {
                    int n4;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Object object = new DataOutputStream(byteArrayOutputStream);
                    int n5 = 0;
                    int n6 = 0;
                    this.var_com_hardwire_blob_Main_a.void_a("score");
                    ((FilterOutputStream)object).write((System.getProperty("microedition.platform") + "\n").getBytes());
                    for (int i3 = 0; i3 < 4; ++i3) {
                        int n7;
                        String string = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readUTF();
                        String string2 = string + "\n";
                        for (n7 = 0; n7 < string2.length(); ++n7) {
                            n6 += string2.charAt(n7);
                        }
                        ((FilterOutputStream)object).write(string2.getBytes());
                        n7 = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                        n6 += n7;
                        n4 = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                        int n8 = this.int_a(n5);
                        n5 = n8;
                        n5 = this.int_a(n5);
                        ((DataOutputStream)object).writeInt((n7 + this.var_byte_arr_c[n8]) * this.var_byte_arr_c[n5]);
                        n7 = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                        int n9 = this.int_a(n5);
                        n5 = n9;
                        n5 = this.int_a(n5);
                        ((DataOutputStream)object).writeInt((n4 - this.var_byte_arr_c[n9]) * this.var_byte_arr_c[n5]);
                        int n10 = this.int_a(n5);
                        n5 = n10;
                        n5 = this.int_a(n5);
                        ((DataOutputStream)object).writeInt((n7 + this.var_byte_arr_c[n10]) * this.var_byte_arr_c[n5]);
                        n6 += n4 / 1000;
                        n6 += n7;
                    }
                    int n11 = this.int_a(n5);
                    n5 = n11;
                    int n12 = this.int_a(n5);
                    n5 = n12;
                    int n13 = this.int_a(n5);
                    n5 = n13;
                    n5 = this.int_a(n5);
                    ((DataOutputStream)object).writeInt((int)((long)n6 * (long)this.var_byte_arr_c[n11] % (long)(this.var_byte_arr_c[n12] * this.var_byte_arr_c[n13] * this.var_byte_arr_c[n5] * this.var_byte_arr_c[this.int_a(n5)])));
                    ((DataOutputStream)object).writeByte(1);
                    this.var_com_hardwire_blob_Main_a.a(false);
                    if (this.var_p_a == null) {
                        this.var_p_a = new p(this.var_com_hardwire_blob_Main_a);
                    }
                    n4 = 0;
                    object = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream = null;
                    Runnable runnable = this.var_p_a;
                    this.var_p_a.var_byte_arr_a = (byte[])object;
                    ((p)runnable).var_java_lang_String_a = null;
                    ((p)runnable).var_byte_a = 0;
                    runnable = new Thread(runnable);
                    ((Thread)runnable).setPriority(10);
                    ((Thread)runnable).start();
                }
                catch (Exception exception) {}
                System.gc();
                return;
            }
            case 28: {
                this.a((byte)27);
                return;
            }
            case 39: {
                x x4;
                this.var_com_hardwire_blob_Main_a.var_ag_b = this.var_com_hardwire_blob_Main_a.var_ag_a;
                x x5 = x4 = this.var_com_hardwire_blob_Main_a.var_ag_b.x_a();
                if (x4.var_int_a == 0) {
                    ((m)x4).x_a();
                }
                this.e();
                return;
            }
            case 37: {
                h h2;
                h h3 = h2 = (h)this.var_com_hardwire_blob_Main_a.var_ag_b.x_a();
                if (h2.var_java_lang_String_arr_a[this.var_int_a].compareTo(j.j_a().a(4)) == 0) {
                    this.var_boolean_g = true;
                }
                h2.a(this.var_int_a);
                this.e();
                return;
            }
            case 41: 
            case 42: 
            case 43: {
                this.var_ad_a.var_boolean_a = true;
                this.var_ad_a.m();
                d.var_int_a = this.var_int_a;
                if (this.var_ar_a.var_short_arr_arr_a != null) {
                    this.var_com_hardwire_blob_Main_a.var_d_b.b();
                    this.var_com_hardwire_blob_Main_a.var_d_b.c();
                }
                this.var_d_a.e();
                j.void_a("/tz." + d.var_java_lang_String_arr_a[d.var_int_a]);
                j.b("UTF-8");
                j.j_a().void_a();
                this.var_ad_a.var_boolean_a = false;
                if (this.var_byte_a == 41) {
                    this.a((byte)3);
                    this.c();
                    this.var_boolean_a = true;
                    return;
                }
                if (this.var_byte_a == 43) {
                    this.a((byte)15);
                    this.c();
                    this.var_boolean_a = true;
                    return;
                }
                this.void_a();
                return;
            }
            case 40: {
                Main.h = true;
                Main.i = true;
                if (Main.var_int_e == 0) {
                    Main.var_int_e = 5;
                }
                this.a((byte)50);
                return;
            }
            case 50: {
                Main.j = true;
                if (Main.var_int_f == 0) {
                    Main.var_int_f = 3;
                }
                this.a((byte)0);
            }
        }
    }

    public final void void_a() {
        this.var_com_hardwire_blob_Main_a.var_byte_b = 1;
        this.var_byte_c = 0;
        if (Main.var_boolean_e) {
            this.var_byte_c = (byte)40;
        } else {
            Main.h = true;
        }
        this.var_com_hardwire_blob_Main_a.var_ag_b = this.var_com_hardwire_blob_Main_a.var_ag_a;
        if (this.var_com_hardwire_blob_Main_a.var_ag_b.boolean_c()) {
            x x2;
            x x3 = x2 = this.var_com_hardwire_blob_Main_a.var_ag_b.x_a();
            if (x2.var_int_a == 0) {
                ((m)x2).b();
            }
            this.e();
            return;
        }
        if (Main.var_boolean_e) {
            this.a((byte)39);
            return;
        }
        if (Main.var_boolean_e) {
            this.a((byte)40);
            return;
        }
        Main.h = true;
        this.a((byte)0);
    }

    private int int_a(int n2) {
        if (++n2 == this.var_byte_arr_c.length) {
            n2 = 0;
        }
        return n2;
    }

    private void i() {
        switch (this.var_byte_a) {
            case 1: {
                this.k();
                this.l();
                this.var_ar_a.var_ac_a.c();
                this.var_com_hardwire_blob_Main_a.var_byte_a = 0;
                this.var_com_hardwire_blob_Main_a.c(12);
                return;
            }
            case 4: 
            case 16: 
            case 44: 
            case 46: {
                this.a((byte)5);
                this.c();
                return;
            }
            case 3: {
                this.g();
            }
            case 2: 
            case 5: 
            case 6: 
            case 12: 
            case 49: {
                this.a((byte)0);
                this.c();
                return;
            }
            case 15: {
                this.g();
                this.var_com_hardwire_blob_Main_a.c(12);
            }
            case 13: 
            case 14: 
            case 18: 
            case 19: 
            case 24: 
            case 48: {
                this.a((byte)1);
                this.c();
                return;
            }
            case 7: {
                this.a((byte)6);
                this.c();
                return;
            }
            case 9: {
                at at2 = this.var_com_hardwire_blob_Main_a.var_at_a;
                if (at2.var_byte_a == 0) {
                    try {
                        at2.var_javax_bluetooth_LocalDevice_a.setDiscoverable(0);
                    }
                    catch (Exception exception) {}
                }
                this.var_com_hardwire_blob_Main_a.var_at_a.b();
            }
            case 10: 
            case 11: {
                this.a((byte)6);
                this.c();
                return;
            }
            case 17: {
                this.k();
                this.a((byte)25);
                return;
            }
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 25: 
            case 45: 
            case 47: {
                this.a((byte)17);
                this.c();
                return;
            }
            case 27: {
                this.a((byte)28);
                return;
            }
            case 28: {
                this.a((byte)0);
                this.c();
                return;
            }
            case 29: {
                this.a((byte)17);
                return;
            }
            case 30: {
                this.a(this.var_ar_a.var_byte_b != 1 ? (byte)29 : 28);
                return;
            }
            case 31: {
                this.a(this.var_ar_a.var_byte_b != 1 ? (byte)17 : 0);
                return;
            }
            case 32: {
                this.a((byte)0);
                this.c();
                return;
            }
            case 33: 
            case 34: 
            case 35: {
                this.a((byte)28);
                return;
            }
            case 39: {
                this.a(this.var_byte_c);
                return;
            }
            case 36: {
                ((i)this.var_com_hardwire_blob_Main_a.var_ag_b.x_a()).x_a();
                this.e();
                return;
            }
            case 37: {
                ((h)this.var_com_hardwire_blob_Main_a.var_ag_b.x_a()).x_a();
                this.e();
                return;
            }
            case 38: {
                ((l)this.var_com_hardwire_blob_Main_a.var_ag_b.x_a()).x_a();
                this.e();
                return;
            }
            case 41: {
                this.a((byte)3);
                this.c();
                return;
            }
            case 43: {
                this.a((byte)15);
                this.c();
                return;
            }
            case 40: {
                Main.h = true;
                Main.i = false;
                Main.var_int_e = 0;
                this.a((byte)50);
                return;
            }
            case 50: {
                Main.j = false;
                Main.var_int_f = 0;
                this.a((byte)0);
            }
        }
    }

    public final void b() {
        if (this.var_javax_microedition_lcdui_Image_a == null) {
            this.var_javax_microedition_lcdui_Image_a = this.var_ad_a.javax_microedition_lcdui_Image_a(1);
            this.var_javax_microedition_lcdui_Image_b = this.var_ad_a.javax_microedition_lcdui_Image_a(0);
        }
    }

    public final void a(byte n2) {
        try {
            this.var_ad_a.var_boolean_a = false;
            this.l();
            this.d();
            int n3 = this.var_int_e - 2;
            int n4 = this.var_int_f;
            this.var_byte_a = n2;
            switch (this.var_byte_a) {
                case 0: {
                    if (Main.var_boolean_e) {
                        this.m();
                        Main.var_boolean_e = false;
                    }
                    this.a((byte)0, false, n3, n4);
                    if (!this.var_com_hardwire_blob_Main_a.var_boolean_a) {
                        this.var_com_hardwire_blob_Main_a.a(12, true);
                    }
                    Main.k = true;
                    break;
                }
                case 1: {
                    this.a((byte)(this.var_ar_a.var_byte_b == 1 ? 1 : (this.var_ar_a.var_byte_b == 2 ? 8 : 14)), true, n3, n4);
                    break;
                }
                case 2: 
                case 18: {
                    byte[][] byArray = this.var_d_a.byte_arr_arr_a(this.var_com_hardwire_blob_Main_a.var_an_a.boolean_a() ? 206 : 8);
                    byte[][] byArray2 = this.var_d_a.byte_arr_arr_a(154);
                    byte[][] byArrayArray = new byte[byArray.length + byArray2.length][];
                    System.arraycopy(byArray, 0, byArrayArray, 0, byArray.length);
                    System.arraycopy(byArray2, 0, byArrayArray, byArray.length, byArray2.length);
                    this.a(byArrayArray, false, true);
                    break;
                }
                case 49: {
                    this.a(202, true, true);
                    break;
                }
                case 3: 
                case 15: {
                    this.a((byte)2, true, n3, n4);
                    break;
                }
                case 4: {
                    this.var_ad_a.var_boolean_a = true;
                    this.var_ad_a.m();
                    this.var_com_hardwire_blob_Main_a.void_a("achi");
                    int n5 = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    n2 = n5;
                    if (n5 == 0) {
                        this.var_com_hardwire_blob_Main_a.a(false);
                        this.var_ad_a.var_boolean_a = false;
                        this.a(138, false, true);
                        break;
                    }
                    byte[][] byArrayArray = new byte[6][];
                    byte[][] byArrayArray2 = byArrayArray;
                    byArrayArray[1] = d.byte_arr_a(0, " (");
                    byArrayArray2[3] = new byte[]{d.a(0, '/')};
                    byArrayArray2[5] = new byte[]{d.a(0, ')')};
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_byte_arr_arr_a = new byte[n2][];
                    for (int i2 = 0; i2 < this.var_byte_arr_arr_a.length; ++i2) {
                        int n6 = 0;
                        for (n2 = 0; n2 < Main.var_int_arr_a[i2]; ++n2) {
                            if (!this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readBoolean()) continue;
                            ++n6;
                        }
                        if (Main.var_int_arr_a[i2] == 0) {
                            this.var_byte_arr_arr_a[i2] = this.var_d_a.byte_arr_a(d.var_short_arr_a[i2]);
                            continue;
                        }
                        byArrayArray2[0] = this.var_d_a.byte_arr_a(d.var_short_arr_a[i2]);
                        byArrayArray2[2] = d.byte_arr_a(0, n6);
                        byArrayArray2[4] = d.byte_arr_a(0, Main.var_int_arr_a[i2]);
                        this.var_byte_arr_arr_a[i2] = d.a(byArrayArray2);
                    }
                    this.var_com_hardwire_blob_Main_a.a(false);
                    this.var_ad_a.var_boolean_a = false;
                    this.a((byte)3, true, n3, n4);
                    break;
                }
                case 44: 
                case 45: {
                    int n7;
                    this.var_ad_a.var_boolean_a = true;
                    this.var_ad_a.m();
                    this.var_com_hardwire_blob_Main_a.void_a("achi");
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    n2 = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_com_hardwire_blob_Main_a.a(false);
                    this.var_ad_a.var_boolean_a = false;
                    int n8 = 0;
                    for (n7 = 0; n7 < Main.var_int_arr_b.length; ++n7) {
                        if (n2 < Main.var_int_arr_b[n7]) continue;
                        n8 = n7 + 1;
                    }
                    if (n8 == 0) {
                        this.a(144, false, true);
                        break;
                    }
                    this.var_byte_arr_arr_a = new byte[n8][];
                    for (n7 = 0; n7 < n8; ++n7) {
                        this.var_byte_arr_arr_a[n7] = this.var_d_a.byte_arr_a(d.var_short_arr_b[n7]);
                    }
                    this.a((byte)17, true, n3, n4);
                    break;
                }
                case 46: {
                    int n9;
                    this.var_ad_a.var_boolean_a = true;
                    this.var_ad_a.m();
                    this.var_com_hardwire_blob_Main_a.void_a("achi");
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    for (n2 = 0; n2 < Main.var_int_arr_a.length; n2 = (int)(n2 + 1)) {
                        for (n9 = 0; n9 < Main.var_int_arr_a[n2]; ++n9) {
                            this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readBoolean();
                        }
                    }
                    byte[][] byArrayArray = new byte[Main.var_int_arr_a.length][];
                    n9 = 0;
                    for (int i3 = 0; i3 < Main.var_int_arr_a.length; ++i3) {
                        boolean bl = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readBoolean();
                        if (!bl) continue;
                        byArrayArray[n9++] = d.byte_arr_a(3, Main.var_int_arr_e[i3]);
                    }
                    this.var_com_hardwire_blob_Main_a.a(false);
                    this.var_ad_a.var_boolean_a = false;
                    if (n9 == 0) {
                        this.a(153, false, true);
                        break;
                    }
                    byte[][] byArray = this.var_d_a.byte_arr_arr_a(146);
                    byte[][] byArrayArray3 = new byte[byArray.length + n9][];
                    System.arraycopy(byArray, 0, byArrayArray3, 0, byArray.length);
                    System.arraycopy(byArrayArray, 0, byArrayArray3, byArray.length, n9);
                    this.a(byArrayArray3, false, true);
                    break;
                }
                case 5: {
                    this.a(Main.boolean_a("save") ? (byte)7 : 6, true, n3, n4);
                    break;
                }
                case 6: {
                    this.a((byte)4, true, n3, n4);
                    break;
                }
                case 7: {
                    this.var_byte_arr_arr_a = new byte[this.var_java_lang_String_arr_a.length][];
                    for (n2 = 0; n2 < this.var_byte_arr_arr_a.length; n2 = (int)(n2 + 1)) {
                        this.var_byte_arr_arr_a[n2] = d.byte_arr_a(0, this.var_java_lang_String_arr_a[n2]);
                    }
                    this.a((byte)5, true, n3, n4);
                    break;
                }
                case 8: {
                    this.a(20, false, false);
                    break;
                }
                case 9: {
                    this.a(21, false, true);
                    break;
                }
                case 10: {
                    this.a(22, false, true);
                    break;
                }
                case 48: {
                    this.a(160, false, true);
                    break;
                }
                case 11: {
                    this.a(23, false, true);
                    break;
                }
                case 17: {
                    this.a(Main.boolean_a("msave") ? (byte)10 : 9, true, n3, n4);
                    break;
                }
                case 47: {
                    this.var_ad_a.var_boolean_a = true;
                    this.var_ad_a.m();
                    this.var_com_hardwire_blob_Main_a.void_a("achi");
                    n2 = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_com_hardwire_blob_Main_a.a(false);
                    this.var_ad_a.var_boolean_a = false;
                    if (n2 == 0) {
                        this.a(138, false, true);
                        break;
                    }
                    byte[][] byArrayArray = new byte[n2][];
                    int n10 = 0;
                    for (int i4 = 0; i4 < n2; ++i4) {
                        if (d.a(d.var_short_arr_c, (int)d.var_short_arr_a[i4]) == -1) continue;
                        byArrayArray[n10++] = this.var_d_a.byte_arr_a(d.var_short_arr_a[i4]);
                    }
                    this.var_byte_arr_arr_a = new byte[n10][];
                    System.arraycopy(byArrayArray, 0, this.var_byte_arr_arr_a, 0, n10);
                    this.a((byte)18, true, n3, n4);
                    break;
                }
                case 20: {
                    this.var_ad_a.var_boolean_a = true;
                    this.var_ad_a.m();
                    this.var_com_hardwire_blob_Main_a.void_a("achi");
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    n2 = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_com_hardwire_blob_Main_a.a(false);
                    this.var_ad_a.var_boolean_a = false;
                    if (n2 == 0) {
                        this.a(152, false, true);
                        break;
                    }
                    this.var_byte_arr_arr_a = new byte[n2][];
                    for (int i5 = 0; i5 < n2; ++i5) {
                        this.var_byte_arr_arr_a[i5] = this.var_d_a.byte_arr_a(d.var_short_arr_d[i5]);
                    }
                    this.a((byte)13, true, n3, n4);
                    break;
                }
                case 21: {
                    int n11;
                    this.var_ad_a.var_boolean_a = true;
                    this.var_ad_a.m();
                    this.var_com_hardwire_blob_Main_a.void_a("achi");
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    n2 = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_com_hardwire_blob_Main_a.a(false);
                    this.var_ad_a.var_boolean_a = false;
                    int n12 = 0;
                    for (n11 = 0; n11 < Main.var_int_arr_c.length; ++n11) {
                        if (n2 < Main.var_int_arr_c[n11]) continue;
                        n12 = n11 + 1;
                    }
                    this.var_byte_arr_arr_a = new byte[n12 += 5][];
                    for (n11 = 0; n11 < n12; ++n11) {
                        this.var_byte_arr_arr_a[n11] = this.var_d_a.byte_arr_a(d.var_short_arr_e[n11]);
                    }
                    this.a((byte)11, true, n3, n4);
                    break;
                }
                case 22: {
                    int n13;
                    this.var_ad_a.var_boolean_a = true;
                    this.var_ad_a.m();
                    this.var_com_hardwire_blob_Main_a.void_a("achi");
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    n2 = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                    this.var_com_hardwire_blob_Main_a.a(false);
                    this.var_ad_a.var_boolean_a = false;
                    int n14 = 0;
                    for (n13 = 0; n13 < Main.var_int_arr_d.length; ++n13) {
                        if (n2 < Main.var_int_arr_d[n13]) continue;
                        n14 = n13 + 1;
                    }
                    this.var_byte_arr_arr_a = new byte[n14 += 5][];
                    for (n13 = 0; n13 < n14; ++n13) {
                        this.var_byte_arr_arr_a[n13] = this.var_d_a.byte_arr_a(d.f[n13]);
                    }
                    this.a((byte)12, true, n3, n4);
                    break;
                }
                case 23: {
                    this.a(31, true, true);
                    break;
                }
                case 24: {
                    this.a(30, true, true);
                    break;
                }
                case 25: {
                    this.a(49, true, true);
                    break;
                }
                case 12: 
                case 19: {
                    this.a(28, false, true);
                    break;
                }
                case 13: 
                case 14: {
                    this.a(30, true, true);
                    break;
                }
                case 16: {
                    this.a(31, true, true);
                    break;
                }
                case 26: {
                    this.var_byte_b = (byte)2;
                    this.var_ad_a.a((short)58, "", 11);
                    break;
                }
                case 27: {
                    this.a(55, true, true);
                    break;
                }
                case 30: {
                    this.a(61, false, true);
                    break;
                }
                case 31: {
                    this.a(60, false, true);
                    break;
                }
                case 32: {
                    this.a(64, false, true);
                    break;
                }
                case 33: {
                    this.a(56, false, true);
                    break;
                }
                case 34: {
                    this.a(22, false, true);
                    break;
                }
                case 35: {
                    this.var_p_a = null;
                    this.a(57, false, true);
                    break;
                }
                case 28: 
                case 29: {
                    this.var_ad_a.var_boolean_a = true;
                    this.var_ad_a.m();
                    byte[][] byArray = this.byte_arr_arr_a();
                    this.var_ad_a.var_boolean_a = false;
                    this.a(byArray, this.var_byte_a == 28, true);
                    break;
                }
                case 39: {
                    this.a(14, true, true);
                    break;
                }
                case 36: {
                    i i6 = (i)this.var_com_hardwire_blob_Main_a.var_ag_b.x_a();
                    byte by = this.var_d_a.byte_a(28);
                    i i7 = i6;
                    this.a(d.byte_arr_arr_a(by, d.byte_arr_a((int)by, i7.var_java_lang_String_a), d.int_a()), false, true);
                    break;
                }
                case 37: {
                    h h2;
                    h h3 = h2 = (h)this.var_com_hardwire_blob_Main_a.var_ag_b.x_a();
                    String[] stringArray = h2.var_java_lang_String_arr_a;
                    this.var_byte_arr_arr_a = new byte[stringArray.length][];
                    for (int i8 = 0; i8 < stringArray.length; ++i8) {
                        this.var_byte_arr_arr_a[i8] = d.byte_arr_a(0, stringArray[i8]);
                    }
                    this.a((byte)15, true, n3, n4);
                    break;
                }
                case 38: {
                    l l2 = (l)this.var_com_hardwire_blob_Main_a.var_ag_b.x_a();
                    byte by = this.var_d_a.byte_a(28);
                    l l3 = l2;
                    this.a(d.byte_arr_arr_a(by, d.byte_arr_a((int)by, l3.var_java_lang_String_a), d.int_a()), false, l2.boolean_a());
                    break;
                }
                case 42: {
                    this.var_byte_arr_arr_a = d.var_byte_arr_arr_a;
                    this.a((byte)16, false, n3, n4);
                    break;
                }
                case 41: 
                case 43: {
                    this.var_byte_arr_arr_a = d.var_byte_arr_arr_a;
                    this.a((byte)16, true, n3, n4);
                    this.var_int_a = d.var_int_a;
                    break;
                }
                case 40: {
                    this.a(17, true, true);
                    break;
                }
                case 50: {
                    this.a(203, true, true);
                }
            }
            u u2 = this;
            n3 = u2.var_int_f;
            n4 = u2.var_int_e;
            if (u2.var_byte_b == 1) {
                n3 = u2.var_ad_a.var_byte_arr_arr_a.length * (d.c(u2.var_d_a.byte_a(8)) + 1);
            } else if (u2.var_byte_b == 0) {
                int n15 = u2.int_a();
                n3 = n15 < u2.var_int_b ? n15 : u2.var_int_b;
                n3 = n3 * u2.var_int_d;
                n4 = 0;
                for (int i9 = 0; i9 < n15; ++i9) {
                    int n16 = u2.int_a(u2.j, i9);
                    if (n16 <= n4) continue;
                    n4 = n16;
                }
            } else if (u2.var_byte_b == 2) {
                n3 = 2 * (d.c(0) + 1);
            }
            int n17 = u2.var_int_e - n4;
            if (n17 > 0) {
                u2.var_int_g += n17 >> 1;
                u2.var_int_e -= n17;
            }
            if ((n17 = u2.var_int_f - n3) > 0) {
                u2.h += n17 >> 1;
                u2.var_int_f -= n17;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private byte[][] byte_arr_arr_a() {
        Object object = null;
        this.var_com_hardwire_blob_Main_a.void_a("score");
        object = d.byte_arr_a(3, "^");
        byte[] byArray = d.byte_arr_a(3, "~");
        byte[] byArray2 = d.byte_arr_a(3, " ");
        String[] stringArray = new String[4];
        int[] nArray = new int[4];
        int[] nArray2 = new int[4];
        try {
            for (int i2 = 0; i2 < 4; ++i2) {
                stringArray[i2] = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readUTF();
                nArray[i2] = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                nArray2[i2] = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
            }
        }
        catch (Exception exception) {}
        byte[][] byArrayArray = new byte[][]{object, this.var_d_a.byte_arr_a(11), byArray, this.var_d_a.byte_arr_a(59), d.byte_arr_a(3, stringArray[0]), byArray, this.var_d_a.byte_arr_a(36), byArray2, d.byte_arr_a(3, nArray[0]), byArray, this.var_d_a.byte_arr_a(37), byArray2, ac.byte_arr_a(nArray2[0]), byArray, byArray, this.var_d_a.byte_arr_a(59), d.byte_arr_a(3, stringArray[1]), byArray, this.var_d_a.byte_arr_a(36), byArray2, d.byte_arr_a(3, nArray[1]), byArray, this.var_d_a.byte_arr_a(37), byArray2, ac.byte_arr_a(nArray2[1]), byArray, byArray, object, this.var_d_a.byte_arr_a(24), byArray, this.var_d_a.byte_arr_a(59), d.byte_arr_a(3, stringArray[2]), byArray, this.var_d_a.byte_arr_a(36), byArray2, d.byte_arr_a(3, nArray[2]), byArray, this.var_d_a.byte_arr_a(37), byArray2, ac.byte_arr_a(nArray2[2]), byArray, byArray, this.var_d_a.byte_arr_a(59), d.byte_arr_a(3, stringArray[3]), byArray, this.var_d_a.byte_arr_a(36), byArray2, d.byte_arr_a(3, nArray[3]), byArray, this.var_d_a.byte_arr_a(37), byArray2, ac.byte_arr_a(nArray2[3])};
        this.var_com_hardwire_blob_Main_a.a(false);
        object = d.byte_arr_arr_a(3, d.a(byArrayArray), ad.var_int_a - 10);
        System.gc();
        return object;
    }

    private void b(byte by) {
        this.var_ad_a.var_boolean_a = true;
        this.var_ad_a.m();
        if (this.var_ar_a.var_byte_arr_arr_arr_a != null) {
            this.var_ar_a.var_boolean_a = true;
            this.var_com_hardwire_blob_Main_a.var_at_a.a(new byte[]{2});
            this.var_ar_a.d();
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(this.var_ar_a.var_int_b);
            dataOutputStream.writeByte(by);
        }
        catch (IOException iOException) {
            this.a((byte)10);
            this.var_ad_a.var_boolean_a = false;
            return;
        }
        if (!this.var_com_hardwire_blob_Main_a.var_at_a.a(byteArrayOutputStream.toByteArray())) {
            this.a((byte)10);
        } else {
            try {
                this.l();
                this.var_java_util_Vector_a.removeAllElements();
                this.var_ar_a.var_int_arr_e[1] = 0;
                this.var_ar_a.var_int_arr_e[0] = 0;
                this.var_ar_a.a((byte)2, by);
            }
            catch (RuntimeException runtimeException) {
                this.var_com_hardwire_blob_Main_a.var_at_a.b();
                this.a((byte)10);
            }
        }
        this.var_ad_a.var_boolean_a = false;
    }

    public final void a(boolean bl) {
        String[] stringArray;
        if (bl) {
            this.a((byte)10);
            return;
        }
        at at2 = this.var_com_hardwire_blob_Main_a.var_at_a;
        if (at2.var_java_util_Vector_a == null) {
            stringArray = new String[]{};
        } else {
            int n2 = at2.var_java_util_Vector_a.size();
            String[] stringArray2 = new String[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                ServiceRecord serviceRecord = (ServiceRecord)at2.var_java_util_Vector_a.elementAt(i2);
                serviceRecord = serviceRecord.getAttributeValue(256);
                stringArray2[i2] = (String)serviceRecord.getValue();
            }
            stringArray = this.var_java_lang_String_arr_a = stringArray2;
        }
        if (this.var_java_lang_String_arr_a.length == 0) {
            this.a((byte)11);
            return;
        }
        this.a((byte)7);
    }

    public final void b(boolean bl) {
        if (bl) {
            this.a((byte)10);
        }
    }

    public final void c(boolean bl) {
        if (bl) {
            this.a((byte)10);
            return;
        }
        while (!this.var_com_hardwire_blob_Main_a.var_at_a.boolean_a()) {
            try {
                this.boolean_a();
                Thread.sleep(1L);
            }
            catch (InterruptedException interruptedException) {}
        }
        if (this.var_com_hardwire_blob_Main_a.var_at_a.var_boolean_a) {
            this.a((byte)6);
            return;
        }
        InputStream inputStream = this.var_com_hardwire_blob_Main_a.var_at_a.java_io_ByteArrayInputStream_a();
        if (inputStream == null) {
            this.a((byte)10);
            return;
        }
        try {
            inputStream = new DataInputStream(inputStream);
            this.var_ar_a.var_int_b = ((DataInputStream)inputStream).readShort();
            byte by = ((DataInputStream)inputStream).readByte();
            this.l();
            this.var_java_util_Vector_a.removeAllElements();
            this.var_ar_a.var_int_arr_e[1] = 0;
            this.var_ar_a.var_int_arr_e[0] = 0;
            this.var_ar_a.a((byte)4, by);
            return;
        }
        catch (Exception exception) {
            this.var_com_hardwire_blob_Main_a.var_at_a.b();
            this.a((byte)10);
            return;
        }
    }

    public final void d(boolean bl) {
        if (bl) {
            this.var_ad_a.var_boolean_a = false;
            this.a((byte)10);
            return;
        }
        this.a((byte)17);
    }

    private void a(int n2, boolean bl, boolean bl2) {
        this.var_byte_b = 1;
        this.var_boolean_c = bl;
        this.var_boolean_d = bl2;
        this.var_ad_a.a(this.var_d_a.byte_arr_arr_a(n2), 3, 3, -11579569, this.var_int_f);
        this.var_ad_a.repaint();
    }

    private void a(byte[][] byArray, boolean bl, boolean bl2) {
        this.var_byte_b = 1;
        this.var_boolean_c = bl;
        this.var_boolean_d = bl2;
        this.var_ad_a.a(byArray, 3, 3, -11579569, this.var_int_f);
        this.var_ad_a.repaint();
    }

    public final int int_a() {
        if (var_short_arr_arr_a[this.j] != null) {
            return var_short_arr_arr_a[this.j].length;
        }
        return this.var_byte_arr_arr_a.length;
    }

    private int int_a(int n2, int n3) {
        int n4 = 0;
        if (var_short_arr_arr_a[n2] != null) {
            n4 = this.var_d_a.d(var_short_arr_arr_a[n2][n3]);
            byte by = this.var_d_a.byte_a(var_short_arr_arr_a[n2][n3]);
            if (var_short_arr_arr_arr_a[n2] != null && var_short_arr_arr_arr_a[n2][n3] != null) {
                n4 = var_short_arr_arr_arr_a[n2][n3][0] < 0 ? (n4 += d.a((int)by, d.byte_arr_a((int)by, String.valueOf(this.var_byte_arr_b[n3])))) : (n4 += d.a((int)by, this.var_d_a.byte_arr_a(var_short_arr_arr_arr_a[n2][n3][this.var_byte_arr_b[n3]])));
            }
        } else {
            n4 = d.a(0, this.var_byte_arr_arr_a[n3]);
        }
        return n4;
    }

    private void j() {
        int n2 = this.var_short_arr_a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = this.int_a(this.j, i2);
            this.var_byte_arr_a[i2] = n3 > this.k ? (byte)1 : 0;
            this.var_short_arr_b[i2] = (short)(n3 - this.k);
        }
    }

    public final void c() {
        int n2 = this.var_java_util_Vector_a.size();
        if (n2 > 0) {
            this.var_int_a = ((int[])this.var_java_util_Vector_a.elementAt(n2 - 1))[0];
            this.var_java_util_Vector_a.removeElementAt(n2 - 1);
            if (this.var_int_a < 0) {
                this.var_int_a = 0;
            }
            if (this.var_int_a > (n2 = this.int_a()) - 1) {
                this.var_int_a = 0;
            }
            if (this.var_int_a < this.var_int_c) {
                this.var_int_c = this.var_int_a;
                return;
            }
            if (this.var_int_a >= this.var_int_c + this.var_int_b) {
                this.var_int_c = this.var_int_a - this.var_int_b + 1;
            }
        }
    }

    private void k() {
        this.var_java_util_Vector_a.addElement(new int[]{this.var_int_a});
        if (this.var_java_util_Vector_a.size() > this.i) {
            this.var_java_util_Vector_a.removeElementAt(0);
        }
    }

    public u(Main main) {
        this.var_com_hardwire_blob_Main_a = main;
        this.var_ar_a = this.var_com_hardwire_blob_Main_a.var_ar_a;
        this.var_ad_a = this.var_com_hardwire_blob_Main_a.var_ad_a;
        this.var_d_a = this.var_com_hardwire_blob_Main_a.var_d_a;
        this.var_byte_a = (byte)-1;
        this.var_java_util_Vector_a = new Vector(10);
        this.var_byte_arr_c = d.byte_arr_a(0, "hardwirerockshard");
        int n2 = 0;
        while (n2 < this.var_byte_arr_c.length) {
            int n3 = n2++;
            this.var_byte_arr_c[n3] = (byte)(this.var_byte_arr_c[n3] + 1);
        }
    }

    public final void d() {
        if (ad.var_int_b >= 300) {
            this.var_int_e = ad.var_int_a - 70;
            this.var_int_f = ad.var_int_b - 110;
            this.var_int_g = 35;
            this.h = 55;
        } else {
            this.var_int_g = 35;
            this.h = 18;
            this.var_int_e = ad.var_int_a - 70;
            this.var_int_f = ad.var_int_b - this.h - this.var_ad_a.javax_microedition_lcdui_Image_a(0).getHeight();
            if (this.var_com_hardwire_blob_Main_a.var_byte_a == 0 && this.var_ar_a.var_byte_c == 7) {
                this.h += 20;
            }
        }
        if (ad.var_int_b >= 300) {
            if (this.var_com_hardwire_blob_Main_a.var_byte_a == 0 && this.var_ar_a.var_byte_c == 7) {
                this.h += 40;
                return;
            }
            this.h += 50;
            this.var_int_f -= 50;
        }
    }

    public final void a(Graphics graphics) {
        graphics.setColor(0);
        graphics.fillRect(0, 0, ad.var_int_a, ad.var_int_b);
        if (this.var_com_hardwire_blob_Main_a.var_byte_a != 0 || this.var_ar_a.var_byte_c != 7) {
            graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(242), 10, 50, 20);
            graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(242), 50, 100, 20);
            graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(242), ad.var_int_a - 40, 70, 24);
            graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(242), ad.var_int_a - 100, 130, 24);
            graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(242), ad.var_int_a - 20, ad.var_int_b - 40, 40);
            graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(242), 30, ad.var_int_b - 40, 36);
            graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(243), ad.var_int_a - 40, ad.var_int_b - 10, 40);
            graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(243), 70, 70, 24);
        }
        graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(238), 0, 0, 20);
        graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(239), ad.var_int_a, 0, 24);
        graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(240), ad.var_int_a, ad.var_int_b, 40);
        graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(241), 0, ad.var_int_b, 36);
        if (this.var_byte_b == 2) {
            return;
        }
        int n2 = 0;
        if (this.l > 10 && (this.l & 0x20) == 0) {
            switch (this.l & 0x1F) {
                case 0: 
                case 4: {
                    n2 = 1;
                    break;
                }
                case 1: 
                case 3: {
                    n2 = 2;
                    break;
                }
                case 2: {
                    n2 = 3;
                }
            }
        }
        if (ad.var_int_b >= 300 && (this.var_com_hardwire_blob_Main_a.var_byte_a != 0 || this.var_ar_a.var_byte_c == 7)) {
            graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(244), ad.var_int_c, 20 + this.var_ad_a.javax_microedition_lcdui_Image_a(245).getHeight(), 17);
            if (n2 != 3) {
                graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(n2 + 245), ad.var_int_c, 20 + (this.var_ad_a.javax_microedition_lcdui_Image_a(245).getHeight() >> 1), 3);
            }
        }
    }

    private void l() {
        this.var_byte_arr_b = null;
        this.var_byte_arr_arr_a = null;
        this.var_byte_arr_a = null;
        this.var_short_arr_a = null;
        this.var_short_arr_b = null;
    }

    public final boolean boolean_a() {
        try {
            if (this.var_boolean_f) {
                this.i();
            } else if (this.var_boolean_e) {
                this.h();
            }
            this.var_boolean_e = false;
            this.var_boolean_f = false;
            if (this.var_com_hardwire_blob_Main_a.var_ag_b != null) {
                x x2;
                x x3 = x2 = this.var_com_hardwire_blob_Main_a.var_ag_b.x_a();
                if (x2.var_int_a == 2) {
                    x3 = (l)x2;
                    if (((l)x3).var_boolean_a) {
                        ((l)x2).b();
                        this.e();
                    }
                }
            }
            if (this.var_byte_b == 1) {
                this.var_ad_a.i();
                if (this.var_byte_a != 38) {
                    return false;
                }
            }
        }
        catch (Exception exception) {}
        return true;
    }

    public final void e() {
        x x2;
        Main.var_boolean_c = true;
        x x3 = x2 = this.var_com_hardwire_blob_Main_a.var_ag_b.x_a();
        switch (x2.var_int_a) {
            case 3: {
                this.a((byte)36);
                this.var_ad_a.m();
                long l2 = System.currentTimeMillis();
                while (this.var_com_hardwire_blob_Main_a.var_ag_b.x_a() == x2 && System.currentTimeMillis() - l2 < 2000L) {
                    try {
                        this.boolean_a();
                        Thread.sleep(1L);
                    }
                    catch (InterruptedException interruptedException) {}
                }
                if (this.var_com_hardwire_blob_Main_a.var_ag_b.x_a() != x2) break;
                this.i();
                return;
            }
            case 2: {
                Main.var_boolean_c = false;
                this.m = 1;
                this.var_long_a = System.currentTimeMillis();
                this.a((byte)38);
                return;
            }
            case 1: {
                this.a((byte)37);
                return;
            }
            default: {
                this.var_boolean_g = false;
                this.var_com_hardwire_blob_Main_a.var_byte_a = this.var_com_hardwire_blob_Main_a.var_byte_b;
                if (this.var_com_hardwire_blob_Main_a.var_byte_a == 1) {
                    this.a(this.var_byte_c);
                    this.c();
                    return;
                }
                if (this.var_com_hardwire_blob_Main_a.var_byte_a != 0 || this.var_ar_a.var_byte_c != 6) break;
                this.var_ar_a.var_byte_c = 0;
                this.var_ad_a.m();
                this.var_ar_a.var_byte_c = (byte)6;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(Graphics graphics) {
        try {
            ++this.l;
            this.a(graphics);
            switch (this.var_byte_b) {
                case 1: {
                    this.var_ad_a.b(graphics, this.var_int_g, this.h, this.var_int_f, this.var_int_g + this.var_int_e - 2);
                    if (this.var_byte_a == 38) {
                        int n2;
                        if (System.currentTimeMillis() - this.var_long_a >= 1000L) {
                            ++this.m;
                            if (this.m > 4) {
                                this.m = 0;
                            }
                            this.var_long_a = System.currentTimeMillis();
                        }
                        String string = "";
                        for (n2 = 0; n2 < this.m; ++n2) {
                            string = string + '.';
                        }
                        n2 = this.var_int_g;
                        int n3 = this.h + this.var_ad_a.var_byte_arr_arr_a.length * (3 + d.c(1));
                        this.var_d_a.a(graphics, 3, string, n2, n3, 20);
                    }
                    if (this.var_boolean_c) {
                        if (this.var_byte_a == 28 || this.var_byte_a == 29) {
                            if (this.var_javax_microedition_lcdui_Image_c == null) {
                                this.var_javax_microedition_lcdui_Image_c = this.var_ad_a.javax_microedition_lcdui_Image_b(54);
                            }
                            graphics.drawImage(this.var_javax_microedition_lcdui_Image_c, 0, ad.var_int_b, 36);
                        } else {
                            graphics.drawImage(this.var_javax_microedition_lcdui_Image_b, 0, ad.var_int_b, 36);
                        }
                    }
                    if (!this.var_boolean_d) return;
                    graphics.drawImage(this.var_javax_microedition_lcdui_Image_a, ad.var_int_a, ad.var_int_b, 40);
                    return;
                }
                case 2: {
                    int n4 = this.h;
                    int n5 = 25 / (ad.var_int_a / d.int_a(0, "m")) + 2;
                    if (n4 < (n5 *= d.c(0))) {
                        n4 = n5;
                    }
                    this.var_ad_a.a(graphics, this.var_int_g + 1, n4, -11579569, 0);
                    graphics.drawImage(this.var_javax_microedition_lcdui_Image_b, 0, ad.var_int_b, 36);
                    int n6 = d.int_a(0, "m");
                    n5 = 1;
                    n4 = 0;
                    for (char c2 = 'a'; c2 <= 'z'; c2 = (char)(c2 + '\u0001')) {
                        this.var_d_a.a(graphics, 0, String.valueOf(c2), n5, n4, 0);
                        if ((n5 += n6) + n6 <= ad.var_int_a) continue;
                        n5 = 1;
                        n4 += d.c(0);
                    }
                    n4 = 25 / (ad.var_int_a / n6) + 1;
                    this.var_d_a.a(graphics, 0, "del", 1, n4 * d.c(0), 0);
                    return;
                }
                case 0: {
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    int n12 = this.int_a();
                    int n13 = n11 = n12 < this.var_int_b ? n12 : this.var_int_b;
                    if (this.var_byte_arr_arr_a != null) {
                        n10 = this.h + 1 + (this.var_int_f >> 1) - (n11 * this.var_int_d >> 1);
                        for (n9 = this.var_int_c; n9 < this.var_int_c + n11; ++n9) {
                            int n14 = n10 + (n9 - this.var_int_c) * this.var_int_d;
                            int n15 = ad.var_int_c - (d.a(0, this.var_byte_arr_arr_a[n9]) >> 1);
                            if (this.var_byte_arr_a[n9] != 0) {
                                n15 = ad.var_int_c - (this.k >> 1) - this.var_short_arr_a[n9];
                            }
                            n8 = ad.var_int_c - (this.k >> 1);
                            int n16 = ad.var_int_c + (this.k >> 1);
                            n7 = 0;
                            n7 = n9 == this.var_int_a ? 0 : 2;
                            d.a(graphics, n7, this.var_byte_arr_arr_a[n9], n15, n14, n8, n16, 0);
                        }
                    } else {
                        n10 = this.h + 1 + (this.var_int_f >> 1) - (n11 * this.var_int_d >> 1);
                        for (n9 = this.var_int_c; n9 < this.var_int_c + n11; ++n9) {
                            int n17 = n10 + (n9 - this.var_int_c) * this.var_int_d;
                            n8 = this.var_d_a.d(var_short_arr_arr_a[this.j][n9]);
                            byte[] byArray = null;
                            n7 = this.var_d_a.byte_a(var_short_arr_arr_a[this.j][n9]);
                            if (var_short_arr_arr_arr_a[this.j] != null && var_short_arr_arr_arr_a[this.j][n9] != null) {
                                byArray = var_short_arr_arr_arr_a[this.j][n9][0] < 0 ? d.byte_arr_a(n7, String.valueOf(this.var_byte_arr_b[n9])) : this.var_d_a.byte_arr_a(var_short_arr_arr_arr_a[this.j][n9][this.var_byte_arr_b[n9]]);
                                n8 += d.a(n7, byArray);
                            }
                            int n18 = ad.var_int_c - (n8 >> 1);
                            if (this.var_byte_arr_a[n9] != 0) {
                                n18 = ad.var_int_c - (this.k >> 1) - this.var_short_arr_a[n9];
                            }
                            n7 = ad.var_int_c - (this.k >> 1);
                            int n19 = ad.var_int_c + (this.k >> 1);
                            int n20 = 0;
                            n20 = n9 == this.var_int_a ? 0 : 2;
                            d.a(graphics, n20, this.var_d_a.byte_arr_a(var_short_arr_arr_a[this.j][n9]), n18, n17, n7, n19, 0);
                            if (byArray == null) continue;
                            d.a(graphics, n20, byArray, n18 + n8, n17, n7, n19, 8);
                            if (n9 != this.var_int_a) continue;
                            n7 = n17;
                            boolean bl = var_short_arr_arr_arr_a[this.j][n9][0] < 0 && this.var_byte_arr_b[this.var_int_a] < var_short_arr_arr_arr_a[this.j][n9][2] || var_short_arr_arr_arr_a[this.j][n9][0] > 0 && (this.var_byte_arr_b[n9] < var_short_arr_arr_arr_a[this.j][n9].length - 1 || var_short_arr_arr_arr_a[this.j][n9].length == 2);
                            n8 = var_short_arr_arr_arr_a[this.j][n9][0] < 0 && this.var_byte_arr_b[this.var_int_a] > var_short_arr_arr_arr_a[this.j][n9][1] || var_short_arr_arr_arr_a[this.j][n9][0] > 0 && (this.var_byte_arr_b[n9] > 0 || var_short_arr_arr_arr_a[this.j][n9].length == 2) ? 1 : 0;
                            Graphics graphics2 = graphics;
                            u u2 = this;
                            if (n8 == 0 && !bl) continue;
                            ++n7;
                            n19 = u2.var_int_d >> 1;
                            n20 = 0;
                            n20 = u2.l % 6;
                            if (n20 > 3) {
                                n20 = 6 - n20;
                            }
                            if (n8 != 0) {
                                graphics2.drawImage(u2.var_ad_a.javax_microedition_lcdui_Image_a(231), n20 + 1, n7 + n19, 6);
                            }
                            if (!bl) continue;
                            graphics2.drawImage(u2.var_ad_a.javax_microedition_lcdui_Image_a(232), ad.var_int_a - 1 - n20, n7 + n19, 10);
                        }
                    }
                    for (n10 = this.var_int_c; n10 < this.var_int_c + n11; ++n10) {
                        if (this.var_byte_arr_a[n10] == 0) continue;
                        if (this.var_byte_arr_a[n10] > 0) {
                            int n21 = n10;
                            this.var_short_arr_a[n21] = (short)(this.var_short_arr_a[n21] + 2);
                            if (this.var_short_arr_a[n10] <= this.var_short_arr_b[n10]) continue;
                            this.var_short_arr_a[n10] = this.var_short_arr_b[n10];
                            this.var_byte_arr_a[n10] = -1;
                            continue;
                        }
                        int n22 = n10;
                        this.var_short_arr_a[n22] = (short)(this.var_short_arr_a[n22] - 2);
                        if (this.var_short_arr_a[n10] >= 0) continue;
                        this.var_short_arr_a[n10] = 0;
                        this.var_byte_arr_a[n10] = 1;
                    }
                    if (var_short_arr_arr_arr_a[this.j] == null || var_short_arr_arr_arr_a[this.j][this.var_int_a] == null) {
                        graphics.drawImage(this.var_javax_microedition_lcdui_Image_b, 0, ad.var_int_b, 36);
                    }
                    if (this.var_boolean_b) {
                        graphics.drawImage(this.var_javax_microedition_lcdui_Image_a, ad.var_int_a, ad.var_int_b, 40);
                    }
                    if (n12 <= this.var_int_b) return;
                    if (this.var_int_c > 0) {
                        graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(1000), ad.var_int_c, ad.var_int_b, 33);
                    }
                    if (this.var_int_c + this.var_int_b >= this.int_a()) return;
                    graphics.drawImage(this.var_ad_a.javax_microedition_lcdui_Image_a(1001), ad.var_int_c, ad.var_int_b, 33);
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    public final void void_a(int n2, int n3) {
        if (n2 < this.var_javax_microedition_lcdui_Image_a.getWidth() && n3 > ad.var_int_b - this.var_javax_microedition_lcdui_Image_b.getHeight()) {
            this.void_a(-6);
        } else if (n2 >= ad.var_int_a - this.var_javax_microedition_lcdui_Image_a.getWidth() && n3 > ad.var_int_b - this.var_javax_microedition_lcdui_Image_a.getHeight()) {
            this.void_a(-7);
        }
        if (this.var_byte_b == 1 || this.var_byte_b == 0) {
            this.var_ad_a.var_boolean_d = true;
            this.var_ad_a.var_boolean_e = false;
            this.var_ad_a.i = n3;
            if (this.var_byte_b == 0) {
                this.var_ad_a.j = this.var_int_c;
                return;
            }
            if (this.var_byte_b == 1) {
                this.var_ad_a.j = this.var_ad_a.var_int_f;
            }
        }
    }

    public final void b(int n2, int n3) {
        block10: {
            if (this.var_byte_b == 0) {
                int n4 = this.int_a();
                int n5 = n4 < this.var_int_b ? n4 : this.var_int_b;
                n4 = this.h + 1 + (this.var_int_f >> 1) - (n5 * this.var_int_d >> 1);
                for (int i2 = this.var_int_c; i2 < this.var_int_c + n5; ++i2) {
                    int n6 = n4 + (i2 - this.var_int_c) * this.var_int_d;
                    if (n3 <= n6 || n3 > n6 + this.var_int_d) continue;
                    n6 = this.int_a(this.j, i2);
                    if (n2 >= ad.var_int_a - n6 >> 1 && n2 <= ad.var_int_a + n6 >> 1) {
                        this.var_int_a = i2;
                    }
                    if (this.var_int_a != i2) continue;
                    if (n2 < 60 && this.var_byte_arr_arr_a == null && var_short_arr_arr_arr_a[this.j] != null && var_short_arr_arr_arr_a[this.j][this.var_int_a] != null) {
                        this.void_a(ad.int_b(2));
                    } else if (n2 > ad.var_int_a - 60 && this.var_byte_arr_arr_a == null && var_short_arr_arr_arr_a[this.j] != null && var_short_arr_arr_arr_a[this.j][this.var_int_a] != null) {
                        this.void_a(ad.int_b(3));
                    } else {
                        this.void_a(-6);
                    }
                    break block10;
                }
                return;
            }
            if (this.var_byte_b == 2) {
                int n7 = d.int_a(0, "m");
                int n8 = ad.var_int_a / n7;
                n7 = (n2 - 1) / n7;
                int n9 = n3 / d.c(0);
                char c2 = n7 + n9 * n8;
                if (this.var_ad_a.var_java_lang_StringBuffer_a.length() < this.var_ad_a.h && c2 <= '\u0019') {
                    c2 = (char)(c2 + 97);
                    this.var_ad_a.var_java_lang_StringBuffer_a.append(c2);
                }
                n9 = (25 / n8 + 1) * d.c(0);
                if (this.var_ad_a.var_java_lang_StringBuffer_a.length() > 0 && n2 < 1 + d.int_a(0, "del") && n3 >= n9 && n3 <= n9 + d.c(0)) {
                    this.var_ad_a.var_java_lang_StringBuffer_a.deleteCharAt(this.var_ad_a.var_java_lang_StringBuffer_a.length() - 1);
                }
            }
        }
    }

    public final void a(v v2) {
        if (this.var_boolean_g) {
            return;
        }
        switch (v2.a) {
            case 1: {
                this.void_a(ad.int_b(0));
                return;
            }
            case 2: {
                this.void_a(ad.int_b(1));
                return;
            }
            case 3: {
                this.void_a(ad.int_b(2));
                return;
            }
            case 4: {
                this.void_a(ad.int_b(3));
                return;
            }
            case 5: {
                this.void_a(-6);
                return;
            }
            case 8: {
                this.void_a(-7);
            }
        }
    }

    public final void b(v v2) {
        if (this.var_boolean_g) {
            return;
        }
        switch (v2.a) {
            case 1: {
                this.b(ad.int_b(0));
                return;
            }
            case 2: {
                this.b(ad.int_b(1));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void void_a(int n2) {
        try {
            block1 : switch (this.var_byte_b) {
                case 1: {
                    if (ad.boolean_a(n2)) {
                        if (!this.var_boolean_d) return;
                        this.var_boolean_f = true;
                        return;
                    }
                    if (this.var_boolean_c && (ad.boolean_c(n2) || this.var_ad_a.int_a(n2) == 8)) {
                        this.var_boolean_e = true;
                        return;
                    }
                    switch (this.var_ad_a.int_a(n2)) {
                        case 0: {
                            this.var_ad_a.j();
                            break block1;
                        }
                        case 1: {
                            this.var_ad_a.k();
                        }
                    }
                    return;
                }
                case 2: {
                    if (ad.boolean_a(n2)) {
                        this.var_boolean_f = true;
                        return;
                    }
                    if (!ad.boolean_c(n2) && !ad.boolean_b(n2)) {
                        this.var_ad_a.void_c(n2);
                        return;
                    }
                    this.var_boolean_e = true;
                    return;
                }
                case 0: {
                    if (ad.boolean_a(n2)) {
                        if (!this.var_boolean_b) return;
                        this.var_boolean_f = true;
                        return;
                    }
                    if (ad.boolean_c(n2) || this.var_ad_a.int_a(n2) == 8) {
                        this.var_boolean_e = true;
                        return;
                    }
                    if (n2 == -8) {
                        return;
                    }
                    n2 = this.var_ad_a.int_a(n2);
                    switch (n2) {
                        case 0: {
                            --this.var_int_a;
                            if (this.var_int_a < this.var_int_c) {
                                this.var_int_c = this.var_int_a;
                            }
                            if (this.var_int_a >= 0) return;
                            n2 = this.int_a();
                            this.var_int_a = n2 - 1;
                            this.var_int_c = n2 - this.var_int_b;
                            if (this.var_int_c >= 0) return;
                            this.var_int_c = 0;
                            return;
                        }
                        case 1: {
                            ++this.var_int_a;
                            n2 = this.int_a();
                            if (this.var_int_a > n2 - 1) {
                                this.var_int_a = 0;
                                this.var_int_c = 0;
                            }
                            if (this.var_int_a - this.var_int_c < this.var_int_b) return;
                            this.var_int_c = this.var_int_a - this.var_int_b + 1;
                            return;
                        }
                        case 2: 
                        case 3: {
                            n2 = n2 == 2 ? 1 : 0;
                            if (this.var_byte_arr_arr_a != null) return;
                            if (var_short_arr_arr_arr_a[this.j] == null) return;
                            if (var_short_arr_arr_arr_a[this.j][this.var_int_a] == null) return;
                            if (var_short_arr_arr_arr_a[this.j][this.var_int_a][0] < 0) {
                                if (n2 != 0 && this.var_byte_arr_b[this.var_int_a] > var_short_arr_arr_arr_a[this.j][this.var_int_a][1]) {
                                    this.var_byte_arr_b[this.var_int_a] = (byte)Math.max(var_short_arr_arr_arr_a[this.j][this.var_int_a][1], this.var_byte_arr_b[this.var_int_a] + var_short_arr_arr_arr_a[this.j][this.var_int_a][0]);
                                    this.c(this.var_int_a);
                                    this.j();
                                    return;
                                }
                                if (n2 != 0) return;
                                if (this.var_byte_arr_b[this.var_int_a] >= var_short_arr_arr_arr_a[this.j][this.var_int_a][2]) return;
                                this.var_byte_arr_b[this.var_int_a] = (byte)Math.min(var_short_arr_arr_arr_a[this.j][this.var_int_a][2], this.var_byte_arr_b[this.var_int_a] - var_short_arr_arr_arr_a[this.j][this.var_int_a][0]);
                                this.c(this.var_int_a);
                                this.j();
                                return;
                            }
                            if (n2 != 0 && (this.var_byte_arr_b[this.var_int_a] > 0 || var_short_arr_arr_arr_a[this.j][this.var_int_a].length == 2)) {
                                int n3 = this.var_int_a;
                                this.var_byte_arr_b[n3] = (byte)(this.var_byte_arr_b[n3] - 1);
                                if (this.var_byte_arr_b[this.var_int_a] < 0) {
                                    this.var_byte_arr_b[this.var_int_a] = (byte)(var_short_arr_arr_arr_a[this.j][this.var_int_a].length - 1);
                                }
                                this.c(this.var_int_a);
                                this.j();
                                return;
                            }
                            if (n2 != 0) return;
                            if (this.var_byte_arr_b[this.var_int_a] >= var_short_arr_arr_arr_a[this.j][this.var_int_a].length - 1) {
                                if (var_short_arr_arr_arr_a[this.j][this.var_int_a].length != 2) return;
                            }
                            int n4 = this.var_int_a;
                            this.var_byte_arr_b[n4] = (byte)(this.var_byte_arr_b[n4] + 1);
                            this.var_byte_arr_b[this.var_int_a] = (byte)(this.var_byte_arr_b[this.var_int_a] % var_short_arr_arr_arr_a[this.j][this.var_int_a].length);
                            this.c(this.var_int_a);
                            this.j();
                        }
                    }
                }
            }
            return;
        }
        catch (Exception exception) {}
    }

    public final void b(int n2) {
        switch (this.var_byte_b) {
            case 1: {
                switch (this.var_ad_a.int_a(n2)) {
                    case 0: 
                    case 1: {
                        this.var_ad_a.l();
                    }
                }
            }
        }
    }

    private void m() {
        try {
            this.var_com_hardwire_blob_Main_a.b("settings");
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeByte(Main.var_int_e);
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeBoolean(this.var_com_hardwire_blob_Main_a.var_boolean_g);
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeByte(this.var_ar_a.var_ac_a.g);
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeByte(this.var_com_hardwire_blob_Main_a.var_int_d);
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeBoolean(this.var_ar_a.var_ac_a.var_boolean_c);
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeByte(d.var_int_a);
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeBoolean(this.var_ar_a.var_ac_a.var_boolean_b);
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeByte(Main.var_int_f);
            this.var_com_hardwire_blob_Main_a.a(true);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void f() {
        try {
            this.var_com_hardwire_blob_Main_a.void_a("settings");
            Main.var_int_e = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readByte();
            this.var_com_hardwire_blob_Main_a.var_boolean_g = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readBoolean();
            this.var_ar_a.var_ac_a.g = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readByte();
            this.var_com_hardwire_blob_Main_a.var_int_d = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readByte();
            this.var_ar_a.var_ac_a.var_boolean_c = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readBoolean();
            d.var_int_a = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readByte();
            this.var_ar_a.var_ac_a.var_boolean_b = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readBoolean();
            Main.var_int_f = this.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readByte();
            this.var_com_hardwire_blob_Main_a.a(false);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static {
        var_short_arr_arr_a = new short[][]{{11, 24, 62, 9, 7, 27, 2}, {10, 3, 9, 7, 27, 29}, {32, 204, 33, 103, 65, 68, 69, 16, 15}, null, {19, 18}, null, {25, 26, 94, 145}, {205, 25, 26, 94, 145}, {10, 3, 48, 9, 7, 27, 29}, {25, 43, 44, 45, 151, 94}, {205, 25, 43, 44, 45, 151, 94}, null, null, null, {10, 9, 7, 27, 29}, null, null, null, null};
        var_short_arr_arr_arr_a = new short[][][]{null, null, new short[][]{{-1, 0, 10}, {-1, 0, 10}, {5, 6}, {5, 6}, {67, 70, 66}, {67, 70, 66, 71}, {5, 6}, null, null, null}, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }
}


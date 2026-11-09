/*
 * Decompiled with CFR 0.152.
 */
import com.hardwire.blob.Main;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

public final class ar {
    public static final int[] var_int_arr_a;
    public static final int[] var_int_arr_b;
    public static final int[] var_int_arr_c;
    private static boolean[] var_boolean_arr_g;
    public static final boolean[] var_boolean_arr_a;
    public static final boolean[] var_boolean_arr_b;
    private static final short[] var_short_arr_a;
    public Main var_com_hardwire_blob_Main_a;
    public ad var_ad_a;
    public d var_d_a;
    public ac var_ac_a;
    private at var_at_a;
    public Vector var_java_util_Vector_a;
    public byte var_byte_a;
    public boolean var_boolean_a;
    public int[] var_int_arr_d;
    public int var_int_a;
    public byte var_byte_b = (byte)-1;
    public byte var_byte_c = (byte)-1;
    public byte var_byte_d = (byte)-1;
    public int var_int_b;
    public ab var_ab_a;
    public ap[] var_ap_arr_a;
    public k[] var_k_arr_a;
    public ai[] var_ai_arr_a;
    public bb[] var_bb_arr_a;
    public q[] var_q_arr_a;
    public t[] var_t_arr_a;
    public byte[][][] var_byte_arr_arr_arr_a;
    public byte[][] var_byte_arr_arr_a;
    public as[][] var_as_arr_arr_a;
    public boolean[] var_boolean_arr_c;
    public boolean[] var_boolean_arr_d;
    public boolean[] var_boolean_arr_e;
    public boolean[] var_boolean_arr_f;
    public short[][] var_short_arr_arr_a;
    public int var_int_c;
    public int var_int_d;
    public int var_int_e;
    public int[][] var_int_arr_arr_a;
    public int var_int_f;
    public int var_int_g;
    public byte var_byte_e;
    public int[] var_int_arr_e = new int[10];
    public int[] var_int_arr_f = new int[10];
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    private int p;
    public int o;

    public ar(Main object) {
        this.var_com_hardwire_blob_Main_a = object;
        this.var_ad_a = this.var_com_hardwire_blob_Main_a.var_ad_a;
        this.var_d_a = this.var_com_hardwire_blob_Main_a.var_d_a;
        this.var_ab_a = new ab();
        ar ar2 = this;
        object = this.var_ab_a;
        this.var_ab_a.var_ar_a = ar2;
        this.var_ac_a = new ac(this.var_com_hardwire_blob_Main_a, this);
    }

    public final boolean a(byte by, byte by2) {
        try {
            this.var_com_hardwire_blob_Main_a.c(12);
            this.d();
            DataInputStream dataInputStream = this.var_com_hardwire_blob_Main_a.java_io_DataInputStream_a(d.var_java_lang_String_arr_b[d.a(d.g, this.var_int_b)]);
            if (dataInputStream == null) {
                return false;
            }
            do {
                this.var_ac_a.j = y.b(0, ac.var_byte_arr_arr_arr_arr_a.length - 1);
            } while (ac.var_int_arr_e[this.var_ac_a.j] != this.var_ac_a.var_int_a);
            if (this.var_ac_a.var_int_b == -1 || this.var_ac_a.var_int_b != this.var_ac_a.var_int_a) {
                this.var_ad_a.var_boolean_a = true;
                this.var_ad_a.m();
                this.var_ad_a.var_boolean_a = false;
            }
            if (this.var_ac_a.var_int_b != -1 && this.var_ac_a.var_int_b != this.var_ac_a.var_int_a) {
                this.var_ad_a.e();
            }
            this.var_ad_a.f();
            this.var_ad_a.d();
            this.var_com_hardwire_blob_Main_a.var_ad_a.var_boolean_a = false;
            this.var_byte_c = (byte)7;
            this.var_byte_d = (byte)7;
            this.var_ac_a.h = Integer.MAX_VALUE;
            this.var_com_hardwire_blob_Main_a.var_byte_a = 0;
            this.var_ad_a.m();
            long l2 = System.currentTimeMillis();
            this.var_byte_e = by2;
            this.var_byte_b = by;
            this.var_at_a = this.var_com_hardwire_blob_Main_a.var_at_a;
            this.var_byte_a = 0;
            if (this.var_byte_b == 2 && this.var_java_util_Vector_a == null) {
                this.var_java_util_Vector_a = new Vector();
            }
            if (this.var_byte_b == 4) {
                this.var_int_f = 1;
                this.var_int_g = 0;
            } else {
                this.var_int_f = 0;
                this.var_int_g = 1;
            }
            if ((this.var_byte_b & 3) != 0) {
                int[][] nArray = this.var_int_arr_arr_a = new int[this.var_byte_b == 2 ? 2 : 1][4];
                by = (byte)200;
                ab ab2 = this.var_ab_a;
                this.var_ab_a.e = 200;
                ab2.var_int_arr_arr_a = nArray;
                ab2.var_java_util_Vector_b = new Vector();
                ab2.var_java_util_Vector_a = new Vector();
                ab2.var_java_util_Vector_c = new Vector();
                ab2.var_int_arr_arr_b = new int[16][2];
                ab2.var_boolean_a = false;
                ab2.var_boolean_b = true;
            }
            System.gc();
            this.var_com_hardwire_blob_Main_a.a(dataInputStream);
            System.gc();
            this.var_com_hardwire_blob_Main_a.e();
            if ((this.var_byte_b & 3) != 0) {
                int n2 = (this.var_ai_arr_a.length << 1) + 18 * this.var_q_arr_a.length;
                this.var_ab_a.a(this.var_byte_arr_arr_a, this.var_byte_arr_arr_arr_a[1], this.var_as_arr_arr_a, var_boolean_arr_g, 15, this.var_q_arr_a.length + this.var_ap_arr_a.length + this.var_ai_arr_a.length, this.var_k_arr_a.length, n2 += 16 * this.var_q_arr_a.length);
            }
            this.k = 0;
            if (this.var_byte_e != 4 && this.var_byte_e != 5) {
                this.var_int_arr_f[1] = 0;
                this.var_int_arr_f[0] = 0;
                this.var_int_arr_e[1] = 0;
                this.var_int_arr_e[0] = 0;
            }
            this.o = 0;
            if (this.var_byte_e == 4 || this.var_byte_e == 5) {
                this.m = 1;
                this.p = -1;
            } else {
                this.m = -1;
            }
            this.var_ac_a.e();
            long l3 = System.currentTimeMillis() - l2;
            if (l3 < 500L) {
                Thread.sleep(500L - l3);
            }
        }
        catch (Exception exception) {
            return false;
        }
        System.gc();
        Main.var_boolean_d = false;
        this.var_byte_c = 0;
        this.var_byte_d = 0;
        this.var_ac_a.h = 0;
        return true;
    }

    public final int a(int[] nArray) {
        int n2 = nArray[0] >> 15;
        int n3 = nArray[1] >> 15;
        int n4 = nArray[2] >> 15;
        int n5 = nArray[3] >> 15;
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        if (n4 >= this.var_int_d) {
            n4 = this.var_int_d - 1;
        }
        if (n5 >= this.var_int_e) {
            n5 = this.var_int_e - 1;
        }
        while (n3 <= n5) {
            for (int i2 = n2; i2 <= n4; ++i2) {
                switch (this.var_byte_arr_arr_arr_a[2][i2][n3]) {
                    case 6: 
                    case 7: 
                    case 36: {
                        return n3;
                    }
                }
            }
            ++n3;
        }
        return -1;
    }

    public final boolean a(int n2, int n3) {
        switch (this.var_byte_arr_arr_arr_a[2][n2][n3]) {
            case 6: 
            case 7: 
            case 36: {
                return true;
            }
        }
        return false;
    }

    private void e() {
        long l2;
        long l3 = l2 = System.currentTimeMillis();
        while (!this.var_boolean_a && !this.var_at_a.boolean_a()) {
            this.var_com_hardwire_blob_Main_a.b();
            long l4 = System.currentTimeMillis();
            if (l4 - l2 > 500L && l4 - l3 > (long)Main.var_int_a) {
                if (this.var_com_hardwire_blob_Main_a.var_byte_a == 1) {
                    if (this.var_com_hardwire_blob_Main_a.var_u_a.boolean_a()) {
                        this.var_ad_a.m();
                    }
                } else {
                    this.var_ac_a.var_boolean_a = true;
                    this.var_ad_a.m();
                    this.var_ac_a.var_boolean_a = false;
                }
                l3 = System.currentTimeMillis();
                continue;
            }
            try {
                Thread.sleep(1L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private void f() {
        this.d();
        this.var_com_hardwire_blob_Main_a.var_at_a.b();
        this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)10);
        this.var_com_hardwire_blob_Main_a.var_byte_a = 1;
    }

    private boolean a(DataInputStream dataInputStream) {
        switch (dataInputStream.readByte()) {
            case 1: {
                this.var_byte_d = (byte)2;
                dataInputStream.close();
                return true;
            }
            case 2: {
                this.var_com_hardwire_blob_Main_a.var_u_a.c(false);
                return true;
            }
            case 3: {
                this.var_int_b = dataInputStream.readInt();
                this.var_int_a = dataInputStream.readByte();
                this.var_int_arr_e[0] = dataInputStream.readInt();
                this.var_int_arr_e[1] = dataInputStream.readInt();
                this.var_int_arr_f[0] = dataInputStream.readInt();
                this.var_int_arr_f[1] = dataInputStream.readInt();
                if (this.var_byte_e == 2) {
                    this.h = dataInputStream.readInt();
                    this.i = dataInputStream.readInt();
                    this.j = dataInputStream.readInt();
                }
                this.var_byte_d = (byte)5;
                return true;
            }
            case 4: {
                this.m = dataInputStream.readInt();
                this.p = dataInputStream.readInt();
                this.n = dataInputStream.readInt();
                return true;
            }
            case 5: {
                if (this.m < 0) {
                    this.m = 0;
                    this.p = 4;
                }
                return true;
            }
        }
        return false;
    }

    private boolean boolean_a() {
        byte by = this.var_byte_a;
        this.var_byte_a = 0;
        switch (by) {
            case 1: {
                this.var_at_a.a(new byte[]{1});
                return true;
            }
            case 2: {
                this.var_at_a.a(new byte[]{2});
                return true;
            }
            case 5: {
                this.var_at_a.a(new byte[]{5});
                return true;
            }
            case 3: {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(this.var_int_b);
                dataOutputStream.writeByte(this.var_int_a);
                dataOutputStream.writeInt(this.var_int_arr_e[0]);
                dataOutputStream.writeInt(this.var_int_arr_e[1]);
                dataOutputStream.writeInt(this.var_int_arr_f[0]);
                dataOutputStream.writeInt(this.var_int_arr_f[1]);
                if (this.var_byte_e == 2) {
                    dataOutputStream.writeInt(this.h);
                    dataOutputStream.writeInt(this.i);
                    dataOutputStream.writeInt(this.j);
                }
                this.var_at_a.a(byteArrayOutputStream.toByteArray());
                return true;
            }
        }
        return false;
    }

    public final void void_a() {
        if (this.var_boolean_a) {
            return;
        }
        if (this.var_byte_b == 4) {
            try {
                if (this.m >= 0 && this.o > 0) {
                    this.var_byte_a = (byte)5;
                }
                if (this.boolean_a()) {
                    return;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeInt(this.var_ac_a.var_int_arr_d[0]);
                dataOutputStream.writeInt(this.var_ac_a.var_int_arr_d[1]);
                dataOutputStream.writeInt(this.var_ac_a.var_int_arr_d[2]);
                dataOutputStream.writeInt(this.var_ac_a.var_int_arr_d[3]);
                int n2 = 0;
                if (this.var_q_arr_a[this.var_int_f].var_boolean_d) {
                    n2 = 1;
                }
                if (this.var_q_arr_a[this.var_int_f].var_boolean_e) {
                    n2 = (byte)(n2 | 2);
                }
                if (this.var_q_arr_a[this.var_int_f].var_boolean_f) {
                    n2 = (byte)(n2 | 4);
                }
                if (this.var_q_arr_a[this.var_int_f].var_boolean_g) {
                    n2 = (byte)(n2 | 8);
                }
                if (this.var_q_arr_a[this.var_int_f].var_boolean_h) {
                    n2 = (byte)(n2 | 0x20);
                }
                dataOutputStream.writeByte(n2);
                dataOutputStream.writeByte(this.var_q_arr_a[this.var_int_f].var_int_h);
                dataOutputStream.writeByte(this.var_q_arr_a[this.var_int_f].var_int_i);
                dataOutputStream.writeByte(this.var_q_arr_a[this.var_int_f].var_byte_b);
                if (!this.var_at_a.a(byteArrayOutputStream.toByteArray())) {
                    this.f();
                }
                return;
            }
            catch (IOException iOException) {
                this.f();
                return;
            }
        }
        if (this.var_byte_b == 2) {
            this.var_java_util_Vector_a.removeAllElements();
            this.e();
            if (this.var_boolean_a) {
                return;
            }
            ByteArrayInputStream byteArrayInputStream = null;
            byteArrayInputStream = this.var_at_a.java_io_ByteArrayInputStream_a();
            if (byteArrayInputStream == null) {
                this.f();
                return;
            }
            try {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                if (this.a(dataInputStream)) {
                    return;
                }
                if (this.var_int_arr_d == null) {
                    this.var_int_arr_d = new int[4];
                }
                this.var_int_arr_d[0] = dataInputStream.readInt();
                this.var_int_arr_d[1] = dataInputStream.readInt();
                this.var_int_arr_d[2] = dataInputStream.readInt();
                this.var_int_arr_d[3] = dataInputStream.readInt();
                byte by = dataInputStream.readByte();
                this.var_q_arr_a[this.var_int_g].var_boolean_d = (by & 1) != 0;
                this.var_q_arr_a[this.var_int_g].var_boolean_e = (by & 2) != 0;
                this.var_q_arr_a[this.var_int_g].var_boolean_f = (by & 4) != 0;
                this.var_q_arr_a[this.var_int_g].var_boolean_g = (by & 8) != 0;
                this.var_q_arr_a[this.var_int_g].var_boolean_h = (by & 0x20) != 0;
                this.var_q_arr_a[this.var_int_g].var_int_h = dataInputStream.readByte();
                this.var_q_arr_a[this.var_int_g].var_int_i = dataInputStream.readByte();
                this.var_q_arr_a[this.var_int_g].var_byte_b = dataInputStream.readByte();
                return;
            }
            catch (IOException iOException) {
                this.f();
            }
        }
    }

    public final void b() {
        block110: {
            if (this.var_boolean_a) {
                return;
            }
            try {
                if (this.var_byte_b == 2) {
                    try {
                        Object object;
                        int n2;
                        int n3;
                        Object object2;
                        int n4;
                        if (this.boolean_a()) {
                            return;
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        if (this.m >= 0 && this.o > 0) {
                            ar ar2 = this;
                            if (ar2.m >= 0 && ar2.o > 0) {
                                if (ar2.p == -1) {
                                    if (ar2.var_ac_a.h >= 4) {
                                        ar2.p = 0;
                                        ar2.n = 0;
                                    }
                                } else if (ar2.p == 0 && ar2.n < 3) {
                                    ++ar2.n;
                                } else if (ar2.p < 4) {
                                    ++ar2.p;
                                } else if (ar2.n < 6) {
                                    ++ar2.n;
                                } else {
                                    --ar2.m;
                                    ar2.p = -1;
                                }
                            }
                            dataOutputStream.writeByte(4);
                            dataOutputStream.writeInt(this.m);
                            dataOutputStream.writeInt(this.p);
                            dataOutputStream.writeInt(this.n);
                            if (!this.var_at_a.a(byteArrayOutputStream.toByteArray())) {
                                this.f();
                            }
                            return;
                        }
                        this.var_int_arr_d[0] = this.var_int_arr_d[0] - 32768;
                        this.var_int_arr_d[1] = this.var_int_arr_d[1] - 32768;
                        this.var_int_arr_d[2] = this.var_int_arr_d[2] + 32768;
                        this.var_int_arr_d[3] = this.var_int_arr_d[3] + 32768;
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeInt(this.k);
                        int n5 = this.var_q_arr_a.length;
                        for (n4 = 0; n4 < n5; ++n4) {
                            object2 = this.var_q_arr_a[n4];
                            dataOutputStream.writeByte(((q)object2).var_int_a);
                            n3 = ((q)object2).var_int_a;
                            for (n2 = 0; n2 < n3; ++n2) {
                                object = ((q)object2).var_aa_arr_a[n2].var_s_a.var_as_a;
                                dataOutputStream.writeShort(((as)object).var_int_a >> 10);
                                dataOutputStream.writeShort(((as)object).b >> 10);
                            }
                            for (n2 = 0; n2 < ((q)object2).var_am_a.var_s_arr_a.length; ++n2) {
                                object = ((q)object2).var_am_a.var_s_arr_a[n2];
                                dataOutputStream.writeShort(((s)object).var_as_a.var_int_a >> 10);
                                dataOutputStream.writeShort(((s)object).var_as_a.b >> 10);
                                dataOutputStream.writeByte(((s)object).var_int_b);
                            }
                            dataOutputStream.writeByte(((q)object2).var_int_d >> 10);
                            n2 = this.var_int_arr_e[n4] << 1;
                            if (((q)object2).var_boolean_a) {
                                n2 |= 1;
                            }
                            dataOutputStream.writeShort(n2);
                            byte by = ((q)object2).var_byte_c;
                            n2 = by;
                            n2 = by | ((q)object2).var_byte_d << 2;
                            if (((q)object2).var_int_e > 0) {
                                n2 |= 0x10;
                            }
                            dataOutputStream.writeByte(n2 |= ((q)object2).var_am_a.var_int_b << 5);
                            if (((q)object2).var_byte_d == 2) {
                                dataOutputStream.writeByte(((q)object2).var_int_c);
                            }
                            dataOutputStream.writeInt(((q)object2).var_am_a.as_c().d());
                        }
                        n5 = this.var_ai_arr_a.length;
                        for (n4 = 0; n4 < n5; ++n4) {
                            object2 = this.var_ai_arr_a[n4];
                            if (((ai)object2).var_byte_a == 2 || !y.a(this.var_int_arr_d, ((ai)object2).int_arr_a())) continue;
                            dataOutputStream.writeByte(n4);
                            dataOutputStream.writeShort(((ai)object2).var_aa_a.var_s_a.var_as_a.var_int_a >> 10);
                            dataOutputStream.writeShort(((ai)object2).var_aa_a.var_s_a.var_as_a.b >> 10);
                            if (((ai)object2).var_aa_b != null) {
                                dataOutputStream.writeShort(((ai)object2).var_aa_b.var_s_a.var_as_a.var_int_a >> 10);
                                dataOutputStream.writeShort(((ai)object2).var_aa_b.var_s_a.var_as_a.b >> 10);
                            }
                            n3 = ((ai)object2).var_byte_a;
                            if (((ai)object2).var_boolean_a) {
                                n3 = (short)(n3 | 8);
                            }
                            if (((ai)object2).var_int_a != -1) {
                                n3 = (short)(n3 | 0x10);
                            }
                            if (((ai)object2).var_boolean_b) {
                                n3 = (short)(n3 | 0x20);
                            }
                            short s2 = (short)(n3 | ((ai)object2).var_byte_b << 6);
                            n3 = s2;
                            n3 = (short)(s2 | ((ai)object2).var_byte_c << 11);
                            dataOutputStream.writeShort(n3);
                        }
                        dataOutputStream.writeByte(-1);
                        n5 = this.var_k_arr_a.length;
                        for (n4 = 0; n4 < n5; ++n4) {
                            object2 = this.var_k_arr_a[n4];
                            if (!y.a(this.var_int_arr_d, ((k)object2).var_au_a.a())) continue;
                            dataOutputStream.writeByte(n4);
                            dataOutputStream.writeShort(((k)object2).var_au_a.var_as_a.var_int_a >> 10);
                            dataOutputStream.writeShort(((k)object2).var_au_a.var_as_a.b >> 10);
                        }
                        dataOutputStream.writeByte(-1);
                        n5 = this.var_bb_arr_a.length;
                        for (n4 = 0; n4 < n5; ++n4) {
                            object = object2 = this.var_bb_arr_a[n4];
                            if (!y.a(this.var_int_arr_d, ((bb)object).var_int_arr_a)) continue;
                            dataOutputStream.writeByte(n4);
                            int n6 = n3 = this.var_bb_arr_a[n4].var_boolean_b ? 1 : 0;
                            if (this.var_bb_arr_a[n4].var_k_a.var_boolean_a) {
                                n3 |= 2;
                            }
                            dataOutputStream.writeByte(n3);
                        }
                        dataOutputStream.writeByte(-1);
                        n5 = this.var_ap_arr_a.length;
                        for (n4 = 0; n4 < n5; ++n4) {
                            object2 = this.var_ap_arr_a[n4];
                            if (!y.a(this.var_int_arr_d, ((ap)object2).var_am_a.int_arr_a())) continue;
                            dataOutputStream.writeByte(n4);
                            n3 = ((ap)object2).var_am_a.var_s_arr_a.length;
                            for (n2 = 0; n2 < n3; ++n2) {
                                object = ((ap)object2).var_am_a.var_s_arr_a[n2].var_as_a;
                                dataOutputStream.writeShort(((as)object).var_int_a >> 10);
                                dataOutputStream.writeShort(((as)object).b >> 10);
                            }
                            if (((ap)object2).var_am_a.var_s_arr_c != null) {
                                n3 = ((ap)object2).var_am_a.var_s_arr_c.length;
                                for (n2 = 0; n2 < n3; ++n2) {
                                    object = ((ap)object2).var_am_a.var_s_arr_c[n2].var_as_a;
                                    dataOutputStream.writeShort(((as)object).var_int_a >> 10);
                                    dataOutputStream.writeShort(((as)object).b >> 10);
                                }
                            }
                            if (((ap)object2).var_am_a.var_t_arr_c != null) {
                                n3 = ((ap)object2).var_am_a.var_t_arr_c.length;
                                for (n2 = 0; n2 < n3; ++n2) {
                                    object = ((ap)object2).var_am_a.var_t_arr_c[n2];
                                    if (object == null) {
                                        dataOutputStream.writeShort(Short.MAX_VALUE);
                                        continue;
                                    }
                                    if (((t)object).var_s_b != null) {
                                        dataOutputStream.writeShort(Short.MIN_VALUE);
                                        continue;
                                    }
                                    if (((t)object).var_s_b != null) continue;
                                    dataOutputStream.writeShort(((t)object).var_as_a.var_int_a >> 10);
                                    dataOutputStream.writeShort(((t)object).var_as_a.b >> 10);
                                }
                            }
                            n2 = ((ap)object2).var_byte_a;
                            if (((ap)object2).var_boolean_b) {
                                n2 |= 4;
                            }
                            dataOutputStream.writeByte(n2);
                        }
                        dataOutputStream.writeByte(-1);
                        n5 = this.var_java_util_Vector_a.size();
                        dataOutputStream.writeByte(n5);
                        for (n4 = 0; n4 < n5; ++n4) {
                            object2 = (byte[])this.var_java_util_Vector_a.elementAt(n4);
                            for (n3 = 0; n3 < ((Object)object2).length; ++n3) {
                                dataOutputStream.writeByte((int)object2[n3]);
                            }
                        }
                        this.var_java_util_Vector_a.removeAllElements();
                        if (!this.var_at_a.a(byteArrayOutputStream.toByteArray())) {
                            this.f();
                        }
                        break block110;
                    }
                    catch (IOException iOException) {
                        this.f();
                    }
                    break block110;
                }
                if (this.var_byte_b == 4) {
                    this.e();
                    if (this.var_boolean_a) {
                        return;
                    }
                    ByteArrayInputStream byteArrayInputStream = null;
                    byteArrayInputStream = this.var_at_a.java_io_ByteArrayInputStream_a();
                    if (byteArrayInputStream == null) {
                        this.f();
                        break block110;
                    }
                    try {
                        int n7;
                        int n8;
                        Object object;
                        int n9;
                        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                        if (this.a(dataInputStream)) {
                            return;
                        }
                        this.k = dataInputStream.readInt();
                        int n10 = this.var_q_arr_a.length;
                        for (n9 = 0; n9 < n10; ++n9) {
                            Object object3;
                            object = this.var_q_arr_a[n9];
                            this.var_q_arr_a[n9].var_int_a = dataInputStream.readByte();
                            n8 = ((q)object).var_int_a;
                            for (n7 = 0; n7 < n8; ++n7) {
                                if (((q)object).var_aa_arr_a[n7] == null) {
                                    ((q)object).var_aa_arr_a[n7] = new aa(new s(new as(), 2048), 5120);
                                }
                                object3 = ((q)object).var_aa_arr_a[n7].var_s_a;
                                ((q)object).var_aa_arr_a[n7].var_s_a.var_as_b.var_int_a = ((s)object3).var_as_a.var_int_a = dataInputStream.readShort() << 10;
                                ((s)object3).var_as_b.b = ((s)object3).var_as_a.b = dataInputStream.readShort() << 10;
                            }
                            for (n7 = 0; n7 < ((q)object).var_am_a.var_s_arr_a.length; ++n7) {
                                object3 = ((q)object).var_am_a.var_s_arr_a[n7];
                                ((q)object).var_am_a.var_s_arr_a[n7].var_as_b.var_int_a = ((s)object3).var_as_a.var_int_a = dataInputStream.readShort() << 10;
                                ((s)object3).var_as_b.b = ((s)object3).var_as_a.b = dataInputStream.readShort() << 10;
                                ((s)object3).var_int_b = dataInputStream.readByte();
                            }
                            n7 = dataInputStream.readByte() << 10;
                            if (((q)object).var_int_d > n7) {
                                ((q)object).var_int_c = 2;
                                if (((q)object).var_int_b == this.var_int_f) {
                                    this.var_com_hardwire_blob_Main_a.void_a(Main.var_int_b / 2);
                                }
                            }
                            ((q)object).var_int_d = n7;
                            int n11 = dataInputStream.readShort() & 0xFFFF;
                            this.var_int_arr_e[n9] = n11 >> 1;
                            boolean bl = (n11 & 1) != 0;
                            n8 = ((q)object).var_boolean_a ? 1 : 0;
                            ((q)object).var_boolean_a = bl;
                            n11 = dataInputStream.readByte();
                            ((q)object).var_byte_c = (byte)(n11 & 3);
                            byte by = (byte)(n11 >> 2 & 3);
                            n7 = by;
                            if (by == 1 && ((q)object).var_byte_d != 1 && y.a(this.var_ac_a.var_int_arr_d, ((q)object).var_am_a.int_arr_a())) {
                                this.var_com_hardwire_blob_Main_a.a(4, false);
                            }
                            ((q)object).var_byte_d = n7;
                            if ((n11 >> 4 & 1) != 0) {
                                if (((q)object).var_int_e == 0) {
                                    ((q)object).var_int_e = 1;
                                }
                            } else {
                                ((q)object).var_int_e = 0;
                            }
                            ((q)object).var_am_a.var_int_b = n11 >> 5;
                            if (n7 == 2) {
                                ((q)object).var_int_c = dataInputStream.readByte();
                            }
                            ((q)object).var_int_f = dataInputStream.readInt();
                            ((q)object).var_am_a.d();
                            object3 = ((q)object).var_am_a;
                            ((q)object).var_am_a.var_boolean_a = true;
                            if (((q)object).boolean_a() || !y.a(this.var_ac_a.var_int_arr_d, ((q)object).var_am_a.int_arr_a())) continue;
                            n7 = this.a(((q)object).var_am_a.int_arr_a());
                            if (bl && n8 == 0 && ((q)object).var_int_f > 10240) {
                                this.var_com_hardwire_blob_Main_a.a(7, false);
                                if (this.var_ac_a.g > 0) {
                                    ((q)object).a(n7);
                                }
                            }
                            if (this.var_ac_a.g <= 1 || ((q)object).var_am_a.int_arr_a()[1] >> 15 >= n7) continue;
                            this.var_ac_a.b(((q)object).var_am_a.as_a().var_int_a >> 10, n7 << 5, 16, 1);
                        }
                        while (true) {
                            boolean bl;
                            boolean bl2;
                            byte by = dataInputStream.readByte();
                            n9 = by;
                            if (by == -1) break;
                            object = this.var_ai_arr_a[n9];
                            aa aa2 = ((ai)object).var_aa_a;
                            ((ai)object).var_aa_a.var_boolean_a = true;
                            if (((ai)object).var_aa_b != null) {
                                aa2 = ((ai)object).var_aa_b;
                                ((ai)object).var_aa_b.var_boolean_a = true;
                            }
                            ((ai)object).var_aa_a.var_s_a.var_as_b.var_int_a = ((ai)object).var_aa_a.var_s_a.var_as_a.var_int_a = dataInputStream.readShort() << 10;
                            ((ai)object).var_aa_a.var_s_a.var_as_b.b = ((ai)object).var_aa_a.var_s_a.var_as_a.b = dataInputStream.readShort() << 10;
                            if (((ai)object).var_aa_b != null) {
                                ((ai)object).var_aa_b.var_s_a.var_as_b.var_int_a = ((ai)object).var_aa_b.var_s_a.var_as_a.var_int_a = dataInputStream.readShort() << 10;
                                ((ai)object).var_aa_b.var_s_a.var_as_b.b = ((ai)object).var_aa_b.var_s_a.var_as_a.b = dataInputStream.readShort() << 10;
                            }
                            short s3 = dataInputStream.readShort();
                            n8 = s3;
                            n7 = (byte)(s3 & 7);
                            boolean bl3 = bl2 = (n8 >> 4 & 1) != 0;
                            if (n7 != ((ai)object).var_byte_a) {
                                if (!bl2 && n7 == 1 && ((ai)object).var_byte_a != 2) {
                                    this.var_com_hardwire_blob_Main_a.a(((ai)object).var_byte_d == 1 ? 8 : 4, false);
                                    aa aa3 = ((ai)object).var_aa_a;
                                    as as2 = aa3.var_s_a.var_as_a;
                                    this.var_ac_a.void_a(as2.var_int_a >> 10, as2.b >> 10, 30, 30);
                                }
                                if (n7 != 1 || ((ai)object).var_byte_a != 2) {
                                    ((ai)object).a((byte)n7);
                                }
                            }
                            boolean bl4 = ((ai)object).var_boolean_a = (n8 >> 3 & 1) != 0;
                            if ((n8 >> 4 & 1) != 0) {
                                ((ai)object).var_int_a = 0;
                            }
                            if ((bl = (n8 >> 5 & 1) != 0) && !((ai)object).var_boolean_b && this.var_ac_a.g > 0 && y.a(this.var_ac_a.var_int_arr_d, ((ai)object).var_aa_a.a())) {
                                aa aa4 = ((ai)object).var_aa_a;
                                this.var_ac_a.a(aa4.var_s_a.var_as_a.var_int_a >> 10, this.a(((ai)object).var_aa_a.a()) << 5, 2);
                            }
                            ((ai)object).var_boolean_b = bl;
                            ((ai)object).var_byte_b = (byte)(n8 >> 6 & 0x1F);
                            ((ai)object).var_byte_c = (byte)(n8 >> 11);
                            ((ai)object).var_boolean_c = true;
                        }
                        n10 = this.var_ai_arr_a.length;
                        for (n9 = 0; n9 < n10; ++n9) {
                            if (this.var_ai_arr_a[n9].var_boolean_c) {
                                this.var_ai_arr_a[n9].var_boolean_c = false;
                                continue;
                            }
                            if (this.var_ai_arr_a[n9].var_byte_a == 2) continue;
                            int[] nArray = this.var_ai_arr_a[n9].var_aa_a.a();
                            object = nArray;
                            object[3] = Integer.MIN_VALUE;
                            object[2] = Integer.MIN_VALUE;
                            object[1] = Integer.MIN_VALUE;
                            nArray[0] = Integer.MIN_VALUE;
                            if (this.var_ai_arr_a[n9].var_aa_b == null) continue;
                            int[] nArray2 = this.var_ai_arr_a[n9].var_aa_b.a();
                            object = nArray2;
                            object[3] = Integer.MIN_VALUE;
                            object[2] = Integer.MIN_VALUE;
                            object[1] = Integer.MIN_VALUE;
                            nArray2[0] = Integer.MIN_VALUE;
                        }
                        while (true) {
                            byte by = dataInputStream.readByte();
                            n9 = by;
                            if (by == -1) break;
                            object = this.var_k_arr_a[n9];
                            this.var_k_arr_a[n9].var_au_a.var_as_a.var_int_a = dataInputStream.readShort() << 10;
                            ((k)object).var_au_a.var_as_a.b = dataInputStream.readShort() << 10;
                            ((k)object).var_boolean_b = true;
                        }
                        n10 = this.var_k_arr_a.length;
                        for (n9 = 0; n9 < n10; ++n9) {
                            if (this.var_k_arr_a[n9].var_boolean_b) {
                                this.var_k_arr_a[n9].var_boolean_b = false;
                                continue;
                            }
                            this.var_k_arr_a[n9].var_au_a.var_as_a.b(0x3FFFFFFF, 0x3FFFFFFF);
                        }
                        while (true) {
                            byte by = dataInputStream.readByte();
                            n9 = by;
                            if (by == -1) break;
                            byte by2 = dataInputStream.readByte();
                            n8 = (by2 & 1) != 0 ? 1 : 0;
                            boolean bl = this.var_bb_arr_a[n9].var_k_a.var_boolean_a = (by2 & 2) != 0;
                            if (n8 != 0 && !this.var_bb_arr_a[n9].var_boolean_b) {
                                bb bb2 = this.var_bb_arr_a[n9];
                                if (y.a(this.var_ac_a.var_int_arr_d, bb2.var_int_arr_a)) {
                                    this.var_com_hardwire_blob_Main_a.a(5, false);
                                }
                            }
                            if (n8 != 0 && !this.var_bb_arr_a[n9].var_boolean_b) {
                                this.var_bb_arr_a[n9].b();
                                continue;
                            }
                            if (n8 != 0 || !this.var_bb_arr_a[n9].var_boolean_b) continue;
                            this.var_bb_arr_a[n9].void_a();
                        }
                        while (true) {
                            short s4;
                            byte by = dataInputStream.readByte();
                            n9 = by;
                            if (by == -1) break;
                            ap ap2 = this.var_ap_arr_a[n9];
                            n8 = ap2.var_am_a.var_s_arr_a.length;
                            for (n7 = 0; n7 < n8; ++n7) {
                                s s5 = ap2.var_am_a.var_s_arr_a[n7];
                                ap2.var_am_a.var_s_arr_a[n7].var_as_b.var_int_a = s5.var_as_a.var_int_a = dataInputStream.readShort() << 10;
                                s5.var_as_b.b = s5.var_as_a.b = dataInputStream.readShort() << 10;
                            }
                            if (ap2.var_am_a.var_s_arr_c != null) {
                                n8 = ap2.var_am_a.var_s_arr_c.length;
                                for (n7 = 0; n7 < n8; ++n7) {
                                    s s6 = ap2.var_am_a.var_s_arr_c[n7];
                                    ap2.var_am_a.var_s_arr_c[n7].var_as_b.var_int_a = s6.var_as_a.var_int_a = dataInputStream.readShort() << 10;
                                    s6.var_as_b.b = s6.var_as_a.b = dataInputStream.readShort() << 10;
                                }
                            }
                            if (ap2.var_am_a.var_t_arr_c != null) {
                                n8 = ap2.var_am_a.var_t_arr_c.length;
                                for (n7 = 0; n7 < n8; ++n7) {
                                    t t2 = ap2.var_am_a.var_t_arr_c[n7];
                                    s4 = dataInputStream.readShort();
                                    if (s4 == Short.MAX_VALUE) {
                                        ap2.var_am_a.var_t_arr_c[n7] = null;
                                        continue;
                                    }
                                    if (s4 == Short.MIN_VALUE) continue;
                                    t2.var_as_a.var_int_a = s4 << 10;
                                    t2.var_as_a.b = dataInputStream.readShort() << 10;
                                }
                            }
                            byte by3 = dataInputStream.readByte();
                            n7 = by3;
                            byte by4 = (byte)(by3 & 3);
                            if (ap2.var_byte_a != by4) {
                                if (by4 == 2 && ap2.var_byte_a != 2) {
                                    ap2.b();
                                }
                                if (by4 != 1 || ap2.var_byte_a != 2) {
                                    ap2.var_byte_a = by4;
                                }
                            }
                            s4 = (n7 >> 2 & 1) != 0 ? (short)1 : 0;
                            ap2.var_am_a.d();
                            am am2 = ap2.var_am_a;
                            ap2.var_am_a.var_boolean_a = true;
                            if (s4 != 0 && !ap2.var_boolean_b && this.var_ac_a.g > 0 && y.a(this.var_ac_a.var_int_arr_d, ap2.var_am_a.int_arr_a())) {
                                this.var_ac_a.a(ap2.var_am_a.as_a().var_int_a >> 10, this.a(ap2.var_am_a.int_arr_a()) << 5, 2);
                            }
                            ap2.var_boolean_b = s4;
                            ap2.var_boolean_a = true;
                        }
                        n10 = this.var_ap_arr_a.length;
                        for (n9 = 0; n9 < n10; ++n9) {
                            if (this.var_ap_arr_a[n9].var_boolean_a) {
                                this.var_ap_arr_a[n9].var_boolean_a = false;
                                continue;
                            }
                            int[] nArray = this.var_ap_arr_a[n9].var_am_a.int_arr_a();
                            int[] nArray3 = nArray;
                            nArray3[3] = Integer.MIN_VALUE;
                            nArray3[2] = Integer.MIN_VALUE;
                            nArray3[1] = Integer.MIN_VALUE;
                            nArray[0] = Integer.MIN_VALUE;
                        }
                        n10 = dataInputStream.readByte();
                        block41: for (n9 = 0; n9 < n10; ++n9) {
                            byte by = dataInputStream.readByte();
                            switch (by >> 1) {
                                case 0: {
                                    n8 = dataInputStream.readByte() & 0xFF;
                                    n7 = dataInputStream.readByte() & 0xFF;
                                    if ((by & 1) != 0) {
                                        this.var_com_hardwire_blob_Main_a.a(2, false);
                                        this.var_ac_a.a((n8 << 5) + 16, (n7 << 5) + 16, 4);
                                    }
                                    this.var_byte_arr_arr_arr_a[1][n8][n7] = -1;
                                    this.var_ac_a.void_a((n8 << 5) + 16, (n7 << 5) + 16, 10, 10);
                                    continue block41;
                                }
                                case 1: {
                                    n8 = dataInputStream.readByte() & 0xFF;
                                    n7 = dataInputStream.readByte() & 0xFF;
                                    if ((by & 1) != 0) {
                                        this.var_com_hardwire_blob_Main_a.a(1, false);
                                        this.var_ac_a.a((n8 << 5) + 16, (n7 << 5) + 16, 5);
                                    }
                                    this.var_byte_arr_arr_arr_a[1][n8][n7] = -1;
                                    continue block41;
                                }
                                case 2: {
                                    if ((by & 1) != 0) {
                                        this.var_com_hardwire_blob_Main_a.a(9, false);
                                    }
                                    this.var_t_arr_a[dataInputStream.readByte() & 0xFF] = null;
                                    continue block41;
                                }
                                case 3: {
                                    n8 = dataInputStream.readByte() & 0xFF;
                                    n7 = dataInputStream.readByte() & 0xFF;
                                    if ((by & 1) != 0) {
                                        this.var_com_hardwire_blob_Main_a.a(6, false);
                                        int n12 = (n8 << 5) + 16;
                                        int n13 = (n7 << 5) + 16;
                                        this.var_ac_a.a(n12, n13, 1);
                                        this.var_ac_a.b(n12, n13, 16, 0);
                                    }
                                    this.var_byte_arr_arr_arr_a[1][n8][n7] = -1;
                                    continue block41;
                                }
                                case 4: {
                                    this.var_q_arr_a[this.var_int_f].var_byte_b = this.var_q_arr_a[this.var_int_f].var_byte_c;
                                }
                                case 5: {
                                    this.var_com_hardwire_blob_Main_a.a(0, false);
                                    continue block41;
                                }
                                case 6: {
                                    if ((by & 1) != 0) {
                                        this.var_com_hardwire_blob_Main_a.a(11, false);
                                        continue block41;
                                    }
                                    this.var_com_hardwire_blob_Main_a.a(10, false);
                                    continue block41;
                                }
                                case 7: {
                                    this.var_ac_a.c(dataInputStream.readByte() & 0xFF);
                                }
                            }
                        }
                        break block110;
                    }
                    catch (IOException iOException) {
                        this.f();
                    }
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void c() {
        try {
            switch (this.var_byte_c) {
                case 0: {
                    this.var_ac_a.h();
                    if (this.var_ac_a.var_int_d > 10) {
                        Main.var_boolean_d = true;
                    }
                    break;
                }
                case 6: {
                    this.var_ad_a.i();
                }
            }
        }
        catch (Exception exception) {}
        try {
            if (this.var_byte_a != 0 || this.var_byte_d == this.var_byte_c) return;
            this.var_byte_c = this.var_byte_d;
            switch (this.var_byte_d) {
                case 2: {
                    this.a(this.var_byte_b, this.var_byte_e);
                    return;
                }
                case 5: {
                    if (this.var_int_b == 93) {
                        this.var_int_b = d.var_short_arr_a[0];
                        this.a("save", this.var_int_b);
                        this.a((byte)1, (byte)0);
                        return;
                    }
                    if (this.var_byte_e == 0 || this.var_byte_e == 2) {
                        ar ar2 = this;
                        try {
                            ar2.var_com_hardwire_blob_Main_a.void_a("achi");
                            int n2 = ar2.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            int n3 = ar2.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            ar2.var_ac_a.i = ar2.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.readInt();
                            byte[] byArray = new byte[200];
                            int n4 = ar2.var_com_hardwire_blob_Main_a.var_java_io_DataInputStream_a.read(byArray);
                            ar2.var_com_hardwire_blob_Main_a.a(false);
                            boolean bl = false;
                            if (ar2.var_byte_e == 0 && d.a(d.var_short_arr_a, ar2.var_int_b) + 1 > n2) {
                                n2 = d.a(d.var_short_arr_a, ar2.var_int_b) + 1;
                                bl = true;
                            } else if (ar2.var_byte_e == 2 && d.a(d.var_short_arr_d, ar2.var_int_b) + 1 > n3) {
                                n3 = d.a(d.var_short_arr_d, ar2.var_int_b) + 1;
                                bl = true;
                            }
                            if (bl) {
                                ar2.var_com_hardwire_blob_Main_a.b("achi");
                                ar2.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeInt(n2);
                                ar2.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeInt(n3);
                                ar2.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeInt(ar2.var_ac_a.i);
                                ar2.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.write(byArray, 0, n4);
                                ar2.var_com_hardwire_blob_Main_a.a(true);
                            }
                        }
                        catch (Exception exception) {}
                    }
                    this.var_ac_a.var_int_d = 0;
                    return;
                }
                case 4: {
                    if (this.var_byte_e != 0 && this.var_byte_e != 2) return;
                    int n5 = d.int_a(this.var_int_b);
                    if (n5 == -1) return;
                    this.a(this.var_byte_e == 0 ? "save" : "msave", n5);
                    return;
                }
                case 8: {
                    this.d();
                    if (this.var_byte_e == 0 || this.var_byte_e == 2) {
                        if (this.var_byte_e == 0 && this.var_int_b == d.var_short_arr_a[d.var_short_arr_a.length - 1] || this.var_byte_e == 2 && this.var_int_b == d.var_short_arr_d[d.var_short_arr_d.length - 1]) {
                            if (this.var_byte_b == 2) {
                                this.var_com_hardwire_blob_Main_a.var_byte_a = 1;
                                this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)26);
                                return;
                            } else if (this.var_byte_b == 4) {
                                this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)9);
                                this.var_com_hardwire_blob_Main_a.var_byte_a = 1;
                                this.var_ad_a.m();
                                this.var_com_hardwire_blob_Main_a.var_u_a.c(false);
                                return;
                            } else {
                                this.var_com_hardwire_blob_Main_a.var_byte_a = 1;
                                this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)26);
                            }
                            return;
                        } else {
                            this.var_int_b = d.int_a(this.var_int_b);
                            this.var_byte_d = (byte)2;
                        }
                        return;
                    }
                    if (this.var_byte_b == 1) {
                        this.var_com_hardwire_blob_Main_a.var_byte_a = 1;
                        this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)4);
                        this.var_com_hardwire_blob_Main_a.var_u_a.var_int_a = d.a(d.var_short_arr_a, this.var_int_b) - 1;
                        this.var_com_hardwire_blob_Main_a.var_u_a.void_a(ad.int_b(1));
                        return;
                    }
                    if (this.var_byte_e == 4 || this.var_byte_e == 5) {
                        if (this.var_int_arr_e[0] == 5 || this.var_int_arr_e[1] == 5) {
                            if (this.var_byte_b == 2) {
                                this.var_com_hardwire_blob_Main_a.var_byte_a = 1;
                                this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)17);
                                return;
                            } else {
                                this.var_com_hardwire_blob_Main_a.var_byte_a = 1;
                                this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)9);
                                this.var_com_hardwire_blob_Main_a.var_u_a.c(false);
                            }
                            return;
                        } else {
                            this.var_byte_d = (byte)2;
                        }
                        return;
                    }
                    if (this.var_byte_b == 4) {
                        this.var_com_hardwire_blob_Main_a.var_byte_a = 1;
                        this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)9);
                        this.var_com_hardwire_blob_Main_a.var_u_a.c(false);
                        return;
                    }
                    if (this.var_byte_b != 2) return;
                    this.var_com_hardwire_blob_Main_a.var_byte_a = 1;
                    if (d.a(d.var_short_arr_d, this.var_int_b) != -1) {
                        this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)20);
                        this.var_com_hardwire_blob_Main_a.var_u_a.var_int_a = d.a(d.var_short_arr_d, this.var_int_b) - 1;
                        this.var_com_hardwire_blob_Main_a.var_u_a.void_a(ad.int_b(1));
                    } else {
                        this.var_com_hardwire_blob_Main_a.var_u_a.a((byte)47);
                        this.var_com_hardwire_blob_Main_a.var_u_a.var_int_a = d.a(d.var_short_arr_c, this.var_int_b) - 1;
                        this.var_com_hardwire_blob_Main_a.var_u_a.void_a(ad.int_b(1));
                    }
                    if (this.var_com_hardwire_blob_Main_a.var_u_a.var_int_a != -1) return;
                    this.var_com_hardwire_blob_Main_a.var_u_a.var_int_a = 0;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private void a(String string, int n2) {
        try {
            this.var_com_hardwire_blob_Main_a.b(string);
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeInt(n2);
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeInt(this.h);
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeInt(this.i);
            this.var_com_hardwire_blob_Main_a.var_java_io_DataOutputStream_a.writeInt(this.j);
        }
        catch (Exception exception) {}
        this.var_com_hardwire_blob_Main_a.a(true);
    }

    public final void d() {
        this.var_ac_a.f();
        this.var_byte_arr_arr_arr_a = null;
        this.var_boolean_arr_d = null;
        this.var_boolean_arr_c = null;
        this.var_boolean_arr_f = null;
        this.var_boolean_arr_e = null;
        this.var_short_arr_arr_a = null;
        this.var_byte_arr_arr_a = null;
        this.var_as_arr_arr_a = null;
        this.var_ap_arr_a = null;
        this.var_ai_arr_a = null;
        this.var_q_arr_a = null;
        this.var_k_arr_a = null;
        this.var_bb_arr_a = null;
        this.var_t_arr_a = null;
        if (this.var_ab_a != null) {
            int n2;
            ab ab2 = this.var_ab_a;
            this.var_ab_a.var_boolean_b = false;
            if (ab2.var_au_arr_a != null) {
                for (n2 = 0; n2 < ab2.var_int_a; ++n2) {
                    ab2.var_au_arr_a[n2] = null;
                }
                ab2.var_au_arr_a = null;
                ab2.var_int_a = 0;
            }
            if (ab2.var_am_arr_a != null) {
                for (n2 = 0; n2 < ab2.var_int_b; ++n2) {
                    ab2.var_am_arr_a[n2] = null;
                }
                ab2.var_am_arr_a = null;
                ab2.var_int_b = 0;
            }
            if (ab2.var_aa_arr_a != null) {
                for (n2 = 0; n2 < ab2.var_int_c; ++n2) {
                    ab2.var_aa_arr_a[n2] = null;
                }
                ab2.var_aa_arr_a = null;
                ab2.var_int_c = 0;
            }
            ab2.var_int_arr_arr_b = null;
            ab2.var_int_arr_arr_a = null;
            ab2.var_int_arr_a = null;
            ab2.var_int_arr_b = null;
            ab2.var_ak_a = null;
            ab2.var_ak_b = null;
            ab2.var_ak_c = null;
            ab2.var_byte_arr_arr_a = null;
            ab2.var_byte_arr_arr_b = null;
            ab2.var_as_arr_arr_a = null;
            ab2.var_boolean_arr_a = null;
        }
        if (this.var_java_util_Vector_a != null) {
            this.var_java_util_Vector_a.removeAllElements();
        }
        this.var_java_util_Vector_a = null;
        System.gc();
    }

    public final void a(aa aa2, int n2, int n3) {
        ai ai2;
        Object object;
        int n4;
        if (this.var_boolean_arr_d[n2] && this.var_boolean_arr_c[n3]) {
            n4 = this.var_bb_arr_a.length;
            for (int i2 = 0; i2 < n4; ++i2) {
                bb bb2 = this.var_bb_arr_a[i2];
                if (bb2.var_short_a != n2 || bb2.var_short_b != n3 || aa2.var_s_a.var_as_a.b >= n3 << 15) continue;
                if (!bb2.var_boolean_b) {
                    object = bb2;
                    if (y.a(this.var_ac_a.var_int_arr_d, ((bb)object).var_int_arr_a)) {
                        this.var_com_hardwire_blob_Main_a.a(5, false);
                    }
                }
                bb2.var_boolean_a = true;
            }
        }
        if (!(aa2.d != 2 && aa2.d != 5 || (n4 = this.var_byte_arr_arr_arr_a[1][n2][n3]) != 7 && n4 != 10 && n4 != 11 && n4 != 12 || (ai2 = (ai)aa2.var_java_lang_Object_a).boolean_a())) {
            ai2.b();
            int n5 = 0;
            while (n5 < this.var_q_arr_a.length) {
                int n6 = n5++;
                this.var_int_arr_e[n6] = this.var_int_arr_e[n6] + 30;
            }
            object = aa2;
            as as2 = ((aa)object).var_s_a.var_as_a;
            this.var_ac_a.void_a(as2.var_int_a >> 10, as2.b >> 10, 30, 30);
        }
    }

    public final void a(am am2, int n2, int n3) {
        int n4;
        int n5;
        if (this.var_boolean_arr_d[n2] && this.var_boolean_arr_c[n3]) {
            int n6 = this.var_bb_arr_a.length;
            for (n5 = 0; n5 < n6; ++n5) {
                bb bb2 = this.var_bb_arr_a[n5];
                if (bb2.var_short_a != n2 || bb2.var_short_b != n3) continue;
                boolean bl = false;
                for (n4 = 0; n4 < am2.var_s_arr_a.length; ++n4) {
                    as as2 = am2.var_s_arr_a[n4].var_as_a;
                    if (as2.var_int_a < n2 << 15 || as2.var_int_a > n2 + 1 << 15 || as2.b >= (n3 << 15) + 4096) continue;
                    bl = true;
                    break;
                }
                if (!bl) continue;
                if (!bb2.var_boolean_b) {
                    bb bb3 = bb2;
                    if (y.a(this.var_ac_a.var_int_arr_d, bb3.var_int_arr_a)) {
                        this.var_com_hardwire_blob_Main_a.a(5, false);
                    }
                }
                bb2.var_boolean_a = true;
            }
        }
        if (am2.j == 1) {
            long l2;
            q q2 = (q)am2.var_java_lang_Object_a;
            n5 = this.var_byte_arr_arr_arr_a[1][n2][n3];
            if (var_boolean_arr_a[n5] && ((l2 = q2.var_am_a.as_c().long_a()) > 0x1E00000L || q2.var_int_e > 0 && l2 > 0L)) {
                int n7;
                boolean bl = y.a(this.var_ac_a.var_int_arr_d, q2.var_am_a.int_arr_a());
                n4 = bl ? 1 : 0;
                if (bl) {
                    this.var_com_hardwire_blob_Main_a.a(6, false);
                    int n8 = (n2 << 5) + 16;
                    int n9 = (n3 << 5) + 16;
                    this.var_ac_a.a(n8, n9, 1);
                    this.var_ac_a.b(n8, n9, 16, 0);
                }
                if (this.var_byte_b == 2) {
                    this.var_java_util_Vector_a.addElement(new byte[]{(byte)(6 | (y.a(this.var_int_arr_d, q2.var_am_a.int_arr_a()) ? 1 : 0)), (byte)n2, (byte)n3});
                }
                int n10 = (n2 << 15) - 2048;
                int n11 = (n3 << 15) - 2048;
                n5 = (n2 + 1 << 15) + 2048;
                int n12 = (n3 + 1 << 15) + 2048;
                for (n7 = 0; n7 < q2.var_am_a.g; ++n7) {
                    t t2 = q2.var_am_a.var_t_arr_b[n7];
                    if (t2.var_as_a == null || t2.var_as_a.var_int_a < n10 || t2.var_as_a.var_int_a > n5 || t2.var_as_a.b < n11 || t2.var_as_a.b > n12) continue;
                    t2.a();
                }
                this.var_byte_arr_arr_arr_a[1][n2][n3] = -1;
                this.var_byte_arr_arr_a[n2][n3] = -1;
                n10 = n2 - 1;
                n11 = n3 - 1;
                n5 = n2 + 1;
                n12 = n3 + 1;
                for (n7 = n10; n7 <= n5; ++n7) {
                    for (int i2 = n11; i2 <= n12; ++i2) {
                        if (n10 < 0 || n11 < 0 || n5 >= this.var_int_d || n12 >= this.var_int_e) continue;
                        this.var_com_hardwire_blob_Main_a.void_a(n7, i2);
                    }
                }
                return;
            }
            if (n5 == 7 || n5 == 10 || n5 == 11 || n5 == 12) {
                q2.b(1024);
            }
            if (q2.var_byte_e == 0 && q2.var_byte_c == 2 && var_boolean_arr_g[n5]) {
                as as3 = q2.var_am_a.as_a();
                int n13 = as3.var_int_a >> 15;
                n4 = as3.b >> 15;
                short s2 = var_short_arr_a[this.var_byte_arr_arr_a[n2][n3]];
                if (!q2.var_boolean_f && q2.var_int_h == 0 && n13 < n2 && (s2 & 2) != 0) {
                    q2.var_int_j |= 2;
                }
                if ((q2.var_boolean_d || q2.var_int_i < 0) && (q2.var_int_j & 6) != 0 && n4 <= n3 && (s2 & 0x30) != 0) {
                    q2.var_int_j |= s2 & 0x30;
                }
                if (!q2.var_boolean_g && q2.var_int_h == 0 && n13 > n2 && (s2 & 4) != 0) {
                    q2.var_int_j |= 4;
                }
                if (!q2.var_boolean_e && !q2.var_boolean_d && q2.var_int_i == 0 && n4 > n3 && (s2 & 8) != 0) {
                    q2.var_int_j |= 8;
                }
                if (!q2.var_boolean_e && !q2.var_boolean_d && q2.var_int_i == 0 && n4 >= n3 && (s2 & 0xC0) != 0) {
                    q2.var_int_j |= 0xC0;
                }
            }
        }
    }

    public final void a(am am2) {
        int n2 = this.var_ap_arr_a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.var_ap_arr_a[i2].var_am_a.equals(am2)) continue;
            this.var_ap_arr_a[i2].b();
        }
    }

    public static void a(am am2, am am3) {
        if (am2.j == 1) {
            ((q)am2.var_java_lang_Object_a).a(am3);
        }
        if (am3.j == 1) {
            ((q)am3.var_java_lang_Object_a).a(am2);
        }
        if (am2.j == 1 && am3.j == 4) {
            ((q)am2.var_java_lang_Object_a).var_boolean_b = true;
            return;
        }
        if (am3.j == 1 && am2.j == 4) {
            ((q)am3.var_java_lang_Object_a).var_boolean_b = true;
        }
    }

    public final void a(am object, aa object2) {
        if (((am)object).j == 1 && ((aa)object2).d == 2) {
            ((q)((am)object).var_java_lang_Object_a).a((ai)((aa)object2).var_java_lang_Object_a);
            return;
        }
        if (((am)object).j == 3 && ((aa)object2).d == 2) {
            object2 = (ai)((aa)object2).var_java_lang_Object_a;
            object = (ap)((am)object).var_java_lang_Object_a;
            if (!(((ap)object).var_ar_a.var_int_b == 93 || ((ai)object2).boolean_a() || ((ai)object2).var_byte_d == 2 && ((ap)object).var_byte_b != 4 || ((ai)object2).var_byte_d == 5 || ((ap)object).var_am_a.as_c().long_a() <= 0xA00000L)) {
                int n2 = 0;
                while (n2 < ((ap)object).var_ar_a.var_q_arr_a.length) {
                    int n3 = n2++;
                    ((ap)object).var_ar_a.var_int_arr_e[n3] = ((ap)object).var_ar_a.var_int_arr_e[n3] + 30;
                }
                Object object3 = ((ai)object2).var_aa_a;
                object3 = ((aa)object3).var_s_a.var_as_a;
                ((ap)object).var_ar_a.var_ac_a.void_a(((as)object3).var_int_a >> 10, ((as)object3).b >> 10, 30, 30);
                ((ai)object2).b();
            }
            return;
        }
        if (this.var_int_b == 93 && ((am)object).j == 3 && ((aa)object2).d == 5 && this.var_ac_a.var_int_c <= 1) {
            ++this.var_ac_a.var_int_c;
            this.var_ac_a.c(10);
            return;
        }
        if (this.var_byte_e != 4 && this.var_byte_e != 5 && ((am)object).j == 1 && (((q)((am)object).var_java_lang_Object_a).var_byte_a != 1 || ((q)((am)object).var_java_lang_Object_a).var_byte_e == 0) && ((aa)object2).d == 6) {
            this.var_ab_a.b(((aa)object2).c);
            ((aa)object2).var_s_a.var_int_b |= 0x10;
            object2 = (q)((aa)object2).var_java_lang_Object_a;
            --((q)object2).var_int_g;
            if (((q)object2).var_int_g == 0) {
                ((q)object2).var_am_a = null;
                object = ((q)((am)object).var_java_lang_Object_a).var_am_a.as_a();
                int n4 = ((as)object).var_int_a >> 15;
                int n5 = ((as)object).b >> 15;
                if (this.var_com_hardwire_blob_Main_a.byte_a(n4, n5 - 1) != 0) {
                    ((q)object2).a(n4 << 5, n5 - 1 << 5);
                } else if (this.var_com_hardwire_blob_Main_a.byte_a(n4 - 1, n5) != 0) {
                    ((q)object2).a(n4 - 1 << 5, n5 << 5);
                } else if (this.var_com_hardwire_blob_Main_a.byte_a(n4 + 1, n5) != 0) {
                    ((q)object2).a(n4 + 1 << 5, n5 << 5);
                } else {
                    ((q)object2).a(n4 << 5, n5 + 1 << 5);
                }
                ((q)object2).var_int_d >>= 2;
                ((q)object2).var_byte_d = (byte)2;
            }
        }
    }

    static {
        var_int_arr_a = new int[]{1024, 1024, 682, 341, 1024, 341};
        var_int_arr_b = new int[]{-1, -1, -1536, -1, -1, -1536};
        var_int_arr_c = new int[]{-1, -1, -1, -1, 32768, -1};
        var_boolean_arr_g = new boolean[]{true, true, true, true, true, true, false, true, false, false, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
        var_boolean_arr_a = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        var_boolean_arr_b = new boolean[]{true, true, true, false, false, false, false, false, false, true, false, true, false, true, false, true, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true};
        var_short_arr_a = new short[]{0, 4, 8, 2, 4, 12, 10, 2, 8, 6, 12, 14, 10, 0, 14, 32, 16, 128, 64, 0, 0, 0, 0, 40, 24, 128, 64, 8, 0};
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nokia.mid.ui.DeviceControl
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Image
 *  javax.microedition.media.Manager
 *  javax.microedition.media.Player
 *  javax.microedition.media.control.VolumeControl
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 *  javax.microedition.rms.RecordStoreNotFoundException
 */
package com.hardwire.blob;

import com.nokia.mid.ui.DeviceControl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public class Main
extends MIDlet
implements Runnable {
    public static int var_int_a;
    public static int var_int_b;
    public static int var_int_c;
    public ar var_ar_a;
    public u var_u_a;
    public ad var_ad_a;
    public d var_d_a;
    public d var_d_b;
    private Display var_javax_microedition_lcdui_Display_a;
    public byte var_byte_a;
    public boolean var_boolean_a = false;
    private boolean l = false;
    private static boolean m;
    public static boolean var_boolean_b;
    public static boolean var_boolean_c;
    public static boolean var_boolean_d;
    public static boolean var_boolean_e;
    public boolean var_boolean_f;
    public boolean var_boolean_g = true;
    private int var_int_g;
    private long var_long_a;
    public int var_int_d = 2;
    private long var_long_b;
    private RecordStore var_javax_microedition_rms_RecordStore_a = null;
    private ByteArrayOutputStream var_java_io_ByteArrayOutputStream_a;
    public DataOutputStream var_java_io_DataOutputStream_a;
    private ByteArrayInputStream var_java_io_ByteArrayInputStream_a;
    public DataInputStream var_java_io_DataInputStream_a;
    public at var_at_a;
    public an var_an_a;
    public ag var_ag_a;
    public byte var_byte_b;
    public ag var_ag_b;
    public static final int[] var_int_arr_a;
    public static final int[] var_int_arr_b;
    public static final int[] var_int_arr_c;
    public static final int[] var_int_arr_d;
    public static final int[] var_int_arr_e;
    public int[][] var_int_arr_arr_a;
    private boolean n = false;
    public static boolean h;
    public static int var_int_e;
    public static boolean i;
    private boolean o;
    public static int var_int_f;
    public static boolean j;
    public static boolean k;
    private Player[] var_javax_microedition_media_Player_arr_a = null;
    private VolumeControl[] var_javax_microedition_media_control_VolumeControl_arr_a = null;
    private static Class var_java_lang_Class_a;

    protected void startApp() {
        if (m) {
            this.d();
            return;
        }
        m = true;
        this.var_byte_a = (byte)2;
        this.var_d_a = new d(this);
        this.var_d_b = new d(this);
        this.var_ad_a = new ad(this);
        this.var_ar_a = new ar(this);
        this.var_u_a = new u(this);
        this.var_at_a = new at(this.var_u_a);
        this.var_ad_a.void_a();
        this.var_javax_microedition_lcdui_Display_a = Display.getDisplay((MIDlet)this);
        this.var_javax_microedition_lcdui_Display_a.setCurrent((Displayable)this.var_ad_a);
        this.var_ad_a.repaint();
        new Thread(this).start();
    }

    public final int[] int_arr_a(int n2, int n3) {
        int n4;
        boolean[][] blArrayArray = new boolean[var_int_arr_a.length][];
        boolean[] blArray = new boolean[var_int_arr_a.length];
        for (n4 = 0; n4 < blArrayArray.length; ++n4) {
            blArrayArray[n4] = new boolean[var_int_arr_a[n4]];
        }
        try {
            int n5;
            int n6;
            this.void_a("achi");
            n4 = this.var_java_io_DataInputStream_a.readInt();
            int n7 = this.var_java_io_DataInputStream_a.readInt();
            int n8 = this.var_java_io_DataInputStream_a.readInt();
            for (n6 = 0; n6 < blArrayArray.length; ++n6) {
                for (n5 = 0; n5 < blArrayArray[n6].length; ++n5) {
                    blArrayArray[n6][n5] = this.var_java_io_DataInputStream_a.readBoolean();
                }
            }
            for (n6 = 0; n6 < blArray.length; ++n6) {
                blArray[n6] = this.var_java_io_DataInputStream_a.readBoolean();
            }
            this.a(false);
            if (n3 == -1) {
                n6 = !blArray[n2] ? 1 : 0;
                blArray[n2] = true;
            } else {
                n6 = !blArrayArray[n2][n3] ? 1 : 0;
                if (n6 != 0) {
                    blArrayArray[n2][n3] = true;
                    ++n8;
                }
            }
            this.b("achi");
            this.var_java_io_DataOutputStream_a.writeInt(n4);
            this.var_java_io_DataOutputStream_a.writeInt(n7);
            this.var_java_io_DataOutputStream_a.writeInt(n8);
            for (n5 = 0; n5 < blArrayArray.length; ++n5) {
                for (n2 = 0; n2 < blArrayArray[n5].length; ++n2) {
                    this.var_java_io_DataOutputStream_a.writeBoolean(blArrayArray[n5][n2]);
                }
            }
            for (n5 = 0; n5 < blArray.length; ++n5) {
                this.var_java_io_DataOutputStream_a.writeBoolean(blArray[n5]);
            }
            this.a(true);
            if (n6 != 0) {
                for (n5 = 0; n5 < var_int_arr_b.length; ++n5) {
                    if (var_int_arr_b[n5] != n8) continue;
                    return new int[]{1, n8};
                }
                for (n5 = 0; n5 < var_int_arr_c.length; ++n5) {
                    if (var_int_arr_c[n5] != n8) continue;
                    return new int[]{5, n8};
                }
                for (n5 = 0; n5 < var_int_arr_d.length; ++n5) {
                    if (var_int_arr_d[n5] != n8) continue;
                    return new int[]{4, n8};
                }
                return new int[]{3, n8};
            }
        }
        catch (Exception exception) {}
        return new int[]{0, 0};
    }

    public final void void_a() {
        switch (this.var_int_d) {
            case 0: {
                var_int_a = 160;
                var_int_b = 160;
                var_int_c = 4;
                return;
            }
            case 1: {
                var_int_a = 115;
                var_int_b = 115;
                var_int_c = 3;
                return;
            }
            case 2: {
                var_int_a = 70;
                var_int_b = 70;
                var_int_c = 2;
                return;
            }
            case 3: {
                var_int_a = 31;
                var_int_b = 31;
                var_int_c = 1;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        if (this.var_byte_a == 2 || this.var_byte_a == 3) {
            int n2;
            int n3;
            for (n3 = 0; n3 < 3; ++n3) {
                this.var_ad_a.var_int_e = n3;
                this.var_ad_a.m();
                for (n2 = 0; this.var_byte_a == 2 && this.var_ad_a.var_int_e == n3 && n2 < 60; ++n2) {
                    try {
                        Thread.sleep(50L);
                        continue;
                    }
                    catch (InterruptedException interruptedException) {}
                }
                this.var_ad_a.var_javax_microedition_lcdui_Image_arr_a[n3] = null;
            }
            this.var_ad_a.var_int_e = 3;
            try {
                this.var_ad_a.var_javax_microedition_lcdui_Image_arr_a[3] = Image.createImage((String)"/ze_logo.png");
            }
            catch (IOException iOException) {}
            this.var_ad_a.m();
            for (n3 = 0; this.var_byte_a == 2 && this.var_ad_a.var_int_e == 3 && n3 < 60; ++n3) {
                try {
                    Thread.sleep(50L);
                    continue;
                }
                catch (InterruptedException interruptedException) {}
            }
            this.var_ad_a.var_javax_microedition_lcdui_Image_arr_a[3] = null;
            Object object = this;
            try {
                ((Main)object).var_byte_a = (byte)3;
                ((Main)object).var_ad_a.m();
                System.gc();
                var_boolean_e = !Main.boolean_a("settings");
                ((Main)object).var_ad_a.c();
                ((Main)object).var_ad_a.g();
                if (!var_boolean_e) {
                    ((Main)object).var_u_a.f();
                }
                ((Main)object).var_ad_a.void_b(4);
                d.d();
                ((Main)object).var_d_a.e();
                ((Main)object).var_d_b.void_a();
                ((Main)object).var_ad_a.void_b(10);
                ap.var_af_arr_a = new af[5];
                for (int i2 = 0; i2 < ap.var_af_arr_a.length; ++i2) {
                    n2 = -1;
                    switch (i2) {
                        case 0: {
                            n2 = 4;
                            break;
                        }
                        case 1: 
                        case 4: {
                            n2 = 4;
                            break;
                        }
                        case 2: {
                            n2 = 4;
                            break;
                        }
                        case 3: {
                            n2 = 10;
                        }
                    }
                    ap.var_af_arr_a[i2] = i2 == 3 ? new af(6, n2) : new af(6, n2);
                }
                ((Main)object).var_ad_a.void_b(4);
                q.a(((Main)object).var_ad_a);
                ((Main)object).var_ad_a.void_b(10);
                ((Main)object).var_ar_a.var_ac_a.var_javax_microedition_lcdui_Image_arr_a = ((Main)object).var_ad_a.javax_microedition_lcdui_Image_arr_a(145);
                ((Main)object).var_ad_a.void_b(4);
                new q(((Main)object).var_ar_a, 0, 0, 0, 0);
                ((Main)object).var_ad_a.void_b(4);
                new ap(((Main)object).var_ar_a, 0, 0, 0);
                ((Main)object).var_ad_a.void_b(4);
                new ai(((Main)object).var_ar_a);
                ((Main)object).var_ad_a.void_b(4);
                new bb(((Main)object).var_ar_a, 0, new k(((Main)object).var_ar_a, 0, new as(), new as(), 1), 0, 0);
                ((Main)object).var_ad_a.void_b(4);
                Object object2 = object;
                ((Main)object).n = false;
                super.g();
                ((Main)object).var_ad_a.g();
                ((Main)object).var_u_a.b();
                j.void_a("/tz." + d.var_java_lang_String_arr_a[d.var_int_a]);
                j.b("UTF-8");
                j.j_a().void_a();
                ((Main)object).var_an_a = new an(1);
                Object object3 = ((Main)object).var_ad_a;
                object2 = ((Main)object).var_an_a;
                if (object3 == null) {
                    throw new NullPointerException();
                }
                Object object4 = ((an)object2).var_java_lang_Object_a;
                synchronized (object4) {
                    if (((an)object2).var_java_util_Vector_b == null) {
                        ((an)object2).var_java_util_Vector_b = new Vector(1);
                    }
                    ((an)object2).var_java_util_Vector_b.addElement(object3);
                }
                ((Main)object).var_an_a.a(((Main)object).var_ad_a);
                Object object5 = new ba();
                object3 = ((Main)object).var_ad_a;
                object2 = object5;
                if (object3 == null) {
                    throw new NullPointerException();
                }
                object4 = object2;
                synchronized (object4) {
                    if (((ba)object2).var_java_util_Vector_a == null) {
                        ((ba)object2).var_java_util_Vector_a = new Vector(1);
                    }
                    ((ba)object2).var_java_util_Vector_a.addElement(object3);
                }
                ((Main)object).var_an_a.a((av)object5);
                object3 = object;
                object2 = ((Main)object).var_an_a;
                if (object3 == null) {
                    throw new NullPointerException();
                }
                object4 = ((an)object2).var_java_lang_Object_a;
                synchronized (object4) {
                    if (((an)object2).var_java_util_Vector_a == null) {
                        ((an)object2).var_java_util_Vector_a = new Vector(1);
                    }
                    ((an)object2).var_java_util_Vector_a.addElement(object3);
                }
                object5 = aj.a((MIDlet)object);
                ((Main)object).var_ag_a = ag.a(((Main)object).var_an_a, (b)object5);
                if (var_boolean_e) {
                    ((Main)object).var_ag_a.b(false);
                }
                if (!Main.boolean_a("achi")) {
                    int n4;
                    ((Main)object).b("achi");
                    ((Main)object).var_java_io_DataOutputStream_a.writeInt(0);
                    ((Main)object).var_java_io_DataOutputStream_a.writeInt(0);
                    ((Main)object).var_java_io_DataOutputStream_a.writeInt(0);
                    for (n4 = 0; n4 < var_int_arr_a.length; ++n4) {
                        for (int i3 = 0; i3 < var_int_arr_a[n4]; ++i3) {
                            ((Main)object).var_java_io_DataOutputStream_a.writeBoolean(false);
                        }
                    }
                    for (n4 = 0; n4 < var_int_arr_a.length; ++n4) {
                        ((Main)object).var_java_io_DataOutputStream_a.writeBoolean(false);
                    }
                    ((Main)object).a(true);
                }
                ((Main)object).var_ad_a.h();
                System.gc();
            }
            catch (Exception exception) {}
            ((Main)object).void_a();
            var_boolean_b = true;
            this.var_byte_a = 1;
            this.var_u_a.var_byte_b = 0;
            this.b();
            if (var_boolean_e) {
                object = this.getAppProperty("default-lang");
                int n5 = -1;
                if (object != null) {
                    for (int i4 = 0; i4 < d.var_java_lang_String_arr_a.length; ++i4) {
                        if (((String)object).compareTo(d.var_java_lang_String_arr_a[i4]) != 0) continue;
                        n5 = i4;
                        break;
                    }
                }
                if (n5 == -1) {
                    this.var_u_a.a((byte)42);
                } else {
                    d.var_int_a = n5;
                    this.var_d_a.e();
                    this.var_u_a.void_a();
                }
            } else {
                this.var_u_a.void_a();
            }
            this.var_byte_a = 1;
            this.var_ad_a.m();
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException interruptedException) {}
        }
        this.var_int_g = 0;
        this.var_boolean_f = false;
        do {
            long l2 = 0L;
            long l3 = 0L;
            do {
                try {
                    long l4;
                    this.b();
                    l3 = System.currentTimeMillis();
                    boolean bl = true;
                    this.o = false;
                    if (!this.var_ad_a.var_boolean_a) {
                        switch (this.var_byte_a) {
                            case 0: {
                                this.var_ar_a.c();
                                break;
                            }
                            case 1: {
                                bl = this.var_u_a.boolean_a();
                            }
                        }
                    }
                    if (!this.var_boolean_f && bl) {
                        this.var_ad_a.m();
                    }
                    if (this.var_an_a.boolean_a() && (l4 = System.currentTimeMillis()) - this.var_long_b >= 1000L) {
                        this.var_long_b = l4;
                        DeviceControl.setLights((int)0, (int)100);
                    }
                    l2 = System.currentTimeMillis() - l3;
                    ++this.var_int_g;
                }
                catch (Exception exception) {}
            } while (l2 >= (long)this.int_a() && !this.var_boolean_f);
            long l5 = (long)this.int_a() - l2;
            l5 = l5 < 1L ? 1L : l5;
            try {
                Thread.sleep(l5);
            }
            catch (InterruptedException interruptedException) {}
        } while (!this.var_boolean_f);
        this.destroyApp(true);
    }

    public final void b() {
        if (this.var_boolean_a) {
            while (!this.l) {
                try {
                    Thread.sleep(1L);
                }
                catch (Exception exception) {}
            }
            this.var_boolean_a = false;
            this.var_ad_a.var_boolean_a = true;
            this.var_ad_a.m();
            this.h();
            this.g();
            if (k && !this.var_boolean_a) {
                this.a(12, true);
            }
            this.var_ad_a.var_boolean_a = false;
            if (this.var_byte_a == 0 && this.var_ar_a.var_byte_c == 0 && var_boolean_d) {
                this.var_ar_a.var_ac_a.void_a(-7);
            } else if (this.var_byte_a == 0 && this.var_ar_a.var_byte_c == 6) {
                this.var_ar_a.var_ac_a.var_int_e = 0;
            }
            if (this.var_byte_a != 1 || this.var_u_a.var_byte_b != 0) {
                this.var_ad_a.m();
            }
        }
    }

    private int int_a() {
        if (this.var_byte_a == 0) {
            if (this.var_ar_a.var_byte_b == 1) {
                return var_int_b;
            }
            if (this.var_ar_a.var_byte_b == 2) {
                return var_int_a;
            }
            if (this.var_ar_a.var_byte_c == 6 || this.var_ar_a.var_byte_c == 9 || this.var_ar_a.var_byte_c == 5) {
                return var_int_b;
            }
            return 0;
        }
        return var_int_b;
    }

    public final void c() {
        this.l = false;
        if (var_boolean_c && !this.var_boolean_a) {
            this.var_boolean_a = true;
            boolean bl = k;
            this.c(12);
            k = bl;
            this.h();
        }
        this.var_ad_a.var_boolean_b = true;
    }

    public final void d() {
        if (this.var_boolean_a) {
            this.l = true;
        }
    }

    public final void void_a(String string) {
        string = "gi" + string;
        try {
            this.var_javax_microedition_rms_RecordStore_a.closeRecordStore();
        }
        catch (Exception exception) {}
        try {
            this.var_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore((String)string, (boolean)false);
            this.var_java_io_ByteArrayInputStream_a = new ByteArrayInputStream(this.var_javax_microedition_rms_RecordStore_a.getRecord(1));
            this.var_java_io_DataInputStream_a = new DataInputStream(this.var_java_io_ByteArrayInputStream_a);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void b(String string) {
        string = "gi" + string;
        try {
            this.var_javax_microedition_rms_RecordStore_a.closeRecordStore();
        }
        catch (Exception exception) {}
        try {
            RecordStore.deleteRecordStore((String)string);
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {}
        try {
            this.var_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore((String)string, (boolean)true);
            this.var_java_io_ByteArrayOutputStream_a = new ByteArrayOutputStream();
            this.var_java_io_DataOutputStream_a = new DataOutputStream(this.var_java_io_ByteArrayOutputStream_a);
            return;
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            return;
        }
    }

    public final void c(String string) {
        string = "gi" + string;
        try {
            this.var_javax_microedition_rms_RecordStore_a.closeRecordStore();
        }
        catch (Exception exception) {}
        try {
            RecordStore.deleteRecordStore((String)string);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a(boolean bl) {
        try {
            if (bl) {
                this.var_java_io_DataOutputStream_a.flush();
                byte[] byArray = this.var_java_io_ByteArrayOutputStream_a.toByteArray();
                this.var_javax_microedition_rms_RecordStore_a.addRecord(byArray, 0, byArray.length);
                this.var_java_io_DataOutputStream_a.close();
                this.var_java_io_ByteArrayOutputStream_a.close();
            } else {
                this.var_java_io_DataInputStream_a.close();
                this.var_java_io_ByteArrayInputStream_a.close();
            }
        }
        catch (Exception exception) {}
        try {
            this.var_javax_microedition_rms_RecordStore_a.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean boolean_a(String string) {
        string = "gi" + string;
        try {
            string = RecordStore.openRecordStore((String)string, (boolean)false);
            int n2 = string.getNumRecords();
            string.closeRecordStore();
            return n2 > 0;
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
        }
        catch (RecordStoreException recordStoreException) {}
        return false;
    }

    protected void pauseApp() {
        this.c();
    }

    protected void destroyApp(boolean bl) {
        this.var_boolean_f = true;
        Display.getDisplay((MIDlet)this).setCurrent(null);
        this.notifyDestroyed();
    }

    public final void void_a(int n2) {
        long l2 = System.currentTimeMillis();
        if (this.var_boolean_g && l2 - this.var_long_a > (long)n2) {
            this.var_long_a = l2;
            try {
                this.var_javax_microedition_lcdui_Display_a.vibrate(n2);
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final void e() {
        as as2 = new as(-512, -512);
        as as3 = new as(32768, -512);
        as as4 = new as(-512, 32768);
        as as5 = new as(32768, 32768);
        as as6 = new as(512, -512);
        as as7 = new as(32256, -512);
        as as8 = new as(-512, 32256);
        as as9 = new as(33280, 32256);
        as as10 = new as(1024, 1024);
        as as11 = new as(-1024, 1024);
        this.var_ar_a.var_as_arr_arr_a = new as[][]{{as2, as3}, {as3, as5}, {as5, as4}, {as4, as2}, {as2, as3, as5}, {as3, as5, as4}, {as5, as4, as2}, {as4, as2, as3}, {as2, as3, null, as5, as4}, {as3, as5, null, as4, as2}, {as2, as3, as5, as4}, {as3, as5, as4, as2}, {as5, as4, as2, as3}, {as4, as2, as3, as5}, {as2, as3, as5, as4, as2}, {as6, as9}, {as8, as7}, {as9.as_a(as11), as6.as_a(as11)}, {as7.as_a(as10), as8.as_a(as10)}, {new as(as4.var_int_a, 14336), new as(as5.var_int_a, 14336)}, {new as(14336, as5.b), new as(14336, as3.b)}, {new as(as3.var_int_a, 18432), new as(as2.var_int_a, 18432)}, {new as(18432, as2.b), new as(18432, as4.b)}, {as6, as9, as8}, {as9, as8, as7}, {as9.as_a(as11), as6.as_a(as11), as7.as_a(as10)}, {as6.as_a(as11), as7.as_a(as10), as8.as_a(as10)}, {new as(as2.var_int_a, 15360), as2, as3, new as(as3.var_int_a, 15360), new as(as2.var_int_a, 15360)}, {new as(8192, as2.b), new as(24576, as2.b), new as(24576, as5.b), new as(8192, as5.b), new as(8192, as2.b)}};
        this.var_ar_a.var_byte_arr_arr_a = new byte[this.var_ar_a.var_int_d][this.var_ar_a.var_int_e];
        for (int i2 = 0; i2 < this.var_ar_a.var_int_d; ++i2) {
            for (int i3 = 0; i3 < this.var_ar_a.var_int_e; ++i3) {
                this.void_a(i2, i3);
            }
        }
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public final void void_a(int n2, int n3) {
        byte[][] byArray = this.var_ar_a.var_byte_arr_arr_a;
        int n4 = this.byte_a(n2, n3);
        if (n4 == 0) {
            if (!ar.var_boolean_arr_a[this.var_ar_a.var_byte_arr_arr_arr_a[1][n2][n3]]) {
                this.var_ar_a.var_byte_arr_arr_arr_a[0][n2][n3] = -1;
            }
        } else {
            if (this.var_ar_a.var_byte_arr_arr_arr_a[0][n2][n3] == -1 && this.var_ar_a.var_int_b != 93) {
                this.var_ar_a.var_byte_arr_arr_arr_a[0][n2][n3] = 11;
            }
            if (this.var_ar_a.var_ac_a.var_int_a != 0 && this.var_ar_a.var_byte_arr_arr_arr_a[0][n2][n3] == 11) {
                this.var_ar_a.var_byte_arr_arr_arr_a[0][n2][n3] = 51;
            }
        }
        switch (n4) {
            case -1: {
                byArray[n2][n3] = -1;
                return;
            }
            case 0: {
                n4 = 0;
                byte by = this.byte_a(n2 - 1, n3);
                byte by2 = this.byte_a(n2 + 1, n3);
                byte by3 = this.byte_a(n2, n3 - 1);
                int n5 = this.byte_a(n2, n3 + 1);
                if (by == 0) {
                    ++n4;
                }
                if (by2 == 0) {
                    ++n4;
                }
                if (by3 == 0) {
                    ++n4;
                }
                if (n5 == 0) {
                    ++n4;
                }
                int n6 = Integer.MIN_VALUE;
                block22: do {
                    switch (n6 == Integer.MIN_VALUE ? n4 : n6) {
                        case 4: {
                            n4 = this.byte_a(n2 - 1, n3 - 1);
                            by = this.byte_a(n2 + 1, n3 - 1);
                            by2 = this.byte_a(n2 + 1, n3 + 1);
                            by3 = this.byte_a(n2 - 1, n3 + 1);
                            n5 = 0;
                            if (n4 == -1) {
                                ++n5;
                            }
                            if (by == -1) {
                                ++n5;
                            }
                            if (by2 == -1) {
                                ++n5;
                            }
                            if (by3 == -1) {
                                ++n5;
                            }
                            n6 = 0;
                            if (n5 >= 3) continue block22;
                            if (n4 == -1 && by == -1) {
                                byArray[n2][n3] = 13;
                                return;
                            }
                            if (by == -1 && by2 == -1) {
                                byArray[n2][n3] = 10;
                                return;
                            }
                            if (by2 == -1 && by3 == -1) {
                                byArray[n2][n3] = 11;
                                return;
                            }
                            if (by3 == -1 && n4 == -1) {
                                byArray[n2][n3] = 12;
                                return;
                            }
                            if (n4 == -1 && by2 == -1 || by == -1 && by3 == -1) {
                                byArray[n2][n3] = 14;
                                return;
                            }
                            if (n4 == -1) {
                                byArray[n2][n3] = 7;
                                return;
                            }
                            if (by == -1) {
                                byArray[n2][n3] = 4;
                                return;
                            }
                            if (by2 == -1) {
                                byArray[n2][n3] = 5;
                                return;
                            }
                            if (by3 == -1) {
                                byArray[n2][n3] = 6;
                                return;
                            }
                            byArray[n2][n3] = -1;
                            return;
                        }
                        case 3: {
                            if (by3 != 0) {
                                by2 = this.byte_a(n2 + 1, n3 + 1);
                                by3 = this.byte_a(n2 - 1, n3 + 1);
                                if (by3 == -1) {
                                    n6 = 0;
                                    if (by2 == -1) continue block22;
                                }
                                if (by3 == -1) {
                                    byArray[n2][n3] = 12;
                                    return;
                                }
                                if (by2 == -1) {
                                    byArray[n2][n3] = 10;
                                    return;
                                }
                                byArray[n2][n3] = 0;
                                return;
                            }
                            if (by2 != 0) {
                                n4 = this.byte_a(n2 - 1, n3 - 1);
                                by3 = this.byte_a(n2 - 1, n3 + 1);
                                if (n4 == -1) {
                                    n6 = 0;
                                    if (by3 == -1) continue block22;
                                }
                                if (n4 == -1) {
                                    byArray[n2][n3] = 13;
                                    return;
                                }
                                if (by3 == -1) {
                                    byArray[n2][n3] = 11;
                                    return;
                                }
                                byArray[n2][n3] = 1;
                                return;
                            }
                            if (n5 != 0) {
                                by = this.byte_a(n2 + 1, n3 - 1);
                                n4 = this.byte_a(n2 - 1, n3 - 1);
                                if (by == -1) {
                                    n6 = 0;
                                    if (n4 == -1) continue block22;
                                }
                                if (by == -1) {
                                    byArray[n2][n3] = 10;
                                    return;
                                }
                                if (n4 == -1) {
                                    byArray[n2][n3] = 12;
                                    return;
                                }
                                byArray[n2][n3] = 2;
                                return;
                            }
                            if (by == 0) return;
                            by = this.byte_a(n2 + 1, n3 - 1);
                            by2 = this.byte_a(n2 + 1, n3 + 1);
                            if (by == -1) {
                                n6 = 0;
                                if (by2 == -1) continue block22;
                            }
                            if (by == -1) {
                                byArray[n2][n3] = 13;
                                return;
                            }
                            if (by2 == -1) {
                                byArray[n2][n3] = 11;
                                return;
                            }
                            byArray[n2][n3] = 3;
                            return;
                        }
                        case 2: {
                            if (by3 != 0 && by2 != 0) {
                                byArray[n2][n3] = (byte)(this.byte_a(n2 - 1, n3 + 1) == -1 ? 14 : 4);
                                return;
                            }
                            if (by2 != 0 && n5 != 0) {
                                byArray[n2][n3] = (byte)(this.byte_a(n2 - 1, n3 - 1) == -1 ? 14 : 5);
                                return;
                            }
                            if (n5 != 0 && by != 0) {
                                byArray[n2][n3] = (byte)(this.byte_a(n2 + 1, n3 - 1) == -1 ? 14 : 6);
                                return;
                            }
                            if (by != 0 && by3 != 0) {
                                byArray[n2][n3] = (byte)(this.byte_a(n2 + 1, n3 + 1) == -1 ? 14 : 7);
                                return;
                            }
                            if (by3 != 0 && n5 != 0) {
                                byArray[n2][n3] = 8;
                                return;
                            }
                            if (by == 0) return;
                            if (by2 == 0) return;
                            byArray[n2][n3] = 9;
                            return;
                        }
                        case 1: {
                            if (by == 0) {
                                byArray[n2][n3] = 10;
                                return;
                            }
                            if (by3 == 0) {
                                byArray[n2][n3] = 11;
                                return;
                            }
                            if (by2 == 0) {
                                byArray[n2][n3] = 12;
                                return;
                            }
                            if (n5 != 0) return;
                            byArray[n2][n3] = 13;
                            return;
                        }
                        case 0: {
                            byArray[n2][n3] = 14;
                            return;
                        }
                    }
                    return;
                } while (true);
                return;
            }
            case 1: {
                switch (this.var_ar_a.var_byte_arr_arr_arr_a[1][n2][n3]) {
                    case 1: 
                    case 16: 
                    case 37: 
                    case 68: {
                        byArray[n2][n3] = (byte)(this.byte_a(n2, n3 + 1) != 0 ? 23 : 15);
                        return;
                    }
                    case 2: 
                    case 17: 
                    case 38: 
                    case 67: {
                        byArray[n2][n3] = (byte)(this.byte_a(n2, n3 + 1) != 0 ? 24 : 16);
                        return;
                    }
                    case 3: 
                    case 39: 
                    case 55: {
                        byArray[n2][n3] = (byte)(this.byte_a(n2, n3 - 1) != 0 ? 25 : 17);
                        return;
                    }
                    case 4: 
                    case 40: 
                    case 57: {
                        byArray[n2][n3] = (byte)(this.byte_a(n2, n3 - 1) != 0 ? 26 : 18);
                        return;
                    }
                    case 7: {
                        byArray[n2][n3] = 19;
                        return;
                    }
                    case 10: 
                    case 11: 
                    case 12: {
                        byArray[n2][n3] = (byte)(10 + this.var_ar_a.var_byte_arr_arr_arr_a[1][n2][n3]);
                        return;
                    }
                    case 60: {
                        byArray[n2][n3] = 27;
                        return;
                    }
                    case 69: {
                        byArray[n2][n3] = 28;
                    }
                }
                return;
            }
        }
    }

    public final byte byte_a(int n2, int n3) {
        if (n2 < 0 || n3 < 0 || n2 >= this.var_ar_a.var_int_d || n3 >= this.var_ar_a.var_int_e) {
            return 0;
        }
        n2 = this.var_ar_a.var_byte_arr_arr_arr_a[1][n2][n3];
        switch (n2) {
            case -1: 
            case 8: 
            case 9: 
            case 13: 
            case 43: 
            case 70: {
                return -1;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 7: 
            case 10: 
            case 11: 
            case 12: 
            case 16: 
            case 17: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 55: 
            case 57: 
            case 60: 
            case 67: 
            case 68: 
            case 69: {
                return 1;
            }
        }
        return 0;
    }

    private static s a(am am2, as as2) {
        long l2 = Long.MAX_VALUE;
        int n2 = -1;
        for (int i2 = 0; i2 < am2.var_s_arr_a.length; ++i2) {
            long l3 = as2.as_b(am2.var_s_arr_a[i2].var_as_a).d();
            if (l3 >= l2 || l3 > 8192L) continue;
            n2 = i2;
            l2 = l3;
        }
        if (n2 == -1) {
            return null;
        }
        return am2.var_s_arr_a[n2];
    }

    public final DataInputStream java_io_DataInputStream_a(String string) {
        try {
            InputStream inputStream = null;
            inputStream = null;
            inputStream = Main.java_io_InputStream_a("/" + string + ".lvl");
            if (inputStream == null) {
                return null;
            }
            inputStream = new DataInputStream(inputStream);
            this.var_ad_a.e();
            this.var_ar_a.var_int_d = ((DataInputStream)inputStream).readByte() & 0xFF;
            this.var_ar_a.var_int_e = ((DataInputStream)inputStream).readByte() & 0xFF;
            this.var_ar_a.var_ac_a.var_int_b = this.var_ar_a.var_ac_a.var_int_a;
            this.var_ar_a.var_ac_a.var_int_a = ((DataInputStream)inputStream).readByte();
            return inputStream;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(DataInputStream dataInputStream) {
        block82: {
            try {
                int n2;
                int n3;
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                int n10;
                this.var_ad_a.void_a(468 + this.var_ar_a.var_ac_a.var_int_a);
                if (this.var_ar_a.var_int_b == 112) {
                    for (n10 = 0; n10 < 4; ++n10) {
                        this.var_ad_a.void_a(n10 + 531);
                    }
                }
                n10 = dataInputStream.readByte();
                int n11 = dataInputStream.readByte();
                int n12 = n10 + n11;
                int n13 = 0;
                Object object = new int[n12][3];
                for (n9 = 0; n9 < n12; ++n9) {
                    object[n9][0] = dataInputStream.readByte() & 0xFF;
                    object[n9][1] = dataInputStream.readByte() & 0xFF;
                    object[n9][2] = dataInputStream.readByte() & 0xFF;
                    if (object[n9][2] - 2 == 2) {
                        n11 += 3;
                        continue;
                    }
                    if (object[n9][2] - 2 == 5) {
                        n11 += 10;
                        continue;
                    }
                    if (object[n9][2] != 1) continue;
                    ++n13;
                }
                this.var_ar_a.var_q_arr_a = new q[(this.var_ar_a.var_byte_b == 1 ? 1 : n13) + n10 - n13];
                this.var_ar_a.var_ai_arr_a = new ai[n11];
                n11 = 0;
                n9 = 0;
                n10 = 0;
                n13 = 0;
                block30: for (n8 = 0; n8 < n12; ++n8) {
                    switch (object[n8][2]) {
                        case 1: {
                            if (this.var_ar_a.var_byte_b == 1 && n13 != 0) continue block30;
                            this.var_ar_a.var_q_arr_a[n10] = new q(this.var_ar_a, n13 == 0 ? (byte)0 : 1, 0, (object[n8][0] << 5) - 16, (this.var_ar_a.var_int_e - object[n8][1] << 5) + 16);
                            this.var_ar_a.var_q_arr_a[n10].var_int_b = n10;
                            ++n10;
                            ++n13;
                            continue block30;
                        }
                        case 5: {
                            this.var_ar_a.var_q_arr_a[n10] = new q(this.var_ar_a, 1, this.var_ar_a.var_int_b == 90 ? (byte)1 : (this.var_ar_a.var_int_b == 133 ? (byte)3 : 2), (object[n8][0] << 5) - 16, (this.var_ar_a.var_int_e - object[n8][1] << 5) + 16);
                            this.var_ar_a.var_q_arr_a[n10].var_int_b = n10;
                            ++n10;
                            continue block30;
                        }
                        default: {
                            byte by = (byte)(object[n8][2] - 2);
                            n7 = 0;
                            n7 = by != 2 && by != 5 ? n11++ : this.var_ar_a.var_ai_arr_a.length - 1 - n9++;
                            this.var_ar_a.var_ai_arr_a[n7] = new ai(this.var_ar_a);
                            this.var_ar_a.var_ai_arr_a[n7].a(by, new as((object[n8][0] << 15) - 16384, (this.var_ar_a.var_int_e - object[n8][1] << 15) + 16384), true);
                            ai.a(this.var_ad_a, ai.var_int_arr_a[by]);
                            if (by == 2) {
                                ai.a(this.var_ad_a, ai.var_int_arr_a[0]);
                                continue block30;
                            }
                            if (by != 5) continue block30;
                            ai.a(this.var_ad_a, ai.var_int_arr_a[6]);
                        }
                    }
                }
                for (n8 = (int)n11; n8 < this.var_ar_a.var_ai_arr_a.length; ++n8) {
                    if (this.var_ar_a.var_ai_arr_a[n8] != null) continue;
                    this.var_ar_a.var_ai_arr_a[n8] = new ai(this.var_ar_a);
                    this.var_ar_a.var_ai_arr_a[n8].var_byte_d = 0;
                }
                n8 = dataInputStream.readByte() & 0xFF;
                this.var_ar_a.var_ap_arr_a = new ap[n8];
                am[][] amArray = new am[this.var_ar_a.var_int_d][this.var_ar_a.var_int_e];
                block32: for (n7 = 0; n7 < n8; ++n7) {
                    n10 = (dataInputStream.readByte() & 0xFF) - 1;
                    n11 = this.var_ar_a.var_int_e - (dataInputStream.readByte() & 0xFF);
                    n12 = (dataInputStream.readByte() & 0xFF) - 1;
                    this.var_ar_a.var_ap_arr_a[n7] = new ap(this.var_ar_a, (byte)n12, n10, n11);
                    this.var_ar_a.var_ap_arr_a[n7].a();
                    am am2 = this.var_ar_a.var_ap_arr_a[n7].var_am_a;
                    switch (n12) {
                        case 0: 
                        case 5: {
                            amArray[n10][n11] = am2;
                            continue block32;
                        }
                        case 1: 
                        case 2: {
                            amArray[n10][n11] = am2;
                            amArray[n10 + 1][n11] = am2;
                            amArray[n10 + 2][n11] = am2;
                            continue block32;
                        }
                        case 7: {
                            amArray[n10][n11] = am2;
                            amArray[n10 + 1][n11] = am2;
                            continue block32;
                        }
                        case 3: 
                        case 6: {
                            amArray[n10][n11] = am2;
                            amArray[n10][n11 - 1] = am2;
                            amArray[n10][n11 - 2] = am2;
                            continue block32;
                        }
                        case 4: {
                            amArray[n10][n11] = am2;
                            amArray[n10][n11 - 1] = am2;
                            amArray[n10 + 1][n11] = am2;
                            amArray[n10 + 1][n11 - 1] = am2;
                            continue block32;
                        }
                        case 8: {
                            amArray[n10][n11] = am2;
                            amArray[n10 + 1][n11] = am2;
                            amArray[n10 + 2][n11] = am2;
                            amArray[n10 + 3][n11] = am2;
                            continue block32;
                        }
                        case 11: {
                            for (int i2 = 0; i2 < 8; ++i2) {
                                amArray[n10 + i2][n11] = am2;
                            }
                            continue block32;
                        }
                    }
                }
                this.var_ar_a.var_boolean_arr_d = new boolean[this.var_ar_a.var_int_d];
                this.var_ar_a.var_boolean_arr_c = new boolean[this.var_ar_a.var_int_e];
                n7 = dataInputStream.readByte() & 0xFF;
                this.var_ar_a.var_bb_arr_a = new bb[n7];
                n7 = 0;
                n10 = dataInputStream.readByte() & 0xFF;
                this.var_ar_a.var_k_arr_a = new k[n10];
                for (n11 = 0; n11 < n10; ++n11) {
                    n12 = dataInputStream.readByte() - 1;
                    n13 = dataInputStream.readByte();
                    byte by = dataInputStream.readByte();
                    as as2 = new as((dataInputStream.readByte() & 0xFF) - 1 << 15, this.var_ar_a.var_int_e - (dataInputStream.readByte() & 0xFF) << 15);
                    as as3 = new as((dataInputStream.readByte() & 0xFF) - 1 << 15, this.var_ar_a.var_int_e - (dataInputStream.readByte() & 0xFF) << 15);
                    this.var_ar_a.var_k_arr_a[n11] = new k(this.var_ar_a, (byte)n12, as2, as3, n13);
                    if (by == 0) {
                        this.var_ar_a.var_k_arr_a[n11].a((byte)0, 0);
                        continue;
                    }
                    if (by == 5) {
                        this.var_ar_a.var_k_arr_a[n11].a((byte)1, 0);
                        continue;
                    }
                    this.var_ar_a.var_bb_arr_a[n7] = new bb(this.var_ar_a, by, this.var_ar_a.var_k_arr_a[n11], (dataInputStream.readByte() & 0xFF) - 1, this.var_ar_a.var_int_e - (dataInputStream.readByte() & 0xFF));
                    this.var_ar_a.var_boolean_arr_d[this.var_ar_a.var_bb_arr_a[n7].var_short_a] = true;
                    this.var_ar_a.var_boolean_arr_c[this.var_ar_a.var_bb_arr_a[n7].var_short_b] = true;
                    ++n7;
                }
                n11 = dataInputStream.readByte() & 0xFF;
                Vector<am> vector = new Vector<am>();
                object = new as();
                as as4 = new as();
                int[][] nArrayArray = new int[][]{{-1, -1}, {1, -1}, {1, 1}, {-1, 1}, {0, 0}};
                am am3 = null;
                for (n6 = 0; n6 < n11; ++n6) {
                    n10 = dataInputStream.readByte() & 0xFF;
                    n5 = n10 >> 4;
                    n4 = n10 & 0xF;
                    s s2 = null;
                    int[][] nArray = new int[n4][3];
                    for (n3 = 0; n3 < n4; ++n3) {
                        nArray[n3][1] = (dataInputStream.readByte() & 0xFF) - 1;
                        nArray[n3][2] = this.var_ar_a.var_int_e - (dataInputStream.readByte() & 0xFF);
                        nArray[n3][0] = dataInputStream.readByte();
                    }
                    for (n3 = 0; n3 < n4; ++n3) {
                        s s3;
                        block85: {
                            Object object2;
                            block81: {
                                block87: {
                                    block86: {
                                        block83: {
                                            am am4;
                                            block84: {
                                                s3 = null;
                                                n2 = nArray[n3][0];
                                                n13 = nArray[n3][1];
                                                int n14 = nArray[n3][2];
                                                object.var_int_a = n13 << 5;
                                                object.b = n14 << 5;
                                                int n15 = nArrayArray[n2][0];
                                                int n16 = nArrayArray[n2][1];
                                                switch (n2) {
                                                    case 1: {
                                                        object.var_int_a += 32;
                                                        break;
                                                    }
                                                    case 2: {
                                                        object.var_int_a += 32;
                                                        object.b += 32;
                                                        break;
                                                    }
                                                    case 3: {
                                                        object.b += 32;
                                                        break;
                                                    }
                                                    case 4: {
                                                        object.var_int_a += 16;
                                                        object.b += 16;
                                                        break;
                                                    }
                                                }
                                                object.var_int_a <<= 10;
                                                object.b <<= 10;
                                                if (n3 != 0 && n3 != n4 - 1) break block83;
                                                am4 = null;
                                                if (amArray[n13][n14] != null && (s3 = Main.a(amArray[n13][n14], (as)object)) != null) {
                                                    am4 = amArray[n13][n14];
                                                }
                                                if (s3 == null && amArray[n13 + n15][n14] != null && (s3 = Main.a(amArray[n13 + n15][n14], (as)object)) != null) {
                                                    am4 = amArray[n13 + n15][n14];
                                                }
                                                if (s3 == null && amArray[n13 + n15][n14 + n16] != null && (s3 = Main.a(amArray[n13 + n15][n14 + n16], (as)object)) != null) {
                                                    am4 = amArray[n13 + n15][n14 + n16];
                                                }
                                                if (s3 == null && amArray[n13][n14 + n16] != null && (s3 = Main.a(amArray[n13][n14 + n16], (as)object)) != null) {
                                                    am4 = amArray[n13][n14 + n16];
                                                }
                                                if (n3 != 0) break block84;
                                                if (am4 == null) {
                                                    n13 = nArray[n4 - 1][1];
                                                    n14 = nArray[n4 - 1][2];
                                                    n15 = nArrayArray[nArray[n4 - 1][0]][0];
                                                    n16 = nArrayArray[nArray[n4 - 1][0]][1];
                                                    if (amArray[n13][n14] != null) {
                                                        am4 = amArray[n13][n14];
                                                    } else if (amArray[n13 + n15][n14] != null) {
                                                        am4 = amArray[n13 + n15][n14];
                                                    } else if (amArray[n13 + n15][n14 + n16] != null) {
                                                        am4 = amArray[n13 + n15][n14 + n16];
                                                    } else if (amArray[n13][n14 + n16] != null) {
                                                        am4 = amArray[n13][n14 + n16];
                                                    }
                                                }
                                                am3 = am4;
                                                if (n14 - 1 >= 0) {
                                                    am3.a(amArray[n13][n14 - 1]);
                                                    if (n13 - 1 >= 0) {
                                                        am3.a(amArray[n13 - 1][n14 - 1]);
                                                    }
                                                    if (n13 + 1 < this.var_ar_a.var_int_d) {
                                                        am3.a(amArray[n13 + 1][n14 - 1]);
                                                    }
                                                }
                                                break block83;
                                            }
                                            if (am4 != null && am4 != am3) {
                                                am4.a(am3);
                                                am3.a(am4);
                                            }
                                        }
                                        if (n3 < 1) break block85;
                                        object2 = null;
                                        if (s2 != null || s3 != null) break block86;
                                        if (n3 == 1) {
                                            s3 = new s(new as((as)object), 1024);
                                            s3.var_int_b |= 0x20;
                                            am3.a(s3);
                                            object2 = new t(s3, new as(as4), ar.var_int_arr_a[n5], ar.var_int_arr_b[n5], ar.var_int_arr_c[n5]);
                                        }
                                        break block81;
                                    }
                                    if (s3 != null) break block87;
                                    if (n3 == n4 - 1) {
                                        as as5 = new as((as)object);
                                        object2 = new t(s2, as5, ar.var_int_arr_a[n5], ar.var_int_arr_b[n5], ar.var_int_arr_c[n5]);
                                        for (int i3 = 0; i3 < this.var_ar_a.var_k_arr_a.length; ++i3) {
                                            if (!y.a(this.var_ar_a.var_k_arr_a[i3].var_au_a.a(), as5)) continue;
                                            this.var_ar_a.var_k_arr_a[i3].var_au_a.b(as5);
                                            break block81;
                                        }
                                        break block81;
                                    } else {
                                        s3 = new s(new as((as)object), 1024);
                                        s3.var_int_b |= 0x20;
                                        am3.a(s3);
                                        object2 = new t(s2, s3, ar.var_int_arr_a[n5], ar.var_int_arr_b[n5], ar.var_int_arr_c[n5]);
                                    }
                                    break block81;
                                }
                                object2 = s2 == null ? new t(s3, new as(as4), ar.var_int_arr_a[n5], ar.var_int_arr_b[n5], ar.var_int_arr_c[n5]) : new t(s2, s3, ar.var_int_arr_a[n5], ar.var_int_arr_b[n5], ar.var_int_arr_c[n5]);
                            }
                            if (n5 == 1) {
                                ((t)object2).var_byte_a = 1;
                            }
                            vector.addElement((am)object2);
                            s2 = object2;
                            object2 = am3;
                            ((am)object2).var_java_util_Vector_b.addElement(s2);
                        }
                        s2 = s3;
                        as4.c((as)object);
                    }
                }
                n6 = vector.size();
                this.var_ar_a.var_t_arr_a = new t[n6];
                for (n10 = 0; n10 < n6; ++n10) {
                    this.var_ar_a.var_t_arr_a[n10] = (t)vector.elementAt(n10);
                }
                vector.removeAllElements();
                for (n10 = 0; n10 < this.var_ar_a.var_ap_arr_a.length; ++n10) {
                    this.var_ar_a.var_ap_arr_a[n10].var_am_a.void_b();
                }
                System.gc();
                n10 = d.a(d.var_short_arr_a, this.var_ar_a.var_int_b) != -1 ? 1 : 0;
                this.var_int_arr_arr_a = null;
                if (n10 != 0) {
                    this.var_int_arr_arr_a = new int[var_int_arr_a[d.a(d.var_short_arr_a, this.var_ar_a.var_int_b)]][2];
                }
                this.var_ar_a.l = 0;
                this.var_ar_a.var_byte_arr_arr_arr_a = new byte[3][this.var_ar_a.var_int_d][this.var_ar_a.var_int_e];
                for (n5 = 0; n5 < this.var_ar_a.var_int_d; ++n5) {
                    for (n4 = this.var_ar_a.var_int_e - 1; n4 >= 0; --n4) {
                        int n17;
                        for (n17 = 0; n17 < 3; ++n17) {
                            n3 = dataInputStream.readByte();
                            this.var_ar_a.var_byte_arr_arr_arr_a[n17][n5][n4] = (byte)((n3 & 0xFF) - 1);
                            n2 = this.var_ar_a.var_byte_arr_arr_arr_a[n17][n5][n4];
                            if (n2 == -1) continue;
                            this.var_ad_a.void_a(ac.var_int_arr_a[n17] + n2);
                        }
                        if (this.var_ar_a.var_byte_arr_arr_arr_a[1][n5][n4] == 43) {
                            if (n10 != 0) {
                                this.var_int_arr_arr_a[this.var_ar_a.l][0] = n5;
                                this.var_int_arr_arr_a[this.var_ar_a.l][1] = n4;
                            }
                            ++this.var_ar_a.l;
                        }
                        if (this.var_ar_a.var_byte_arr_arr_arr_a[1][n5][n4] != 70 || n10 == 0) continue;
                        if (this.var_ar_a.var_byte_b != 1) {
                            this.var_ar_a.var_byte_arr_arr_arr_a[1][n5][n4] = -1;
                            continue;
                        }
                        this.void_a("achi");
                        this.var_java_io_DataInputStream_a.readInt();
                        this.var_java_io_DataInputStream_a.readInt();
                        this.var_java_io_DataInputStream_a.readInt();
                        for (n17 = 0; n17 < var_int_arr_a.length; ++n17) {
                            for (n3 = 0; n3 < var_int_arr_a[n17]; ++n3) {
                                this.var_java_io_DataInputStream_a.readBoolean();
                            }
                        }
                        n17 = d.a(d.var_short_arr_a, this.var_ar_a.var_int_b);
                        for (n3 = 0; n3 < var_int_arr_a.length; ++n3) {
                            n2 = this.var_java_io_DataInputStream_a.readBoolean() ? 1 : 0;
                            if (n3 != n17 || n2 == 0) continue;
                            this.var_ar_a.var_byte_arr_arr_arr_a[1][n5][n4] = -1;
                            break;
                        }
                        this.a(false);
                    }
                }
                n6 = this.var_d_b.var_boolean_arr_a.length;
                for (n5 = 0; n5 < n6; ++n5) {
                    this.var_d_b.var_boolean_arr_a[n5] = false;
                }
                this.var_ar_a.var_boolean_arr_f = new boolean[this.var_ar_a.var_int_d];
                this.var_ar_a.var_boolean_arr_e = new boolean[this.var_ar_a.var_int_e];
                this.var_ar_a.var_int_c = dataInputStream.readByte() & 0xFF;
                this.var_ar_a.var_short_arr_arr_a = new short[this.var_ar_a.var_int_c][3];
                for (n5 = 0; n5 < this.var_ar_a.var_int_c; ++n5) {
                    this.var_ar_a.var_short_arr_arr_a[n5][0] = (short)((dataInputStream.readByte() & 0xFF) - 1);
                    this.var_ar_a.var_short_arr_arr_a[n5][1] = (short)(this.var_ar_a.var_int_e - (dataInputStream.readByte() & 0xFF));
                    this.var_ar_a.var_short_arr_arr_a[n5][2] = (short)((dataInputStream.readByte() & 0xFF) - 1);
                    this.var_ar_a.var_boolean_arr_f[this.var_ar_a.var_short_arr_arr_a[n5][0]] = true;
                    this.var_ar_a.var_boolean_arr_e[this.var_ar_a.var_short_arr_arr_a[n5][1]] = true;
                    this.var_d_b.var_boolean_arr_a[this.var_ar_a.var_short_arr_arr_a[n5][2]] = true;
                    n4 = ac.var_short_arr_a[this.var_ar_a.var_short_arr_arr_a[n5][2]];
                    for (int i4 = 0; i4 <= 11; ++i4) {
                        if ((n4 & 1 << i4) == 0) continue;
                        this.var_ad_a.void_a(256 + ac.var_int_arr_b[i4]);
                        this.var_ad_a.void_a(256 + ac.var_int_arr_c[i4] + 8);
                    }
                }
            }
            catch (Exception exception) {
                try {
                    dataInputStream.close();
                }
                catch (Exception exception2) {}
                break block82;
            }
            catch (Throwable throwable) {
                try {
                    dataInputStream.close();
                    throw throwable;
                }
                catch (Exception exception) {}
                throw throwable;
            }
            try {
                dataInputStream.close();
            }
            catch (Exception exception) {}
        }
        if (this.var_ar_a.var_int_b == 107) {
            this.var_ad_a.void_a(471);
        }
        this.var_ad_a.d();
        ai.a(this.var_ad_a);
        q.a(this.var_ad_a);
        this.var_d_b.c();
    }

    public static InputStream java_io_InputStream_a(String string) {
        return (var_java_lang_Class_a == null ? (var_java_lang_Class_a = Main.java_lang_Class_a("com.hardwire.blob.Main")) : var_java_lang_Class_a).getResourceAsStream(string);
    }

    private void g() {
        if (this.n) {
            return;
        }
        if (this.var_javax_microedition_media_Player_arr_a == null) {
            this.var_javax_microedition_media_Player_arr_a = new Player[13];
            this.var_javax_microedition_media_control_VolumeControl_arr_a = new VolumeControl[this.var_javax_microedition_media_Player_arr_a.length];
        }
        for (int i2 = 0; i2 < this.var_javax_microedition_media_Player_arr_a.length; ++i2) {
            this.var_javax_microedition_media_control_VolumeControl_arr_a[i2] = null;
            this.d(i2);
            if (var_boolean_b) continue;
            this.var_ad_a.void_b(4);
        }
        this.n = true;
    }

    private void d(int n2) {
        if (n2 >= this.var_javax_microedition_media_Player_arr_a.length) {
            return;
        }
        String string = "";
        switch (n2) {
            case 2: {
                string = "/sound/amber";
                break;
            }
            case 1: {
                string = "/sound/tarball";
                break;
            }
            case 0: {
                string = "/sound/gishhit";
                break;
            }
            case 3: {
                string = "/sound/CLICK015";
                break;
            }
            case 6: {
                string = "/sound/blockbreak";
                break;
            }
            case 7: {
                string = "/sound/splash";
                break;
            }
            case 4: {
                string = "/sound/squish";
                break;
            }
            case 5: {
                string = "/sound/switch";
                break;
            }
            case 10: {
                string = "/sound/bobattack";
                break;
            }
            case 8: {
                string = "/sound/necksnap";
                break;
            }
            case 9: {
                string = "/sound/ropebreak";
                break;
            }
            case 11: {
                string = "/sound/visattack";
                break;
            }
            case 12: {
                string = "/sound/sewer.mp3";
            }
        }
        if (n2 != 12) {
            string = string + ".wav";
        }
        InputStream inputStream = null;
        try {
            inputStream = Main.java_io_InputStream_a(string);
        }
        catch (Exception exception) {}
        try {
            this.var_javax_microedition_media_Player_arr_a[n2] = n2 == 12 ? Manager.createPlayer((InputStream)inputStream, (String)"audio/mpeg") : Manager.createPlayer((InputStream)inputStream, (String)"audio/x-wav");
        }
        catch (Exception exception) {}
        try {
            this.var_javax_microedition_media_Player_arr_a[n2].realize();
        }
        catch (Exception exception) {}
        try {
            this.var_javax_microedition_media_Player_arr_a[n2].prefetch();
        }
        catch (Exception exception) {}
        try {
            inputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void h() {
        if (!this.n) {
            return;
        }
        if (this.var_javax_microedition_media_Player_arr_a == null) {
            return;
        }
        for (int i2 = 0; i2 < this.var_javax_microedition_media_Player_arr_a.length; ++i2) {
            if (this.var_javax_microedition_media_Player_arr_a[i2] == null) continue;
            try {
                this.var_javax_microedition_media_Player_arr_a[i2].close();
            }
            catch (Exception exception) {}
            this.var_javax_microedition_media_Player_arr_a[i2] = null;
        }
        this.n = false;
    }

    public final boolean boolean_a(int n2) {
        try {
            return this.var_javax_microedition_media_Player_arr_a[12].getState() == 400;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public final void a(int n2, boolean bl) {
        try {
            if (n2 == 12) {
                if (!j) {
                    return;
                }
                if (var_int_f == 0) {
                    return;
                }
                k = true;
                if (this.var_javax_microedition_media_Player_arr_a[n2].getState() == 400) {
                    return;
                }
            } else {
                if (!i || !h) {
                    return;
                }
                if (this.o) {
                    return;
                }
                if (var_int_e == 0) {
                    return;
                }
                if (n2 >= this.var_javax_microedition_media_Player_arr_a.length) {
                    switch (n2) {
                        case 8: {
                            n2 = 4;
                            break;
                        }
                        case 9: {
                            n2 = 6;
                            break;
                        }
                        case 10: {
                            return;
                        }
                        case 11: {
                            n2 = 0;
                            break;
                        }
                        case 3: {
                            n2 = 1;
                        }
                    }
                }
                if (n2 >= this.var_javax_microedition_media_Player_arr_a.length) {
                    return;
                }
                if (this.var_javax_microedition_media_Player_arr_a[n2] == null) {
                    return;
                }
                boolean bl2 = false;
                for (int i2 = n2; i2 == n2; ++i2) {
                    if (i2 == 12 || this.var_javax_microedition_media_Player_arr_a[i2].getState() != 400) continue;
                    bl2 = true;
                }
                if (bl2) {
                    return;
                }
            }
            try {
                if (this.var_javax_microedition_media_Player_arr_a[n2] == null || this.var_javax_microedition_media_Player_arr_a[n2].getState() == 0) {
                    this.var_javax_microedition_media_Player_arr_a[n2] = null;
                    this.var_javax_microedition_media_control_VolumeControl_arr_a[n2] = null;
                    this.d(n2);
                }
            }
            catch (Exception exception) {}
            try {
                if (this.var_javax_microedition_media_Player_arr_a[n2].getState() != 300) {
                    this.var_javax_microedition_media_Player_arr_a[n2].prefetch();
                }
            }
            catch (Exception exception) {}
            this.b(n2);
            try {
                this.var_javax_microedition_media_Player_arr_a[n2].setLoopCount(bl ? -1 : 1);
            }
            catch (Exception exception) {}
            try {
                this.var_javax_microedition_media_Player_arr_a[n2].start();
                if (n2 != 12) {
                    this.o = true;
                }
            }
            catch (Exception exception) {
                return;
            }
        }
        catch (Exception exception) {}
    }

    public final void b(int n2) {
        if (this.var_javax_microedition_media_control_VolumeControl_arr_a[n2] == null) {
            try {
                this.var_javax_microedition_media_control_VolumeControl_arr_a[n2] = (VolumeControl)this.var_javax_microedition_media_Player_arr_a[n2].getControl("VolumeControl");
            }
            catch (Exception exception) {}
        }
        if (this.var_javax_microedition_media_control_VolumeControl_arr_a[n2] == null) {
            return;
        }
        try {
            if (n2 != 12) {
                this.var_javax_microedition_media_control_VolumeControl_arr_a[n2].setLevel(var_int_e * 10);
                return;
            }
            this.var_javax_microedition_media_control_VolumeControl_arr_a[n2].setLevel(var_int_f * 10);
        }
        catch (Exception exception) {}
    }

    public final void c(int n2) {
        k = false;
        n2 = 0;
        try {
            n2 = this.var_javax_microedition_media_Player_arr_a[12].getState() == 400 ? 1 : 0;
        }
        catch (Exception exception) {}
        try {
            if (n2 != 0) {
                this.var_javax_microedition_media_Player_arr_a[12].stop();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void f() {
        this.var_ag_b = this.var_ag_a;
        x x2 = this.var_ag_b.x_a();
        if (x2.var_int_a == 0) {
            this.var_byte_b = this.var_byte_a;
            this.var_u_a.var_byte_c = this.var_u_a.var_byte_a;
            ((m)this.var_ag_b.x_a()).x_a();
            this.var_u_a.e();
            this.var_byte_a = 1;
        }
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
        var_int_c = 1;
        m = false;
        var_boolean_b = false;
        var_boolean_c = true;
        var_boolean_d = true;
        var_boolean_e = false;
        var_int_arr_a = new int[]{1, 2, 1, 1, 0, 2, 1, 1, 2, 1, 2, 0, 6, 3, 2, 1, 2, 0, 0, 2, 3, 1, 1, 0, 1, 1, 1, 1, 0, 1, 2, 2, 3, 0, 1, 2, 1, 3, 2, 0, 2, 1, 2, 2, 0, 2, 2, 1, 2, 0, 1};
        var_int_arr_b = new int[]{2, 10, 25, 50, 71};
        var_int_arr_c = new int[]{5, 20, 35, 45, 60};
        var_int_arr_d = new int[]{12, 30, 40, 55, 65};
        var_int_arr_e = new int[]{0, 4953, 1758, 0, 0, 0, 3467, 0, 0, 0, 8734, 0, 0, 0, 5719, 0, 0, 0, 0, 0, 6187, 0, 0, 0, 0, 0, 4731, 0, 0, 0, 0, 0, 7317, 0, 0, 0, 0, 2479, 0, 0, 0, 6729, 0, 0, 0, 9347, 0, 0, 3971, 0, 0};
        h = false;
        var_int_e = 5;
        i = true;
        var_int_f = 4;
        j = true;
        k = false;
    }
}


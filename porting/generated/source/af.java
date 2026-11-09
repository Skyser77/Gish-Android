/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class af {
    private byte var_byte_a;
    private int[] var_int_arr_a;
    private int[] b;
    private int[] c;
    private boolean var_boolean_a = false;
    private int[] d;

    public final void a(Graphics graphics, int n2) {
        if (this.var_byte_a == 4) {
            int n3 = this.c.length / 3;
            graphics.setColor(n2);
            for (int i2 = 0; i2 < n3; ++i2) {
                n2 = i2 * 3;
                int n4 = this.c[n2];
                int n5 = this.c[n2 + 1];
                n2 = this.c[n2 + 2];
                graphics.fillTriangle(this.var_int_arr_a[n4], this.b[n4], this.var_int_arr_a[n5], this.b[n5], this.var_int_arr_a[n2], this.b[n2]);
            }
            return;
        }
        if (this.var_byte_a == 3) {
            graphics.setColor(n2);
            int n6 = this.var_int_arr_a.length - 1;
            n2 = 0;
            int n7 = n6 - 1;
            while (n2 < n6) {
                graphics.fillTriangle(this.var_int_arr_a[n7], this.b[n7], this.var_int_arr_a[n2], this.b[n2], this.var_int_arr_a[n6], this.b[n6]);
                n7 = n2++;
            }
            return;
        }
        if (this.var_byte_a == 6) {
            graphics.setColor(n2);
            int n8 = this.var_int_arr_a.length;
            n2 = 2;
            int n9 = 1;
            while (n2 < n8) {
                graphics.fillTriangle(this.var_int_arr_a[n9], this.b[n9], this.var_int_arr_a[n2], this.b[n2], this.var_int_arr_a[0], this.b[0]);
                n9 = n2++;
            }
        }
    }

    public af(byte by, int n2) {
        this.var_byte_a = by;
        if (this.var_byte_a == 2 || this.var_byte_a == 3 || this.var_byte_a == 6 || this.var_byte_a == 4 || this.var_byte_a == 5 || this.var_byte_a == 8) {
            this.var_int_arr_a = new int[this.var_byte_a == 3 ? n2 + 1 : n2];
            this.b = new int[this.var_byte_a == 3 ? n2 + 1 : n2];
        }
    }

    public final void a(s[] object, as sArray) {
        block20: {
            int n2;
            int n3;
            int n4;
            int n5;
            block21: {
                as as2;
                if (this.var_byte_a == 2 || this.var_byte_a == 3 || this.var_byte_a == 6 || this.var_byte_a == 4 || this.var_byte_a == 5 || this.var_byte_a == 8) {
                    n5 = ((s[])object).length;
                    for (n4 = 0; n4 < n5; ++n4) {
                        as2 = object[n4].var_as_a;
                        this.var_int_arr_a[n4] = as2.var_int_a >> 10;
                        this.b[n4] = as2.b >> 10;
                    }
                    if (this.var_byte_a == 3) {
                        this.var_int_arr_a[((s[])object).length] = sArray.var_int_a >> 10;
                        this.b[((s[])object).length] = sArray.b >> 10;
                    }
                }
                if (this.var_byte_a != 1 && this.var_byte_a != 4) break block20;
                sArray = object;
                object = this;
                if (object.c == null || object.var_boolean_a) break block21;
                n5 = object.c.length / 3;
                n4 = 0;
                for (n3 = 0; n3 < n5; ++n3) {
                    int n6 = n3 * 3;
                    as as3 = sArray[object.c[n6]].var_as_a;
                    as as4 = sArray[object.c[n6 + 1]].var_as_a;
                    as2 = sArray[object.c[n6 + 2]].var_as_a;
                    if ((int)((long)(as4.var_int_a - as3.var_int_a) * (long)(as2.b - as3.b) - (long)(as4.b - as3.b) * (long)(as2.var_int_a - as3.var_int_a) >> 10) < 0) continue;
                    n4 = 1;
                    break;
                }
                if (n4 == 0) break block20;
            }
            if (object.c == null) {
                object.c = new int[(sArray.length - 2) * 3];
            }
            n5 = 0;
            n4 = sArray.length;
            if (object.d == null) {
                object.d = new int[n4];
            }
            for (n2 = 0; n2 < n4; ++n2) {
                object.d[n2] = n2;
            }
            n2 = n4 << 1;
            n3 = n4 - 1;
            while (n4 > 2) {
                boolean bl;
                int n7;
                int n8;
                block19: {
                    if (0 >= n2--) {
                        object.var_boolean_a = true;
                        return;
                    }
                    n8 = n3;
                    if (n8 >= n4) {
                        n8 = 0;
                    }
                    if ((n3 = n8 + 1) >= n4) {
                        n3 = 0;
                    }
                    if ((n7 = n3 + 1) >= n4) {
                        n7 = 0;
                    }
                    int n9 = n4;
                    int[] nArray = object.d;
                    int n10 = n7;
                    int n11 = n3;
                    int n12 = n8;
                    s[] sArray2 = sArray;
                    as as5 = sArray[nArray[n11]].var_as_a;
                    as as6 = sArray2[nArray[n12]].var_as_a;
                    as as7 = sArray2[nArray[n10]].var_as_a;
                    if ((int)((long)(as5.var_int_a - as6.var_int_a) * (long)(as7.b - as6.b) - (long)(as5.b - as6.b) * (long)(as7.var_int_a - as6.var_int_a) >> 10) < 0) {
                        bl = false;
                    } else {
                        for (int i2 = 0; i2 < n9; ++i2) {
                            if (i2 == n12 || i2 == n11 || i2 == n10) continue;
                            as as8 = sArray2[nArray[i2]].var_as_a;
                            int n13 = (int)((long)(as7.var_int_a - as5.var_int_a) * (long)(as8.b - as5.b) - (long)(as7.b - as5.b) * (long)(as8.var_int_a - as5.var_int_a) >> 10);
                            int n14 = (int)((long)(as5.var_int_a - as6.var_int_a) * (long)(as8.b - as6.b) - (long)(as5.b - as6.b) * (long)(as8.var_int_a - as6.var_int_a) >> 10);
                            int n15 = (int)((long)(as6.var_int_a - as7.var_int_a) * (long)(as8.b - as7.b) - (long)(as6.b - as7.b) * (long)(as8.var_int_a - as7.var_int_a) >> 10);
                            if (n13 < 0 || n14 < 0 || n15 < 0) continue;
                            bl = false;
                            break block19;
                        }
                        bl = true;
                    }
                }
                if (!bl) continue;
                n2 = n5 * 3;
                object.c[n2++] = object.d[n7];
                object.c[n2++] = object.d[n3];
                object.c[n2] = object.d[n8];
                ++n5;
                n2 = n3;
                n8 = n3 + 1;
                while (n8 < n4) {
                    object.d[n2] = object.d[n8];
                    n2 = n8++;
                }
                if (n3 >= --n4) {
                    n3 = 0;
                }
                n2 = n4 << 1;
            }
            object.var_boolean_a = false;
        }
    }
}


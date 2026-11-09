/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class am {
    public Vector var_java_util_Vector_a;
    public Vector var_java_util_Vector_b;
    private Vector var_java_util_Vector_c;
    public t[] var_t_arr_a;
    public s[] var_s_arr_a;
    public s[] var_s_arr_b;
    public int var_int_a;
    public as var_as_a;
    public as var_as_b;
    public as var_as_c;
    public int var_int_b;
    public int var_int_c;
    public int d;
    public int e;
    public int f;
    public int[] var_int_arr_a = new int[4];
    public boolean var_boolean_a = true;
    public t[] var_t_arr_b;
    public int g;
    public int h;
    public t[] var_t_arr_c;
    public s[] var_s_arr_c;
    public am[] var_am_arr_a;
    public int i;
    public int j = 0;
    public Object var_java_lang_Object_a;

    public am(int n2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.var_java_util_Vector_a = new Vector();
        this.var_java_util_Vector_b = new Vector();
        this.var_java_util_Vector_c = new Vector();
        this.var_int_a = n2;
        this.d = 0;
        if (bl) {
            this.d |= 4;
        }
        if (bl2) {
            this.d |= 8;
        }
        if (bl4) {
            this.d |= 0x40;
        }
        if (bl3) {
            this.d |= 0x80;
        }
        this.var_int_c = 1024;
        this.h = 1;
    }

    public final int[] int_arr_a() {
        if (this.var_boolean_a) {
            this.var_int_arr_a[1] = Integer.MAX_VALUE;
            this.var_int_arr_a[0] = Integer.MAX_VALUE;
            this.var_int_arr_a[3] = Integer.MIN_VALUE;
            this.var_int_arr_a[2] = Integer.MIN_VALUE;
            int n2 = this.var_s_arr_a.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                as as2 = this.var_s_arr_a[i2].var_as_a;
                if (as2.var_int_a < this.var_int_arr_a[0]) {
                    this.var_int_arr_a[0] = as2.var_int_a;
                }
                if (as2.var_int_a > this.var_int_arr_a[2]) {
                    this.var_int_arr_a[2] = as2.var_int_a;
                }
                if (as2.b < this.var_int_arr_a[1]) {
                    this.var_int_arr_a[1] = as2.b;
                }
                if (as2.b <= this.var_int_arr_a[3]) continue;
                this.var_int_arr_a[3] = as2.b;
            }
            this.var_boolean_a = false;
        }
        return this.var_int_arr_a;
    }

    public final void a(as[] asArray, int n2) {
        for (int i2 = 0; i2 < asArray.length; ++i2) {
            this.var_java_util_Vector_a.addElement(new s(asArray[i2], n2));
        }
    }

    public final void void_a(t t2) {
        this.var_java_util_Vector_b.addElement(t2);
    }

    public final boolean boolean_a(t t2) {
        if (this.g == this.var_t_arr_b.length) {
            return false;
        }
        this.var_t_arr_b[this.g++] = t2;
        return true;
    }

    public final void a(s s2) {
        this.var_java_util_Vector_a.addElement(s2);
    }

    public final void a(am am2) {
        if (am2 != null && !this.var_java_util_Vector_c.contains(am2)) {
            this.var_java_util_Vector_c.addElement(am2);
        }
    }

    public final void a(int n2, int n3, int n4, int n5) {
        t t2;
        int n6;
        n2 = this.var_java_util_Vector_a.size();
        int n7 = n2 >> 1;
        for (n6 = 0; n6 < n7; ++n6) {
            t2 = new t((s)this.var_java_util_Vector_a.elementAt(n6 * 2), (s)this.var_java_util_Vector_a.elementAt(n6 * 2 + 1), 1024, n4, -1);
            this.void_a(t2);
        }
        for (n6 = 0; n6 < n7; ++n6) {
            int n8 = n6 * 2 + 2;
            if (n8 >= n2) {
                n8 = 0;
            }
            t2 = new t((s)this.var_java_util_Vector_a.elementAt(n6 * 2 + 1), (s)this.var_java_util_Vector_a.elementAt(n8), n3, n5, -1);
            this.void_a(t2);
        }
        if (n2 % 2 != 0) {
            this.void_a(new t((s)this.var_java_util_Vector_a.elementAt(n2 - 1), (s)this.var_java_util_Vector_a.elementAt(0), 1024, n4, -1));
        }
    }

    public final void void_a() {
        int n2;
        this.var_s_arr_a = new s[this.var_java_util_Vector_a.size()];
        for (n2 = 0; n2 < this.var_s_arr_a.length; ++n2) {
            this.var_s_arr_a[n2] = (s)this.var_java_util_Vector_a.elementAt(n2);
        }
        this.var_java_util_Vector_a.removeAllElements();
        this.var_t_arr_a = new t[this.var_java_util_Vector_b.size()];
        for (n2 = 0; n2 < this.var_t_arr_a.length; ++n2) {
            this.var_t_arr_a[n2] = (t)this.var_java_util_Vector_b.elementAt(n2);
        }
        this.var_java_util_Vector_b.removeAllElements();
        if ((this.d & 4) != 0) {
            this.e = this.int_a();
            if (this.e < 0) {
                this.e = -this.e;
            }
            am am2 = this;
            int n3 = 0;
            int n4 = am2.var_s_arr_a.length;
            int n5 = 0;
            int n6 = n4 - 1;
            while (n5 < n4) {
                n3 += am2.var_s_arr_a[n5].var_as_a.as_b(am2.var_s_arr_a[n6].var_as_a).c();
                n6 = n5++;
            }
            this.f = n3;
        }
        if ((this.d & 8) != 0) {
            this.var_t_arr_b = new t[this.var_s_arr_a.length];
            this.g = 0;
        }
        if ((this.d & 0x40) != 0) {
            this.var_s_arr_b = new s[this.var_s_arr_a.length];
            for (int i2 = 0; i2 < this.var_s_arr_b.length; ++i2) {
                this.var_s_arr_b[i2] = new s(new as(this.var_s_arr_a[i2].var_as_a), Integer.MAX_VALUE);
            }
        }
        if ((this.d & 0x80) != 0) {
            this.var_as_c = new as();
            for (int i3 = 0; i3 < this.var_s_arr_a.length; ++i3) {
                this.var_as_c.void_a(this.var_s_arr_a[i3].var_as_a);
            }
            this.var_as_c.b(this.var_s_arr_a.length);
        }
    }

    public final void void_b() {
        int n2;
        int n3 = this.var_java_util_Vector_b.size();
        if (n3 == 0) {
            this.var_t_arr_c = null;
        } else {
            this.var_t_arr_c = new t[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.var_t_arr_c[n2] = (t)this.var_java_util_Vector_b.elementAt(n2);
            }
            this.var_java_util_Vector_b.removeAllElements();
        }
        this.var_java_util_Vector_b = null;
        n3 = this.var_java_util_Vector_a.size();
        if (n3 == 0) {
            this.var_s_arr_c = null;
        } else {
            this.var_s_arr_c = new s[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.var_s_arr_c[n2] = (s)this.var_java_util_Vector_a.elementAt(n2);
            }
            this.var_java_util_Vector_a.removeAllElements();
        }
        this.var_java_util_Vector_a = null;
        n3 = this.var_java_util_Vector_c.size();
        if (n3 == 0) {
            this.var_am_arr_a = null;
        } else {
            this.var_am_arr_a = new am[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.var_am_arr_a[n2] = (am)this.var_java_util_Vector_c.elementAt(n2);
            }
            this.var_java_util_Vector_c.removeAllElements();
        }
        this.var_java_util_Vector_c = null;
    }

    public final s[] s_arr_a() {
        if (this.var_s_arr_b != null) {
            return this.var_s_arr_b;
        }
        return this.var_s_arr_a;
    }

    public final boolean boolean_a() {
        return this.g != 0;
    }

    public final void void_c() {
        for (int i2 = 0; i2 < this.g; ++i2) {
            this.var_t_arr_b[i2].a();
            this.var_t_arr_b[i2] = null;
        }
        this.g = 0;
    }

    public final int int_a() {
        int n2 = 0;
        int n3 = this.var_s_arr_a.length;
        int n4 = 0;
        int n5 = n3 - 1;
        int n6 = n3 - 2;
        while (n4 < n3) {
            n2 = (int)((long)n2 + ((long)this.var_s_arr_a[n5].var_as_a.var_int_a * (long)(this.var_s_arr_a[n4].var_as_a.b - this.var_s_arr_a[n6].var_as_a.b) >> 10));
            n6 = n5;
            n5 = n4++;
        }
        return n2 >>= 1;
    }

    public final void void_a(as as2) {
        for (int i2 = 0; i2 < this.var_s_arr_a.length; ++i2) {
            if (this.var_s_arr_a[i2].var_int_a == Integer.MAX_VALUE) continue;
            this.var_s_arr_a[i2].c.var_int_a += as2.var_int_a;
            this.var_s_arr_a[i2].c.b += as2.b;
        }
    }

    public final void b(as as2) {
        for (int i2 = 0; i2 < this.var_s_arr_a.length; ++i2) {
            this.var_s_arr_a[i2].a(as2);
        }
    }

    public final boolean boolean_a(as as2) {
        boolean bl = false;
        int n2 = 0;
        int n3 = this.var_s_arr_a.length - 1;
        while (n2 < this.var_s_arr_a.length) {
            as as3 = this.var_s_arr_a[n3].var_as_a;
            as as4 = this.var_s_arr_a[n2].var_as_a;
            if (as3.b <= as2.b && as4.b > as2.b || as3.b > as2.b && as4.b <= as2.b) {
                int n4 = (int)((long)(as4.var_int_a - as3.var_int_a) * (long)(as2.b - as3.b) >> 10);
                int n5 = (int)((long)(as4.b - as3.b) * (long)(as2.var_int_a - as3.var_int_a) >> 10);
                if (as4.b >= as3.b && n4 >= n5 || as4.b < as3.b && n4 <= n5) {
                    bl = !bl;
                }
            }
            n3 = n2++;
        }
        return bl;
    }

    public final void d() {
        this.var_as_a = null;
        this.var_as_b = null;
    }

    public final void e() {
        int n2 = this.var_s_arr_a.length;
        as as2 = new as();
        for (int i2 = 0; i2 < n2; ++i2) {
            s s2 = this.var_s_arr_a[i2];
            as2.var_int_a = s2.var_as_a.var_int_a - s2.var_as_b.var_int_a;
            as2.b = s2.var_as_a.b - s2.var_as_b.b;
            if ((long)as2.var_int_a * (long)as2.var_int_a + (long)as2.b * (long)as2.b <= 0x4000000L) continue;
            as2.int_b();
            s2.var_as_b.var_int_a = s2.var_as_a.var_int_a - (as2.var_int_a << 13 >> 10);
            s2.var_as_b.b = s2.var_as_a.b - (as2.b << 13 >> 10);
        }
    }

    public final as as_a() {
        if (this.var_as_a == null) {
            this.var_as_a = new as();
            int n2 = this.var_s_arr_a.length;
            int n3 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                s s2 = this.var_s_arr_a[i2];
                if ((s2.var_int_b & 0x10) != 0) continue;
                this.var_as_a.var_int_a += s2.var_as_a.var_int_a;
                this.var_as_a.b += s2.var_as_a.b;
                ++n3;
            }
            this.var_as_a.var_int_a /= n3;
            this.var_as_a.b /= n3;
        }
        return this.var_as_a;
    }

    public final as as_b() {
        if (this.var_as_b == null) {
            this.var_as_b = new as();
            int n2 = 0;
            if ((this.var_int_b & 2) != 0) {
                int n3 = this.var_s_arr_a.length;
                for (int i2 = 0; i2 < n3; ++i2) {
                    if ((this.var_s_arr_a[i2].var_int_b & 2) == 0) continue;
                    ++n2;
                    this.var_as_b.void_a(this.var_s_arr_a[i2].var_as_a);
                }
            } else {
                int n4 = this.var_s_arr_a.length;
                for (int i3 = 0; i3 < n4; ++i3) {
                    if ((this.var_s_arr_a[i3].var_int_b & 5) == 0) continue;
                    ++n2;
                    this.var_as_b.void_a(this.var_s_arr_a[i3].var_as_a);
                }
            }
            if (n2 == this.var_s_arr_a.length) {
                this.var_as_b.var_int_a = 0;
                this.var_as_b.b = 1024;
            } else if (n2 != 0) {
                this.var_as_b.b(n2);
                this.var_as_b.void_b(this.as_a());
            }
        }
        return this.var_as_b;
    }

    public final as as_c() {
        as as2 = new as();
        int n2 = this.var_s_arr_a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            s s2 = this.var_s_arr_a[i2];
            as2.var_int_a += s2.var_as_a.var_int_a - s2.var_as_b.var_int_a;
            as2.b += s2.var_as_a.b - s2.var_as_b.b;
        }
        as2.b(this.var_s_arr_a.length);
        return as2;
    }

    public final void a(int n2, int n3, int n4, boolean bl) {
        int n5 = (int)(((long)(this.var_int_arr_a[3] - n2) << 10) / (long)(this.var_int_arr_a[3] - this.var_int_arr_a[1]));
        if (n5 > 1024) {
            n5 = 1024;
        }
        if (n5 > 0) {
            n3 = (int)((long)(-n3) * (long)n5 >> 9);
            as as2 = new as(0, n3 -= this.as_c().b >> n4);
            if (!bl) {
                for (n4 = 0; n4 < this.var_s_arr_a.length; ++n4) {
                    if (this.var_s_arr_a[n4].var_as_a.b < n2) continue;
                    this.var_s_arr_a[n4].a(as2);
                }
                return;
            }
            this.b(as2);
        }
    }

    public final void a(Graphics graphics, as as2, int n2) {
        s[] sArray = this.s_arr_a();
        int n3 = sArray.length;
        graphics.setColor(n2);
        n2 = sArray[n3 - 1].var_as_a.var_int_a + as2.var_int_a >> 10;
        int n4 = sArray[n3 - 1].var_as_a.b + as2.b >> 10;
        for (int i2 = 0; i2 < n3; ++i2) {
            as as3 = sArray[i2].var_as_a;
            int n5 = as3.var_int_a + as2.var_int_a >> 10;
            int n6 = as3.b + as2.b >> 10;
            graphics.drawLine(n5, n6, n2, n4);
            n2 = n5;
            n4 = n6;
        }
    }
}


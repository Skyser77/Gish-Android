/*
 * Decompiled with CFR 0.152.
 */
public final class s {
    public as var_as_a;
    public as var_as_b;
    public as c;
    public int var_int_a;
    private as d;
    public int var_int_b;

    public s(as as2, int n2) {
        this.var_as_a = as2;
        this.var_int_a = n2;
        this.var_as_b = new as(as2);
        if (n2 != Integer.MAX_VALUE) {
            this.c = new as();
            this.d = new as();
        }
    }

    public final void a() {
        if (this.var_int_a == Integer.MAX_VALUE) {
            this.var_as_b.var_int_a = this.var_as_a.var_int_a;
            this.var_as_b.b = this.var_as_a.b;
            return;
        }
        this.d.var_int_a = this.var_as_a.var_int_a;
        this.d.b = this.var_as_a.b;
        this.var_as_a.var_int_a <<= 1;
        this.var_as_a.b <<= 1;
        this.var_as_a.var_int_a -= this.var_as_b.var_int_a;
        this.var_as_a.b -= this.var_as_b.b;
        if (this.var_int_a == 1024) {
            this.var_as_a.var_int_a += this.c.var_int_a;
            this.var_as_a.b += this.c.b;
        } else if (this.var_int_a == 2048) {
            this.var_as_a.var_int_a += this.c.var_int_a >> 1;
            this.var_as_a.b += this.c.b >> 1;
        } else {
            this.var_as_a.var_int_a += (int)(((long)this.c.var_int_a << 10) / (long)this.var_int_a);
            this.var_as_a.b += (int)(((long)this.c.b << 10) / (long)this.var_int_a);
        }
        this.var_as_b.var_int_a = this.d.var_int_a;
        this.var_as_b.b = this.d.b;
        this.c.b = 0;
        this.c.var_int_a = 0;
    }

    public final void a(as as2) {
        if (this.var_int_a == Integer.MAX_VALUE) {
            return;
        }
        if (this.var_int_a == 1024) {
            this.c.var_int_a += as2.var_int_a;
            this.c.b += as2.b;
            return;
        }
        if (this.var_int_a == 2048) {
            this.c.var_int_a += as2.var_int_a << 1;
            this.c.b += as2.b << 1;
            return;
        }
        this.c.var_int_a += (int)((long)as2.var_int_a * (long)this.var_int_a >> 10);
        this.c.b += (int)((long)as2.b * (long)this.var_int_a >> 10);
    }
}


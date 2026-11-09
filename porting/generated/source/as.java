/*
 * Decompiled with CFR 0.152.
 */
public final class as {
    public int var_int_a;
    public int b;
    public static final as var_as_a;

    public as() {
        this.b = 0;
        this.var_int_a = 0;
    }

    public as(int n2, int n3) {
        this.var_int_a = n2;
        this.b = n3;
    }

    public as(as as2) {
        this.var_int_a = as2.var_int_a;
        this.b = as2.b;
    }

    public as(int n2, long l2, boolean bl) {
        n2 = y.int_a(n2);
        bl = false;
        boolean bl2 = false;
        if (n2 > 3294198) {
            bl2 = true;
            n2 = 6588397 - n2;
        }
        if (n2 > 1647099) {
            bl = true;
            n2 = 3294198 - n2;
        }
        n2 = n2 * (y.var_short_arr_a.length - 1) / 1647099;
        this.var_int_a = y.var_short_arr_a[y.var_short_arr_a.length - 1 - n2];
        this.b = y.var_short_arr_a[n2];
        if (bl) {
            this.var_int_a = -this.var_int_a;
        }
        if (bl2) {
            this.b = -this.b;
        }
        this.var_int_a = (int)((long)this.var_int_a * l2 >> 10);
        this.b = (int)((long)this.b * l2 >> 10);
    }

    public final as as_a() {
        return new as(-this.var_int_a, -this.b);
    }

    public final int int_a() {
        if (this.boolean_a()) {
            return 0;
        }
        int n2 = this.var_int_a < 0 ? -this.var_int_a : this.var_int_a;
        int n3 = this.b < 0 ? -this.b : this.b;
        boolean bl = false;
        if (n2 < n3) {
            bl = true;
            n2 ^= n3;
            n3 ^= n2;
            n2 ^= n3;
        }
        n2 = n3 * (y.b.length - 1) / n2;
        n2 = y.b[n2] << 10;
        if (bl) {
            n2 = 1647099 - n2;
        }
        if (this.var_int_a < 0 && this.b < 0) {
            n2 += 3294198;
        } else if (this.var_int_a < 0) {
            n2 = 3294198 - n2;
        } else if (this.b < 0) {
            n2 = 6588397 - n2;
        }
        return n2;
    }

    public final as as_b() {
        this.var_int_a <<= 10;
        this.b <<= 10;
        return this;
    }

    public final void void_a(as as2) {
        this.var_int_a += as2.var_int_a;
        this.b += as2.b;
    }

    public final void a(int n2, int n3) {
        this.var_int_a += n2;
        this.b += n3;
    }

    public final void void_b(as as2) {
        this.var_int_a -= as2.var_int_a;
        this.b -= as2.b;
    }

    public final void a(int n2) {
        this.var_int_a = (int)((long)this.var_int_a * (long)n2 >> 10);
        this.b = (int)((long)this.b * (long)n2 >> 10);
    }

    public final void b(int n2) {
        this.var_int_a /= n2;
        this.b /= n2;
    }

    public final void c(int n2) {
        this.var_int_a = (int)(((long)this.var_int_a << 10) / (long)n2);
        this.b = (int)(((long)this.b << 10) / (long)n2);
    }

    public final as as_a(as as2) {
        return new as(this.var_int_a + as2.var_int_a, this.b + as2.b);
    }

    public final as as_b(as as2) {
        return new as(this.var_int_a - as2.var_int_a, this.b - as2.b);
    }

    public final int int_a(as as2) {
        return this.var_int_a * as2.b - this.b * as2.var_int_a;
    }

    public final boolean boolean_a() {
        return this.var_int_a == 0 && this.b == 0;
    }

    public final void c(as as2) {
        this.var_int_a = as2.var_int_a;
        this.b = as2.b;
    }

    public final void b(int n2, int n3) {
        this.var_int_a = n2;
        this.b = n3;
    }

    public final int int_b() {
        int n2 = this.c();
        if (n2 == 1024) {
            return n2;
        }
        this.var_int_a = (int)(((long)this.var_int_a << 10) / (long)n2);
        this.b = (int)(((long)this.b << 10) / (long)n2);
        return n2;
    }

    public final void void_a() {
        if (this.var_int_a == 0) {
            this.b = this.b < 0 ? -1024 : 1024;
            return;
        }
        if (this.b == 0) {
            this.var_int_a = this.var_int_a < 0 ? -1024 : 1024;
            return;
        }
        if (this.var_int_a == this.b) {
            if (this.var_int_a < 0) {
                this.var_int_a = -724;
                this.b = -724;
                return;
            }
            this.var_int_a = 724;
            this.b = 724;
            return;
        }
        if (this.var_int_a == -this.b) {
            if (this.var_int_a < 0) {
                this.var_int_a = -724;
                this.b = 724;
                return;
            }
            this.var_int_a = 724;
            this.b = -724;
            return;
        }
        this.int_b();
    }

    public final int c() {
        return y.int_a(this.var_int_a, this.b);
    }

    public final int d() {
        return (int)((long)this.var_int_a * (long)this.var_int_a + (long)this.b * (long)this.b >> 10);
    }

    public final long long_a() {
        return (long)this.var_int_a * (long)this.var_int_a + (long)this.b * (long)this.b;
    }

    static {
        var_as_a = new as(0, 0);
    }
}


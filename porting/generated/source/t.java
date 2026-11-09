/*
 * Decompiled with CFR 0.152.
 */
public final class t {
    public s var_s_a;
    public s var_s_b;
    public as var_as_a;
    private aq var_aq_a;
    private int var_int_a;
    private int var_int_b;
    private int c;
    public byte var_byte_a;
    private as var_as_b = new as();

    public t(s s2, s s3, int n2, int n3, int n4) {
        this.var_s_a = s2;
        this.var_s_b = s3;
        this.var_aq_a = null;
        this.var_int_b = n2;
        this.c = n3;
        this.var_int_a = n4;
        if (this.var_int_a == -1) {
            this.var_int_a = this.var_s_a.var_as_a.as_b(this.var_s_b.var_as_a).c();
        }
        if (this.c < -1) {
            this.c = (int)((long)(-this.var_int_a) * (long)this.c >> 10);
        }
        this.var_byte_a = 0;
    }

    public t(s s2, as as2, int n2, int n3, int n4) {
        this.var_s_a = s2;
        this.var_as_a = as2;
        this.var_s_b = null;
        this.var_aq_a = null;
        this.var_int_b = n2;
        this.c = n3;
        this.var_int_a = n4;
        if (this.var_int_a == -1) {
            this.var_int_a = this.var_s_a.var_as_a.as_b(this.var_as_a).c();
        }
        if (this.c < -1) {
            this.c = (int)((long)(-this.var_int_a) * (long)this.c >> 10);
        }
        this.var_byte_a = 0;
    }

    public t(s s2, aq aq2, int n2, int n3, int n4) {
        this.var_s_a = s2;
        this.var_as_a = null;
        this.var_s_b = null;
        this.var_aq_a = aq2;
        this.var_int_b = 512;
        this.c = 10240;
        this.var_int_a = 0;
        if (this.var_int_a == -1) {
            this.var_int_a = this.var_s_a.var_as_a.as_b(this.var_as_a).c();
        }
        if (this.c < -1) {
            this.c = (int)((long)(-this.var_int_a) * (long)this.c >> 10);
        }
        this.var_byte_a = 0;
    }

    public final boolean a(boolean n2) {
        int n3;
        if ((this.var_s_a.var_int_b & 0x10) != 0 || this.var_s_b != null && (this.var_s_b.var_int_b & 0x10) != 0) {
            return true;
        }
        if (this.var_s_b == null) {
            if (this.var_as_a == null) {
                n3 = 1024 - this.var_aq_a.var_short_a;
                this.var_as_b.var_int_a = this.var_s_a.var_as_a.var_int_a - (int)((long)this.var_aq_a.var_s_a.var_as_a.var_int_a * (long)n3 >> 10) - (int)((long)this.var_aq_a.b.var_as_a.var_int_a * (long)this.var_aq_a.var_short_a >> 10);
                this.var_as_b.b = this.var_s_a.var_as_a.b - (int)((long)this.var_aq_a.var_s_a.var_as_a.b * (long)n3 >> 10) - (int)((long)this.var_aq_a.b.var_as_a.b * (long)this.var_aq_a.var_short_a >> 10);
            } else {
                this.var_as_b.var_int_a = this.var_s_a.var_as_a.var_int_a - this.var_as_a.var_int_a;
                this.var_as_b.b = this.var_s_a.var_as_a.b - this.var_as_a.b;
            }
        } else {
            this.var_as_b.var_int_a = this.var_s_a.var_as_a.var_int_a - this.var_s_b.var_as_a.var_int_a;
            this.var_as_b.b = this.var_s_a.var_as_a.b - this.var_s_b.var_as_a.b;
        }
        n3 = this.var_as_b.c();
        if (n3 == 0) {
            return false;
        }
        if (n2 != 0 && this.c != -1 && (this.c > this.var_int_a && n3 > this.c || this.c < this.var_int_a && n3 < this.c)) {
            return true;
        }
        n2 = n3 - this.var_int_a;
        if (this.var_byte_a == 1 && n2 < 0) {
            return false;
        }
        if (this.var_byte_a == 2 && n2 > 0) {
            return false;
        }
        if (this.var_int_b == 512) {
            n2 >>= 1;
        } else if (this.var_int_b < 1024) {
            n2 = (int)((long)this.var_int_b * (long)n2 >> 10);
        }
        this.var_as_b.var_int_a = (this.var_as_b.var_int_a << 10) / n3;
        this.var_as_b.b = (this.var_as_b.b << 10) / n3;
        n3 = n2;
        int n4 = n2;
        if (this.var_s_b != null && this.var_s_b.var_int_a != Integer.MAX_VALUE) {
            if (this.var_s_a.var_int_a != Integer.MAX_VALUE) {
                if (this.var_s_a.var_int_a == this.var_s_b.var_int_a) {
                    n3 = n4 = n2 >> 1;
                } else {
                    n3 = n2 * this.var_s_b.var_int_a / (this.var_s_a.var_int_a + this.var_s_b.var_int_a);
                    n4 = n2 - n3;
                }
            }
            this.var_s_b.var_as_a.var_int_a += this.var_as_b.var_int_a * n4 >> 10;
            this.var_s_b.var_as_a.b += this.var_as_b.b * n4 >> 10;
        } else if (this.var_aq_a != null && this.var_aq_a.var_s_a.var_int_a != Integer.MAX_VALUE && this.var_aq_a.b.var_int_a != Integer.MAX_VALUE) {
            int n5;
            if (this.var_s_a.var_int_a != Integer.MAX_VALUE) {
                n5 = this.var_aq_a.var_s_a.var_int_a + this.var_aq_a.b.var_int_a >> 1;
                if (this.var_s_a.var_int_a == n5) {
                    n3 = n4 = n2 >> 1;
                } else {
                    n3 = n2 * n5 / (this.var_s_a.var_int_a + n5);
                    n4 = n2 - n3;
                }
            }
            n5 = this.var_as_b.var_int_a * n4 >> 10;
            n2 = this.var_as_b.b * n4 >> 10;
            this.var_aq_a.var_s_a.var_as_a.var_int_a += n5 * (1024 - this.var_aq_a.var_short_a) >> 10;
            this.var_aq_a.var_s_a.var_as_a.b += n2 * (1024 - this.var_aq_a.var_short_a) >> 10;
            this.var_aq_a.b.var_as_a.var_int_a += n5 * this.var_aq_a.var_short_a >> 10;
            this.var_aq_a.b.var_as_a.b += n2 * this.var_aq_a.var_short_a >> 10;
        }
        if (this.var_s_a.var_int_a != Integer.MAX_VALUE) {
            this.var_s_a.var_as_a.var_int_a -= this.var_as_b.var_int_a * n3 >> 10;
            this.var_s_a.var_as_a.b -= this.var_as_b.b * n3 >> 10;
        }
        return false;
    }

    public final void a() {
        this.var_s_a.var_int_b &= 0xFFFFFFF3;
        if (this.var_s_b != null) {
            this.var_s_b.var_int_b &= 0xFFFFFFF3;
            return;
        }
        if (this.var_as_a != null) {
            this.var_as_a.var_int_a = Integer.MAX_VALUE;
        }
    }
}


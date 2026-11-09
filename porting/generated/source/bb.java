/*
 * Decompiled with CFR 0.152.
 */
public final class bb {
    public byte var_byte_a;
    public short var_short_a;
    public short var_short_b;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    public int[] var_int_arr_a;
    ar var_ar_a;
    public k var_k_a;
    byte var_byte_b;
    byte c;

    public bb(ar ar2, byte by, k k2, int n2, int n3) {
        this.var_ar_a = ar2;
        this.var_byte_a = by;
        this.var_k_a = k2;
        this.var_short_a = (short)n2;
        this.var_short_b = (short)n3;
        this.var_boolean_b = false;
        this.var_int_arr_a = new int[]{this.var_short_a - 1 << 15, this.var_short_b - 1 << 15, this.var_short_a + 1 << 15, this.var_short_b << 15};
    }

    public final void void_a() {
        this.var_boolean_b = false;
        switch (this.var_byte_a) {
            case 3: {
                if (!this.var_k_a.var_boolean_a) break;
                k k2 = this.var_k_a;
                this.var_k_a.var_boolean_a = false;
                return;
            }
            case 4: {
                if (this.var_k_a.a() == 0) break;
                this.var_k_a.a((byte)1, -1);
            }
        }
    }

    public final void b() {
        this.var_boolean_b = true;
        switch (this.var_byte_a) {
            case 1: {
                if (this.var_k_a.var_boolean_a) break;
                this.var_k_a.a((byte)0, 0);
                return;
            }
            case 2: {
                if (this.var_k_a.var_boolean_a) break;
                this.var_k_a.a((byte)1, 0);
                return;
            }
            case 3: {
                if (this.var_k_a.var_boolean_a) break;
                this.var_k_a.a((byte)0, 0);
                return;
            }
            case 4: {
                if (this.var_k_a.a() == 2) break;
                this.var_k_a.a((byte)1, 1);
            }
        }
    }

    public final boolean boolean_a() {
        return !(!this.var_boolean_b && this.var_byte_a != 1 && this.var_byte_a != 2 || this.var_byte_a != 4 && !this.var_k_a.var_boolean_a);
    }
}


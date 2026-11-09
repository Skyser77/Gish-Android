/*
 * Decompiled with CFR 0.152.
 */
public final class au {
    public as[] var_as_arr_a;
    public as var_as_a;
    public as[] var_as_arr_b;
    public int var_int_a;
    public int[] var_int_arr_a;
    private int[] var_int_arr_b;
    private ab var_ab_a;
    public int var_int_b;

    public au(ab ab2, as[] asArray, as as2) {
        this.var_ab_a = ab2;
        this.var_as_arr_a = asArray;
        this.var_as_a = as2;
        this.var_int_a = 0;
        this.var_int_arr_a = new int[4];
        this.var_int_arr_b = new int[4];
        this.var_int_arr_a[1] = Integer.MAX_VALUE;
        this.var_int_arr_a[0] = Integer.MAX_VALUE;
        this.var_int_arr_a[3] = Integer.MIN_VALUE;
        this.var_int_arr_a[2] = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < this.var_as_arr_a.length; ++i2) {
            if (this.var_as_arr_a[i2].var_int_a < this.var_int_arr_a[0]) {
                this.var_int_arr_a[0] = this.var_as_arr_a[i2].var_int_a;
            }
            if (this.var_as_arr_a[i2].var_int_a > this.var_int_arr_a[2]) {
                this.var_int_arr_a[2] = this.var_as_arr_a[i2].var_int_a;
            }
            if (this.var_as_arr_a[i2].b < this.var_int_arr_a[1]) {
                this.var_int_arr_a[1] = this.var_as_arr_a[i2].b;
            }
            if (this.var_as_arr_a[i2].b <= this.var_int_arr_a[3]) continue;
            this.var_int_arr_a[3] = this.var_as_arr_a[i2].b;
        }
    }

    public final int[] a() {
        this.var_int_arr_b[0] = this.var_int_arr_a[0] + this.var_as_a.var_int_a;
        this.var_int_arr_b[1] = this.var_int_arr_a[1] + this.var_as_a.b;
        this.var_int_arr_b[2] = this.var_int_arr_a[2] + this.var_as_a.var_int_a;
        this.var_int_arr_b[3] = this.var_int_arr_a[3] + this.var_as_a.b;
        return this.var_int_arr_b;
    }

    public final void a(as object) {
        as as2 = ((as)object).as_b(this.var_as_a);
        object = this;
        for (int i2 = 0; i2 < ((au)object).var_int_a; ++i2) {
            ((au)object).var_as_arr_b[i2].void_a(as2);
        }
        as as3 = new as(((au)object).var_as_a);
        ((au)object).var_as_a.void_a(as2);
        if (((au)object).var_ab_a.var_ak_b != null) {
            ((au)object).var_ab_a.var_ak_b.a(((au)object).var_int_b, ((au)object).var_int_arr_a[0] + as3.var_int_a, ((au)object).var_int_arr_a[1] + as3.b, ((au)object).var_int_arr_a[2] + as3.var_int_a, ((au)object).var_int_arr_a[3] + as3.b, ((au)object).var_int_arr_a[0] + ((au)object).var_as_a.var_int_a, ((au)object).var_int_arr_a[1] + ((au)object).var_as_a.b, ((au)object).var_int_arr_a[2] + ((au)object).var_as_a.var_int_a, ((au)object).var_int_arr_a[3] + ((au)object).var_as_a.b);
        }
    }

    public final void b(as as2) {
        if (this.var_as_arr_b == null) {
            this.var_as_arr_b = new as[8];
        } else if (this.var_int_a == this.var_as_arr_b.length) {
            as[] asArray = new as[this.var_int_a << 1];
            System.arraycopy(this.var_as_arr_b, 0, asArray, 0, this.var_int_a);
            this.var_as_arr_b = asArray;
        }
        this.var_as_arr_b[this.var_int_a++] = as2;
    }
}


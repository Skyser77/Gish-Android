/*
 * Decompiled with CFR 0.152.
 */
public final class aa {
    public s var_s_a;
    public int var_int_a;
    public int var_int_b;
    public int[] var_int_arr_a = new int[4];
    public boolean var_boolean_a = true;
    public int c;
    public boolean var_boolean_b;
    public aa var_aa_a;
    public int d = 0;
    public Object var_java_lang_Object_a;

    public aa(s s2, int n2) {
        this.var_s_a = s2;
        this.var_int_a = n2;
        this.var_int_b = 0;
        this.var_boolean_b = false;
    }

    public final int[] a() {
        if (this.var_boolean_a) {
            this.var_int_arr_a[0] = this.var_s_a.var_as_a.var_int_a - this.var_int_a;
            this.var_int_arr_a[1] = this.var_s_a.var_as_a.b - this.var_int_a;
            this.var_int_arr_a[2] = this.var_s_a.var_as_a.var_int_a + this.var_int_a;
            this.var_int_arr_a[3] = this.var_s_a.var_as_a.b + this.var_int_a;
            this.var_boolean_a = false;
        }
        return this.var_int_arr_a;
    }

    public final void a(as as2) {
        this.var_s_a.a(as2);
    }
}


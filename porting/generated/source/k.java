/*
 * Decompiled with CFR 0.152.
 */
public final class k {
    public au var_au_a;
    public byte var_byte_a;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    public byte var_byte_b;
    ar var_ar_a;
    public as var_as_a;
    public as var_as_b;
    public int var_int_a;
    public int var_int_b;

    public k(ar asArray, byte by, as as2, as as3, int n2) {
        this.var_ar_a = asArray;
        this.var_byte_b = by;
        asArray = null;
        switch (this.var_byte_b) {
            case 0: {
                asArray = y.a(96, 32, true);
                break;
            }
            case 1: {
                asArray = y.a(32, 96, true);
                as as4 = new as(0, 64).as_b();
                as2.void_b(as4);
                as3.void_b(as4);
                break;
            }
            case 2: {
                asArray = y.a(64, 32, true);
                break;
            }
            case 3: {
                asArray = y.a(32, 288, true);
                as as5 = new as(0, 256).as_b();
                as2.void_b(as5);
                as3.void_b(as5);
            }
        }
        ((as)((Object)asArray[0])).var_int_a -= 512;
        asArray[0].b -= 512;
        asArray[1].b -= 512;
        asArray[3].var_int_a -= 512;
        asArray[4].var_int_a -= 512;
        asArray[4].b -= 512;
        this.var_as_a = new as(as2);
        this.var_au_a = new au(this.var_ar_a.var_ab_a, asArray, as2);
        this.var_as_b = new as(as3);
        this.var_int_b = as3.as_b(as2).c() / (n2 * 500);
        this.var_int_a = 0;
        this.var_boolean_a = false;
        if (this.var_ar_a.var_ab_a != null && this.var_ar_a.var_ab_a.var_boolean_b) {
            this.var_ar_a.var_ab_a.a(this.var_au_a);
        }
    }

    public final void a(byte by, int n2) {
        this.var_byte_a = by;
        this.var_boolean_a = true;
        if (this.var_byte_a == 1 && (n2 > 0 && this.var_int_a == this.var_int_b || n2 < 0 && this.var_int_a == 0)) {
            k k2 = this;
            this.var_boolean_a = false;
        }
        if (n2 < 0 && this.var_int_a < this.var_int_b) {
            this.var_int_a = this.var_int_b + this.var_int_b - this.var_int_a;
            return;
        }
        if (n2 > 0 && this.var_int_a >= this.var_int_b) {
            this.var_int_a = this.var_int_b + this.var_int_b - this.var_int_a;
        }
    }

    public final byte a() {
        if (this.var_boolean_a) {
            if (this.var_int_a < this.var_int_b) {
                return 1;
            }
            return 3;
        }
        if (this.var_int_a == 0) {
            return 0;
        }
        if (this.var_int_a == this.var_int_b) {
            return 2;
        }
        if (this.var_int_a < this.var_int_b) {
            return 1;
        }
        return 3;
    }
}


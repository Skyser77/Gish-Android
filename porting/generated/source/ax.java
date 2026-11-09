/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class ax
extends h {
    private int var_int_b;
    private boolean a = false;
    private boolean var_boolean_b = false;

    protected ax(ag object, int n2) {
        super((ag)object);
        this.var_int_b = n2;
        switch (n2) {
            case 0: {
                object = this;
                x x2 = this.var_ag_a.x_b();
                object = this;
                this.var_x_a = x2;
                return;
            }
            case 1: {
                object = this;
                x x3 = this.var_ag_a.x_b();
                object = this;
                this.var_x_a = x3;
                return;
            }
            case 2: {
                this.b();
                return;
            }
            case 3: {
                this.b();
                return;
            }
        }
        throw new IllegalStateException();
    }

    protected final void void_a() {
        switch (this.var_int_b) {
            case 0: {
                j.j_a().a(0);
                ax ax2 = this;
                String[] stringArray = this.var_java_lang_String_arr_a;
                if (this.var_java_lang_String_arr_a == null || stringArray.length != 2) {
                    stringArray = new String[2];
                }
                stringArray[0] = j.j_a().a(4);
                ax2 = this;
                stringArray[1] = ax2.var_ag_a.boolean_c() ? j.j_a().a(20) : j.j_a().a(19);
                String[] stringArray2 = stringArray;
                ax2 = this;
                this.var_java_lang_String_arr_a = stringArray2;
                return;
            }
            case 1: {
                j.j_a().a(0);
                int n2 = 1;
                ++n2;
                ax ax3 = this;
                if (ax3.var_ag_a.boolean_b()) {
                    ++n2;
                } else {
                    ax3 = this;
                    if (ax3.var_ag_a.boolean_d()) {
                        this.a = true;
                        ++n2;
                    }
                }
                ax3 = this;
                if (ax3.var_ag_a.boolean_e()) {
                    this.var_boolean_b = true;
                    ++n2;
                }
                ax3 = this;
                String[] stringArray = ax3.var_java_lang_String_arr_a;
                if (ax3.var_java_lang_String_arr_a == null || stringArray.length != n2) {
                    stringArray = new String[n2];
                }
                n2 = 0;
                ax3 = this;
                if (ax3.var_ag_a.boolean_b()) {
                    ++n2;
                    stringArray[0] = j.j_a().a(24);
                } else if (this.a) {
                    ++n2;
                    stringArray[0] = j.j_a().a(1);
                }
                if (this.var_boolean_b) {
                    stringArray[n2++] = j.j_a().a(2);
                }
                stringArray[n2++] = j.j_a().a(3);
                ax3 = this;
                stringArray[n2] = ax3.var_ag_a.boolean_c() ? j.j_a().a(20) : j.j_a().a(19);
                String[] stringArray3 = stringArray;
                ax3 = this;
                this.var_java_lang_String_arr_a = stringArray3;
                return;
            }
            case 2: {
                this.c();
                return;
            }
            case 3: {
                this.c();
                return;
            }
        }
        throw new IllegalStateException();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final x a(int var1_1) {
        switch (this.var_int_b) {
            case 0: {
                var2_4 /* !! */  = null;
                var3_6 = this;
                var2_4 /* !! */  = var3_6.var_java_lang_String_arr_a;
                if (var1_1 < 0 || var1_1 > var2_4 /* !! */ .length - 1) {
                    throw new IllegalArgumentException();
                }
                var3_6 = this;
                var1_2 = var3_6.var_java_lang_String_arr_a[var1_1];
                if (var1_2.equals(j.j_a().a(4))) {
                    var3_6 = this;
                    var2_4 /* !! */  = var3_6.var_ag_a.i();
                } else if (var1_2.equals(j.j_a().a(20))) {
                    var3_6 = this;
                    var2_4 /* !! */  = this.a(false, var3_6.var_ag_a.x_d());
                } else if (var1_2.equals(j.j_a().a(19))) {
                    var3_6 = this;
                    var2_4 /* !! */  = this.a(true, var3_6.var_ag_a.x_d());
                } else {
                    throw new IllegalArgumentException();
                }
                var3_6 = this;
                return var3_6.var_ag_a.a(this, (x)var2_4 /* !! */ );
            }
            case 1: {
                var2_5 /* !! */  = null;
                var3_7 = this;
                var2_5 /* !! */  = var3_7.var_java_lang_String_arr_a;
                if (var1_1 < 0 || var1_1 > var2_5 /* !! */ .length - 1) {
                    throw new IllegalArgumentException();
                }
                var3_7 = this;
                var1_3 = var3_7.var_java_lang_String_arr_a[var1_1];
                if (!var1_3.equals(j.j_a().a(1)) || !this.a) ** GOTO lbl37
                var3_7 = this;
                var2_5 /* !! */  = var3_7.var_ag_a.j();
                ** GOTO lbl64
lbl37:
                // 1 sources

                if (!var1_3.equals(j.j_a().a(24))) ** GOTO lbl-1000
                var3_7 = this;
                if (var3_7.var_ag_a.boolean_b()) {
                    v0 = this;
                    var3_7 = v0;
                    v1 = this;
                    var3_7 = v1;
                    var3_7 = this;
                    var2_5 /* !! */  = v0.var_ag_a.a(v1.var_ag_a.ah_a(), var3_7.var_ag_a.x_c());
                } else if (var1_3.equals(j.j_a().a(2)) && this.var_boolean_b) {
                    var3_7 = this;
                    var2_5 /* !! */  = var3_7.var_ag_a.x_e();
                } else if (var1_3.equals(j.j_a().a(3))) {
                    var3_7 = this;
                    var2_5 /* !! */  = var3_7.var_ag_a.f();
                } else if (var1_3.equals(j.j_a().a(20))) {
                    var3_7 = this;
                    var2_5 /* !! */  = this.a(false, var3_7.var_ag_a.x_c());
                } else if (var1_3.equals(j.j_a().a(19))) {
                    var3_7 = this;
                    var2_5 /* !! */  = this.a(true, var3_7.var_ag_a.x_c());
                } else {
                    throw new IllegalArgumentException();
                }
lbl64:
                // 6 sources

                var3_7 = this;
                return var3_7.var_ag_a.a(this, (x)var2_5 /* !! */ );
            }
            case 2: {
                return this.b(var1_1);
            }
            case 3: {
                return this.b(var1_1);
            }
        }
        throw new IllegalStateException();
    }

    private x a(boolean bl, x x2) {
        ax ax2 = this;
        ax2.var_ag_a.b(bl);
        ax2 = this;
        return ax2.var_ag_a.a(bl, x2);
    }

    private void b() {
        ax ax2 = this;
        x x2 = ax2.var_ag_a.x_c();
        ax2 = this;
        this.var_x_a = x2;
    }

    private void c() {
        j.j_a().a(0);
        Object object = this.java_util_Vector_a();
        String[] stringArray = new String[((Vector)object).size()];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            ah ah2 = (ah)((Vector)object).elementAt(i2);
            stringArray[i2] = ah2.java_lang_String_a();
        }
        object = this;
        this.var_java_lang_String_arr_a = stringArray;
    }

    private x b(int n2) {
        Object var2_3 = null;
        int n3 = n2;
        Object object = null;
        object = this.java_util_Vector_a();
        if (n3 < 0 || n3 > ((Vector)object).size() - 1) {
            throw new IllegalArgumentException();
        }
        if ((object = (ah)((Vector)object).elementAt(n3)) == null) {
            throw new IllegalArgumentException();
        }
        ax ax2 = this;
        x x2 = ax2.var_ag_a.a((ah)object, (x)this);
        ax2 = this;
        return ax2.var_ag_a.a(this, x2);
    }

    private Vector java_util_Vector_a() {
        switch (this.var_int_b) {
            case 2: {
                Object object = this;
                object = ((x)object).var_ag_a.aw_a();
                return ((aw)object).var_java_util_Vector_a;
            }
            case 3: {
                ax ax2 = this;
                return ax2.var_ag_a.java_util_Vector_a();
            }
        }
        throw new IllegalStateException();
    }
}


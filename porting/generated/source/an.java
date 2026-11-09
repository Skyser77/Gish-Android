/*
 * Decompiled with CFR 0.152.
 */
import com.hardwire.blob.Main;
import java.util.Vector;

public final class an {
    public final Object var_java_lang_Object_a = new Object();
    public final Object var_java_lang_Object_b = new Object();
    public Vector var_java_util_Vector_a = null;
    public Vector var_java_util_Vector_b = null;
    private Vector c = null;
    volatile boolean var_boolean_a = true;
    public int var_int_a = 1;
    public c var_c_a;
    public r var_r_a = null;
    public boolean var_boolean_b = true;

    public an(int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(av av2) {
        if (av2 == null) {
            throw new NullPointerException();
        }
        Object object = this.var_java_lang_Object_a;
        synchronized (object) {
            if (this.c == null) {
                this.c = new Vector(1);
            }
            this.c.addElement(av2);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void a(int n2) {
        Object object = this.var_java_lang_Object_a;
        synchronized (object) {
            if (this.var_boolean_a && this.var_java_util_Vector_b != null) {
                v v2 = new v(this, n2);
                for (int i2 = 0; i2 < this.var_java_util_Vector_b.size(); ++i2) {
                    ((ad)this.var_java_util_Vector_b.elementAt(i2)).a(v2);
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void b(int n2) {
        Object object = this.var_java_lang_Object_a;
        synchronized (object) {
            if (this.var_boolean_a && this.var_java_util_Vector_b != null) {
                v v2 = new v(this, n2);
                for (int i2 = 0; i2 < this.var_java_util_Vector_b.size(); ++i2) {
                    ((ad)this.var_java_util_Vector_b.elementAt(i2)).b(v2);
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        Object object = this.var_java_lang_Object_a;
        synchronized (object) {
            if (this.var_boolean_a && this.c != null) {
                o o2 = new o(this, n2, n3, n4, n5, n6, n7, n8);
                for (n3 = 0; n3 < this.c.size(); ++n3) {
                    ((av)this.c.elementAt(n3)).a(o2);
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void a(int n2, int n3, int n4, int n5) {
        Object object = this.var_java_lang_Object_a;
        synchronized (object) {
            if (this.var_boolean_a && this.var_java_util_Vector_a != null) {
                new a(this, n2, n3, n4, n5);
                for (n3 = 0; n3 < this.var_java_util_Vector_a.size(); ++n3) {
                    this.var_java_util_Vector_a.elementAt(n3);
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void void_a() {
        Object object = this.var_java_lang_Object_a;
        synchronized (object) {
            if (this.var_boolean_a && this.var_java_util_Vector_a != null) {
                new g(this, this.var_boolean_b);
                for (int i2 = 0; i2 < this.var_java_util_Vector_a.size(); ++i2) {
                    ((Main)this.var_java_util_Vector_a.elementAt(i2)).f();
                }
            }
        }
        this.var_boolean_b = true;
    }

    public final boolean boolean_a() {
        if (this.var_r_a != null) {
            r r2 = this.var_r_a;
            if (r2.var_ah_a != null && r2.var_ah_a.boolean_a() && r2.var_boolean_a) {
                return true;
            }
        }
        return false;
    }
}


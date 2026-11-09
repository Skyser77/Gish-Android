/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public abstract class b {
    protected static Hashtable var_java_util_Hashtable_a;
    private Vector var_java_util_Vector_a = null;
    private boolean var_boolean_a;
    private Hashtable c;
    protected Hashtable b;

    protected b() {
    }

    protected final void void_a() {
        this.void_b();
        b b2 = this;
        this.c = null;
        try {
            b2.c = az.a(true);
        }
        catch (IOException iOException) {}
        this.var_boolean_a = this.boolean_d();
    }

    protected final void void_b() {
        this.b = null;
        try {
            this.b = az.a(false);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    protected final void void_c() {
        try {
            Hashtable hashtable = this.b;
            az.a(hashtable, false);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    private void void_d() {
        try {
            Hashtable hashtable = this.c;
            az.a(hashtable, true);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final ah ah_a(int n2) {
        Object object = null;
        object = this.var_boolean_a ? this.b : this.c;
        if ((object = n.a((Hashtable)object, n2)) == null && this.var_boolean_a) {
            object = n.a(this.c, n2);
        }
        return object;
    }

    public final void a(int n2, ah ah2) {
        n.a(this.c, n2, ah2);
        this.void_d();
        if (this.var_boolean_a) {
            n.a(this.b, n2, ah2);
            this.void_c();
        }
    }

    public final boolean boolean_a() {
        Hashtable hashtable = null;
        hashtable = this.var_boolean_a ? this.b : this.c;
        if (this.var_boolean_a && !this.b.containsKey("zp.ace") && this.c.containsKey("zp.ace")) {
            this.a(n.a(this.c));
        }
        boolean bl = true;
        if (!hashtable.containsKey("zp.ace")) {
            if (this.boolean_b()) {
                bl = this.boolean_c();
            }
            this.a(bl);
        } else {
            bl = n.a(hashtable);
        }
        return bl;
    }

    public final void a(boolean bl) {
        n.a(this.c, bl);
        this.void_d();
        if (this.var_boolean_a) {
            n.a(this.b, bl);
            this.void_c();
        }
    }

    public final Vector java_util_Vector_a() {
        if (this.var_java_util_Vector_a == null) {
            String string;
            this.var_java_util_Vector_a = new Vector();
            int n2 = 1;
            while ((string = this.java_lang_String_a(n2)) != null) {
                ++n2;
                int n3 = string.indexOf(58);
                if (n3 < 0) continue;
                String string2 = string.substring(0, n3);
                string = string.substring(n3 + 1);
                if (string2 == null || string == null) continue;
                this.var_java_util_Vector_a.addElement(w.a(string2, string));
            }
        }
        return this.var_java_util_Vector_a;
    }

    protected abstract String java_lang_String_a(int var1);

    protected abstract boolean boolean_b();

    protected abstract boolean boolean_c();

    protected abstract boolean boolean_d();

    static {
        var_java_util_Hashtable_a = new Hashtable();
    }
}


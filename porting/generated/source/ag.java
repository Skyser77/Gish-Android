/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.BluetoothStateException
 */
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.bluetooth.BluetoothStateException;

public final class ag {
    private an var_an_a;
    private b var_b_a;
    private aw var_aw_a;
    private x var_x_a;
    private m var_m_a;
    private ax var_ax_a;
    private ax var_ax_b;
    private ax var_ax_c;
    private ay var_ay_a;
    private ay var_ay_b;
    private ax var_ax_d;
    private ay var_ay_c;
    private ay var_ay_d;
    private static Hashtable var_java_util_Hashtable_a;
    private boolean var_boolean_a = true;
    private ah var_ah_a = null;
    private boolean var_boolean_b = true;
    private ah var_ah_b = null;
    private boolean var_boolean_c = false;

    final boolean boolean_a() {
        return this.var_boolean_a;
    }

    final void a(boolean bl) {
        this.var_boolean_a = bl;
        this.var_ah_a = null;
    }

    final boolean boolean_b() {
        return this.var_ah_a != null;
    }

    final void a(ah ah2) {
        this.var_ah_a = ah2;
    }

    final ah ah_a() {
        return this.var_ah_a;
    }

    public static ag a(an an2, b b2) {
        ag ag2 = (ag)var_java_util_Hashtable_a.get(an2);
        if (ag2 == null) {
            ag2 = new ag(an2, b2);
            var_java_util_Hashtable_a.put(an2, ag2);
        }
        return ag2;
    }

    private ag(an an2, b b2) {
        this.var_an_a = an2;
        this.var_b_a = b2;
        this.a((x)null, this.x_b());
    }

    final an an_a() {
        return this.var_an_a;
    }

    final aw aw_a() {
        if (this.var_aw_a == null) {
            ae ae2 = w.ae_a();
            if (ae2.a == null) {
                ae2.a = new aw();
            }
            this.var_aw_a = ae2.a;
        }
        return this.var_aw_a;
    }

    public final x x_a() {
        return this.var_x_a;
    }

    public final boolean boolean_c() {
        if (this.var_b_a != null) {
            return this.var_b_a.boolean_a();
        }
        return this.var_boolean_b;
    }

    public final void b(boolean bl) {
        if (this.var_b_a != null) {
            this.var_b_a.a(bl);
            return;
        }
        this.var_boolean_b = bl;
    }

    final ah ah_b() {
        if (this.var_b_a != null) {
            an an2 = this.var_an_a;
            return this.var_b_a.ah_a(an2.var_int_a);
        }
        return this.var_ah_b;
    }

    final void b(ah ah2) {
        ah ah3 = null;
        if (this.var_b_a != null) {
            an an2 = this.var_an_a;
            ah3 = this.var_b_a.ah_a(an2.var_int_a);
            an2 = this.var_an_a;
            this.var_b_a.a(an2.var_int_a, ah2);
        } else {
            ah3 = this.var_ah_b;
            this.var_ah_b = ah2;
        }
        this.var_boolean_c = false;
        if (!this.boolean_c()) {
            try {
                if (ah3 == null || !ah3.java_lang_String_b().equalsIgnoreCase(ah2.java_lang_String_b())) {
                    this.b(true);
                    this.var_boolean_c = true;
                }
                return;
            }
            catch (IOException iOException) {}
        }
    }

    final boolean boolean_d() {
        return this.ah_b() != null;
    }

    final Vector java_util_Vector_a() {
        if (this.var_b_a != null) {
            return this.var_b_a.java_util_Vector_a();
        }
        return null;
    }

    final boolean boolean_e() {
        return (this = ((ag)this).java_util_Vector_a()) != null && ((Vector)this).size() > 0;
    }

    final x x_b() {
        if (this.var_m_a == null) {
            this.var_m_a = new m(this);
        }
        return this.var_m_a;
    }

    final x x_c() {
        if (this.var_ax_a == null) {
            this.var_ax_a = new ax(this, 1);
        }
        return this.var_ax_a;
    }

    final x x_d() {
        if (this.var_ax_b == null) {
            this.var_ax_b = new ax(this, 0);
        }
        return this.var_ax_b;
    }

    final x x_e() {
        if (this.var_ax_c == null) {
            this.var_ax_c = new ax(this, 3);
        }
        return this.var_ax_c;
    }

    final x f() {
        if (this.var_ay_a == null) {
            this.var_ay_a = new ay(this, 3);
        }
        return this.var_ay_a;
    }

    final x g() {
        if (this.var_ay_b == null) {
            this.var_ay_b = new ay(this, 0);
        }
        return this.var_ay_b;
    }

    final x h() {
        if (this.var_ax_d == null) {
            this.var_ax_d = new ax(this, 2);
        }
        return this.var_ax_d;
    }

    final x i() {
        if (this.var_ay_c == null) {
            this.var_ay_c = new ay(this, 2);
        }
        return this.var_ay_c;
    }

    final x a(x x2, x x3) {
        if (x2 != this.var_x_a) {
            throw new IllegalStateException();
        }
        x3.void_a();
        this.var_x_a = x3;
        return x3;
    }

    final x a(ah ah2, x x2) {
        if (this.var_ay_d == null) {
            this.var_ay_d = new ay(this, 1);
        }
        Object object = x2;
        x2 = this.var_ay_d;
        this.var_ay_d.c = object;
        object = ah2;
        x2 = this.var_ay_d;
        this.var_ay_d.a = object;
        return this.var_ay_d;
    }

    final x j() {
        return this.a(this.ah_b(), this.x_c());
    }

    final x k() {
        i i2 = new i(this);
        j.j_a().a(0);
        Object object = this.ah_b();
        Object object2 = j.j_a().a(11, new String[]{object.java_lang_String_a()});
        Object object3 = i2;
        i2.var_java_lang_String_a = object2;
        if (this.var_boolean_c) {
            object = new i(this);
            j.j_a().a(0);
            object2 = j.j_a().a(31);
            object3 = object;
            ((i)object).var_java_lang_String_a = object2;
            object2 = this.x_b();
            object3 = object;
            ((i)object).var_x_a = object2;
            object2 = object;
            object3 = i2;
            i2.var_x_a = object2;
        } else {
            object2 = this.x_b();
            object3 = i2;
            i2.var_x_a = object2;
        }
        return i2;
    }

    final x a(Throwable object, x x2) {
        i i2 = new i((ag)((Object)i2));
        j.j_a().a(0);
        object = object instanceof SecurityException ? j.j_a().a(27) : (object instanceof BluetoothStateException ? j.j_a().a(29) : j.j_a().a(12));
        Object object2 = object;
        object = i2;
        i2.var_java_lang_String_a = object2;
        object2 = x2;
        object = i2;
        i2.var_x_a = object2;
        return i2;
    }

    final x l() {
        i i2 = new i(this);
        j.j_a().a(0);
        Object object = this.ah_b();
        Object object2 = j.j_a().a(14, new String[]{object.java_lang_String_a()});
        object = i2;
        i2.var_java_lang_String_a = object2;
        object2 = this.x_c();
        object = i2;
        i2.var_x_a = object2;
        return i2;
    }

    final x m() {
        i i2 = new i(this);
        j.j_a().a(0);
        Object object = j.j_a().a(15);
        i i3 = i2;
        i2.var_java_lang_String_a = object;
        object = this.x_d();
        i3 = i2;
        i2.var_x_a = object;
        return i2;
    }

    final x n() {
        i i2 = new i(this);
        j.j_a().a(0);
        Object object = j.j_a().a(9);
        i i3 = i2;
        i2.var_java_lang_String_a = object;
        object = this.x_c();
        i3 = i2;
        i2.var_x_a = object;
        return i2;
    }

    final x a(Throwable throwable) {
        i i2 = new i((ag)((Object)string));
        j.j_a().a(0);
        Object object = ((ag)((Object)string)).x_c();
        i i3 = i2;
        i2.var_x_a = object;
        String string = throwable instanceof SecurityException ? j.j_a().a(26) : (throwable instanceof BluetoothStateException ? j.j_a().a(28) : j.j_a().a(25));
        object = string;
        i3 = i2;
        i2.var_java_lang_String_a = object;
        return i2;
    }

    private x a(String object, x x2) {
        i i2 = new i((ag)((Object)i2));
        j.j_a().a(0);
        Object object2 = object;
        object = i2;
        i2.var_java_lang_String_a = object2;
        object2 = x2;
        object = i2;
        i2.var_x_a = object2;
        return i2;
    }

    final x a(boolean bl, x x2) {
        if (bl) {
            return this.a(j.j_a().a(21), x2);
        }
        return this.a(j.j_a().a(22), x2);
    }

    static {
        var_java_util_Hashtable_a = new Hashtable(1);
    }
}


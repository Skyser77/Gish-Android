/*
 * Decompiled with CFR 0.152.
 */
public abstract class l
extends x {
    public volatile String var_java_lang_String_a;
    public volatile boolean var_boolean_a;
    x var_x_a;
    x b;
    private volatile bd var_bd_a;

    l(ag ag2) {
        super(2, ag2);
    }

    synchronized void a(String string) {
        this.var_java_lang_String_a = string;
    }

    final synchronized void a(boolean bl) {
        this.var_boolean_a = bl;
    }

    public final boolean boolean_a() {
        return this.var_x_a != null;
    }

    public final synchronized x x_a() {
        if (this.boolean_a()) {
            this.a((bd)null);
            l l2 = this;
            return l2.var_ag_a.a(this, this.var_x_a);
        }
        throw new IllegalStateException();
    }

    public final x b() {
        l l2 = this;
        if (!l2.var_boolean_a) {
            throw new IllegalStateException();
        }
        this.a((bd)null);
        l2 = this;
        return l2.var_ag_a.a(this, this.b);
    }

    private synchronized void a(bd bd2) {
        this.var_bd_a = null;
    }
}


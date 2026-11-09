/*
 * Decompiled with CFR 0.152.
 */
public final class m
extends x {
    m(ag ag2) {
        super(0, ag2);
    }

    public final x x_a() {
        m m2 = this;
        m2.var_ag_a.a(false);
        x x2 = null;
        m2 = this;
        if (m2.var_ag_a.an_a().boolean_a()) {
            m2 = this;
            x2 = m2.var_ag_a.x_d();
        } else {
            m2 = this;
            x2 = m2.var_ag_a.x_c();
        }
        m2 = this;
        return m2.var_ag_a.a(this, x2);
    }

    public final x b() {
        m m2 = this;
        m2.var_ag_a.a(true);
        Object object = null;
        m2 = this;
        object = m2.var_ag_a;
        if (((ag)object).an_a().boolean_a()) {
            object = ((ag)object).x_d();
        } else {
            m2 = this;
            object = !m2.var_ag_a.boolean_c() ? ((ag)object).x_b() : (((ag)object).boolean_e() ? ((ag)object).x_e() : (((ag)object).boolean_d() ? ((ag)object).j() : ((ag)object).f()));
        }
        m2 = this;
        return m2.var_ag_a.a(this, (x)object);
    }
}

